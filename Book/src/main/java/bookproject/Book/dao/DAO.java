package bookproject.Book.dao;

public interface DAO {
	// void createTable();
void insertRecord(int bookId, String bookName, String author, String description, String bookUrl, double price);
void updateRecord(int bookId, String bookName, String author, String description, String bookUrl, double price);
void deleteRecord(int bookId);
void displayAll();
void searchRecordByItsPrice(double price);
}
