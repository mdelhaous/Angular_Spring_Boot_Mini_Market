package com.example.Backend.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "livraison")

public class livraison {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String num_liv;
    private Date date_liv;



    @ManyToOne
    private fournisseur fournisseurs;

    @ManyToMany
    @JoinTable(
            name = "ligne_liv",
            joinColumns = @JoinColumn(name = "num_liv"),
            inverseJoinColumns = @JoinColumn(name = "code_art"))
    Set<article> likdarticles;
}
