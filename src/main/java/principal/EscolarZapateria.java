package principal;

public class EscolarZapateria extends Zapateria{
    public EscolarZapateria(Comunicador comunicador) {
        super(comunicador);
        setTipo(TipoZapateria.ESCOLAR);
    }
}
