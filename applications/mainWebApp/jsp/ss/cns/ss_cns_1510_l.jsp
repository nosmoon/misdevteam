<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_cns_1510_l.jsp
* 기능 		 : 상담원-출판독자검색
* 작성일자 	 : 2004-03-05
* 작성자 	 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-04-08
* 백업파일명 : ss_cns_1510_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
System.out.println("=============IN================");
	SS_L_RDR_TMDataSet ds = (SS_L_RDR_TMDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");

	//rxw.makeDataToBulk(ds, "readerlistcur", resTemp, "listGrid");
	rxw.makeHugeStart(resTemp, "listGrid");
	for(int i=0; i<ds.readerlistcur.size(); i++){
		SS_L_RDR_TMREADERLISTCURRecord rec = (SS_L_RDR_TMREADERLISTCURRecord)ds.readerlistcur.get(i);
		
		if(i == 0)
		{
			rxw.add_ColVal("popAddr");

			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rec);
		}
		
		rxw.add_ColVal("[" + Util.FormatZip(rec.dlvzip) + "]" + rec.dlvaddr + " " + rec.dlvdtlsaddr);
System.out.println("==========0==========="+"[" + Util.FormatZip(rec.dlvzip) + "]" + rec.dlvaddr + " " + rec.dlvdtlsaddr);		
				
		rxw.makeRecordToBulk(rec, false);
	}
	rxw.makeHugeEnd();
	rxw.flush(out);    
%>