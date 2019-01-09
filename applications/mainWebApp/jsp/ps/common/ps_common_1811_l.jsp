<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : pb_common_1811_l.jsp
* ���     : ���� �����ȣ �˻� (�����ȣ �Է� ���� �˻�)
* �ۼ����� : 2004-01-30
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 : TrustForm ����
* ������ 	 : Ȳ����
* �������� 	 : 2009-02-11
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
	//���� �� �ּҰ˻� ��ġ - trustform���� �ʿ� ����.
    //String zipseq = Util.Uni2Ksc(Util.checkString(request.getParameter("zipseq")));

    //getting dataset
	CO_L_ZIP_BRANCHDataSet ds = (CO_L_ZIP_BRANCHDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeHugeStart(root, "zipGrid", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		CO_L_ZIP_BRANCHCURCOMMLISTRecord rec = (CO_L_ZIP_BRANCHCURCOMMLISTRecord)ds.curcommlist.get(0);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("zip1");
			rxw.add_ColVal("zip2");
			rxw.add_ColVal("zip3");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}
		
		//������ �߰�.
		String zip1 = "";
		String zip2 = "";
		if(rec.zip != null & !"".equals(rec.zip) & rec.zip.length() >= 6){
	    	zip1 = rec.zip.substring(0, 3);
	    	zip2 = rec.zip.substring(3, 6);
	    }
		
		rxw.add_ColVal(zip1);
		rxw.add_ColVal(zip2);
		rxw.add_ColVal("");
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);

%>