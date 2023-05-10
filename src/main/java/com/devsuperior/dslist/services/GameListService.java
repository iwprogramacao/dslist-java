/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author igorw
 *
 * A camada de Services é onde é feita a lógica de negócio em vários passos Ex:
 * Uma compra feita em um site: Regras de negócio - Verificar estoque; - Baixa
 * no estoque; - Registrar pedido; - Disparo de emails; - Verificação do método
 * de pagamento...
 *
 * Precisamos também identificar a classe Service como um componente do sistema
 * com a annotation "@Component" ou "@Service" (as duas fazem a mesma coisa)
 * quando utilizamos um framework como o Spring já que são eles que cuidam da
 * lógica de instancias das classes criadas no projeto.
 *
 * Isso será necessário caso desejamos fazer o inject (com o @Autowired) de
 * componentes em outros.
 *
 * Uma annotation boa para garantir o ACID junto ao banco de dados de cada
 * método é a @Transaction (do SPRING!). Podemos passar a propriedade "readOnly
 * = true" para informarmos que não iremos fazer nenhuma operação de escrita;
 */
@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();

        List<GameListDTO> gameListDTO = result
            .stream()
            .map(game -> new GameListDTO(game))
            .toList();

        return gameListDTO;
    }

    ;
    
    @Transactional(readOnly = true)
    public GameListDTO findById(Long id) {
        // gameRepository.findById(id) -> Retorna um tipo Optional. Para termos
        // nosso resultado, temos que colocar o ".get()" no final.
        GameList gameList = gameListRepository.findById(id).get();
        GameListDTO gameListDTO = new GameListDTO(gameList);

        return gameListDTO;
    }

}
