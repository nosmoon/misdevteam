<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_send_2501_s.jsp
* 기능     : 배달비마감 초기
* 작성일자 : 2008-07-29
* 작성자   : 김재일
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-11
* 백업파일명 : ps_send_2501_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    PS_S_SEND_LUMP_CNFMDataSet ds = (PS_S_SEND_LUMP_CNFMDataSet)request.getAttribute("ds");  // request dataset
      
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "js_fn_nm", "page_move");

    rxw.add(initTemp, "todaymm", Util.getYyyyMm());
    rxw.add(initTemp, "today", Util.getDate());
    rxw.add(initTemp, "bas_frdt", Util.getCutStr(Util.addDate(ds.getIv_bas_dt(),+1),8));
    rxw.add(initTemp, "fryymm", Util.getCutStr(Util.addMonth(Util.getDate(),-2),6));
          
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "전체", "ALL", initTemp, "mcCombo"); // 매체종류
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "전체", "ALL", initTemp, "mcCombo2"); // 매체종류
        
	rxw.flush(out);
%>

