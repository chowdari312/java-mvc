package mvs;
import java.util.*;
public class controller {
	Scanner obj = new Scanner(System.in);
     List<model> o = new ArrayList<model>();
     view v = new view();
     public void scan()
     {
    	 String title = obj.nextLine();
    	 String description = obj.nextLine();
    	 int level = obj.nextInt();
    	 o.add(new model(title, description, level));
     }
     public void disp()
     {
    	 v.display(o);
     }
     
      
}
