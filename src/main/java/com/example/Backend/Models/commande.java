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
@Table(name = "commande")
public class commande {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long num_cmd;
    @Column(name = "date_cmd")
    private Date date_cmd;

    @ManyToOne
    @JoinColumn(name="code_cli", nullable=false)
    private client client;


    @OneToMany(mappedBy = "commande" , fetch=FetchType.LAZY)
    private Collection<ligne_cmd> ligneCmds;


}
