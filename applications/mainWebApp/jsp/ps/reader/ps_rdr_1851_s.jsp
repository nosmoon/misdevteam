<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_rdr_1851_s.jsp
* ��� : ����-����������ȸ
* �ۼ����� : 2007-03-26
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-13
* ������ϸ� : ps_rdr_1851_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //  dataset �ν��Ͻ� ����κ�
	PS_S_PUBL_RDRDataSet ds = (PS_S_PUBL_RDRDataSet)request.getAttribute("ds");

	// �˻� ����Ʈ �ʱ� ī��Ʈ
	int recCount  =  10;
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    //rxw.add(initTemp, "recordPerPage", recCount);
    rxw.add(initTemp, "pagesize", recCount);
    rxw.add(initTemp, "js_fn_nm", "page_move");

    rxw.makeDataToList(ds, "curdeptcd", "boksnm", "deptcd", "��ü", "", initTemp, "deptCombo"); // �μ�
    rxw.makeDataToList(ds, "areacdcur", "areanm", "areacd", "��ü", "", initTemp, "areaCombo");  // ����
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", initTemp, "mcCombo"); // ��û��ü
        
	rxw.flush(out);
    
%>

