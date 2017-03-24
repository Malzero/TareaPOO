/**
 * Created by Mauricio on 20/03/2017.
 */
public class Cliente {
    private String nombre;
    private String rut;
    private Compra[] compras;
    private int pLibre;

    public Cliente(String nombre, String rut, int cantCompras) {
        this.nombre = nombre;
        this.rut = rut;
        compras = new Compra[cantCompras];
        pLibre = 0;
    }

    public String getRut()
    {
        return rut;
    }

    public String getNombre()
    {
        return nombre;
    }

    public boolean anularCompra(int numeroCompra)
    {
        if (compras != null)
        {
            for (int i = 0; i < compras.length; i++)
            {
                if (numeroCompra == compras[i].getNumeroCompra())
                {
                    compras[i] = null;
                    return true;
                }
            }
            return false;
        }
        return false;

    }

    public void ordenarCompras()
    {
        if (compras != null) {

            Compra aux;

            for (int i = 0; i < compras.length - 1; i++)
            {
                for (int j = 0; j < compras.length - 1; j++)
                {
                    if (compras[j].getNumeroCompra() > compras[j + 1].getNumeroCompra())
                    {
                        aux = compras[j+1];
                        compras[j+1] = compras[j];
                        compras[j] = aux;
                    }
                }

            }
        }
    }

    public double promedio()
    {
        double suma = 0;
        int i;
        if (compras != null)
        {
            for (i = 0; i < pLibre; i++) {
                System.out.println();
                suma += compras[i].getMonto();
            }
            if (i != 0)
                return suma/i;
            else return -1;
        }
        return -1;
    }

    public boolean agregarCompra(int numero, int monto)
    {
        if (pLibre < compras.length) {
            compras[pLibre] = new Compra(numero, monto);
            pLibre++;
            return true;
        }
        else return false;


    }
}
