package testingJava;

public class Test {
	public static void main(String[] args) 
	{
		double arr[]= {1,0,8,3,8,8,1,5};
		int a=arr.length;
		double[] vertex = new double[a/2];
		double[] vertey = new double[a/2];
		
		
		for(int i=0,k=0;i<a;i++)
		{
			if(i%2==0)
			{
				vertex[k]=arr[i];
				k++;
				
			}
			
		}
		
		for(int i=0,k=0;i<a;i++)
		{
			if(i%2!=0)
			{
				vertey[k]=arr[i];
				k++;
				
			}
			
		}
		
		
		int point[]= {3,2};
		boolean b= pointInPolygon(a/2,vertex,vertey,point[0],point[1]);
		
		System.out.println(b);
	
	}


	public static boolean pointInPolygon(int polyCorners,double[] polyX,double[] polyY,float x,float y) 
	{

		  int   i, j=polyCorners-1 ;
		  boolean  oddNodes=false   ;

		  for (i=0; i<polyCorners; i++)
		  {
		    if ((polyY[i]< y && polyY[j]>=y||   polyY[j]< y && polyY[i]>=y)
		    &&  (polyX[i]<=x || polyX[j]<=x)) 
		    {
		      if (polyX[i]+(y-polyY[i])/(polyY[j]-polyY[i])*(polyX[j]-polyX[i])<x) 
		      {
		        oddNodes=!oddNodes; 
		      }
		    }
		    j=i; 
		  }

		  return oddNodes; 
		  
	}
}