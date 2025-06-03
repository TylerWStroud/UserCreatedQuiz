public class Question {
    private int iD;
    static int iDcounter=0;
    private String text;
    private String answer;
    private int difficulty;
    Question(){
        iD=iDcounter++;
        this.text=" ";
        this.answer=" ";
        this.difficulty=0;
    }
    public  void setText(String t){
        text=t;
    }
    public int strikeCounter(){
        return iDcounter=iD;
    }
    public int strikeId(){
        return iD--;
    }
    public String getText(){
        return text;
    }
    public int getiD(){return iD;}
    public void setiD(int i){ iD = i;}
    public void setAnswer(String a){
        answer=a;
    }
    public String getAnswer(){
        return answer;
    }
    public void setDifficulty(int d){
        difficulty=d;
    }
    public int getDifficulty(){
        return difficulty;
    }
    @Override
    public String toString(){
        return iD+". "+text;
    }
}
