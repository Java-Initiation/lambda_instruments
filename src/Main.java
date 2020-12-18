public class Main {

    public static void main(String[] args) {

        foo((morceau, duree) ->
                System.out.println("Je joue " + morceau + " " + duree + " minutes")
        );

    }

    public static void foo(Instrument instrument){
        instrument.jouer("piano", 2);
    }

}
