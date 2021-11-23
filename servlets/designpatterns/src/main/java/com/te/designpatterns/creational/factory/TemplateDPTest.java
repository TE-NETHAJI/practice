package com.te.designpatterns.creational.factory;

import com.te.designpatterns.behavoiurdp.Asphalt;
import com.te.designpatterns.behavoiurdp.BattleGround;
import com.te.designpatterns.behavoiurdp.CallOfDuty;
import com.te.designpatterns.behavoiurdp.Game;

public class TemplateDPTest {
	public static void main(String[] args) {

		Game game = new BattleGround();
		game.play();
		System.out.println("====================================");

		Game game1 = new CallOfDuty();
		game1.play();
		System.out.println("======================================");

		Game game2 = new Asphalt();
		game.play();

	}

}
