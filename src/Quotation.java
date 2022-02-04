import java.util.ArrayList;
public class Quotation {
  public List<String> quotes = new ArrayList<>();
  public List<String> autors = new ArrayList<>();




     public void colection(){
       quotes.add("“Live as if you were to die tomorrow. Learn as if you were to live forever.”");
    autors.add("– Mahatma Gandhi");
    quotes.add("“That which does not kill us makes us stronger.”");
      autors.add("– Friedrich Nietzsche");
      quotes.add("“Be who you are and say what you feel, because those who mind don’t matter and those who matter don’t mind.”");
      autors.add("– Bernard M. Baruch");
     quotes.add(" “We must not allow other people’s limited perceptions to define us.”");
     autors.add(" – Virginia Satir");
      quotes.add("“Do what you can, with what you have, where you are.”");
      autors.add("– Theodore Roosevelt");
      quotes.add("“Be yourself; everyone else is already taken.”");
     autors.add(" – Oscar Wilde");
      quotes.add("“This above all: to thine own self be true.");
     autors.add(" – William Shakespeare");
      quotes.add("“If you cannot do great things, do small things in a great way.”");
     autors.add(" – Napoleon Hill");
      quotes.add("“If opportunity doesn’t knock, build a door.”");
     autors.add(" – Milton Berle");
      quotes.add("“Wise men speak because they have something to say; fools because they have to say something.”");
     autors.add(" – Plato");
       
     }
  
   
     
    

    public void display() {
    int a =1;
    int b = 10;
    int rand = (a + (int) (Math.random() * b))*2;
      colection();
    System.out.println(quotes.get(rand-1));
    System.out.println(autors.get(rand));
  }
}
