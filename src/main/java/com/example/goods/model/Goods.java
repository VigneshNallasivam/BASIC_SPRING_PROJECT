package com.example.goods.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Goods
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rollNo;
    private String firstName;
    private String lastName;
}
