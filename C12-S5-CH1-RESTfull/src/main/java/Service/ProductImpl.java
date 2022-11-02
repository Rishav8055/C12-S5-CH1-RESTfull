package Service;

import Domain.Product;
import Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductImpl implements ProductService {
    ProductRepo productRepo;
    @Autowired
    public ProductImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return (List<Product>) productRepo.findAll();
    }
}
