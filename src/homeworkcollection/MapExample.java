package homeworkcollection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        FootballTeamMember teamMember = new FootballTeamMember(1, "Эдуарду");
        FootballTeamMember teamMember2 = new FootballTeamMember(2, "Бруну Алвеш");
        FootballTeamMember teamMember3 = new FootballTeamMember(3, "Паулу Феррейра");

        List<FootballTeamMember> list = new ArrayList<>();
        list.add(teamMember);
        list.add(teamMember2);
        list.add(teamMember3);

        Map<Integer, String> footballTeam = createFootballTeam(list);
        printAllMemberNames(footballTeam);
        printAllMembers(footballTeam);

    }


    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {
        Map<Integer, String> maps = new LinkedHashMap<>();
        for (FootballTeamMember player : members) {
            maps.put(player.getNumber(), player.getName());
        }
        return maps;
    }

    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        for (Integer integer : memberMap.keySet()) {
            System.out.println(memberMap.get(integer));
        }
    }

    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {
        for (Integer integer : memberMap.keySet()) {
            System.out.println(integer + " - " + memberMap.get(integer));
        }
    }

    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
