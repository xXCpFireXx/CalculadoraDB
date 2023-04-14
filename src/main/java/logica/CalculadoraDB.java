/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package logica;

import igu.index;
import igu.Peso_Ideal;
import igu.Indice_Metabolico_Basal;
import igu.Porcentaje_Grasa_Corporal;
import igu.Quemando_Calorias;
/**
 *
 * @author crisu
 */
public class CalculadoraDB {

    public static void main(String[] args) {
        
        index I = new index();
        I.setVisible(true);
        I.setLocationRelativeTo(null);
        
        Peso_Ideal IBW = new Peso_Ideal();
        IBW.setVisible(true);
        IBW.setLocationRelativeTo(null);
        
        Indice_Metabolico_Basal TMB = new Indice_Metabolico_Basal();
        TMB.setVisible(true);
        TMB.setLocationRelativeTo(null);
        
        Porcentaje_Grasa_Corporal PGC = new Porcentaje_Grasa_Corporal();
        PGC.setVisible(true);
        PGC.setLocationRelativeTo(null);
        
        Quemando_Calorias QC = new Quemando_Calorias();
        QC.setVisible(true);
        QC.setLocationRelativeTo(null);
    }
}
