package com.example.Backend.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fournisseur")
public class fournisseur {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long code_four;
    @Column(name = "nom_four")
    private Long nom_four;
    @Column(name = "ville_four")
    private String ville_four ;
    @Column(name = "tel_four")
    private String tel_four ;

    @OneToMany(mappedBy="fournisseurs" , fetch=FetchType.LAZY)
    private Collection<societe> societes;

    @OneToMany(mappedBy="fournisseurs" , fetch=FetchType.LAZY)
    private Collection<livraison> livraisons;
}
