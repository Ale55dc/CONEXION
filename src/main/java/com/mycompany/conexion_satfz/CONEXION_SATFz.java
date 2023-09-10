/**
 *
 * @author Alejandra
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conexion_satfz;

import java.awt.Dimension;
import java.awt.Toolkit;
import static javax.swing.Spring.width;
//import mx.sat.wsvalidacion.Acuse;
//import mx.sat.wsvalidacion.ConsultaCFDIService;
//import mx.sat.wsvalidacion.IConsultaCFDIService;

public class CONEXION_SATFz {

    public static void main(String[] args) {
        System.out.println("Hola Alej!");
        //ValidacionSAT validador = new ValidacionSAT();
        //String respuesta = validador.obtencionEstatus("CRF090521AP6","");
        //System.out.println("*** RESULTADO VALIDACION = " + respuesta);
        PantallaInicial pantallaIni = new PantallaInicial();
        pantallaIni.setSize(500, 500);
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frame = pantallaIni.getSize();
        pantallaIni.setLocation((pantalla.width / 2 - (frame.width / 2)), pantalla.height / 2 - (frame.height / 2));
        pantallaIni.setVisible(true);
    }
}
