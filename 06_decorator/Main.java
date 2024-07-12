public class Main {
    public static void main(String[] args) {
        Book book = new BookImpl();
        Book firstBook = new HardCoverDecorator(book);
        System.out.println("First " + firstBook.decorateBook() + "\n");

        Book secondBook = new HardCoverDecorator(new CoverIllustrationsDecorator(book));
        System.out.println("Second " + secondBook.decorateBook() + "\n");

        Book thirdBook = new HardCoverDecorator(new BookIllustrationDecorator(book));
        System.out.println("Third " + thirdBook.decorateBook() + "\n");

        Book fourthBook = new VolumeDecorator(new VolumeDecorator(book));
        System.out.println("Fourth " + fourthBook.decorateBook() + "\n");

    }
}
