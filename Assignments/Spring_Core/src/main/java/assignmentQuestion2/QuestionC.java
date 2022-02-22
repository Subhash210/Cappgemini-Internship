package assignmentQuestion2;


import java.util.Map;

public class QuestionC{
	
	private String questionId;
	private String question;
	private Map<Integer, String> answers;
	
	
	
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


	public Map<Integer, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}


	public void QuestionAndAnswers() {
		System.out.println("Answers in map format");
		System.out.println("QuestionId \t: "+this.getQuestionId()+"\nQuestion \t: "
							+this.getQuestion()
							+"\nAnswers list\t: "+this.getAnswers());
		
	}

	
}

