<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1220_s.jsp
* 기능 : 지국Info-지국장정보 상세화면
* 작성일자 : 2004-02-23
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_BO_HEADDataSet ds = (SS_S_BO_HEADDataSet)request.getAttribute("ds");
    int jgjangirListCount = 8;	// 한 화면당 경력리스트 항목 수
    int headfamlListCount = 8;	// 한 화면당 가족리스트 항목 수
    // 지국장 소견 상세 폼에 설정할 지국장 주민번호
    String idea_prn = "";
%>
<html>
<head>
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// 이벤트 핸들러 초기화
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
}

// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 지국장사진 체크
function check_img() {
	if(document.all.myimg.readyState!="complete") {
		parent.document.all.myimg.src = "/html/comm_img/img_no.gif";
	}
}

//-->
</script>
</head>
<!--지국장 상세정보 ---------------------------------------------------------------------------------------->
<body onload="check_img();">

<!--지국장 프로필 -->
<table width="410"  border="0" cellspacing="0" class="gray" bgcolor="#FFFFFF" cellpadding="2" id="bohead_dtl1">

<%--지국장정보가 존재--%>
<%if(ds.bohead_dtl.size() != 0){
	SS_S_BO_HEADBOHEAD_DTLRecord bohead_dtlRec = (SS_S_BO_HEADBOHEAD_DTLRecord)ds.bohead_dtl.get(0);%>
	<tr>
		<td  rowspan="6" class="gray" align="center" width="120">
		<!--지국장사진 100*125 style="border: #333333 1px solid;" 이미지가 없을경우 img_no.gif-->
		<img src="/ss/brinfo/1225?bjjuminno=<%=bohead_dtlRec.prn%>" width="100" height="125" style="border: #333333 1px solid;" id="myimg">
		</td>
		<td  bgcolor="#dddddd" class="gray">지국명</td>
		<td  class="gray">&nbsp;<%= bohead_dtlRec.bonm%></td>
	</tr>
	<tr>
		<td  bgcolor="#dddddd" class="gray">지국장명</td>
		<td  class="gray">&nbsp;<%= bohead_dtlRec.bo_headnm%></td>
	</tr>
	<tr>
    <% if(bohead_dtlRec.jmhycymd.equals("")) { %>
       <td  bgcolor="#dddddd" class="gray">계약일자</td>
       <td  class="gray">&nbsp;<%=Util.convertS(bohead_dtlRec.jmgycymd)%>&nbsp;</td>
    <% } else { %>
       <td  bgcolor="#dddddd" class="gray">계약(해지)일자</td>
       <td  class="gray">&nbsp;<%=Util.convertS(bohead_dtlRec.jmgycymd)%>&nbsp;<font color="#FF0000">(<%=Util.convertS(bohead_dtlRec.jmhycymd)%>)</font></td>
    <% } %>
	</tr>
	<tr>
		<td  bgcolor="#dddddd" class="gray">주민번호</td>
		<td  class="gray">&nbsp;<%= Util.FormatJumin(bohead_dtlRec.prn)%></td>

<%--지국장의 주민번호를 idea_prn 변수에 저장한다.--%>
<% idea_prn = bohead_dtlRec.prn; %>

	</tr>
	<tr>
		<td  bgcolor="#dddddd" class="gray" width="100">최종학력</td>
		<td  class="gray">
			<select name="lastschir" size="1" class="sel_all">  <!--최종학력 코드, 최종학력 목록-->
	            <option value='' selected>----------</option>
				<%= ds.lastschir_listOptHtml(bohead_dtlRec.lastschir) %>
			</select>
	</td>
	</tr>
	<tr>
		<td  bgcolor="#dddddd" class="gray" width="100">출생지</td>
		<td  class="gray">
			<select name="nativ" size="1" class="sel_all">  <!--출생지 코드, 출생지 목록-->
	            <option value='' selected>----------</option>
				<%= ds.nativ_listOptHtml(bohead_dtlRec.nativ) %>
			</select>
		</td>
	</tr>
<%--지국장정보가 존재하지 않음--%>
<%}else{%>
	<tr>
		<td  rowspan="6" class="gray" align="center" width="120">
		<!--지국장사진 100*125 style="border: #333333 1px solid;" 이미지가 없을경우 img_no.gif-->
		<img src="/html/comm_img/img_no.gif" style="border: #333333 1px solid;" id="myimg">
		</td>
		<td  bgcolor="#dddddd" class="gray">지국명</td>
		<td  class="gray">&nbsp;</td>
	</tr>
	<tr>
		<td  bgcolor="#dddddd" class="gray">지국장명</td>
		<td  class="gray">&nbsp;</td>
	</tr>
	<tr>
		<td  bgcolor="#dddddd" class="gray">계약일자</td>
		<td  class="gray">&nbsp;</td>
	</tr>
	<tr>
		<td  bgcolor="#dddddd" class="gray">주민번호</td>
		<td  class="gray">&nbsp;</td>
	</tr>
	<tr>
		<td  bgcolor="#dddddd" class="gray" width="100">최종학력</td>
		<td  class="gray">
			<select name="lastschir" size="1" class="sel_all">  <!--최종학력 코드, 최종학력 목록-->
				<option value='' selected>----------</option>
			</select>
		</td>
	</tr>
	<tr>
		<td  bgcolor="#dddddd" class="gray" width="100">출생지</td>
		<td  class="gray">
			<select name="nativ" size="1" class="sel_all">  <!--출생지 코드, 출생지 목록-->
				<option value='' selected>----------</option>
			</select>
		</td>
	</tr>
<%}%>
</table>

<table width="393" border="0" cellspacing="0" cellpadding="1" class="gray1" bgcolor="#FFFFFF"  id="jgjangir_dtl_id">
	<tr>
		<td class="gray" width="100" bgcolor="#dddddd">년월</td>
		<td class="gray" width="310">주요경력</td>
	</tr>
<%for(int i=0; i<ds.jgjangir_list.size() && i < 8 ; i++){
	SS_S_BO_HEADJGJANGIR_LISTRecord jgjangir_listRec = (SS_S_BO_HEADJGJANGIR_LISTRecord)ds.jgjangir_list.get(i);%>
	<tr>
		<td class="gray" width="100" bgcolor="#dddddd">&nbsp;<%= jgjangir_listRec.ircy%>/<%= jgjangir_listRec.irmm%></td>
		<td class="gray" width="310">&nbsp;<%= jgjangir_listRec.irsh%></td>
	</tr>
	<%}%>
	<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
	<%for(int i=0; i<(jgjangirListCount-ds.jgjangir_list.size()); i++){%>
	<tr>
		<td class="gray" width="100" bgcolor="#dddddd">&nbsp;</td>
		<td class="gray" width="310">&nbsp;</td>
	</tr>
	<%}%>
	<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>
</table>

<table width="393" border="0" cellspacing="0" cellpadding="1" class="gray1" bgcolor="#FFFFFF" id="bo_headfaml_dtl_id">
<form name="bo_headfaml_form" method="post">
	<tr bgcolor="#dddddd">
		<td class="gray" height="23">성명</td>
		<td class="gray" height="23">관계</td>
		<td class="gray" height="23" bgcolor="#dddddd">생년월일</td>
	</tr>
<% for(int i=0; i<ds.headfaml_list.size(); i++){
	SS_S_BO_HEADHEADFAML_LISTRecord headfaml_listRec = (SS_S_BO_HEADHEADFAML_LISTRecord)ds.headfaml_list.get(i);%>
	<tr>
		<td class="gray">
			<input name="flnm" type="text" value="<%= headfaml_listRec.flnm%>" size="10" class="text_box">
		</td>
		<td class="gray">
			<input name="rshp" type="text" value="<%= headfaml_listRec.rshp%>" size="10" class="text_box">
		</td>
		<td class="gray">
			<input name="bidt" type="text" value="<%= headfaml_listRec.bidt%>" size="10" class="text_box"  dataType="date" caption="생년월일">
		</td>
	</tr>
<%}%>
<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
<%for(int i=0; i<(headfamlListCount-ds.headfaml_list.size()); i++){%>
	<tr>
		<td class="gray">
			<input name="flnm" type="text" value="" size="10" class="text_box">
		</td>
		<td class="gray">
			<input name="rshp" type="text" value="" size="10" class="text_box">
		</td>
		<td class="gray">
			<input name="bidt" type="text" value="" size="10" class="text_box" dataType="date" caption="생년월일">
		</td>
	</tr>
<%}%>
</form>
</table>

      <!--개인특성 -->
      <table width="410" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="bohead_dtl2">
		<%
		if(ds.bohead_dtl.size() != 0){
			SS_S_BO_HEADBOHEAD_DTLRecord bohead_dtlRec = (SS_S_BO_HEADBOHEAD_DTLRecord)ds.bohead_dtl.get(0);
		%>
        <tr>
          <td colspan="2" bgcolor="#dddddd" class="gray">개인특성</td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">취미</td>
          <td width="310" class="gray" >
            <input name="hby" type="text" value="<%= bohead_dtlRec.hby%>" size="20" class="text_box">
          </td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">특기</td>
          <td width="310" class="gray" >
            <input name="spc" type="text" value="<%= bohead_dtlRec.spc%>" size="20"  class="text_box">
          </td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">종교</td>
          <td width="310" class="gray" >
            <input name="relg" type="text" value="<%= bohead_dtlRec.relg%>" size="20"  class="text_box">
          </td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">음주</td>
          <td width="310" class="gray" >
            <input name="drink" type="text" value="<%= bohead_dtlRec.drink%>" size="20"  class="text_box">
          </td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">흡연</td>
          <td width="310" class="gray" >
            <input name="smok" type="text" value="<%= bohead_dtlRec.smok%>" size="20"  class="text_box">
          </td>
        </tr>
		<%}else{%>
        <tr>
          <td colspan="2" bgcolor="#dddddd" class="gray">개인특성</td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">취미</td>
          <td width="310" class="gray" >
            <input name="hby" type="text" value="" size="20" class="text_box">
          </td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">특기</td>
          <td width="310" class="gray" >
            <input name="spc" type="text" value="" size="20"  class="text_box">
          </td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">종교</td>
          <td width="310" class="gray" >
            <input name="relg" type="text" value="" size="20"  class="text_box">
          </td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">음주</td>
          <td width="310" class="gray" >
            <input name="drink" type="text" value="" size="20"  class="text_box">
          </td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">흡연</td>
          <td width="310" class="gray" >
            <input name="smok" type="text" value="" size="20"  class="text_box">
          </td>
        </tr>
		<%}%>
      </table>


      <!--주소 및 연락처 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="adddrphone_dtl">
        <tr bgcolor="#dddddd">
          <td colspan="4" class="gray">주소 및 연락처</td>
        </tr>
		<%
		for(int i=0; i<ds.bohead_dtl.size(); i++){
			SS_S_BO_HEADBOHEAD_DTLRecord bohead_dtlRec = (SS_S_BO_HEADBOHEAD_DTLRecord)ds.bohead_dtl.get(i);
		%>
        <tr>
          <td width="100" bgcolor="#dddddd" class="gray">우편번호</td>
          <td width="100" class="gray">&nbsp;<%= bohead_dtlRec.zip%></td>
          <td width="100" bgcolor="#dddddd" class="gray">주소</td>
          <td class="gray">&nbsp;<%= bohead_dtlRec.addr%>&nbsp;<%= bohead_dtlRec.dtlsaddr%></td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">자택전화</td>
          <td width="100" class="gray">&nbsp;<%=Util.getChainStr(bohead_dtlRec.tel_no1, bohead_dtlRec.tel_no2, bohead_dtlRec.tel_no3, "-")%></td>
          <td bgcolor="#dddddd" width="100" class="gray">지국장 휴대폰</td>
          <td class="gray">&nbsp;<%=Util.getChainStr(bohead_dtlRec.ptph_no1, bohead_dtlRec.ptph_no2, bohead_dtlRec.ptph_no3, "-")%> </td>
        </tr>
        <%}%>
      </table>

      <!--보증인정보 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="bjinfo_dtl">
        <tr bgcolor="#dddddd">
          <td colspan="4" class="gray">보증인 정보</td>
        </tr>
		<%
		for(int i=0; i<ds.bjinfo_dtl.size(); i++){
			SS_S_BO_HEADBJINFO_DTLRecord bjinfo_dtlRec = (SS_S_BO_HEADBJINFO_DTLRecord)ds.bjinfo_dtl.get(i);
		%>
        <tr>
          <td width="100" bgcolor="#dddddd" class="gray">성명</td>
          <td width="315" class="gray">&nbsp;<%= bjinfo_dtlRec.bjnm%></td>
          <td width="100" bgcolor="#dddddd" class="gray">주민등록번호</td>
          <td class="gray">&nbsp;<%= Util.FormatJumin(bjinfo_dtlRec.bjjuminno)%></td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">전화번호</td>
          <td colspan="3" class="gray">&nbsp;<%= bjinfo_dtlRec.bjtelno%></td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">주소</td>
          <td colspan="3" class="gray">&nbsp;[<%= bjinfo_dtlRec.bjzipcd1%>-<%= bjinfo_dtlRec.bjzipcd2%>] <%= bjinfo_dtlRec.bjjuso4%> </td>
        </tr>
        <%}%>
      </table>
</body>

<script>
    parent.document.all.bohead_dtl1.outerHTML = bohead_dtl1.outerHTML;
    parent.document.all.bohead_dtl2.outerHTML = bohead_dtl2.outerHTML;
    parent.jgjangir_dtl.document.all.jgjangir_dtl_id.outerHTML = jgjangir_dtl_id.outerHTML;
    parent.bo_headfaml_dtl.document.all.bo_headfaml_dtl_id.outerHTML = bo_headfaml_dtl_id.outerHTML;
    parent.document.all.adddrphone_dtl.outerHTML = adddrphone_dtl.outerHTML;
    parent.document.all.bjinfo_dtl.outerHTML = bjinfo_dtl.outerHTML;

    // 지국장 소견 검색 폼, 상세폼의 주민번호를 설정한다.
    parent.document.bo_head_idea_search_form.prn.value = '<%= idea_prn%>';
    parent.document.bo_head_idea_detail_form.prn.value = '<%= idea_prn%>';

	parent.bo_headfaml_dtl.jsInit();
<%if(ds.bohead_dtl.size() == 0){%>
    alert("지국장 정보가 존재하지 않습니다.");
<%}%>
</script>
</html>
