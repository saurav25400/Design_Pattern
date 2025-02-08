import Interface.Creator;
import Interface.Product;
import Interface.ProductA;

public class CreatorA implements Creator {

    @Override
    public Product factoryProduct() {
        return new ProductA();
    }
}
