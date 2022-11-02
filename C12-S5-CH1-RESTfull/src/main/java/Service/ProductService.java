package Service;

import Domain.Product;

import java.util.List;

public interface ProductService {
    public Product addProduct(Product product);
    public List<Product> getAllProduct();

}
