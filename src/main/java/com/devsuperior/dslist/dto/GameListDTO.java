/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

/**
 *
 * @author igorw
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GameListDTO {
    
    private Long id;
    private String name;
    
    public GameListDTO(GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
