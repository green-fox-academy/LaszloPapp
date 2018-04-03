//Hozzunk létre egy zöldség nevű osztályt! Az osztálynak legyen 2 privát adattagja: string név, string szín.
//Adjunk az adattagokhoz nyilvános függvényeket (getter,setter), melyeken keresztül kívülről írhatunk és
//olvashatunk is az adattagokba/ból.
//Példányosítsunk egy káposzta, egy padlizsán és egy sárgarépa változót!
// A main függvényben állítsuk be a tulajdonságaikat értelemszerűen (pl: padlizsán -név padlizsán, szín lila :)
//+1: Írjunk a zöldség osztályunkhoz egy plusz konstruktort, mely egy nevet és egy színt vár
//(ne felejtsük el, hogy a másik, üres konstruktor is megmaradjon!)
//Példányosítsunk egy zellert a main függvényben az új konstruktorunk használatával.
//+2: Adjunk egy plusz privát adattagot adattagot az osztályunkhoz.
// Legyen ez egy boolean, hogy a zöldségünk hámozott-e.
// A hámozott adattaghoz adjunk függvényeket, melyen kívülről csak olvasható formában tartalmazza az adattag értékét.
//+3: Állítsuk be a hámozott tulajdonságunkat alapértelmezetten hamisra! (2-féle megoldás is lehetséges
//+4: Hozzunk létre egy Hámozás függvényt, mely átállítja a zöldség hámozott adattagját igazra.
//Hívjuk meg a main függvényünkből a hámozás függvényt a sárgarépán!

public class VegetableProject {

    public static void main(String[] args) {

        Vegetable cabbage = new Vegetable("cabbage","green", false);
        Vegetable eggplant = new Vegetable("eggplant", "purple", false);
        Vegetable carrot = new Vegetable("carrot", "orange", false);
        Vegetable celery = new Vegetable("celery", "white", false);

        peel(carrot);

        System.out.println(carrot.isPeeled());
    }

    public static void peel(Vegetable vegetable){
        vegetable.setPeeled(true);
    }
}
