public class Car {
    protected int gas;

    public Car(){
        this.gas = 10;
    }

    public int getGas(){
        return this.gas;
    }

    public void decreaseGas(int number){
        this.gas -= number;
        if(this.gas <= 0 ){
            System.out.println("\nGame Over! You ran out of gas");
            this.gas = 10;
        }
    }

    public void increaseGas(int number){
        this.gas += number;
        if(this.gas > 10){
            System.out.println("You Tank is Full");
            this.gas = 10;
        }
    }
}