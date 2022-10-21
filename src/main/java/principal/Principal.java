package principal;

public class Principal {
    public static void main(String[] args) {

        Comunicador comunicador = new Comunicador();
        Zapateria deporteZapateria = new DeporteZapateria(comunicador);
        Zapateria banioZapateria = new BanioZapateria(comunicador);
        Zapateria eleganciaZapateria = new EleganciaZapateria(comunicador);
        Zapateria escolarZapateria = new EscolarZapateria(comunicador);

        comunicador.getRecibidorDeDatos().subscribe(
                lista -> {
                    System.out.println(lista);
                }
        );


        comunicador.getDisparador().onNext(true);
        System.out.println();
        comunicador.getDisparador().onNext(false);

    }
}
