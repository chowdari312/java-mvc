package mvs;

import java.util.*;

public class view {

	public void display(List<model> k)
	{
	   for(model i : k)
	   {
		   System.out.println(i.getTitle());
		   System.out.println(i.getDescription());
		   System.out.println(i.getLevel());
	   }
	}
	
	
}

