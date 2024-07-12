// Some code
package main;
public class Book {
    private String isbn;
    private String title;
    private String author;
    private int publishingYear;
    private String genre;
    private String annotation;
    private int pages;
    private double price;

    // Private constructor to be used only by the Builder
    private Book() {

    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static class Builder {
        private String isbn;
        private String title;
        private String author;
        private int publishingYear;
        private String genre;
        private String annotation;
        private int pages;
        private double price;
        public Builder (String isbn, String title, String author) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
        }
        public Builder withPublishingYear(int publishingYear) {
            this.publishingYear = publishingYear;
            return this;
        }
        public Builder withGenre(String genre) {
            this.genre = genre;
            return this;
        }
        public Builder withAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public Builder withPages(int pages) {
            this.pages = pages;
            return this;
        }
        public Builder withPrice(double price) {
            this.price = price;
            return this;
        }
        public Book build() {
            Book book = new Book();
            book.setIsbn(isbn);
            book.setTitle(title);

            return book;
        }

    }

}