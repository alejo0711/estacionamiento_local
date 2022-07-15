/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estacionamientos.empleados;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Nermil
 */
@Local
public interface EmpleadosLocal {

    List<VEmpleados> getEmpleadosParaNomina();

}
