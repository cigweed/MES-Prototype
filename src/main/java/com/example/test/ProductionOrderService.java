package com.example.test;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class ProductionOrderService {
    
    private final ProductionOrderRepository repository;

    public ProductionOrderService(ProductionOrderRepository repository) {
        this.repository = repository;
    }

    public ProductionOrder createOrder(ProductionOrder order) {
        if(order.getStatus() == null){
            order.setStatus(OrderStatus.Open);
        }
        if(order.getInputDate() == null){
            order.setInputDate(LocalDateTime.now());
        }
        return repository.save(order);
    }

    @GetMapping
    public List<ProductionOrder> getAll(){
        return repository.findAll();
    }

    @GetMapping("/{orderNumber}")
    public Optional<ProductionOrder> findByOrderNumber(String orderNumber){
        return repository.findByOrderNumber(orderNumber);
    }
}
