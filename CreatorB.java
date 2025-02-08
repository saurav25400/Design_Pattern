import Interface.Creator;
import Interface.Product;
import Interface.ProductB;

public class CreatorB implements Creator {

    @Override
    public Product factoryProduct() {
        return new ProductB();
    }
}
