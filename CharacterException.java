import java.util.Scanner;

public  class CharacterException extends RuntimeException{
    public CharacterException()
    {
        super();
    }
    public CharacterException(String name)
    {
        super(name);
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("请依次输入字符(one at a time)：");
            String str = input.nextLine();
            if(!str.matches("[a-zA-Z]+"))
            {
                throw new CharacterException("Warning: a non-alphabetic character is existing!");
            }
        }

    }
}
