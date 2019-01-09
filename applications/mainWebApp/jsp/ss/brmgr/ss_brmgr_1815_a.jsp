<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_brmgr_1815_a.jsp
* ��� 	 	 : �Ǹ�����-��Ž� ����Ʈ���� ��Ȳ���� �� ��� �ʱ�ȭ��
* �ۼ����� 	 : 2004-02-24
* �ۼ��� 	 : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ########## ���� ###########
* ���ϸ� 	 : ss_brmgr_1815_a.jsp
* ��� 	 	 : �Ǹű�-�����濵-����Ʈ������-����Ʈ���� ��Ȳ���� �� ��� �ʱ�ȭ��
* �ۼ����� 	 : 2005-10-05
* �ۼ��� 	 : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-10
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%--
    int page_rec = 5;
--%>

<%
    int page_rec = 5000;	//5 -> 5000

    // dataset �ν��Ͻ� ����κ�
    SS_L_COMM_APT_THRWDataSet ds = (SS_L_COMM_APT_THRWDataSet)request.getAttribute("ds");  // request dataset

    String concatDelimiter = "##";	// �ϰ�������Ʈ�� ���� ������
    String incmgtype = Util.getSessionParameterValue(request, "uid", true);
    String reg1 = "";
    boolean applySession = true;	// ���� ���� ����

    if( (incmgtype.substring(0,1)).equals("c") ) {
      reg1 = "10";
    } else if( (incmgtype.substring(0,1)).equals("i") ) {
      reg1 = "20";
    } else {
      reg1 = "30";
    }
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	int defaultData = rxw.add(resTemp, "defaultData", "");
	rxw.add(defaultData, "applySession", String.valueOf(applySession));
	rxw.add(defaultData, "bocd", request.getParameter("bocd"));
	rxw.add(defaultData, "incmgtype", incmgtype);
	rxw.add(defaultData, "year", Util.getYear());
	rxw.add(defaultData, "month", Util.getMonth());
	rxw.add(defaultData, "day", Util.getDay());
	rxw.add(defaultData, "invsgpers", getCookieParameterValue(request, "EMP_NM", false));
	rxw.add(defaultData, "jobcdset", request.getParameter("jobcdset"));
	rxw.add(defaultData, "invsgdt1", Util.getYear()+"0101");
	rxw.add(defaultData, "invsgdt2", Util.getDate());
	rxw.add(defaultData, "sel_regtype1", reg1);
	
	int naviInfo = rxw.add(resTemp, "naviInfo", "");
	rxw.add(naviInfo, "records_per_page", page_rec);
	rxw.add(naviInfo, "curr_page_no", request.getParameter("curr_page_no")==null || "".equals(request.getParameter("curr_page_no")) ? "1" : request.getParameter("curr_page_no"));
	rxw.add(naviInfo, "total_records", "0");
	
	int useData = rxw.add(resTemp, "useData", "");
	
	//����Ʈ���.
	rxw.makeDataToBulkList(ds, "addrcdcur", "addrnm", "addrcd", "����", "", useData, "addrcdCombo");
	
	//�����.
	rxw.makeEmpytList(useData, "dongnoCombo", "����", "");
	
	//����ڱ���1
	rxw.makeDataToBulkList(ds, "regtypecur1", "cicdnm", "cicodeval", "����", "", useData, "selRegtype1Combo");
	
	//����ڱ���2
	rxw.makeDataToBulkList(ds, "regtypecur2", "cicdnm", "cicodeval", "����", "", useData, "selRegtype2Combo");
	
	//��޻���
	rxw.makeDataToBulkList(ds, "dlvstatcur", "cicdnm", "cicodeval", "����", "", useData, "selDlvstatcd1Combo");
	rxw.makeDataToBulkList(ds, "dlvstatcur", "cicdnm", "cicodeval", "����", "", useData, "selDlvstatcd2Combo");
	rxw.makeDataToBulkList(ds, "dlvstatcur", "cicdnm", "cicodeval", "����", "", useData, "selDlvstatcd3Combo");
	
	//����Ʈ
	rxw.makeDataToBulkList(ds, "addrcdcur", "addrnm", "addrcd", "��ü", "", useData, "thrwAddrcdCombo");
	
	rxw.flush(out);
%>

