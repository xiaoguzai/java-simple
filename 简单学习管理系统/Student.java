/***
 针对目前我们的所学内容，完成一个综合案例：学生管理系统。该系统主要功能如下：
 添加学生：通过键盘录入学生信息，添加到集合中
 删除学生：通过键盘录入要删除学生的学号，将该学生对象从集合中删除
 修改学生：通过键盘录入要修改学生的学号，将该学生对象其他信息进行修改
 查看学生：将集合中的学生对象信息进行展示
 退出系统：结束程序
 ***/
public class Student {
    private String sid;
    private String name;
    private String age;
    private String address;
    public Student(String sid,String name,String age,String address)
    {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getSid()
    {
        return this.sid;
    }
    public String getName()
    {
        return this.name;
    }
    public String getAge()
    {
        return this.age;
    }
    public String getAddress()
    {
        return this.address;
    }
}
