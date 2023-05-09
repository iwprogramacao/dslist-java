/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devsuperior.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author igorw
 */
@Entity
@Table(name = "games")
//LOMBOK - Substitui códigos repetitivos obrigatórios para Hibernate
//@Getter, @Setter e @ToString podem ser substituidos pelo @Data
//@Getter
//@Setter
//@ToString
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder // Padrão de Builder
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(name = "game_year")
    private Integer year;
    
    private String genre;
    
    private String platforms;
    
    private Double score;
    
    @Column(name = "img_url")
    private String imgUrl;
    
    @Column(name = "short_description", columnDefinition = "TEXT")
    private String shortDescription;
    
    @Column(name = "long_description", columnDefinition = "TEXT")
    private String longDescription;

}
