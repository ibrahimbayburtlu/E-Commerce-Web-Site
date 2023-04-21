package com.ibrahimbayburtlu.ecommerce.dao;

import com.ibrahimbayburtlu.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
