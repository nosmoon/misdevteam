<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_sppt_1216_s.jsp
* ��� : ������������ ����ȸ
* �ۼ����� : 2003-12-08
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-17
* ������ϸ� : ps_sspt_1421_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String lo_empno     = Util.getSessionParameterValue(request, "emp_no", true);       //�����ȣ
    String lo_kflnm     = Util.getSessionParameterValue(request, "emp_nm", true);         //�����

    // dataset �ν��Ͻ� ����κ�
    PS_S_DSCT_CATLDataSet ds = (PS_S_DSCT_CATLDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	// ��ȸ ���.
	rxw.makeDataToBulk(ds, acctTemp, "detailGrid");
		
	rxw.flush(out);
	
	// data�� ���� ��� ó��. �߰� �ʿ�.	
%>
