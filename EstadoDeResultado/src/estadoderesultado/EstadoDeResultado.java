package estadoderesultado;
import java.util.*;
public class EstadoDeResultado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double Ventas, DVentas, VN, MO, MPrimas, CostoV, UBruto, GAdm, GVenta, TGastos, Utilidad,AI, IUtilidad;
        double PDVentas, PVN, PMO, PMPrimas, PCostoV, PUBruto, PGAdm, PGVenta, PUtilidad, PAI, PIUtilidad;
        
        System.out.println("Escribe el monto inicial");
        Ventas= sc.nextDouble();
        
        System.out.println("Introduzca el porcentaje del descuento de ventas, este tiene que ser del 0 al 100");
        PDVentas=sc.nextDouble();
        DVentas=(Ventas*PDVentas)/100;
        VN= Ventas-DVentas;
        PVN=100-PDVentas;
        
        System.out.println("Introduzca el porcentaje de la Mano de obra");
        PMO=sc.nextDouble();
        MO=(PMO*Ventas)/100;
        System.out.println("Introduzca el porcentaje de las materias primas");
        PMPrimas=sc.nextDouble();
        MPrimas=(Ventas*PMPrimas)/100;
        
        CostoV = MO+MPrimas;
        PCostoV = PMO+PMPrimas;
       
        System.out.println("Descuento de ventas: "+DVentas 
                +"\nProcentaje: "+PDVentas+"%");
        System.out.println("Ventas netas: "+VN
                +"\nPorcentaje: "+PVN+"%");
        
        
        System.out.println("Mano de obra: "+MO 
                +"\nProcentaje: "+PMO+"%");
        System.out.println("Materias primas: "+MPrimas
                +"\nPorcentaje: "+PMPrimas+"%");
        
        System.out.println("Costo de venta: "+CostoV 
                +"\nProcentaje: "+PCostoV+"%");
        
    }
    
}
