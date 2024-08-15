package codeforces;

import java.util.*;

public class Dragons_230A {

    static class Dragon {
        int strength;
        int bonus;
        Dragon(int strength, int bonus) {
            this.strength = strength;
            this.bonus = bonus;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kiritoStrength = sc.nextInt();
        int dragons = sc.nextInt();

        List<Dragon> dragonList = new ArrayList<>();

        for (int i = 0; i < dragons; i++) {

            int dragonStrength = sc.nextInt();
            int bonus = sc.nextInt();

            dragonList.add(new Dragon(dragonStrength, bonus));
        }

        Collections.sort(dragonList, new Comparator<Dragon>() {
            @Override
            public int compare(Dragon o1, Dragon o2) {
                return o1.strength - o2.strength;
            }
        });

        for (Dragon d : dragonList) {
            if (kiritoStrength > d.strength) {
                kiritoStrength += d.bonus;
            }
            else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}