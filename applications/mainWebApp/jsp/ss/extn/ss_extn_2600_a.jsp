<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2600_a.jsp
* ��� : Ȯ����Ȳ-��ŸȮ��-����������
* �ۼ����� : 2013-1-28
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	String date1 = Util.addMonth(Util.getDate(), -1 );
	
	rxw.add(codeData, "fr_dt", date1);
	rxw.add(codeData, "to_dt", Util.getDate());
	
	rxw.flush(out);	
%>
