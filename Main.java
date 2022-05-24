import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    ArrayList<Person> prezList = new ArrayList<Person>();
    Scanner in = new Scanner(Main.class.getResourceAsStream("data.txt"));
    
    while (in.hasNext())
    {
      String name1 = in.next(), name2 = in.next(), year = in.next();
      Person p = new Person(name1, name2, Integer.valueOf(year));
      prezList.add(p);
    }

    System.out.println(prezList);

    for (int m = 0; m < prezList.size(); m++)
    {
      Person a = prezList.get(m);
      for (int n = m; n < prezList.size(); n++)
      {
        Person b = prezList.get(n);
        System.out.println(a+ " equals "+b+"?   "+a.equals(b));
      }
      System.out.println();       
    }

    for (Person p : prezList)
    {
      System.out.printf("%35s   hash code: "+p.hashCode()+"\n", p);
    }

    
  }

//   Map<Integer, String> map1 = Map.of();
//   Map<Integer,String> map1 = TreeMap.of(1, "A", 2, "B", 3, "C");
// System.out.print(map1);
  
}