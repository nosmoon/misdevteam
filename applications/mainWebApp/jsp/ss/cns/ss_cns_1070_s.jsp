<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1030_s.jsp
* ��� : Ȯ����Ȳ-��û��Ȳ-��
* �ۼ����� : 2003-11-21
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-03-30
* ������ϸ� : ss_cns_1070_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_RDR_EXTNDataSet ds = (SS_S_RDR_EXTNDataSet)request.getAttribute("ds");

    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "natnnm_f",  ds.getNatnnm()); //����ּ�Y
	//rxw.add(resTemp, "dlvzip_f",  Util.FormatZip(ds.getDlvzip())); //����ּ�X
	rxw.add(resTemp, "dlvzip_f",  ds.getDlvzip()); //����ּ�X
	rxw.add(resTemp, "bocnfm_id",  Util.convertNull(ds.getBo_headcnfmyn(),"N")); //���� Ȯ�ο���
	rxw.add(resTemp, "bocmfmtm_id",  Util.Timestamp2Str(ds.getBo_headcnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); //���� �Ͻ�
	rxw.add(resTemp, "cns_empnm_id",  ds.getCns_empnm()); //���� �̸�
	rxw.add(resTemp, "lastdlvcnfmyn",  ds.getLastdlvcnfmyn()); //���� Ȯ�ο������ؼ�.
	rxw.add(resTemp, "cnscnfmtm_id",  Util.Timestamp2Str(ds.getLastdlvcnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); //�����Ͻ�
	
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
	//�Ǽ��� ���� ��� "�˻� ����� �����ϴ�"
%>
    