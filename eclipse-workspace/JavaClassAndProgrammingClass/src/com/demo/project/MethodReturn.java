class MethodReturn {
    public static void main(String[] args){
        System.out.println(returnNumber());
        System.out.println(returnLetter());
        System.out.println(returnDouble());
        System.out.println(addNumbers(3,3));
    }
    public static int returnNumber(){
        return(4);
    }
    public static char returnLetter(){
        return('g');
    }
    public static double returnDouble(){
        return(10.5);
    }
    public static int addNumbers(int num1, int num2){
        int sum = num1 + num2;
        return(sum);
    }
}
