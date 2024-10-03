import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Product product = new Product();
    System.out.println("Adicione o produtos: ");
    System.out.println("name");
    product.name = scanner.nextLine();
    System.out.println("preço");
    product.price = scanner.nextDouble();
    System.out.println("quantidade");
    product.quantity = scanner.nextInt();

    System.out.println();   
    System.out.println("produto " + product);

    System.out.println();
    System.out.println("Coloque a quantidade de produtos que deseja adicionar");
    int quantity = scanner.nextInt();
    product.addProducts(quantity);

    System.out.println();
    System.out.println("produto " + product);

    System.out.println();
    System.out.println("Coloque a quantidade de produtos que deseja remover");
    int quantity1 = scanner.nextInt();
    product.removeProducts(quantity1);
    
    System.out.println();
    System.out.println("produtos: " + product);
    
   scanner.close(); 
 }
}
