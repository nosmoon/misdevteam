<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_brinfo_1600_a.jsp
* ��� 	 	 : ����info-�߼۳뼱������ȸ �ʱ�ȭ��
* �ۼ����� 	 : 2004-04-02
* �ۼ��� 	 : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-03-17
* ������ϸ�: ss_brinfo_1600_a.jsp
---------------------------------------------------------------------------------------------------%>

<%
    //	dataset �ν��Ͻ� ����κ�
    //chosun.ciis.ss.sls.common.ds.SS_L_NWBUSEOCDDataSet ds = (chosun.ciis.ss.sls.common.ds.SS_L_NWBUSEOCDDataSet)request.getAttribute("ds");  // request dataset
    SS_L_BSNS_INITDataSet ds = (SS_L_BSNS_INITDataSet)request.getAttribute("ds");  // request dataset
	int listCount = 20;		// ��ȭ�鿡 ��ȸ�Ǵ� ���ڵ��
    applySession = true;	// ���� ���� ����
    
  //TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "defaultDate", Util.getDate());
	
	//�μ�(��)��� ǥ��.
	//int comboTeam = rxw.add(codeData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//��Ʈ ��� ǥ�� - �ӽ�
	//rxw.makeEmpytList(codeData, "partlist_temp", "record", "dept_nm", "dept_cd", "��ü", "");
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//���� ��� ǥ��.
    //int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	//���� ��� ǥ��
	//rxw.makeEmpytList(codeData, "codelist", "record", "cdnm", "cd", "��ü", "");
	rxw.makeEmpytList(codeData, "codelist", "record", "cdnm", "cd", "��ü", "");
	
	rxw.flush(out);
	
%>

