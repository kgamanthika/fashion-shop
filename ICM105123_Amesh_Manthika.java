import java.util.*;
class ICM105123_Amesh_Manthika{
//---------Clear code---------////////////////////////////	
	public final static void clearConsole() {
		try {
		final String os = System.getProperty("os.name");
		if (os.contains("Windows")) {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} else {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		}
		} catch (final Exception e) {
		e.printStackTrace();
}
}

//---------Check Duplicate---------////////////////////////////
//-----------------------------------------
	public static boolean checkDuplicate(String[] orderId,String id) {
		int count=0;
		for (int i = 0; i < orderId.length; i++)
		{
			if (id.equalsIgnoreCase(orderId[i]))
			{
				return false;
			}
			
		}
		
		return true;
		
		
		}
//---------Place Order---------////////////////////////////

//-------------Enter order ID----------------------------
	public static String[] enterOdrId(String[] orderId) {
		Scanner input=new Scanner(System.in);
		String[] tempOdrId=new String[orderId.length+1];
		for (int i = 0; i < orderId.length; i++)
		{
			tempOdrId[i]=orderId[i];
		}
		do{
		System.out.print("Enter your Order ID : ");
		String id=input.nextLine();
		if (id.length()!=9)
		{
			System.out.println("\twrong id (you must start 'ODR#' and input 5 numbers)...\n");continue;
			}
		String checkOdr="";
		for (int i = 0; i < 4; i++)
		{
			checkOdr+=id.charAt(i);
		}
		if (checkOdr.equalsIgnoreCase("ODR#")&&id.length()==9)
		{
			if (checkDuplicate(tempOdrId,id)==true)
			{
				tempOdrId[orderId.length]=id;break;
			}else
			{
				System.out.println("\tyou already entered this ID...!\n");continue;
			}
			
		}else
		{
			System.out.println("\twrong id (you must start 'ODR#' and input 5 numbers)...\n");continue;
		}
	}while(true);
		
		
		orderId=tempOdrId;
		return orderId;
	}
//------------cuatomer contact-----------------------------
	public static String[] cusContact(String[] contactNo) {
		Scanner input=new Scanner(System.in);
		String[] tempContact=new String[contactNo.length+1];
		do{
		System.out.print("Enter customer phone number : ");
		String number=input.next();
		if (number.length()==10&&number.charAt(0)=='0')
		{
			for (int i = 0; i < contactNo.length; i++){
				tempContact[i]=contactNo[i];
				
		}
		tempContact[contactNo.length]=number;break;
		}else
		{
			System.out.println("Invalied number ! (start from 0 & input 9 digits)");
			continue;
			
		}
		
	}while(true);
		contactNo=tempContact;
		
		return contactNo;
		
	}
//------------t-shirt size-----------------------------
	public static String[] shirtSize(String[] size) {
		Scanner input=new Scanner(System.in);
		String[] tempSize=new String[size.length+1];
	
		for (int i = 0; i < size.length; i++)
		{
			tempSize[i]=size[i];
		}
		do{
			System.out.print("Enter T-shirt size(XS/S/M/L/XL/XXL) : ");
			String entrsize=input.next();
			if (entrsize.equalsIgnoreCase("xs")||entrsize.equalsIgnoreCase("s")||entrsize.equalsIgnoreCase("l")||entrsize.equalsIgnoreCase("m")||entrsize.equalsIgnoreCase("xl")||entrsize.equalsIgnoreCase("xxl"))
			{
				tempSize[size.length]=entrsize;break;
			}else
			{
				System.out.println("Wrong input...\n");continue;
			}
		}while(true);
		size=tempSize;
		return size;
	}
//------------Quentity-----------------------------
	public static int[] tShirtQuentity(int[] quentity) {
		Scanner input=new Scanner(System.in);
		
		int[] tempQuentity=new int[quentity.length+1];
		for (int i = 0; i < quentity.length; i++)
		{
			tempQuentity[i]=quentity[i];
		}
			System.out.print("Enter Quentity : ");
			int qyt=input.nextInt();
			tempQuentity[quentity.length]=qyt;
		quentity=tempQuentity;
		return quentity;
	}
//------------Get amount-----------------------------
	public static double[] getAmount(String[] size,int[] quentity,double[] amount) {
		double[] tempAmount=new double[amount.length+1];
		double getamount=0;
		for (int i = 0; i < amount.length; i++)
		{
			tempAmount[i]=amount[i];
		}
		
			if (size[size.length-1].equalsIgnoreCase("xs"))
			{
				getamount=quentity[quentity.length-1]*600.00;
			}else if (size[size.length-1].equalsIgnoreCase("s"))
			{
				getamount=quentity[quentity.length-1]*800.00;
			}
			else if (size[size.length-1].equalsIgnoreCase("m"))
			{
				getamount=quentity[quentity.length-1]*900.00;
			}
			else if (size[size.length-1].equalsIgnoreCase("l"))
			{
				getamount=quentity[quentity.length-1]*1000.00;
			}
			else if (size[size.length-1].equalsIgnoreCase("xl"))
			{
				getamount=quentity[quentity.length-1]*1100.00;
			}
			else if (size[size.length-1].equalsIgnoreCase("xxl"))
			{
				getamount=quentity[quentity.length-1]*1200.00;
			}
			
			System.out.println("Amount : "+getamount);
		tempAmount[amount.length]=getamount;
		
	return tempAmount;

	}
//------------Not placed-----------------------------
	public static String[] notPlaced(String[] strArray) {
		String[] tempArray=new String[strArray.length-1];
		for (int i = 0; i < tempArray.length; i++)
		{
			tempArray[i]=strArray[i];
		}
		strArray=tempArray;
		return strArray;
		
	}
	public static int[] notPlaced(int[] strArray) {
		int[] tempArray=new int[strArray.length-1];
		for (int i = 0; i < tempArray.length; i++)
		{
			tempArray[i]=strArray[i];
		}
		strArray=tempArray;
		return strArray;
		
	}
	public static double[] notPlaced(double[] strArray) {
		double[] tempArray=new double[strArray.length-1];
		for (int i = 0; i < tempArray.length; i++)
		{
			tempArray[i]=strArray[i];
		}
		strArray=tempArray;
		return strArray;
		
	}
//------------Ord status-----------------------------
	public static int[] ordStatus(int[] status) {
		Random r=new Random();
		int[] temp=new int[status.length+1];
		for (int i = 0; i < status.length; i++)
		{
			temp[i]=status[i];
		}
		
		 temp[status.length]=r.nextInt(3);
		 
		 
		 return temp;
		
		
	}
	public static void PrintStatus(int[] status,int x) {
		
			if (status[x]==0)
		{
			System.out.println("Status\t\t: Processing");
		}else if (status[x]==1)
		{
			System.out.println("Status\t\t: delivering");
		}else if(status[x]==2)
		{
			System.out.println("Status\t\t: delivered");
		}
		
		
		
		
	}
	public static String[] PrintStatus(int[] status) {
		String[] stts=new String[status.length];
		for (int i = 0; i < status.length; i++)
		{
			if (status[i]==0)
		{
			stts[i]="Processing";
		}else if (status[i]==1)
		{
			stts[i]="delivering";
		}else if(status[i]==2)
		{
			stts[i]="delivered";
		}
		}
		
			
		return stts;
		
		
		
	}
//---------Search Customer---------////////////////////////////

//-------------Find phone----------------------------
	public static void getContactNo(String phone,String[] contactNo,String[] size,int[] quentity,double[] amount) {
				 String[] tempSize=new String[0];
				 String[] temp=new String[0];
				double total=0;
				int xs=0,s=0,m=0,l=0,xl=0,xxl=0;
		for (int i = 0; i < contactNo.length; i++)
		{
			if (phone.equalsIgnoreCase(contactNo[i]))
			{
				total+=amount[i];
				System.out.println("|\t"+size[i]+"\t|\t"+quentity[i]+"\t|\t"+amount[i]+"\t    |");
				
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				
				if (size[i].equalsIgnoreCase("s")){
				s++;
			}
			if (size[i].equalsIgnoreCase("xs"))
			{
				xs++;
			}
			if (size[i].equalsIgnoreCase("l"))
			{
				l++;
			}
			if (size[i].equalsIgnoreCase("m"))
			{
				m++;
			}
			if (size[i].equalsIgnoreCase("xl"))
			{
				xl++;
			}
			if (size[i].equalsIgnoreCase("xxl"))
			{
				xxl++;
				
			}////////////////////////////////////////
			
		}
				
			}
			if (xs==0)
			{
				temp=new String[tempSize.length+1];
				temp[tempSize.length]="xs";
				for (int j = 0; j < tempSize.length; j++)
				{
					temp[j]=tempSize[j];
				}tempSize=temp;
				
			}
			if (s==0)
			{
				temp=new String[tempSize.length+1];
				temp[tempSize.length]="s";
				for (int j = 0; j < tempSize.length; j++)
				{
					temp[j]=tempSize[j];
				}tempSize=temp;
				
			}
			if (l==0)
			{
				temp=new String[tempSize.length+1];
				temp[tempSize.length]="l";
				for (int j = 0; j < tempSize.length; j++)
				{
					temp[j]=tempSize[j];
				}tempSize=temp;
				
			}
			if (m==0)
			{
				temp=new String[tempSize.length+1];
				temp[tempSize.length]="m";
				for (int j = 0; j < tempSize.length; j++)
				{
					temp[j]=tempSize[j];
				}tempSize=temp;
				
			}
			if (xl==0)
			{
				temp=new String[tempSize.length+1];
				temp[tempSize.length]="xl";
				for (int j = 0; j < tempSize.length; j++)
				{
					temp[j]=tempSize[j];
				}tempSize=temp;
				
			}
			if (xxl==0)
			{
				temp=new String[tempSize.length+1];
				temp[tempSize.length]="xxl";
				for (int j = 0; j < tempSize.length; j++)
				{
					temp[j]=tempSize[j];
				}tempSize=temp;
				
			}
			
		for (int i = 0; i < temp.length; i++)
		{
				System.out.println("|\t"+tempSize[i]+"\t|\t"+0+"\t|\t"+0.0+"\t    |");
		}
		
//////////////////////////////////////////////////////////////////////////////////////////////////	
		
			System.out.println("+---------------------------------------------------+");	
			System.out.println("|\t    Total Amount    \t|\t"+total+"\t    |");
			
		
		
		
	}
//---------Search Order---------////////////////////////////

//------------get indexes-----------------------------
	public static int index(String[] orderId,String Id) {
		
		for (int i = 0; i < orderId.length; i++)
		{
			if (Id.equalsIgnoreCase(orderId[i]))
			{
				return i;
			}
		}
		return -1;
		
	}
//------------print other indexes-----------------------------
	public static void printOrder(String[] orderId,String id,String[] contactNo,String[] size,int[] quentity,double[] amount,int[] status) {
		
		System.out.println("\nPhone Number\t: "+contactNo[index(orderId,id)]);
		System.out.println("Size\t\t: "+size[index(orderId,id)]);
		System.out.println("Quentity\t: "+quentity[index(orderId,id)]);
		System.out.println("Amount\t\t: "+amount[index(orderId,id)]);
		PrintStatus(status,index(orderId,id));
		
	}
//---------Delete Order---------////////////////////////////
	public static boolean deleteHereOrNot(String[] orderId,String deleteKey) {
		
		for (int i = 0; i < orderId.length; i++)
		{
			if (deleteKey.equalsIgnoreCase(orderId[i]))
			{
				return true;
			}
		}
		return false;
	
	
	}
	//------------
	public static String[] deleteOrderId(String[] orderId,String deleteKey) {
		Scanner input=new Scanner(System.in);
		String[] newOrderId=new String[0];
		
					int k=index(orderId,deleteKey);
				for (int i = k; i < orderId.length-1; i++)
				{
					orderId[i]=orderId[i+1];
				}
				  newOrderId=new String[orderId.length-1];
				for (int i = 0; i < newOrderId.length; i++)
				{
					newOrderId[i]=orderId[i];
				}	
			
		return newOrderId;
		
	}
	public static String[] deleteOrderId(String[] orderId,String deleteKey,String[] contactNo) {
		Scanner input=new Scanner(System.in);
		String[] newcontactNo=new String[0];
		
					int k=index(orderId,deleteKey);
				for (int i = k; i < orderId.length-1; i++)
				{
					contactNo[i]=contactNo[i+1];
				}
				  newcontactNo=new String[contactNo.length-1];
				for (int i = 0; i < newcontactNo.length; i++)
				{
					newcontactNo[i]=contactNo[i];
				}	
			
		return newcontactNo;
		
	}
	public static String[] deletesize(String[] orderId,String deleteKey,String[] size) {
		Scanner input=new Scanner(System.in);
		String[] newsize=new String[0];
		
					int k=index(orderId,deleteKey);
				for (int i = k; i < orderId.length-1; i++)
				{
					size[i]=size[i+1];
				}
				  newsize=new String[size.length-1];
				for (int i = 0; i < newsize.length; i++)
				{
					newsize[i]=size[i];
				}	
			
		return newsize;
		
	}
	public static int[] deletequentity(String[] orderId,String deleteKey,int[] quentity) {
		Scanner input=new Scanner(System.in);
		int[] newquentity=new int[0];
		
					int k=index(orderId,deleteKey);
				for (int i = k; i < orderId.length-1; i++)
				{
					quentity[i]=quentity[i+1];
				}
				  newquentity=new int[quentity.length-1];
				for (int i = 0; i < newquentity.length; i++)
				{
					newquentity[i]=quentity[i];
				}	
			
		return newquentity;
		
	}
	public static double[] deleteamount(String[] orderId,String deleteKey,double[] amount) {
		Scanner input=new Scanner(System.in);
		double[] newamount=new double[0];
		
					int k=index(orderId,deleteKey);
				for (int i = k; i < orderId.length-1; i++)
				{
					amount[i]=amount[i+1];
				}
				  newamount=new double[amount.length-1];
				for (int i = 0; i < newamount.length; i++)
				{
					newamount[i]=amount[i];
				}	
			
		return newamount;
		
	}

/////////////////View Order////////////////////////////

//---------Best in customer---------////////////////////////////
	public static int[] totCusQty(String[] contactNo,String key,int[] quentity,int[] totQty) {
		 int[] tempTotQty=new int[totQty.length+1];
				int tot=0;
			for (int i = 0; i < contactNo.length; i++)
			{
				if (key.equalsIgnoreCase(contactNo[i]))
				{
					tot+=quentity[i];
				}
			}
			
			tempTotQty[totQty.length]=tot;
			for (int i = 0; i < totQty.length; i++)
			{
				tempTotQty[i]=totQty[i];
			}
			totQty=tempTotQty;
			
		
		
		
	return 	totQty;
		
	}
	//---------------------------//
	public static String[] notDupCntct(String[] contactNo) {
		String[] tempContact=new String[0];
		String[] cont=new String[0];
		
		for (int j = 0; j < contactNo.length; j++)
		{int count=0;
			for (int i = 0; i < tempContact.length; i++)
			{
				if (!contactNo[j].equalsIgnoreCase(tempContact[i]))
				{
					count++;
					
				}
			}
			if (count==tempContact.length)
			{
				cont=new String[tempContact.length+1];
					cont[tempContact.length]=contactNo[j];
				for (int i = 0; i < tempContact.length; i++)
					{
						cont[i]=tempContact[i];
					}
			}
			
			
			tempContact=cont;
			
		}
		return tempContact;
	}
//---------------------
	public static double[] totalOfCusAmt(String[] contactNo,String key,double[] amount,double[] cusTotAmount) {
		
		double[] temp=new double[cusTotAmount.length+1];
		double amt=0;
		for (int i = 0; i < contactNo.length; i++)
		{
			if (key.equalsIgnoreCase(contactNo[i]))
			{
				amt+=amount[i];
			}
		}
		temp[cusTotAmount.length]=amt;
		for (int i = 0; i < cusTotAmount.length; i++)
		{
			temp[i]=cusTotAmount[i];
		}
		
		return temp;
		
	}
//---------------------------//
	public static void printBestCus(String[] tempContact,int[] totQty,double[] cusTotAmount) {
		
		for (int j = 1; j < tempContact.length; j++)
		{
			for (int i = 0; i < tempContact.length-j; i++)
		{
			if (cusTotAmount[i]<cusTotAmount[i+1])
			{
				double x=cusTotAmount[i];
				String s=tempContact[i];
				int y=totQty[i];
				totQty[i]=totQty[i+1];
				totQty[i+1]=y;
				tempContact[i]=tempContact[i+1];
				tempContact[i+1]=s;
				cusTotAmount[i]=cusTotAmount[i+1];
				cusTotAmount[i+1]=x;
			}
		}
		}
		System.out.println();
		System.out.println();
		System.out.println("\t+-------------------------------------------------------------------+");
		System.out.println("\t|\tCustomer ID\t|    All Qty    |\tTotal Amount\t    |");
		System.out.println("\t+-------------------------------------------------------------------+");
		for (int i = 0; i < tempContact.length; i++)
		{
			System.out.println("\t|\t"+tempContact[i]+"\t|\t"+totQty[i]+"\t|\t    "+cusTotAmount[i]+"\t    |");
		}
		System.out.println("\t+-------------------------------------------------------------------+");
		
	}

//---------View customer---------////////////////////////////
	public static void printViewCus(String[] tempContact,int[] totQty,double[] cusTotAmount) {
		
		System.out.println();
		System.out.println();
		System.out.println("\t+-------------------------------------------------------------------+");
		System.out.println("\t|\tCustomer ID\t|    All Qty    |\tTotal Amount\t    |");
		System.out.println("\t+-------------------------------------------------------------------+");
		for (int i = 0; i < tempContact.length; i++)
		{
			System.out.println("\t|\t"+tempContact[i]+"\t|\t"+totQty[i]+"\t|\t    "+cusTotAmount[i]+"\t    |");
		}
		System.out.println("\t+-------------------------------------------------------------------+");
		
		
	}
	
//---------All customer Reports---------////////////////////////////

	public static int[][] allCusQty(String[] contactNo,String[] tempContact,String key,int[][] allSizes,String[] size,int[] quentity) {
		
		int[][] templlTotQty=new int[allSizes.length+1][6];
				
				
					int xs=0,s=0,m=0,l=0,xl=0,xxl=0;
					for (int i = 0; i < contactNo.length; i++)
					{
						if (key.equalsIgnoreCase(contactNo[i]))
						{
							if (size[i].equalsIgnoreCase("s"))
							{
								s+=quentity[i];
							}
							if (size[i].equalsIgnoreCase("xs"))
							{
								xs+=quentity[i];
							}
							if (size[i].equalsIgnoreCase("m"))
							{
								m+=quentity[i];
							}
							if (size[i].equalsIgnoreCase("l"))
							{
								l+=quentity[i];
							}
							if (size[i].equalsIgnoreCase("xl"))
							{
								xl+=quentity[i];
							}
							if (size[i].equalsIgnoreCase("xxl"))
							{
								xxl+=quentity[i];
							}
							
						}
					}
					
			templlTotQty[allSizes.length][0]=xs;
			templlTotQty[allSizes.length][1]=s;
			templlTotQty[allSizes.length][2]=m;
			templlTotQty[allSizes.length][3]=l;
			templlTotQty[allSizes.length][4]=xl;
			templlTotQty[allSizes.length][5]=xxl;
			
			for (int k = 0; k <allSizes.length ; k++)
				{
					for (int i = 0; i < 6; i++)
					{
					templlTotQty[k][i]=	allSizes[k][i];
						
					}
				}
				allSizes=templlTotQty;
			
		
			
		
	return 	allSizes;
		
	}
public static void printAllCus(String[] tempContact,int[][] allSizes,double[] cusTotAmount) {
		
		System.out.println();
		System.out.println();
		System.out.println("\t+---------------------------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println("\t|\tCustomer ID\t|\txs\t|\ts\t|\tm\t|\tl\t|\txl\t|\txxl\t|\tTotal Amount\t    |");
		System.out.println("\t+---------------------------------------------------------------------------------------------------------------------------------------------------+");
		for (int i = 0; i < tempContact.length; i++)
		{
			System.out.print("\t|\t"+tempContact[i]+"\t|");
			for (int j = 0; j < 6; j++)
			{
				
			System.out.print("\t"+allSizes[i][j]+"\t|");
			}
			
			System.out.println("\t    "+cusTotAmount[i]+"\t    |");
		}
		System.out.println("\t+---------------------------------------------------------------------------------------------------------------------------------------------------+");
		
		
	}

//---------Item Reports---------////////////////////////////
//---------Item sorted by Quentity---------////////////////////////////
	public static void sortedByQty(int[][] allSizes,String[] tempContact) {
		
		String[] size=new String[6];
		int[] totSize=new int[6];
		double[] totSizeAmount=new double[6];
		size[0]="xs";
		size[1]="s";
		size[2]="m";
		size[3]="l";
		size[4]="xl";
		size[5]="xxl";
		
		for (int j = 0; j < 6 ; j++)
		{
			int tot=0;
			for (int i = 0; i < tempContact.length; i++)
			{
				tot+=allSizes[i][j];
			}
			totSize[j]=tot;
		}
		
		totSizeAmount[0]=totSize[0]*600.0;
		totSizeAmount[1]=totSize[1]*800.0;
		totSizeAmount[2]=totSize[2]*900.0;
		totSizeAmount[3]=totSize[3]*1000.0;
		totSizeAmount[4]=totSize[4]*1100.0;
		totSizeAmount[5]=totSize[5]*1200.0;
		
		for (int j = 0; j < 6; j++)
		{
				for (int i = 0; i < 5; i++)
			{
				if (totSize[i]<totSize[i+1])
				{
					String tS=size[i];
					int temp=totSize[i];
				double amnt=totSizeAmount[i];
				
					totSizeAmount[i]=totSizeAmount[i+1];
					size[i]=size[i+1];
					totSize[i]=totSize[i+1];
					
					totSize[i+1]=temp;
					size[i+1]=tS;
					totSizeAmount[i+1]=amnt;
				}
			}
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("\t+---------------------------------------------------------------+");
		System.out.println("\t|     Size ID\t|    Quentity   |\t   Total Amount\t\t|");
		System.out.println("\t+---------------------------------------------------------------+");
		for (int i = 0; i < 6; i++)
		{
			System.out.println("\t|\t"+size[i]+"\t|\t"+totSize[i]+"\t|\t\t"+totSizeAmount[i]+"\t\t|");
		}
		System.out.println("\t+---------------------------------------------------------------+");
		
		
		
	}
//---------Item sorted by Amount---------////////////////////////////
	public static void sortedByAmt(int[][] allSizes,String[] tempContact) {
		
		String[] size=new String[6];
		int[] totSize=new int[6];
		double[] totSizeAmount=new double[6];
		size[0]="xs";
		size[1]="s";
		size[2]="m";
		size[3]="l";
		size[4]="xl";
		size[5]="xxl";
		
		for (int j = 0; j < 6 ; j++)
		{
			int tot=0;
			for (int i = 0; i < tempContact.length; i++)
			{
				tot+=allSizes[i][j];
			}
			totSize[j]=tot;
		}
		
		totSizeAmount[0]=totSize[0]*600.0;
		totSizeAmount[1]=totSize[1]*800.0;
		totSizeAmount[2]=totSize[2]*900.0;
		totSizeAmount[3]=totSize[3]*1000.0;
		totSizeAmount[4]=totSize[4]*1100.0;
		totSizeAmount[5]=totSize[5]*1200.0;
		
		for (int j = 0; j < 6; j++)
		{
				for (int i = 0; i < 5; i++)
			{
				if (totSizeAmount[i]<totSizeAmount[i+1])
				{
					String tS=size[i];
					int temp=totSize[i];
				double amnt=totSizeAmount[i];
				
					totSizeAmount[i]=totSizeAmount[i+1];
					size[i]=size[i+1];
					totSize[i]=totSize[i+1];
					
					totSize[i+1]=temp;
					size[i+1]=tS;
					totSizeAmount[i+1]=amnt;
				}
			}
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("\t+---------------------------------------------------------------+");
		System.out.println("\t|     Size ID\t|    Quentity   |\t   Total Amount\t\t|");
		System.out.println("\t+---------------------------------------------------------------+");
		for (int i = 0; i < 6; i++)
		{
			System.out.println("\t|\t"+size[i]+"\t|\t"+totSize[i]+"\t|\t\t"+totSizeAmount[i]+"\t\t|");
		}
		System.out.println("\t+---------------------------------------------------------------+");
		
		
		
	}
///////-----------Order Reports--------------------///////////////
//---------View Odr(All orders)---------////////////////////////////
	public static void sortedOdr(String[] orderId,String[] contactNo,String[] size,int[] quentity,double[] amount,String[] printStatus) {
		
		System.out.println();
		System.out.println();
		System.out.println("\t+-----------------------------------------------------------------------------------------------------------------------+");
		System.out.println("\t|\tOrder ID\t|\tCustomer ID\t|\tSize\t|    Quentity\t|     Amount\t|\tStatus\t\t|");
		System.out.println("\t+-----------------------------------------------------------------------------------------------------------------------+");
		for (int i = 0; i < orderId.length; i++)
		{
			System.out.println("\t|\t"+orderId[i]+"\t|\t"+contactNo[i]+"\t|\t"+size[i]+"\t|\t"+quentity[i]+"\t|     "+amount[i]+"\t|\t"+printStatus[i]+"\t|");
		}
		System.out.println("\t+-----------------------------------------------------------------------------------------------------------------------+");
		
		
		
	}
//---------Sorted by Amount---------////////////////////////////
	public static void sortedByAmt(String[] orderId,String[] contactNo,String[] size,int[] quentity,double[] amount,String[] printStatus) {
		for (int j = 0; j < orderId.length; j++)
		{
			for (int i = 0; i < orderId.length-1; i++)
		{
			if (amount[i]<amount[i+1])
			{
				double temp=amount[i];
				String oId=orderId[i];
				String Cont=contactNo[i];
				String siz=size[i];
				String pstts=printStatus[i];
				int qty=quentity[i];
				
				orderId[i]=orderId[i+1];
				amount[i]=amount[i+1];
				contactNo[i]=contactNo[i+1];
				size[i]=size[i+1];
				quentity[i]=quentity[i+1];
				printStatus[i]=printStatus[i+1];
				
				orderId[i+1]=oId;
				amount[i+1]=temp;
				contactNo[i+1]=Cont;
				size[i+1]=siz;
				quentity[i+1]=qty;
				printStatus[i+1]=pstts;
				
			}
		}
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("\t+-----------------------------------------------------------------------------------------------------------------------+");
		System.out.println("\t|\tOrder ID\t|\tCustomer ID\t|\tSize\t|    Quentity\t|     Amount\t|\tStatus\t\t|");
		System.out.println("\t+-----------------------------------------------------------------------------------------------------------------------+");
		for (int i = 0; i < orderId.length; i++)
		{
			System.out.println("\t|\t"+orderId[i]+"\t|\t"+contactNo[i]+"\t|\t"+size[i]+"\t|\t"+quentity[i]+"\t|     "+amount[i]+"\t|\t"+printStatus[i]+"\t|");
		}
		System.out.println("\t+-----------------------------------------------------------------------------------------------------------------------+");
		
		
		
	}

//---------Change Status---------////////////////////////////
	public static void changeOdrStatus(int[] status,String[] orderId,String Id) {
		Scanner input=new Scanner(System.in);
		
		int k=index(orderId,Id);
		if (status[k]==2)
		{
			System.out.println("\nCan't change this order status. Order already delivered");
		}else if (status[k]==1)
		{
		x1:while(true){
				System.out.print("\nDo you want to change this order Status?(y/n) : ");
			String yOrN=input.next();
			if (yOrN.equalsIgnoreCase("y"))
			{
				System.out.println("\t[01] Order Delivered");
	while(true){System.out.print("\nEnter Option: ");
				int x=input.nextInt();
				switch (x)
				{
					case 1:
						 status[k]=2;
						System.out.println("\tStatus changed!");
						break x1;
					default:
						System.out.println("\tWrong input ! ");continue;
				}}
				
			}else if (yOrN.equalsIgnoreCase("n"))
			{
				return;
			}else
			{
				System.out.println("\tWrong input ! ");continue;
			}
			
			}
		}
		else if (status[k]==0)
		{
		y1:while(true){
				System.out.print("\nDo you want to change this order Status?(y/n) : ");
			String yOrN=input.next();
			if (yOrN.equalsIgnoreCase("y"))
			{
				System.out.println("\t[01] Order Delivering");
				System.out.println("\t[02] Order Delivered");
	while(true){System.out.print("\nEnter Option: ");
				int x=input.nextInt();
				switch (x)
				{
					case 1:
						 status[k]=1;
						 System.out.println("\tStatus changed!");
						break y1;
					case 2:
						 status[k]=2;
						 System.out.println("\tStatus changed!");
						break y1;
					default:
						System.out.println("\tWrong input ! ");continue;
				}}
				
			}else if (yOrN.equalsIgnoreCase("n"))
			{
				return;
			}else
			{
				System.out.println("\tWrong input ! ");continue;
			}
			
			}
		}
		
		
		
		
		
	}
//---------Main method---------////////////////////////////

	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		//-------------------------------//	
		String[] orderId=new String[0];
		String[] contactNo=new String[0];
		String[] size=new String[0];
		int[] quentity=new int[0];
		double[] amount=new double[0];
		int[] status=new int[0];
		
	//-------------------------------//	
	L2:	do{
		System.out.println();
		System.out.println();
		System.out.println("\t\t/$$$$$$$                    /$$         /$$                         \t   /$$$$$$$  /$$");
		System.out.println("\t\t|$$____/                   | $$        |__/                         \t  /$$___  $$| $$");
		System.out.println("\t\t|$$    /ssssss   /$$$$$$$$ | $$$$$$$$   /$$  /$$$$$$$ /$$$$$$$$     \t | $$   \\__/| $$$$$$$$   /$$$$$$$$   /$$$$$$$");
		System.out.println("\t\t|$$$$$ |____$$  /$$_____/  | $$___  $$ | $$ /$$__  $$| $$___  $$    \t |  $$$$$$$ | $$___  $$ /$$___   $$ /$$___  $$");
		System.out.println("\t\t|$$__/ /$$$$$$ | $$$$$$$$$ | $$   \\ $$ | $$| $$  \\ $$| $$   \\ $$ \t  \\____   $$| $$   \\ $$| $$    \\ $$| $$    \\$$");
		System.out.println("\t\t|$$   /$$__ $$  \\_______$$ | $$   | $$ | $$| $$   |$$| $$   | $$   \t  /$$   \\ $$| $$   | $$| $$    | $$| $$    |$$");
		System.out.println("\t\t|$$   | $$$$$$  /$$$$$$$$/ | $$   | $$ | $$| $$$$$$$/| $$   | $$    \t |  $$$$$$$/| $$   | $$|  $$$$$$$$/| $$$$$$$$/");
		System.out.println("\t\t|_/    \\_____/ |________/  |__/   |__/ |__/\\_______/ |__/   |__/  \t \\________/ |__/   |__/ \\________/ | $$_____/");
		System.out.println("\t\t                                                                                                           | $$");
		System.out.println("\t\t                                                                                                           | $$");
		System.out.println("\t\t                                                                                                           |__/");
		System.out.println("\t\t=====================================================================================================================");
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t[01] Place Order \t\t\t\t\t[02] Search Customer\n");
		System.out.println("\t\t\t\t[03] Search Order \t\t\t\t\t[04] View Reports\n");
		System.out.println("\t\t\t\t[05] Change Order Status \t\t\t\t[06] Delete Order\n");
		
		System.out.print("\n\n\t\t\t\tInput Option : ");
		int option=input.nextInt();
		clearConsole();
	
		switch (option)
		{
			case 1:
							System.out.println();
							System.out.println("\t____     _                        ______           _");
							System.out.println("\t|  _ \\  | |                      /  __  \\         | |");
							System.out.println("\t| |_) | | | _ _    ____ ____     | |  | |_ __  _ _| | ___ _ __");
							System.out.println("\t| ___/  | |/ __ '|/ ___/ __ \\    | |  | | '__/ _'_  |/ _ \\ '__|");
							System.out.println("\t| |     | | (__| | (__|  ___/    | |__| | | | (__ | | ___/ |");
							System.out.println("\t|_|     |_|\\___,_|\\____\\____|    \\______|_|  \\__,___|\\___|_|");
							System.out.println("\t==============================================================");
							System.out.println();
							System.out.println();
							System.out.println();
					
					L1:while(true){	
						orderId=enterOdrId(orderId);
						contactNo=cusContact(contactNo);
						size=shirtSize(size);
						quentity=tShirtQuentity(quentity);
						amount=getAmount(size,quentity,amount);
						status=ordStatus(status);
						do{
							System.out.print("\nDo you want to Place this order?(y/n) : ");
						String x=input.next();
						if (x.equalsIgnoreCase("y"))
						{
							System.out.println("\tOrder Placed..!");break;
						}else if (x.equalsIgnoreCase("n"))
						{
							orderId=notPlaced(orderId);
							contactNo=notPlaced(contactNo);
							size=notPlaced(size);
							quentity=notPlaced(quentity);
							status=notPlaced(status);
							amount=notPlaced(amount);
							
							
							break;
						}else
						{
							System.out.println("\tWrong Input!");continue;
						}
					}while(true);
						
					do{		System.out.print("\n\nDo you want to place another Order?(y/n) : ");
						String y=input.next();
						
						if (y.equalsIgnoreCase("y"))
						{
							clearConsole();
							System.out.println();
							System.out.println("\t____     _                        ______           _");
							System.out.println("\t|  _ \\  | |                      /  __  \\         | |");
							System.out.println("\t| |_) | | | _ _    ____ ____     | |  | |_ __  _ _| | ___ _ __");
							System.out.println("\t| ___/  | |/ __ '|/ ___/ __ \\    | |  | | '__/ _'_  |/ _ \\ '__|");
							System.out.println("\t| |     | | (__| | (__|  ___/    | |__| | | | (__ | | ___/ |");
							System.out.println("\t|_|     |_|\\___,_|\\____\\____|    \\______|_|  \\__,___|\\___|_|");
							System.out.println("\t==============================================================");
							System.out.println();
							System.out.println();
							System.out.println();
						
						continue L1;
						}else if(y.equalsIgnoreCase("n"))
						{	clearConsole();
							continue L2;
							
						}else
						{
							System.out.println("\tWrong input..!");continue;
						}
					} while (true);
				}
					
					
//-----------------Search Customer---------------------------		
			case 2://---------------------//
					
					//--------------------//
					
		L3:while(true){
					System.out.println();
					System.out.println("\t  _____                        _              _____           _");
					System.out.println("\t/  ____|                      | |           / _____|         | |");
					System.out.println("\t| (____    ___  __ _ _ __ ____| |__        | |      _   _ ___| |_ ___  _ ___ ____    ___ _ __");
					System.out.println("\t\\____  \\ / __ \\/ _' | '__/ ___|  _  \\      | |     | | | / __| __/ _ \\| '__ ' __  \\/ __ \\ '__|");
					System.out.println("\t ____)  |  ___/ (_| | | | (___| | | |      | |_____| |_| \\__ \\ || (_) | |  | |  | |   __/ |");
					System.out.println("\t|______/ \\____|\\__,_|_|  \\____|_| |_|       \\______\\___,_|___/\\__\\___/|_|  |_|  |_|\\____|_|");
					System.out.println("\t=============================================================================================");
					System.out.println();
					System.out.println();
					System.out.println();
					
					System.out.print("Enter customer phone Number : ");
					String phone=input.next();
					if (checkDuplicate(contactNo,phone)==false)
					{	System.out.println("+---------------------------------------------------+");
						System.out.println("|\tSize\t|    Quentity   |\tAmount\t    |");
						System.out.println("+---------------------------------------------------+");
						
						getContactNo(phone,contactNo,size,quentity,amount);
						
						System.out.println("+---------------------------------------------------+");
						
					}else
					{
						System.out.println("\tInvalid Phone number..!");
					}
					
					System.out.println();
					
					do{System.out.print("\n\nDo you want to search another customer report?(y/n) : ");
					String y=input.next();
					if (y.equalsIgnoreCase("y"))
					{
						clearConsole();
						continue L3;
					}else if (y.equalsIgnoreCase("n"))
					{
						clearConsole();
							continue L2;
					}else
					{
						System.out.println("\tWrong input..!");continue ;
					}
				}while(true);
			}
			
//------------------------------search Order-------------------------			
			case 3:	
					
			L4:	while(true){
						System.out.println();
						System.out.println("\t  _____                        _         ___          _");
						System.out.println("\t/  ____|                      | |      / __ \\        | |");
						System.out.println("\t| (____    ___  __ _ _ __ ____| |__   | |  | |_ __ __| | ___ _ __");
						System.out.println("\t\\____  \\ / __ \\/ _' | '__/ ___|  _  \\ | |  | | '__/ _  |/ _ \\ '__|");
						System.out.println("\t ____)  |  ___/ (_| | | | (___| | | | | |__| | | | (_| |  __/ |");
						System.out.println("\t|______/ \\____|\\__,_|_|  \\____|_| |_|  \\____/|_|  \\__,_|\\___|_|");
						System.out.println("\t=================================================================");
						System.out.println();
						System.out.println();
						System.out.println();
					
					System.out.print("Enter Order ID : ");
					String id=input.next();
					
					if (index(orderId,id)==-1)
					{
						System.out.println("\tInvalid ID..!");
					}else
					{
						printOrder( orderId, id, contactNo,size,quentity, amount,status);
					}
				do{
						System.out.print("\n\nDo you want to search another Order?(y/n) : ");
					String y=input.next();
					if (y.equalsIgnoreCase("y"))
					{
						clearConsole();
						continue L4;
					}else if (y.equalsIgnoreCase("n"))
					{
						clearConsole();
							continue L2;
					}else
					{
						System.out.println("\tWrong input..!");continue ;
					}
				}while(true);
			}

//-----------------------------------view reports---------------------------------------

			case 4:		
					System.out.println("\t\t ____                         _");
					System.out.println("\t\t|  _  \\                      | |");
					System.out.println("\t\t| |_)  |___ _ __    ___  _ __| |_ ___");
					System.out.println("\t\t|  _  // _ \\ '_  \\ / _ \\| '__| __/ __|");
					System.out.println("\t\t| | \\ \\  __/ |_)  | (_) | |  | |_\\__ \\");
					System.out.println("\t\t|_|  \\_\\___| .___/ \\___/|_|   \\__|___/");
					System.out.println("\t\t           | |");
					System.out.println("\t\t           |_|");
					System.out.println("\t=====================================================");
					System.out.println("\n\n\t\t[01] Customer Reports\n");   
					System.out.println("\t\t[02] Item Reports\n");
					System.out.println("\t\t[03] Orders Reports\n");
					System.out.println();
					
	LL2:	while(true){
						System.out.print("\nEnter Option : ");
					int viewOpt=input.nextInt();
					
///////////////Customer Report calculations///////////////////////////////////
			
				int[] totQty=new int[0];
				double[] cusTotAmount=new double[0];
				String[] tempContact=notDupCntct(contactNo);
				int[][] allSizes=new int[0][0];	
				
				int[] tempstts=new int[orderId.length];	
				int[] tempQnt=new int[orderId.length];	
				double[] tempamt=new double[orderId.length];	
				String[] tempOID=new String[orderId.length];
				String[] tempCnt=new String[orderId.length];
				String[] tempsz=new String[orderId.length];
				for (int i = 0; i < status.length; i++)
				{
					tempstts[i]=status[i];
					tempQnt[i]=quentity[i];
					tempamt[i]=amount[i];
					tempOID[i]=orderId[i];
					tempCnt[i]=contactNo[i];
					tempsz[i]=size[i];
				}																	
							
				String[] PrintStatusView=PrintStatus(status);	
				String[] PrintStatusAmt=PrintStatus(tempstts);	
				for (int i = 0; i < tempContact.length; i++)
				{
				totQty=totCusQty(contactNo,tempContact[i],quentity,totQty);
				cusTotAmount=totalOfCusAmt(contactNo,tempContact[i],amount,cusTotAmount);
				allSizes=allCusQty(contactNo,tempContact,tempContact[i],allSizes,size,quentity);
				}
					switch (viewOpt)
					{
						case 1:clearConsole();//////////////////////////////
								System.out.println("\t   _____           _                                   ____                         _");
					System.out.println("\t / _____|         | |                                 |  _  \\                      | |");
					System.out.println("\t| |      _   _ ___| |_ ___  _ ___ ____    ___ _ __    | |_)  |___ _ __    ___  _ __| |_ ___");
					System.out.println("\t| |     | | | / __| __/ _ \\| '__ ' __  \\/ __ \\ '__|   |  _  // _ \\ '_  \\ / _ \\| '__| __/ __|");
					System.out.println("\t| |_____| |_| \\__ \\ || (_) | |  | |  | |   __/ |      | | \\ \\  __/ |_)  | (_) | |  | |_\\__ \\");
					System.out.println("\t \\______\\___,_|___/\\__\\___/|_|  |_|  |_|\\____|_|      |_|  \\_\\___| .___/ \\___/|_|   \\__|___/");
					System.out.println("\t\t                                                         | |");
					System.out.println("\t\t                                                         |_|");
					System.out.println("\t=============================================================================================");
					System.out.println();
					System.out.println();
					System.out.println();
							System.out.println("\t\t[01] Best in Customers\n");
							System.out.println("\t\t[02] View Customers\n");
							System.out.println("\t\t[03] All Customer Reports\n");
							System.out.println();
				LL1:	while(true){
								System.out.print("Enter Option : ");
							int cus_reprt_Opt=input.nextInt();
							

							/////////////////
								switch (cus_reprt_Opt)
										{//***************
											case 1:	clearConsole();
											System.out.println();
					System.out.println("\t\t ___             _          _____           _");
					System.out.println("\t\t|  _ \\          | |       / _____|         | |");
					System.out.println("\t\t| |_) | ___  ___| |_     | |      _   _ ___| |_ ___  _ ___ ____    ___ _ __   __");
					System.out.println("\t\t|  _ < / _ \\/ __| __|    | |     | | | / __| __/ _ \\| '__ ' __  \\/ __ \\ '__|/ __|");
					System.out.println("\t\t| |_) |  __/\\__ \\ |_     | |_____| |_| \\__ \\ || (_) | |  | |  | |   __/ |   \\__ \\");
					System.out.println("\t\t|____/ \\___||___/\\__|     \\______\\___,_|___/\\__\\___/|_|  |_|  |_|\\____|_|   |___/");
					System.out.println("\t=============================================================================================");
					System.out.println();
					System.out.println();
					System.out.println();
													
													//-------print-------
													if (orderId.length==0)
													{
														System.out.println("\tNo any order to Show... Please Enter Orders First.!");
													}else
													{
														printBestCus(tempContact,totQty,cusTotAmount);
													}
													 
												break LL1;
											//***************	
												
												
											case 2:clearConsole();
											System.out.println();
					System.out.println("\t\t__      ___                        _____           _");
					System.out.println("\t\t\\ \\    / (_)                     / _____|         | |");
					System.out.println("\t\t \\ \\  / / _  _____        __    | |      _   _ ___| |_ ___  _ ___ ____    ___ _ __   __");
					System.out.println("\t\t  \\ \\/ / | |/ _ \\ \\  /\\  / /    | |     | | | / __| __/ _ \\| '__ ' __  \\/ __ \\ '__|/ __|");
					System.out.println("\t\t   \\  /  | | ___/\\ \\/  \\/ /     | |_____| |_| \\__ \\ || (_) | |  | |  | |   __/ |   \\__ \\");
					System.out.println("\t\t    \\/   |_|\\___| \\__/\\__/       \\______\\___,_|___/\\__\\___/|_|  |_|  |_|\\____|_|   |___/");
					System.out.println("\t       =============================================================================================");
					System.out.println();
					System.out.println();
					System.out.println();
											//---------print---------
											
													if (orderId.length==0)
													{
														System.out.println("\tNo any order to Show... Please Enter Orders First.!");
													}else
													{
														printViewCus(tempContact,totQty,cusTotAmount);
													}
											
												break LL1;
											//*******************
											case 3:clearConsole();
											System.out.println();
					System.out.println("\t\t          _ _       _____           _                                         ____                         _");
					System.out.println("\t\t    /\\   | | |    / _____|         | |                                       |  _  \\                      | |");
					System.out.println("\t\t   /  \\  | | |   | |      _   _ ___| |_ ___  _ ___ ____    ___ _ __   __     | |_)  |___ _ __    ___  _ __| |_ ___");
					System.out.println("\t\t  / /\\ \\ | | |   | |     | | | / __| __/ _ \\| '__ ' __  \\/ __ \\ '__|/ __|    |  _  // _ \\ '_  \\ / _ \\| '__| __/ __|");
					System.out.println("\t\t / ____ \\| | |   | |_____| |_| \\__ \\ || (_) | |  | |  | |   __/ |   \\__ \\    | | \\ \\  __/ |_)  | (_) | |  | |_\\__ \\");
					System.out.println("\t\t/_/    \\_\\_|_|    \\______\\___,_|___/\\__\\___/|_|  |_|  |_|\\____|_|   |___/    |_|  \\_\\___| .___/ \\___/|_|   \\__|___/");
					System.out.println("\t\t                                                                                        | |");
					System.out.println("\t\t                                                                                        |_|");
					System.out.println("\t       ====================================================================================================================");
					System.out.println();
					System.out.println();
					System.out.println();
											
											if (orderId.length==0)
													{
														System.out.println("\tNo any order to Show... Please Enter Orders First.!");
													}else
													{
											printAllCus(tempContact,allSizes,cusTotAmount);
										}
											break LL1;
											
											default:
												System.out.println("\twrong Input!\n");continue;
											//***************
												
										}}
						/////////////////////////////////////////////////////
							
						break LL2;
						
			/////////////item reports////////////////			
					case 2:clearConsole();
							System.out.println();
					System.out.println("\t\t _______ _                      ____                         _");
					System.out.println("\t\t|__   __| |                    |  _  \\                      | |");
					System.out.println("\t\t   | |  | |__ __ _ __ ___      | |_)  |___ _ __    ___  _ __| |_ ___");
					System.out.println("\t\t   | |  | __/ _ \\ '_ ' _  \\    |  _  // _ \\ '_  \\ / _ \\| '__| __/ __|");
					System.out.println("\t\t __| |__| ||  __/ | | | | |    | | \\ \\  __/ |_)  | (_) | |  | |_\\__ \\");
					System.out.println("\t\t|_______|\\__\\___|_| |_| |_|    |_|  \\_\\___| .___/ \\___/|_|   \\__|___/");
					System.out.println("\t\t                                          | |");
					System.out.println("\t\t                                          |_|");
					System.out.println("\t    ==============================================================================");
					System.out.println();
					System.out.println();
					System.out.println();
							System.out.println("\t\t[01] Best selling categories sorted by Quentity");
							System.out.println("\t\t[02] Best selling categories sorted by Amount");
							System.out.println();
				LL3:while(true){
								System.out.print("Enter Option : ");
							int itm_reprt_Opt=input.nextInt();
							
							//**********************************
								switch (itm_reprt_Opt)
								{
									case 1:clearConsole();
									System.out.println("\n\n\t================================================");
									System.out.println("\t|\t\tSorted by Quentity\t\t|");
									System.out.println("\t================================================\n\n");
									System.out.println();
										 
										 if (orderId.length==0)
													{
														System.out.println("\tNo any order to Show... Please Enter Orders First.!");
													}else
													{
										 sortedByQty(allSizes,tempContact);
									 }
										break LL3;
										
									case 2:clearConsole();
									System.out.println("\n\n\t================================================");
									System.out.println("\t|\t\tSorted by Amount\t\t|");
									System.out.println("\t================================================\n\n");
									System.out.println();
										 
										 if (orderId.length==0)
													{
														System.out.println("\tNo any order to Show... Please Enter Orders First.!");
													}else
													{
													sortedByAmt(allSizes,tempContact);
												}
										break LL3;
									default:
										 System.out.println("\twrong Input!\n");continue;
								}}
							break LL2;
							
					//////////////////////////////	
					
					case 3:clearConsole();
						System.out.println("\n\n\t========================================");
							System.out.println("\t|\t\tOrder Reports\t\t|");
							System.out.println("\t========================================\n\n");
							System.out.println();
							System.out.println("\t\t[01] All Orders");
							System.out.println("\t\t[02] Orders by Amount");
							System.out.println();
			LL4:while(true){
								System.out.print("Enter Option : ");
							int odr_reprt_Opt=input.nextInt();
							
									
									switch (odr_reprt_Opt)
									{
										case 1:clearConsole();
												System.out.println("\n\n\t=========================================");
												System.out.println("\t|\t\tView Orders\t\t|");
												System.out.println("\t=========================================\n\n");
												System.out.println();
												
												if (orderId.length==0)
													{
														System.out.println("\tNo any order to Show... Please Enter Orders First.!");
													}else
													{
														sortedOdr(orderId,contactNo,size,quentity,amount,PrintStatusView);
														
													}
											break LL4;
											
										case 2:clearConsole();
											System.out.println("\n\n\t================================================");
											System.out.println("\t|\t\tOrders by Amount\t\t|");
											System.out.println("\t================================================\n\n");
											System.out.println();
											if (orderId.length==0)
													{
														System.out.println("\tNo any order to Show... Please Enter Orders First.!");
													}else
													{
											sortedByAmt(tempOID,tempCnt,tempsz,tempQnt,tempamt,PrintStatusView);
													}
											
											break LL4;
											
										default:
										System.out.println("\twrong Input!\n");continue;
											 
									}}
									
									
					//////////////////////////////
							
					break LL2;
					default:
					System.out.println("\twrong Input!\n");continue;
							
					}
				}
					
					
					System.out.println();
					
					do{
						System.out.print("To access main menu? Please Enter 0 : ");
					int enter=input.nextInt();
					if (enter==0)
					{
						clearConsole();
						continue L2;
					}else
					{
						System.out.println("\t Wrong input ...!\n");continue;
					}
				}while(true);
					
					
//----------------------------------change order status----------------------					
						
				case 5:	
					
		
		L6:while(true){
						System.out.println();
						System.out.println("\t  ____          _                  _____ _        _");
						System.out.println("\t / __ \\        | |                / ____| |      | |");
						System.out.println("\t| |  | |_ __ __| | ___ _ __      | (___ | |_ __ _| |_ _   _ ___");
						System.out.println("\t| |  | | '__/ _  |/ _ \\ '__|      \\___ \\| __/ _' | __| | | / __|");
						System.out.println("\t| |__| | | | (_| |  __/ |         ____) | || (_| | |_| |_| \\__ \\");
						System.out.println("\t \\____/|_|  \\__,_|\\___|_|        |_____/\\___\\__,_|\\__|\\__,_|___/");
						System.out.println("\t=================================================================");
						System.out.println();
						System.out.println();
						System.out.println();
			    
					//////////////////////////////////////////
					
			while(true){
						System.out.print("Enter Order ID : ");
					String id=input.next();
					
					if (index(orderId,id)==-1)
					{
						System.out.println("\n\tInvalid ID..!\n");continue;
					}else
					{
						printOrder( orderId, id, contactNo,size,quentity, amount,status);
					}
					
					changeOdrStatus(status,orderId,id);
					break;
				}
					
					
					
					//////////////////////////////////////////
					do{
						System.out.print("\n\nDo you want to change another Order Status?(y/n) : ");
					String y=input.next();
					if (y.equalsIgnoreCase("y"))
					{
						clearConsole();
						continue L6;
					}else if (y.equalsIgnoreCase("n"))
					{
						clearConsole();
							continue L2;
					}else
					{
						System.out.println("\tWrong input..!");continue ;
					}
				}while(true);		
						
				}	
					
//---------------------------------Delete Order----------------------------
			
				case 6:		
				L5:while(true){
							System.out.println();
							System.out.println();
							
							System.out.println("\t\t _____       _      _");
							System.out.println("\t\t|  __ \\     | |    | |");
							System.out.println("\t\t| |  | | ___| | ___| |_ ___");
							System.out.println("\t\t| |  | |/ _ \\ |/ _ \\ __/ _ \\");
							System.out.println("\t\t| |__| | ___/ | ___/ ||  __/");
							System.out.println("\t\t|_____/ \\___|_|\\___|\\__\\___|");
							System.out.println("\t\t============================");

							System.out.println();
							System.out.println();
							System.out.println();
					
					System.out.print("Enter order ID : ");
					String deleteKey=input.next();
					
					///////////
					if (deleteHereOrNot(orderId,deleteKey))
					{
					do{	System.out.print("\nDo you want delete this Order?(y/n) : ");
						String sure=input.next();
						if (sure.equalsIgnoreCase("y"))
						{	System.out.println("\tOrder is Deleted!...");
							
							
							contactNo=deleteOrderId(orderId,deleteKey,contactNo);
							size=deletesize(orderId,deleteKey,size);
							quentity=deletequentity(orderId, deleteKey,quentity);
							status=deletequentity(orderId, deleteKey,status);
							amount=deleteamount(orderId,deleteKey,amount);
							orderId=deleteOrderId(orderId,deleteKey);
							
							break;
						}else if (sure.equalsIgnoreCase("n"))
						{
							break;
						}else
						{
							System.out.println("\tinvalid input..."); continue;
						}
					}while(true);	
					}else
					{
						System.out.println("\tinvalid Order Id...");
					}
				
						///////////
					
					do{
						System.out.print("\nDo you want to delete another Order?(y/n) : ");
						String delete=input.next();
					if (delete.equalsIgnoreCase("y"))
					{
						clearConsole();
						
						continue L5;
					}else if (delete.equalsIgnoreCase("n"))
					{
						clearConsole();
						continue L2;
					} else
					{
						System.out.println("\t Wrong input ...!\n");continue;
					}
				}while(true);
			}
				
		/////////////////////////////////////////////////////////////////////////////			
			default:
		}}while(true);
		
	}
}
