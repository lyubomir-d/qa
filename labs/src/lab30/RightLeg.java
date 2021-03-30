package lab30;

import lab30.Robot;

public class RightLeg extends Thread {

    @Override
    public void run() {
        for (int index = 0; index < 10; index++) {
            String name = Robot.nextLegSteps;
            if (name != null && name.isEmpty()) {
                Robot.nextLegSteps = "right";
            }
            synchronized (Robot.monitor) {
                if (name.equals("right")) {
                    System.out.println("Right foot step");
                    Robot.nextLegSteps = "left";
                }
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
