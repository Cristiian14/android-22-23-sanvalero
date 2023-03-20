/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import dao.RestauranteDAO;
import entidad.Restaurante;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author alber
 */
@Path("filtr_usu")
public class Filtr_usuResource{

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Filtr_usuResource
     */
    public Filtr_usuResource() {
    }

    /**
     * Retrieves representation of an instance of API.Filtr_usuResource
     * @return an instance of java.lang.String
     */
    /*http://192.168.104.78:8080/GlovoNetBeans/webresources/filtr_usu?tipo=Kebab*/
    /**/
    @GET
    @Path("/filtr_usu/{tipo}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@PathParam("tipo")String tipo) {
        //TODO return proper representation object
        RestauranteDAO restauranteDAO = new RestauranteDAO();
        Restaurante restaurante = new Restaurante();
        restaurante.setNOMBRE("");
        restaurante.setIMAGEN("");
        
        restaurante.setTIPO(tipo);
        ArrayList<Restaurante> lstRestaurantes = restauranteDAO.findAllAk(restaurante);
        return Restaurante.fromArrayListToJson(lstRestaurantes);
    }
    
    //http://192.168.104.78:8080/GlovoNetBeans/webresources/filtr_usu?tipo=Kebab
    
/*   @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Producto> getProductos() {
        return productoDAO.findAll();
    }
@GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String buscarCine (@PathParam("id") int idCine) {
        CineDAO cineDao = new CineDAO();
        Cine cine = new Cine();
        cine.setId_cine(idCine);
        ArrayList<Cine> cines = cineDao.findAll(cine);
        return Cine.toArrayJSon(cines);
    }

@POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String login(Usuario usuario) {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        ArrayList<Usuario> usuarios = usuarioDao.findAll(usuario);
        return Usuario.toObjectJSon(usuarios.get(0));
    }
@POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario register(Usuario usuario) {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        ArrayList<Usuario> usuarios = usuarioDao.findAll(null);
        for (Usuario usuarioRespuesta : usuarios) {
            if (usuarioRespuesta.getEmail().equals(usuario.getEmail())) {
                return null;
            }
        }
        usuarioDao.add(usuario);
        return usuario;
    }*/
    
    
    
}
