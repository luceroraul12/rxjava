package principal;

import io.reactivex.rxjava3.disposables.Disposable;

import java.util.Arrays;
import java.util.List;

/**
 * Clase base para cualquier tipo de zapateria.
 */
public abstract class Zapateria {
    private List<String> marcas;
    private Comunicador comunicador;
    private TipoZapateria tipo;

    /**
     * Cosntructor de prueba.
     * En else inyecta el comunicador y se realiza las subscripciones correspondientes para poder:<br>
     * -mostrar tipo y marcas especificas.<br>
     * -devolver todas las marcas asociadas a todas las zapaterias(es el resumen de marcas).
     * @param comunicador
     */
    public Zapateria(Comunicador comunicador) {
        this.comunicador = comunicador;
        comunicador.getDisparador().subscribe(
                respuesta -> {
                    if (respuesta) {
                        System.out.println("tipo de zapateria:\t"+tipo+"\tmarcas disponibles:\t"+marcas);
                    } else {
                        comunicador.getRecibidorDeDatos(). onNext(marcas);
                    }
                }
        );


    }

    /**
     * enumeracion que tiene que ser seteada por cada clase hija
     * @param tipo
     */
    public void setTipo(TipoZapateria tipo) {
        this.tipo = tipo;
    }

    /**
     * Conjunto de marcas que tiene que setear cada clase hija
     * @param marcas
     */
    public void setMarcas(List<String> marcas) {
        this.marcas = marcas;
    }
}
