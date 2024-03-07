package Services;

import com.TestingCrud.TestingCrud.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsServices extends JpaRepository<Products, Integer> {



}
