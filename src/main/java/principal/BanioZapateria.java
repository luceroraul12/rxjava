package principal;

import java.util.Arrays;

public class BanioZapateria extends Zapateria{
    public BanioZapateria(Comunicador comunicador) {
        super(comunicador);
        setTipo(TipoZapateria.BANIO);
        setMarcas(Arrays.asList("chanlas","crocs"));
    }
}
