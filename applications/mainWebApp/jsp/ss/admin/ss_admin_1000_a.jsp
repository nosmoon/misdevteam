<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1000_a.jsp
* ��� : ������-�����ڵ�-�ʱ�ȭ��
* �ۼ����� : 2004-03-09
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-04-01
* ������ϸ�: ss_admin_1000_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	CO_L_CDV_INITDataSet ds = (CO_L_CDV_INITDataSet)request.getAttribute("ds");

	String time1 = (String)request.getAttribute("SVR Entry");
	String time11 = (String)request.getAttribute("SVR Done");	

	String time2 = "\nJSP Entry \t : "+ getTime();
	
	System.out.println("=====JSP ENTRY TIME======: " + time1);
		
    int cdvListCount = 13;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
	
	//rxw.add(initData, "defaultDate", Util.getDate()); // ���ó�¥
	
	rxw.makeDataToList(ds, "curcommlist", "cicdnm", "ciymgbcd", "��ü", "", initData, "gubunCombo"); // ��������
    String Temp_1 = "\nMEM(Free/TOT/MAX) : " + (Runtime.getRuntime().freeMemory()/(1024*1024))
    		      + " / " + (Runtime.getRuntime().totalMemory()/(1024*1024))
    		      + " / " + (Runtime.getRuntime().maxMemory()/(1024*1024));
    
	time2 += "\nXRW OUT \t : "+ getTime();
	rxw.add(initData, "defaultDate", time1 + ds.timeCheck + time11 + time2 + Temp_1); // �ð�üũ
	System.out.println("=====XRW OUT TIME======: " + time2);
	
	rxw.flush(out);	
%>

<%! 
private String getTime() {

java.util.Calendar systime = java.util.Calendar.getInstance();
                StringBuffer sb = new StringBuffer();
                sb.append(systime.get(java.util.Calendar.YEAR));
                sb.append("-");
                sb.append(systime.get(java.util.Calendar.MONTH));
                sb.append("-");
                sb.append(systime.get(java.util.Calendar.DAY_OF_MONTH));
                sb.append(" ");
                sb.append(systime.get(java.util.Calendar.HOUR_OF_DAY));
                sb.append(":");
                sb.append(systime.get(java.util.Calendar.MINUTE));
                sb.append(":");
                sb.append(systime.get(java.util.Calendar.SECOND));
                sb.append(".");
                sb.append(systime.get(java.util.Calendar.MILLISECOND));
                
                return sb.toString();
                }
%>               