package Adapter;

public class PrintBanner implements Print {

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
