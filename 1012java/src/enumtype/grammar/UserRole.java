package enumtype.grammar;

import java.util.Locale;

public enum UserRole {

    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN;

    UserRole() {

        System.out.println("초기화 = " + this.name());
    }

    public String getNameToLowerCase() {

        return this.name().toLowerCase(Locale.ROOT);
    }

}
