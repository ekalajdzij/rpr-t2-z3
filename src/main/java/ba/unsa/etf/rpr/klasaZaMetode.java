package ba.unsa.etf.rpr;
import java.util.List;

public class klasaZaMetode {
    public static Double srednjaVrijednost(List<Integer> lista) {
        double suma = 0;
        for (int i = 0; i<lista.size(); i++) {
            suma += lista.get(i);
        }
        return suma / lista.size();
    }
    public static Double standardnaDevijacija(List<Integer> lista) {
        double mean = srednjaVrijednost(lista);
        double suma = 0;
        for (int i = 0; i<lista.size(); i++)
            suma += ((lista.get(i) - mean) * (lista.get(i) - mean));
        return Math.sqrt(suma/lista.size());

    }
}
