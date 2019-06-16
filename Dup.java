
public class Dup 
{
	public static void remove(String str,int n)
	{
		char string[] = str.toCharArray();
		char arr[] = new char[str.length()];
		int k=0;
		for(int i=0;i<string.length;i++)
		{
			int count=1;
			for(int j=i+1;j<string.length;j++)
			{
				if(string[i]==string[j])
				{
					count++;
					string[j]='0';
				}	
			}
			if(count>=1 && string[i]!='0')
			{
				//System.out.println(string[i]+" "+count);  // to find the duplicates
				arr[k++]=string[i];							// to remove duplicates
			}
		}
		System.out.println(String.valueOf(arr));
	}	  
	public static void main(String[] args) 
	{
		String str= "missisippi"; 
		   int n = str.length();
		   remove(str, n); 
	}

}
