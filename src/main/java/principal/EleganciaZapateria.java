package principal;

import java.util.Arrays;

public class EleganciaZapateria extends Zapateria{
    public EleganciaZapateria(Comunicador comunicador) {
        super(comunicador);
        setTipo(TipoZapateria.ELEGANCIA);
        setMarcas(Arrays.asList("Alteza","rincinElegan"));

    }
}
