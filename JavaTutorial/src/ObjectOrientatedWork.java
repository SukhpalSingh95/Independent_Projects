import java.util.Random;

public class ObjectOrientatedWork {

    /*
    * The tutorial has the class called warrior
    *
    * Real world objects have attributes,  attributes are stored in fields, and capabilities are modelled using methods.
    *
    * */


    protected String WarName="Warrior";
    public int WarHealth=0;
    public int WarAttack=0;
    public int WarDefence=0;

    public ObjectOrientatedWork(String name, int health, int attackMax, int defence){

        //this initialises the 'warrior'
        this.setName(name);
        this.WarHealth=health;
        this.WarAttack=attackMax;
        this.WarDefence=defence;

    }

    public String GetName(){
        //this is using the getter and setter method
        return WarName;
    }

    public void setName(String WarName){
        this.WarName=WarName;
    }

    public int AttackPower(){
        Random random = new Random();
        int AttackAmount = random.nextInt(100)+1;
        System.out.println("the attack amount is "+ AttackAmount);

        return AttackAmount;
    }

    public int DefenceStrength(){
        Random random = new Random();
        int DefencePower = random.nextInt(100)+1;
        System.out.println("The defence amount is "+ DefencePower);
        return DefencePower;
    }

}
