
/**    
* @Title: CoreRunner.java  
* @Package com.annotation.demo  
* @Description: TODO(自定义注解需要用到的类；)  
* @author yijvyan  
* @date 2018年7月9日  
* @version V1.0    
*/

package com.annotation.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/** @ClassName: CoreRunner
 * @Description: TODO(核心运行类，主要是自定义注解类通过反射来获取和运行当前匹配的方法；)
 * @author yijvyan
 * @date 2018年7月9日 */

public class CoreRunner
{
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException
	{
		//1.获得测试类的Class；
		Class clazz = MyAnnotationDemo.class;
		//2.获得Class中的所有的方法：规定了测试的方法必须是Public；
		Method[] methods = clazz.getMethods();
		//3.遍历每个方法；
		for (Method method : methods)
		{
			//3.1.判断当前的方法是否加了@MyTest注解；
			boolean flag = method.isAnnotationPresent(MyTest.class);
			//			System.out.println("3.2.当前方法" + method.getName() + "是否加了注解：-->" + flag);
			if (flag)
			{
				//3.3.说明方法上有MyTest注解；
				method.invoke(clazz.newInstance(), null);
			}
		}
		
	}
}
