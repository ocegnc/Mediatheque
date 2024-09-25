package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem(new Book("Despentes", "King Kong Theorie"));
        mediatheque.addItem(new CD(12, "Dark Side of the Moon"));
        mediatheque.addItem( new CD(12, "Sergeant Peppers"));
        System.out.println("Voici tout le catalogue :");
        mediatheque.printCatalog();
        System.out.println("Voici tout les livres :");
        mediatheque.printOnlyBooks();
        System.out.println("Voici tout les cd :");
        mediatheque.printOnlyCDs();
    }
}
