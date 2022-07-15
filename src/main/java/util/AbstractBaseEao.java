/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author alejo
 */
public abstract class AbstractBaseEao {

    @PersistenceContext(unitName = Constantes.UNIT_PERSISTENCE)
    protected EntityManager entityManager;

    protected long getIdFromTable(String columId, String table) {
        StringBuffer sql = new StringBuffer();
        sql.append("select COALESCE(MAX(" + columId + "),0)+1 ");
        sql.append("from " + table);
        return obtieneSecuencia(sql.toString());
    }

    protected long getIdFromTable(String columId, String table, String where) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT COALESCE(MAX(" + columId + "),0)+1 ");
        sql.append("FROM " + table + " ");
        sql.append(where);
        return obtieneSecuencia(sql.toString());
    }

    private long obtieneSecuencia(String consulta) {
        long secuencial = 0;
        try {
            //System.out.println("sql " + consulta);
            Query query = this.entityManager.createNativeQuery(consulta);
            Object ret = query.getSingleResult();

            if (ret instanceof Integer) {
                secuencial = ((Integer) ret).intValue();
            } else if (ret instanceof BigDecimal) {
                BigDecimal res = (BigDecimal) ret;
                secuencial = res.longValue();
            } else if (ret instanceof Long) {
                secuencial = ((Long) ret).longValue();
            }
            //System.out.println("secuencial " + secuencial);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return secuencial;
    }

    protected String getFolioFromTable(String columnFolio, String table) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT CONVERT(LPAD(IFNULL(MAX(" + columnFolio + ")+1,1),6,'0'), CHAR) ");
        sql.append("FROM " + table + " ");
        return getGenerateFolio(sql.toString());
    }

    protected String getFolioFromTable(String columnFolio, String table, String where) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT CONVERT(LPAD(IFNULL(MAX(" + columnFolio + ")+1,1),6,'0'), CHAR) ");
        sql.append("FROM " + table + " ");
        sql.append(where);
        return getGenerateFolio(sql.toString());
    }

    private String getGenerateFolio(String consulta) {
        String maxFolio = "";
        try {
            //System.out.println("sql " + consulta);
            Query query = this.entityManager.createNativeQuery(consulta);
            Object ret = query.getResultList();

            maxFolio = Util.getFormatoStringReplaceNull(ret);
            if (maxFolio.contains("[")) {
                maxFolio = maxFolio.replace("[", "");
            }
            if (maxFolio.contains("]")) {
                maxFolio = maxFolio.replace("]", "");
            }
            //System.out.println("Generate Folio: " + maxFolio);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return maxFolio;
    }

}
