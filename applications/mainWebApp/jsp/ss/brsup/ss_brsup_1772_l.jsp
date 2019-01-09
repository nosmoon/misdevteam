<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1772_l.jsp
* 기능 : 지국업무지원-Billing자동이체-청구결과관리-자동이체청구결과목록검색
* 작성일자 : 2004-04-15
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-04-16
* 백업파일명 : ss_brsup_1772_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_SHFT_CLAM_OCOM2DataSet ds = (SS_L_SHFT_CLAM_OCOM2DataSet)request.getAttribute("ds");
    //int moveListCount = 18;	// 한 화면당 리스트 항목 수
    int moveListCount = 5000;	// 한 화면당 리스트 항목 수
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");
    
    rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", String.valueOf(ds.getTotalcnt()));
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", moveListCount);
	
	rxw.add(resTemp, "totalSum", ds.getTotalcnt()); //총개수
	rxw.add(resTemp, "trueSum", ds.getNormcnt()); //정상개수
	rxw.add(resTemp, "falseSum", ds.getErrcnt()); //오류개수
    
	rxw.add(resTemp, "totalMoney", ds.getTotalamt()); //총 청구금액
	rxw.add(resTemp, "trueMoney", ds.getNormamt()); //정상금액
	rxw.add(resTemp, "falseMoney", ds.getErramt()); //오류금액
	rxw.add(resTemp, "susuMoney", ds.getComsamt()); //수수료
	rxw.add(resTemp, "bonmMoney", ds.getNormamt() - ds.getComsamt()); //지국송금금액
	
	rxw.makeHugeStart(resTemp, "detailGrid", ds.rsltcur.size());
	
	for(int i=0; i<ds.rsltcur.size(); i++)
	{
		SS_L_SHFT_CLAM_OCOM2RSLTCURRecord rsltcurRec = (SS_L_SHFT_CLAM_OCOM2RSLTCURRecord)ds.rsltcur.get(i);
			
			if(i == 0)
			{
				rxw.add_ColVal("shftclsfnm_f");
				rxw.add_ColVal("rdrnm_f");
							
				//나머지 필드는 자동 생성.
				rxw.makeRecordToBulkTitle(rsltcurRec);
			}
			
			//데이터 추가.		
			if("110".equals(rsltcurRec.shftclsfcd)) {
				rxw.add_ColVal("지로");
			} else if("120".equals(rsltcurRec.shftclsfcd)) {
				rxw.add_ColVal("D.O");
			} else if("130".equals(rsltcurRec.shftclsfcd)) {
				rxw.add_ColVal("일반");
			}
			
			if(rsltcurRec.rdrnm.getBytes().length>8) {
				rxw.add_ColVal(Util.leftKscStrB(rsltcurRec.rdrnm, 8)+"..");
          	} else {
          		rxw.add_ColVal(rsltcurRec.rdrnm);
          	}
									
			//나머지 필드 자동생성.
			rxw.makeRecordToBulk(rsltcurRec, false);
			
		}
		rxw.makeHugeEnd();
		   
		rxw.flush(out);
%>