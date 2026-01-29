import java.util.ArrayList;
public class Person{

	ArrayList<Problem> problems;


	public Person(){
		problems = new ArrayList<>();


	}
	

	public void addProblem(String name, ProblemType type){
		for (int i = 0; i < problems.size(); i++) {
			if (problems.get(i).getProblemType() == type && problems.get(i).getName() == name) throw new IllegalArgumentException("Problem already exist");
		}
		Problem problem = new Problem(name, type);
		problems.add(problem);
	}



	public void solveProblem(String name,ProblemType type){
		for (int i = 0; i < problems.size(); i++) {
			if (problems.get(i).getProblemType() == type && problems.get(i).getName() == name) {

				problems.remove(problems.get(i));
			}
		}

	}



	public ArrayList<Problem> returnProblem(){

		return problems;
	}




	

}