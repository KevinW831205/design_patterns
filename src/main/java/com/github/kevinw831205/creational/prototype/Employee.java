package com.github.kevinw831205.creational.prototype;

public class Employee {
    private String name;
    private Address2 address;

    public Employee(String name, Address2 address) {
        this.name = name;
        this.address = address;
    }

    public Employee(Employee other) {
        this.name = other.getName();
        this.address = new Address2(other.getAddress());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address2 getAddress() {
        return address;
    }

    public void setAddress(Address2 address) {
        this.address = address;
    }
}
