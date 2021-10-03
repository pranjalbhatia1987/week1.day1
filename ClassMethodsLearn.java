package Week1day1;

public class ClassMethodsLearn {

	// variables
	//float size;// declaration
	//size=14.5f;// initialization

	// float size = 14.5f;//initialization and declaration

	String shape;
	String IMEI;
	char brandName;
	int resolution;
	byte weight;
	boolean isTouchscreen;
	short costMobile;

	// MethodS/bEHAVIOUR

	public void makecalls() {

		System.out.println("Making calls");

	}

	public void viewGallery() {

		System.out.println("Viewing the Gallery");

	}

	// to make use of the members of the class
	// step 1:main() method to be created
	// step 2:create an object//instatntiating
	//when object is create dit means memory is allocated
    // when the class is created memory is not allocated
	//only when object is created referenc place is created and memory is allocated
	//members of the class can be accessed only through the objects
	
	public static void main(String[] args) {
		
		ClassMethodsLearn samsung = new ClassMethodsLearn();
		samsung.brandName = 'S';
		samsung.costMobile = 30000;
		samsung.makecalls();
		samsung.viewGallery();
		System.out.println("This is for Samsung " + samsung.costMobile);
		
		
		
		
		
		ClassMethodsLearn apple = new ClassMethodsLearn();
		apple.brandName = 'A';
		apple.costMobile = 31000;
		apple.makecalls();
		apple.viewGallery();
		
		System.out.println("This is for Apple " + apple.costMobile);
		
		ClassMethodsLearn RedMi = new ClassMethodsLearn();
		

	}
	
}
