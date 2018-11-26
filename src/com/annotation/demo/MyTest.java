
/**    
* @Title: MyTest.java  
* @Package com.annotation.demo  
* @Description: TODO(自定义注解；)  
* @author yijvyan  
* @date 2018年7月9日  
* @version V1.0    
*/

package com.annotation.demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/** @ClassName: MyTest
 * @Description: TODO(其实就是自定义了一个@Test罢了；)
 * @author yijvyan
 * @date 2018年7月9日 */
//1.默认的自定义的注解存在于源码阶段，在生成Class后 及 运行阶段就不存在了；
//2.自定义注解默认存在于源码阶段，需要让注解存在的时间更长，使用元注解（即只用于修饰其他的注解）；
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyTest
{
	
}
