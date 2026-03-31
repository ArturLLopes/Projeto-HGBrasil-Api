package br.com.projeto.hgbrasil.api.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PrevisaoTempoResponseModel {

    private String hora;
    private Integer temperatura;
    private String data;
    private String nomeCidade;
}
