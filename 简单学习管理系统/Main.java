import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        //本src包下面的文件无需进行导入
        while(true)
        {
            System.out.println("按照数字选择相应的功能");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.结束程序");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            if(choose == 1)
            {
                System.out.println("请输入添加学生的信息");
                String sid = sc.next();
                String name = sc.next();
                String age = sc.next();
                String address = sc.next();
                Student a = new Student(sid,name,age,address);
                list.add(a);
            }
            else if(choose == 2)
            {
                System.out.println("请输入删除学生的学号");
                String sid = sc.next();
                System.out.print(sid);
                for(int i=0;i<list.size();i++)
                {
                    Student s = list.get(i);
                    if(s.getSid().equals(sid))
                    //易错点：这里需要使用equals函数，不能使用==，否则无法删除
                    {
                        list.remove(i);
                        break;
                    }
                }
            }
            else if(choose == 3||choose == 4)
            {
                System.out.println("开始查看学生的信息");
                for(int i=0;i<list.size();i++)
                {
                    System.out.println(list.get(i).getSid()+","+list.get(i).getName()+","+list.get(i).getAge()+","+list.get(i).getAddress());
                }
                System.out.println("查看结束");
            }
            else if(choose == 5)
            {
                break;
            }
        }
    }
}
