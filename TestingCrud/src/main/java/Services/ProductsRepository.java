package Services;

import com.TestingCrud.TestingCrud.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Integer> {



}
