package com.bridgelabz.userregistrationapp.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "USER_REGISTRATION")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    @Column(name = "id", nullable = false)
    private Long id;

    private String firstName;
    private String lastName;
    private String emailId;
    private String password;

    public User(User user) {
    }
}
