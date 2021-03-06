package com.sample;
import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * MyFirstRobot - a robot by (your name here)
 */
public class SniperRobot extends Robot
{
    /**
     * run: MyFirstRobot's default behavior
     */
    public void run() {
        // Initialization of the robot should be put here

        // After trying out your robot, try uncommenting the import at the top,
        // and the next line:

        // setColors(Color.red,Color.blue,Color.green); // body,gun,radar

        double battleFieldHeight = getBattleFieldHeight();
        double battleFieldWidth = getBattleFieldWidth();
        double x = getX();
        double y = getY();

        double heading = getHeading();
        turnLeft(heading);

        ahead(battleFieldHeight - y - 50);
        turnRight(90);
        ahead(battleFieldWidth - x - 50);
        turnGunRight(90);

        // Robot main loop
        while(true) {
            turnRight(90);
            ahead(battleFieldHeight - 50);
            turnGunRight(90);
            turnGunLeft(90);

            turnRight(90);
            ahead(battleFieldWidth - 50);
            turnGunRight(90);
            turnGunLeft(90);
        }
    }

    /**
     * onScannedRobot: What to do when you see another robot
     */
    public void onScannedRobot(ScannedRobotEvent e) {
        // Replace the next line with any behavior you would like
        fire(1);
    }

    /**
     * onHitByBullet: What to do when you're hit by a bullet
     */
    public void onHitByBullet(HitByBulletEvent e) {
        // Replace the next line with any behavior you would like
        back(10);
    }

    /**
     * onHitWall: What to do when you hit a wall
     */
    public void onHitWall(HitWallEvent e) {
        // Replace the next line with any behavior you would like
        back(20);
    }
}
