package com.example.Money.model.User;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class UserBaseModel {
    private String username;
    private String password;
    private String userInfo;
    private LocalDateTime createDate;
    private Long active;
}
