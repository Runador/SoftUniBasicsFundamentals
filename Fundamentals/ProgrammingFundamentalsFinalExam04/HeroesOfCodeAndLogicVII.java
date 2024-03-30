package ProgrammingFundamentalsFinalExam04;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> heroHpMap = new LinkedHashMap<>();
        Map<String, Integer> heroMpMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] tokens = scanner.nextLine().split("\\s+");
            String heroName = tokens[0];
            int hp = Integer.parseInt(tokens[1]);
            int mp = Integer.parseInt(tokens[2]);

            if (hp >= 100) {
                hp = 100;
            }
            if (mp >= 200) {
                mp = 200;
            }

            heroHpMap.putIfAbsent(heroName, hp);
            heroMpMap.putIfAbsent(heroName, mp);
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] tokens = input.split(" - ");
            String command = tokens[0];
            String heroName = tokens[1];

            if (command.equals("CastSpell")) {

                int mpNeeded = Integer.parseInt(tokens[2]);
                String spellName = tokens[3];

                int mp = heroMpMap.get(heroName);

                if (mp >= mpNeeded) {

                    heroMpMap.put(heroName, mp - mpNeeded);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n",
                            heroName, spellName, heroMpMap.get(heroName));
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                }

            } else if (command.equals("TakeDamage")) {

                int damage = Integer.parseInt(tokens[2]);
                String attacker = tokens[3];

                int heroHP = heroHpMap.get(heroName);
                heroHP -= damage;

                heroHpMap.put(heroName, heroHP);

                if (heroHP > 0) {
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                            heroName, damage, attacker, heroHP);
                } else {
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                }

            } else if (command.equals("Recharge")) {

                int amount = Integer.parseInt(tokens[2]);
                int heroMP = heroMpMap.get(heroName);
                int reminder = Math.abs(200 - heroMP);

                heroMP += amount;

                if (heroMP > 200) {
                    heroMP = 200;
                }

                heroMpMap.put(heroName, heroMP);

                if (heroMP == 200) {
                    System.out.printf("%s recharged for %d MP!%n", heroName, reminder);
                } else {
                    System.out.printf("%s recharged for %d MP!%n", heroName, amount);
                }

            } else if (command.equals("Heal")) {

                int amount = Integer.parseInt(tokens[2]);
                int heroHP = heroHpMap.get(heroName);
                int reminder = Math.abs(100 - heroHP);

                heroHP += amount;

                if (heroHP > 100) {
                    heroHP = 100;
                }

                heroHpMap.put(heroName, heroHP);

                if (heroHP == 100) {
                    System.out.printf("%s healed for %d HP!%n", heroName, reminder);
                } else {
                    System.out.printf("%s healed for %d HP!%n", heroName, amount);
                }

            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> heroHpEntry : heroHpMap.entrySet()) {

            String heroName = heroHpEntry.getKey();
            int heroHP = heroHpEntry.getValue();
            int heroMP = heroMpMap.get(heroName);

            if (heroHP > 0) {
                System.out.println(heroName);
                System.out.printf("  HP: %d%n", heroHP);
                System.out.printf("  MP: %d%n", heroMP);
            }

        }

    }
}
