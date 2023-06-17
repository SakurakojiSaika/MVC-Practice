package com.example.mvc.Entity;
import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Product {
    private int id;

    private String name;
}
