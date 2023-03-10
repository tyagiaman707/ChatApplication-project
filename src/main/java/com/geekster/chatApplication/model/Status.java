package com.geekster.chatApplication.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_status")
public class Status {
    @Id
    @Column(name = "status_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int statusId;
    @Column(name = "status_Name")
    private String statusName;
    @Column(name = "status_description")
    private String statusDescription;
}
