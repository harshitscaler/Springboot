package dev.harshit.midterm.services;

import dev.harshit.midterm.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    Product p = new Product();
    List<String> sfc = new ArrayList<>();
    List<Product> pro = new ArrayList<>();
    public List<Product> getAllProducts(){
        return pro;
    }
    public Product getSingle(){
        return p;
    }
    public List<String> getAllCategory(){
        return sfc;
    }
    public Product AddNewProduct(Product pr){
        pro.add(pr);
        sfc.add(pr.GetCategory());
        return pr;
    }
    public Product UpdateProduct(Product old,Product newe){
        pro.remove(old);
        pro.add(newe);
        sfc.remove(old.GetCategory());
        sfc.add(old.GetCategory());
        return newe;
    }
    public void Delete(int id){
        for(int i=0;i<pro.size();i++){
            if(pro.get(i).GetById()==id){
                Product psb = pro.get(i);
                sfc.remove(psb.GetCategory());
                pro.remove(psb);
            }
        }
    }
    public List<Product> GetProductsSpecificCategory(String cate){
        List<Product> newCategory = new ArrayList<>();
        for (Product product : pro) {
            if (product.GetCategory().equals(cate)) {
                newCategory.add(product);
            }
        }
        return newCategory;
    }


}
