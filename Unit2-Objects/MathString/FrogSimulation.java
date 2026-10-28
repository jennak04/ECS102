public class FrogSimulation{
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance(){
       int hop = 0;
       hop= (int)(Math.random()*10)+1;
       if (Math.random()<0.9){
        hop=-hop;
       }
       return hop;
    }

    public boolean simulate(){
        boolean result = false;
        int position = 0;

        for(int count = 0; count < maxHops; count++){
            position += hopDistance();

            if (position >= goalDistance){
                result = true;
                return result;
            }

            if (position < 0){
                result = false;
                return result;
            }
        }

        return result;
    }
    public double runSimulation(int num){
        int count = 0;
        for(int i =0; i <num; i++){
            if(simulate()){
                count++;
            }
        }
        return count;
    }
}