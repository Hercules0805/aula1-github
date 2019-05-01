package JavaCompleto2019.S9;

import java.util.Locale;

public class PessoaTest {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Pessoa pf = new PessoaFisica("Alex",50000,2000);
        System.out.println(pf.calculaImposto());

        Pessoa pj = new PessoaJuridica("SofTec",400000,25);
        System.out.println(String.format("%.2f",pj.calculaImposto()));
    }
}
