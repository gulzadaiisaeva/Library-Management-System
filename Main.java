
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *main class
 * @author Gulzada IISAEVA 131044085
 */
public class Main {
    /**
     * main method
     * @param args 
     */
    public static void main(String[] args) {
        

        /**
         * testing this course automation system
         */
        Staff admin=new Staff(252,"Gulzada IIsaeva",2356);
        System.out.println("/***************ADMIN ********************\n Admin Name->  "+ admin.getName());
        System.out.println("/***************Students******************\n" );
        /*register Students*/
        Student student1=new Student(1200,"Ali Kaya",01234);
        admin.addStudent(student1);
       	Student student2=new Student(12775,"Sena Turkmen",01234);
       	admin.addStudent(student2);
        Student student3=new Student(182775,"Ayse Demirci",017234);
        admin.addStudent(student3);


       	ArrayList<Student> students=admin.getAllStudents();

        /*print students*/
        ListIterator<Student> iter1= students.listIterator();
        while(iter1.hasNext()){
            System.out.print(iter1.next()+"\n");
        }
        System.out.println("/****************************************\n" );
        admin.removeStudent(student2);
        System.out.print("*******After removing student 2********\n");
        
        ListIterator<Student> iter2= students.listIterator();
        while(iter2.hasNext()){
            System.out.print(iter2.next()+"\n");
        }
        System.out.println("/****************************************\n" );
        /*Books*/
        Book book1=new Book("Data Structures and Algorithm", "Elliot B.Koffman","2009");
        admin.addBook(book1);
        Book book2=new Book("Absolute C++","Walter Savitch","2010");
        admin.addBook(book2);
        Book book3=new Book("Absolute Java","Walter Savitch","2012");


        ArrayList<Book> books=admin.getBooks();
        System.out.println("/***************BOOKS ********************\n" );
        System.out.println("State <Borrowed > and <null>\n" );
        ListIterator<Book> iter3= books.listIterator();
        while(iter3.hasNext()){
            System.out.print(iter3.next()+"\n");
        }
        System.out.println("/****************************************\n" );
        System.out.print("*******After removing book 1********\n");
        admin.removeBook(book1);

        ListIterator<Book> iter4= books.listIterator();
        while(iter4.hasNext()){
            System.out.print(iter4.next()+"\n");
        } 
        System.out.println("/****************************************\n" );

        
        System.out.println("/**********After borrowing ***************\n" );
        admin.getStudent(student1).barrowBook(book2);
        ListIterator<Book> iter6= books.listIterator();
        while(iter6.hasNext()){
            System.out.print(iter6.next()+"\n");
        }
     
        admin.getStudent(student1).returnBook(book2);
        System.out.println("/**********After returning ***************\n" );
        admin.getStudent(student1).returnBook(book2);

        ListIterator<Book> iter7= books.listIterator();
        while(iter7.hasNext()){
            System.out.print(iter7.next()+"\n");
        }
     
         


    }
}
