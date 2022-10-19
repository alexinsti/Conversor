/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Code;

/*
Millas a KM
Litros a Galones
Kilos a Libras
Dolares a Euros
Metros a Pies

*/

/**
 *
 * @author damm
 */
public class Conversor {
    
    public static double kmAMillas(double km){
        double resultado;
        resultado=km*1.60934;
        return resultado;
    }
    
    public static double millasAKm(double millas){
        double resultado;
        resultado=millas*0.621371;
        return resultado;
    }
    
    public static double lAGalones(double l){
        double resultado;
        resultado=l*0.219969;
        return resultado;
    }
    
    public static double galonesAL(double galones){
        double resultado;
        resultado=galones*4.54609;
        return resultado;
    }
    
    public static double kgAlibras(double kg){
        double resultado;
        resultado=kg*2.20462;
        return resultado;
    }
    
    public static double librasAKg(double libras){
        double resultado;
        resultado=libras*0.453592;
        return resultado;
    }
    
    public static double eurosADolares(double euros){
        double resultado;
        resultado=euros*0.98;
        return resultado;
    }
    
    public static double dolaresAEuros(double dolares){
        double resultado;
        resultado=dolares*1.02;
        return resultado;
    }
    
    public static double metrosAPies(double metros){
        double resultado;
        resultado=metros*3.28084;
        return resultado;
    }
    
    public static double piesAMetros(double pies){
        double resultado;
        resultado=pies*0.3048;
        return resultado;
    }
    
    
    
}
