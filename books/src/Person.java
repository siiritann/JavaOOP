public class Person {
    private String userName;
    private String SSN;

    private String getId(){
        return SSN + "-" + userName;
    }

    public String getUserName(){
        return userName;
    }

    public boolean isSamePerson(Person p){
        if (p.getId().equals(this.getId())){
            return true;
        }
        else {
            return false;
        }
    }
}
