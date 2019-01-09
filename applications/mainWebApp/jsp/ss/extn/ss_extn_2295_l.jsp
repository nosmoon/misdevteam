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
  SS_L_IMTMDataSet ds = (SS_L_IMTMDataSet)request.getAttribute("ds");
  int extnListCount = 5;	// 한 화면당 리스트 항목 수
    
	RwXmlWrapper rxw = new RwXmlWrapper();
   
  int root = RwXmlWrapper.rootNodeID;
  int acctTemp = rxw.makeParentNode(root, "gridData");
  int dataSet = 0;
	
	dataSet = rxw.add(acctTemp, "listGrid", "");

	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_IMTMCURCOMMLISTRecord curcommlistRec = (SS_L_IMTMCURCOMMLISTRecord)ds.curcommlist.get(i);
		//title 추가.
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



