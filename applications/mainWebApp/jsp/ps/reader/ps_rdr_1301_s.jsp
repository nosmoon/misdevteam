<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_rdr_1301_s.jsp
* ��� : ����ó�� �ʱ�ȭ��
* �ۼ����� : 2004-02-20
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-13
* ������ϸ� : ps_rdr_1301_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // �������� ������ ���μ�
    String records_per_page = "5";
    int li_per = Integer.parseInt(records_per_page) ;
    //	dataset �ν��Ͻ� ����κ�
    PS_S_RDR_ARBTDataSet ds = (PS_S_RDR_ARBTDataSet)request.getAttribute("ds");  // request dataset

	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    rxw.add(initTemp, "defaultFrom", Util.addDate(ds.sysdate,-7));
    rxw.add(initTemp, "defaultTo", ds.sysdate);
    
    rxw.makeDataToList(ds, "bocd", "bonm", "bocd", "��ü", "", initTemp, "branchCombo"); // �����ڵ�
	rxw.makeDataToList(ds, "aprvproccd", "cicdnm", "cicodeval", "��ü", "", initTemp, "aprvCombo"); // ó������
        
	rxw.flush(out);
%>

