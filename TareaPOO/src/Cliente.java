/**
 * Created by Mauricio on 20/03/2017.
 */
public class Cliente {
    private String nombre;
    private String rut;
    private Compra[] compras;

    public Cliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
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
            for (i = 0; i < compras.length; i++) {
                suma += compras[i].getMonto();
            }
            return suma/i;
        }
        return -1;
    }
}
