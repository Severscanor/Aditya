import java.util.scanner.*;
class Publications{
    String title;
    int price,copies;
    int saleCopy(){
        System.out.println("total cost of publication is :"+ price*copies);
        return price*copies;
    }
}
class Book extends Publications{
    String author;
    void orderCopies(){
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the title of the book:");
        title=S.nextLine();
        System.out.println("Enter the author of the book:");
        author=S.nextLine();
        System.out.println("Enter the price of the book:");
        price=S.nextInt();
        System.out.println("Enter the no of copies the book:");
        copies=S.nextInt();
    }
    int saleCopy(){
        System.out.println("Total cost of books is:"+price*copies);
        return price*copies;
    }

}
class Magazine extends Publications{
    int orderQty;
    String currentIssue;
    receiveNewIssue(){
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the order quantity:");
        orderQty=S.nextInt();
        System.out.println("Enter the current Issue:");
        currentIssue=S.nextLine();

    }
    int saleCopy() {
        System.out.println("Total cost of magazine is:"+price*copies);
        return price*copies;
    }
}
public class assignment3 {
    public static void main(String[]args){
        book B=new book();
        System.out.println("Enter the details of book:");
        B.orderCopies();
        B.saleCopy();

    }
}
