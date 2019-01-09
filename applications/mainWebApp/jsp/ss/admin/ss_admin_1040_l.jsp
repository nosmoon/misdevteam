<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1040_l.jsp
* 기능 : 관리자-우편번호-상세
* 작성일자 : 2004-03-09
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : 주소3 수정 가능하도록
* 수정자 : 김대섭
* 수정일자 : 2006-03-02
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%--
1.우편번호1,우편번호2,우편번호3은 request로부터 얻는다.
--%>
<%
    SS_L_JUSODataSet ds = (SS_L_JUSODataSet)request.getAttribute("ds");
    String zip1 = request.getParameter("zip1");
    String zip2 = request.getParameter("zip2");
    String zip3 = request.getParameter("zip3");
    
    // 주소1,주소2,주소3,상세주소는 MIS우편번호에는 존재하나 판매우편번호에 존재하지 않을 경우 신규 등록로우를 위해 사용된다.
    String addr1 = Util.Uni2Ksc(Util.checkString(request.getParameter("addr1")));
    String addr2 = Util.Uni2Ksc(Util.checkString(request.getParameter("addr2")));
    String addr3 = Util.Uni2Ksc(Util.checkString(request.getParameter("addr3")));
    String largedlvplac = Util.Uni2Ksc(Util.checkString(request.getParameter("largedlvplac")));
%>
<table border="0" cellspacing="0" cellpadding="0" id="zip_detail_id">
<tr><td>
	<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
		<tr> 
			<td  height="27" bgcolor="#EBE9DC" class="title">판매국 우편번호</td>
			<td bgcolor="#EBE9DC" class="title" align="right"> 
				<input type="image" id="auto_input_id" src="/html/comm_img/bu_autobo.gif" align="absmiddle" border="0" onclick="bo_search_detail_rep();window.event.returnValue=false;">
				<input type="image" src="/html/comm_img/bu_all01.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(true)">
	            <input type="image" src="/html/comm_img/bu_all02.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(false)">
				<input type="image" src="/html/comm_img/bu_line01.gif" width="52" height="19" align="absmiddle" border="0" onclick="javascript:row_add();"> 
				<input type="image" src="/html/comm_img/bu_line02.gif" width="52" height="19" align="absmiddle" border="0" onclick="javascript:row_del();"> 
			</td>
		</tr>
		<tr> 
			<td height="3" colspan="2"> 
			<!--여백-->
			</td>
		</tr>
	</table>
	
	<!--판매국 우편번호 목록 시작 -->
	<table width="100%" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="zip_detail_list_id">
	<form name="zip_detail_form" method="post" action="">
	    <input name="zip1" type="hidden" value ="<%= zip1%>">		<!--우편번호1-->
	    <input name="zip2" type="hidden" value ="<%= zip2%>">    	<!--우편번호2-->
	    <input name="zip3" type="hidden" value ="<%= zip3%>">    	<!--우편번호3-->
		<input name="addr1ary" type="hidden" value ="">      		<!--주소1 집합 문자열-->        
		<input name="addr2ary" type="hidden" value ="">      		<!--주소2 집합 문자열-->        
		<input name="addr3ary" type="hidden" value ="">      		<!--주소3 집합 문자열-->        
		<input name="largedlvplacary" type="hidden" value ="">  	<!--대량배달처 집합 문자열-->   
		<input name="bgnnary" type="hidden" value ="">        		<!--시작지번 집합 문자열-->     
		<input name="endnary" type="hidden" value ="">        		<!--끝지번 집합 문자열-->       
		<input name="bocdary" type="hidden" value ="">        		<!--지국지사코드 집합 문자열-->  
	    
		<tr bgcolor="#dddddd" align="center"> 
			<td class="gray"> 선택 </td>
			<td width="80" class="gray">시/도</td>
			<td width="80" class="gray">구/군</td>
			<td width="140" class="gray">읍/면/동</td>
			<td width="200" class="gray">상세주소</td>
			<td width="65" class="gray">시작번지</td>
			<td width="65" class="gray">끝번지</td>
			<td width="150" class="gray">지국</td>
		</tr>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_JUSOCURCOMMLISTRecord curcommlistRec = (SS_L_JUSOCURCOMMLISTRecord)ds.curcommlist.get(i);%>
		
		<tr> 
			<td align="center" class="gray" > 
				<input name="checkyn" type="checkbox" value="" checked>
			</td>
			<td class="gray" width="80">
				<input name="addr1" type="text" value="<%= curcommlistRec.addr1%>" size="10" class="text_box" readOnly>
			</td>
			<td class="gray" width="80">
				<input name="addr2" type="text" value="<%= curcommlistRec.addr2%>" size="10" class="text_box" readOnly>
			</td>
			<td class="gray" width="140">
				<input name="addr3" type="text" value="<%= curcommlistRec.addr3%>" size="20" class="text_box">
			</td>
			<td class="gray" width="200" align="center"> 
				<input name="largedlvplac" type="text" value="<%= curcommlistRec.largedlvplac%>" size="30" class="text_box">
			</td>
			<td class="gray" width="65" align="center"> 
				<input name="bgnn" type="text" value="<%= curcommlistRec.bgnn%>" size="6" class="text_box">
			</td>
			<td class="gray" width="65" align="center"> 
				<input name="endn" type="text" value="<%= curcommlistRec.endn%>" size="6" class="text_box">
			</td>
			<!--해당 로우의 지국검색 및 결과 설정 **주의: 중간에 커멘트 넣지 말것(children 사용)-->
			<td class="gray" width="150" align="center"> 
		    	<input name="bocd" type="hidden" value ="<%= curcommlistRec.bocd%>" style="ime-mode:active;">
				<input name="bonm" type="text" value="<%= curcommlistRec.bonm%>"  style="ime-mode:active;" size="12" class="text_box" onkeydown="bo_enter_search_detail(this.parentElement.children(0), this.parentElement.children(1));">
				<input type="image" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:bo_search_detail(this.parentElement.children(0), this.parentElement.children(1));window.event.returnValue=false;"> 
			</td>
		</tr>
<%}%>	

<%--목록이 존재하지 않은 경우는 신규등록을 위해 빈 입력로우는 한개 표시한다.--%>
<%--주소1,주소2,주소3은 MIS 우편번호의 주소1,주소2,주소3을 설정한다.--%>
<%if(ds.curcommlist.size() == 0){%>
		<tr> 
			<td align="center" class="gray" > 
				<input name="checkyn" type="checkbox" value="" checked>
			</td>
			<td class="gray" width="80">
				<input name="addr1" type="text" value="<%= addr1%>" size="10" class="text_box" readOnly>
			</td>
			<td class="gray" width="80">
				<input name="addr2" type="text" value="<%= addr2%>" size="10" class="text_box" readOnly>
			</td>
			<td class="gray" width="140">
				<input name="addr3" type="text" value="<%= addr3%>" size="20" class="text_box">
			</td>
			<td class="gray" width="200" align="center"> 
				<input name="largedlvplac" type="text" value="<%= largedlvplac%>" size="30" class="text_box">
			</td>
			<td class="gray" width="65" align="center"> 
				<input name="bgnn" type="text" value="" size="6" class="text_box">
			</td>
			<td class="gray" width="65" align="center"> 
				<input name="endn" type="text" value="" size="6" class="text_box">
			</td>
			<!--해당 로우의 지국검색 및 결과 설정 **주의: 중간에 커멘트 넣지 말것(children 사용)-->
			<td class="gray" width="150" align="center"> 
		    	<input name="bocd" type="hidden" value="" style="ime-mode:active;">
				<input name="bonm" type="text" value=""  style="ime-mode:active;" size="12" class="text_box" onkeydown="bo_enter_search_detail(this.parentElement.children(0), this.parentElement.children(1));">
				<input type="image" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:bo_search_detail(this.parentElement.children(0), this.parentElement.children(1));window.event.returnValue=false;"> 
			</td>
		</tr>
<%}%>
		<tr bgcolor="#dddddd" align="right"> 
			<td  colspan="8" height="23" class="gray">
<%--목록이 존재하지 않을 경우 입력을 위한 메세지 출력--%>
<%if(ds.curcommlist.size() == 0){%><font color="#FF0000">*해당 MIS우편번호와 일치하는 판매우편번호가 존재하지 않습니다. 필요시 신규등록하세요.</font><%}%>
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.getTotalcnt())%> 건 </b>
			</td>
		</tr>
	</form>
	</table>
	<!--판매국 우편번호 목록 끝 -->
	<table width="100%" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
		<tr> 
			<td align="center" height="2"> 
				<!--여백-->
			</td>
		</tr>
		<tr> 
			<td align="center" height="24" bgcolor="#E8E8E8">
				<input type="image" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" onclick="save()" border="0">
				<input type="image" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="cancel()" border="0">
			</td>
		</tr>
	</table>
	
</td></tr>	
</table>


<script>
    parent.document.all.zip_detail_id.outerHTML = zip_detail_id.outerHTML;
    
    // 화면 초기화
    parent.jsInit();
</script>