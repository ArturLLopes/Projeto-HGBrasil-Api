package br.com.projeto.hgbrasil.api.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "hgbrasil.api")
public class HGBrasilProperties {

    private String scheme;
    private String host;
    private String path;
    private String fields;
    private Integer arrayLimit;
    private String key; // opcional
}