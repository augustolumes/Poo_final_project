public class Notes extends Aluno {
    private double score1;
    private double score2;
    private double score3;
    private double score4;
    private double average;
    private String status;

    

    public Notes(double score1, double score2, double score3, double score4) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
    }

    public double avarege() {
        average = ((score1 + score2 + score3 + score4) / 4);
        return average;
    }

    public String status() {
        this.average = avarege();
        if (average > 7) {
            status = "Aproved";
        } else if (average < 7 && average >= 4) {
            status = "Recovery";
        } else {
            status = "Reproved";
        }

        return status;

    }



}
