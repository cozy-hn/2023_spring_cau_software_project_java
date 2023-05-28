public class SoccerPlayer implements Player{
    private String name;
    private double speed;
    private String[] tools;
    private double kickSpeed;

    SoccerPlayer(String name, double kickSpeed){
        this.name = name;
        this.kickSpeed = kickSpeed;
    }
    public void setPower(double kickSpeed){
        this.kickSpeed = kickSpeed;
    }
    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    @Override
    public void setTools(String[] tools) {
        this.tools = tools;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void showDetails() {
        System.out.println("Name: " + (name == "null" ? "No information" : name));
        System.out.println("Speed: " + (speed == 0.0 ? "No information" : speed));
        System.out.print("Tools: ");
        if (tools == null)
            System.out.println("No information");
        else {
            for (int i = 0; i < tools.length; i++) {
                System.out.print(tools[i]);
                if (i != tools.length - 1)
                    System.out.print(", ");
            }
            System.out.println();
        }
        System.out.println("kickSpeed: " + (kickSpeed == 0.0 ? "No information" : kickSpeed));
    }
}
