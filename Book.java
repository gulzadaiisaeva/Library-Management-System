
/**
 *
 * @author Gulzada IISAEVA 131044085
 */




public class Book{
   String Name;
   String Author;
   String PublishedDate;
   String State;
   /*constructors*/
   public Book(){
       Name="NoName";
       Author="NoName";
       PublishedDate="Empty";
       State="Not borrowed";

   }
   public Book(String name,String author,String pubDate){
       Name=name;
       Author=author;
       PublishedDate=pubDate;
   }

    /**
     * sets Author
     * @param author
     */
   public void setAuthor(String author){
       Author=author;
   }
    /**
     * sets name
     * @param name 
     */
   public void setName(String name){
       Name=name;
   }
   /**
     * sets state
     * @param state
     */
   public void setState(String state){
       State=state;
   }

    /**
     * sets PublishDate
     * @param date
     */
  
   public void setPublishDate(String date){
       PublishedDate=date;
   }

   /**
     * returns Author
     * @return 
     */
   public String getAuthor(){
       return Author;
   }
   /**
     * returns State
     * @return 
     */
   public String getState(){
       return State;
   }
   /**
     * returns name
     * @return 
     */
   public String getName(){
       return Name;
   }
   /**
     * returns PublishDate
     * @return 
     */
   public String getPublishDate(){
       return PublishedDate;
   }
   @Override
   public String toString(){
       String book="";
       book+="\nName : "+ Name;
       book+="\nAuthor : "+ Author;
       book+="\nPublshed date : "+ PublishedDate;
       book+="\nState : "+ State;
       return book;
   }
}
