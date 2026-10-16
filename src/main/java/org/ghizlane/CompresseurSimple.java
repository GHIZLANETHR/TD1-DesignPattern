package org.ghizlane;

public class CompresseurSimple extends Compresseur {

    @Override
    protected int[] preparer(int[] data) {
        return data;
    }

    @Override
    protected int[] encoder(int[] data) {
        int[] resultat = new int[(data.length + 1) / 2];

        for (int i = 0; i < resultat.length; i++) {
            resultat[i] = data[i * 2];
        }

        return resultat;
    }

    @Override
    protected int[] finaliser(int[] data) {
        return data;
    }
}