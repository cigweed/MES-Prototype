package com.example.test;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity()
@Getter
@Setter
@Table(name="sales_order")
public class SalesOrder {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false ,unique=true, length=20)
    private String SalesOrderNumber;

    @OneToMany(mappedBy="salesOrder",cascade=CascadeType.ALL , orphanRemoval=true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private SalesLine salesLine;
}
