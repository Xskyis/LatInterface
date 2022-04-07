public class Wounded implements Hp {

    private int hp;
    private boolean isGranade;

    public void terluka(){
        // hp awal
        this.hp = 100;
    }
    @Override
    public void Granade() {
       isGranade = true;
       System.out.println("Granade Incoming....");
       System.out.println("Booooooom");
        
    }

    @Override
    public void Medkit() {
       isGranade = false;
       System.out.println("You are Healthy"); 
    }
    public int getHp(){
        return this.getHp();
    }
    @Override
    public void ThrowGranade() {
        if (isGranade) {    
            if (this.hp == MIN_HP) {    
                System.out.println("Dead..");
            }else{  
                this.hp -= 10;
                System.out.println("Hitpoint Now: " + this.isGranade());
            }
            
        } else {    
            System.out.println("Throw Granade First!!!");
        }

    }
        
    
    @Override
    public void UseMedkit() {
        if (isGranade) {    
            if (this.hp == MAX_HP) {    
                System.out.println("Healty!!");
                System.out.println("Hitpoint " + this.getHp() + "%");
            }   else {  
                this.hp += 10;
                System.out.println("Hp Now: "+ this.isGranade());
            }
                } else {    
                System.out.println("Use Medkit First!!");
            }
        }
        
    

    public int isGranade(){ 
        return this.hp;
    }
    
  } 
