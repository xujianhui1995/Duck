
/***********************************************************************
 * Module:  MallardDuck.java
 * Author:  Administrator
 * Purpose: Defines the Class MallardDuck
 ***********************************************************************/

import java.util.*;

/** @pdOid 233c1b59-3f30-4b4a-b29f-36b2056ef926 */
public class MallardDuck extends Duck {
	public MallardDuck() {
		QuackBehavior = new Quack();
		FlyBehavior = new FlyWithWings();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("MallardDuck会游泳。");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("这是MallardDuck。");
	}

}