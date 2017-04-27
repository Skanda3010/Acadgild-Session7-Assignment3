public class NullPointerHnadling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name=null;
		int id=0,phoneNumber=0;
		
		//some code
		
		try{
			if(name.equals("Acadgild")){
				id = 12345;
				phoneNumber=33841234;
			}
			
			System.out.println("THe id is "+id+" and the phone number is "+phoneNumber);
		}catch(NullPointerException e){
			System.out.println("Exception!! the name is null");
			e.printStackTrace();
		}

	}

}
