package showinfo;

public class results extends showInfo {
    private String resultName;
    private double resultGrade;

    public results() {

    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    public void setResultGrade(double resultGrade) {
        this.resultGrade = resultGrade;
    }

    public String getResultName() {
        return resultName;
    }

    public double getResultGrade() {
        return resultGrade;
    }
    public results(String resultName,double resultGrade) {
        this.resultGrade=resultGrade;
        this.resultName=resultName;
    }

}
