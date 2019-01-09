<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1740_a.jsp
* ��� : ������������-Billing�ڵ���ü-û���������-�ʱ�ȭ��
* �ۼ����� : 2004-03-25
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-04-16
* ������ϸ� : ss_brsup_1770_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    String concatDelimiter = "##";	// �Ա�ó�� �� �� �׸��� concatenate�� �� ���Ǵ� delimiter

    SS_L_APLC_MANG_INITDataSet ds = (SS_L_APLC_MANG_INITDataSet)request.getAttribute("ds");

    //int moveListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount = 5000;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = false;	// ���� ���� ����

    String monthOptionsHtml = null; // ��� ����Ʈ�� ������ options�� write�ϱ� ���� �ӽ� ����

	StringBuffer sb = new StringBuffer("");
	Calendar calendar = new GregorianCalendar(Locale.KOREA);
//    calendar.add(Calendar.YEAR, -1);

	String tempMonth = null;
	for(int i=0; i<13; i++){
		tempMonth = String.valueOf(calendar.get(Calendar.MONTH)+1);
		if(tempMonth.length()==1) {
    		tempMonth = "0" + tempMonth;
    	}
		sb.append("<option value=\"");
		sb.append(String.valueOf(calendar.get(Calendar.YEAR))+tempMonth);
		sb.append("\"");
		sb.append(">");
		sb.append(calendar.get(Calendar.YEAR) + "�� " + tempMonth + "��");
		sb.append("</option>");

		calendar.add(Calendar.MONTH, -1);
	}
	monthOptionsHtml = sb.toString();
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");
    
    rxw.add(codeData, "applySession", String.valueOf(applySession));    
    rxw.add(codeData, "pagesize", moveListCount);
    
	rxw.add(codeData, "f_basidt", Util.getDate()); //û���� ����
	rxw.add(codeData, "t_basidt", Util.getDate()); //û���� ��
	
	rxw.makeDataToList(ds, "shftclsf", "cicdnm", "cicodeval", "��ü", "", codeData, "shftCombo");//��ü����
	rxw.makeDataToList(ds, "jycur", "areanm", "areacd", "��ü", "", codeData, "areaCombo");//����

	rxw.flush(out);
%>