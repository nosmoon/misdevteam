<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1920_s.jsp
* 기능 : 확장현황-확장제한-상세
* 작성일자 : 2007-07-13
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-03-16
* 백업파일명 : ss_extn_1920_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    CO_S_EXTN_RESDataSet ds = (CO_S_EXTN_RESDataSet)request.getAttribute("ds");

    //String cns_empcnfmstat = ds.cns_empcnfmstatcd.equals("00") ? "<font color='#ff0000'>미확인</font>" : "확인";
    String cns_empcnfmstat = ds.cns_empcnfmstatcd.equals("00") ? "미확인" : "확인";
    String cns_empcnfmocom = ds.cns_empcnfmocomcd;
    //String chrg_cnfmstat = ds.chrg_cnfmstatcd.equals("00") ? "<font color='#ff0000'>미확인</font>" : "확인";
    String chrg_cnfmstat = ds.chrg_cnfmstatcd.equals("00") ? "미확인" : "확인";

    String cns_cnfmdt = ds.cns_cnfmdt + "";
    String chrg_cnfmdt = ds.chrg_cnfmdt + "";
    String valmm = ds.valmm + "";

    cns_cnfmdt = cns_cnfmdt.equals("null") ? "" : cns_cnfmdt.substring(0,19);
    chrg_cnfmdt = chrg_cnfmdt.equals("null") ? "" : chrg_cnfmdt.substring(0,19);

    if( cns_empcnfmocom.equals("00") ) {
      cns_empcnfmocom = "정상";
    } else if( cns_empcnfmocom.equals("10") ) {
      cns_empcnfmocom = "비정상";
    } else if( cns_empcnfmocom.equals("20") ) {
      cns_empcnfmocom = "부재중";
    } else {
      cns_empcnfmocom = "";
    }
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "cns_empcnfmstat", cns_empcnfmstat); // 확인상태(상담원)
	rxw.add(resTemp, "cns_empcnfmocom", cns_empcnfmocom); // 확인결과
	rxw.add(resTemp, "chrg_cnfmstat", chrg_cnfmstat); // 확인상태(담당)
	
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);

%>

