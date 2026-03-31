package br.com.projeto.hgbrasil.api.resources;

import br.com.projeto.hgbrasil.api.models.PrevisaoTempoResponseModel;
import br.com.projeto.hgbrasil.api.services.PrevisaoTempoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@Slf4j
@RestController
public class PrevisaoTempoResource {

    @Autowired
    PrevisaoTempoService service;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/")
    public ResponseEntity<PrevisaoTempoResponseModel> test(@RequestParam String city) {

        log.info("PrevisaoTempoResource -> Consultando a API da HG Brasil pra a cidade {}",city);

        if (city == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        var retornoApi = service.fecthPrevisaoTempo(city);

        return ResponseEntity.ok(retornoApi);



    }
}
