public class Problem{

	private String name;
	private ProblemType type;
	private boolean status;

	
public Problem(String name, ProblemType type){
	this.name = name;
	this.type = type;
}


public ProblemType getProblemType(){

	return type;
}



public String getName(){

	return name;
}




}