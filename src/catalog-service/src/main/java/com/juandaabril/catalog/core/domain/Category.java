package com.juandaabril.catalog.core.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="category")
public class Category {

    @Id
    private UUID id;
    private String name;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class CategoryNotFound extends RuntimeException{}
}
