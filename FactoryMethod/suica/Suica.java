package FactoryMethod.suica;

import FactoryMethod.framework.Product;

public class Suica extends Product {

    private String owner;

    public Suica(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "のsuicaの使用音♪");
    }

    public String getOwner() {
        return this.owner;
    }

}
