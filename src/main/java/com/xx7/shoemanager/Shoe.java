package com.xx7.shoemanager;

import lombok.Builder;
import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@Builder
public class Shoe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String brand;
    private String name;
    private String[] tech;
    private int price;
    private int size;
    private String[] color;
    private String type;
}
