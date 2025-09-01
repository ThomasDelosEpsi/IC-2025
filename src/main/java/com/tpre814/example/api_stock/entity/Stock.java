package com.tpre814.example.api_stock.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Mouvement_de_Stock")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mouvement;

    private Long id_produit;
    private Long id_ligne_commande;
    private LocalDate date_mouvement;
    private String sens_mouvement;
    private Long quantite;
}
