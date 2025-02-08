import Interface.Creator;
import Interface.Product;

public class Main {
    public static void main(String[] args) {
        Creator c=new CreatorA();
        Product product= c.factoryProduct();
        product.display();

        CreatorB cb=new CreatorB();
        Product product1=cb.factoryProduct();
        product1.display();

        // for Product C

        Creator c3=new CreatorC();
        Product product3=c3.factoryProduct();
        product3.display();

    }
}
