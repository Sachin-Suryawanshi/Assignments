package com.thinkitive.test;

import java.util.List;

import com.thinkitive.dao.DictionaryDao;
import com.thinkitive.model.Dictionary;

public class DictionaryTest {
	public static void main(String[] args) {
		DictionaryDao ddao=new DictionaryDao();
//		Dictionary dt=new Dictionary("Abc","daddf");
//		ddao.insertWord(dt);
//		System.out.println("Added successfully");
//		List<Dictionary> dlist=ddao.getall();
//		System.out.println(dlist);
		Dictionary d=ddao.searchDictionary("Abc");
		System.out.println(d);
		
	}

}
