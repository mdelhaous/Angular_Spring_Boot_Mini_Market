package com.example.Backend.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ligne_cmd")
public class ligne_cmd {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  num_ligne;

    private int qte_cmd;


    @ManyToOne
    @JoinColumn(name="code_art", nullable=false)
    private article article;

    @ManyToOne
    @JoinColumn(name="num_cmd", nullable=false)
    private commande commande ;


}
