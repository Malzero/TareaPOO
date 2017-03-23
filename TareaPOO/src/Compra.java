/**
 * Created by Mauricio on 20/03/2017.
 */
public class Compra {

    private int numeroCompra;
    private int monto;

    public Compra(int numeroCompra, int monto) {
        this.numeroCompra = numeroCompra;
        this.monto = monto;
    }

    public int getNumeroCompra()
    {
        return numeroCompra;
    }

    public int getMonto()
    {
        return monto;
    }
}
