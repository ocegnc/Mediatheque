package mediatheque;

public class PrintCatalogVisitor implements ItemVisitor{

    public String visit(Book book){
        return book.toString();
    }

    public String visit(CD cd){
        return cd.toString();
    }

}