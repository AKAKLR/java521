import java.util.Arrays;

public class Myshunxu {

        public int num;
        public int[] clam;
        public Myshunxu() {
            this.clam=new int [10];
        }
        public void display(){
            for(int i=0;i<this.num;i++){
                System.out.print(this.clam[i]+" ");
            }
            System.out.println();
        }
        public void add(int pos,int date){
            if(pos<0||pos>this.num){
                System.out.println("找不到该位置");
                return;
            }
            isfull();
            this.clam= Arrays.copyOf(this.clam,2*this.clam.length);
            for (int i=this.num-1;pos<=i;i--){
                this.clam[i+1]=this.clam[i];
            }
            this.clam[pos]=date;
            this.num++;
        }
        public boolean isfull(){
            return this.num==this.clam.length;
        }
    }

