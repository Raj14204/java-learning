public class conditional {
    public static void main(String a[]) {
        int x = 8;
        int y=11;
        String result = "";
        if (x > 10) 

            System.out.println("hello"); //if we have one statement then we can ignore the braces even indent is not needed 
        else if(y<10)

        System.out.println("bye");
        else
        System.out.println("ahaha");

        // in one line 
        result = x%2 ==0 ? "hello" : "bye";

        switch(x){
            case 8:
                System.out.println("same as other");
                break;
            default:
                System.out.println("same as other");
                break;    
        }

        System.out.println(result);

    }
}