<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1200_a.jsp
* ��� : �������� �ǽð���������-�ʱ�ȭ��
* �ۼ����� : 2003-12-18
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-03-16
* ������ϸ� : ss_share_1200_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ������
* �������� : 2009-04-14
* ������ϸ� : ss_share_1210_i.jsp.bak
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet)request.getAttribute("ds");  // request dataset
    applySession = true;	// ���� ���� ����
    
  	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
        
    rxw.add(initTemp, "applySession", String.valueOf(applySession));
    
    // �������κ��� ����������� ��´�.
	String deptnm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "selldeptnm", false)); 	//�μ�(��)��
	String posinm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "posinm", false)); 		//��å��
	String emp_nm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "emp_nm", false)); 		//����
	
	rxw.add(initTemp, "deptnm", Util.Uni2Ksc(Util.getSessionParameterValue(request, "selldeptnm", false))); //��
	rxw.add(initTemp, "posinm", Util.Uni2Ksc(Util.getSessionParameterValue(request, "posinm", false))); //��å
	rxw.add(initTemp, "emp_nm", Util.Uni2Ksc(Util.getSessionParameterValue(request, "emp_nm", false))); //�����	
	rxw.add(initTemp, "defaultFrom", Util.getDate()); //�������۳�¥
	rxw.add(initTemp, "defaultTimeFrom", Util.getTime().toString().replaceAll(":","")); //�������۽ð�
	rxw.add(initTemp, "defaultTo", Util.getDate()); //�������ᳯ¥
	rxw.add(initTemp, "defaultTimeTo", Util.getTime().toString().replaceAll(":","")); //��������ð�
	
	//�μ�(��)��� ǥ��.
	int comboTeam = rxw.add(initTemp, "teamlist" , "");
	writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	
	//���� ��� ǥ��.
    int comboArea = rxw.add(initTemp, "arealist_temp" , "");
	writeAreaOpt(session, rxw, comboArea, true);
    
	rxw.flush(out);
%>
