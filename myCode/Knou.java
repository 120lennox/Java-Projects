class Admin {
    int id;
    String fullName;
    float salary;

    void funcInit(int i, String s, float f){
        id = i;
        fullName = s;
        salary = f;
    }

    void display()
    {
        System.out.println(id + " " + fullName + " " + salary);
    }
}

class AdminPanel{
    public static void main(String []args){
        Admin supperAdmin = new Admin();
        supperAdmin.funcInit(121, "Lennox Mountain", 20_000);
        supperAdmin.display();

    }
}