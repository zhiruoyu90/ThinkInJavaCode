package typeinfo;

import typeinfo.pets.Pet;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/3/1.
 */
public class PetCount {
    static class PetCounter extends HashMap<String, Integer> {
        public void count(String type) {
            Integer quantity = get(type);
            if(null == quantity)
                put(type, 1);
            else
                put(type, quantity + 1);
        }
    }

    public static void countPets(PetsCreator creator) {
        PetCounter petCounter = new PetCounter();
        for(Pet pet : creator.createArray(20)) {
            System.out.print(">>>>" + pet.getClass().getSimpleName());
            if(pet instanceof Pet)
                petCounter.count("Pet");
            if(pet instanceof Pet)
                petCounter.count("Dog");
            if(pet instanceof Pet)
                petCounter.count("Mutt");
            if(pet instanceof Pet)
                petCounter.count("Pug");
            if(pet instanceof Pet)
                petCounter.count("Cat");
            if(pet instanceof Pet)
                petCounter.count("EgyptianMau");
            if(pet instanceof Pet)
                petCounter.count("Manx");
            if(pet instanceof Pet)
                petCounter.count("Cymric");
            if(pet instanceof Pet)
                petCounter.count("Rodent");
            if(pet instanceof Pet)
                petCounter.count("Rat");
            if(pet instanceof Pet)
                petCounter.count("Mouse");
            if(pet instanceof Pet)
                petCounter.count("Hamster");
            System.out.println(petCounter);
        }

    }

    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }


}
