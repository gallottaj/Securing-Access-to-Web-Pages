package controlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.User;
import business.OrdersBusinessInterface;

@ManagedBean
@ViewScoped
public class FormController {

	// EJB
	@Inject
	OrdersBusinessInterface service;

	public String Logoff() {

		// Invalidate the Session to clear the security token
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();

		// Redirect to a protected page (so we get a full HTTP Request) to get Login
		// Page
		return "TestResponse.xhtml?faces-redirect=true";

	}

}
