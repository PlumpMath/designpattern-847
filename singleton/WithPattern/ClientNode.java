package WithPattern;


public class ClientNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// starting for a new examination
		System.out.println(ExamTopic.getInstance("Computer Fundamentals").message());
		
		//  If you try to change the subject name, you just can't.
		System.out.println(ExamTopic.getInstance("Digital Systems").message());
	}

}
