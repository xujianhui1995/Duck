/***********************************************************************
 * Module:  RubberDuck.java
 * Author:  Administrator
 * Purpose: Defines the Class RubberDuck
 ***********************************************************************/

import java.util.*;

/** @pdOid b85f888a-b30a-406c-88c9-fd844063d991 */
public class RubberDuck extends Duck{
	public RubberDuck() {
		QuackBehavior = new Squeak();
		FlyBehavior = new FlyWithRocket();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("RubberDuck会游泳。");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("这是RubberDuck。");
	}

}