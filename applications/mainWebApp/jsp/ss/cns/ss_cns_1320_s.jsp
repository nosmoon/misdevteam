<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1220_s.jsp
* 기능 : 독자현황-VacationStop 신청 상세화면
* 작성일자 : 2004-01-16
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-04-09
* 백업파일명 : ss_cns_1320_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_VSDataSet ds = (SS_S_VSDataSet)request.getAttribute("ds");
	
	ArrayList botel = getTokens(ds.getBotel(), "-");
	ArrayList bo2tel = getTokens(ds.getVaca_areabotel(), "-");
	String telno1 = "";
	String telno2 = "";
	String telno3 = "";
	String telno12 = "";
	String telno22 = "";
	String telno32 = "";
	try{
		telno1 = (String)botel.get(0);
		telno2 = (String)botel.get(1);
		telno3 = (String)botel.get(2);
	}catch(Exception e){
		telno1 = "";
		telno2 = "";
		telno3 = "";
	}		
	try{
		telno12 = (String)bo2tel.get(0);
		telno22 = (String)bo2tel.get(1);
		telno32 = (String)bo2tel.get(2);
	}catch(Exception e){
		telno12 = "";
		telno22 = "";
		telno32 = "";	
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "path_id",  ds.getAplcpathnm()); //신청경로
	rxw.add(resTemp, "bocnfm_id",  Util.convertNull(ds.getBocnfmyn(),"N")); //소속지국확인
	rxw.add(resTemp, "bo2cnfm_id",  Util.convertNull(ds.getVaca_areadlvofficnfmyn(),"N")); //휴가지지국확인
	rxw.add(resTemp, "cns_empnm_id",  ds.getCns_empnm()); //상담원이름
	rxw.add(resTemp, "cns_empcnfmyn",  ds.getCns_empcnfmyn()); //상담원 확인여부위해서.
	rxw.add(resTemp, "cnscnfmtm_id",  Util.Timestamp2Str(ds.getCns_empcnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); //상담원일시
	rxw.add(resTemp, "remk",  ds.getCns_empremk()); //상담원비고
	rxw.add(resTemp, "vaca_areadlvoffiremk",  ds.getVaca_areadlvoffiremk()); //휴가지지국비고
	rxw.add(resTemp, "boremk",  ds.getBoremk()); //지국비고
	rxw.add(resTemp, "telno1",  telno1); //지국전화번호1
	rxw.add(resTemp, "telno2",  telno2); //지국전화번호2
	rxw.add(resTemp, "telno3",  telno3); //지국전화번호3
	rxw.add(resTemp, "telno12",  telno12); //휴가지지국전화1
	rxw.add(resTemp, "telno22",  telno22); //휴가지지국전화2
	rxw.add(resTemp, "telno32",  telno32); //휴가지지국전화3
	//rxw.add(resTemp, "dlvhopedt",  ds.getSpcfdlvdt()); //특정배달일

	rxw.makeDataToList(ds, "curvaca_areacd", "vaca_areanm", "vaca_areacd", resTemp, "vacaCombo"); // 휴가지
	
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>