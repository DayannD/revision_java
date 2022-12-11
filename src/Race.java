public enum Race {
    HUMAIN(18),
    TOGRUTA(3),
    KLACKONS(6),
    KLINGON(12),
    EPSILON(24),
    BORON(48),
    DESHAYES_DAYANN(96),
    ;

    public int ageAdulte;
    Race(int ageAdulte) {
        this.ageAdulte = ageAdulte;
    }
}
