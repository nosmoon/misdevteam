<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2280_l.jsp
* ��� : Ȯ����Ȳ-�ϰ�Ȯ��-����Ʈ
* �ۼ����� : 2011-04-04
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   : 
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BATCH_EXTNDataSet ds = (SS_L_BATCH_EXTNDataSet)request.getAttribute("ds");
  int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    
	RwXmlWrapper rxw = new RwXmlWrapper();
   
  int root = RwXmlWrapper.rootNodeID;
  int acctTemp = rxw.makeParentNode(root, "resultsubm");
  int dataSet = 0;
	

  //record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	//rxw.makeHugeStart(acctTemp, "rowData", ds.rsltcur.size());
	
	dataSet = rxw.add(acctTemp, "rowData", "");

	for(int i=0; i < ds.rsltcur.size() ; i++)
	{
		SS_L_BATCH_EXTNRSLTCURRecord curcommlistRec = (SS_L_BATCH_EXTNRSLTCURRecord)ds.rsltcur.get(i);
		//title �߰�.
		//if(i == 0) {	
			int record = rxw.add(dataSet, "record", "");			
			rxw.add(record, "chkno", 1);			
			rxw.add(record, "rdr_no", curcommlistRec.rdr_no);			
			rxw.add(record, "subsqty", curcommlistRec.valqty);			
			rxw.add(record, "valqty", curcommlistRec.valqty);			
			rxw.add(record, "extndt", curcommlistRec.extndt);			
			rxw.add(record, "extnno", curcommlistRec.extnno);			
			rxw.add(record, "extnnm", curcommlistRec.extnnm);			
			rxw.add(record, "extnaddr", curcommlistRec.extnaddr);			
			rxw.add(record, "extntel", curcommlistRec.extntel);			
			//������ �ʵ�� �ڵ� ����.
			//rxw.makeRecordToBulkTitle(curcommlistRec);
		//} 
		
		//������ �ʵ� �ڵ�����.
		//rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	//rxw.makeHugeEnd();
    
	rxw.flush(out);

  // data�� ���� ��� ó��. �߰� �ʿ�.
        
  // page ó��. �߰� �ʿ�.
%>



