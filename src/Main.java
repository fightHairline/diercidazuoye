import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ${USER}
 * @data ${YEAR} ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("62021020001", "张三", "123456", "620210200010101010", "13800138000", 'M', "2001-01-01", 2000, "张三的账户"));
        accounts.add(new Account("62021020002", "李四", "abcdef", "130210209901010109", "15600138011", 'M', "2006-05-05", 1000, "李四的账户"));
        accounts.add(new Account("62021020003", "王五", "123abc", "410210200880101010", "14800138648", 'M', "2004-10-01", 2000, "王五的账户"));
        Scanner sc=new Scanner(System.in);
        Operation operation = Operation.getInstance();
        int key;
        do{
            showMenu();
            key=sc.nextInt();
            switch(key){
                case 1:
                {
                    operation.queryAccount(accounts.get(0));
                    break;
                }
                case 6:
                default:
                {
                    System.exit(0);
                }
            }
        }while(true);

    }
    private static void showMenu() {
        System.out.println("1.查询账户信息");
        System.out.println("2.存款");
        System.out.println("3.取款");
        System.out.println("4.转账");
        System.out.println("5.查询余额");
        System.out.println("6.退出");
    }
}