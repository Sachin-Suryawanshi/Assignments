package day2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TeleDirectory {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<String,Long> clist=new LinkedHashMap<>();
		String name;
		long no;
		while(true)
		{
			System.out.println("1.Add Details");
			System.out.println("2.Show details");
			System.out.println("3.Search");
			System.out.println("4.Update");
			System.out.println("5.Delete");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter a name");
				name=sc.next();
				System.out.println("enter a number");
				no=sc.nextLong();
				clist.put(name, no);
				System.out.println("Added Successfully");
				break;
			case 2:
				System.out.println("Details:");
				Iterator<Entry<String,Long>> it=clist.entrySet().iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				break;
			case 3:
				System.out.println("Enter a name to serch");
				name=sc.next();
				for(Map.Entry<String, Long> en:clist.entrySet())
				{
					if(en.getKey().equals(name))
					{
						System.out.println(en);
					}
				}
				break;
			case 4:
				System.out.println("Enter a name to update");
				name=sc.next();
				System.out.println("Enter a number to update");
				no=sc.nextLong();
				for(Map.Entry<String, Long> en:clist.entrySet())
				{
					if(en.getKey().equals(name))
					{
						en.setValue(no);
					}
				}
				System.out.println("Updated successfully");
				break;
			case 5:
				System.out.println("Enter a name to delete");
				name=sc.next();
				clist.remove(name);
				System.out.println("Removed Successfully");
				break;
				
			}
		}
	}

}
