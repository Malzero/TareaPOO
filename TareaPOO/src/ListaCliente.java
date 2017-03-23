/**
 * Created by Mauricio on 20/03/2017.
 */
public class ListaCliente {

    private Cliente clientes[];
    private int pLibre;

    public ListaCliente(int cantClientes) {

        clientes = new Cliente[cantClientes];
        pLibre = cantClientes + 1;

    }

    public boolean agregarClientes(Cliente nuevo)
    {
        if (clientes != null)
        {
            if (pLibre < clientes.length && noExisteCliente(nuevo.getRut())) {
                clientes[pLibre] = nuevo;
                pLibre++;
                return true;
            } else
                return false;
        }
        return false;
    }

    private boolean noExisteCliente(String rut)
    {
        return buscarCliente(rut) == null;
    }

    public boolean eliminarCliente(String rut)
    {
        if (clientes != null)
        {
            if (pLibre > 0)
            {
                for (int i = 0; i < clientes.length; i++)
                {
                    if (clientes[i].getRut().equals(rut))
                        clientes[i] = clientes[pLibre - 1];
                }
                pLibre--;
                return true;
            } else
                return false;
        }
        return false;
    }

    public Cliente buscarCliente(String rut)
    {
        if (clientes != null)
        {
            for (int k = 0; k < clientes.length; k++) {
                if (clientes[k].getRut().equals(rut))
                    return clientes[k];
            }
            return null;
        }
        return null;
    }


    public String[] mayoresPromedios()
    {
        String[] mayores = null;

        if (clientes != null)
        {
            double mayorPromedio = mayorPromedio();
            int j = 0;
            mayores = new String[cantPromedioAlto()];

            for (int i = 0; i < clientes.length; i++) {
                if (clientes[i].promedio() == mayorPromedio) {
                    mayores[j] = clientes[i].getNombre();
                    j++;
                }
            }
        }
        return mayores;
    }

    private double mayorPromedio()
    {
        double mayor = -1;
        if (clientes != null)
        {
            mayor = clientes[0].promedio();
            double promedio;

            for (int i = 0; i < clientes.length; i++)
            {
                promedio = clientes[i].promedio();
                if (promedio >= mayor)
                {
                    mayor = clientes[i].promedio();
                }
            }
        }
        return mayor;
    }

    public int cantPromedioAlto()
    {
        int cant = 0;
        double mayor = mayorPromedio();
        if (clientes != null)
        {
            for (int i = 0; i < clientes.length; i++)
            {
                if (clientes[i].promedio() == mayor)
                {
                    cant++;
                }
            }
        }
        return cant;
    }

}
