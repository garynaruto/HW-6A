import java.awt.List;
import java.util.ArrayList;

public class A6{
	public static void main(String[] args){
		Question title = new Question("Question 1");
        
		QuestionComposite ch1 = new QuestionComposite();
        ch1.add(new Question("A1"));
        ch1.add(new Question("A2"));
        
        QuestionComposite ch2 = new QuestionComposite();
        ch2.add(new Question("B1"));
        ch2.add(new Question("B2"));
        
        QuestionComposite all = new QuestionComposite();
        all.add(title);
        all.add(ch1);
        all.add(ch2);
        
        all.print();
    }
}
interface Printable{
    void  print();
}
class Question implements Printable{
    private String description;
    Question(String image){
        this.description = image;
    }
    public void print(){
        System.out.println(description);
    }
}
class QuestionComposite implements Printable{
    private ArrayList<Printable> list = new ArrayList<Printable>();
    public void add(Printable p) {
        list.add(p);
    }
    public void print(){
        for(Printable p : list) {
            p.print();
        }
    }
}