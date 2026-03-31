package br.com.projeto.hgbrasil.api.resources;

import br.com.projeto.hgbrasil.api.models.PrevisaoTempoResponseModel;
import br.com.projeto.hgbrasil.api.services.PrevisaoTempoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PrevisaoTempoResource {

    @Autowired
    PrevisaoTempoService service;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/")
    public ResponseEntity<PrevisaoTempoResponseModel> test(@RequestParam String city) {

        var retornoApi = service.fecthPrevisaoTempo(city);

        return ResponseEntity.ok(retornoApi);



    }
}
