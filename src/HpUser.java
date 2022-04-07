public class HpUser {
     private Hp hp;

    public HpUser(Hp hp) {
        this.hp = hp;
    }
    
    void GranadeDamage(){
        this.hp.Granade();
    }
    void Medkitheal(){
        this.hp.Medkit();
    }
    void Healing (){   
        this.hp.UseMedkit();   
    }
    void Attack (){    
        this.hp.ThrowGranade();
    }
}
