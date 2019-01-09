<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1106_s.jsp
* 기능     : 확장독자관리 확장독자 상세 Link
* 작성일자 : 2004-02-26
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-18
* 백업파일명 : ps_rdr_1106_s.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    //오늘날짜
    String toDate      = Util.getDate2();

    //dataset 인스턴스 선언부분
	PS_S_RDR_EXTNDataSet ds = (PS_S_RDR_EXTNDataSet)request.getAttribute("ds");

    //확장독자정보 dataset
    PS_S_RDR_EXTNRDREXTNINFOCURRecord rdrextninfocurRec = null;
    boolean  rdrChk = false;            //확장독자 데이타 유무체크

    if (ds.rdrextninfocur.size() > 0) {
        rdrextninfocurRec = (PS_S_RDR_EXTNRDREXTNINFOCURRecord)ds.rdrextninfocur.get(0);
        rdrChk  =  true;
    }
    
	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	// 조회 결과.
	rxw.makeDataToBulk(ds, "rdrextninfocur", acctTemp, "detailGrid");
		
	rxw.flush(out);
	
	// data가 없을 경우 처리. 추가 필요.
%>

