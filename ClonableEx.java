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

class Company implements Cloneable{
     
    String name;
      
    Company(String name){ this.name = name; }
 
    public Company clone() throws CloneNotSupportedException{
     
        return (Company) super.clone();
    }
}

class Person implements Cloneable{
 
    String name;
    Company company;
      
    Person(String name, Company company){ 
 
        this.name = name; 
        this.company = company;
    }
 
    void print(){
        System.out.printf("Person %s works in %s\n", name, company.name);
    }
 
    public Person clone() throws CloneNotSupportedException{
       
        Person person = (Person) super.clone();
        person.company =(Company) company.clone();
        return person;
    }
}