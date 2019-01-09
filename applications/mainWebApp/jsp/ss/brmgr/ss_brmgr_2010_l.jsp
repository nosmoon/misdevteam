<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : ss_bmgr_2010_l.jsp
* 기능       : 독자-캠페인확장대상자관리(목록검색)
* 작성일자   : 2005-03-04
* 작성자     : 노상현
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-04-15
* 백업파일명 : ss_brmgr_2010_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    // getting dataset
    CO_L_CAMPINFODataSet ds = (CO_L_CAMPINFODataSet)request.getAttribute("ds");
	System.out.println(ds.campinfolist.size());
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");
    // 조회 결과.
    
    rxw.add(resTemp, "totalCount", ds.campinfolist.size());
   
    rxw.makeHugeStart(resTemp, "listGrid", ds.campinfolist.size());
    for(int i=0; i<ds.campinfolist.size(); i++)
    {
		CO_L_CAMPINFOCAMPINFOLISTRecord campinfolistRec = (CO_L_CAMPINFOCAMPINFOLISTRecord)ds.campinfolist.get(i);
	
		if(i == 0)
		{
			rxw.add_ColVal("campainSystem");
			rxw.add_ColVal("playData");
			
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(campinfolistRec);
		}

		//데이터 추가.
		rxw.add_ColVal("캠페인시스템");
		rxw.add_ColVal(campinfolistRec.campchnlfrdt + "~" + campinfolistRec.campchnltodt);
					
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(campinfolistRec, false);
	}
	rxw.makeHugeEnd();
	   
	rxw.flush(out);
%>
 
