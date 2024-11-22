package Tema_6.d_Ej1;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void imprime(){
        System.out.println("("+x+","+y+")");
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void desplaza(int dx, int dy){
        x=x+dx;
        y=y+dy;
    }
    public int distancia(Punto p){
        int resultado;
        resultado=(int) (Math.sqrt(Math.pow(x-p.x,2)+Math.pow(y-p.y,2)));
        return resultado;
    }
}
