public class Shirt {
  public int shirtID = 582; // стандартне значення номера моделі сорочки
  public String description = "Cool oversize shirt for real gansta"; // стандартний опис сорочки
  // коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
  public char colorCode = 'R';
  public double price = 25.99; // стандартна вартість сорочки
  public int quantityInStock = 25; // стандартна кількість на складі
  

  // цей метод просто виводить всю інформацію про сорочку на екран
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
     switch (colorCode) {
            case 'R':
                 System.out.println("Color Code: Red");
                  break;
            case 'B':
                System.out.println("Color Code: Blue");
                break;
            case 'G':
                System.out.println("Color Code: Green");
                break;
            default:
                System.out.println("Color Code: Undefined");
                break;
        };
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  } // кінець методу displayShirtInformation
} // кінець опису класу
