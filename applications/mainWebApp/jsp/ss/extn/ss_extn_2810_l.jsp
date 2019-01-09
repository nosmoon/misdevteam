<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2810_l.jsp
* ��� : Ȯ����Ȳ-���ͺ��ڰ���-���ͺ��� ���
* �ۼ����� : 2013-07-01
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_RDRAREADataSet ds = (SS_L_RDR_RDRAREADataSet)request.getAttribute("ds");
    int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // �ѰǼ�

  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_RDR_RDRAREACURCOMMLISTRecord curcommlistRec = (SS_L_RDR_RDRAREACURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//rxw.makeRecordToBulk(curcommlistRec, false);

		//title �߰�.
		if(i == 0)
		{	
			rxw.add_ColVal("address");
			rxw.add_ColVal("tel_no");

			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		rxw.add_ColVal(curcommlistRec.addr+" "+curcommlistRec.dtlsaddr);
		rxw.add_ColVal(curcommlistRec.tel_no1+"-"+curcommlistRec.tel_no2+"-"+curcommlistRec.tel_no3);

		//if(curcommlistRec.bo_headcnfmdt != null){
		//	rxw.add_ColVal(curcommlistRec.bo_headcnfmdt.toString().substring(0,10));
		//}else{
		//	rxw.add_ColVal("");
		//}
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);

	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
%>

