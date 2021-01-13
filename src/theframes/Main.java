package theframes;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> data=new ArrayList<String>();
		Book obj=new Book();
		System.out.println(obj.issueBook("4934930493949","01131182011"));
		/*data=obj.viewDetailsOfReturnBook("9442345563685");
		if(data.size()==1)
		{
			System.out.println(data.get(0));
		}
		else
		{
			for(int i=0; i<data.size(); i++)
			{
				System.out.println(data.get(i));
			}
		}*/
		
		
		//System.out.println(obj.returnBook("1231231421"));
	}

}
