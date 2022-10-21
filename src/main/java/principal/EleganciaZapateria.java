package principal;

public class EleganciaZapateria extends Zapateria{
    public EleganciaZapateria(Comunicador comunicador) {
        super(comunicador);
        setTipo(TipoZapateria.ELEGANCIA);
    }
}
