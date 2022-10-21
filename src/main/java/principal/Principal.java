package principal;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Comunicador comunicador = new Comunicador();
        Zapateria deporteZapateria = new DeporteZapateria(comunicador);
        Zapateria banioZapateria = new BanioZapateria(comunicador);
        Zapateria eleganciaZapateria = new EleganciaZapateria(comunicador);
        Zapateria escolarZapateria = new EscolarZapateria(comunicador);
        List<String> todasLasMarcas = new ArrayList<>();
        Disposable subscribe = comunicador.getRecibidorDeDatos().subscribe(todasLasMarcas::addAll);
//        devuelve zapaterias especifica
        comunicador.getDisparador().onNext(true);
//        devuelve todas las marcas trabajadas
        comunicador.getDisparador().onNext(false);
        System.out.println("Marcas disponibles entre todos los locales: "+ todasLasMarcas);
        comunicador.getDisparador().onComplete();
    }
}
