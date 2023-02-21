package FactoryMethod;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;
import FactoryMethod.idcard.IDCardFactory;
import FactoryMethod.suica.SuicaFactory;

public class main {

    public static void main(String[] args) {
        Factory idCardFactory = new IDCardFactory();
        Product idCard1 = idCardFactory.create("あいうえお");
        Product idCard2 = idCardFactory.create("かきくけこ");
        Product idCard3 = idCardFactory.create("さしすせそ");

        idCard1.use();
        idCard2.use();
        idCard3.use();

        Factory suicaFactory = new SuicaFactory();
        Product suica1 = suicaFactory.create("suica1");
        Product suica2 = suicaFactory.create("suica2");
        Product suica3 = suicaFactory.create("suica3");

        suica1.use();
        suica2.use();
        suica3.use();

    }
}
