<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1910_i.jsp
* 기능 : 정보공유 출장보고서 등록화면
* 작성일자 : 2003-12-20
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    String curr_page_no = (String)request.getAttribute("curr_page_no");
    if(curr_page_no == null) {curr_page_no = "1";}
    String records_per_page = (String)request.getAttribute("records_per_page");
    if(records_per_page == null) {records_per_page = "10";}

    String deptcd = Util.getSessionParameterValue(request, "selldeptcd", false);		//소속 판매부서코드
	String deptnm = Util.getSessionParameterValue(request, "selldeptnm", false);    	//소속 판매부서명
	String makepersid = Util.getSessionParameterValue(request,"uid", false);			//사용자 ID
	String makepersnm = Util.getSessionParameterValue(request,"emp_nm", false);			//사용자명

    String srchdeptcd = Util.checkString((String)request.getAttribute("srchdeptcd"));
    String makedt1 = Util.checkString((String)request.getAttribute("makedt1"));
    String makedt2 = Util.checkString((String)request.getAttribute("makedt2"));
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    
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
	document.outrpt_insert_form.makedt.focus();
}


// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 출장보고서 검색 리스트
function job_list(){
    var lo_form1 = document.outrpt_view_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    lo_form1.action = "/ss/share/1901";
    lo_form1.submit();
        
}

// 출장보고서 등록
function job_insert(){
    var lo_form1 = document.outrpt_insert_form;
    
		if(lo_form1.outplacfrdt.value=='')
		{
	        alert("출장시작기간을 입력해주세요.");
	        lo_form1.outplacfrdt.focus();
	        return;		
		}
		else if(lo_form1.outplactodt.value=='')
		{
	        alert("출장종료기간을 입력해주세요.");
	        lo_form1.outplactodt.focus();
	        return;		
		}			    
		else if(lo_form1.outplacarea.value=='')
		{
	        alert("출장지역을 입력해주세요.");
	        lo_form1.outplacarea.focus();
	        return;		
		}
		else if(lo_form1.reptcont.value=='')
		{
	        alert("보고내용을 입력해주세요.");
	        lo_form1.reptcont.focus();
	        return;		
		}	
    

    // 액션을 "/ss/share/1915" 서블릿으로 보낸다
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    lo_form1.action = "/ss/share/1915";
    lo_form1.submit();
        
}

// 출장보고서 입력 취소
function job_cancel(){
    // 출장보고서 등록 폼의 값을 reset 해준다.
    var lo_form1 = document.outrpt_insert_form;

	lo_form1.makedt.value = '';
	lo_form1.outplacfrdt.value = '';
	lo_form1.outplactodt.value = '';
	lo_form1.outplacarea.value = '';
	lo_form1.reptcont.value = '';	
	lo_form1.etc.value = '';

}

//-->
</script>
<!--JavaScript ADD END------------------------------------------------------------------------------>

</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">

<form name="outrpt_view_form" method="post" action="">
	<input type="hidden" name="curr_page_no" value="<%=curr_page_no%>">
	<input type="hidden" name="records_per_page" value="<%=records_per_page%>">
	<input type="hidden" name="makedt1" value="<%=makedt1%>">
	<input type="hidden" name="makedt2" value="<%=makedt2%>">	
	<input type="hidden" name="srchdeptcd" value="<%=srchdeptcd%>">
	<input type="hidden" name="search_word" value="<%=search_word%>">
	<input type="hidden" name="search_word_kind" value="<%=search_word_kind%>">
</form>

<form name="outrpt_insert_form" method="post" action="" enctype="multipart/form-data">
	
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >정보공유 
      &gt; </b> 일지및보고서 &gt; 출장보고서</td>
  </tr>
  <tr> 
    <td height="10"> 
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<!--타이틀 -->
<table width="829" border="0" cellpadding="1" cellspacing="0" align="center">
  <tr> 
    <td  height="25" bgcolor="#EBE9DC" class="title">출장보고서 등록</td>
    <td  height="25" bgcolor="#EBE9DC" class="title" width="80" align="right">( 
      <font color="red">*</font> 필수항목 )</td>
  </tr>
  <tr> 
    <td height="3" colspan="2"> 
      <!--여백-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellpadding="2" cellspacing="0" align="center" class="gray" bgcolor="#FFFFFF">
  <tr> 
    <td   bgcolor="#dddddd" class="gray" width="130">작성자 </td>
    <td class="gray" width="280" >홍길동</td>
    <td width="130"  bgcolor="#dddddd" class="gray">소속 </td>
    <td class="gray" width="290" > 수판1부</td>
  </tr>
  <tr> 
    <td bgcolor="#dddddd" class="gray" width="130">작성일자 <font color="red">*</font></td>
    <td height="20" class="gray">
	  <input name="makedt" type="text" value="<%= Util.getDate2()%>" size="10" class="text_box" caption="작성일자" dataType="date">
       예) 20030101 </td>
    <td bgcolor="#dddddd" class="gray" width="130"> 출장기간 <font color="red">*</font></td>
    <td class="gray" width="310"> 
      <input name="outplacfrdt" type="text" value="<%= Util.getDate2()%>" size="10" class="text_box" caption="작성일자" dataType="date">
      - 
      <input name="outplactodt" type="text" value="<%= Util.getDate2()%>" size="10" class="text_box" caption="작성일자" dataType="date">
      예) 20030101-20030101</td>       
  </tr>
  <tr> 
    <td  bgcolor="#dddddd" class="gray" width="130"> 
      <p>출장 지역 <font color="red">*</font></p>
    </td>
    <td  colspan="3" class="gray">
        
      <textarea name="outplacarea" style="ime-mode:active;" cols="90" rows="8" class="scroll1"></textarea>
    </td>
  </tr>
  <tr> 
    <td   bgcolor="#dddddd" class="gray" width="130"> 
      <p>보고 내용 <font color="red">*</font></p>
    </td>
    <td  colspan="3" class="gray"> 
      <textarea name="reptcont" style="ime-mode:active;" cols="90" rows="8" class="scroll1"></textarea>
    </td>
  </tr>
  <tr> 
    <td   bgcolor="#dddddd" class="gray" width="130">기타사항</td>
    <td  colspan="3" class="gray"> 
      <textarea name="etc" style="ime-mode:active;" cols="90" rows="8" class="scroll1"></textarea>
    </td>
  </tr>
  <tr> 
    <td class="gray" bgcolor="#dddddd" width="130">첨부파일</td>
    <td height="0" colspan="3" class="gray">
		<input name="filenm" type="file" size="90" class="text_box">
    </td>
  </tr>
</form>
</table>
<!--버튼 -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
  <tr> 
    <td align="center" height="2" colspan="2"> 
      <!--여백-->
    </td>
  </tr>
  <tr> 
    <td align="center" height="24" bgcolor="#E8E8E8"> 
      <input type="image" id="insert_id" border="0" src="/html/comm_img/bu_write.gif" width="36" height="19" align="absmiddle" border="0" onclick="javascript:job_insert();window.event.returnValue=false;"> 
      <input type="image" id="cancel_id" border="0" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0"  onclick="javascript:job_cancel();window.event.returnValue=false;"> 
    </td>
    <td align="right" height="24" bgcolor="#E8E8E8" width="100">
      <input type="image" id="list_id" border="0" src="/html/comm_img/bu_list.gif" width="65" height="19" align="absmiddle" border="0" onclick="javascript:job_list();window.event.returnValue=false;">
    </td>
  </tr>
</table>
</body>
</html>
