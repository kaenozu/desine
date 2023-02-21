package FactoryMethod.suica;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;

public class SuicaFactory extends Factory {

    @Override
    protected void registerProduct(Product p) {
        System.out.println(((Suica) p).getOwner() + "のSuicaが登録されました。");
    }

    @Override
    protected Product createProduct(String owner) {
        return new Suica(owner);
    }

}
