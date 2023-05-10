/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

/**
 *
 * @author igorw
 */
//LOMBOK - Substitui códigos repetitivos obrigatórios para Hibernate
//@Getter
//@Setter - Não precisa em um DTO
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // Padrão de Builder
public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO(Game entity) {
        // Transfere todas as propriedades que o primeiro tem, para o segundo,
        // caso os atributos tenham os mesmos nomes - É necessário este DTO ter
        // Getters e Setters.
        BeanUtils.copyProperties(entity, this);
    }

}
