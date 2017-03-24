/**
 * Created by Mauricio on 20/03/2017.
 */
public class SuperMercado {
    private String nombre;
    private String rut;
    private ListaCliente clientes;

    public SuperMercado(String nombre, String rut, int cantClientes) {

        this.nombre = nombre;
        this.rut = rut;
        clientes = new ListaCliente(cantClientes);

    }

    public boolean agregarCliente(Cliente nuevo)
    {
        if (clientes != null && nuevo != null)
            return clientes.agregarClientes(nuevo);
        else return false;
    }

    public boolean eliminarCliente(String rut)
    {
        if (clientes != null)
            return clientes.eliminarCliente(rut);
        else return false;
    }

    public boolean anularCompra(String rut, int numeroCompra)
    {
        if (clientes != null)
            return clientes.buscarCliente(rut).anularCompra(numeroCompra);
        else return false;
    }

    public String[] clientesMayorPromedioCompras()
    {
        String[] clientesM = null;
        if (clientes != null)
        {
            clientesM = new String[clientes.cantPromedioAlto()];
            clientesM = clientes.mayoresPromedios();
        }

        return clientesM;
    }

    public void ordenarComprasPorNumero(String rut)
    {
        if(clientes != null)
            clientes.buscarCliente(rut).ordenarCompras();
    }


}
