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
	SS_L_TASLM_RDREXTNCLOSDataSet ds = (SS_L_TASLM_RDREXTNCLOSDataSet)request.getAttribute("ds");
	int extnmovmListCount = 10;

	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

 	// ��ȸ ���.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
           
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "infoGrid", ds.rdrextnclos.size());
	
	for(int i=0; i < ds.rdrextnclos.size() ; i++)
	{
		SS_L_TASLM_RDREXTNCLOSRDREXTNCLOSRecord rdrextnclosRec = (SS_L_TASLM_RDREXTNCLOSRDREXTNCLOSRecord)ds.rdrextnclos.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("totaladdr");
			rxw.add_ColVal("totaltel");
			rxw.add_ColVal("totalcellph");
			rxw.add_ColVal("check");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rdrextnclosRec);
		}

		//������ �߰�.
		rxw.add_ColVal(rdrextnclosRec.dtlsaddr + rdrextnclosRec.addr);
		rxw.add_ColVal(rdrextnclosRec.rdrtel_no1+"-"+rdrextnclosRec.rdrtel_no2+"-"+rdrextnclosRec.rdrtel_no3);
		rxw.add_ColVal(rdrextnclosRec.rdrptph_no1+"-"+rdrextnclosRec.rdrptph_no2+"-"+rdrextnclosRec.rdrptph_no3);
		if(rdrextnclosRec.rdr_extnexclyn.equals("Y")){
			rxw.add_ColVal("N");
		}else{
			rxw.add_ColVal("N");
		}
	
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rdrextnclosRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

%>


