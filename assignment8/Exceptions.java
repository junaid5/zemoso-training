package intro.assignment8;

class Validate{
    String name="junaid";
    String password="password";
    String number="84567890134";
    public void check(String employeeName,String employeePassword,String employeeNumber) throws NameException,PasswordException,NumberException{
        if(!name.equals(employeeName)){
            throw new NameException("the enterd name is wrong");
        }
        if(!password.equals(employeePassword)){
            throw new PasswordException("the enterd password is wrong");
        }
        if(!number.equals(employeeNumber)){
            throw new NumberException("the enterd number is wrong");
        }
    }
}

class NameException extends Exception{
        NameException(String message){
            super(message);
        }
}

class PasswordException extends Exception{
    PasswordException(String message){
        super(message);
    }
}

class NumberException extends Exception{
    NumberException(String message){
        super(message);
    }
}

public class Exceptions {
    public static void main(String[] args) {
        Validate v=new Validate();
        try {
            v.check("junaid", "password", "798730495");
        }
        catch (NameException e){
            e.printStackTrace();
        }
        catch (PasswordException e){
            e.printStackTrace();
        }
        catch (NumberException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Exception occured");
        }
    }
}
