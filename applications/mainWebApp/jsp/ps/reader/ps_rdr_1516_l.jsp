<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1516_l.jsp
* ���     : �������ó�� �񱳴�󸮽�Ʈ
* �ۼ����� : 2004-03-02
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : Ȳ����
* �������� : 2009-02-05
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    //dataset �ν��Ͻ� ����κ�
	PS_L_EXST_RDR_SEARCHDataSet ds = (PS_L_EXST_RDR_SEARCHDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(root, "compareGrid");
	for(int i=0; i < ds.exstrdrlistcur.size() ; i++)
	{
		PS_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord exstrdrlistcurRec = (PS_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord)ds.exstrdrlistcur.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("rdrtel_no");
			rxw.add_ColVal("rdrptph_no");
			rxw.add_ColVal("addr");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(exstrdrlistcurRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(new StringBuffer().append(exstrdrlistcurRec.rdrtel_no1).append("-").append(exstrdrlistcurRec.rdrtel_no2).append("-").append(exstrdrlistcurRec.rdrtel_no3));
		rxw.add_ColVal(new StringBuffer().append(exstrdrlistcurRec.rdrptph_no1).append("-").append(exstrdrlistcurRec.rdrptph_no2).append("-").append(exstrdrlistcurRec.rdrptph_no3));
		rxw.add_ColVal(new StringBuffer().append(exstrdrlistcurRec.dlvaddr).append(" ").append(exstrdrlistcurRec.dlvdtlsaddr));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(exstrdrlistcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
