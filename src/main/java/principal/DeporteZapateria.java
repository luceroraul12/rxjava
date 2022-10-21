package principal;

public class DeporteZapateria extends Zapateria{
    public DeporteZapateria(Comunicador comunicador) {
        super(comunicador);
        setTipo(TipoZapateria.DEPORTE);
    }
}
