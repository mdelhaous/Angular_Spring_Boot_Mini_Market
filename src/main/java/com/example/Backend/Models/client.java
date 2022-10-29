package com.example.Backend.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client")
public class client {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long code_cli;
    @Column(name = "nom_cli")
    private String nom_cli;
    @Column(name = "pre_cli")
    private String pre_cli;
    @Column(name = "adr_cli")
    private String adr_cli;
    @Column(name = "tel_cli")
    private String tel_cli;
    @Column(name = "ville_cli")
    private String ville_cli;

    @OneToMany(mappedBy = "client" , fetch=FetchType.LAZY)
    private Collection<commande> commandes;


}
