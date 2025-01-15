class Medicament {
    private String nume;
    private double pret;
    private String boala;

    public Medicament(String nume, double pret, String regiuneOrigine) {
        this.nume = nume;
        this.pret = pret;
        this.boala = regiuneOrigine;
    }

    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }
    public double getPret() { return pret; }
    public void setPret(double pret) { this.pret = pret; }
    public String getBoala() { return boala; }
    public void setBoala(String boala) { this.boala = boala; }

    @Override
    public String toString() {
        return "Produs: " + nume + ", Pret: " + pret + ", Regiune: " + boala;
    }
}