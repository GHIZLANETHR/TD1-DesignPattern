package org.ghizlane;

public class ImageFramework {

    private Filtre filtre;
    private Compresseur compresseur;

    public void setFiltre(Filtre filtre) {
        this.filtre = filtre;
    }

    public void setCompresseur(Compresseur compresseur) {
        this.compresseur = compresseur;
    }

    public int[] filter(int[] data) {
        return filtre.filter(data);
    }

    public int[] compresser(int[] data) {
        return compresseur.compresser(data);
    }
}