package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/27.
 */

/**
 * @author:Administrator
 * @date:2017/11/27
 * @description:
 */
//public class Cymric extends Manx { public static class Factory
//        implements typeinfo.factory.Factory<Cymric> { public Cymric create() { return new Cymric(); }
//}
//} ///:~
////: typeinfo/pets2/EgyptianMau.java package typeinfo.pets2;
//import typeinfo.pets.Cat;
//
//
//
//public class EgyptianMau extends Cat { public static class Factory
//        implements typeinfo.factory.Factory<EgyptianMau> { public EgyptianMau create() {
//    return new EgyptianMau();
//}
//}
//} ///:~
////: typeinfo/pets2/Hamster.java package typeinfo.pets2;
//import typeinfo.pets.Rodent;
//
//public class Hamster extends Rodent { public static class Factory
//        implements typeinfo.factory.Factory<Hamster> { public Hamster create() { return new Hamster(); }
//}
//} ///:~
////: typeinfo/pets2/Manx.java package typeinfo.pets2; import typeinfo.pets.Cat;
//
//public class Manx extends Cat { public static class Factory
//        implements typeinfo.factory.Factory<Manx> { public Manx create() { return new Manx(); }
//}
//} ///:~
////: typeinfo/pets2/Mouse.java package typeinfo.pets2; import typeinfo.pets.Rodent;
//
//public class Mouse extends Rodent { public static class Factory
//        implements typeinfo.factory.Factory<Mouse> { public Mouse create() { return new Mouse(); }
//}
//} ///:~
////: typeinfo/pets2/Mutt.java package typeinfo.pets2; import typeinfo.pets.Dog;
//
//public class Mutt extends Dog {
//
//
//    public static class Factory
//            implements typeinfo.factory.Factory<Mutt> { public Mutt create() { return new Mutt(); }
//    }
//} ///:~
////: typeinfo/pets2/Pug.java package typeinfo.pets2; import typeinfo.pets.Dog;
//
//public class Pug extends Dog { public static class Factory
//        implements typeinfo.factory.Factory<Pug> { public Pug create() { return new Pug(); }
//}
//} ///:~
////: typeinfo/pets2/Rat.java package typeinfo.pets2; import typeinfo.pets.Rodent;
//
//public class Rat extends Rodent { public static class Factory
//        implements typeinfo.factory.Factory<Rat> { public Rat create() { return new Rat(); }
//}
//} ///:~
//private static class RFPetCreator extends PetCreator {
//    static List<Factory<? extends Pet>> petFactories =
//        Arrays.asList(new Mutt.Factory(), new Pug.Factory(), new EgyptianMau.Factory(), new Manx.Factory(),
//                new Cymric.Factory(), new Rat.Factory(),
//                new Mouse.Factory(), new Hamster.Factory());
//    @Override public List<Class<? extends Pet>> types() {
//    return null;
//}
//    @Override public Pet randomPet() {int n = rand.nextInt(petFactories.size());
//        return petFactories.get(n).create();
//    }
//
//    private static Random rand = new Random(47); public static final PetCreator creator =
//        new RFPetCreator();
//    public static Pet randomPet() { return creator.randomPet();
//    }
//    public static Pet[] createArray(int size) { return creator.createArray(size);
//    }
//    public static ArrayList<Pet> arrayList(int size) { return creator.arrayList(size);
//    }
//}
@SuppressWarnings("unchecked")
public class ExFifteen {

}
