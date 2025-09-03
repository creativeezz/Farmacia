package com.farmacia.luiz.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "TBCARGO")
public class CargoModel {
    /*
    * Criar uma API de cargo
    * id do cargo
    * nome do cargo
    *
    *
     */

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCargo")
    private Integer idCargo;
    @Column
    private String nomeCargo;
}
