<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1520_s.jsp
* 기능 : 독자현황-VacationStop-코드-상세
* 작성일자 : 2004-03-29
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응
* 수정자 : 황성진
* 수정일자 : 2009-02-11
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    SS_S_VSCDDataSet ds = (SS_S_VSCDDataSet)request.getAttribute("ds");  // 상세 정보 가져오는 request dataset
    applySession = false;	// 세션 적용 여부
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "applySession", String.valueOf(applySession));
	rxw.add(resTemp, "accflag", "U");
	
	rxw.makeDataToBulk(ds, resTemp, "vacaDetail");
	
	rxw.makeDataToList(ds, "curdeptcd", "boksnm", "deptcd", "선택", "", resTemp, "teamlist", "record", "dept_nm", "dept_cd");
	
	rxw.flush(out);
%>
