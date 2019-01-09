<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_send_2401_s.jsp
* 기능     : 주간조선관리-정산마감-초기화면
* 작성일자 : 2007-11-01
* 작성자   : 김재일
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-10
* 백업파일명 : ps_send_2401_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    PS_S_SEND_LUMP_CNFMDataSet ds = (PS_S_SEND_LUMP_CNFMDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    //rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    
    rxw.add(initTemp, "fryymm", Util.getCutStr(Util.addMonth(Util.getDate(),-10),6));
    rxw.add(initTemp, "toyymm", Util.getYyyyMm());
    rxw.add(initTemp, "closyymm", Util.getYyyyMm());
          
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "전체", "ALL",initTemp, "mcCombo"); // 매체종류
        
	rxw.flush(out);
    
%>

