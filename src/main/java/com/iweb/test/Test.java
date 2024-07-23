package com.iweb.test;

/** JDBC java dataBase connection
 * @author Yanyi
 * @date 2024/7/22 下午2:47
 */
public class Test {
    public static void main(String[] args) {
//        //驱动加载
//        try{
//        Class.forName("com.mysql.jdbc.Driver");
//        }catch(ClassNotFoundException e){
//            e.printStackTrace();
//        }
//        System.out.println("驱动加载成功!");
//        //获取JDBC连接
//        String url = "jdbc:mysql://localhost:3306/nuist?characterEncoding=utf8";
//        String userName = "root";
//        String password = "a12345";
//        Connection connection = null;
//        try{
//         connection = DriverManager.getConnection(url, userName, password);
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//        System.out.println("获取连接成功!");
//        try{
//        Statement s = connection.createStatement();
//        //准备一个SQL语句
//            String sql = "insert into student"+ "(name,gender,birthday,addr,qqnumber)VALUES" +
//                    "('刘不赋泽','男','2003-02-15','江苏宿迁','312123312')";
//            //运行sql语句
//            s.execute(sql);
//            //驱动加载 连接获取 创建编译语句对象 执行语句
//            //查询语句 连接获取 创建编译语句对象 执行语句 获取查询结果集
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//        Student s1 = new Student(0,"无畏","男",new Date(),"南京",114514);
//        StudentDAO studentDAO = new StudentDAOImpl();
//        studentDAO.insert(s1);
//        Student s2 = new Student(6,"不留情","男",new Date(),"南京",1919810);
//        studentDAO.update(s2);
    }
}
