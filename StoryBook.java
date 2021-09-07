//Md.Shafiul Haque 

package storybook;

public abstract class StoryBook {

    private String BookName;
    private String AutherName;
    public String setBookName(String b)
    {
        BookName = b;
        return b;
    }
    public String getBookName()
    {
        return BookName;
    }
    public String setAutherName(String a)
    {
        AutherName = a;
        return a;
    }
    public String getAutherName()
    {
        return AutherName;
    }
    abstract void originOfStory();
   
}
class Fiction extends StoryBook {
         
     @Override
       void originOfStory()
      {
          //String s1 = "Math";
          System.out.println("Imaginary");
          //return s1;
      }
}
class NonFiction extends StoryBook {
        
     @Override
     void originOfStory()
     {
         // s2 = "Dipu Number 2";
         System.out.println("True");
         //return s2;
     }
}
class main{
     
        public static void main(String[] args) {
       
        StoryBook f1 = new Fiction();
        StoryBook f2 = new NonFiction();
        f1.setBookName("debi");
        f1.setAutherName("Humayun Ahmed");
        String s2 = f1.getAutherName();
        f2.setBookName("Dipu Number 2");
        String s3 = f2.getBookName();
        f2.setAutherName("Jafor Iqbal");
        String s4 = f2.getAutherName();
        f1.originOfStory();
        f2.originOfStory();
        
    }
    
}
