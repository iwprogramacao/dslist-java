/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author igorw
 * 
 * Desenvolvimnto orientado por Domínio
 * 
 * "Entidade", "Entidade"Repository, "Entidade"Service, "Entidade"Controller...
 * 
 * Nesse caso, é extendido a JpaRepository, que contém alguns métodos
 * prontos com consultas, registros e outros, no banco de dados
 * definindo na sua primeira tipagem a Classe da entidade e qual é o tipo de seu ID
 */

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
