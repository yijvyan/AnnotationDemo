
/**    
* @Title: MyAnnotationDemo.java  
* @Package com.annotation.demo  
* @Description: TODO(自定义注解；)  
* @author yijvyan  
* @date 2018年7月9日  
* @version V1.0    
*/

package com.annotation.demo;

//import org.junit.Test;

/** @ClassName: MyAnnotationDemo
 * @Description: TODO(自定义注解的应用；)
 * @author yijvyan
 * @date 2018年7月9日 */

public class MyAnnotationDemo
{
	//	@Test
	@MyTest
	public void method1()
	{
		System.out.println("method1方法1执行了...");
	}
	
	//	@Test
	@MyTest
	public void method2()
	{
		System.out.println("method2方法2执行了...");
	}
	
	public void method3()
	{
		System.out.println("method3方法3执行了...");
	}
}
