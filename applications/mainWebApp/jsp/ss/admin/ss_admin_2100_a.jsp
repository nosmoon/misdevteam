<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_2100_a.jsp
* 기능 : 기준정보관리-모바일관리-로그인승인 초기_모바일용
* 작성일자 : 2016-09-22
* 작성자 : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
  System.out.println("=======ss_admin_2100_a.jsp=======");
   SS_MO_L_LOGINAPLC_INITDataSet ds = (SS_MO_L_LOGINAPLC_INITDataSet)request.getAttribute("ds");
    applySession = true ; //세션적용여부

  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");

	rxw.add(codeData, "applySession", String.valueOf(applySession));
	//rwx.add(codeData,"uid", String.valueOf(session.getAttribute("uid")));

	//부서(팀)목록 표시.
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");

	//파트 목록 표시 - 임시
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");

	//지역 목록 표시.
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");


	rxw.flush(out);
%>
