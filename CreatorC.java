import Interface.Creator;
import Interface.Product;
import Interface.ProductC;

public class CreatorC implements Creator {
    @Override
    public Product factoryProduct() {
        return new ProductC();
    }
}
