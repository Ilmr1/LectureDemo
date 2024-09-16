public class App {
    public int addMe(int a, int b) {
        return a + b;
    }

    public int subtractMe(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.addMe(11, 1));
        System.out.println(app.subtractMe(11, 1));
    }
}
