class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{

    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable(){
        return false;
    }
    
    @Override
    public int getDamagePoints(Fighter wizard){
        return wizard.isVulnerable() ? 10 : 6;   
    }

}


    class Wizard extends Fighter{
    
    private boolean spellPrepared;     

    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }

    public void prepareSpell(){
        spellPrepared = true; 
    }

    @Override    
    public boolean isVulnerable(){
        return  !spellPrepared;
    }
    
    @Override
    public int getDamagePoints(Fighter warrior){
        return spellPrepared ? 12 : 3;
    }
        
}
    