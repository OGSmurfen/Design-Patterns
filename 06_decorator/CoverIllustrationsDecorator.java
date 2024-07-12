public class CoverIllustrationsDecorator extends BookDecorator{
    public CoverIllustrationsDecorator(Book book) {
        super(book);
    }

    @Override
    public String decorateBook() {
        return super.decorateBook() + addCoverIllustrations();
    }

    private String addCoverIllustrations() {
        return "\ncover illustrations ";
    }
}
