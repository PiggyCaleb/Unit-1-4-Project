public class Randm {
    private int ran;
    private String greet;


    public Randm(){}


    public void phrase(int ran) {
        if (ran < 1) {
            for (int i = 0; i < 1; i--) {
                System.out.println("you did this >:(");
            }
        }
        if (ran == 1) {
            System.out.println("Ga");
        }
        if (ran == 2) {
            System.out.println("te");
        }
        if (ran == 3) {
            System.out.println("ke");
        }
        if (ran == 4) {
            System.out.println("ep");
        }
        if (ran == 5) {
            System.out.println("That's my favorite number :)");
            System.out.println("ing");
        }
        if (ran > 5) {
            for (int i = 0; i < 1; i--) {
                System.out.println("you did this >:(");
            }
        }
    }




    public void reveal(String greet) {
        if (greet.equals("hi") || greet.equals("hello") || greet.equals("ok")) {
            System.out.println("There is a secret password... look for it by playing repeatedly...");
        }
        if (greet.equals("gatekeeping")) {
            System.out.println("Congrats you found the password now you can play the actual game :)");
        }
    }




    public String random() {
        String phrase = "";
        int rando = (int) ((Math.random() * 6) + 1);
        if (rando == 1) {
            phrase = "Turn around and walk away";
        }
        if (rando == 2) {
            phrase = "Exercise";
        }
        if (rando == 3) {
            phrase = "Start dancing";
        }
        if (rando == 4) {
            phrase = "Go eat something healthy";
        }
        if (rando == 5) {
            phrase = "Take a nap";
        }
        if (rando == 6) {
            phrase = "Do something productive ";
        }
        phrase = phrase + ", rather than wasting your time on whatever this is.";
        System.out.println(phrase);
        return phrase;
    }


    public void makeArrow(int finNum){
        for (int i = 0; i <= finNum; i++) {
            System.out.print("-");
        }
        System.out.print(">");
        System.out.print("");
    }
}




