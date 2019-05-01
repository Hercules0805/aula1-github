package JavaCompleto2019.S9;

public class PessoaJuridica extends Pessoa {
    int funcionarios;

    public PessoaJuridica(String nome, double renda, int funcionarios) {
        super(nome, renda);
        this.funcionarios = funcionarios;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(int funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public double calculaImposto() {
        double imposto;
        if(funcionarios<10){
            imposto = (renda * 0.16);
        }
        else {
            imposto = (renda * 0.14);
        }
        return imposto;
    }
}
