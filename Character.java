public class Character {
    private String type;
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Character(String type, AttackStrategy attackStrategy, DefenseStrategy defenseStrategy){
        this.type = type;
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }
    public void attack(){
        attackStrategy.attack();
    }
    public void defend(){
        defenseStrategy.defend();
    }
    public void setAttackStrategy(AttackStrategy attackStrategy){
        this.attackStrategy = attackStrategy;
    } 
    public void setDefenseStrategy(DefenseStrategy defenseStrategy){
        this.defenseStrategy = defenseStrategy;
    }
}
