<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_share_1111_s.jsp
* 기능 : 정보공유 일정 상세정보 보기
* 작성일자 : 2004-02-23
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-02-12
* 백업파일명 : ps_share_1111_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
    PS_S_TACOM_SCHEDataSet ds = (PS_S_TACOM_SCHEDataSet)request.getAttribute("ds");  // request dataset
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // 조회 결과.
    rxw.add(acctTemp, "frdt", ds.getFrdt());
    rxw.add(acctTemp, "todt", ds.getTodt());
    rxw.add(acctTemp, "remk", ds.getRemk());
    rxw.add(acctTemp, "seq", ds.getSeq());
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>

