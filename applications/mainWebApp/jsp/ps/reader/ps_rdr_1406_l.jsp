<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_rdr_1406_l.jsp
* 기능 : 독자-독자조회 리스트
* 작성일자 : 2004-02-25
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-05
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    // 화면에 보여줄 라인수
    String records_per_page =   request.getParameter("records_per_page");
	
    // dataset 인스턴스 선언부분
    PS_L_RDR_PUBL_SEARCHDataSet ds = (PS_L_RDR_PUBL_SEARCHDataSet)request.getAttribute("ds");  // request dataset

	int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.rdr_publcur.size();

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
   	//독자조회 결과
   	//rxw.makeDataToBulk(ds, "rdr_publcur", resTemp, "userGrid");
   	
   	rxw.makeHugeStart(resTemp, "userGrid");
	
	for(int i=0; i < ds.rdr_publcur.size() ; i++)
	{
		PS_L_RDR_PUBL_SEARCHRDR_PUBLCURRecord rdr_publcurRec = (PS_L_RDR_PUBL_SEARCHRDR_PUBLCURRecord)ds.rdr_publcur.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("addr_detail");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rdr_publcurRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal(rdr_publcurRec.dlvzip + " " + rdr_publcurRec.dlvaddr + " " + rdr_publcurRec.dlvdtlsaddr);
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rdr_publcurRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
   	//rxw.flush(out);

    
%>

