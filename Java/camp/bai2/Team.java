
import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Team {


    public ArrayList<Player> buildTeam(int defender, int midFielder, int forwarder){
        Scanner sc = new Scanner(System.in);
        List<Player> list= new ArrayList<Player>();
        list.add(new Player("Marc-André ter Stegen", Player.Position.GK,1));
        list.add(new Player("Sergiño Dest", Player.Position.DF,2));
        list.add(new Player("Gerard Piqué", Player.Position.DF,3));
        list.add(new Player("Ronald Araújo", Player.Position.DF,4));
        list.add(new Player("Sergio Busquets", Player.Position.MF,5));
        list.add(new Player("Antoine Griezmann", Player.Position.FW,6));
        list.add(new Player("Miralem Pjanić", Player.Position.MF,7));
        list.add(new Player("Martin Braithwaite", Player.Position.FW,8));
        list.add(new Player("Lionel Messi", Player.Position.FW,9));
        list.add(new Player("Ousmane Dembélé", Player.Position.FW,10));
        list.add(new Player("Riqui Puig", Player.Position.MF,11));
        list.add(new Player("Neto", Player.Position.GK,12));
        list.add(new Player("Clément Lenglet", Player.Position.DF,13));
        list.add(new Player("Pedri ", Player.Position.MF,14));
        list.add(new Player("Francisco Trincão", Player.Position.FW,15));
        list.add(new Player("Jordi Alba", Player.Position.DF,16));
        list.add(new Player("Matheus Fernandes", Player.Position.MF,17));
        list.add(new Player("Sergi Roberto", Player.Position.DF,18));
        list.add(new Player("Frenkie de Jong", Player.Position.MF,19));
        list.add(new Player("Ansu Fati", Player.Position.FW,20));
        list.add(new Player("Samuel Umtiti ", Player.Position.DF,21));
        list.add(new Player("Junior Firpo ", Player.Position.DF,22));
        Random ran = new Random();
        ArrayList<Player> player = new ArrayList<>();
        int goalkeeperSize = 0;
        int defenderSize =0 ;
        int midfieldSize =0;
        int forwarderSize = 0;
        boolean run = true;
        while (run){
            System.out.println("List player:");
            while (goalkeeperSize<1){
                int ranGoalkeeper = ran.nextInt(22);
                if(list.get(ranGoalkeeper).getPosition().equals(Player.Position.GK)){
                    player.add(list.get(ranGoalkeeper));
                    goalkeeperSize++;
                }

            }
            while (defenderSize<4){
                int ranDefender = ran.nextInt(22);
                if(list.get(ranDefender).getPosition().equals(Player.Position.DF)&& !player.contains(list.get(ranDefender))){
                    player.add(list.get(ranDefender));
                    defenderSize++;

                }
            }
            while (midfieldSize<4){
                int ranMidfield = ran.nextInt(22);
                if(list.get(ranMidfield).getPosition().equals(Player.Position.MF)&& !player.contains(list.get(ranMidfield))){
                    player.add(list.get(ranMidfield));
                    midfieldSize++;
                }
            }
            while (forwarderSize<2){
                int ranForwader = ran.nextInt(22);
                if(list.get(ranForwader).getPosition().equals(Player.Position.FW) && !player.contains(list.get(ranForwader))){
                    player.add(list.get(ranForwader));
                    forwarderSize++;
                }
            }
            player.forEach(System.out::println);
            System.out.println("\nDo you want to see another option? Type Y or N: ");
            String answer = sc.nextLine();
            if (answer.toUpperCase().equals("Y")) {
                run = true;
            } else {
                run = false;
            }
        }
        return player;
    }



}
