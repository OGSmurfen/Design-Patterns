public class BookIllustrationDecorator extends BookDecorator{
    public BookIllustrationDecorator(Book book) {
        super(book);
    }

    @Override
    public String decorateBook() {
        return super.decorateBook() + addBookIllustrations();
    }

    private String addBookIllustrations() {
        return "\n book illustrations";
    }
}
