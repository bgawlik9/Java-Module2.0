public class Grades {
    private int [] grades;
    private int size;

    private double sum;


    public Grades() {
        this.grades = new int [10];
        this.size = 0;

    }

    public void add(int value){
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void checkLastGrade(){
        int indexOfLastGrade = size - 1;

        System.out.println("last grade is: " + grades[indexOfLastGrade]);

    }
    public void averageGrade(){

        for (int i = 0; i < grades.length ; i++) {

            sum += grades[i];

        }
        double averageGrade = sum / size;
        System.out.println(averageGrade);

    }
}
