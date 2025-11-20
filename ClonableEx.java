public class ClonableEx {
    public static void main(String[] args) {
           
        try{
            Company yandex = new Company("Yandex");
            Person tom = new Person("Tom", yandex);
 
            Person bob = tom.clone();  
 
            bob.name = "Bob";
            bob.company.name = "Google";
 
            tom.print();       
            bob.print();      
        }
        catch(CloneNotSupportedException ex){
                         
            System.out.println("Clonable not implemented");
        }
    }
}

class Company implements Cloneable {
    String name;

    public Company(String name) {
        this.name = name;
    }

    public Company clone(){
        return (Company) super.clone();
    }
}

class Person implements Clonable {
    String name;
    Company company;

    public Person(String name, Company company) {
        this.name = name;
        this.company = company
    }


    public Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        Person.company = (Company) company.clone();
        return person;
    
    }

}