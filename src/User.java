public class User extends Person{
protected Boolean isAdmin;

    public User(String firstName, String lastName, Boolean isAdmin) {
        super(firstName, lastName);
        this.isAdmin = isAdmin;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    public Boolean isAdmin(){
        if (isAdmin){
            System.out.println("This user IS an Administrator!");
            return true;
        }else {
            System.out.println("This user IS NOT an Administrator!");
            return false;
        }

    }



}
