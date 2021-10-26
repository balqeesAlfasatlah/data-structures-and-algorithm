package stack.queue;

public class StackQueueBrackets {

    public boolean validateBrackets(String bracket) {

        Stack stack = new Stack();
        for (int i = 0; i < bracket.length(); i++) {
            char elm = bracket.charAt(i);
            if (elm == '(' || elm == '{' || elm == '[') {
                stack.push(elm + "");
            }else if(elm == ')' || elm == '}' || elm == ']'){
                String val = stack.peek();
                if(((elm + "").equals(')' + "") && val.equals('(' + "") ||
                        (elm + "").equals('}' + "") && val.equals('{' + "")||
                        (elm + "").equals(']' + "") && val.equals('[' + ""))
                && !stack.isEmpty()){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
          return stack.isEmpty();

    }


//        for (int i = 0; i < bracket.length(); i++) {
//            String elm = bracket.charAt(i) + "";
//            if (elm == "(" || elm == "{" || elm == "[") {
//                stack.push(elm);
//            } else {
//                if (!stack.isEmpty()) {
//                    String value = stack.peek();
//                    if (elm.equals(')') && value.equals('(')) stack.pop();
//                    else {
//                        if (elm.equals('}') && value.equals('{')) stack.pop();
//                        else if (elm.equals(']') && value.equals('[')) stack.pop();
//                        else stack.push(elm);
//                    }
//                } else stack.push(elm);
//            }
//        }
//
//        if(stack.isEmpty())return true;
//        else return false;
//        }
    }



