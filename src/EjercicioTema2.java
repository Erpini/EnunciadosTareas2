public class EjercicioTema2 {

    public static void main(String[] args){

        double pantalon = 44.2;
        double iva = pantalon * 0.21;
        double precio = precioFinal(pantalon,  iva);


        System.out.println( " el precio del pantalon es :  " + precio);

    }

    static  double  precioFinal(double pantalon, double iva){
    return pantalon + iva;

    }

}
