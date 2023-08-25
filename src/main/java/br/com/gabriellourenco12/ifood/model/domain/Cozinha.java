package br.com.gabriellourenco12.ifood.model.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Cozinha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "cozinha", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Restaurante> restaurantes;
}
