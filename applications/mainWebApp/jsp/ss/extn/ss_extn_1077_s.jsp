<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1030_s.jsp
* 기능 : 확장현황-신청현황-상세
* 작성일자 : 2003-11-21
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-03-16
* 백업파일명 : ss_extn_1077_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_ON_RDR_EXTNDataSet ds = (SS_S_ON_RDR_EXTNDataSet)request.getAttribute("ds");
    int extnType = 0;       // 10:사원확장, 20:품앗이확장 , 30:지국자체확장, 40:자진신청, 50:독자권유
    if(ds.getRdr_extntypecd().equals("10")){
        extnType = 10;	    // 사원확장
    }else if(ds.getRdr_extntypecd().equals("20")){
        extnType = 20;	    // 품앗이확장
    }else if(ds.getRdr_extntypecd().equals("30")){
        extnType = 30;	    // 지국자체확장
    }else if(ds.getRdr_extntypecd().equals("40")){
        extnType = 40;	    // 자진신청
    }else if(ds.getRdr_extntypecd().equals("50")){
        extnType = 50;	    // 사이버
    }else if(ds.getRdr_extntypecd().equals("70")){
        extnType = 70;	    // 사이버센터장
    }

    int extnBlngType = 0;   // 10:조선IS요원, 20:사설요원, 30:지국
    if(ds.getExtnblngcd().equals("10")){
        extnBlngType = 10;	    // 조선IS요원
    }else if(ds.getExtnblngcd().equals("20")){
        extnBlngType = 20;	    // 사설요원
    }else if(ds.getExtnblngcd().equals("30")){
        extnBlngType = 30;	    // 지국
    }
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	/*rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", vscdListCount);
	rxw.add(resTemp, "page_set_gubun", 0);*/
	
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>

