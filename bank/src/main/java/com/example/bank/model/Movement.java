package com.example.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import lombok.NoArgsConstructor;

@Entity(name = "movement")
@NoArgsConstructor
public class Movement {

    @Id
    private Long id;

    private Date data;
    private Double value;
    private String movementType;

    @ManyToOne
    @JoinColumn(name = "idCONTA")
    private Account account;

}
