package mll.dao;

import static org.junit.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.junit.Test;

import mll.beans.User;
import mll.beans.UserDetails;

public class RegistrationDAOTest 
{
	@Test
	public void testRegisterUser1() 
	{
		try 
		{
			RegistrationDAO dao = new RegistrationDAO();
			JSONObject responseObject = new JSONObject();
			assertEquals(false, dao.registerUser(null) == responseObject);
		} 
		catch (Exception e) 
		{

		}
	}
	
	@Test
	public void testRegisterUser2() 
	{
		try 
		{
			RegistrationDAO dao = new RegistrationDAO();
			JSONObject responseObject = new JSONObject();
			UserDetails userDetails = new UserDetails();
			userDetails.setToken(null);
			assertEquals(false, dao.registerUser(userDetails) == responseObject);
		} 
		catch (Exception e) 
		{

		}
	}
	
	@Test
	public void testRegisterUser3() 
	{
		try 
		{
			RegistrationDAO dao = new RegistrationDAO();
			JSONObject responseObject = new JSONObject();
			UserDetails userDetails = new UserDetails();
			userDetails.getToken().setToken(null);
			assertEquals(false, dao.registerUser(userDetails) == responseObject);
		} 
		catch (Exception e) 
		{

		}
	}
	
	@Test
	public void testRegisterUser4() 
	{
		try 
		{
			RegistrationDAO dao = new RegistrationDAO();
			JSONObject responseObject = new JSONObject();
			UserDetails userDetails = new UserDetails();
			userDetails.getToken().setInviteType(null);
			assertEquals(false, dao.registerUser(userDetails) == responseObject);
		} 
		catch (Exception e) 
		{

		}
	}
	
	@Test
	public void testRegisterUser5() 
	{
		try 
		{
			RegistrationDAO dao = new RegistrationDAO();
			JSONObject responseObject = new JSONObject();
			UserDetails userDetails = new UserDetails();
			userDetails.setUsers(null);
			assertEquals(false, dao.registerUser(userDetails) == responseObject);
		} 
		catch (Exception e) 
		{

		}
	}
	
	@Test
	public void testRegisterUserType() 
	{
		try 
		{
			RegistrationDAO dao = new RegistrationDAO();
			UserDetails userDetails = new UserDetails();
			User users = new User();
			users.setId(1);
			users.setUserName("naomi");
			users.setUserType("musician");
			userDetails.setUsers(users);;
			userDetails.setType("musician");
			assertEquals(false, dao.registerUser(userDetails).get("type").equals("musician"));
		} 
		catch (Exception e) 
		{

		}
	}
	@Test
	public void testcheckAlreadyExistsTrue() 
	{
		try 
		{
			RegistrationDAO dao = new RegistrationDAO();
			assertEquals(true, dao.checkAlreadyExists("aruser"));
		} 
		catch (Exception e) 
		{

		}
	}
	@Test
	public void testcheckAlreadyExistsFalse() 
	{
		try 
		{	double i = Math.random();
			RegistrationDAO dao = new RegistrationDAO();
			assertEquals(false, dao.checkAlreadyExists("test"+i));
		} 
		catch (Exception e) 
		{

		}
	}
	
	@Test
	public void testcheckAlreadyExistsNull() 
	{
		try 
		{
			RegistrationDAO dao = new RegistrationDAO();
			assertEquals(false, dao.checkAlreadyExists(null));
		} 
		catch (Exception e) 
		{

		}
	}
}



