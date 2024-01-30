package LA3Q1;

public class YakeshArray {
    private Pair<Integer, String>[] testArray;

    public YakeshArray() {
        testArray = new Pair[0];
    }//constructor method

    public int getSize() {//getter method
        return testArray.length;
    }

    public Pair removeFromLastIndex() {
        Pair lastElement = null;//to store element getting removed
        if (testArray.length > 0) {//creating new array and moving elements then reassigned to original reference variable
            lastElement = testArray[testArray.length - 1];
            Pair<Integer, String>[] holder = new Pair[testArray.length - 1];
            System.arraycopy(testArray, 0, holder, 0, testArray.length - 1);
            testArray = holder;
            holder = null;
        }
        return lastElement;
    }

    public Pair removeFromFirstIndex() {//same as removeFromLastIndex but removing first element instead of last
        Pair firstElement = null;
        if (testArray.length > 0) {
            firstElement = testArray[0];
            Pair<Integer, String>[] holder = new Pair[testArray.length - 1];
            System.arraycopy(testArray, 1, holder, 0, testArray.length - 1);
            testArray = holder;
            holder = null;
        }
        return firstElement;

    }

    public String toString() {//
        String holder = "";
//adding all elements of array to holder
        for (int i = 0; i < testArray.length; i++) {
            holder = holder + testArray[i].toString();
        }
//add brackets around string and return
        return "[" + holder + "]";

    }

    public void addAtLastIndex(Pair x) {//creating larger array and moving elements to it then adding received element to end of array
        Pair<Integer, String>[] holder = new Pair[testArray.length + 1];
        System.arraycopy(testArray, 0, holder, 0, testArray.length);
        holder[holder.length - 1] = x;
        testArray = holder;//reassigning to original reference variable
        holder = null;

    }
}
