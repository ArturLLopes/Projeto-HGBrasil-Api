package br.com.projeto.hgbrasil.api.services;

import br.com.projeto.hgbrasil.api.connectors.HGBrasilConnector;
import br.com.projeto.hgbrasil.api.models.PrevisaoTempoResponseModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
@Slf4j
public class PrevisaoTempoService {

    @Autowired
    HGBrasilConnector connector;

    public PrevisaoTempoResponseModel fecthPrevisaoTempo(String city){

        log.info("Buscando a previsão do tempo para a cidade {}", city);

        var retornoApi = connector.fetchWeatherForCity(city);

        if (retornoApi == null) {
            log.error("Erro ao buscar dados da API para a cidade {}", city);
            return null;
        }

        PrevisaoTempoResponseModel ret = PrevisaoTempoResponseModel.builder()
                .nomeCidade(retornoApi.getCity_name())
                .hora(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")))
                .temperatura(retornoApi.getTemp())
                .data(retornoApi.getDate())
                .build();

        return ret;
    }
}
