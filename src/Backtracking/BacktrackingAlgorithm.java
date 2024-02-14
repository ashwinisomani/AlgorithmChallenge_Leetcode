package Backtracking;

public class BacktrackingAlgorithm {
    public static void main(String[] args) {
        BacktrackingAlgorithm.generateBinarySequence(3);
        BacktrackingAlgorithm.generateTernarySequence(2);
        BacktrackingAlgorithm.generateCombinations(3 ,"ABC");
        BacktrackingAlgorithm.generateAllSubSets(3 , "ABC");
    }

    private static void generateBinarySequence(int size){
        if(size <= 0 ){
            return;
        }
        int[] result = new int[size];
        int current = 0;
        generateBinarySequence(result, current);
    }

    private static void generateBinarySequence(int[] result, int current){
        if(current == result.length){
            printArray(result);
            return;
        }
        for(int i = 0 ; i < 2; i ++){
            result[current] = i;
            generateBinarySequence(result, current +1);
        }
    }
    private static void printArray(int[] arr){
        for (int i: arr) {
            System.out.printf(i + " ");
        }
        System.out.println();
    }

//Output
//Binary Sequence of 3
// 0 0 0
// 0 0 1
// 0 1 0
// 0 1 1
// 1 0 0
// 1 0 1
// 1 1 0
// 1 1 1

    private static void generateTernarySequence(int size){
        if(size <= 0 ){
            return;
        }
        int[] result = new int[size];
        int current = 0;
        generateTernarySequence(result, current);
    }

    private static void generateTernarySequence(int[] result, int current){
        if(current == result.length){
            printArray(result);
            return;
        }

        for(int i = 0 ; i < 3; i ++){
            result[current] = i;
            generateTernarySequence(result, current +1);
        }
    }


//print Combination program

    private static void generateCombinations(int size, String str){
        if(size <= 0){
            return;
        }

        int[] result = new int[size];
        int current = 0;
        generateCombinations(result, current, str);
    }
    private static void generateCombinations(int[] result, int current, String str){

        if(current == result.length){
            printCombinations(result, str);
            return;
        }

        for(int i = 0 ; i < str.length(); i ++){
            result[current] = i;
            generateCombinations(result, current +1, str);
        }
    }

    private static void printCombinations(int[] result, String str){
        for(int i = 0 ; i < result.length; i ++){
            System.out.printf(str.charAt(result[i]) + " ");
        }
        System.out.println();
    }
//Output
//Combination of length 2 of ABC
// A A
// A B
// A C
// B A
// B B
// B C
// C A
// C B
// C C


// print Subset Program
    private static void generateAllSubSets(int size, String str){
        if(size <= 0 ){
            return;
        }

        int[] result = new int[size];
        int current = 0 ;
        generateAllSubSets(result, current, str);

    }

    private static void generateAllSubSets(int[] result, int current, String str){
        if(current == result.length){
            printSubsets(result, str);
            return;
        }
        for(int i = 0 ; i < 2; i ++){
            result[current] = i;
            generateAllSubSets(result, current +1, str);
        }
    }
    private static void printSubsets(int[] result, String str){
        System.out.printf("{ ");
        for(int i = 0 ; i < result.length; i ++){
            if(result[i] == 1){
                System.out.printf(str.charAt(i) + " ");
            }
        }
        System.out.println(" }");
    }
}

//Subset Of ABC

//{  }          000
//{ C }         001
//{ B }         010
//{ B C }       011
//{ A }         100
//{ A C }       101
//{ A B }       110
//{ A B C }     111


