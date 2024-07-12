public class HardCoverDecorator extends BookDecorator{
    public HardCoverDecorator(Book book) {
        super(book);
    }

    @Override
    public String decorateBook() {
        return super.decorateBook() + addHardover();
    }

    private String addHardover() {
        return "\n hard cover";
    }
}
