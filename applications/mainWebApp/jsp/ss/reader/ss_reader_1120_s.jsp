<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1120_s.jsp
* ��� : ������Ȳ-���ں��� ��ȭ��
* �ۼ����� : 2004-01-10
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-06
* ������ϸ� : ss_reader_1120_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_RDR_DSCTDataSet ds = (SS_S_RDR_DSCTDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToBulk(ds, resTemp, "detailData");

	rxw.add(resTemp, "acpndt_f", Util.Timestamp2Str(ds.getAcpndt(),"yyyy-MM-dd' 'HH:mm:ss")); //�����Ͻ�
	rxw.add(resTemp, "boprocdt_f", Util.Timestamp2Str(ds.getBoprocdt(),"yyyy-MM-dd' 'HH:mm:ss")); //ó���Ͻ�
	rxw.add(resTemp, "cns_empcnfmdt_f", Util.Timestamp2Str(ds.getCns_empcnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); //�Ͻ�
	rxw.flush(out);
%>
