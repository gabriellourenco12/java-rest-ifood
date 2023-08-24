package br.com.gabriellourenco12.ifood.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Cozinha {

    @Id
    private Long id;

    @Column
    private String nome;
}
