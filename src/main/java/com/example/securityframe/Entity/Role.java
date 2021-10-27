package com.example.securityframe.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "role")
    private String role;


    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private List<UserEntity> userEntities;

}
