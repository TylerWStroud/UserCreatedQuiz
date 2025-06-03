import java.util.ArrayList;
import java.util.Scanner;
public class Quiz {
    Scanner sc = new Scanner (System.in);
    ArrayList<Question> quiz = new ArrayList<>();
    public void add_question(){
        Question quest = new Question();

        System.out.println("What is the question text? ");
        quest.setText(sc.nextLine());
        System.out.println("What is the answer? ");
        quest.setAnswer(sc.nextLine());
        System.out.println("What is the difficulty(1-3)? ");
        quest.setDifficulty(Integer.parseInt(sc.nextLine()));

        quiz.add(quest);
    }
    public void remove_question(){
        if(quiz.isEmpty()){
            System.out.println("\nNo questions available to remove from your quiz.\n");
        }
       else {
            System.out.println("Choose the question to remove?");
            for (Question x : quiz) {
                System.out.println(x);
            }
            int r=Integer.parseInt(sc.nextLine());
            for(Question x: quiz)
            {
                if(x.getiD()>r){
                    x.strikeId();
                    x.strikeCounter();
                }
             }
            quiz.remove(r);
       }
    }
    public void modify_question() {

        if (quiz.isEmpty()) {
            System.out.println("\nNo questions available to modify on your quiz.\n");
        }
        else {
            System.out.println("Choose the question to modify?");
            for (Question x : quiz) {
                System.out.println(x);
            }
            int change = Integer.parseInt(sc.nextLine());

            System.out.println("What is the question text?");
            quiz.get(change).setText(sc.nextLine());
            System.out.println("What is the answer?");
            quiz.get(change).setAnswer(sc.nextLine());
            System.out.println("What is the difficulty?(1-3)");
            quiz.get(change).setDifficulty(Integer.parseInt(sc.nextLine()));
        }
    }
    public void give_quiz(){
        int score=0;
        for(Question x: quiz){
            System.out.println(x.getText());
            String ans = sc.nextLine();

            if(ans.equalsIgnoreCase(x.getAnswer())){
                System.out.println("Correct");
                score++;
            }
            else{
                System.out.println("Incorrect");
            }

        }
        System.out.println("You got "+score+" out of "+quiz.size()+" correct.");

    }

}
