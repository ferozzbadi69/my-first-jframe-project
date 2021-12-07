package bouns;
public class id {
    private String name;
    private int age,id;
    public void setname(String name){
    this.name=name;
    }
    public void setage(int age){
    this.age=age;
    }
    public void setid(int id){
    this.id=id;
    }
    public String getname(){
    return name;
    }
    public int getage(){
    return age;
    }
    public int getid(){
    return id;
    }
    public void printinfo(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("id: " + id);
    }
    
}
