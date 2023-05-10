/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author igorw
 * 
 * Explicação desta classe na documentação da classe Belonging
 * 
 */


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

@Embeddable
public class BelongingPK {
    
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
    
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;
    
}
