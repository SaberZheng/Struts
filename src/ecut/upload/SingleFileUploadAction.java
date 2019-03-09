package ecut.upload;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;

public class SingleFileUploadAction implements Action {
	
	private static Logger logger = LogManager.getLogger();
	//保存文件的位置，上传文件到那个目录
	private String storePath ;
	// [File Name] : File - the actual File,与表单中的name保持一致
	private File upload ; 
	// [File Name]ContentType : String - the content type of the file,文件内容类型
	private String uploadContentType ; 
	// [File Name]FileName : String - the actual name of the file uploaded (not the HTML name),实际的文件名
	private String uploadFileName ;

	@Override
	public String execute() throws Exception {
		//临时文件
		logger.info( "upload : " + upload );
		logger.info( "content type : " + uploadContentType );
		logger.info( "file name : " + uploadFileName );
		
		//getCanonicalPath获取规范化路径
		Path source = Paths.get( upload.getCanonicalPath() );
		
		Path target = Paths.get( this.storePath , uploadFileName );
		
		//Replace an existing file if it exists.
		Files.copy( source , target , StandardCopyOption.REPLACE_EXISTING );
		
		return SUCCESS;
	}

	public String getStorePath() {
		return storePath;
	}

	public void setStorePath(String storePath) {
		this.storePath = storePath;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	
}
