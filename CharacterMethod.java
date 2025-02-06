public class CharacterMethod{
    public static void main(String[] args){

        Character knight = new Character("Knight ", new SwingSword(), new Shield());
        knight.attack();
        knight.defend();

        Character wizard = new Character("Wizard ", new CastSpell(), new CreateMagic());
        wizard.attack();
        wizard.defend();

        Character archer = new Character("Archer ", new ShootArrow(), new Dodge());
        archer.attack();
        archer.defend();
    }
}