package EmployeeExercise.entities;

// sublasse de Employee
public class OutsourcedEmployee extends Employee {

    // atributos
    private Double additionalCharge;

    // contrutores
    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge){
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    // get e set
    public Double getAdditionalCharge(){return additionalCharge;}

    public void setAdditionalCharge(Double additionalCharge){this.additionalCharge = additionalCharge;}

    // métodos

    // criando sobreposição do método payment da super classe
    @Override
    public double payment(){
        // retorna a quantidade de hora pelo o valor de hora mais 110% do adicional
        return super.payment() + additionalCharge*1.1;
    }
}
