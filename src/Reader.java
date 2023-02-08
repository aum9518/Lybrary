import java.time.LocalDate;

public class Reader {
    String fullName;
    int lybraryCardNumber;
    String faculty;
    LocalDate dateOfBirth;
    int phoneNumber;

    public Reader(String fullName, int lybraryCardNumber, String faculty, LocalDate dateOfBirth, int phoneNumber) {
        this.fullName = fullName;
        this.lybraryCardNumber = lybraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int number){
        System.out.println(fullName+" взял "+ number+" книги");

    }
    public void returnBook(int num){
        System.out.println(fullName+" вернул "+ num+" книги");
    }
}
