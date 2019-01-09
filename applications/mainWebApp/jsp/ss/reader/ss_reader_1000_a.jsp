<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1000_a.jsp
* 기능 : 독자현황-독자정보-독자검색 초기화면
* 작성일자 : 2003-12-26
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : 전화번호 검색시 모든 전화번호 입력체크 추가
* 수정자 : 김대섭
* 수정일자 : 2005-03-29
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 검색조건 표시 순서 변경 (이름->읍면동->전화번호->독자번호
* 수정자 : 김대섭
* 수정일자 : 2005-03-29
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-09
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    //int rdrsrchListCount = 20;	// 한 화면당 리스트 항목 수. paging없이 5000건 한계로 조정.
    int rdrsrchListCount = 5000;
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pagesize", rdrsrchListCount);
	
	rxw.flush(out);
%>
