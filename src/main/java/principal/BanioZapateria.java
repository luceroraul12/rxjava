package principal;

public class BanioZapateria extends Zapateria{
    public BanioZapateria(Comunicador comunicador) {
        super(comunicador);
        setTipo(TipoZapateria.BANIO);
    }
}
