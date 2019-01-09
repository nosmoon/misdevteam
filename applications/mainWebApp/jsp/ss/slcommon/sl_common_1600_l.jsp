<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_common_1600_l.jsp
* 기능 		 : 공통 - 매체코드 리스트
* 작성일자 	 : 2003-12-12
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-02
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	// request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
	long records_per_page = ((String)request.getParameter("pagesize") == null)? 9 : Long.parseLong(request.getParameter("pagesize"));

	long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

	// getting dataset
    SL_L_BOMEDIDataSet ds = (SL_L_BOMEDIDataSet)request.getAttribute("ds");  // request dataset

    /* 예외 처리 시작 */
    if(ds.curcommlist.size() < 1){
        request.setAttribute("appException", new AppException("sl_common_1600_l.jsp(1)","취급매체가 존재하지 않습니다."));
        pageContext.forward("/jsp/ss/slcomm_jsp/app_error.jsp");
        //rd.forward(request, response);
    }
    /* 예외 처리 끝 */
    
    //TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.makeHugeStart(resTemp, "mediGrid", ds.curcommlist.size());
	SL_L_BOMEDICURCOMMLISTRecord curcommlistRec = null;
	for(int i=0; i<ds.curcommlist.size(); i++){
		curcommlistRec = (SL_L_BOMEDICURCOMMLISTRecord)ds.curcommlist.get(i);
        
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("chk");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal("");
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
