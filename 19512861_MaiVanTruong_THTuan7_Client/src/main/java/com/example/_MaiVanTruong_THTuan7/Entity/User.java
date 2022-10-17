package com.example._MaiVanTruong_THTuan7.Entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;

}
