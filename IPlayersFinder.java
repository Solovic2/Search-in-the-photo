package eg.edu.alexu.csd.datastructure.iceHockey;
import static java.lang.Math.abs;
public class implements IPlayersFinder {
    int count=0;
                            //  int a[]=new int [1000];
                         //  int a2[]=new int [1000];  
int z=0;

    public int[] Point=new int [1000];
public int gmax(int a[],int z){
    int max=0;
        if(x==0){
        return a[0];
    }
    for(int i=0;i<z;i++){
        
        if(i==0){
            max=a[i];
        }
        if(a[i]>max){
            max=a[i];
        }
    }
    return max;
} public int gmin (int a[],int x){
    int min=0;
    if(x==0){
        return a[0];
    }
    for(int i=0;i<x;i++){
        if(i==0){
            min=a[i];
        }else{
        if(min>a[i]){
            min=a[i];
        }
        }
    }
    return min;
}
int va=0;
    public  int rec( String[] photo,int r1,int c2,char pr,int b[][],int a[],int a2[]){

       if( b[r1][c2]!=pr){
            a[z]=r1;
            a2[z]=c2;
            z++;
               if(photo[r1].charAt(c2)==pr ){
                     count++;
                  if (r1+1<photo.length){
                    if(photo[r1+1].charAt(c2)==pr ){
                        b[r1][c2]=pr;
                   va= rec(photo,r1+1,c2,pr,b,a,a2);
                    }
                  }
                  if(c2+1<photo[r1].length()){
                    if(photo[r1].charAt(c2+1)==pr  ){
                            b[r1][c2]=pr;
                        va= rec(photo,r1,c2+1,pr,b,a,a2);
                    } 
                  }
                  if(r1-1>=0){
                  if(photo[r1-1].charAt(c2)==pr  ){
                        b[r1][c2]=pr;
                      va=   rec(photo,r1-1,c2,pr,b,a,a2);
                    }
                  }
                   if(c2-1>=0){
                  if(photo[r1].charAt(c2-1)==pr ){
                        b[r1][c2]=pr;
                       
                       va=     rec(photo,r1,c2-1,pr,b,a,a2);
                    }
                   }
               }else{
               count=0;
               }
       }
            return count;

}
    int [][]b=new int [50][50];
    int x=0;
    int v1=0;
    int v2=0;
    int va1=0;
    int va2=0;
    int value;
    int value1;
    int k;
    int f=0,q=1;
    int[] findPlayers(String[] photo, int team, int threshold){
        int teams=team;
        char g= Integer.toString(teams).charAt(0);
        int t=threshold;
        for(int i=0;i<photo.length;i++){
            for(int j=0;j<photo[i].length();j++){
                if(photo[i].charAt(j)== g  ){
                      if(b[i][j]!=g){
                        x=0;
                        z=0;
                          int c[]=new int[1000];
                         int c2[]=new int[1000];
                          int a[]=new int [1000];
                           int a2[]=new int [1000];  
                        c[x]=i;
                        c2[x]=j;
                        x++;
                          v1=gmin(c,x);
                          v2=gmin(c2,x);
                          k= rec(photo,i,j,g,b,a,a2);
                          va1=gmax(a,z);
                          va2=gmax(a2,z);
                           v1=gmin(a,z);
                          v2=gmin(a2,z);
  
                        count=0;
                        }
                }
         if((k*4)>=t){
             k=0;
        value =va1+v1+1;
        value1=va2+v2+1;
           Point[f]=value;
            Point[f+1]=value1;
            f+=2;
            
         }
           k=0; 
        }

    }
        
        return Point;
    
  }

}