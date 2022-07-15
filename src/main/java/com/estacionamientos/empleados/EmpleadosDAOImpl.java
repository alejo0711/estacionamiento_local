/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estacionamientos.empleados;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;
import util.AbstractBaseEao;

@Stateless
public class EmpleadosDAOImpl extends AbstractBaseEao implements EmpleadosDAO {

    @Override
    public List<VEmpleados> findEmpleadosParaNomina() {
        List<VEmpleados> result = null;
        String sql = "SELECT * FROM v_empleados where date_add(str_to_date(FECBAJA, '%Y/%m/%d'), interval 1 month) >= curdate() or FECBAJA = '' ";
        try {
            Query query = this.entityManager.createNativeQuery(sql, VEmpleados.class);
            result = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
