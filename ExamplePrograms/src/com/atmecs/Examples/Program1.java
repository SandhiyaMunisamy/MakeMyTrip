package com.atmecs.Examples;

import java.util.logging.Logger;

class Flipkart {
	 static Logger logger = Logger.getLogger("InfoLogging");
	 void payment() {
		 logger.info("cash on delivery");
	 }
	 void payment(long card)
	 {
		 logger.info("10% discount");
	 }
	 void payment(String netbanking) 
	 {
		 logger.info("15% cashback"); ///method overloading(Compiletime polymorphism)
	 }
	}
class Card
{
	static Logger logger = Logger.getLogger("InfoLogging");
	void swipe() {
		logger.info("Please wait");
	}
}
class DebitCard extends Card
{
	@Override
	void swipe()
	{
		logger.info("Balance reduce");///method overriding(Runtime polymorphism)
	}
}

