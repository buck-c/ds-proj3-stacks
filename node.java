public class node {

	private int num;
	
	node() {	
		num=0;
	}
	
	node(int value) {
		num=value;
	}

    int getValue(){
        return num;
    }

    public node deepCopy() {
        node clone = new node(num); 
        return clone;
    }

    public String toString() { //combines node information for easy output
		return "Final result: "+num;
	}

}

