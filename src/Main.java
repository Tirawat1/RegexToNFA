import entity.State;
import service.StringFormat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String regex = "(abb|bb*a*)abb";
        StringFormat sf = new StringFormat();
        ArrayList<String> formatString = sf.format(regex);
        Stack<State> allState = new Stack<State>();
        for(int i = 0;i<formatString.size();i++){

            String value = formatString.get(i);
            System.out.println(value);

            if(sf.checkString(value)){
                if(value.equals("(")){

                }else if(value.equals(")")){

                }else if(value.equals("|")){

                }else if(value.equals("*")){

                }else if(value.equals("+")){

                }else {
                    System.out.println("error");
                    break;
                }
            }else{
//                for(int j=0;j<value.length();j++){
//                    String curr = String.valueOf(value.charAt(j));
//                    System.out.println(curr);
//                }
            }
        }


//        for(Queue<String> i : allString){
//            System.out.println(i);
//        }
    }
}