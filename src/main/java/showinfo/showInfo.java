package showinfo;

public class showInfo {
    private static String showName;
    private static Double showGrade;

    public showInfo(){

        this.showName=showName;
        this.showGrade=showGrade;
    }

    public void setShowName(String showName) {
        showInfo.showName = showName;
    }

    public void setShowGrade(Double showGrade) {
        showInfo.showGrade = showGrade;
    }

    public String getShowName() {
        return showName;
    }
  public Double getShowGrade() {
      return showGrade;
    }

}
