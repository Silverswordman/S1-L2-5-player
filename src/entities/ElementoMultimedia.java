package entities;

public abstract class ElementoMultimedia {
    public String titolo;
    public String getTitolo() {
        return titolo;
    }
    public void view() {
        System.out.println("Stai accedendo all elemento"+ getTitolo());


    }}
