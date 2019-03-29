package myPack;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Limbya {
@Test
public static void verifyLogin(){
	Assert.assertEquals(11,11);
	System.out.println("Verify Login success!");
}
@Test
public static void addEmp(){
	Assert.assertEquals(11,11);
	System.out.println("Add emp success!");
}
@Test
public static void editEmp(){
	System.out.println("Edit emp success!");
}
@Test
public static void deleteEmp(){
	System.out.println("Delete emp success!");
}
}
