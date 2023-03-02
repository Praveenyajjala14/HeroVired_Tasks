import java.util.Scanner;

class Product {
    private int productId;
    private String name;
    private String specification;
    private double cost;
    private int count;

    public Product(int productId, String name, String specification, double cost, int count) {
        this.productId = productId;
        this.name = name;
        this.specification = specification;
        this.cost = cost;
        this.count = count;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getSpecification() {
        return specification;
    }

    public double getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

public class InventoryManagementSystem {
    private Product[] inventory;
    private int inventorySize;

    public InventoryManagementSystem() {
        inventory = new Product[100];
        inventorySize = 0;
    }

    public void addProduct(int productId, String name, String specification, double cost, int count) {
        inventory[inventorySize++] = new Product(productId, name, specification, cost, count);
    }

    public void viewProductList() {
        System.out.println("Product List:");
        for (int i = 0; i < inventorySize; i++) {
            System.out.println(inventory[i].getProductId() + ": " + inventory[i].getName());
        }
    }

    public void viewProductCount(int productId) {
        for (int i = 0; i < inventorySize; i++) {
            if (inventory[i].getProductId() == productId) {
                System.out.println(inventory[i].getCount());
                return;
            }
        }
        System.out.println("Product not found");
    }

    public void viewProductDetails(int productId) {
        for (int i = 0; i < inventorySize; i++) {
            if (inventory[i].getProductId() == productId) {
                System.out.println("Product Specification: " + inventory[i].getSpecification());
                System.out.println("Product Cost: " + inventory[i].getCost());
                System.out.println("Product Count: " + inventory[i].getCount());
                return;
            }
        }
        System.out.println("Product not found");
    }

    public void editProduct(int productId) {
        for (int i = 0; i < inventorySize; i++) {
            if (inventory[i].getProductId() == productId) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter new specification: ");
                String specification = sc.nextLine();
                System.out.print("Enter new cost: ");
                double cost = sc.nextDouble();
                System.out.print("Enter new count: ");
                int count = sc.nextInt();
                sc.close();
                inventory[i].setSpecification(specification);
                inventory[i].setCost(cost);
                inventory[i].setCount(count);
                return;
                  
            }
            
        }
        System.out.println("Product not found");
    }

    public void updateInventory(int productId, int quantity) {
        for (int i = 0; i < inventorySize; i++) {
            if (inventory[i].getProductId() == productId) {
                inventory[i].setCount(inventory[i].getCount() + quantity);
                return;
            }
        }
        System.out.println("Product not found");
    }

    public static void main(String[] args)
    {
        InventoryManagementSystem a = new InventoryManagementSystem();
        // Product p;
        int pid,ch;
        String pname,psep;
        int pcount;
        double pcost;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Add product Details\n2.Product list\n3.Product Count\n4.View product Details\n5.Edit product\n6.Update Inventory\n7.exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    pid=sc.nextInt();
                    pname=sc.nextLine();
                    psep=sc.nextLine();
                    pcount=sc.nextInt();
                    pcost=sc.nextDouble();
                    // p=new Product(pid, pname, psep, pcost, pcount);
                    a.addProduct(pid, pname, psep, pcost, pcount);
                    break;

                case 2:
                    a.viewProductList();
                    break;
                
                case 3:
                    pid=sc.nextInt();
                    a.viewProductCount(pid);
                    break;

                case 4:
                    pid=sc.nextInt();
                    a.viewProductDetails(pid);
                    break;

                case 5:
                    pid=sc.nextInt();
                    psep=sc.nextLine();
                    pcost=sc.nextDouble();
                    pcount=sc.nextInt();
                    a.editProduct(pid);
                    break;
                
                case 6:
                    pid=sc.nextInt();
                    pcount=sc.nextInt();
                    a.updateInventory(pid, pcount);
                    break;
                case 7:
                    System.exit(0);


            }
        sc.close();
        }
    }
}
