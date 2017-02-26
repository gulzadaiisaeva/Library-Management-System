
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author Gulada IISAEVA 131044085
 */
public class Student extends LibUsersAbstract{
    protected ArrayList<Book> myBarrowBooks=new ArrayList<Book>();
    //private Book myBooks;
    /**
     * no parameter constructor
     */
    public Student(){
        super();
    }
    /**
    * three parameter constructor
    * @param id
    * @param name
    * @param password 
    */
    public Student(int id,String name,int password){
        super(id,name,password);
    }
    public Student(int id,String name,int password,Book aBook){
        super(id,name,password);
        myBarrowBooks.add(aBook);
    }

    /**
     * Barrow a Book
     * @param aBook
     * @return
     */

    public boolean barrowBook(Book aBook){
        for(int i=0;i<Staff.myBooks.size();++i){
            if(!(Staff.myBooks.get(i).equals(aBook))) {
                if(!(Staff.myBooks.get(Staff.myBooks.indexOf(aBook)).getState().equals("Borrowed")) )
                return false;
                 }
        }
        myBarrowBooks.add(aBook);
        //System.out.println("Yeeeeees\n");
        Staff.myBooks.get(Staff.myBooks.indexOf(aBook)).setState("Borrowed");
        myBarrowBooks.get(myBarrowBooks.indexOf(aBook)).setState("Borrowed");
        return true;
        
 
    }

    /**
     * Return a Book
     * @param aBook
     * @return
     */
    public boolean returnBook(Book aBook){
        if(myBarrowBooks.isEmpty()){
            return false;
        }
        else{
            for(int i=0;i<myBarrowBooks.size();++i){
                if(myBarrowBooks.get(i).equals(aBook)){
                    myBarrowBooks.remove(i);
                    Staff.myBooks.get(Staff.myBooks.indexOf(aBook)).setState("null");
                    return true;
                }   
            }
            return false;
        }
    }
   
    public ArrayList<Book> getBooks(){
        return myBarrowBooks;
    }

    /**
     * implemented equals abstract method
     * written with the idea of polymorphism
     * includes try-catch exception handling
     * @param aUser
     * @return
     */
    @Override
    public boolean equals(LibUsersAbstract aUser){
        /*exeption handling using try-catch method*/
        try{
            Student temp=(Student)aUser;
            return ID==temp.getID();
        }
        catch(ClassCastException E){
            System.out.println("Wrong input for this(equals) method!, input is"
                    + "not a student");
            return false;
        }
    }
    /**
         *Override toString method
         * @return a string including name and id
         */
    @Override
    public String toString(){
        String temp="ID: "+ID;
        temp+="\nName: "+NAME;
        
        return temp;
    }
    
}
