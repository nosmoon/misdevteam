<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1410_l.jsp
* 기능 : 지국경영-부수증감 신청대행(부수담당)-조회
* 작성일자 : 2004-03-18
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-18
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_QTYAPLC_VEXCDataSet ds = (SS_L_QTYAPLC_VEXCDataSet)request.getAttribute("ds");
	
	// 신청일자와 지국지사코드를 구한다.
	String bocd = "";
	String aplcdt = "";
	if(ds.curcommlist.size() > 0){
		SS_L_QTYAPLC_VEXCCURCOMMLISTRecord curcommlistRec = (SS_L_QTYAPLC_VEXCCURCOMMLISTRecord)ds.curcommlist.get(0);
		bocd = curcommlistRec.bocd;
		aplcdt = curcommlistRec.aplcdt;
	}		
	
	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "saveyn", ds.curcommlist.size()>0 ? "Y" : "N");
	rxw.add(resTemp, "bocd", bocd);
	rxw.add(resTemp, "aplcdt", aplcdt);
	
	rxw.makeHugeStart(resTemp, "listGrid", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size(); i++)
	{
		SS_L_QTYAPLC_VEXCCURCOMMLISTRecord curcommlistRec = (SS_L_QTYAPLC_VEXCCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{ 
			rxw.add_ColVal("checkselect");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal("".equals(curcommlistRec.aplcno) ? "N" : "Y");
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>
 
