import io.restassured.RestAssured;

public class postRequest {
    public static void main(String[] args) {
        RestAssured
                .given()
                .baseUri("https://reqres.in/api/users")
                .header("Content-Type", "application/json")
                .body("{\"name\": \"ahmed\",\"job\": \"QC engineer\"}" )
                .when()
                .post()
                .prettyPrint();
    }
}
