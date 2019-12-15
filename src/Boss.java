public class Boss extends Player {

    private int defenceType = 60;
    private String[] attackType = {"Physycal",
            "Magical", "Kinetic", "Medical"};


    public int getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(int defenceType) {
        this.defenceType = defenceType;
    }

    public String[] getAttackType() {
        return attackType;
    }

    public void setAttackType(String[] attackType) {
        this.attackType = attackType;
    }
}
