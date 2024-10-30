package com.NguyenBaTuan.cruddemo.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.io.Serializable;

@Entity
@Table

public class Role implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "roles")
    private List<User> users;
    public Role(){
        super();
    }
    public Role(Long id, String name){
        this.id = id;
        this.name = name;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
