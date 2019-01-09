<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ss_reader_1605_l.jsp
* ���     : ������Ȳ-���ڵ�ް���-��ȸ
* �ۼ����� : 2004-04-23
* �ۼ���   : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : �˻����� �� ��ȸ���� ����(���ݿ����� �� ȸ���� �߰�)
* ������   : ��뼷
* �������� : 2005-11-23
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-08
* ������ϸ� : ss_reader_1605_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    //dataset �ν��Ͻ� ����κ�
	SS_L_RDRCRTSDataSet ds = (SS_L_RDRCRTSDataSet)request.getAttribute("ds");

	// �˻� ����Ʈ ī��Ʈ
	int listCount  =  20;
    String reqtype = request.getParameter("errresncd");

	String errresncdnm = null;
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // �ѰǼ�

  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_RDRCRTSCURCOMMLISTRecord curcommlistRec = (SS_L_RDRCRTSCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("addr_detail");
			rxw.add_ColVal("err_detail");
			rxw.add_ColVal("ceph_no_detail");
			rxw.add_ColVal("reqtype_detail");
			rxw.add_ColVal("errresncdnm_detail");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		
		//������ �ʵ� �ڵ�����.
		rxw.add_ColVal(curcommlistRec.addr + " " + curcommlistRec.dtlsaddr);
		rxw.add_ColVal(curcommlistRec.dtlsprocstatnm + curcommlistRec.errresncdnm);
		rxw.add_ColVal(curcommlistRec.ceph_no_1 + "-" + curcommlistRec.ceph_no_2);		
		rxw.add_ColVal(reqtype.equals("M") ? curcommlistRec.mblefrdt : curcommlistRec.recdt);
		//rxw.add_ColVal(Util.convertD( reqtype.equals("M") ? curcommlistRec.mblefrdt : curcommlistRec.recdt));
		rxw.add_ColVal(Util.convertS( (reqtype.equals("M") ? ( (curcommlistRec.mblestatcd).equals("����") ? curcommlistRec.mblestatcd : curcommlistRec.mblenonrsmgcd) : curcommlistRec.recstatnm )));
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
