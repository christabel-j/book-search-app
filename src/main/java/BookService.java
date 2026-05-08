/*
What it does:
1. Receive search query (String)

2. Build URL

3. Send HTTP request

4. Get response (JSON)

5. Return result
 */

// for api calls
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// for jackson ObjectMapper
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;



public class BookService {
    public String buildURL(String bookQuery) {
        // remove spaces and replace them with '+'
        String trimmedQuery = bookQuery.trim(); // remove leading and trailing whitespace

        String cleanQuery = trimmedQuery.replaceAll("\\s+", "+"); // replace spaces with '+'

        // add to base url and return
        return "https://openlibrary.org/search.json?q=%s".formatted(cleanQuery);
    }

    public String callAPI(String url) {

        try{
            // 1) Create the HTTP client
            HttpClient client = HttpClient.newHttpClient();

            // 2) Build the request
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

            // 3) Send the request and get the response as a String
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();
        } catch (Exception e){
            return "Something went wrong.";
        }

    }

    // method to turn the json string response into book objects
    public void parseBooks(String jsonString) {
        try {
            // 1 - create new object mapper
            ObjectMapper mapper = new ObjectMapper();


            // 2 - Feed JSON string into Jackson (parse to a JsonNode tree)
            JsonNode root = mapper.readTree(jsonString);

            // Tiny proof it worked: number of books found
            int numFound = root.get("numFound").asInt();
            System.out.println("Results found: " + numFound);

            // extract first book title
            JsonNode docs = root.get("docs");
            String firstBookTitle = docs.get(0).path("title").asText();
            System.out.println("Book 1 - Title: " + firstBookTitle);

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }


    }

}
