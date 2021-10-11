public class calculator {
    
    int quikMaf(String operation,int num1, int num2){

        int result=0;
        
        String plus = "+";
        String minus = "-";
        String divide = "/";
        String multiply = "*";


        if(plus.equals(operation)){
            result=num1+num2;
            System.out.println(num1 +"+" +num2 +"=" +result);
        }
        else if(minus.equals(operation)){
            result=num1-num2;
            System.out.println(num1 +"-" +num2 +"=" +result);
        }
        else if(multiply.equals(operation)){
            result=num1*num2;
            System.out.println(num1 +"*" +num2 +"=" +result);
        }
        else if(divide.equals(operation)){
            result=num1/num2;
            System.out.println(num1 +"/" +num2 +"=" +result);
        }
        else{
            System.out.println("Invalid operator");
        }
        return result;
    }

}
