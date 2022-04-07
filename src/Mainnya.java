import java.util.Scanner;

public class Mainnya {
    public static void main(String[] args) throws Exception {
        
        Wounded player = new Wounded();
        HpUser dian = new HpUser(player);

      
        dian.Attack();
        
        
        Scanner input = new Scanner(System.in);
        String aksi; 

        while (true) {
            System.out.println("=== HITPOINT INTERFACE ===");
            System.out.println("[1] ATTACK");
            System.out.println("[2] HEAL");
            System.out.println("[3] ThrowGranade");
            System.out.println("[4] UseMedkit");
            System.out.println("[0] Exit");
            System.out.println("--------------------------");
            System.out.print("Choose Action Woy > ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                dian.GranadeDamage();
            } else if (aksi.equalsIgnoreCase("2")){
                dian.Healing();
            } else if (aksi.equalsIgnoreCase("3")){
                dian.Attack();
            } else if (aksi.equalsIgnoreCase("4")){
                dian.Medkitheal();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    }
}
