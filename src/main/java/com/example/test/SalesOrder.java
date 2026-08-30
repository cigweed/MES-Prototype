package com.example.test;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name="sales_order")
@Getter
@Setter
public class SalesOrder {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false ,unique=true, length=20)
    private String SalesOrderNumber;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="item_table_id", nullable=false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ItemTable itemId;

}
