<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1010_l.jsp
* 기능 : 지국경영-지국부수현황-상세
* 작성일자 : 2004-03-15
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : 지국별 목록을 클릭했을 때 해당지국의 통계일람을 보여주는 팝업을 띄운다. 행간 색깔 변경을 없앤다.
* 수정자 : 김대섭
* 수정일자 : 20041208
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-12
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
	SS_L_BOSENDPCONDDataSet ds = (SS_L_BOSENDPCONDDataSet)request.getAttribute("ds");
    //int listCount = 20;	// 한 화면당 리스트 항목 수
    int listCount = 5000;
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", listCount);
	
	//rxw.makeDataToBulk(ds, resTemp, "summary");
	rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
	
	//1. dataset을 xml로 변환.
	rxw.makeHugeStart(resTemp, "summary");
	rxw.add_ColVal("thmmvalqtydiff_f");
	rxw.add_ColVal("aftcnt_totdiff_f");
	rxw.add_ColVal("realtotdiff_f");
	rxw.add_ColVal("totalcnt_f");
	rxw.add_ColVal("bo_yymm_f");
	//나머지 필드는 자동 생성.
	rxw.makeRecordToBulkTitle(ds);
	//데이터 추가.
	rxw.add_ColVal(Util.comma(ds.getThmmvalqtydiff()));	//format #,###에서는 -값이 표시 안되는 문제로 인해 여기서 가공하여 넣어줌.
	rxw.add_ColVal(Util.comma(ds.getAftcnt_totdiff()));
	rxw.add_ColVal(Util.comma(ds.getRealtotdiff()));
	rxw.add_ColVal(Util.comma(ds.getTotalcnt()));
	rxw.add_ColVal(Util.convertMonthS(ds.getBo_yymm()));
	//나머지 필드 자동생성.
	rxw.makeRecordToBulk(ds, false);
	rxw.makeHugeEnd();
	
	//2. record를 xml로 변환.
	rxw.makeHugeStart(resTemp, "listGrid", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size(); i++)
	{
		SS_L_BOSENDPCONDCURCOMMLISTRecord curcommlistRec = (SS_L_BOSENDPCONDCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("bonm_f");
			rxw.add_ColVal("thmmvalqtydiff_f");
			rxw.add_ColVal("aftcnt_totdiff_f");
			rxw.add_ColVal("realtotdiff_f");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal(Util.getCutStr(curcommlistRec.bonm, 3));
		rxw.add_ColVal(Util.comma(curcommlistRec.thmmvalqtydiff));
		rxw.add_ColVal(Util.comma(curcommlistRec.aftcnt_totdiff));
		rxw.add_ColVal(Util.comma(curcommlistRec.realtotdiff));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>

