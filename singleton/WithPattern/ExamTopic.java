package WithPattern;

public class ExamTopic {
	
	// Create private global instance for global access point
	
	private static ExamTopic instance = null;
	
	private String examTopic;
	
	private ExamTopic(String topic){
		this.examTopic = topic;
	}
	
	// creating Instance of ExamTopic Class
	private static void createInstance(String topic){
		if(instance == null){
			instance = new ExamTopic(topic);
		}
	}
	
	public static ExamTopic getInstance(String topic){
		if(instance == null) createInstance(topic);
		return instance;
	}
	
	public String message(){
		return "Hello, I'm currently giving "+ examTopic +" test and Can't appear for another now";
	}
}
