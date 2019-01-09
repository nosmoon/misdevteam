<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_common_1106_l.jsp
* 기능 : 지국지원-신문지원물품-사고-지역코드,코드명 목록 가져오기
* 작성일자 : 2003-11-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : 셔센의 지역코드, 지역명 목록 반영
* 수정자 : 김대섭
* 수정일자 : 2004-02-17
* 백업파일명 : ss_common_1106_l.jsp.backup.20040217
* 수정사유 : SiteMinder  연동으로 인한 사용자 세션의  관리지역코드, 관리지역명 목록 화면 반영
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_JIYEOGCDDataSet ds = (SS_L_JIYEOGCDDataSet)request.getAttribute("ds");
    String applySessionStr = (String)request.getParameter("applySession");
%>

<select id=accd_areacd_id name="areacd" class="sel_all">
<%if("true".equals(applySessionStr)){
	
	// session의 지역코드, 지역명 목록으로 <option>을 구성한다.

	String areanm = (String)session.getAttribute("areanm");
	ArrayList areanmList = getTokens(areanm, "^");		// 구분자 "^"
	
	
	if(areanmList.size() == 0){	// 지역코드,지역명 갯수가 없음.
		// 지역코드,지역명이 존재하지 않음. 에러처리
	}else if(areanmList.size() == 1){	// 지역코드,지역명 갯수가 하나.
	
		String areacdnm = (String)areanmList.get(0);
		ArrayList areacdnmList = getTokens(areacdnm, "|");	// 구분자 "|"
		if(areacdnmList.size() == 2){
			out.println("<option value='"+areacdnmList.get(0)+"'>"+areacdnmList.get(1)+"</option>");
		}else{
			// 지역코드, 지역명 상이 맞지 않음. 에러처리.
		}
	}else{	// 지역코드,지역명 갯수가 여러개.
	
		for(int i=0; i<areanmList.size(); i++){
			String areacdnm = (String)areanmList.get(i);
			ArrayList areacdnmList = getTokens(areacdnm, "|");	// 구분자 "|"
			
			if(areacdnmList.size() == 2){
			
				// SS_L_JIYEOGCDDataSet 객체의 curcommlist에 포함된 SS_L_JIYEOGCDCURCOMMLISTRecord 객체의 areacd를 비교하여 세션의 지역코드 목록에 존재하는 항목만 출력한다.
				for(int j=0; j<ds.curcommlist.size(); j++){
					SS_L_JIYEOGCDCURCOMMLISTRecord record = (SS_L_JIYEOGCDCURCOMMLISTRecord)ds.curcommlist.get(j);
					
					if(areacdnmList.get(0).equals(record.areacd)){
						out.println("<option value='"+areacdnmList.get(0)+"'>"+areacdnmList.get(1)+"</option>");
					}
				}				
				
			}else{
				// 지역코드, 지역명 상이 맞지 않음. 에러처리
			}
		}
	}		
	
}else{%>
    <%= ds.curcommlistOptHtml("") %><!-- 지역코드, 코드명 목록 -->
<%}%>

</select>

<script>
    parent.document.all.accd_areacd_id.outerHTML = accd_areacd_id.outerHTML;
</script>
