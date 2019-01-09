<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1210_l.jsp
* 기능 : 지국경영-부수증감 본지신청(담당)-조회
* 작성일자 : 2004-03-18
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-16
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: 화면 수정 요청 반영.
* 수정자	: 황성진
* 수정일자	: 2009-07-21
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
	//int listCount = 10;		
	int listCount = 5000;
	SS_L_QTYAPLC_MAIN_NWSPDataSet ds = (SS_L_QTYAPLC_MAIN_NWSPDataSet)request.getAttribute("ds");
	
	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "totalcnt_f", Util.comma(ds.getTotalcnt()));
	
	//rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
	rxw.makeHugeStart(resTemp, "listGrid", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size(); i++)
	{
		SS_L_QTYAPLC_MAIN_NWSPCURCOMMLISTRecord curcommlistRec = (SS_L_QTYAPLC_MAIN_NWSPCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("chk");
			rxw.add_ColVal("deliveryqty_org");
			rxw.add_ColVal("realrdrrate_org");
			rxw.add_ColVal("deliveryqty_chg");
			rxw.add_ColVal("realrdrrate_chg");
			rxw.add_ColVal("realtot_chg");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal("N");
		rxw.add_ColVal(curcommlistRec.iygwmgbs+curcommlistRec.iygwygbs);
		rxw.add_ColVal(curcommlistRec.iygwmgbs+curcommlistRec.iygwygbs==0 ? 0 : Math.round(1.0f*curcommlistRec.realtot/(curcommlistRec.iygwmgbs+curcommlistRec.iygwygbs)*10000)/100.0f);
		rxw.add_ColVal(curcommlistRec.aft_iygwmgbs+curcommlistRec.aft_iygwygbs);
		rxw.add_ColVal(curcommlistRec.aft_iygwmgbs+curcommlistRec.aft_iygwygbs==0 ? 0 : Math.round(1.0f*curcommlistRec.realtot/(curcommlistRec.aft_iygwmgbs+curcommlistRec.aft_iygwygbs)*10000)/100.0f);
		rxw.add_ColVal(curcommlistRec.realtot);
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
