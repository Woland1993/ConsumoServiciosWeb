/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosweb;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Woland
 */
public class ServiciosWeb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConsumeServices cs=new ConsumeServices();
        try {
            cs.Connection("", "", "");
            System.out.println(cs.getString());
        } catch (IOException ex) {
            Logger.getLogger(ServiciosWeb.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        cs.disconect();
        }
    }
    
}
