package mypack;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int qid;
	private String que;
	private List<Answers> ans;
	
	public Question(int qid, String que, List<Answers> ans) {
		super();
		this.qid = qid;
		this.que = que;
		this.ans = ans;
	}

	public void display()
	{
		System.out.println("Question ID is: "+qid);
		System.out.println("Question is: "+que);
		System.out.println("Answers: ");
		Iterator<Answers> itr = ans.iterator();
		while(itr.hasNext())
		{
			Answers a1 = itr.next();
			System.out.println(a1);
		}
	}

}
