package Tema_6.d_Ej3;

public class Rectangulo {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        if (x1 < x2 && y1 < y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR al instanciar Rectangulo");
        }
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        if (x1 < x2){
            this.x1 = x1;
        }else{
            System.err.println("ERROR al cambiar el valor");
        }
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        if (x1 < x2){
            this.x2 = x2;
        }else{
            System.err.println("ERROR al cambiar el valor");
        }
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        if (y1 < y2){
            this.y1 = y1;
        }else{
            System.err.println("ERROR al cambiar el valor");}
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        if (y1 < y2){
            this.y2 = y2;
        }else{
            System.err.println("ERROR al cambiar el valor");
        }
    }
    public void imprimir(){
        System.out.println("(" + x1 + "," + y1 + ") (" + x2 + "," + y2 + ")");
    }
    public void setX1Y1(int x1, int y1){
        if (x1 < x2 && y1 < y2) {
            this.x1 = x1;
            this.y1 = y1;
        } else {
            System.err.println("ERROR al cambiar los valores");
        }
    }
    public void setX2Y2(int x2, int y2){
        if (x1 < x2 && y1 < y2) {
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR al cambiar los valores");
        }
    }
    public void setAll(int x1, int y1, int x2, int y2){
        if (x1 < x2 && y1 < y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR al cambiar los valores");
        }
    }
    public int getPerimeto(){
        return ((x2 - x1) + (y2 - y1)) * 2;
    }
    public int getArea(){
        return (x2 - x1) * (y2 - y1);
    }
}