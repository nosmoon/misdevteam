<%@ page contentType="text/html;charset=KSC5601"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.multipart.FileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.util.Date"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%
	final class MyFileRenamePolicy implements FileRenamePolicy {
	    
	    //implement the rename(File f) method to satisfy the 
	    // FileRenamePolicy interface contract
	    public File rename(File f){
	    
	        //Get the parent directory path as in h:/home/user or /home/user
	        String parentDir = f.getParent( );
	      
	        //Get filename without its path location, such as 'index.txt'
	        String fname = f.getName( );
	      
	        //Get the extension if the file has one
	        String fileExt = "";
	        int i = -1;
	        if(( i = fname.indexOf(".")) != -1){
	      
	            fileExt = fname.substring(i);
	            fname = fname.substring(0,i);
	        }
	      
	        //add the timestamp
	        //fname = fname + (""+( new Date( ).getTime( ) / 1000));
	        fname = fname + ("_" + (new java.text.SimpleDateFormat("HHmmss").format(new java.util.Date())));
	        fname = fname + (".DAT");
	        
	        //piece together the filename
	        fname = parentDir + System.getProperty(
	            "file.separator") + fname;
	      
	        File temp = new File(fname);
	
	        return temp;
	    }
	
	}

  request.setCharacterEncoding("KSC5601");

  Properties p = new Properties();
  //File propFile = new File("//was//salesdept//prop//default.properties");
  File propFile = new File("//appstore//webserver//resinB//prop//default-ciis.properties");

  FileInputStream fis = new FileInputStream(propFile);
  p.load(fis);
  fis.close();

  String saveFolder = "" + p.get("EDI.SQLLOAD.PATH");
//	String saveFolder="/isdata/chosunis/edi/";
	
  String today = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());

  saveFolder = saveFolder + today;
	
  File dir = new File(saveFolder);
  
  boolean exists = dir.exists();
  
  if (!exists) { // directory exists
      dir.mkdirs(); //임시 디렉토리 생성 시도
  }	
	
	String encType="KSC5601";
	int maxSize=100*1024*1024; //100MB
	String user="";
	String title="";
	String sabstract="";
	ArrayList saveFiles=new ArrayList();
	ArrayList origFiles=new ArrayList();
		
	try{
		MultipartRequest multi=
				new MultipartRequest(request,saveFolder,maxSize,encType,new MyFileRenamePolicy());
			//new MultipartRequest(request,saveFolder,maxSize,encType,new DefaultFileRenamePolicy());
		user=multi.getParameter("txtUser");
		title=multi.getParameter("txtTitle");
		sabstract=multi.getParameter("txtAbstract");
		Enumeration files=multi.getFileNames();
		while(files.hasMoreElements()){
			String name=(String)files.nextElement();
			saveFiles.add(multi.getFilesystemName(name));
			origFiles.add(multi.getOriginalFileName(name));
			//files = new File(files.getParent(), fileSystemName);
		}		
	}catch(Exception e){
		e.printStackTrace();
	}
%>