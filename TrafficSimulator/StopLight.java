package TrafficSimulator;

public class StopLight {

    public enum StopLightColors {

        RED(25), GREEN(25), YELLOW(10);

        private int delay;


        private StopLightColors(int delay) {
            this.delay = delay;
        }

        public void setDelay(int delay) {
            this.delay = delay;
        }

        public int getDelay() {
            return this.delay;
        }


    }


    private StopLightColors currentColor;

    public StopLightColors getColor(){
        return currentColor;
    }

    public void nextColor() {
        StopLightColors next;
        switch (currentColor) {
            case GREEN:
                next = StopLightColors.YELLOW;
                break;
            case RED:
                next = StopLightColors.GREEN;
                break;
            case YELLOW:
                next = StopLightColors.RED;
                break;
            default:
                next = StopLightColors.RED;
                break;
        }

        currentColor = next;

    }



    public StopLight() {
        currentColor = StopLightColors.RED;
    }


}



