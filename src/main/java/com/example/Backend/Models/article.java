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
@Table(name = "article")
public class article{
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String code_art;
    @Column(name = "nom_art")
    private Long nom_art;
    @Column(name = "pu_art")
    private Float pu_art;
    @Column(name = "qte_stock")
    private Float qte_stock;

    @OneToMany(mappedBy = "article" , fetch=FetchType.LAZY)
    private Collection<ligne_cmd> ligneCmds;

    @ManyToMany(mappedBy = "likdarticles")
    Set<livraison> livraison;
}
