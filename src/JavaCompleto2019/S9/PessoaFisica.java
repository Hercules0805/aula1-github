package JavaCompleto2019.S9;

public class PessoaFisica extends Pessoa {
    double gastosSaude;

    public PessoaFisica(String nome, double renda, double gastosSaude) {
        super(nome, renda);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double calculaImposto() {
        double imposto;
        if(renda<20000){
            imposto = (renda * 0.15)-(getGastosSaude() * 0.5);
        }
        else {
            imposto = (renda * 0.25)-(getGastosSaude() * 0.5);
        }
        return imposto;
    }
}
