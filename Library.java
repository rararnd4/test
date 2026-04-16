class Person {
  String name;
}

interface Borrowable {
  void borrow();
}

class BorrowRecord { }

class Book {
  void open() {
    System.out.println("책을 펼칩니다!");
  }
}

class Member extends Person implements Borrowable {
  private BorrowRecord record;

  public Member() {
        this.record = new BorrowRecord();
  }

  public void borrow()
  {
    System.out.println("대출 규칙에 따라 책을 빌립니다!");
  }

  public void read(Book book) {
    System.out.println("책을 읽습니다!");
    book.open();
  }
}
