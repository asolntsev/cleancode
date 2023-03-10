package io.asolntsev.andmebaas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWriter {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\Solntsevy\\IdeaProjects\\spinogryz\\src\\andmebaas.txt"));
        Isik[] isikud = new Isik[16];
        int x = 0;
        while (scanner.hasNext()) {
            for (; x < isikud.length; x++) {
                String line = scanner.nextLine();
                String kuski[] = line.split(",");
                isikud[x] = new Isik();
                isikud[x].nimi = kuski[0];
                isikud[x].perekonnanimi = kuski[1];
                isikud[x].vanus = kuski[2];
                isikud[x].id = kuski[3];
                isikud[x].sugu = kuski[4];
            }
        }
        x = 0;
        System.out.println("Selles baasis on kogu Eestimaa rahvas. 16 inimese kohta on teada sellise info: nimi, perekonnaniki, vanus, id ja sugu");
        scanner = new Scanner(System.in);
        String sisestage = "a";
        for (; !sisestage.equals("v");) {
            do {
                if (x < isikud.length) {
                    System.out.println(x);
                    System.out.printf("%d. %s %s, vanus: %s, id: %s, sugu: %s\n", x + 1, isikud[x].nimi, isikud[x].perekonnanimi, isikud[x].vanus, isikud[x].id, isikud[x].sugu);
                }
                x++;
            } while (x%5 != 0);
            do {
                System.out.println("Sisestage\n“j”, et kuvada järgmist lehekülge\n“e”, et kuvada eelmist lehekülge\n“v”, et lõpetada programmi täitumist");
                sisestage = scanner.next();
                if (sisestage.equals("j")) {
                    if (x >= isikud.length) {
                        System.out.println("Järgmist lehekülge ei ole olemas. Palun sisestage “e” või “v”");
                        sisestage = "a";
                    }
                } else if (sisestage.equals("e")) {
                    if (x < 6) {
                        System.out.println("Eelmist lehekülge ei ole olemas. Palun sisestage “j” või “v”");
                        sisestage = "a";
                    } else {
                        x = x - 9;
                    }
                } else if (sisestage.equals("v")) {
                } else {
                    System.out.println("Vale nupp.\n");
                    sisestage = "a";
                }
            } while ((!sisestage.equals("j")) && (!sisestage.equals("e")) && (!sisestage.equals("v")));
        }

    }
}
