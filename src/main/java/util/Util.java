/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Nermil
 */
public class Util {

    private static SimpleDateFormat dateFormat;

    public static String parseFecha(Date date, String pattern) {
        dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(date);
    }
    
    public static Date parseStringDDMMYYYYToDate(String txtDate) {
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date res = null;
        if (txtDate != null && txtDate.length() > 0) {
            try {
                if (txtDate.length() > 10) {
                    txtDate = txtDate.substring(0, 10);
                }

                res = dateFormat.parse(txtDate);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return res;
    }

    public static String getFormatoStringReplaceNull(Object param) {
        String res = "";
        if (param != null) {
            res = String.valueOf(param);
        }
        return res;
    }

}
