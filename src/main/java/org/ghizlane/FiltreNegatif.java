package org.ghizlane;

public class FiltreNegatif implements Filtre {

    @Override
    public int[] filter(int[] data) {
        int[] resultat = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            resultat[i] = 255 - data[i];
        }

        return resultat;
    }
}