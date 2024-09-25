package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();
	private final PrintCatalogVisitor visitorCatalog = new PrintCatalogVisitor();
	private final PrintOnlyBooksVisitor visitorBook = new PrintOnlyBooksVisitor();
	private final PrintOnlyCDsVisitor visitorCD = new PrintOnlyCDsVisitor();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items) {
			System.out.println(i.accept(visitorCatalog));
		}
	}
	
	public void printOnlyBooks() {		
		for (Item i : items){
				System.out.println(i.accept(visitorBook));
		}
	}

	public void printOnlyCDs() {
		for (Item i : items){
			System.out.println(i.accept(visitorCD));
		}
	}

}
