public class nodeManager{

    private int top;
    private int size;
    private node[] stack;

    public nodeManager(){ //initializes node array with a default size of 3. 
        top=-1;
        size=3;
        stack=new node[size];
    }

    public nodeManager(int s){ //option to initialize node array with a particular length
        top=-1;
        size=s;
        stack=new node[s];
    }

    boolean pushnode(){ //checks to make sure theres enough space, then stores a node at the top index according to user input
       
        if(top==size-1){
            System.out.println("Overflow err");
            return false;
        }
        top++;
        stack[top]=new node();
        
        return true;
        
    }

    boolean pushnode(int num){ //checks to make sure theres enough space, then stores a node at the top index according to user input
       
        if(top==size-1){
           stack=arrExpand(stack);
        }
        top++;
        stack[top]=new node(num);
        return true;
        
    }

    node pop(){ 
        if (isEmpty()){ //checks to make sure theres information in the array before trying to pop
            System.out.println("Underflow err");
            return null;
        }
        else{
            top--;
            return stack[top+1]; 
        }
    }

    node peek(){
        if (isEmpty()){
            System.out.println("Underflow err");
            return null;
        }
        else{
            return stack[top];
        }
    }

    boolean isEmpty(){
        if (top==-1)
            return true;
        else
            return false;
    }

    boolean isFull(){
        if (top==size-1)
            return true;
        else
            return false;
    }

    void reset(){
        top=-1;
        size=3;
        stack=new node[size];
    }

    node[] arrExpand(node oldArr[]){ //replaces array with a deep copy of old array thats twice the size when called

		node expandArr[] = new node[oldArr.length*2];
        for(int i=0;i<top+1;i++){
			expandArr[i]=oldArr[i].deepCopy();
		}
        size=expandArr.length;
		return expandArr;
	}

    void showAll(){ //prints every node
	    	for(int i=0;i<top+1;i++) { 
				System.out.printf("node "+(i+1)+": ");
	    		System.out.println(stack[i].toString());
	    	}
	}

}