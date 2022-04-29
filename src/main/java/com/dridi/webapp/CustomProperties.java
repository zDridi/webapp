package com.dridi.webapp;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data // une annotation de Lombok, pour les getters et setters
@Configuration // une annotation de springframework, pour spécifier que cette classe est un Bean qui est utilisé pour la configuration
@ConfigurationProperties(prefix="com.dridi.webapp")
public class CustomProperties {

    private String apiUrl;

}
