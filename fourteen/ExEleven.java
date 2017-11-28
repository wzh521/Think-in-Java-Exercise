package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/27.
 */

import com.wzh.thik.in.java.fourteen.util.PetCreator;

/**
 * @author:Administrator
 * @date:2017/11/27
 * @description:
 */
class Rodent {
    public void hop() { System.out.println("Rodent hopping"); }
    public void scurry() { System.out.println("Rodent scurrying"); }
    public void reproduce() { System.out.println("Making more Rodents"); }
    @Override
    public String toString() { return "Rodent"; }
}
 class Gerbil extends Rodent {
    public Gerbil(String name) {
        }
     public Gerbil() {}
}
//class ForNameCreator extends PetCreator {
//    private static List<Class<? extends Pet>> types =
//        new ArrayList<Class<? extends Pet>>();
//private static String[] typeNames = {
//    "typeinfo.pets.Mutt", "typeinfo.pets.Pug", "typeinfo.pets.EgyptianMau", "typeinfo.pets.Manx", "typeinfo.pets.Cymric", "typeinfo.pets.Rat", "typeinfo.pets.Mouse", "typeinfo.pets.Hamster", "typeinfo.pets1.Gerbil"
//};
//static { try {
//        for(String name : typeNames) types.add(
//        (Class<? extends Pet>)Class.forName(name));
//        } catch(ClassNotFoundException e) { throw new RuntimeException(e);
//        }
//        }
//public List<Class<? extends Pet>> types() {return types;}
//        }
//class LiteralPetCreator1 extends PetCreator {
//    public static final List<Class<? extends Pet>> allTypes =
//            Collections.unmodifiableList(Arrays.asList(
//            Pet.class, Dog.class, Cat.class,
//            Rodent.class, Mutt.class, Pug.class, EgyptianMau.class,
//            Manx.class, Cymric.class, Rat.class, Mouse.class,Hamster.class, Gerbil.class));
//    private static final List<Class<? extends Pet>> types =
//            allTypes.subList(allTypes.indexOf(Mutt.class),
//            allTypes.size());
//    public List<Class<? extends Pet>> types() { return types;
//    }
//    public static void main(String[] args) { System.out.println(types);
//    }
//}
public class ExEleven {
//    static class PetCounter extends HashMap<String, Integer>{ public void count(String type) {
//        Integer quantity = get(type); if(quantity == null)
//            put(type, 1); else
//            put(type, quantity + 1);
//    }
//    }
//    public static void countPets(PetCreator creator) {
//
//
//        PetCounter counter= new PetCounter(); for(Pet pet : creator.createArray(20)) {
//// List each individual pet: printnb(pet.getClass().getSimpleName() + " "); if(pet instanceof Pet)
//            counter.count("Pet"); if(pet instanceof Dog)
//                counter.count("Dog"); if(pet instanceof Mutt)
//                counter.count("Mutt"); if(pet instanceof Pug)
//                counter.count("Pug"); if(pet instanceof Cat)
//                counter.count("Cat"); if(pet instanceof Manx)
//                counter.count("EgyptianMau"); if(pet instanceof Manx)
//                counter.count("Manx"); if(pet instanceof Manx)
//                counter.count("Cymric"); if(pet instanceof Rodent)
//                counter.count("Rodent"); if(pet instanceof Rat)
//                counter.count("Rat"); if(pet instanceof Mouse)
//                counter.count("Mouse"); if(pet instanceof Hamster)
//                counter.count("Hamster"); if(pet instanceof Gerbil)
//                counter.count("Gerbil");
//        }
//// Show the counts: print(); print(counter);
//    }
//    public static void main(String[] args) { countPets(new ForNameCreator());
//    }
//}
}
