public class third {
    static void generateSubsets(int[] values, int index, int[] current, int currentSize){
        if (index == values.length){
            System.out.print("{");
            for (int i = 0; i < currentSize; i++){
                if (i < currentSize - 1) {
                    System.out.print(current[i] + " ");
                }
                else {
                    System.out.print(current[i]);
                }
            }
            System.out.println("}");
            return;
        }

        generateSubsets(values, index + 1, current, currentSize);
        current[currentSize] = values[index];
        generateSubsets(values, index + 1, current, currentSize + 1);
    }
    static void output() {
        int[] values = {1,2,3,4};
        int[] current = new int[values.length];

        generateSubsets(values,0,current,0);
    }
}
