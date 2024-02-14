package service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class StringFormat {
    public boolean checkString(String ops){
        return ops.equals("|") || ops.equals("*") || ops.equals("(") || ops.equals(")") || ops.equals("+");
    }

    public ArrayList<String> format(String regex){
        ArrayList<String> formatString = new ArrayList<>();
        StringFormat sf = new StringFormat();
        String tempString = "";
        /** make a queue String for create State */
        for(int i=0;i<regex.length()-1;i++){
            String curr = String.valueOf(regex.charAt(i));
            String nextCurr = String.valueOf(regex.charAt(i+1));
            if(sf.checkString(curr)){
//                Queue<String> temp = new LinkedList<>();
                if(tempString.length() != 0) {
//                    temp.add(tempString);
                    formatString.add(tempString);
//                    allString.add(temp);
                    tempString = "";
                }
                if(curr.equals("*") || curr.equals("+")){
                    continue;
                }
                if(curr.equals(")") && (nextCurr.equals("*") || nextCurr.equals("+"))){
                    curr = curr+nextCurr;
                }
//                Queue<String> temp2 = new LinkedList<>();
//                temp2.add(curr);
                formatString.add(curr);
//                allString.add(temp2);
            }
            else{
                /** make sure next string should not be an operators */
                if(nextCurr.equals("*") || nextCurr.equals("+")) {
                    tempString += curr+nextCurr;
                }else {
                    tempString += curr;
                    if(i == regex.length()-2){
                        tempString += nextCurr;
                    }
                }
//                System.out.println(tempString);
            }
        }
        if(tempString.length() != 0){
//            Queue<String> temp = new LinkedList<>();
//            temp.add(tempString);
            formatString.add(tempString);
//            allString.add(temp);
        }
//        System.out.println(formatString);
        return formatString;
    }
}
