package FactoryMethod.idcard;

import FactoryMethod.framework.Product;

public class IDCard extends Product {

    private String owner;
    private int index;

    public IDCard(String owner, int index) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
        this.index = index;
    }

    @Override
    public void use() {
        System.out.println("ID:" + index + " " + owner + "のカードを使います。");
    }

    public String getOwner() {
        return owner;
    }

    public int getIndex() {
        return index;
    }

}
