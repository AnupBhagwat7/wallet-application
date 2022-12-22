package com.xyz.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="ACCOUNT")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long number;

    private int balance;
}
