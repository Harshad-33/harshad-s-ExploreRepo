public class Division{
    public class Division{
        int getQuotient(int dividend , int divisor){
    
            if(divisor==0){
                System.out.println("Please enter a non-zero divisor");
                return 0;
            }
            
            if(dividend>=0 && divisor>0){
                int i=-1;
                int num=0;
                while(num<=dividend){
                    num = num + divisor;
                    i++;
                }
                return i;
            }
            
            else if(dividend>=0 && divisor<0){
                divisor = -divisor;
                int i=-1;
                int num=0;
                while(num<=dividend){
                    num = num + divisor;
                    i++;
                }
                return -i;
            }
            
            else if(dividend<=0 && divisor>0){
                dividend = -dividend;
                int i=-1;
                int num=0;
                while(num<=dividend){
                    num = num + divisor;
                    i++;
                }
                return -i;
            }
            
            else{
                divisor = -divisor;
                dividend = -dividend;
                int i=-1;
                int num=0;
                while(num<=dividend){
                    num = num + divisor;
                    i++;
                }
                return i;
            }
        }
        public static void main(){
            Division d = new Division();
            d.getQuotient(10,5 );
            d.getQuotient(-10,5 );
            d.getQuotient(10,-5 );
            d.getQuotient(-10,-5);
        }
    }    
}