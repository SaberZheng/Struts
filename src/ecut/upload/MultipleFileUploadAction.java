package ecut.upload;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;

public class MultipleFileUploadAction implements Action {
	
	private static Logger logger = LogManager.getLogger();
	
	private String storePath ;
	
	private List<File> upload ; 
	private  List<String> uploadContentType ; 
	private  List<String> uploadFileName ;

	@Override
	public String execute() throws Exception {
		logger.info("upload.get(0)对应的类型是uploadContentType.get(0),对应的文件名是uploadFileName.get(0)");
		
		for(int i =0 ; i < upload.size(); i++){
			//getCanonicalPath获取规范化路径
			Path source = Paths.get( upload.get(i).getCanonicalPath() );
			
			Path target = Paths.get( this.storePath , uploadFileName.get(i) );
			
			//Replace an existing file if it exists.
			Files.copy( source , target , StandardCopyOption.REPLACE_EXISTING );
		}
		return SUCCESS;
	}

	public String getStorePath() {
		return storePath;
	}

	public void setStorePath(String storePath) {
		this.storePath = storePath;
	}

	public List<File> getUpload() {
		return upload;
	}

	public void setUpload(List<File> upload) {
		this.upload = upload;
	}

	public List<String> getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(List<String> uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public List<String> getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	
}