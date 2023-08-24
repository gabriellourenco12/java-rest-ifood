package br.com.gabriellourenco12.ifood.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class Restaurante {

    @Id
    private Long id;

    @Column
    private String nome;

    @Column(name = "taxa_frete")
    private BigDecimal taxaFrete;
}
