package com.geekster.chatApplication.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_user")

public class Users {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserId;
    @Column(name = "userName")
    private String username;
    @Column(name = "passWord")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age")
    private Integer age;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "createdDate")
    private Timestamp createdDate;
    @Column(name = "updatedDate")
    private Timestamp updatedDate;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status statusId;
}
