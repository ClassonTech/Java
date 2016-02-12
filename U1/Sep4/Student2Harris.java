
    public class Student2Harris
{
    private String name;
    private int numScores;
    private int totalScoreSum;

    public Student2Harris()
    {
        name="";
        numScores=0;
        totalScoreSum=0;
    }
    public Student2Harris(String s)
    {
        name=s;
        numScores=0;
        totalScoreSum=0;
    }
    public void addQuiz(int score)
    {
        totalScoreSum=totalScoreSum+score;
        numScores=numScores+1;
    }
    public String getName()
    {
        return name;
    }
    public int getNumScores()
    {
        return numScores;
    }
    public int getTotalSum()
    {
        return totalScoreSum;
    }
    public int getAve()
    {
        return totalScoreSum/numScores;
    }
 }
