<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1335_l.jsp
* 기능 : 지국지원-상해보험-신청-목록
* 작성일자 : 2008-05-16
* 작성자 : 노상현
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-04-20
* 백업파일명 : Filelist.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
  request.setCharacterEncoding("KSC5601");
	
  Properties p = new Properties();
  File propFile = new File("//appstore//webserver//resinB//prop//default-ciis.properties");

  FileInputStream fis = new FileInputStream(propFile);
  p.load(fis);
  fis.close();

  String saveFolder = "" + p.get("EDI.SQLLOAD.PATH");
	
//String saveFolder="/isdata/chosunis/edi/";
	
	String today = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
	
	saveFolder = saveFolder + today;
	
	File file = new File( saveFolder);
  
  	boolean exists = file.exists();
  
  	if (!exists) { // directory exists
  	    file.mkdirs(); //임시 디렉토리 생성 시도
 	}
	//String[] fileList = file.listFiles(); // 파일 리스트 추출
	File FileList[] = file.listFiles(); 
  		
	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");
    
    rxw.makeHugeStart(resTemp, "fileGrid");
    if (FileList.length > 0) { 
    	for( int i = 0; i < FileList.length; i++ )
    	{
    		if(i == 0){
    			rxw.add_RowVal("name");
    		}
    		if(FileList[i].isFile()) {
    			rxw.add_RowVal(FileList[i].getName());
    		}
    	}
    }
    rxw.makeHugeEnd();
    rxw.flush(out);
%>