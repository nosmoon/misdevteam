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
  SS_L_IMTMDataSet ds = (SS_L_IMTMDataSet)request.getAttribute("ds");
  int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    
	RwXmlWrapper rxw = new RwXmlWrapper();
   
  int root = RwXmlWrapper.rootNodeID;
  int acctTemp = rxw.makeParentNode(root, "gridData");
  int dataSet = 0;
	
	dataSet = rxw.add(acctTemp, "listGrid", "");

	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_IMTMCURCOMMLISTRecord curcommlistRec = (SS_L_IMTMCURCOMMLISTRecord)ds.curcommlist.get(i);
		//title �߰�.
		//if(i == 0) {
			/*	
			int record = rxw.add(dataSet, "record", "");						
			rxw.add(record, "rdr_no", curcommlistRec.rdr_no);			
			rxw.add(record, "rdr_extndt", curcommlistRec.rdr_extndt);			
			rxw.add(record, "custno", curcommlistRec.custno);			
			rxw.add(record, "rdrnm", curcommlistRec.rdrnm);			
			rxw.add(record, "bocd", curcommlistRec.bocd);			
			rxw.add(record, "bonm", curcommlistRec.bonm);			
			rxw.add(record, "rdr_no", curcommlistRec.rdr_no);			
			rxw.add(record, "rdr_extndt", curcommlistRec.rdr_extndt);
			*/

			int record = rxw.add(dataSet, "record", "");
			rxw.add(record, "bonm", curcommlistRec.bonm);			
			rxw.add(record, "bocd", curcommlistRec.bocd);			
			rxw.add(record, "rdrnm", curcommlistRec.rdrnm);			
			rxw.add(record, "rdr_extndt", curcommlistRec.rdr_extndt);			
			rxw.add(record, "rdr_no", curcommlistRec.rdr_no);							
			rxw.add(record, "custno", curcommlistRec.custno);
			rxw.add(record, "ptphno", curcommlistRec.ptphno);
								
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



