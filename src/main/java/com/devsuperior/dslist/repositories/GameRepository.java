/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author igorw
 *
 * Desenvolvimnto orientado por Domínio
 *
 * "Entidade", "Entidade"Repository, "Entidade"Service, "Entidade"Controller...
 *
 * Nesse caso, é extendido a JpaRepository, que contém alguns métodos prontos
 * com consultas, registros e outros, no banco de dados definindo na sua
 * primeira tipagem a Classe da entidade e qual é o tipo de seu ID
 *
 * Quando usamos uma Native Query, o resultado dela tem que ser uma interface, e
 * por convenção, as chamamos de Projections (No SPRING)
 */
public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """
		SELECT games.id, games.title, games.game_year AS `year`, games.img_url AS imgUrl,
               games.short_description AS shortDescription, belonging.position
		FROM games
		INNER JOIN belonging ON games.id = belonging.game_id
		WHERE belonging.list_id = :listId
		ORDER BY belonging.position
			""")
    List<GameMinProjection> searchByList(Long listId);
    
}
