package org.ghizlane;

public abstract class Compresseur {

    public final int[] compresser(int[] data) {
        int[] prepare = preparer(data);
        int[] resultat = encoder(prepare);
        return finaliser(resultat);
    }

    protected abstract int[] preparer(int[] data);

    protected abstract int[] encoder(int[] data);

    protected abstract int[] finaliser(int[] data);
}