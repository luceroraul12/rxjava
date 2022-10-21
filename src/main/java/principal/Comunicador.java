package principal;

import io.reactivex.rxjava3.subjects.PublishSubject;

import java.util.List;

public class Comunicador {
    private PublishSubject<Boolean> disparador = PublishSubject.create();
    private PublishSubject<List<String>> recibidorDeDatos = PublishSubject.create();

    public PublishSubject<Boolean> getDisparador() {
        return this.disparador;
    }

    public PublishSubject<List<String>> getRecibidorDeDatos() {
        return this.recibidorDeDatos;
    }
}
