package predicateLambda.exercise.entitle;

public class Product {

    // atributos
    private String name;
    private Double price;

    // construtor
    public Product(){
    }

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    // get e set
    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // método estático que verifica se um determinado produto possue preço maior ou igual a R$ 100.0
    public static boolean staticProductPredicate(Product product){
        return product.getPrice() >= 100.0;
    }

    // método não estático que verifica se um determinado produto possue preço maior ou igual a R$ 100.0
    public boolean nonStaticProductPredicate(){
        return this.price >= 100.0;
    }

    // sobreposição do método toString()
    @Override
    public String toString(){
        return "Product : [ name = " + getName() + ", price = R$ " + getPrice() + " ]";
    }
}
