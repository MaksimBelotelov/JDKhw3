package homework;

public class CompareArrays {
    public static void main(String[] args) {

    }

    public static<E> boolean compareArrays(E[] arr1, E[] arr2) {
        if(arr1.length != arr2.length)
            return false;
        else {
            for(int i = 0; i < arr1.length; i++)
                if(!arr1[i].equals(arr2[i]))
                    return false;
        }
        return true;
    }
}
