package typeinfo;

import typeinfo.pets.Pet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2016/3/1.
 */
public abstract class PetsCreator {
    private Random random = new Random(47);

    public abstract List<Class<? extends Pet>> types();

//    随机创建宠物
    public Pet randomPet() {
        int n = random.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public Pet[] createArray(int size) {
        Pet[] result = new Pet[size];
        for(int i = 0; i < size; i++) {
            result[i] = randomPet();
        }
        return result;
    }

    public List<Pet> arrayList(int size) {
        List<Pet> result = new ArrayList<Pet>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
