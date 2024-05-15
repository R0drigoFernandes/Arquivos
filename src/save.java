public class Save{
    private String arq1;
    private String arq2;
    private String arq3;
    private String arq4;
    private String arq5;
    private String inf;
    private int x;
    private int y;

    public Save(String[] args){
        this.arq1 = args[0];
        this.arq2 = args[1];
        this.arq3 = args[2];
        this.arq4 = args[3];
        this.arq5 = args[4];
        this.inf = args[5];
        this.x = Integer.parseInt(args[6]);
        this.y = Integer.parseInt(args[7]);
        
    
    }

    public String getarq1(){
        return this.arq1;
    }

    public String getarq2(){
        return this.arq2;
    }

    public String getarq3(){
        return this.arq3;
    }

    public String getarq4(){
        return this.arq4;
    }

    public String getarq5(){
        return this.arq5;
    }

    public String getinf(){
        return this.inf;
    }

    public int getx(){
        return this.x;
    }

    public int gety(){
        return this.y;
    }

    public void setarq1(String arq){
        this.arq1 = arq;
    }

    public void setarq2(String arq){
        this.arq2 = arq;
    }   

    public void setarq3(String arq){
        this.arq3 = arq;
    }

    public void setarq4(String arq){
        this.arq4 = arq;
    }

    public void setarq5(String arq){
        this.arq5 = arq;
    }

    public void setinf(String inf){
        this.inf = inf;
    }

    public void setx(int x){
        this.x = x;
    }

    public void sety(int y){
        this.y = y;
    }



    public void criar(int x, int y, String[][] arq, String inf){
        
        System.out.println(arq[0]);
        System.out.println(arq[1]);
        System.out.println(arq[2]);
        System.out.println(arq[3]);
        System.out.println(arq[4]);
        System.out.println(inf);
        System.out.println(x);
        System.out.println(y);
        
    }


}
