package com.practice.task.DailyTask.Controller;

import com.practice.task.DailyTask.Model.InputProduct;
import com.practice.task.DailyTask.Model.OutputProduct;
import com.practice.task.DailyTask.Model.Product;
import com.practice.task.DailyTask.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> productList(){

        return productService.getProductList();
    }

    @PostMapping("/getInvPicture")
    public ResponseEntity<OutputProduct> getInputInventory(@RequestBody InputProduct inputProduct){
        productService.getProductList();
        OutputProduct outputProduct =null;
        double avlquantity = productService.getInputInventory(inputProduct);
        if(avlquantity !=0){
            outputProduct = new OutputProduct(inputProduct.getProductId(), inputProduct.getProdName(),avlquantity);
            return new ResponseEntity<>(outputProduct, HttpStatus.OK);
        }
        return new ResponseEntity<OutputProduct>(HttpStatus.BAD_REQUEST);
    }
}
