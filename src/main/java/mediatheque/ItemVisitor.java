package mediatheque;

public interface ItemVisitor{
    String visit(Book book);
    String visit(CD cd);
}