
/***********************************************************************
 * Module:  Duck.java
 * Author:  Administrator
 * Purpose: Defines the Class Duck
 ***********************************************************************/

import java.util.*;

/** @pdOid d36317af-68a9-452f-9d25-0d458e547234 */
public abstract class Duck {
	/** @pdOid ea28a070-659b-4303-97b0-f78b01776d02 */
	QuackBehavior QuackBehavior;
	/** @pdOid 389cb64e-d8de-4b1b-b3fe-a52f96b46e08 */
	FlyBehavior FlyBehavior;

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		QuackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		FlyBehavior = flyBehavior;
	}

	/** @pdOid 0215a0df-3c08-4727-8506-c87f1195bb62 */
	public abstract void swim();

	/** @pdOid 081558f5-6c21-4e62-9b01-4f3eb13645d6 */
	public abstract void display();

	/** @pdOid c1992569-1582-40f8-8132-201897c5612d */
	public void performQuack() {
		// TODO: implement
		QuackBehavior.quack();
	}

	/** @pdOid 9693d1ce-344b-4328-8b35-fff9d75dd710 */
	public void performFly() {
		// TODO: implement
		FlyBehavior.fly();
	}

}