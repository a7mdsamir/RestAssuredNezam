import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class postRequestNonBDD {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api/users" ;
        RequestSpecification request = RestAssured.given();
        request.body("{\"name\": \"mohamed\",\"job\": \"web dev\"}" ) ;
        request.header("Content-Type", "application/json") ;
        Response response = request.post();
        response.prettyPrint();

//        response.then().statusCode(201);
        int stausCode = response.getStatusCode();
        Assert.assertEquals(stausCode, 201);

    }
}
