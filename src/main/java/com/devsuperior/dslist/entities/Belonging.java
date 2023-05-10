/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author igorw
 * 
 * Como nesse caso temos 2 chaves estrangeiras compondo uma chave para essa Classe e
 * a JPA, no Repository usa apenas uma classe para fazer sua identificação, nós criamos
 * uma classe auxiliar "BelonginPK" para auxiliar na criação do Repository. Utilizaremos
 * a annotation "@Embeddable" para a JPA entender que nessa classe auxiliar existe
 * uma composição de chaves estrangeiras e nesta classe, usamos a annotation
 * "@EmbeddedId" para avisar que o ID desta entidade vem da classe auxiliar.
 * 
 */


@Entity
@Table(name = "belonging")

//LOMBOK - Substitui códigos repetitivos obrigatórios para Hibernate
//@Getter, @Setter e @ToString podem ser substituidos pelo @Data
//@Getter
//@Setter
//@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder // Padrão de Builder
public class Belonging {
    
    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;
    
    public Belonging(Game game, GameList gameList, Integer position) {
        this.id.setGame(game);
        this.id.setGameList(gameList);
        this.position = position;
    }
}
