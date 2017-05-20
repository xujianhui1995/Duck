/***********************************************************************
 * Module:  RedHeadDuck.java
 * Author:  Administrator
 * Purpose: Defines the Class RedHeadDuck
 ***********************************************************************/

import java.util.*;

/** @pdOid 41d96a9b-1fde-4471-8dce-aaf2cfb67980 */
public class RedHeadDuck extends Duck{
	public RedHeadDuck() {
		QuackBehavior = new MuteQuack();
		FlyBehavior = new FlyNoWay();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("RedHeadDuck会游泳。");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("这是RedHeadDuck。");
	}

}