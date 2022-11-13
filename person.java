package nusput;

public class person {
    String name;
    String address;

    person(String name,String address){
        this.name=name;
        this.address=address;
    }
    
    public String getname(){
        return name;
    }
    
    public String getaddress(){
        return address;
    }
    
    public void setaddress(String address){
        this.address=address;
    }
    
    public String toString(){
      return name + "(" + address + ")";
    }
}


