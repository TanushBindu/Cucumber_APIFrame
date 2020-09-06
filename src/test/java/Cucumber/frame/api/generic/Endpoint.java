package Cucumber.frame.api.generic;

public enum Endpoint 
{
	List_of_user("/api/users?page=2"),
	Single_user("/api/users/2"),
	SINGLE_USER_NOT_FOUND("/api/users/23"),
	LIST_RESOURCE("/api/unknown");
	
	
	private String end;
	Endpoint(String end)
	{
		this.end = end;
	}
	
	public String get_end()
	{
		return end;
	}
}
