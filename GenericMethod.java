
class Data {
    static <T> void showArray(T[]arr){
        for(T element:arr){
            System.out.println(element);
        }
    }   
}

public class GenericMethod{
    public static void main(String[]args){
        Data.showArray(new String[]{"kong","jojo","ruksiam"});
    }
}

