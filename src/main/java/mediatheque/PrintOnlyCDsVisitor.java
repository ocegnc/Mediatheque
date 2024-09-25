package mediatheque;

public class PrintOnlyCDsVisitor extends PrintCatalogVisitor {

    public String visit(Book book){
        return "";
    }
}