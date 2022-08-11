package com.example.Money.model.User;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UserUpdatePasswordModel {

    private Long id;
    private String oldPassword;
    private String newPassword;

}
