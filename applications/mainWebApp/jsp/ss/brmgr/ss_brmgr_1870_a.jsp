<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_commun_2650_a.jsp
* ��� 	 	 : �Ǹ�����-��Ž� ����Ʈ���� ��Ȳ���� �� ��� �ʱ�ȭ��
* �ۼ����� 	 : 2004-02-24
* �ۼ��� 	 : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-14
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>

<%
	// dataset �ν��Ͻ� ����κ�
    SL_A_COMM_APT_THRWDataSet ds = (SL_A_COMM_APT_THRWDataSet)request.getAttribute("ds");  // request dataset

	String acc_flg = request.getParameter("accflag");
	String hmflag = request.getParameter("hmflag");
    String invsgdt = request.getParameter("invsgdt");
    String addrcd = request.getParameter("addrcd");
    String dongno = request.getParameter("dongno");
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;

	String msg = "";
	if("I".equals(acc_flg) && "H".equals(hmflag))
		msg = "��� �Ǿ����ϴ�";
	else if("U".equals(acc_flg) && "H".equals(hmflag))
		msg = "���� �Ǿ����ϴ�";
	else if("D".equals(acc_flg) && "H".equals(hmflag))
		msg = "���� �Ǿ����ϴ�";
	
	rxw.setMessageAlert(msg);
	
	rxw.flush(out);
%>
