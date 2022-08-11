package com.example.Money.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Table(name = "users")
@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", nullable = false, unique = true)
    String username;
    @Column(name = "password", nullable = false)
    String password;
    @Column(name = "email", nullable = false)
    String email;
    @Column(name = "is_active")
    Long Active;


}
