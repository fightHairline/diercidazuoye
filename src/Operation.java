/**
 * @author liuxiangyu
 * @data 2022 2022/12/5
 */
public class Operation {
//单例设计
    private static Operation operation = new Operation();
    private Operation() {}
    public static Operation getInstance() {
        return operation;
    }
    //存款
    public void deposit(Account account, double money) {
        account.setBalance(account.getBalance() + money);
    }
    //取款
    public void withdraw(Account account, double money) {
        account.setBalance(account.getBalance() - money);
    }
    //转账
    public void transfer(Account account1, Account account2, double money) {
        account1.setBalance(account1.getBalance() - money);
        account2.setBalance(account2.getBalance() + money);
    }
    //查询余额
    public void queryBalance(Account account) {
        System.out.println("账户余额为：" + account.getBalance());
    }
    //查询账户信息
    public void queryAccount(Account account) {
        System.out.println("账户id：" + account.getId());
        System.out.println("账户名称：" + account.getName());
        System.out.println("账户身份证：" + account.getIdentifyId());
        System.out.println("账户电话：" + account.getPhone());
        System.out.println("账户性别：" + account.getSex());
        System.out.println("账户生日：" + account.getBirthday());
        System.out.println("账户余额：" + account.getBalance());
        System.out.println("账户备注：" + account.getMemo());
    }




}
