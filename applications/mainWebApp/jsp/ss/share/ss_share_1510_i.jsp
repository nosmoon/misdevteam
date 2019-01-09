<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1510_i.jsp
* 기능 : 정보공유 게시판 이슈 등록
* 작성일자 : 2003-12-03
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_INFOEXG_SAVE_INITDataSet ds = (SS_L_INFOEXG_SAVE_INITDataSet)request.getAttribute("ds");    // request dataset    

    String rmsgdept = Util.checkString((String)request.getAttribute("rmsgdept"));         //수신부서선택
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    
    String pageno = (String)request.getAttribute("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "10";}    
   
    applySession = true;	// 세션 적용 여부
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // 회사코드
	String makepersid = Util.getSessionParameterValue(request, "uid", false); // 아이디
	String makepersnm = Util.getSessionParameterValue(request, "emp_nm", false); // 사용자명
	String deptcd = Util.getSessionParameterValue(request, "selldeptcd", false); // 소속부서코드    
	String deptnm = Util.getSessionParameterValue(request, "selldeptnm", false); // 소속부서명    
    
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// 이벤트 핸들러 초기화
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.infoexg_insert_form.titl.focus();
}

// form 단위로 유효성을 검증한 예제
function check_all(form){
	if(!validate(form)) return false;
	else{
		makeValue(form);
		form.submit();
	}
}

// 게시판 이슈 리스트
function infoexg_list(){
    var lo_form1 = document.infoexg_view_form;

    lo_form1.action = "/ss/share/1501";
    lo_form1.submit();
        
}

// 게시판 이슈 등록
function annc_insert(){
    var lo_form1 = document.infoexg_insert_form;
    
	if(lo_form1.titl.value=='')
	{
        alert("제목을 입력해주세요.");
        lo_form1.titl.focus();
        return;		
	}
	else if(lo_form1.cont.value=='')
	{
        alert("내용을 입력해주세요.");
        lo_form1.cont.focus();
        return;		
	}		    
    

    // 액션을 "/ss/share/1515" 서블릿으로 보낸다
    lo_form1.action = "/ss/share/1515";
    check_all(lo_form1);
    lo_form1.submit();
        
}

// 게시판 이슈 입력 취소
function annc_cancel(){
    // 이슈 등록 폼의 값을 reset 해준다.
    var lo_form1 = document.infoexg_insert_form;

	lo_form1.email.value = '';
	lo_form1.hmpg.value = '';
	lo_form1.titl.value = '';
	lo_form1.cont.value = '';

}

//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">

<!--INFOEXG_VIEW_FORM START--------------------------------------------------------------------------------->
<form name="infoexg_view_form" method="post" action="">
	<input type="hidden" name="pageno" value="<%=pageno%>">
	<input type="hidden" name="pagesize" value="<%=pagesize%>">
	<input type="hidden" name="rmsgdept" value="<%=rmsgdept%>">
	<input type="hidden" name="search_word" value="<%=search_word%>">
	<input type="hidden" name="search_word_kind" value="<%=search_word_kind%>">		
</form>

<form name="infoexg_insert_form" method="post" action="" enctype="multipart/form-data">
	<input type="hidden" name="deptcd" value ="<%=deptcd%>">
	<input type="hidden" name="deptnm" value ="<%=deptnm%>">
	<input type="hidden" name="makepersid" value ="<%=makepersid%>">
	<input type="hidden" name="makepersnm" value ="<%=makepersnm%>">
	
	<input type="hidden" name="clsf" value ="3">
    <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->	


<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >정보공유 
      &gt; </b>게시판 &gt; 이슈</td>
  </tr>
  <tr> 
    <td height="10"> 
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>

<!--수신범위 조건-->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <tr> 
    <td bgcolor="#EBE9DC" width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">부서</td>
    <td bgcolor="#EBE9DC" class="title"> 
      <select name="rmsgdept" class="sel_all">
<%						 
	  writeDeptOpt(session, out, ds.buseolistOptHtml(""), true);
%>		
      </select>
    </td>  
  </tr>
  <tr> 
    <td height="3" colspan="2"> 
      <!--여백-->
    </td>
  </tr>
</table>

<!--타이틀 -->
<table width="829" border="0"  cellpadding="1" cellspacing="0" align="center">
  <tr> 
    <td  height="25" bgcolor="#EBE9DC" class="title">이슈 등록</td>
  </tr>
  <tr> 
    <td height="3"> 
      <!--여백-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" align="center" bgcolor="#FFFFFF" class="gray" cellpadding="2">
  <tr> 
    <td bgcolor="#dddddd" width="100" class="gray">등록자</td>
    <td width="315" class="gray"><%=makepersnm%></td>
    <td bgcolor="#dddddd" width="100" class="gray">이메일</td>
    <td width="315" class="gray"><input name="email" type="text" size="30" class="text_box"></td>    
  </tr>
  <tr> 
    <td bgcolor="#dddddd" width="100" class="gray">부서</td>
    <td width="315" class="gray"><%=deptnm%></td>
    <td bgcolor="#dddddd" width="100" class="gray">홈페이지</td>
    <td width="315" class="gray"><input name="hmpg" type="text" size="30" class="text_box"></td>
  </tr>
  <tr> 
    <td bgcolor="#dddddd" width="100" class="gray">제목 <font color="red">*</font></td>
    <td class="gray" colspan="3"> 
      <input name="titl" type="text" style="ime-mode:active;" size="90" class="text_box">
    </td>
  </tr>
  <tr> 
    <td bgcolor="#dddddd" width="100" class="gray">내용 <font color="red">*</font></td>
    <td class="gray" colspan="3">
    	<textarea name="cont" cols="100" style="ime-mode:active;" rows="16" class="scroll1"></textarea>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" width="100" class="gray">첨부화일</td>
    <td  class="gray" colspan="3">
      <input name="filenm" type="file" size="90" class="text_box">    
  </tr>
</form>
</table>
<!--버튼 -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
  <tr> 
    <td align="center" height="2"> 
      <!--여백-->
    </td>
  </tr>
  <tr> 
    <td align="center" height="24 "bgcolor="#E8E8E8"> 
      <input type="image" id="insert_id" border="0" src="/html/comm_img/bu_write.gif" width="36" height="19" align="absmiddle" border="0" onclick="javascript:annc_insert()"> 
      <input type="image" id="cancel_id" border="0" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:annc_cancel()"> 
    </td>
    <td align="right" height="24" bgcolor="#E8E8E8" width="100">
	<input type="image" id="list_id" border="0" src="/html/comm_img/bu_list.gif" width="65" height="19" align="absmiddle" border="0" onclick="javascript:infoexg_list()">
	</td>
  </tr>  
  
</table>
<br>
<br>
</body>
</html>
