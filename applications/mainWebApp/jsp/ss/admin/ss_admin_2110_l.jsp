<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_2110_l.jsp
* 기능 : 기준정보관리-모바일관리-로그인승인 조회_모바일용
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
	System.out.println("=======ss_admin_2110_l.jsp=====");
    SS_MO_L_LOGINAPLC_APRVDataSet ds = (SS_MO_L_LOGINAPLC_APRVDataSet)request.getAttribute("ds");

    RwXmlWrapper rxw = new RwXmlWrapper();

    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "dataTemp");

    rxw.add(resTemp, "totalCount", Util.comma(ds.totalcnt)); // 총건수

    rxw.makeDataToBulk(ds, "aplclist", resTemp, "listGrid");

	rxw.flush(out);
%>
