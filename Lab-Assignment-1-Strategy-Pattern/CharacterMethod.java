public class CharacterMethod{
    public static void main(String[] args){

        Character knight = new Character("Knight ", new KnightOff(), new KnightDef());
        knight.attack();
        knight.defend();

        Character wizard = new Character("Wizard ", new MageOff(), new MageDef());
        wizard.attack();
        wizard.defend();

        Character archer = new Character("Archer ", new RangerOff(), new RangerDef());
        archer.attack();
        archer.defend();
    }
}
