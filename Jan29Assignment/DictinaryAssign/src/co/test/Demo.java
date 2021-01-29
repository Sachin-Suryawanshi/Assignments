package co.test;

import java.util.List;

import com.dao.DictionaryDao;
import com.model.Dictionary;

public class Demo {
	public static void main(String[] args) {
		DictionaryDao ddao=new DictionaryDao();
//		Dictionary d=new Dictionary("abc","xyz");
//		ddao.addWord(d);
//		System.out.println("Added successfully");
		Dictionary d=ddao.searchWord("abc");
	
	     System.out.println(d);
//		List dlist=ddao.getDictionary();
//		System.out.println(dlist);
	}

}
