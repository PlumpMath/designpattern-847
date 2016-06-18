package NonPattern;

public class ExamTopic {
	
	// Create global instance for global access point
	
	public static ExamTopic instance = new ExamTopic("Computer Fundamentals");
	
	private String examTopic;
	
	public ExamTopic(String examTopic){
		this.examTopic = examTopic;
	}
	
	public String getInstance(){
		return examTopic;
	}
}
