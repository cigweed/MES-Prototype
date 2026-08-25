package com.example.test;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProductionOrderRepository extends JpaRepository<ProductionOrder, Long>{
    Optional<ProductionOrder> findByOrderNumber(String orderNumber);
}
