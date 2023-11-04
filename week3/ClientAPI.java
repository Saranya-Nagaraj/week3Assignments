package week3;

public class ClientAPI {

           public void sendRequest(String endpoint) {
		        System.out.println("Sending a request to endpoint: " + endpoint);
		        
		    }

		    
		    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		        System.out.println("Sending a request to endpoint: " + endpoint);
		        System.out.println("Request Body: " + requestBody);
		        System.out.println("Request Status: " + (requestStatus ? "Successful" : "Failed"));
		        
		    }

		    public static void main(String[] args) {
		        
		        ClientAPI apiClient = new ClientAPI();
                apiClient.sendRequest("api/endpoint1");
                apiClient.sendRequest("api/endpoint2", "Some request data", false);
		    }
		}


	


