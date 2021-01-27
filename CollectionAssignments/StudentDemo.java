package day2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String grades;
		HashMap<String,Integer> hm=new HashMap<>();
		LinkedHashMap glist=new LinkedHashMap();
		System.out.println("ENter student name and marks");
		for(int i=0;i<5;i++)
		{
			hm.put(sc.next(), sc.nextInt());
		}
		Iterator<Entry<String,Integer>>it=hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<String ,Integer> mp=it.next();
			if(mp.getValue()>40)
				
			{
				grades="pass";
			}
			else
			{
				grades="Fail";
			}
			glist.put(mp.getKey(), grades);
		}
		System.out.println(glist);
	}

}
