import java.util.*;

public class Driver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useDelimiter(System.lineSeparator());

        nodeManager stack=new nodeManager();
        calculator c= new calculator();
        node one=new node(); 
        node two=new node();
        int result;

        System.out.println("Enter an expression in postfixed notation");
        String mathExpression=input.next();
        String thisToken;
        StringTokenizer tokens = new StringTokenizer(mathExpression);

        while(tokens.hasMoreTokens()){
            thisToken=tokens.nextToken();
            try{
                int i=Integer.parseInt(thisToken); //converts token to an integer if it is one, otherwise assumes user inputted an operator and attempts to use that operator in catch
                stack.pushnode(i);
            }
            catch(Exception e){
                
                two=stack.pop();  //grabs the two items on top of the stack
                one=stack.pop();

                result=c.quikMaf(thisToken,one.getValue(),two.getValue()); // sends the non-integer value and the values of the most recent two entries to the calculator method

                stack.pushnode(result);
            }
        }

        stack.showAll(); //prints final result
    }
}
