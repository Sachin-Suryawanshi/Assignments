package storeutil;

import java.util.ArrayList;
import java.util.List;

import com.thinkitive.Book;

public class PrintUtil {
	
	public static void printRecords(List<Book> blist)
	{
		
		for(Book b:blist)
		{
			System.out.println(b);
		}
	}

}
