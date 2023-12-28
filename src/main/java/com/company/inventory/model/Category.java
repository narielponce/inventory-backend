package com.company.inventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name="category")
public class Category implements Serializable {
    @Serial
    private static final long serialVersionUID = -4310027227752446841L;

    @Id
    private Long id;
    private String name;
    private String description;
}
