public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(500, 1500, 2021);
        System.out.println("weight: " + notebook.weight + " " + "price: " +  notebook.price + " " + "Production year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkAlldata();

        Notebook heavyNotebook = new Notebook(1500, 1000, 2015);
        System.out.println("weight: " + heavyNotebook.weight + " " + "price: " +  heavyNotebook.price + " " + "Production year: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkAlldata();

        Notebook oldNotebook = new Notebook(2500, 500, 2005);
        System.out.println("weight: " + oldNotebook.weight + " " + "price: " + oldNotebook.price + " " + "Production year: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkAlldata();

        Notebook newNotebook = new Notebook(1500, 2000, 2022);
        System.out.println("weight: " + newNotebook.weight + " " + "price: " + newNotebook.price + " " + "Production year: " + newNotebook.year);
        newNotebook.checkPrice();
        newNotebook.checkWeight();
        newNotebook.checkAlldata();



    }
}
