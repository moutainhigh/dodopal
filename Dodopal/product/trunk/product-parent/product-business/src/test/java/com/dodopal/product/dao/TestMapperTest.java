package com.dodopal.product.dao;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dodopal.product.business.dao.LoadOrderMapper;
import com.dodopal.product.business.dao.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:product-business-test-context.xml"})
public class TestMapperTest {

    @Autowired
    private TestMapper testMapper;
    
    
    @Autowired
    private LoadOrderMapper mapper;

//    @Test
    public void testFindTest() {
        try {
            com.dodopal.product.business.model.Test test = new com.dodopal.product.business.model.Test();
            test.setName("123");
            test.setAppName("product");
            test.setDescription("Junit test");
            List<com.dodopal.product.business.model.Test> testResult = testMapper.findTest(test);

            if (testResult != null) {
                System.out.println("##########################################");
                System.out.println(ReflectionToStringBuilder.toString(testResult, ToStringStyle.MULTI_LINE_STYLE));
                System.out.println("##########################################");
                for (com.dodopal.product.business.model.Test dp : testResult) {
                    System.out.println("##########################################");
                    System.out.println(ReflectionToStringBuilder.toString(dp, ToStringStyle.MULTI_LINE_STYLE));
                    System.out.println("##########################################");
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

//    @Test
    public void testFindTestById() {
        try {
            com.dodopal.product.business.model.Test testResult = testMapper.findTestById("22");

            System.out.println("##########################################");
            System.out.println(ReflectionToStringBuilder.toString(testResult, ToStringStyle.MULTI_LINE_STYLE));
            System.out.println("##########################################");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

//    @Test
    public void testInsertTest() {
        try {
            com.dodopal.product.business.model.Test test = new com.dodopal.product.business.model.Test();
            test.setName("test4");
            test.setDescription("test description");
            test.setCreateDate(new Date());
            test.setCreateUser("1");
            test.setUpdateDate(new Date());
            test.setUpdateUser("1");
            testMapper.insertTest(test);

            System.out.println("##########################################");
            System.out.println("##########################################");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    @Test
    public void testDeleteTest() {
        try {
            String id = "6635C33E7E694A6BB073B1778418B5F5";
            testMapper.deleteTest(id);

            System.out.println("##########################################");
            System.out.println("id= [" + id + "]");
            System.out.println("##########################################");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

//    @Test
    public void testUpdateTest() {
        try {
            String id = "C13B5A6B080446B4A9AB85EBE28AEFA7";
            com.dodopal.product.business.model.Test test = new com.dodopal.product.business.model.Test();
            test.setName("updateName");
            testMapper.updateTest(test);
            test.setDescription("update description");
            test.setUpdateDate(new Date());
            test.setUpdateUser("1");
            System.out.println("##########################################");
            System.out.println("id= [" + id + "]");
            System.out.println("##########################################");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
