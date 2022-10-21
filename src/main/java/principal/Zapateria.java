package principal;

import io.reactivex.rxjava3.disposables.Disposable;

import java.util.Arrays;
import java.util.List;

public abstract class Zapateria {
    private List<String> marcas;
    private Comunicador comunicador;
    private TipoZapateria tipo;

    public Zapateria(Comunicador comunicador) {
        this.comunicador = comunicador;
        comunicador.getDisparador().subscribe(
                respuesta -> {
                    if (respuesta) {
                        System.out.println("Llamaste a la zapateria de: "+tipo);
                    } else {
                        comunicador.getRecibidorDeDatos(). onNext(marcas);
                    }
                }
        );


    }

    public void setTipo(TipoZapateria tipo) {
        this.tipo = tipo;
    }

    public void setMarcas(List<String> marcas) {
        this.marcas = marcas;
    }
}
