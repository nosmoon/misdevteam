<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : delete.jsp
* 기능 : 파일삭제
* 작성일자 : 2008-05-16
* 작성자 : 노상현
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-04-20
* 백업파일명 : delete.jsp.bak
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
	
	saveFolder = saveFolder + today + "/";
	
	File file = new File( saveFolder);
  
  boolean exists = file.exists();
  
  if (!exists) { // directory exists
      file.mkdirs(); //임시 디렉토리 생성 시도
  }

	//String[] fileList = file.listFiles(); // 파일 리스트 추출
	
	File FileList[] = file.listFiles(); 

	for( int i = 0; i < FileList.length; i++ )
	{
		file = new File("" + FileList[i]);

		file.delete(); // 파일 삭제
	}
	
	String strMsg = "모든 파일이 삭제되었습니다.";

	RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
	int root = RwXmlWrapper.rootNodeID;
	rxw.setMessageAlert(strMsg);

	rxw.flush(out);
%>