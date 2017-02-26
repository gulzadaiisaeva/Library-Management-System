
import java.util.ArrayList;

/**
 *
 * @author Gulzada IISAEVA 131044085
 */
public class Staff extends LibUsersAbstract{
    private ArrayList<Student> myStudents=new ArrayList<Student>();
    public static ArrayList<Book> myBooks=new ArrayList<Book>();
    /**
    * no parameter constructor
    */
    public Staff(){
        super();
        
    }

     /**
    * three parameter constructor
    * @param id
    * @param name
    * @param password 
    */
    public Staff(int id,String name,int password){
        super(id,name,password);
        
    }
    /**
     * returns Students
     * @return 
     */
    public ArrayList<Student> getAllStudents(){
        return myStudents;
    }
    /**
     * returns Students
     * @return 
     */
    public Student getStudent(Student aStudent){
        Student obje= new Student();
        for(int i=0;i<myStudents.size();++i){
            if(myStudents.get(i).equals(aStudent))
                obje=myStudents.get(i);
         }
         return obje;
    }
     /**
     * returns BookSize
     * @return 
     */
    public Integer getBooksSize(){
        return myBooks.size();
    }
      /**
     * returns Books
     * @return 
     */
    public ArrayList<Book> getBooks(){
        return myBooks;
    }
     /**
     * adds a student to the system
     * @param aStudent
     * @return 
     */
    public boolean addStudent(Student aStudent){
        if(myStudents.isEmpty()){
            myStudents.add(aStudent);
            return true;
        }
        else{
            for(int i=0;i<myStudents.size();++i){
                if(myStudents.get(i).equals(aStudent))
                    return false;
            }
            myStudents.add(aStudent);
            return true;
        }
 
    }
     /**
         * removes a student from the system
         * @param aStudent
         * @return 
         */
    public boolean removeStudent(Student aStudent){
        if(myStudents.isEmpty()){
            return false;
        }
        else{
            for(int i=0;i<myStudents.size();++i){
                if(myStudents.get(i).equals(aStudent)){
                    myStudents.remove(i);
                    return true;
                }   
            }
            return false;
        }
    }
    /**
     * adds a book to the system
     * @param aBook
     * @return 
     */
    public boolean addBook(Book aBook){
        if(myBooks.isEmpty()){
            myBooks.add(aBook);
            return true;
        }
        else{
            for(int i=0;i<myBooks.size();++i){
                if(myBooks.get(i).equals(aBook))
                    return false;
            }
            myBooks.add(aBook);
            return true;
        }
 
    }
     /**
         * removes a book from the system
         * @param aBook
         * @return 
         */
    public boolean removeBook(Book aBook){
        if(myBooks.isEmpty()){
            return false;
        }
        else{
            for(int i=0;i<myBooks.size();++i){
                if(myBooks.get(i).equals(aBook)){
                    myBooks.remove(i);
                    return true;
                }   
            }
            return false;
        }
    }
    
      /**
         *Override toString method
         * @return a string including name and id
         */
    @Override
    public String toString(){
        String temp="Name: "+NAME+"\nID: "+ID;
        return temp;
    }
    
    /**
         * implemented equals abstract method
         * written with the idea of polymorphism
         * includes try-catch exception handling
         * @param aStaff
         * @return 
         */
    @Override
    public boolean equals(LibUsersAbstract aStaff){
        if(aStaff == this ) return true;
        if(aStaff ==null ) return false;
        boolean test=false;
        /*exeption handling using try-catch method*/
        try{
            Staff temp=(Staff)aStaff;
            if(ID==temp.getID()){
                test=true;
            }
        }
        catch(ClassCastException E){
            System.out.println("Wrong input for this(equals) method!");
            test=false;
        }   
        return test;
    }
}
