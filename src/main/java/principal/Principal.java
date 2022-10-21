package principal;

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

        comunicador.getRecibidorDeDatos().subscribe(
                todasLasMarcas::addAll
        );
        comunicador.getDisparador().onNext(true);
        System.out.println();
        comunicador.getDisparador().onNext(false);
        System.out.println("Marcas disponibles entre todos los locales: "+ todasLasMarcas);

    }
}
