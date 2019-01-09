<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1660_i.jsp
* 기능 : 정보공유 게시판 업무협조 답변등록
* 작성일자 : 2003-12-03
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응. 
* 수정자   : 김용욱
* 수정일자 : 2009-03-24
* 백업파일명 : ss_share_1660_i.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	applySession = true;	// 세션 적용 여부

    String pageno = (String)request.getAttribute("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "5000";} //{pagesize = "10";}

    String rmsgdept_param = Util.checkString((String)request.getAttribute("rmsgdept_param"));
    String rmsgarea_param = Util.checkString((String)request.getAttribute("rmsgarea_param"));
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    String titl = Util.checkString((String)request.getAttribute("titl"));
    String answergrp = Util.checkString((String)request.getAttribute("answergrp"));
    String answerseq = Util.checkString((String)request.getAttribute("answerseq"));
    String answerlevl = Util.checkString((String)request.getAttribute("answerlevl"));

    String seq = Util.checkString((String)request.getAttribute("seq"));			//모글의 seq
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // 회사코드
	String makepersid = Util.getSessionParameterValue(request, "uid", false); // 아이디
	String makepersnm = Util.getSessionParameterValue(request, "emp_nm", false); // 사용자명
	String deptcd = Util.getSessionParameterValue(request, "selldeptcd", false); // 소속부서코드    
	String deptnm = Util.getSessionParameterValue(request, "selldeptnm", false); // 소속부서명   
	    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.add(root, "resTemp", "");
    
    rxw.add(resTemp, "makepersnm", makepersnm); //사용자명
    rxw.add(resTemp, "deptnm", deptnm); //소속부서명             
    rxw.add(resTemp, "titl", titl);
        
	rxw.flush(out);
%>
