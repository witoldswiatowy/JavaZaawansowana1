package enumerated;

public enum Size {
    SMALL, MEDIUM(10), BIG(20);

    int maxWeight;

    Size() {
        System.out.println("Tworze egzemplarz enuma'a");
    }

    Size(int maxWeight) {
        this.maxWeight = maxWeight;
        System.out.println("Tworze egzemplarz enuma'a o wadze " + maxWeight);
    }

    public int getMaxWeight() {
        return maxWeight +2;
    }

}

