public class Main {
    public static void main(String[] args) {

        PrimerDiaEscuela school = new PrimerDiaEscuela();
        String[] bag = {};
        bag=school.cosasMochila();
        school.printItems(bag);

    }
}