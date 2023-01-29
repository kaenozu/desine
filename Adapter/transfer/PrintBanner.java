package Adapter.transfer;

public class PrintBanner extends Print {

    private Bannar bannar;

    public PrintBanner(String string) {
        this.bannar = new Bannar(string);
    }

    @Override
    public void printWeak() {
        this.bannar.showWithParen();
    }

    @Override
    public void printStrong() {
        this.bannar.showWithAster();
    }
}
