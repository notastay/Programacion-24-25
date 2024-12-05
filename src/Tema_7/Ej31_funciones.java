package Tema_7;

public class Ej31_funciones {
    public static void main(String[] args) {
        System.out.println(calcularDiaMes(2021, 1));
        
    }

    public static int calcularDiaMes(int anio, int mes){
        int dias=0;
        switch (mes) {
            case 1,3,5,7,8,10,12:
                dias=31;
                break;
            case 2:
            if((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
                dias=29;
            }else{
                dias=28;
            }
                break;
            case 4,6,9,11:
                dias=30;
                break;

            default:
                System.err.println("Mes invalido");
                break;
        }
        return dias;
    }
}
