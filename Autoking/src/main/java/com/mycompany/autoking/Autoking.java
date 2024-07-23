
package com.mycompany.autoking;

import com.mycompany.autoking.igu.Principal;
import java.nio.file.attribute.GroupPrincipal;


public class Autoking {

    public static void main(String[] args) {
        //Llamamos y hacemos visible nuestra igu
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
        
    }
}
