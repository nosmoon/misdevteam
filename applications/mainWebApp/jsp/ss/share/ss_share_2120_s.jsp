<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_2120_s.jsp
* 기능 : 정보공유 타사동향보고 상세보기
* 작성일자 : 2003-12-29
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
    SS_S_OTHRPTDataSet ds = (SS_S_OTHRPTDataSet)request.getAttribute("ds");  // request dataset
    
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
	document.othrpt_update_form.jungpoly.focus();
}


// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 타사동향보고 list
function dawnrpt_list(){
    var lo_form1 = document.othrpt_view_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    lo_form1.action = "/ss/share/2101";
    lo_form1.target = "_self";
    lo_form1.submit();
        
}

// 타사동향보고 수정
function othrpt_update(){
	ans= confirm("수정 하시겠습니까?");
	if(ans == true)
	{
	    var lo_form1 = document.othrpt_update_form;

		if(lo_form1.makedt.value=='')
		{
	        alert("작성일자를입력해주세요.");
	        lo_form1.makedt.focus();
	        return;		
		}
	    
	    // 액션을 "/ss/share/2130" 서블릿으로 보낸다
    	if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	    lo_form1.target = "_self";
	    lo_form1.action = "/ss/share/2130";
	    lo_form1.submit();
	}
}

// 타사동향보고 삭제
function othrpt_delete(){
	ans= confirm("정말로 삭제하시겠습니까?");
	if(ans == true)
	{
	    var lo_form1 = document.othrpt_view_form;
	
	    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	    lo_form1.action = "/ss/share/2140";
	    lo_form1.target = "_self";
	    lo_form1.submit();
	}
}

//타사동향보고 다운로드
function othrpt_dwload() {
    var lo_form1 = document.othrpt_view_form;	

    // 시퀀스값을 "/ss/share/2150" 서블릿으로 보낸다
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/share/2150";
    lo_form1.submit();
}

-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">

<!--OTHRPT_VIEW_FORM START--------------------------------------------------------------------------------->
<form name="othrpt_view_form" method="post" action="">
	<input type="hidden" name="curr_page_no" value="<%=curr_page_no%>">
	<input type="hidden" name="records_per_page" value="<%=records_per_page%>">
	<input type="hidden" name="srchdeptcd" value="<%=srchdeptcd%>">
	<input type="hidden" name="makedt1" value="<%=makedt1%>">
	<input type="hidden" name="makedt2" value="<%=makedt2%>">
	<input type="hidden" name="search_word" value="<%=search_word%>">
	<input type="hidden" name="search_word_kind" value="<%=search_word_kind%>">
	<input type="hidden" name="dwloadcnt" value="<%=ds.dwloadcnt%>">  <!--다운로드수-->	
</form>

<form name="othrpt_update_form" method="post" action="" enctype="multipart/form-data">
	<input type="hidden" name="seq" value ="<%= ds.getSeq()%>">
	<input type="hidden" name="makepersid" value ="<%= ds.getMakepersid()%>">	<!--작성자 삭제여부 체크시 사용-->

	<input type="hidden" name="curr_page_no" value="<%=curr_page_no%>">
	<input type="hidden" name="records_per_page" value="<%=records_per_page%>">
	<input type="hidden" name="srchdeptcd" value="<%=srchdeptcd%>">
	<input type="hidden" name="makedt1" value="<%=makedt1%>">
	<input type="hidden" name="makedt2" value="<%=makedt2%>">		
	<input type="hidden" name="search_word" value="<%=search_word%>">
	<input type="hidden" name="search_word_kind" value="<%=search_word_kind%>">
	<input type="hidden" name="brwscnt" value="<%= ds.getBrwscnt()%>">
	
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >정보공유 
      &gt; </b> 일지및보고서 &gt; 타사동향보고</td>
  </tr>
  <tr> 
    <td height="10"> 
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<!--타이틀 -->
<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
  <tr> 
    <td  height="25" bgcolor="#EBE9DC" class="title">타사동향보고 등록자 정보</td>
  </tr>
  <tr> 
    <td height="3"> 
      <!--여백-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellpadding="2" cellspacing="0" align="center" class="gray" bgcolor="#FFFFFF">
  <tr> 
    <td bgcolor="#dddddd" class="gray" width="80">작성자 </td>
    <td class="gray">&nbsp;<%= Util.checkString(ds.getMakepersnm())%></td>
    <td bgcolor="#dddddd" class="gray">소속 </td>
    <td class="gray"> &nbsp;<%= Util.checkString(ds.getDeptnm())%></td>
  </tr>
</table><br>
<table width="829" border="0" cellpadding="1" cellspacing="0" align="center">
  <tr> 
    <td  height="25" bgcolor="#EBE9DC" class="title">타사동향보고 상세내역</td>
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
    <td class="gray" width="80" bgcolor="#dddddd" >타사 </td>
    <td class="gray" align="center" bgcolor="#dddddd">중앙</td>
    <td class="gray" align="center" bgcolor="#dddddd">동아 </td>
    <td class="gray" align="center" bgcolor="#dddddd"> 기타</td>
  </tr>
  <tr> 
    <td bgcolor="#dddddd" class="gray" width="80">타사 정책</td>
    <td class="gray" align="center"  > 
      <textarea name="jungpoly" style="ime-mode:active;" cols="30" rows="7" class="scroll1"><%= Util.checkString(ds.getJungpoly())%></textarea>
    </td>
    <td class="gray" align="center"  > 
      <textarea name="dongpoly" style="ime-mode:active;" cols="30" rows="7" class="scroll1"><%= Util.checkString(ds.getDongpoly())%></textarea>
    </td>
    <td class="gray" align="center"  > 
      <textarea name="etcpoly" style="ime-mode:active;" cols="30" rows="7" class="scroll1"><%= Util.checkString(ds.getEtcpoly())%></textarea>
    </td>
  </tr>
  <tr> 
    <td bgcolor="#dddddd" class="gray" width="80"> 타사동향</td>
    <td class="gray" align="center"  > 
      <textarea name="jungmovmt" style="ime-mode:active;" cols="30" rows="7" class="scroll1"><%= Util.checkString(ds.getJungmovmt())%></textarea>
    </td>
    <td class="gray" align="center"  > 
      <textarea name="dongmovmt" style="ime-mode:active;" cols="30" rows="7" class="scroll1"><%= Util.checkString(ds.getDongmovmt())%></textarea>
    </td>
    <td class="gray" align="center"  > 
      <textarea name="etcmovmt" style="ime-mode:active;" cols="30" rows="7" class="scroll1"><%= Util.checkString(ds.getEtcmovmt())%></textarea>
    </td>
  </tr>
  <tr> 
    <td bgcolor="#dddddd" class="gray" width="80"> 기타</td>
    <td class="gray" align="center"  > 
      <textarea name="jungetc" style="ime-mode:active;" cols="30" rows="7" class="scroll1"><%= Util.checkString(ds.getJungetc())%></textarea>
    </td>
    <td class="gray" align="center"  > 
      <textarea name="dongetc" style="ime-mode:active;" cols="30" rows="7" class="scroll1"><%= Util.checkString(ds.getDongetc())%></textarea>
    </td>
    <td class="gray" align="center"  > 
      <textarea name="etcetc" style="ime-mode:active;" cols="30" rows="7" class="scroll1"><%= Util.checkString(ds.getEtcetc())%></textarea>
    </td>
  </tr>
  <tr> 
    <td bgcolor="#dddddd" class="gray" width="130">작성일자 <font color="red">*</font></td>
    <td height="20" class="gray" colspan="3">
	  <input name="makedt" type="text" size="10" class="text_box" value="<%= Util.convertS(ds.getMakedt())%>" dataType=date>
       예) 20040101</td>
  </tr>
  <tr> 
    <td   bgcolor="#dddddd" class="gray" width="130">조회수 </td>
    <td class="gray" width="280" >&nbsp;<%= ds.getBrwscnt()%></td>
    <td width="130"  bgcolor="#dddddd" class="gray">다운로드수 </td>
    <td class="gray" width="290" >&nbsp;<%= ds.getDwloadcnt()%></td>
  </tr>   
  <tr> 
    <td class="gray" bgcolor="#dddddd" width="130">첨부파일명</td>
    <td height="0" colspan="3" class="gray">&nbsp;
    	<a onClick="othrpt_dwload();" style="cursor:hand;">
    	<font color="blue">&nbsp;<%= Util.checkString(ds.filenm)%> </font>
    	</a>    
    </td>    
  </tr>
  <tr>
    <td bgcolor="#dddddd" width="130" class="gray">첨부화일</td>
    <td  class="gray" colspan="3">
      <input name="filenm" type="file" size="90" class="text_box">    
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
      <input type="image" id="update_id" border="0" src="/html/comm_img/bu_edit.gif" width="36" height="19" align="absmiddle" onclick="javascript:othrpt_update();window.event.returnValue=false;"> 
      <input type="image" id="del_id" border="0" src="/html/comm_img/bu_del.gif" width="39" height="19" align="absmiddle" onclick="javascript:othrpt_delete();window.event.returnValue=false;"> 
    </td>
    <td align="right" height="24" bgcolor="#E8E8E8" width="100">
      <input type="image" id="list_id" border="0" src="/html/comm_img/bu_list.gif" width="65" height="19" align="absmiddle" border="0" onclick="javascript:dawnrpt_list();window.event.returnValue=false;">
    </td>
  </tr>  
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=0 height=0></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
