import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Reader reader = new Reader("Abdugani uulu Manasbek",1243233,"Filasofia", LocalDate.of(1995,8,26),221788717);
        System.out.println("Чтобы взять книги нажмите 1\nЧтобы вернуть книги нажмите 2");
    int a = new Scanner(System.in).nextInt();
        if (a==1){
            System.out.println("Введите количество книг который вы хотели взять");
            reader.takeBook(new Scanner(System.in).nextInt());
        } else if (a==2) {
            System.out.println("Введите количество книг который вы хотели вернуть");
            reader.returnBook(new Scanner(System.in).nextInt());
        }

    }
}