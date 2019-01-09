<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1220_s.jsp
* 기능 : 독자현황-VacationStop 신청 상세화면
* 작성일자 : 2004-01-16
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응 구조로 변경.
* 수정자 : 김용욱
* 수정일자 : 2009-03-04
* 백업파일명 : ss_reader_1220_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_VSDataSet ds = (SS_S_VSDataSet)request.getAttribute("ds");


	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	int accTemp = rxw.makeParentNode(root, "dataTemp");

	rxw.makeDataToBulk(ds, accTemp, "detailInfo");

	rxw.add(accTemp, "rdrtel",  Util.getChainStr(ds.getRdrtel_no1(),ds.getRdrtel_no2(),ds.getRdrtel_no3(),"-")); //전화번호
	rxw.add(accTemp, "rdrptph",  Util.getChainStr(ds.getRdrptph_no1(),ds.getRdrptph_no2(),ds.getRdrptph_no3(),"-")); //휴대폰 번호
	rxw.add(accTemp, "suspfrdt",  Util.convertD(ds.getSuspfrdt()) + "~" + Util.convertD(ds.getSusptodt())); //신청기간
	//rxw.add(accTemp, "dlvzip",  Util.convertS("[" + Util.FormatZip(ds.getDlvzip())+"]" + ds.getDlvaddr() + ds.getDlvdtlsaddr())); //주소
	rxw.add(accTemp, "dlvzip",  Util.convertS("[" + ds.getDlvzip()+"]" + ds.getDlvaddr() + ds.getDlvdtlsaddr())); //주소
	rxw.add(accTemp, "vaca_zip", "[" + ds.getVaca_areazip() + "]" + ds.getVaca_areaaddr() + ds.getVaca_areadtlsaddr()); //휴가지 주소
	rxw.add(accTemp, "cns_empcnfmdt", Util.Timestamp2Str(ds.getCns_empcnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); //일시

	rxw.flush(out);
%>
