public class Person implements Greeter{
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        try {
            this.firstName = firstName;
            this.lastName = lastName;

        } catch (IllegalArgumentException e) {
            System.out.println("You must provide a First and Last name");
        }

    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String sayHello() {
        System.out.println("Hello from " + firstName + " " + lastName);
        return null;
    }


}
