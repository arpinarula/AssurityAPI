package apiTest.AssurityAPI;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITest {

	// TODO Auto-generated method stub

	@Test
	public void apiTestAssurity() throws Exception {
		try {
			
			// Establishing Connection to get the JSON data
			URL url = new URL("https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			// Throw exception on Error in connecting to the API URL
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("HTTP error code :" + conn.getResponseCode());
			}

			// Scanning the JSON Response from the API URL
			Scanner scan = new Scanner(url.openStream());
			String entireResponse = new String();
			while (scan.hasNext())
				entireResponse += scan.nextLine();
			// Printing Response
			System.out.println("Response : " + entireResponse);
			scan.close();

			// Reading Response as JSON Object
			JSONObject objResponse = new JSONObject(entireResponse);

			// Validating ACCEPTANCE CRITERIA
			// --------ACCEPTANCE CRITERIA 1: Response Object Name = "Carbon
			// credits"
			Assert.assertEquals(objResponse.get("Name"), "Carbon credits", "Unexpected Value: Name");

			// --------ACCEPTANCE CRITERIA 2:Response Object CanRelist = true
			Assert.assertEquals(objResponse.getBoolean("CanRelist"), true, "Incorrect value: CanRelist");

			// Getting Promotions Array
			JSONArray arrPromo = objResponse.getJSONArray("Promotions");

			// Iterating inside promotions array using array length
			for (int i = 0; i < arrPromo.length(); i++) {

				// Getting JSON Objects present in the promotions array
				JSONObject promoObj = arrPromo.getJSONObject(i);
				String namePromo = promoObj.get("Name").toString();

				// -------ACCEPTANCE CRITERIA 3 " Name = "Gallery" has
				// Description contain
				// "2xlarger image"
				if (namePromo.equals("Gallery")) {
					// Validating description contains 2x larger image
					String descPromo = promoObj.get("Description").toString();
					if (descPromo.contains("2x larger image")) {
						// Final Test Result
						System.out.println("ACCEPTANCE CRITERIA 1 PASS: GIVEN  Name:=" + objResponse.get("Name"));
						System.out.println("ACCEPTANCE CRITERIA 2 PASS: GIVEN  CanRelist:= "
								+ objResponse.getBoolean("CanRelist"));
						System.out.println("ACCEPTANCE CRITERIA 3 PASS WHEN 'Promotion Element Name'=" + namePromo
								+ " THEN Description: " + descPromo);
						System.out.println(" API TEST PASS ");
						break;
					} else {
						// Fail test case for error in validation for
						// description
						Assert.assertTrue(descPromo.contains("2x larger image"),
								"Incorrect value for Description when Name=Gallery");
					}
				} else {
					// Error when complete JSON objects for Promotions Scanned
					// but Name="Gallery" not found
					if (i == arrPromo.length() - 1)
						Assert.assertEquals(namePromo, "Gallery", "Name = 'Gallery' not present in Promotions");
				}

			}

			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
