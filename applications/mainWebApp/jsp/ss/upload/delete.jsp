<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : delete.jsp
* ��� : ���ϻ���
* �ۼ����� : 2008-05-16
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-04-20
* ������ϸ� : delete.jsp.bak
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
      file.mkdirs(); //�ӽ� ���丮 ���� �õ�
  }

	//String[] fileList = file.listFiles(); // ���� ����Ʈ ����
	
	File FileList[] = file.listFiles(); 

	for( int i = 0; i < FileList.length; i++ )
	{
		file = new File("" + FileList[i]);

		file.delete(); // ���� ����
	}
	
	String strMsg = "��� ������ �����Ǿ����ϴ�.";

	RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
	int root = RwXmlWrapper.rootNodeID;
	rxw.setMessageAlert(strMsg);

	rxw.flush(out);
%>