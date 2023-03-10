package FactoryMethod.idcard;

import java.util.ArrayList;
import java.util.List;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;

public class IDCardFactory extends Factory {

    List<String> owners = new ArrayList<>();
    int index;

    @Override
    protected void registerProduct(Product p) {
        owners.add(((IDCard) p).getOwner());
    }

    @Override
    protected Product createProduct(String owner) {
        index++;
        return new IDCard(owner, index);
    }

}
