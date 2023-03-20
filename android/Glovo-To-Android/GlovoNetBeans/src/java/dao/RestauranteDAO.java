/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidad.Restaurante;
import interfacesDAO.SQLTools;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import motores.MotorMySQL;

/**
 *
 * @author S2-PC00
 */
public class RestauranteDAO {

    private SQLTools miMotor = null;
    private static final String SELECT_ALL = "SELECT * FROM restaurante ORDER by restaurante.Ventas DESC LIMIT 10";

    private static final String SELECT_TIPO = "SELECT * FROM restaurante WHERE Tipo = ";
    
    private static final String SELECT_FICHA = "SELECT * FROM `restaurante` WHERE Nombre = '";
    private static final String SELECT_FICHA_FINAL = "'";

    private static final String SQL_FINDALL = "SELECT * FROM `restaurante` WHERE 1=1 ";
    
    private static final String SQL_VENTAS = "SELECT * FROM restaurante ORDER BY Ventas DESC;";
    
    private static final String SQL_PUNTUACION = "SELECT * FROM restaurante ORDER BY Puntuacion DESC;";

    public RestauranteDAO() {
        this.miMotor = new MotorMySQL();
    }

        
    public ArrayList<Restaurante> findAll(Restaurante bean) {
        String sql_filtro = "";
        String sql_final = "";
        ArrayList<Restaurante> lstRestaurantes = null;
        try {
            this.miMotor.connect();

            sql_final = SELECT_ALL + sql_filtro;

            ResultSet resultset = this.miMotor.executeQuery(sql_final);

            if (resultset != null) {
                lstRestaurantes = new ArrayList();

                while (resultset.next()) {
                    Restaurante entidad = new Restaurante();
                    entidad.setID_RESTAURANTE(resultset.getInt(1));
                    entidad.setNOMBRE(resultset.getString(2));
                    entidad.setTIPO(resultset.getString(3));
                    entidad.setVENTAS(resultset.getInt(4));
                    entidad.setPUNTUACION(resultset.getInt(5));
                    entidad.setIMAGEN(resultset.getString(6));
                    lstRestaurantes.add(entidad);

                }
            }
            this.miMotor.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(RestauranteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstRestaurantes;
    }

    public ArrayList<Restaurante> findAllB(String tipo) {
        ArrayList<Restaurante> lstRestaurantes = null;
        String sql = SELECT_TIPO + tipo;
        try {
            //1º) 
            miMotor.connect();

            ResultSet resultset = miMotor.
                    executeQuery(sql);
            if (resultset != null) {
                lstRestaurantes = new ArrayList();
                while (resultset.next()) {

                    Restaurante entidad = new Restaurante();
                    entidad.setID_RESTAURANTE(resultset.getInt(1));
                    entidad.setNOMBRE(resultset.getString(2));
                    entidad.setTIPO(resultset.getString(3));
                    entidad.setVENTAS(resultset.getInt(4));
                    entidad.setPUNTUACION(resultset.getInt(5));
                    entidad.setIMAGEN(resultset.getString(6));
                    lstRestaurantes.add(entidad);

                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            miMotor.disconnect();
        }
        return lstRestaurantes;
    }

    public ArrayList<Restaurante> findAllAk(Restaurante bean) {
        String sql_filtro = "";
        String sql_final = "";
        ArrayList<Restaurante> lstRestaurantes = null;
        try {
            this.miMotor.connect();

            if (bean != null) {

                if (bean.getNOMBRE().length() > 0 && !bean.getNOMBRE().equals("") && bean.getNOMBRE() != null) {
                    sql_filtro += "AND NOMBRE='" + bean.getNOMBRE() + "'";
                }

                if (bean.getTIPO().length() > 0 && !bean.getTIPO().equals("") && bean.getTIPO() != null) {
                    sql_filtro += "AND TIPO='" + bean.getTIPO() + "'";
                }
                if (bean.getVENTAS() != 0) {
                    sql_filtro += "AND VENTAS='" + bean.getVENTAS() + "'";
                }
                if (bean.getPUNTUACION() != 0) {
                    sql_filtro += "AND PUNTUACION='" + bean.getPUNTUACION() + "'";
                }
                if (bean.getIMAGEN().length() > 0 && !bean.getIMAGEN().equals("") && bean.getIMAGEN() != null) {
                    sql_filtro += "AND IMAGEN='" + bean.getIMAGEN() + "'";
                }

            }

            sql_final = SQL_FINDALL + sql_filtro;

            ResultSet resultset = this.miMotor.executeQuery(sql_final);

            if (resultset != null) {
                lstRestaurantes = new ArrayList();

                while (resultset.next()) {
                    Restaurante entidad = new Restaurante();
                    entidad.setID_RESTAURANTE(resultset.getInt(1));
                    entidad.setNOMBRE(resultset.getString(2));
                    entidad.setTIPO(resultset.getString(3));
                    entidad.setVENTAS(resultset.getInt(4));
                    entidad.setPUNTUACION(resultset.getInt(5));
                    entidad.setIMAGEN(resultset.getString(6));
                    lstRestaurantes.add(entidad);

                }
            }
            this.miMotor.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(RestauranteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstRestaurantes;
    }
    
    public ArrayList<Restaurante> findVentas(Restaurante bean) {
        String sql_filtro = "";
        String sql_final = "";
        ArrayList<Restaurante> lstRestaurantes = null;
        try {
            this.miMotor.connect();

            sql_final = SQL_VENTAS + sql_filtro;

            ResultSet resultset = this.miMotor.executeQuery(sql_final);

            if (resultset != null) {
                lstRestaurantes = new ArrayList();

                while (resultset.next()) {
                    Restaurante entidad = new Restaurante();
                    entidad.setID_RESTAURANTE(resultset.getInt(1));
                    entidad.setNOMBRE(resultset.getString(2));
                    entidad.setTIPO(resultset.getString(3));
                    entidad.setVENTAS(resultset.getInt(4));
                    entidad.setPUNTUACION(resultset.getInt(5));
                    entidad.setIMAGEN(resultset.getString(6));
                    lstRestaurantes.add(entidad);

                }
            }
            this.miMotor.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(RestauranteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstRestaurantes;
    }
    
    public ArrayList<Restaurante> findPuntuacion(Restaurante bean) {
        String sql_filtro = "";
        String sql_final = "";
        ArrayList<Restaurante> lstRestaurantes = null;
        try {
            this.miMotor.connect();

            sql_final = SQL_PUNTUACION + sql_filtro;

            ResultSet resultset = this.miMotor.executeQuery(sql_final);

            if (resultset != null) {
                lstRestaurantes = new ArrayList();

                while (resultset.next()) {
                    Restaurante entidad = new Restaurante();
                    entidad.setID_RESTAURANTE(resultset.getInt(1));
                    entidad.setNOMBRE(resultset.getString(2));
                    entidad.setTIPO(resultset.getString(3));
                    entidad.setVENTAS(resultset.getInt(4));
                    entidad.setPUNTUACION(resultset.getInt(5));
                    entidad.setIMAGEN(resultset.getString(6));
                    lstRestaurantes.add(entidad);

                }
            }
            this.miMotor.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(RestauranteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstRestaurantes;
    }
    
    public ArrayList<Restaurante> find1(Restaurante bean) {
        String sql_filtro = "";
        String sql_final = "";
        ArrayList<Restaurante> lstRestaurantes = null;
        try {
            this.miMotor.connect();

            sql_final = SELECT_FICHA + bean.getNOMBRE()+ SELECT_FICHA_FINAL;

            ResultSet resultset = this.miMotor.executeQuery(sql_final);

            if (resultset != null) {
                lstRestaurantes = new ArrayList();

                while (resultset.next()) {
                    Restaurante entidad = new Restaurante();
                    entidad.setID_RESTAURANTE(resultset.getInt(1));
                    entidad.setNOMBRE(resultset.getString(2));
                    entidad.setTIPO(resultset.getString(3));
                    entidad.setVENTAS(resultset.getInt(4));
                    entidad.setPUNTUACION(resultset.getInt(5));
                    entidad.setIMAGEN(resultset.getString(6));
                    lstRestaurantes.add(entidad);

                }
            }
            this.miMotor.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(RestauranteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstRestaurantes;
    }
    

}
