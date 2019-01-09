<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명	: sl_reader_1413_l.jsp
* 기능		: 독자-독자정보관리-이체방법전환 초기화
* 작성일자	: 2003-12-29
* 작성자	: 김상열

* 수정내역	:
* 수정자	:
* 수정일자 	:
* 백업파일명:

* 비고		: 이체방법전환 대상목록은 해지신청 대상목록과 같다.
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-08
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    SL_L_APLC_EXPYDataSet ds = (SL_L_APLC_EXPYDataSet)request.getAttribute("ds");

    String n = "1"; // 신규신청 탭의 백그라운드 이미지이름을 구성할 문자
    String e = ""; // 해지신청 탭의 백그라운드 이미지이름을 구성할 문자
    String c = ""; // 이체방법전환 탭의 백그라운드 이미지이름을 구성할 문자

    if("E".equals(request.getParameter("accflag"))) {
        n = "";
        e = "1";
        c = "";
    }
    
    if("C".equals(request.getParameter("accflag"))) {
        n = "";
        e = "";
        c = "1";
    }
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//해지신청가능 목록
    rxw.makeHugeStart(resTemp, "listGrid", ds.rsltcur.size());
	for(int i=0; i<ds.rsltcur.size(); i++){
		SL_L_APLC_EXPYRSLTCURRecord rsltcurRec = (SL_L_APLC_EXPYRSLTCURRecord)ds.rsltcur.get(i);
        
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("idx");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal("");
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.add(resTemp, "accflag", request.getParameter("accflag"));
	
	rxw.flush(out);
%>
