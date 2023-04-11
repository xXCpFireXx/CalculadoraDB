/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package logica;

import igu.Peso_Ideal;
import igu.Indice_Metabolico_Basal;

/**
 *
 * @author crisu
 */
public class CalculadoraDB {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Peso_Ideal IBW = new Peso_Ideal();
        IBW.setVisible(true);
        IBW.setLocationRelativeTo(null);
        
        Indice_Metabolico_Basal TMB = new Indice_Metabolico_Basal();
        TMB.setVisible(true);
        TMB.setLocationRelativeTo(null);
    }
}
