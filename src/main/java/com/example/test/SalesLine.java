package com.example.test;

import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.ToString;

public class SalesLine {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="sales_order_id", nullable=false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SalesOrder salesOrder;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="item_table_id", nullable=false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ItemTable itemId;

    private Long quantity;
}
