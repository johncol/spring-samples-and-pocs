package com.colpatria.cuentacero.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;

@Entity
@Table(name = "customers")
public class Customer extends BaseModel {

    @NotNull
    private String name;

    public Customer() {
    }

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
