package br.com.spring.config;

import br.com.spring.ws.rest.CityJerseyResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Created by rafaelfirmino on 25/11/15.
 */
@Component
@ApplicationPath("/jersey")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(CityJerseyResource.class);
    }
}
