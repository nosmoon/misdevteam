<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1506_l.jsp
* ���     : �������ó�� �˻�
* �ۼ����� : 2004-03-02
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : Ȳ����
* �������� : 2009-02-04
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    //dataset �ν��Ͻ� ����κ�
	PS_L_EXTN_ASIN_SEARCHDataSet ds = (PS_L_EXTN_ASIN_SEARCHDataSet)request.getAttribute("ds");
	//��������
	int recCount  =  ds.extnasincur.size();
	//������ ����.
	int pagesize = Integer.parseInt(request.getParameter("pagesize"));
	String pageno  = request.getParameter("pageno");
    String total_records = String.valueOf(ds.getTotalcnt());
	//������ ����
	int k  =  0;

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//������ ����.
	rxw.add(resTemp, "pageno", pageno);
	rxw.add(resTemp, "total_records", total_records);
	
	//���� ����Ʈ
	rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "����", "", resTemp, "branchCombo");
	
	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(resTemp, "assignGrid");
	for(int i=0; i < recCount ; i++)
	{
		PS_L_EXTN_ASIN_SEARCHEXTNASINCURRecord extnasincurRec = (PS_L_EXTN_ASIN_SEARCHEXTNASINCURRecord)ds.extnasincur.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("isReadOnly");
			rxw.add_ColVal("asin_check");
			rxw.add_ColVal("rdrtel_no");
			rxw.add_ColVal("rdrptph_no");
			rxw.add_ColVal("addr");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(extnasincurRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(String.valueOf((extnasincurRec.bouseyn).equals("Y") || (extnasincurRec.deliproccd).equals("Y")));
		rxw.add_ColVal("");
		rxw.add_ColVal(new StringBuffer().append(extnasincurRec.rdrtel_no1).append("-").append(extnasincurRec.rdrtel_no2).append("-").append(extnasincurRec.rdrtel_no3));
		rxw.add_ColVal(new StringBuffer().append(extnasincurRec.rdrptph_no1).append("-").append(extnasincurRec.rdrptph_no2).append("-").append(extnasincurRec.rdrptph_no3));
		rxw.add_ColVal(new StringBuffer().append(extnasincurRec.dlvaddr).append(" ").append(extnasincurRec.dlvdtlsaddr));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(extnasincurRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>