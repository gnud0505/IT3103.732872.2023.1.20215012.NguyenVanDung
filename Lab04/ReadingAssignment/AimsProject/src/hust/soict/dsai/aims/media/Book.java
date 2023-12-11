package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media implements Playable{
    private List<String> authors = new ArrayList<String>();

    public Book(String title){
        super(title);
    }

    public Book(String title, String category, float cost, List<String> authors) {
        super(category, title, cost);
        this.authors = authors;
    }

    public void addAuthor(String otherAuthor){
        int tmp=0;
        for(String author : this.authors){
            if(author.equals(otherAuthor)) tmp=1;
        }
        if(tmp == 0){
            authors.add(otherAuthor);
            System.out.println("Them tac gia " + otherAuthor + " thanh cong");
        }
        else {
            System.out.println("Tac gia " + otherAuthor + " da ton tai");
        }
    }

    public void removeAuthor(String otherAuthor){
        int tmp=0;
        for(String author : this.authors){
            if(author.equals(otherAuthor)) tmp=1;
        }
        if(tmp == 1){
            authors.remove(otherAuthor);
            System.out.println("Xoa tac gia " + otherAuthor + " thanh cong");
        }
        else {
            System.out.println("Tac gia " + otherAuthor + " khong ton tai");
        }
    }

    public String toString(){
        String authorToString = new String();
        for (String a: authors){
            authorToString = authorToString + a + ", ";
        }
        if (authorToString.length() > 2) {
            authorToString = authorToString.substring(0, authorToString.length() - 2);
        }
        return super.getId() + ". Book-" + super.getTitle() + "-" + super.getCategory() + "-"
                + authorToString + ": " + super.getCost() + "$";
    }

    @Override
    public void play() {
        System.out.println("Play Book: " + this.getTitle());
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }


}
