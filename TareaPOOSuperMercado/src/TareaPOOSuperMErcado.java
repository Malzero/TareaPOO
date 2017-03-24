/**
 * Created by Mauricio on 20/03/2017.
 */
public class TareaPOOSuperMErcado {

    public static void main (String[] args)
    {
        //Se instancia una clase de tipo SuperMercado
        SuperMercado superMercado = new SuperMercado("Lider", "800000-2", 10);
        //Se instancia un Cliente nuevo
        Cliente nuevo = new Cliente("Mauricio", "18907502-2", 5);
        //Se agregan compras para la prueba
        nuevo.agregarCompra(1, 2600);
        nuevo.agregarCompra(2, 3500);
        nuevo.agregarCompra(3, 2200);
        nuevo.agregarCompra(4, 7430);
        nuevo.agregarCompra(5, 2100);
        //Se agrega el cliente nuevo
        superMercado.agregarCliente(nuevo);
        //Se crea obtiene los clientes con mayor compra
        String[] mayorCompra;
        mayorCompra = superMercado.clientesMayorPromedioCompras();
        //Muestro los clientes con la mayor compra
        for (int i = 0; i < mayorCompra.length; i++)
            System.out.println(mayorCompra[i]);

        superMercado.ordenarComprasPorNumero("18907502-2");
        superMercado.anularCompra("18907502-2", 1);
        superMercado.eliminarCliente("18907502-2");










    }
}
