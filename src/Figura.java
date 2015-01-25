abstract class Figura{//ES ABSTRACTA POR QUE NO HAY CONCEPTO A LO QUE TE REFIERES

    protected int ancho, alto;
    
    void setDatos(int x, int y) //metodos no abstracto
    {
       ancho =x;
       alto  =y;
    }
    void mostrarDatos() //metodos no abstracto
    {
        System.out.println(ancho);
        System.out.println(alto);
    }
    abstract float getArea(); //metodo abstracto
}