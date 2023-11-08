public class FunWithNames
{
    public static void main(String[] args)
    {
       String firstName = "Donald";
       String middleName = "Richard";
       String lastName = "Dirka";
       String fullName = firstName + " " + middleName + " " + lastName;
       int characterCount = firstName.length() + middleName.length() + 
           lastName.length();
       String login = lastName + firstName.charAt(0) + middleName.charAt(0);
    
       System.out.println("Name: " + fullName);    
       System.out.println("Number of characters in full name: " + characterCount);
       System.out.println("Login id: " + login.toLowerCase());
    }
}