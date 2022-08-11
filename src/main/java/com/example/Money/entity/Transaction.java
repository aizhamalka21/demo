package com.example.Money.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;


@Table(name = "transaction")
@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    @JoinColumn(name = "category_id", nullable = false)
    CategoryEntity category;

    @Column(name = "type", nullable = false, unique = true)
    Integer type;

//    @Column(name = "icon")
//    Base64 icon;

    @Column(name = "description")
    String description;

    @Column(name = "sum")
    Double sum;
}