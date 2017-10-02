import java.util.ArrayList;

public class Carrier {

     int carrierAmmo;
     int carrierHealth;
     ArrayList<Aircraft> carrierInventory;

    public Carrier(int carrierAmmo, int carrierHealth){
        this.carrierAmmo = carrierAmmo;
        this.carrierHealth = carrierHealth;
    }

    public void addAircraft(Aircraft aircraftIn){
        carrierInventory.add(aircraftIn);
    }

    public void fillAircraft(int ammoIn){

    }
}
