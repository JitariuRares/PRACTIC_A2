import java.util.ArrayList;
import java.util.List;

class ProdusController {
    private List<Medicament> medicamente = new ArrayList<>();

    public void adaugaProdus(Medicament produs) {
        medicamente.add(produs);
    }

    public void editeazaProdus(int index, Medicament produsNou) {
        if (index >= 0 && index < medicamente.size()) {
            medicamente.set(index, produsNou);
        } else {
            System.out.println("Index invalid!");
        }
    }

    public void stergeProdus(int index) {
        if (index >= 0 && index < medicamente.size()) {
            medicamente.remove(index);
        } else {
            System.out.println("Index invalid!");
        }
    }

    public void afiseazaProduse() {
        if (medicamente.isEmpty()) {
            System.out.println("Nu exista produse.");
        } else {
            for (int i = 0; i < medicamente.size(); i++) {
                System.out.println((i + 1) + ". " + medicamente.get(i));
            }
        }
    }
}