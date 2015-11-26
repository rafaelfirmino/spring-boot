package br.com.spring.ws.rest;

import br.com.spring.service.FlightService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by rafaelfirmino on 25/11/15.
 */
@Component
@Path("/city")
public class CityJerseyResource {

    private static final Logger logger = LoggerFactory.getLogger(CityJerseyResource.class);

    @Autowired
    private FlightService flightService;

    @GET
    @Path("/search")
    @Produces(MediaType.APPLICATION_JSON)
    public Response search(@QueryParam("city") String city){

        logger.info("City method started.");

        return Response.ok().entity(flightService.retrieveAirportByCity(city)).build();
    }
}
