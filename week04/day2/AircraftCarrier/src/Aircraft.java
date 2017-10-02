public class Aircraft {

    int maxAmmo;
    int currentAmmo;
    int baseDamage;
    String aircraftType;


    public Aircraft(int tolteny, int baseDamage, String tipusa){

        aircraftType = tipusa;
        maxAmmo = tolteny;
        this.baseDamage = baseDamage;
    }

    public int fight(){
        int damageAll = baseDamage*maxAmmo;
        int ammoSet = (currentAmmo = 0);

        return damageAll;
    }

    public int refill(int ammoInput){
        int ammoRemain = (ammoInput-maxAmmo);
        return ammoRemain;
    }

    public String getAircraftType(){
        String type = aircraftType;
        return type;
    }

    public String getStatus(){

        String status = this.aircraftType;
        return status;
    }
}
