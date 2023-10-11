package com.mashibing.spring01.demo02.factorybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author spikeCong
 * @date 2022/10/25
 **/
public class SpringTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        StudentBean studentBean = (StudentBean) context.getBean("studentBean");
//        System.out.println(studentBean);

        //当用户使用容器本身时,可以使用转义符 "&" 来得到FactoryBean本身,以此来区分Factorybean产生的实例对象和FactoryBean本身
        StudentBean studentBean = (StudentBean) context.getBean("&studentBean");
        studentBean.study();

        // 这个会报错 因为 &studentBean 得到 FactoryBean本身 ，
        // com.mashibing.spring01.demo02.factorybean.StudentBean cannot be cast to com.mashibing.spring01.demo02.factorybean.TeacherBean
//        TeacherBean teacherBean1 = (TeacherBean) context.getBean("&studentBean");
//        teacherBean1.teach();



        TeacherBean teacherBean = (TeacherBean) context.getBean("studentBean");
        teacherBean.teach();

        // 这个会报错, 会调用 StudentBean 的 getObject()方法，
        // com.mashibing.spring01.demo02.factorybean.TeacherBean cannot be cast to com.mashibing.spring01.demo02.factorybean.StudentBean
//        StudentBean studentBean1 = (StudentBean) context.getBean("studentBean");
//        studentBean1.study();
    }
}
