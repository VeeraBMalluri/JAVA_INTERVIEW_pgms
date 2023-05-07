public class hw {

    public static void main(String[] args) {
        
        String str = "Hello World, Hello World, Hello World, Hello World";

        String[] str1 = str.replace(",", "").split(" ");

        int Hello =0;
        int World =0;
        for (String word : str1) {

            if (word.equals("Hello")){
                Hello ++;
            }
           else if(word.equals("World")){
                World++;
            }
            
       
    }
    System.out.println("Hello = " +Hello);
    System.out.println("World = "+World);
}
}