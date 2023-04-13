public class Driver extends Car {

    public Driver(){
        super();
    }

    public void drive(){
        System.out.println("\n----User Driving----");
        int gasUsed = 1;
        super.decreaseGas(gasUsed);
        System.out.println("Gas left in the Tank: " + super.getGas()+ "L/10L");

    }

    public void booster(){
        System.out.println("\n----User Used Booster!----");
        int gasUsed = 3;
        super.decreaseGas(gasUsed);
        if(super.getGas() > 10){
            System.out.println("Gas left in the Tank: " + super.getGas() + "L/10L");
        }else{
            System.out.println("Your Tank has been reseted to " + super.getGas()+ "L/10L");
        }
    }

    public void refuel(){
        System.out.println("\n----User Refueling----");
        int gasRefuelAmount = 2;
        super.increaseGas(gasRefuelAmount);
        System.out.println("Gas left in the Tank: " + super.getGas()+ "L/10L");

    }
    
}
