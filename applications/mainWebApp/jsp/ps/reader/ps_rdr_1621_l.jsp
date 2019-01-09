<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1621_l.jsp
* ���     : ���+ ���ݿ����� �����ں񱳴��˻�
* �ۼ����� : 2004-04-23
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-23
* ������ϸ� : ps_rdr_1621_l.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    //dataset �ν��Ͻ� ����κ�
	CO_L_RDRCRTS_APLC_CMPRDataSet ds = (CO_L_RDRCRTS_APLC_CMPRDataSet)request.getAttribute("ds");

	// �˻� ����Ʈ ī��Ʈ
	int recCount  =  ds.rdrcmprcur.size();

	// ���������� ������ ���ڵ� ��
	int pagesize = Integer.parseInt(request.getParameter("pagesize"));

	int hd_rownum = Integer.parseInt(request.getParameter("hd_rownum"));

	//������ ����
	int k  =  0;
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
			
	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "detailGrid");

	for(int i=0; i < ds.rdrcmprcur.size(); i++)
	{

		CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord rdrcmprcurRec = (CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord)ds.rdrcmprcur.get(i);
	
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("subsfrser_no_detail");
			rxw.add_ColVal("phone_detail");
			rxw.add_ColVal("dlvaddr_detail");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rdrcmprcurRec);
		}

		//������ �߰�.
		rxw.add_ColVal(rdrcmprcurRec.subsfrser_no + rdrcmprcurRec.substoser_no);
		rxw.add_ColVal(rdrcmprcurRec.rdrtel_no1 + "-" + rdrcmprcurRec.rdrtel_no2 + "-" + rdrcmprcurRec.rdrtel_no3 + " / " + rdrcmprcurRec.rdroffitel_no1 + "-" + rdrcmprcurRec.rdroffitel_no2 + "-" + rdrcmprcurRec.rdroffitel_no3 + " / " + rdrcmprcurRec.rdrptph_no1 + "-" + rdrcmprcurRec.rdrptph_no2 + "-" + rdrcmprcurRec.rdrptph_no3);
		rxw.add_ColVal(rdrcmprcurRec.dlvaddr + rdrcmprcurRec.dlvdtlsaddr);
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rdrcmprcurRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
