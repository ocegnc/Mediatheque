package mediatheque;

public class PrintOnlyBooksVisitor extends PrintCatalogVisitor{

    public String visit(CD cd){
        return "";
    }

}