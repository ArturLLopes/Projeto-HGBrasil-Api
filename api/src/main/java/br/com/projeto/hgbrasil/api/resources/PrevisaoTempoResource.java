package br.com.projeto.hgbrasil.api.resources;

import br.com.projeto.hgbrasil.api.models.PrevisaoTempoResponseModel;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrevisaoTempoResource {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/")
    public ResponseEntity<PrevisaoTempoResponseModel> test(){

        var ret = PrevisaoTempoResponseModel.builder().nomeCidade("Rio De Janeiro").hora(16).temperatura(29).build();

        return ResponseEntity.ok(ret);
    }
}
