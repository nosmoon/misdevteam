<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1030_s.jsp
* 기능 : 확장현황-신청현황-상세
* 작성일자 : 2003-11-21
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-03-30
* 백업파일명 : ss_cns_1070_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_RDR_EXTNDataSet ds = (SS_S_RDR_EXTNDataSet)request.getAttribute("ds");

    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "natnnm_f",  ds.getNatnnm()); //배달주소Y
	//rxw.add(resTemp, "dlvzip_f",  Util.FormatZip(ds.getDlvzip())); //배달주소X
	rxw.add(resTemp, "dlvzip_f",  ds.getDlvzip()); //배달주소X
	rxw.add(resTemp, "bocnfm_id",  Util.convertNull(ds.getBo_headcnfmyn(),"N")); //지국 확인여부
	rxw.add(resTemp, "bocmfmtm_id",  Util.Timestamp2Str(ds.getBo_headcnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); //지국 일시
	rxw.add(resTemp, "cns_empnm_id",  ds.getCns_empnm()); //상담원 이름
	rxw.add(resTemp, "lastdlvcnfmyn",  ds.getLastdlvcnfmyn()); //상담원 확인여부위해서.
	rxw.add(resTemp, "cnscnfmtm_id",  Util.Timestamp2Str(ds.getLastdlvcnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); //상담원일시
	
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
	//건수가 없을 경우 "검색 결과가 없습니다"
%>
    