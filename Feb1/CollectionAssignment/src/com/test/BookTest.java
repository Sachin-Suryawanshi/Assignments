package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.thinkitive.Book;

import storeutil.SortById;
import storeutil.SortByName;
import storeutil.SortByPrice;
import storeutil.SortUtils;
import storeutil.StroreUtil;

public class BookTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StroreUtil su=new StroreUtil();
		int id;
		String name;
		Set<String> authors;
		double price;
		Book b=new Book();
		while(true)
		{
		System.out.println("1.Add book");
		System.out.println("2.Number of books");
		System.out.println("3.Book List");
		System.out.println("4.Sorted book By name in ascending order");
		System.out.println("5.Print sorted list of books");
		System.out.println("6.sort book by list by price in ascending order");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter a book id");
			id=sc.nextInt();
			System.out.println("Enter a book name");
			name=sc.next();
			System.out.println("Enter no of authors");
			int num=sc.nextInt();
			authors=new HashSet<String>();
			for(int i=0;i<num;i++)
			{
			System.out.println("Enter a autor name");
			authors.add(sc.next());
			}
			System.out.println("Enter a price");
			price=sc.nextDouble();
			b=new Book(id, name, authors,price);
			su.addRecords(b);
			System.out.println("Book Added successfully");
			
			
			
			
			break;
		case 2:
			System.out.println("Number of books are");
			int noOfRecords=su.getNumOfRecords();
			System.out.println(noOfRecords);
			break;
		case 3:
			System.out.println("Book List:-");
			List<Book> blist=su.getRecords();
			for(Book bk:blist)
			{
				System.out.println(bk);
			}
			break;
		case 4:
			blist=su.getRecords();
			System.out.println("Sorted by bookname:");
			SortUtils.sortByName(blist);
			
			break;
		case 5:
			blist=su.getRecords();
			System.out.println("Sorted by Id");
			Collections.sort(blist,new SortById());
			for(Book bk:blist)
			{
				System.out.println(bk);
			}
			break;
		case 6:
			blist=su.getRecords();
			System.out.println("Sorted by price");
			SortUtils.sortByPrice(blist);
			break;
		}
		}
	}

}
