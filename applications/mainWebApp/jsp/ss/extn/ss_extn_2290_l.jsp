<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2280_l.jsp
* 기능 : 확장현황-일괄확장-리스트
* 작성일자 : 2011-04-04
* 작성자 : 김태희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   : 
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BATCH_EXTNDataSet ds = (SS_L_BATCH_EXTNDataSet)request.getAttribute("ds");
  int extnListCount = 5;	// 한 화면당 리스트 항목 수
    
	RwXmlWrapper rxw = new RwXmlWrapper();
   
  int root = RwXmlWrapper.rootNodeID;
  int acctTemp = rxw.makeParentNode(root, "resultsubm");
  int dataSet = 0;
	

  //record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	//rxw.makeHugeStart(acctTemp, "rowData", ds.rsltcur.size());
	
	dataSet = rxw.add(acctTemp, "rowData", "");

	for(int i=0; i < ds.rsltcur.size() ; i++)
	{
		SS_L_BATCH_EXTNRSLTCURRecord curcommlistRec = (SS_L_BATCH_EXTNRSLTCURRecord)ds.rsltcur.get(i);
		//title 추가.
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
			//나머지 필드는 자동 생성.
			//rxw.makeRecordToBulkTitle(curcommlistRec);
		//} 
		
		//나머지 필드 자동생성.
		//rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	//rxw.makeHugeEnd();
    
	rxw.flush(out);

  // data가 없을 경우 처리. 추가 필요.
        
  // page 처리. 추가 필요.
%>



