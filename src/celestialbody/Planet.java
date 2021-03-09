package src.celestialbody;

public class Planet {
    
        private int rings;
        private float orbitalSpeed;
        private float orbitalPeriod;
        private float rotationPeriod;


        public void setRings(int ringamt){
            rings=ringamt;
        }
        public void setSpeed(float speed){
            orbitalSpeed=speed;
        }
        public void setOPeriod(float Operiod){
        orbitalPeriod=Operiod;
        }
        public void setRPeriod(float Rperiod){
        rotationPeriod=Rperiod;
        }
        public int getRings(){
        return rings;
        }
        public float getSpeed(){
        return orbitalSpeed;
        }
        public float getOPeriod(){
        return orbitalPeriod;
        }
        public float getRPeriod(){
        return rotationPeriod;
        }    
}
