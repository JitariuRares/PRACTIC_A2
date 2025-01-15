import java.util.Scanner;

class ProdusView {
    private Scanner scanner = new Scanner(System.in);
    private ProdusController controller = new ProdusController();

    public void start() {
        boolean ruleaza = true;
        while (ruleaza) {
            afiseazaMeniu();
            int optiune = scanner.nextInt();
            scanner.nextLine();

            switch (optiune) {
                case 1 -> adaugaProdus();
                case 2 -> editeazaProdus();
                case 3 -> stergeProdus();
                case 4 -> controller.afiseazaProduse();
                case 5 -> ruleaza = false;
                default -> System.out.println("Optiune invalida!");
            }
        }
    }

    private void afiseazaMeniu() {
        System.out.println("\n--- Meniu ---");
        System.out.println("1. Adauga produs");
        System.out.println("2. Editeaza produs");
        System.out.println("3. Sterge produs");
        System.out.println("4. Afiseaza produse");
        System.out.println("5. Iesire");
        System.out.print("Alege o optiune: ");
    }

    private void adaugaProdus() {
        System.out.print("Nume produs: ");
        String nume = scanner.nextLine();
        System.out.print("Pret: ");
        double pret = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Regiune de origine: ");
        String regiune = scanner.nextLine();
        controller.adaugaProdus(new Medicament(nume, pret, regiune));
    }

    private void editeazaProdus() {
        controller.afiseazaProduse();
        System.out.print("Indexul produsului de editat: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        System.out.print("Nume nou: ");
        String numeNou = scanner.nextLine();
        System.out.print("Pret nou: ");
        double pretNou = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Regiune noua: ");
        String regiuneNoua = scanner.nextLine();
        controller.editeazaProdus(index, new Medicament(numeNou, pretNou, regiuneNoua));
    }

    private void stergeProdus() {
        controller.afiseazaProduse();
        System.out.print("Indexul produsului de sters: ");
        int index = scanner.nextInt() - 1;
        controller.stergeProdus(index);
    }
}