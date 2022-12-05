/**
 * @author liuxiangyu
 * @data 2022 2022/12/5
 */
public class Account {
    /**
     * 账户id
     */
    private String id;
    /**
     * 用户名称
     */
    private String name;
    /**
     * 账户密码
     */
    private String password;
    /**
     * 用户身份证信息
     */
    private String identifyId;
    /**
     * 用户电话号码
     */
    private String phone;
    /**
     * 用户性别，格式为：W为女，M为男
     */
    private char sex;
    /**
     * 用户生日，格式为：1971-10-01
     */
    private String birthday;
    /**
     * 账户余额
     */
    private float balance;
    /**
     * 账户备注信息
     */
    private String memo;

    /**
     * 账户的构造方法
     * @param id 账户id
     * @param name 用户名称
     * @param password 账户密码
     * @param identifyId 用户身份证
     * @param phone 用户电话
     * @param sex 用户性别
     * @param birthday 用户生日
     * @param balance 账户余额
     * @param memo 账户备注信息
     */
    public Account(String id,String name,String password,String identifyId,String phone,
                   char sex,String birthday,float balance,String memo) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.identifyId = identifyId;
        this.phone = phone;
        this.sex=sex;
        this.birthday = birthday;
        this.balance = balance;
        this.memo = memo;
    }

    /**
     * 获取账户id
     * @return 账户id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置账户id
     * @param id 账户id
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * 获取用户名称
     * @return 用户名称
     */
    public String getName() {
        return name;
    }
    /**
     * 设置用户名称
     * @param name 用户名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 设置账户密码
     * @param password 设置账户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户身份证信息
     * @return 用户身份证信息
     */
    public String getIdentifyId() {
        return identifyId;
    }
    /**
     * 设置用户身份证信息
     * @param identifyId 用户身份证信息
     */
    public void setIdentifyId(String identifyId) {
        this.identifyId = identifyId;
    }
    /**
     * 获取用户电话号码
     * @return 用户电话号码
     */
    public String getPhone() {
        return phone;
    }
    /**
     * 设置用户电话号码
     * @param phone 用户电话号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取用户性别
     * @return 用户性别
     */
    public String getSex() {
        if (sex == 'M')
            return "男";
        else
            return "女";
    }

    /**
     * 设置用户性别
     * @param sex 用户性别
     */
    public  void setSex(char sex){
        this.sex=sex;
    }
    /**
     * 获取用户性别
     * @return 用户性别
     */
    public String getBirthday() {
        return birthday;
    }
    /**
     * 设置用户生日
     * @param birthday 用户生日
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    /**
     * 获取账户余额
     * @return 账户余额
     */
    public float getBalance() {
        return balance;
    }
    /**
     * 设置账户余额
     * @param balance 账户余额
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }
    /**
     * 获取账户备注信息
     * @return 账户备注信息
     */
    public String getMemo() {
        return memo;
    }
    /**
     * 设置账户备注信息
     * @param memo 账户备注信息
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }


}
