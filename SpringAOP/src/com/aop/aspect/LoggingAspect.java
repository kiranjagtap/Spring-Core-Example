package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Aspect
// @Configuration
public class LoggingAspect {

	/*
	 * @Before("execution(public String com.aop.model.Triangle.getName())") public
	 * void before() { System.out.println("Advice Run get method called"); }
	 */
	/*
	 * @Before("within(com.aop.model.Circle)") public void before() {
	 * System.out.println("Advice Run get method called"); }
	 */

	/*
	 * @Before("allGetters() && allCircleMethods()") public void before() {
	 * System.out.println("Advice Run get method called"); }
	 */

	@Pointcut("execution(public * get*())")
	public void allGetters() {
	}

	@Pointcut("within(com.aop.model.Circle)")
	public void allCircleMethods() {
	}

/*	@Before("args(name)")
	public void stringArgumentsBeforeMethod(String name) {
		System.out.println(" Before A method that takes string argument has been called and value was " + name);
	}
*/
	 @Before(value = "com.aop.model.Circle && "
			    + "args(account,..)")
	public void stringArgumentsBeforeMethod(String name) {
		System.out.println(" Before A method that takes string argument has been called and value was " + name);
	}

	// After
	/*
	 * @After("args(name)") public void stringArgumentsAfterMethod(String name) {
	 * System.out.
	 * println("After A method that takes string argument has been called and value was "
	 * + name); }
	 */
	// AfterReturning

	/*
	 * @AfterReturning("args(name)") public void stringArgumentsAfterMethod(String
	 * name) { System.out.
	 * println("A method that takes string argument has been called and value was "
	 * + name); }
	 */
	// AfterThrowing

	/*
	 * @AfterThrowing("args(name)") public void
	 * stringArgumentsAfterThrowingMethod(String name) {
	 * System.out.println("Excpetion was thrown " + name); }
	 */

	// AfterThrowingand Catch exception

	/*
	 * @AfterThrowing(pointcut = "args(name)", throwing = "ex") public void
	 * exceptionAdvice(String name, RuntimeException ex) {
	 * System.out.println("Excpetion was thrown " + ex); }
	 */
	/*
	 * @AfterReturning(pointcut = "args(name)", returning = "returningString")
	 * public void stringArgumentsAfterMethodWithPointCut(String name, String
	 * returningString) { System.out.
	 * println("A method that takes string argument has been called and value was "
	 * + name + " The output value is " + returningString); }
	 */
}
