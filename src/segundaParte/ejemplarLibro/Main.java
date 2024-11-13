package segundaParte.ejemplarLibro;

public class Main {
    public static void main(String[] args) {
        EjemplarLibro l1=new EjemplarLibro("Fin");
        EjemplarLibro l2=new EjemplarLibro("principio");
        EjemplarLibro l3=new EjemplarLibro("a");
        EjemplarLibro l4=new EjemplarLibro("z");
        EjemplarLibro libro1= new EjemplarLibro(l1);
        EjemplarLibro libro2= new EjemplarLibro(l2);
        EjemplarLibro libro3= new EjemplarLibro(l3);
        EjemplarLibro libro4= new EjemplarLibro(l4);
        libro1.prestar();
        libro3.prestar();
        libro1.devolver();
        System.out.println(libro1.toString()+" "+libro2.toString()+" "+ libro3.toString()+" "+ libro4.toString());



    }
}
