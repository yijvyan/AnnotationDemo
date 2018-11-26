
/**    
* @Title: JDKThreeAnnotations.java  
* @Package com.annotation  
* @Description: TODO(注解的学习；)  
* @author yijvyan  
* @date 2018年7月9日  
* @version V1.0    
*/

package com.annotation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/** @ClassName: JDKThreeAnnotations
 * @Description: TODO(JDK中提供的三个注解的测试；)
 * @author yijvyan
 * @date 2018年7月9日 */

public class JDKThreeAnnotations
{
	
	/** @Title: main @Description: TODO(主方法；) @param @param args 参数 @return void
	 *         返回类型 @throws */
	
	//	@SuppressWarnings("unused")
	//	@SuppressWarnings({ "unused", "rawtypes" })
	//	@SuppressWarnings(value = { "unused", "rawtypes" })
	@SuppressWarnings("all")
	public static void main(String[] args)
	{
		int i;
		List list = new ArrayList();
		
		Date date = new Date();
		System.out.println(date.toLocaleString());
		
		new MyMath().sum(1, 2);
	}
	
}

//1.注释：给程序员看的；
//2.注解：给虚拟机看的（让虚拟机看到程序中的注解，注解代表程序的一些特殊的功能）；

//3.JDK中提供的三个注解的测试；

//3.1.@Override：描述子类重写父类的方法；
//3.1.1.JDK1.5版本的时候，该注解只能应用在 类的继承上；
//3.1.2.JDK1.6版本的时候，该注解可以应用在 类的实现上；

//3.2.@SuppressWarnings：压制警告；


//3.3.@Deprecated：描述方法过时；

class Man
{
	public void run()
	{
		System.out.println("Man类即父类的方法：跑...");
	}
}


class SuperMan extends Man
{
	
	@Override
	public void run()
	{
		super.run();
	}
}


interface Waiter
{
	public String sayHello(String name);
	
}


class Waitress implements Waiter
{
	
	@Override
	public String sayHello(String name)
	{
		return "Hello" + name;
	}
	
}


class MyMath
{
	@Deprecated
	public int sum(int a, int b)
	{
		return a + b;
	}
}
