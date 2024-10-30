package com.NguyenBaTuan.cruddemo.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Bill implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private Double amount;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public Bill() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
