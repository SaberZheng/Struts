package ecut.results.action;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.malajava.util.GraphicHelper;

import com.opensymphony.xwork2.Action;

public class IdentityCodeAction implements Action {
	private InputStream inputStream;

	@Override
	public String execute() throws Exception {
		String name = "code.jpg";
		
		Path path = Paths.get(name);
		OutputStream out = Files.newOutputStream(path);
		String code = GraphicHelper.create(4, false, 100, 50, out, 50);
		
		inputStream = Files.newInputStream(path);
		
		System.out.println(code);

		return SUCCESS;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

}
