<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2210_l.jsp
* ��� : Ȯ����Ȳ-����Ȯ�帶��-���
* �ۼ����� : 2009-07-09
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   : 
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_TASLM_BOSUSPCLOSDataSet ds = (SS_L_TASLM_BOSUSPCLOSDataSet)request.getAttribute("ds");
	int extnmovmListCount = 10;

	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

 	// ��ȸ ���.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
           
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "infoGrid", ds.bosuspclos.size());
	
	for(int i=0; i < ds.bosuspclos.size() ; i++)
	{
		SS_L_TASLM_BOSUSPCLOSBOSUSPCLOSRecord bosuspclosRec = (SS_L_TASLM_BOSUSPCLOSBOSUSPCLOSRecord)ds.bosuspclos.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("check");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(bosuspclosRec);
		}

		//������ �߰�.
		if(bosuspclosRec.suspexclyn.equals("Y")){
			rxw.add_ColVal("Y");
		}else{
			rxw.add_ColVal("N");
		}
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(bosuspclosRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

%>


