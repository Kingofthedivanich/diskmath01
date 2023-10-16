public class Main {
    public static void main(String[] args) {
    int[] elements = {0,1,2,3,4,5,6,7,8,9,10};
    int value = 8;

    int linearResult = linear(elements, value);
    int binaryResult = binary(elements, value, 0, elements.length - 1);

    System.out.println(linearResult);
    System.out.println(binaryResult);
    }

    //линейный поиск
    public static int linear(int[] elements, int value){
        int schet = 0;
        for (int i = 0; i < elements.length; i++) {
            schet = schet + 1;

            if (elements[i] == value){
                return schet;
            }
        }
        return schet;
    }

    //бинарный поиск
    public static int binary(int[] elements, int value, int low, int high) {
        int index = -1;
        int schet = 0;

        while (low <= high) {
            schet = schet + 1;
            int mid = low + (high - low) / 2;
            if (elements[mid] < value) {
                low = mid + 1;
            } else if (elements[mid] > value) {
                high = mid - 1;
            } else if (elements[mid] == value) {
                index = mid;
                break;
            }
        }
        return schet;
    }
}