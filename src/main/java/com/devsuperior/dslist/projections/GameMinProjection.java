/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.devsuperior.dslist.projections;

/**
 *
 * @author igorw
 * 
 * Quando criamos Projections, devemos implementar Getters e Setters correspondentes
 * a consulta que esta interface está vinculada. No caso desta classe, uma consulta
 * com @Query(nativeQuery = true) na classe GameRepository
 */
public interface GameMinProjection {
    
    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
    
}
