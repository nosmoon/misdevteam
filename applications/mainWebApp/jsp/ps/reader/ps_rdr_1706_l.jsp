<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_rdr_1706_l.jsp
* 기능 : 지사별입력목록 검색
* 작성일자 : 2004-02-25
* 작성자 : 김건호
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
System.out.println("records_per_page : "+records_per_page);
// dataset 인스턴스 선언부분
    PS_L_TODAYINPUT_RDRDataSet ds = (PS_L_TODAYINPUT_RDRDataSet)request.getAttribute("ds");  // request dataset
    
	int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.todayinputcur.size();
System.out.println("no_data_page : "+no_data_page);

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
	
	for(int i=0; i<ds.todayinputcur.size(); i++)
	{
		PS_L_TODAYINPUT_RDRTODAYINPUTCURRecord rdr_publcurRec = (PS_L_TODAYINPUT_RDRTODAYINPUTCURRecord)ds.todayinputcur.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("total_addr");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rdr_publcurRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal(rdr_publcurRec.dlvzip + "-" + rdr_publcurRec.dlvaddr + "-" + rdr_publcurRec.dlvdtlsaddr);
				
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rdr_publcurRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>

