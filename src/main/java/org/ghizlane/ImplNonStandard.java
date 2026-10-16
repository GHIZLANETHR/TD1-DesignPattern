package org.ghizlane;

public class ImplNonStandard {

    public int[] appliquerFiltre(String filterName, int[] data) {
        int[] resultat = new int[data.length];

        if (filterName.equalsIgnoreCase("negatif")) {
            for (int i = 0; i < data.length; i++) {
                resultat[i] = 255 - data[i];
            }
        } else {
            return data;
        }

        return resultat;
    }
}
