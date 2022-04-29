package com.dridi.webapp;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data // une annotation de Lombok, génère automatiquement getter/setter pour les attributs de classe
@Configuration // une annotation de springframework, permet de déclarer cette classe en tant que bean de configuration
@ConfigurationProperties(prefix="com.dridi.webapp") // demande à Spring de charger les properties qui commencent par “com.dridi.webapp” au sein des attributs de la classe.
public class CustomProperties {

    private String apiUrl;

}
