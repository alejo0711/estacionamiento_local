/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estacionamientos.service.empleados;

import com.estacionamientos.empleados.VEmpleados;
import com.estacionamientos.service.NermilResponse;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Nermil
 */
public class EmpleadosResponse extends NermilResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<VEmpleados> catalogoDeEmpleados;

    public List<VEmpleados> getCatalogoDeEmpleados() {
        return catalogoDeEmpleados;
    }

    public void setCatalogoDeEmpleados(List<VEmpleados> catalogoDeEmpleados) {
        this.catalogoDeEmpleados = catalogoDeEmpleados;
    }

}
