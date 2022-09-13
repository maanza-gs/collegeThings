class Customer{
    public:
    String name;
    boolean member;
    String memberType;

    Customer() {
        name = "";
        member = false;
        memberType = "";
    }

    Customer(String name){
        this.name = name;
        member = false;
        memberType = "";
    }

    String getName(){
        return this.name;
    }

    boolean isMember(){
        return this.member;
    }

    void setMember(boolean member){
        this.member=member;
    }

    String getMemberType(){
        return this.memberType;
    }

    void setMemberType(String type){
        this.memberType = type;
    }
}

class Visit extends Customer{
    public:
        Customer C;


}

public class CObject{
    public static void main[String[] args]{
        Scanner s = new Scanner(System.in);
        Customer c = new Customer("Mac");
        c.setMember(true);
        c.memberType("Premium");
        System.out.print("Member Type: " + c.getMemberType());
    }
}

