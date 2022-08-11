package com.example.Money.entity;

import com.cloudinary.utils.Base64Coder;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.apache.commons.codec.binary.Base64;


import javax.persistence.*;


@Table(name = "category")
@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "name")
    String name;
//    @Column(name = "icon")
//    Base64 icon;
    @Column(name = "type")
    Integer type;
}
