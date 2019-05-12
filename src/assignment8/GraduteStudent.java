package assignment8;

public class GraduteStudent extends Student {
    private int graduteYear;

    public GraduteStudent(String name,String lastname,int studentNumber,int graduteYear) {
        this.graduteYear = graduteYear;
        this.setName(name);
        this.setLastName(lastname);
        this.setStudentNumber(studentNumber);
    }
    public GraduteStudent(){

    }

    public int getGraduteYear() {
        return graduteYear;
    }

    public void setGraduteYear(int graduteYear) throws WorngYearException {
        if(graduteYear<=1380){
            throw new WorngYearException();
        }else {
            this.graduteYear = graduteYear;
        }
    }

    public class WorngYearException extends Throwable {
        public WorngYearException(){
            super("wrong Year ! -> year should be bigger than 1380");
        }
    }

    @Override
    public String toString() {
        String info = String.format("Gradute\t%s\t%s\t%d\t%d\n",this.getName(),this.getLastName(),this.getStudentNumber(),this.getGraduteYear());
        return info;
    }
}
