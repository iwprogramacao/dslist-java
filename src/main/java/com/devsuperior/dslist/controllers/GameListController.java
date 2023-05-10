/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author igorw
 * 
 * Camada que apresenta os dados para o Frontend, sendo identificada com a
 * annotation @RestController
 * 
 * Os métodos de busca também devem ser mapeados para as requisições saberem
 * quem chamar (@GetMapping,  )
 */

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    
    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;
    
    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
    
    /**
     * Passando o "value" como prop do @GetMapping, conseguimos pegar esse ID 
     * passado na URL com a annotation @PathVariable no argumento da função
     * 
     * Neste caso abaixo, temos uma lista de Games sendo trazida por ID das listas,
     * por isso a consulta é feita na classe repository de Games e a disponibilização 
     * é na classe controller de GameList. Como o endpoint é "/lists/id/games" e 
     * o mapeamento de "/lists" está sendo feito nessa classe, devemos seguir esse
     * padrão
     */
    
     @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }
    
}
