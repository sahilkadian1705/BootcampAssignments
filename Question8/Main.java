package Question8;
class Resource implements AutoCloseable{
    public Resource(){
        System.out.println("Resource Created");
    }
    public void display(){
        System.out.println("Resource Display Method");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Resource Clean Up");
    }
}
class Resource2 implements AutoCloseable{
    public Resource2(){
        System.out.println("Resource2 Created");
    }
    public void display(){
        System.out.println("Resource2 Display Method");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Resource2 Clean Up");
    }
}
public class Main {
    public static void main(String[] args) {
        Resource resource=new Resource();
        Resource2 resource2=new Resource2();
        try(resource;resource2){
            resource.display();
            resource2.display();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
