<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_sppt_1316_s.jsp
* ��� : �̻�ó������ ����ȸ
* �ۼ����� : 2005-02-15
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-17
* ������ϸ� : ps_sspt_1316_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%

    String lo_empno     = Util.getSessionParameterValue(request, "emp_no", true);       //�����ȣ
    String lo_kflnm     = Util.getSessionParameterValue(request, "emp_nm", true);         //�����

    // dataset �ν��Ͻ� ����κ�
    PS_S_MOVM_RDRDataSet ds = (PS_S_MOVM_RDRDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
    rxw.add(acctTemp, "rdrnm", ds.getRdrnm());
    rxw.add(acctTemp, "rdrtel_no1", ds.getRdrtel_no1());
    rxw.add(acctTemp, "rdrtel_no2", ds.getRdrtel_no2());
    rxw.add(acctTemp, "rdrtel_no3", ds.getRdrtel_no3());
    rxw.add(acctTemp, "bocdnm", ds.getAcptbonm());
    rxw.add(acctTemp, "rdrbocd", ds.getAcptbocd());
    rxw.add(acctTemp, "medinm", ds.getMedinm());
    rxw.add(acctTemp, "rdr_no", ds.getRdr_no());
    rxw.add(acctTemp, "medicd", ds.getMedicd());
    rxw.add(acctTemp, "addr_all", ds.getAddr() + ds.getDtlsaddr());

	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
