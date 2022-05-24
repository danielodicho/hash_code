public class Person extends Object
  {
    String fn;
    String ln;
    int by;
    
    public Person(String fn, String ln, int by)
    {
      this.fn = fn;
      this.ln =ln;
      this.by = by;
    }

    @Override
    public String toString(){
      return fn + " " +  ln + " " + "(b. " + String.valueOf(by)+ ")";
    }

   
      @Override
      public int hashCode(){
        String hcode = "";
        hcode += String.valueOf(by);
          
          String up1 = fn.toUpperCase();
          if ((int)up1.charAt(0)-64 <= 9){
            hcode+= "0" +String.valueOf((int)up1.charAt(0)-64);
          }
          else{
            hcode+= String.valueOf((int)up1.charAt(0)-64);
          }
        String up = ln.toUpperCase();
        if ((int)up.charAt(0)-64 <= 9){
            hcode+= "0" + String.valueOf((int)up.charAt(0)-64);
          }
          else{
            hcode+= String.valueOf((int)up.charAt(0)-64);
          }
         if ((int)up.charAt(1)-64 <= 9){
            hcode+= "0" + String.valueOf((int)up.charAt(1)-64);
          }
          else{
            hcode+= String.valueOf((int)up.charAt(1)-64);
          }

        return Integer.valueOf(hcode);
      }


     @Override
    public boolean equals(Object x){
      Person y = (Person)x;

      if (y.hashCode() != this.hashCode()) return false;
      else return true;
      
    }
    }
  