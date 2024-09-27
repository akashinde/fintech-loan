package com.akashinde.fintech_loan.entities;

// jpa
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column()
    private String phone;

    @Column()
    private Integer creditScore;


    public UserEntity() {
        this.name = "";
        this.email = "";
        this.password = "";
        this.phone = "";
        this.creditScore = 0;
    }

    public UserEntity(String name, String email, String password, String phone, Integer creditScore) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.creditScore = creditScore;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    String getPassword() {
        return this.password;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getCreditScore() {
        return creditScore;
    }
}
