public class Euclid {
    public static int Euclid_NOD(int delimoe, int delitel){
        int result = 0;
        int ostatok = delimoe % delitel;

        if (ostatok == 0){
            return delitel;
        }
        else{
            result = Euclid_NOD(delitel, ostatok);
        }
        return result;
    }
}


//        called: 
//        int euclid = 0;
//        euclid = Euclid_NOD(42, 84);
//        System.out.println("Euclid = " + euclid);
