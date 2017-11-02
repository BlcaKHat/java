class Gcd{
	public static void main(String args[])
	{
		int a=18;
		int b=24;
		int[] ar=new int[5];
		ar[0]=15;
		ar[1]=24;
		ar[2]=36;
		ar[3]=42;
		ar[4]=90;
		hcf1(ar);
	}
	public static int hcf(int a,int b){
			while(b !=0)
			{
			int	temp=b;
				b=b%a;
				a=temp;
			}
			return a;
		}
		private static int hcf1(int[] input)
		{
			int result=input[0];
			for(int i=1 ; i< 5;i++)
			{
				result=hcf1(result, input[i]);
			}
			System.out.println(result);
		}

}
