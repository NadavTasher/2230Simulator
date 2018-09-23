package nadav.tasher.frc.simulator.simulation.robots;

import nadav.tasher.frc.simulator.simulation.Mat;
import nadav.tasher.frc.simulator.simulation.challenges.ChallengeRobot2018;
import net.java.games.input.Component;

import java.awt.*;

public class Drako extends ChallengeRobot2018 {
    public Drako() {
        super();
        setColor(Color.WHITE);
        setMatCoordinates(new Mat.Coordinates(20, 20));
    }

    @Override
    public void handleComponent(Component component, Mat mat) {
        if (!component.getName().equals("x"))
            super.handleComponent(component, mat);
        if (component.getName().equals("Trigger") && component.getPollData() == 1) {
            setMatCoordinates(new Mat.Coordinates(20, 20));
            setAngle(0);
        }
        if (component.getName().equals("Thumb") && component.getPollData() == 1) {
            setAngle(0.125);
        }
        if (component.getName().equals("z")) {
            setAngle(Math.abs(component.getPollData()));
        }
//        System.out.println("Angle "+getAngle());
    }
}
