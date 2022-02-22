package assignmentQuestion2;

import java.util.List;

public class QuestionA{
	
	private String questionId;
	private String question;
	private List<String> answers;
	
	
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
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	public void QuestionAndAnswers() {
		System.out.println("Answers in list format");
		System.out.println("QuestionId \t: "+this.getQuestionId()+"\nQuestion \t: "
							+this.getQuestion()
							+"\nAnswers list\t: "+this.getAnswers());
		
	}

	
}
