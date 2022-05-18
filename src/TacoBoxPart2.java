public class TacoBoxPart2 extends TacoBox {
    private int tacos;

    public TacoBoxPart2(){
        this.tacos = 3;
    }

    public int tacosRemaining(){
        return this.tacos;
    }

    public void eat(){
        if (this.tacos > 0){
            this.tacos = this.tacos -1;
        }
    }
}
