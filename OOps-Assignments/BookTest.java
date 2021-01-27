package day4prac;

import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {
		int id;
		String bookName,author,category;
		double price;
		Scanner sc=new Scanner(System.in);
		int choice;
		int i=0;
		Book blist[] = new Book[10];
		while (true) {
			
			System.out.println("Enter your choice");
			System.out.println("1.Add book");
			System.out.println("2.Show book details");
			System.out.println("3.Search Book Details");
			System.out.println("4.Update any book details");
			System.out.println("5.Delete book details");
			System.out.println("6.Exits");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter a book id");
				id=sc.nextInt();
				System.out.println("Enter a book name");
				bookName=sc.next();
				System.out.println("Enter a author name");
				author=sc.next();
				System.out.println("Enter a category");
				category=sc.next();
				System.out.println("Enter a price");
				price=sc.nextDouble();
				blist[i]=new Book(bookName, category,  author,id, price);
				i++;
				System.out.println("Book Added");
				
				break;
			case 2:
				System.out.println("BookDetails:");
				for(int j=0;j<i;j++)
				{
					if(blist[j]!=null)
					{
						System.out.println(blist[j]);
					}
				}
				break;
			case 3:
				System.out.println("Enter a book id to search a book");
				id=sc.nextInt();
				for(int j=0;j<i;j++)
				{
					if(blist[j]!=null && blist[j].getId()==id)
					{
						System.out.println(blist[j]);
					}
				}
				break;
			case 4:
				System.out.println("Enter a book id to update");
				id=sc.nextInt();
				for(int j=0;j<i;j++)
				{
					if(blist[j]!=null && blist[j].getId()==id)
					{
						System.out.println("Enter a book name to update");
						bookName=sc.next();
						blist[j].setBook_Name(bookName);
						System.out.println("Enter a author name");
						author=sc.next();
						blist[j].setAutor(author);
						System.out.println("Enter category to update");
						category=sc.next();
						blist[j].setCategory(category);
						System.out.println("Enter a price to update");
						price=sc.nextDouble();
						blist[j].setCost(price);
						
					}
				}
				break;
			case 5:
				System.out.println("Enter a bookId to delete");
				id=sc.nextInt();
				for(int j=0;j<i;j++)
				{
					if(blist[j]!=null && blist[j].getId()==id)
					{
						blist[j]=null;
					}
				}
				break;
			case 6:
				System.exit(0);
				break;
			default:
					System.out.println("Enter a valid input");
			}
		}
	}

}
