package com.xyz.model;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name="CUSTOMER")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "EMAIL")
    private String email;

    @OneToOne
    private Account account;
}
