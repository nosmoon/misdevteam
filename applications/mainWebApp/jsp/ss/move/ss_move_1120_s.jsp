<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_move_1020_s.jsp
* 기능 : 이사독자-신청현황-상세
* 작성일자 : 2004-01-06
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응 구조로 변경.
* 수정자 : 김용욱
* 수정일자 : 2009-03-12
* 백업파일명 : ss_move_1020_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_MOVM_RDR_CLOSDataSet ds = (SS_S_MOVM_RDR_CLOSDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	int accTemp = rxw.makeParentNode(root, "dataTemp");
	rxw.makeDataToBulk(ds, accTemp, "detailInfo");
	rxw.makeDataToList(ds, "ipju_aptary", "addrnm", "addrcd", "전체", "", accTemp, "ipju_aptCombo");//이사독자유형
	
	
	String busu = "";
	String tempBocd = "";
	 
	for(int i=0; i<ds.curmediqty.size(); i++){
		SS_S_MOVM_RDR_CLOSCURMEDIQTYRecord curmediqtyRec = (SS_S_MOVM_RDR_CLOSCURMEDIQTYRecord)ds.curmediqty.get(i);
		
		busu = busu + curmediqtyRec.medinm +" - [ "+ curmediqtyRec.qty + " ] ";
	}
	
	if (ds.getAcptbocnfmyn().equals("Y")){
	   tempBocd = ds.getAcptbocd();
	}else{
	   tempBocd = ds.getTrsfbocd();
  	}
	
	rxw.add(accTemp, "busu", busu); //매체,부수
	rxw.add(accTemp, "rdrtel", Util.getChainStr(ds.getRdrtel_no1(),ds.getRdrtel_no2(),ds.getRdrtel_no3(),"-")); //독자정보 전화번호
	rxw.add(accTemp, "rdrptph", Util.getChainStr(ds.getRdrptph_no1(),ds.getRdrptph_no2(),ds.getRdrptph_no3(),"-")); //독자정보 휴대폰번호
	rxw.add(accTemp, "zip", "[" + ds.getZip() + "]" + ds.getAddr() + ds.getDtlsaddr()); //독자정보 현주소
	rxw.add(accTemp, "movmtel", Util.getChainStr(ds.getMovmtel_no1(),ds.getMovmtel_no2(),ds.getMovmtel_no3(),"-")); //이사지정보 전화번호
	rxw.add(accTemp, "Movmzip", "[" + ds.getMovmzip() + "]" + ds.getMovmaddr() + ds.getMovmdtlsaddr()); //이사지정보 배달주소
	rxw.add(accTemp, "trsfbocnfmdt_tm", Util.Timestamp2Str(ds.getTrsfbocnfmdt_tm(),"yyyy-MM-dd' 'HH:mm:ss")); //인계지국일시
	rxw.add(accTemp, "acptbocnfmdt_tm", Util.Timestamp2Str(ds.getAcptbocnfmdt_tm(),"yyyy-MM-dd' 'HH:mm:ss")); //인수지국일시
	rxw.add(accTemp, "cns_empcnfmdt", Util.Timestamp2Str(ds.getCns_empcnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); //상담원일시
	rxw.add(accTemp, "bocd", tempBocd); //bocd히든값 가져온다.
	
	rxw.flush(out);
%>
