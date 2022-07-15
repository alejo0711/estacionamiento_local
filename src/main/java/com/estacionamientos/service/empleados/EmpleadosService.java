/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estacionamientos.service.empleados;

import com.estacionamientos.empleados.EmpleadosLocal;
import com.estacionamientos.empleados.VEmpleados;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import util.Constantes;

/**
 *
 * @author Nermil
 */
@Stateless
@Path("/empleadosService")
public class EmpleadosService {

    @EJB
    private EmpleadosLocal empleadosLocal;

    @POST
    @Path("/getEmpleadosParaNomina")
    @Produces(MediaType.APPLICATION_JSON)
    public EmpleadosResponse getEmpleadosParaNomina() {
        EmpleadosResponse response = new EmpleadosResponse();
        response.setCodeResponse(Constantes.CODE_ERROR);
        response.setMessageResponse("No se encontro el catalogo de empleados..");
        try {
            List<VEmpleados> catalogoDeEmplados = this.empleadosLocal.getEmpleadosParaNomina();
            if (catalogoDeEmplados != null && !catalogoDeEmplados.isEmpty()) {
                response.setCodeResponse(Constantes.CODE_SUCCESS);
                response.setMessageResponse("Success");
                response.setCatalogoDeEmpleados(catalogoDeEmplados);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

}
