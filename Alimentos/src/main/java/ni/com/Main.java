package ni.com;

import ni.com.alimentos.Acongelados;
import ni.com.alimentos.Afrescos;
import ni.com.alimentos.Alimento;
import ni.com.alimentos.Arefrigerados;

import java.text.SimpleDateFormat;
import java.text.ParseException;

public  class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Alimento alimento = new Alimento("arroz", dateFormat.parse("22/07/1996"), 34);
        // System.out.println(alimento);
        System.out.println(alimento.getNombre());
        System.out.println(alimento.getFecha_de_vecimiento());
        System.out.println(alimento.getNumero_lote());

        Afrescos afrescos = new Afrescos("mantequilla", dateFormat.parse("22/07/2050"), 21, dateFormat.parse("22/07/1996"), "Nicaragua");
        System.out.println(afrescos.getNombre());
        System.out.println(afrescos.getFecha_de_vecimiento());
        System.out.println(afrescos.getNumero_lote());
        System.out.println(afrescos.getEnvazado());
        System.out.println(afrescos.getOrigen());

        Arefrigerados arefrigerados = new Arefrigerados("salchicha", dateFormat.parse("01/01/2024"), 12, 5555555);
        System.out.println(arefrigerados.getCodigo());

        Acongelados acongelados = new Acongelados("pollo", dateFormat.parse("01/01/2024"), 1, "25 grados");
        System.out.println(acongelados.getTemperatura_recomendada());

    }
}