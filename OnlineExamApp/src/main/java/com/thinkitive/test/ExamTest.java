package com.thinkitive.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.thinkitive.dao.ExamDao;
import com.thinkitive.dao.QuestionDao;
import com.thinkitive.model.Exam;
import com.thinkitive.model.Question;

public class ExamTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add Exam");
		System.out.println("2.Delete Exam");
		System.out.println("3.Update Exam");
		System.out.println("4.Show Exams");
		System.out.println("5.Search Exam");
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		Exam ex = new Exam();
		ExamDao edao = new ExamDao();
		QuestionDao qdao=new QuestionDao();
		switch (ch) {
		case 1:
			
			System.out.println("Enter a exam name");
			String exName=sc.next();

			List<Question> qlist = new ArrayList<Question>();

			System.out.println("Enter a number of question wants to add");
			int num=sc.nextInt();
			for(int i=0;i<num;i++)
			{
				Question q = new Question();
				System.out.println("Enter a question ");
				
				String qu=sc.next();
				System.out.println("Enter a option1");
				
				String op1=sc.next();
				System.out.println("Enter a option2");
//				sc.next();
				String op2=sc.next();
				System.out.println("Enter a option3");
			//	sc.next();
				String op3=sc.next();
				System.out.println("Enter a option4");
				//sc.next();
				String op4=sc.next();
				System.out.println("Enter a correct");
			//	sc.next();
				String correct=sc.next();
				q.setCorrectAnswer(correct);
				q.setOp1(op1);
				q.setOp2(op2);
				q.setOp3(op3);
				q.setOp4(op4);
				q.setQuestion(qu);
				qlist.add(q);
			}
		ex.setExamName(exName);
			ex.setQuestions(qlist);
			edao.addExam(ex);
			System.out.println("Added Successfully");
			break;
		case 2:
			System.out.println("Enter a exam id to delete");
			int id = sc.nextInt();
			ex.setExamId(id);
			edao.deleteExam(ex);
			
			System.out.println("Deleted Successfully");
			break;
		case 3:
			System.out.println("Enter a exam id to update");
			id = sc.nextInt();
			System.out.println("Enter a exam name to update");
			exName = sc.next();
			ex.setExamId(id);
			ex.setExamName(exName);
			ex.setQuestions(ex.getQuestions());
			edao.updateExam(ex);
			System.out.println("Updated Successfully");

			break;
		case 4:
			System.out.println("Exam List");
			List<Exam>elist=edao.showExam();
			for(Exam e:elist)
			{
				System.out.println(e);
			}
			break;
		case 5:
			System.out.println("Enter a exam id to search Exam");
			id=sc.nextInt();
			System.out.println(edao.searchExam(id));
			
			break;

		}
	}

}
