package org.ghizlane;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Classe de filtrage : ");
        String nomFiltre = sc.nextLine();

        System.out.print("Classe de compression : ");
        String nomCompresseur = sc.nextLine();

        Filtre filtre = (Filtre) Class.forName(nomFiltre)
                .getDeclaredConstructor()
                .newInstance();

        Compresseur compresseur =
                (Compresseur) Class.forName(nomCompresseur)
                        .getDeclaredConstructor()
                        .newInstance();

        System.out.print("Valeurs de l'image : ");
        int[] image = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ImageFramework framework = new ImageFramework();
        framework.setFiltre(filtre);
        framework.setCompresseur(compresseur);

        System.out.println("Image filtrée : "
                + Arrays.toString(framework.filter(image)));

        System.out.println("Image compressée : "
                + Arrays.toString(framework.compresser(image)));

        sc.close();
    }
}