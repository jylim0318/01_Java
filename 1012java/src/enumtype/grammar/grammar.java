package enumtype.grammar;

public class grammar {

    public static void main(String[] args) {

        for(UserRole1 role : UserRole1.values()) {

            System.out.println("rolename = " +role.name() + "::rolegetDescription = " + role.getDescription());
        }
    }
}
