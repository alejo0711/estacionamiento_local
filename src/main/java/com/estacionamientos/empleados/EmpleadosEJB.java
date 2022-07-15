/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estacionamientos.empleados;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless(mappedName = "ejb")
public class EmpleadosEJB implements EmpleadosLocal {

    @EJB
    private EmpleadosDAO empleadosDAO;

    @Override
    public List<VEmpleados> getEmpleadosParaNomina() {
        List<VEmpleados> result = null;
        try {
            result = this.empleadosDAO.findEmpleadosParaNomina();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
