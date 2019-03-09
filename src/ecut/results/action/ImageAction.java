package ecut.results.action;

import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.opensymphony.xwork2.Action;

public class ImageAction implements Action {

	private String storePath; // 文件的存储目录

	private String filename; // 被下载的文件的名称
	//JSP中可以通过${requestScope.name}获取到值，也可以直接${name}按照page-request-session-application 的顺序去查找
	private String name; // 被下载的文件的名称

	private InputStream inputStream;

	@Override
	public String execute() throws Exception {

		filename = "Koala.jpg";

		// inputStream = new FileInputStream( "D:/"" + name ) ;

		Path path = Paths.get(storePath, filename);
		inputStream = Files.newInputStream(path);
		if (name != null) {
			name = URLEncoder.encode(name, "UTF-8");
		}else{
			name = filename;
		}
		
		return SUCCESS;
	}

	public String getStorePath() {
		return storePath;
	}

	public void setStorePath(String storePath) {
		this.storePath = storePath;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
