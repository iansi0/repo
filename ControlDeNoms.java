import java.util.Scanner;

public class ControlDeNoms {
    public static void main(String[] args) {   
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdueixi un nom (EXIT per tancar)");
        String name = scan.nextLine();
        boolean available = false;

        while(!name.equalsIgnoreCase("EXIT")){
            for (int i = 0; i < name.length(); i++) {
                if(name.charAt(i) != name.charAt(0)){
                    available = true;
                }
            }if(available){
                System.out.println(name + " és un name");
            }else{
                System.out.println(name + " NO és un name");     
            }
            System.out.println("Introdueixi un name (EXIT per tancar)");
            name = scan.nextLine();
            available = false;
        }
        System.out.println("Tancant...");
    }
}