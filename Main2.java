import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean menu = true;

    Instructorr instructor1 = new Instructorr(1223, "majid", "Erwan Majid", "Basic Program");
    Participant participant1 = new Participant(9990, "Arka", "Febrian Arka", "Basic Program");
    Course course1 = new Course(1873, "Basic Program", "This session to practice basic program in HTML ", 19000);
    Video video1 = new Video(3840, "2 Hours", "Basic HTML 1 ", "Video");
    Payment payment1 = new Payment(84848, 27, 19000, "Transfer");

        while (menu=true) {
            System.out.println("Welcome to E-Course");
            System.out.println("1.Choose course");
            System.out.println("2.info your course ");
            System.out.println("3.payment method");
            System.out.println("4.exit");
            System.out.println("Enter your choice");
            int input = scan.nextInt();

            if (input  == 1) {
                System.out.println("Choose your course");
                System.out.println("1.");
                course1.Courseinfo();
                
            }
        }

        System.out.println("Thank you for registering our course " + participant1.getnickName());
        System.out.println("your info : ");
        participant1.infoParticipant();
        System.out.println("Payment details ");
        payment1.detailPembayaran();
        System.out.println();
        System.out.println("Here the detail about our course: \n" +course1.getdescription());
        System.out.println("Instructor : " );
        instructor1.infoinstructor();
        instructor1.introduceSelf();
        System.out.println("info video :");
        video1.infoVideo();
        System.out.println();
    }
}
