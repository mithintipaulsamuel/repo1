class PrimeRange
{
public static void main(String[] args)
	{
		int num=2,x,ct;
		System.out.println("Prime numbers :");
		for(;num<=30;num++)
		{
			x=2;ct=0;
			while(x<=num/2)
			{
				if (num%x==0)
                                  {
					ct++;
                                        break;
                                  }
				x++;
			}
			if(ct==0)
				System.out.println(num);
			
		}		
	}
}


//Prime numbers :
//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97