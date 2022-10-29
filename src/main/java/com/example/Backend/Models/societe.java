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
@Table(name = "societe")
public class societe {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "nom_ste")
    private Long nom_ste;
    @Column(name = "tel_ste")
    private Date tel_ste;
    @Column(name = "fax_ste")
    private Date fax_ste;
    @Column(name = "ville_ste")
    private Date ville_ste;
    @ManyToOne
    @JoinColumn(name="code_four", nullable=false)
    private fournisseur fournisseurs;

}
