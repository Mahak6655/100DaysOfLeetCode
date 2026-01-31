public class findSmallestLetterGreaterThanTarget {

    public static char smallestGreaterThanTarget(char letter[] ,char target){

        for(int i=0;i<letter.length;i++){
            if(target<letter[i]){
                return letter[i];
            }
        }
        return letter[0];
    }
    public static void main(String[] args) {
        char letters[] = {'x', 'x', 'y'};
        System.out.println(smallestGreaterThanTarget(letters, 'z'));
    }
}