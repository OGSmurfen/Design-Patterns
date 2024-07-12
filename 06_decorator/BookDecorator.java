public abstract class BookDecorator implements Book {
    private Book book;
    public BookDecorator(Book book){
        this.book = book;
    }

    @Override
    public String decorateBook() {
        return book.decorateBook();
    }
}
