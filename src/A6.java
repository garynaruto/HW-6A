import java.awt.List;
import java.util.ArrayList;

public class A6{
	public static void main(String[] args){
		Question logo = new Question("aaa");
        
		
		
        Playlist playlist1 = new Playlist();
        playlist1.add(new Question("Duke ек┤здт"));
        playlist1.add(new Question("Duke еk┤здт"));
        
        Playlist playlist2 = new Playlist();
        playlist2.add(new Question("Duke илек╕}"));
        playlist2.add(new Question("Duke илеk╕}"));
        
        Playlist all = new Playlist();
        all.add(logo);
        all.add(playlist1);
        all.add(playlist2);
        
        all.print();
    }
}
interface Printable {
    void  print();
}

class Question implements Printable {
    private String description;
    Question(String image) {
        this.description = image;
    }
    public void print(){
        System.out.println(description);
    }
}

class Playlist implements Printable {
    private ArrayList<Printable> list = new ArrayList<Printable>();
    public void add(Printable p) {
        list.add(p);
    }
    public void print(){
        for(Printable p : list) {
            p.print() ;
        }
    }
}
