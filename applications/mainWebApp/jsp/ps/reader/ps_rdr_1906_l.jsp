<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명  : ps_rdr_1906_l.jsp
* 기능    : 수금입력목록 검색
* 작성일자 : 2008-07-14
* 작성자   : 김재일
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-06
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    // 화면에 보여줄 라인수
    String records_per_page =   request.getParameter("records_per_page");
    // dataset 인스턴스 선언부분
    PS_L_PBLMCLAMTDataSet ds = (PS_L_PBLMCLAMTDataSet)request.getAttribute("ds");  // request dataset
    
    int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.curcommlist.size();
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//int totalCount = Util.comma(ds.getTotalcnt());
	//String curr_page_no = request.getParameter("curr_page_no");
    //String total_records = String.valueOf(ds.getTotalcnt());
    //String js_fn_nm = request.getParameter("js_fn_nm");
	
	//페이지 관련.
	//rxw.add(resTemp, "pageno", pageno);
	//rxw.add(resTemp, "total_records", total_records);
	
	//지사 리스트
	//rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "선택", "", resTemp, "branchCombo");
	
	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(resTemp, "userGrid");
	
	for(int i=0; i<ds.curcommlist.size(); i++)
	{
		PS_L_PBLMCLAMTCURCOMMLISTRecord curcommlistRec = (PS_L_PBLMCLAMTCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("rdr_total_number");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal(curcommlistRec.rdr_no + "-" + curcommlistRec.medicd + "-" + curcommlistRec.termsubsno);
				
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
	
%>

