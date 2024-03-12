package dev.harshit.midterm.controller;

import dev.harshit.midterm.models.Product;
import dev.harshit.midterm.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    ProductService ps = new ProductService();
    @GetMapping("/GetAllProducts")
    public List<Product> GetAllProducts(){
        return ps.getAllProducts();
    }
    @GetMapping("/GetSingle")
    public Product GetSingle(){
        return ps.getSingle();
    }
    @GetMapping("/GetAllCategory")
    public List<String> GetAllCategory(){
        return ps.getAllCategory();
    }
    @GetMapping("/AddNewProduct")
    public Product AddNewProduct(Product pr){
       return ps.AddNewProduct(pr);
    }
    @GetMapping("/UpdateProduct")
    public Product UpdateProduct(Product old,Product newe){
        return ps.UpdateProduct(old,newe);
    }
    @GetMapping("/Delete/")
    public void Delete(int id){
        ps.Delete(id);
    }
    @GetMapping("/GetProductsSpecificCategory")
    public List<Product> GetProductsSpecificCategory(String ps){
        return ps.GetProductsSpecificCategory(ps);
    }


}
