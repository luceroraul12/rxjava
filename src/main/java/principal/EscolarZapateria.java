package principal;

import java.util.Arrays;

public class EscolarZapateria extends Zapateria{
    public EscolarZapateria(Comunicador comunicador) {
        super(comunicador);
        setTipo(TipoZapateria.ESCOLAR);
        setMarcas(Arrays.asList("EsIndumentaria","TrajeEscolar"));

    }
}
