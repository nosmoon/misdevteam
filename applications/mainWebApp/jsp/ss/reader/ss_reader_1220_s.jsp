<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1220_s.jsp
* ��� : ������Ȳ-VacationStop ��û ��ȭ��
* �ۼ����� : 2004-01-16
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ���� ������ ����.
* ������ : ����
* �������� : 2009-03-04
* ������ϸ� : ss_reader_1220_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_VSDataSet ds = (SS_S_VSDataSet)request.getAttribute("ds");


	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	int accTemp = rxw.makeParentNode(root, "dataTemp");

	rxw.makeDataToBulk(ds, accTemp, "detailInfo");

	rxw.add(accTemp, "rdrtel",  Util.getChainStr(ds.getRdrtel_no1(),ds.getRdrtel_no2(),ds.getRdrtel_no3(),"-")); //��ȭ��ȣ
	rxw.add(accTemp, "rdrptph",  Util.getChainStr(ds.getRdrptph_no1(),ds.getRdrptph_no2(),ds.getRdrptph_no3(),"-")); //�޴��� ��ȣ
	rxw.add(accTemp, "suspfrdt",  Util.convertD(ds.getSuspfrdt()) + "~" + Util.convertD(ds.getSusptodt())); //��û�Ⱓ
	//rxw.add(accTemp, "dlvzip",  Util.convertS("[" + Util.FormatZip(ds.getDlvzip())+"]" + ds.getDlvaddr() + ds.getDlvdtlsaddr())); //�ּ�
	rxw.add(accTemp, "dlvzip",  Util.convertS("[" + ds.getDlvzip()+"]" + ds.getDlvaddr() + ds.getDlvdtlsaddr())); //�ּ�
	rxw.add(accTemp, "vaca_zip", "[" + ds.getVaca_areazip() + "]" + ds.getVaca_areaaddr() + ds.getVaca_areadtlsaddr()); //�ް��� �ּ�
	rxw.add(accTemp, "cns_empcnfmdt", Util.Timestamp2Str(ds.getCns_empcnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); //�Ͻ�

	rxw.flush(out);
%>
