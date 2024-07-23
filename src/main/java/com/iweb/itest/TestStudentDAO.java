package com.iweb.itest;

import com.iweb.DAO.StudentDAO;
import com.iweb.DAO.impl.StudentDAOImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**测试类用于DAO测试 1919
 * @Test 用将指定方法标记为测试方法 可以不依赖于main方法的直接运行
 * @Before 在所有测试方法运行之前执行的代码 一般用于环境的初始化
 * @After 在所有测试方法运行之后执行的代码 一般用于资源回收
 * @author Yanyi
 * @date 2024/7/23 上午11:02
 */

public class TestStudentDAO {
    private StudentDAO studentDAO;
    @Before
    public void init(){
        studentDAO = new StudentDAOImpl();
    }
    @Test
    public void testFindById(){
//        System.out.println(studentDAO.findById(1));
        Assert.assertNotNull(studentDAO.findById(2));//断言类 用于验证预期和结果是否一致
    }
    @Test
    public void testCount(){
        Assert.assertEquals(6,(long)studentDAO.count());
    }
    @Test
    public void testFindAll(){
        Assert.assertNotNull(studentDAO.findAll());
    }
    @Test
    public void testFindByNameLike(){
        Assert.assertNotNull(studentDAO.findByNameLike("刘"));
    }
    @Test
    public void testFindByNameLikeWithLimit(){
        Assert.assertNotNull(studentDAO.findByNameLikeWithLimit("刘",0,2));
    }
    @Test
    public void testFindWithLimit(){
        Assert.assertNotNull(studentDAO.findWithLimit(0,2));
    }
}
