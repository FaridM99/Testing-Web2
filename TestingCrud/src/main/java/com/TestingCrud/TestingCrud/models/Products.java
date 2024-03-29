

// 1
// Table of the products created with the following privates, and getters and setters also added
// @Entity is means that class is entity which is  The code defines a Java class named Products that is mapped to a table in a relational database named products.
// This class is an Entity, which means it represents a table in your database in the context of ORM
// @Table means that is the table and it has name of the product
// @Id is primary key of the database
// @GeneratedValue is indicates that the primary key values will be generated by the database.
// It is typically used when the underlying database supports auto-increment columns, allowing the database to automatically assign a new, unique value whenever a new record is inserted.

// 2
// Connected to the database via application.properties for the h2-database. Runned on the http://localhost:8080/h2-console/
// and select * from products worked very well
// Putted some values to the SQL Query and images from google added to the public file that i have created and put it images
// inside of this and next photos of the products
// in the localhost:8080/h2-console i can observe that i listed all the sql questies correct order with their images


// 3
// Creating repository for the read and write in the database
// Created Services file and it has ProductsServices interface as a repository

// 4
// Creating controller for the allow us CRUD operations on products
// Creating new package and call it as a Controllers and ProductsController class
// Decorating it as a @Controller and @RequestMapping
// @Autowired annotation for the ProductsRepository repo;

package com.TestingCrud.TestingCrud.models;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String brand;
    private String category;
    private String price;

    @Column(columnDefinition = "TEXT")

    private String description;
    private Date createdAt;
    private String imageFileName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }


    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
}
