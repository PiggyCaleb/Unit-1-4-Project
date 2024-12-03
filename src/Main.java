import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Randm Randm = new Randm();
        System.out.println("Do you wish to participate... \ntype \"yes\" if you do or anything else otherwise");
        Scanner s = new Scanner(System.in);
        String yo = s.nextLine();
        if (yo.equals("yes")) {
            System.out.println("Type in a name of your choice ");
            Scanner t = new Scanner(System.in);
            String name = t.nextLine();
            Randm.reveal(name);
            if (name.equals("gatekeeping")) {
                System.out.println("Want some advice? \n(doesnt matter if you do or don't you're getting some anyways)");
                Scanner p = new Scanner(System.in);
                p.nextLine();
                Randm.random();
            }
            else {
                if (name.equals("Caleb") || name.equals("caleb")) {
                    System.out.println("That's my name :)");
                }
                System.out.println("now a WHOLE number of your choice ranging from 1-5");
                Scanner p = new Scanner(System.in);
                String num = p.nextLine();
                int realNum = Integer.parseInt(num);
                Randm.phrase(realNum);
                int finalNum = name.length() * realNum;
                double sqrt = Math.sqrt(finalNum);
                if (sqrt % 1 == 0.0) {
                    System.out.println("ur final number is a perfect square, das cool ig??");
                }
                Randm arrow = new Randm();
                arrow.makeArrow(finalNum);
            }
        }
        else{
            System.out.println("Maybe next time...");
        }
    }
}
