package org.ghizlane;

public class AdaptateurFiltre implements Filtre {

    private ImplNonStandard ancien = new ImplNonStandard();

    @Override
    public int[] filter(int[] data) {
        return ancien.appliquerFiltre("negatif", data);
    }
}
