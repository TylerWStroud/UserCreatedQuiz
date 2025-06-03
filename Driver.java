import java.util.Scanner;
public class Driver {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Quiz q = new Quiz();
        int choice;
        while(true){
            System.out.println("\nWhat would you like to do?\n1.Add a question to the quiz\n2.Remove a question from the quiz\n3.Modify a question in the quiz\n4.Take the quiz\n5.Quit");
            choice=sc.nextInt();
            sc.nextLine();

            if(choice==1){
                q.add_question();
            }
            else if(choice==2){
                q.remove_question();
            }
            else if(choice==3){
                q.modify_question();
            }
            else if(choice==4){
                q.give_quiz();
            }
            else{
                break;
            }
        }
        sc.close();
    }
}
