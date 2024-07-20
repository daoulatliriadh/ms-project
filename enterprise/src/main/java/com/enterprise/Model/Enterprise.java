package com.enterprise.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entrepriseId", nullable = false)
    private int entrepriseId;
    private String enterpriseName;

    public Enterprise(String productName) {
        this.enterpriseName = enterpriseName;
    }
}
