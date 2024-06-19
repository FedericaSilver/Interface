/*
Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma
ed implementano il metodo per il calcolo dell'area.
 */
public class Main {
    public static void main(String[] args) {
    Rettangolo rettangolo = new Rettangolo(18.4f, 29.43f);
    rettangolo.calcolaArea();
    Triangolo triangolo = new Triangolo(6.78f, 43.2f);
    triangolo.calcolaArea();
    }
}