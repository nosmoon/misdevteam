<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1335_l.jsp
* ��� : ��������-���غ���-��û-���
* �ۼ����� : 2008-05-16
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-04-20
* ������ϸ� : Filelist.jsp.bak
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
  	    file.mkdirs(); //�ӽ� ���丮 ���� �õ�
 	}
	//String[] fileList = file.listFiles(); // ���� ����Ʈ ����
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