public enum TrafficLight {
    //constants of enum type
    RED(30),
    GREEN(60),
    YELLOW(2);

    private final int duration;

    TrafficLight(int duration)
    {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
