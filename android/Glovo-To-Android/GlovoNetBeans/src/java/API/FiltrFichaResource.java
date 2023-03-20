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
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author S2-PC00
 */
@Path("filtrFicha")
public class FiltrFichaResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FiltrFichaResource
     */
    public FiltrFichaResource() {
    }

    /**
     * Retrieves representation of an instance of API.FiltrFichaResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/filtrFicha/{nombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@PathParam("nombre")String nombre) {
        //TODO return proper representation object
        RestauranteDAO restauranteDAO = new RestauranteDAO();
        Restaurante restaurante = new Restaurante();
        
        restaurante.setNOMBRE(nombre);
        restaurante.setIMAGEN("");
        //restaurante.setID_RESTAURANTE(Integer.valueOf(id));
        ArrayList<Restaurante> lstRestaurantes = restauranteDAO.find1(restaurante);
        return Restaurante.fromArrayListToJson(lstRestaurantes);
    }

    /**
     * PUT method for updating or creating an instance of FiltrFichaResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
