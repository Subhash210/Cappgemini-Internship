package assignmentQuestion2;

import java.util.Set;

public class QuestionB{
	
	private String questionId;
	private String question;
	private Set<String> answers;
	
	
	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Set<String> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}

	public void QuestionAndAnswers() {
		System.out.println("Answers in set format");
		System.out.println("QuestionId \t: "+this.getQuestionId()+"\nQuestion \t: "
							+this.getQuestion()
							+"\nAnswers list\t: "+this.getAnswers());
		
	}

	
}
