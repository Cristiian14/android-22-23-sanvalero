/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import dao.RestauranteDAO;
import entidad.Restaurante;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author S2-PC00
 */
@Path("filtrPuntuacion")
public class FiltrPuntuacionResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FiltrPuntuacionResource
     */
    public FiltrPuntuacionResource() {
    }

    /**
     * Retrieves representation of an instance of API.FiltrPuntuacionResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        RestauranteDAO restauranteDAO = new RestauranteDAO();
        ArrayList<Restaurante> lstRestaurantes = restauranteDAO.findPuntuacion(null);
        return Restaurante.fromArrayListToJson(lstRestaurantes);

    }

    /**
     * PUT method for updating or creating an instance of FiltrPuntuacionResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
