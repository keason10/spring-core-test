package gy.spel;

import gy.spel.baseClass.Society;
import org.springframework.context.ApplicationContext;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.lang.reflect.Method;

public class MyLanguageReferenceTest {
    public static void main(String[] args) throws Exception {
        ExpressionParser parser = new SpelExpressionParser();
        String bc = parser.parseExpression("'abc'.substring(1, 3)").getValue(String.class);
        System.out.println(bc);


        //从上下文中调用方法
        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();
        Class<Society> societyClass = (Class<Society>) Thread.currentThread().getContextClassLoader().loadClass("gy.spel.baseClass.Society");
        //設置method
        for (Method method : societyClass.getDeclaredMethods()) {
            context.setVariable(method.getName(), method);
        }
        //设置值
        context.setVariable("key", "value");
        //调用method
        String aBoolean = parser.parseExpression(
                "#showMe('hello')").getValue(context, String.class);
        //使用变量
        System.out.println(parser.parseExpression("#key").getValue(context, String.class));

        //从上下文中获取bean  和 factoryBean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        StandardEvaluationContext standardEvaluationContext = new StandardEvaluationContext();
        standardEvaluationContext.setBeanResolver(new BeanFactoryResolver(applicationContext));
        Object bean = parser.parseExpression("@society").getValue(standardEvaluationContext);
        Object beanFactory = parser.parseExpression("&society").getValue(standardEvaluationContext);
    }
}
