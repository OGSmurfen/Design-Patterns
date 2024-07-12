public class VolumeDecorator extends BookDecorator{
    public VolumeDecorator(Book book) {
        super(book);
    }

    @Override
    public String decorateBook() {
        return super.decorateBook() + addVolume();
    }

    private String addVolume() {
        return "\nmore than one volume";
    }
}
