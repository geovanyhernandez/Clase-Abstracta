public class prueba{
    public static void main (String[] args) {
       Rectangulo rectangulo = new Rectangulo();
       rectangulo.setDatos(4,3);
       System.out.println("resultado de rectangulo: " + rectangulo.getArea());
       
       Triangulo triangulo = new Triangulo();
       triangulo.setDatos(4,3);
       System.out.println("resultado de triangulo: " + triangulo.getArea());
    }
}