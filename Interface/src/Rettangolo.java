public class Rettangolo implements Forma{
    private float altezza;
    private float base;

    public Rettangolo(float altezza, float base){
        this.altezza = altezza;
        this.base = base;
    }
    @Override
    public void calcolaArea() {
        System.out.println("L'area del rettangolo è " + (base*altezza));

    }
}
