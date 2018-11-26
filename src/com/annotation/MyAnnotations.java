
/**    
* @Title: MyAnnotations.java  
* @Package com.annotation  
* @Description: TODO(注解的类型和定义方式；)  
* @author yijvyan  
* @date 2018年7月9日  
* @version V1.0    
*/

package com.annotation;

/** @ClassName: MyAnnotations
 * @Description: TODO(自定义注解；)
 * @author yijvyan
 * @date 2018年7月9日 */
@SimpleAnno
//@AttributeAnno(a = 1, flag = true, str = "hello")
//@AttributeAnno(a = 1, str = "hello", c = User.class)
//@AttributeAnno(a = 1, str = "hello", c = User.class, simpleAnno = @SimpleAnno)
//@AttributeAnno(a = 1, str = "hello", c = User.class, simpleAnno = @SimpleAnno, color = Color.RED)
@AttributeAnno(a = 1, str = "hello", c = User.class, simpleAnno = @SimpleAnno, color = Color.RED, arrs = { "first", "second", "third" })
//@ValueAnno("blank")
//@ValueAnno(value = "blank", i = 1)
@ValueAnno("blank")
public class MyAnnotations
{
	
}


//1.定义一个最简单的注解：名称是SimpleAnno；
@interface SimpleAnno
{
	
}


//2.定义一个带有属性的注解：AttributeAnno；
//3.定义注解的属性，注解的属性的类型：
//3.1.基本数据类型；
//3.2.String类型；
//3.3.Class类型；
//3.4.注解类型；
//3.5.枚举类型；
//3.6.以上类型的一维数组；
@interface AttributeAnno
{
	int a();
	
	//	boolean flag();
	boolean flag() default false;
	
	String str();
	
	//	Date date();
	
	Class c();
	
	//3.4.注解类型；
	SimpleAnno simpleAnno();
	
	//3.5.枚举类型；
	Color color();
	
	//3.6.以上类型的一维数组；
	String[] arrs();
}


class User
{
	
}


enum Color
{
	RED, BLUE, BLACK, YELLOW;
}


//4.属性名为value的初始值的自定义注解@ValueAnno；
//5.特殊的属性名称：value；
//5.1.如果使用注解的时候，只出现了value属性，value属性是可以省略的；
@interface ValueAnno
{
	//	String value();
	String value();
	
	//	int i();
	int i() default 1;
}
