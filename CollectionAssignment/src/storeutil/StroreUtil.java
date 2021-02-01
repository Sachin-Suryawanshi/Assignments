package storeutil;

import java.util.ArrayList;
import java.util.List;

import com.thinkitive.Book;

public class StroreUtil {
	List<Book> blist=new ArrayList<Book>();
	public void addRecords(Book b)
	{
		blist.add(b);
	}
	public List<Book> getRecords()
	{
		
		return blist;
	}
	public int getNumOfRecords()
	{
		return blist.size();
	}

}
