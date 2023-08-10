package br.com.caelum.vraptor.controller;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.model.User;

@Path("home")
@Controller
public class HomeController {
	@Get("")
	public void home() {
		
	}
	@Post("saveuser")
	public void saveUser(User user) {
		System.out.println (user.getName());
   

}
}
