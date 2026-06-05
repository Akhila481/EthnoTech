import java.util.Scanner;

class HistoryNode {
    String page;
    HistoryNode next;

    HistoryNode(String page) {
        this.page = page;
        this.next = null;
    }
}

class BrowserHistory {
	HistoryNode head = null;

    // Visit a new page
    void visitPage(String page) {
    	HistoryNode newNode = new HistoryNode(page);

        if (head == null) {
            head = newNode;
        } else {
        	HistoryNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        System.out.println(page + " visited.");
    }

    // Display history
    void displayHistory() {
        if (head == null) {
            System.out.println("No pages visited.");
            return;
        }

        HistoryNode temp = head;

        System.out.println("Browsing History:");

        while (temp != null) {
            System.out.println(temp.page);
            temp = temp.next;
        }
    }

    // Search page
    void searchPage(String page) {
    	HistoryNode temp = head;

        while (temp != null) {
            if (temp.page.equals(page)) {
                System.out.println(page + " found in history.");
                return;
            }
            temp = temp.next;
        }

        System.out.println(page + " not found.");
    }

    // Delete page
    void deletePage(String page) {

        if (head == null) {
            System.out.println("History is empty.");
            return;
        }

        if (head.page.equals(page)) {
            head = head.next;
            System.out.println(page + " deleted.");
            return;
        }

        HistoryNode temp = head;

        while (temp.next != null &&
               !temp.next.page.equals(page)) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println(page + " not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println(page + " deleted.");
        }
    }

    // Count pages
    void countPages() {
        int count = 0;

        HistoryNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Pages Visited: " + count);
    }
}

public class Browsing_History {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BrowserHistory bh = new BrowserHistory();

        while (true) {

            System.out.println("\n1.Visit Page");
            System.out.println("2.Display History");
            System.out.println("3.Search Page");
            System.out.println("4.Delete Page");
            System.out.println("5.Count Pages");
            System.out.println("6.Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter page name: ");
                    String page = sc.nextLine();
                    bh.visitPage(page);
                    break;

                case 2:
                    bh.displayHistory();
                    break;

                case 3:
                    System.out.print("Enter page to search: ");
                    page = sc.nextLine();
                    bh.searchPage(page);
                    break;

                case 4:
                    System.out.print("Enter page to delete: ");
                    page = sc.nextLine();
                    bh.deletePage(page);
                    break;

                case 5:
                    bh.countPages();
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}