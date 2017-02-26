
/**
 *an abstract class 
 * written with an idea of polymorphism
 * @author Gulzada IISAEVA 131044085
 */




public abstract class LibUsersAbstract implements LibUsersInterface{
    protected int ID;
    protected String NAME;
    protected int PASSWORD;
    
    /* constructors */
    public LibUsersAbstract(){
        this(0,"NoName",0);
    }
    public LibUsersAbstract(int id,String name,int password){
        ID=id;
        NAME=name;
        PASSWORD=password;
    }
    /**
     * returns name
     * @return 
     */
    @Override
    public String getName(){
        return NAME;
    }
     /**
     * sets name
     * @param name 
     */
    @Override
    public void setName(String name){
        NAME=name;
    }
    /**
     * returns id
     * @return 
     */
    @Override
    public int getID(){
        return ID;
    }
    
    
    /**
     * sets id
     * @param id 
     */
    @Override
    public void setID(int id){
        ID=id;
    }
    
   
    /**
     * sets password
     * @param password 
     */
    @Override
    public void setPassword(int password){
        PASSWORD=password;
    }
    
    /**
     * changes name
     * @param name 
     */
    @Override
    public void changeName(String name){
        setName(name);
    }
    @Override
    public void changePassword(int password){
        setPassword(password);
    }
    
    /**
     * compares the parameter user with this class
     * abstract class, written with the idea of polymorphism
     * @param aUser
     * @return if equals returns true,else returns false
     */
    abstract public boolean equals(LibUsersAbstract aUser);
}
