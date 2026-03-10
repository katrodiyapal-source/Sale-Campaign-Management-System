package com.example.Sale_Campaign.dto;

import com.example.Sale_Campaign.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetProductDto {

    private List<Product> productList;
    private int page;
    private int pageSize;
    private int totalPage;
    HttpStatus httpStatus;
    String message;

}
