package com.example.mvc.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(schema = "users")
public class Document {
    @Id
    private int id;

    private String content;
}