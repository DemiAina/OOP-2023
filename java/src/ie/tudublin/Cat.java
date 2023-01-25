package ie.tudublin;

public class Cat {

    String name;

    int numLives = 9;
    
    public Cat(){
    }

    public Cat(String nane){
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLives(int numLives){
         this.numLives = numLives;
    }

    public void kill(){
        if (numLives > -1){
            numLives -= 1;
            System.out.println("Ouch");
        }
        if(numLives == 0){
            System.out.println("Dead");
        }
    }
}

