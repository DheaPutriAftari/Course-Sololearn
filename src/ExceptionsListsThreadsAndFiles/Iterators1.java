package ExceptionsListsThreadsAndFiles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Iterators1 {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    list.add(10);
    list.add(20);
    list.add(30);
    Iterator<Integer> it = list.iterator();
    it.next();
       System.out.println(it.next());
  }

}
