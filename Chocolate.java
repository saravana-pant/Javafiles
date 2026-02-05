class Chocolate {

    int barCode;
    String name;
    double weight;
    double cost;

    Chocolate()
    {
        barCode = 101;
        name = "Cadburry";
        weight = 12;
        cost = 10;
    }
    Chocolate(int barCode,String name,double weight,double cost)
    {
        this.barCode = barCode;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }
    void display()
    {
        System.out.println("Bar Code : "+barCode);
        System.out.println("Name : "+name);
        System.out.println("Weight : "+weight);
        System.out.println("Cost : "+cost);
    }
    public static void main(String[] args) {
        Chocolate c1 = new Chocolate();
        Chocolate c2 = new Chocolate(101,"Cadburry",12,10);
        c1.display();
    }
}

