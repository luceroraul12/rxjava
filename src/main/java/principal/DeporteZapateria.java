package principal;

import java.util.Arrays;

public class DeporteZapateria extends Zapateria{
    public DeporteZapateria(Comunicador comunicador) {
        super(comunicador);
        setTipo(TipoZapateria.DEPORTE);
        setMarcas(Arrays.asList("nike","puma"));
    }
}
