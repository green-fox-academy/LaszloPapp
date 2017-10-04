public class Aircraft {

    int maxAmmo;
    int currentAmmo;
    int baseDamage;
    String aircraftType;


    public Aircraft(String tipusa){

        aircraftType = tipusa;
        if(tipusa=="F16")
        {
            maxAmmo = 8;
            this.baseDamage = 30;
            currentAmmo = 0;
        }
        else
        { //F35
            maxAmmo = 12;
            this.baseDamage = 50;
            currentAmmo = 0;
        }

    }

    public int fight()
    {
        int damageAll = baseDamage*currentAmmo;
        currentAmmo = 0;
        return damageAll;
    }

    public int refill(int ammoInput)
    {
        int ammoRemain = 0;
        if(ammoInput>=maxAmmo) {
            currentAmmo = maxAmmo;
            ammoRemain = ammoInput - maxAmmo;
        }else {
            currentAmmo = ammoInput;
        }
        return ammoRemain;
    }

    public String getAircraftType(){
        String type = aircraftType;
        return type;
    }

    public String getStatus(){

        String status = "Type: " + aircraftType + " Ammo: " + currentAmmo + " Base damage: " + baseDamage + " All damage: " + baseDamage * currentAmmo;
        return status;
    }
}
