package busresv;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity; //get and set method

    Bus(int no,boolean ac,int cap){
        this.busNo=no;
        this.ac=ac;
        this.capacity=cap;
    }

    public int getBusNo() {
        return busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public int getCapacity() { //accessor method
        return capacity;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public void setCapacity(int capacity) { //mutator
        this.capacity = capacity;
    }
    public void displayBusInfo(){
        System.out.println("Bus No:"+busNo + " Ac:"+ ac + " Total Capacity:" + capacity);
    }
}
