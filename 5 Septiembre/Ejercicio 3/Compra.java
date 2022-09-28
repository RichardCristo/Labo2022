import java.util.ArrayList;

public class Compra {
    private Cliente clienteAsociado;
    private ArrayList<Componente> listaComponente;

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public ArrayList<Componente> getListaComponente() {
        return listaComponente;
    }

    public void setListaComponente(ArrayList<Componente> listaComponente) {
        this.listaComponente = listaComponente;
    }

    public Compra(Cliente clienteAsociado, ArrayList<Componente> listaComponente) {
        this.clienteAsociado = clienteAsociado;
        this.listaComponente = listaComponente;
    }
}

