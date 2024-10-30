package com.NguyenBaTuan.cruddemo.entity;

import jakarta.persistence.*;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.io.Serializable;

@Entity
@Table(name = "`order`")
public class Order implements Serializable {

    private static final long serialVersionUID = 1l;

    public Order() {
    }
    public Order(OrderModel order){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "order")
    private List<Item> items;

    @OneToOne(mappedBy = "order")
    private Shipment shipment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "voucher_id")
    private Voucher voucher;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private  User user;

    @OneToOne(mappedBy = "order")
    private Bill bill;

    @OneToOne(mappedBy = "order")
    private Feedback feddback;

    private Date orderDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Feedback getFeddback() {
        return feddback;
    }

    public void setFeddback(Feedback feddback) {
        this.feddback = feddback;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
