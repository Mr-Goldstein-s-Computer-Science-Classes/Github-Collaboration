
import java.util.ArrayList;
public class Gradebook {

    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<String> assignments = new ArrayList<>();

    public Gradebook(){
    }
    public void createStudent(String name){
        studentList.add(new Student(name));
    }
    void addAssignment(String assignment){
        assignments.add(assignment);
    }
    void gradeAssignment(String assignment, String studentName, double grade){
        studentName.gradeAssignment(assignment, grade);
    }
    double getAverageGrade(String assignment){
        double totalGrade = 0.0;
        for (Student student : studentList){
            totalGrade += student.getAssignmentGrade(assignment);
        }
        return totalGrade/studentList.size();
    }
    double getMinimumGrade(String assignment){
        double lowestGrade = studentList.get(0).getAssignmentGrade(assignment);
        for (int i = 1; i < studentList.size(); i++){
            if (studentList.get(i).getAssignmentGrade(assignment)<lowestGrade){
                lowestGrade = studentList.get(i).getAssignmentGrade(assignment);
            }
        }
        return lowestGrade;
    }
    double getMaximumGrade(String assignment){
        double maxGrade = studentList.get(0).getAssignmentGrade(assignment);
        for (int i = 1; i < studentList.size(); i++){
            if (studentList.get(i).getAssignmentGrade(assignment)>maxGrade){
                maxGrade = studentList.get(i).getAssignmentGrade(assignment);
            }
        }
        return maxGrade;
    }
    double getAverageOverall(){

    }
    double getMaxOverall(){

    }
    double getMinOverall(){

    }
    double getStudentsGrade(){
        for (String assignment : assignments){
            
        }
    }
    public String toString(){

    } //Returns the names of the students and the names of the assignments as a String
    Student getStudent(String studentName){

    }

}
