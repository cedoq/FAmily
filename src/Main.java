class Person{
    String name;
    public Person(String name) {
        this.name = name;
    }

    }
class Father extends Person{
    String sonName;

    public String getName() {
        return name;
    }

    public Father(String name) {
        super(name);
    }
    public void getSonName(String SonName){
        this.sonName = SonName;
    }
    public void Family(){
        System.out.println("моего сына зовут " + this.sonName);
    }

}
class Son extends Person{

    public Son(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    String FatherName;

    public void getFather(String FatherName){
        this.FatherName = FatherName;
    }


    public void Family(){
        System.out.println("моего отца зовут " + this.FatherName);
    }


}


public class Main {
    public static void main(String[] args) {
        Father man = new Father("jhon");
        Son child = new Son ("martin");
        child.getFather(man.getName());
        man.getSonName(child.getName());
        child.Family();
        man.Family();
    }
}