package com.auth0.samples.authapi.springbootauthupdated.user;
import javax.persistence.*;

 @Entity
@Table(name = "role")
public class Role {



     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int id;
    @Column(name = "role")
    private String role;
}
 
