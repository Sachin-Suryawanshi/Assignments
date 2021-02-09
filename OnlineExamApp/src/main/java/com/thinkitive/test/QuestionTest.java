package com.thinkitive.test;

import java.util.List;
import java.util.Scanner;

import com.thinkitive.dao.QuestionDao;
import com.thinkitive.model.Question;
import com.thinkitive.model.RegisteredUsers;

public class QuestionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Question qu = new Question();
		QuestionDao qdao = new QuestionDao();
		while (true) {
			System.out.println("1.Add Question");
			System.out.println("2.Update Question");
			System.out.println("3.Delete Question");
			System.out.println("4.Search a question");
			System.out.println("5.Show All questions");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter a question");
				String q = sc.next();
				System.out.println("Enter a opt1");
				String op1 = sc.next();
				System.out.println("Enter a opt2");
				String op2 = sc.next();
				System.out.println("Enter a opt3");
				String op3 = sc.next();
				System.out.println("Enter a opt4");
				String op4 = sc.next();
				System.out.println("Enter a correct");
				String correct = sc.next();
				qu.setQuestion(q);
				qu.setOp1(op1);
				qu.setOp2(op2);
				qu.setOp3(op3);
				qu.setOp4(op4);
				qu.setCorrectAnswer(correct);
				qdao.addQuestion(qu);
				System.out.println("Added Successfully");
				break;
			case 2:
				System.out.println("Enter a question id to update");
				int id = sc.nextInt();
				System.out.println("Enter a question to update");
				q = sc.next();
				System.out.println("Enter a opt1 to update");
				op1 = sc.next();
				System.out.println("Enter a opt2 to update");
				op2 = sc.next();
				System.out.println("Enter a opt3 to update");
				op3 = sc.next();
				System.out.println("Enter a opt4 to update");
				op4 = sc.next();
				System.out.println("Enter a correct answer to update");
				correct = sc.next();
				qu.setQuestion(q);
				qu.setOp1(op1);
				qu.setOp2(op2);
				qu.setOp3(op3);
				qu.setOp4(op4);
				qu.setqId(id);
				qu.setCorrectAnswer(correct);
				qdao.updateQuestion(qu);
				System.out.println("Added Successfully");
				break;
			case 3:
				System.out.println("Enter a id to delete");
				id = sc.nextInt();
				qu.setqId(id);
				qdao.deleteQuestion(qu);
				System.out.println("Deleted successfully");
				break;
			case 4:
				System.out.println("Enter a Question id to view Question");
				id = sc.nextInt();
				qu = qdao.searchQuestion(id);
				System.out.println(qu);
				break;
			case 5:
				System.out.println("QuestionList:");
				List<Question> qlist = qdao.showQuestions();
				for (Question qs : qlist) {
					System.out.println(qs);
				}
				break;

			}
		}
	}

}
