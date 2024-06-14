package ExerciseAccount.entities;

public class SavingsAccount extends Account {

    // atributos
    private Double interestRate;    // taxa de juros

    // construtores
    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate){
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    // get e set
    public Double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(Double interestRate){
        this.interestRate = interestRate;
    }

    // métodos
    public void uppdateBalance(){
        balance -= balance * interestRate / 100.0;
    }
}
