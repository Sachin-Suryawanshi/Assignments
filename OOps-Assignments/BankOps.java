package day1;

import java.util.Scanner;

public class BankOps {
	public static void main(String[] args) {
		BankAccount b[] = new BankAccount[5];
		int i = 0;
		int ch;
		int num;
		double bal;
		String name;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter your choice");
			System.out.println("1.Add");
			System.out.println("2.Update");
			System.out.println("3.Show");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter a name");
				name = sc.next();
				System.out.println("Enter a account number");
				num = sc.nextInt();
				System.out.println("Enter a balance");
				bal = sc.nextDouble();
				b[i] = new BankAccount(num, name, bal);
				i++;

				break;
			case 2:
				System.out.println("Enter a account number to update");
				num = sc.nextInt();
				System.out.println("Enter a name to update");
				name = sc.next();
				System.out.println("Enter a balance to update");
				bal = sc.nextDouble();
				for (int j = 0; j < i; j++) {
					if (b[j].account_Number == num) {
						b[j].setName(name);
						b[j].setBalanace(bal);
					}
				}

				break;
			case 3:
				System.out.println("Bank AccountDetails:");
				for (int j = 0; j < i; j++) {
					if (b[j] != null) {
						System.out.println(b[j]);
					}
				}
				break;
			case 4:
				System.out.println("Enter account Number to delete");
				num=sc.nextInt();
				for(int j=0;j<i;j++)
				{
					if(b[j].account_Number==num)
					{
						b[j]=null;
						i--;
					}
				}
				break;
			}
		}

	}
}
