/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teachers.life.app;

import edu.emp.gl.gol.dummycoding.DummyMatrixWorld;
import edu.emp.gl.gol.dummycoding.Position2D;
import edu.emp.gl.gol.dummycoding.utilities.DummySquareUtilities;
import edu.emp.gl.gol.model.IWorld;
import java.util.Properties;

/**
 *
 * @author billal
 */
public class TeachersLifeApp {

    public static void main(String[] args) throws InterruptedException {

        //generating random population 
        // task1();

        //testing paches 
         task2();

    }

    private static void task1() throws InterruptedException {
        IWorld w = new DummyMatrixWorld();

        Properties p = new Properties();
        p.setProperty(IWorld.WIDTH, "128");
        p.setProperty(IWorld.HEIGHT, "30");
        p.setProperty(IWorld.THRESHOLD, "0.3");

        w.initializeWorld(p);
        w.show();

        while (w.isPopulated()) {
            Thread.sleep(300);
            w.evolveWorld();
            w.show();
        }
    }

    private static void task2() throws InterruptedException {
        IWorld w = new DummyMatrixWorld();

        Properties p = new Properties();
        p.setProperty(IWorld.WIDTH, "128");
        p.setProperty(IWorld.HEIGHT, "30");
        p.setProperty(IWorld.THRESHOLD, "0.0");

        w.initializeWorld(p);
        w.show();
        Thread.sleep(3000);
        w.InsertPatch(
                DummySquareUtilities.getPatch(DummySquareUtilities.GLIDER_SHAPE, false, false , false), 
//                DummySquareUtilities.getPatch(DummySquareUtilities.SPACESHIP_BIG_SHAPE, false, false , false), 
//                DummySquareUtilities.getPatch(DummySquareUtilities.GLIDER_SHAPE, false, false , true), 
//                DummySquareUtilities.getPatch(DummySquareUtilities.SPACESHIP_SMALL_SHAPE, false, false , true), 
                new Position2D(10, 10)
        );

        while (w.isPopulated()) {
            Thread.sleep(300);
            w.evolveWorld();
            w.show();
        }
    }

}
