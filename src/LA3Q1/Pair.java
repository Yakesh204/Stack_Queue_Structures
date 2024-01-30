package LA3Q1;

public class Pair<Y, N> {
    private Y key;
    private N value;

    public Pair() {//constructor method

    }

    public Pair(Y key, N value) {//constructor method with parameter
        this.key = key;
        this.value = value;
    }

    public void setKey(Y rKey) {
        this.key = rKey;
    }//setter method

    public void setValue(N rValue) {
        this.value = rValue;
    }//setter method

    public Y getKey() {//getter method
        return key;
    }

    public N getValue() {
        return value;
    }//getter method

    public String toString() {//toString method
        return "[YR: " + key + " NM: " + value + "]";
    }


}
