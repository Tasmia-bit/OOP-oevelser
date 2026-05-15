public class loan {
    private Book book;
    private Member member;

    public loan(Book book, Member member) {
        this.book = book;
        this.member = member;
    }

    @Override
    public String toString() {
        return "Book" + book + " and member " + member;
    }
}
