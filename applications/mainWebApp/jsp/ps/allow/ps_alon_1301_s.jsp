<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_alon_1301_s.jsp
* 기능 : 사원 직수수당 초기화면
* 작성일자 : 2003-12-01
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    // 화면당 보여줄 Row수
    String records_per_page = "20";
    int li_per = Integer.parseInt(records_per_page) ;
    // dataset 인스턴스 선언 부분
    PS_S_EMP_ALON_BASEDataSet ds=(PS_S_EMP_ALON_BASEDataSet)request.getAttribute("ds"); //request dataset
%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// 초기화
function jsInit(){
    setEventHandler();
    //setEnterKeyEventHandler();
}
// 사원번호로 리스트 조회
function list_search(curr_page_no)
{
    var lo_form1 = document.code_search_form;
    var ls_boemp_no_from = trim(lo_form1.boemp_no_from.value); //사원번호 from
    var ls_boemp_no_to = trim(lo_form1.boemp_no_to.value);   //사원번호 to
    //밸류값을 check한다.
    if(window.event) window.event.returnValue = false;
    if(!validate(lo_form1)){
    	return;
    }
    makeValue(lo_form1);
    //사원번호1 5자리 유지
    if (ls_boemp_no_from.length > 0) {
        ls_boemp_no_from = lpad(ls_boemp_no_from,5,'0');
        lo_form1.boemp_no_from.value = ls_boemp_no_from;
    }

    //사원번호2 5자리 유지
    if (ls_boemp_no_to.length > 0) {
        ls_boemp_no_to = lpad(ls_boemp_no_to,5,'0');
        lo_form1.boemp_no_to.value = ls_boemp_no_to;
    }
    lo_form1.curr_page_no.value = curr_page_no ;
    lo_form1.aloncd.value= "03" ; // 직수수당
    lo_form1.action = "/ps/allow/1306";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}
// 지사별 부서조회
function search_dept(){
    var lo_form1 = document.code_search_form;
        lo_form1.action = "/ps/common/1301";
        lo_form1.target = "ifrm";
        lo_form1.method = "post";
        lo_form1.submit();
}
// 페이지 이동
function page_move(curr_page_no) {
    var o_form3 = document.code_search_form;

    if(!curr_page_no) {
        o_form3.curr_page_no.value = '1';
    } else {
        o_form3.curr_page_no.value = curr_page_no;
    }
    list_search(curr_page_no);
}
// 선택된 사원수당을 저장한다
function ins_alon(){
    var lo_form = document.code_search_form;
    var ls_boemp_no      = ""; // 선택된 사원번호를 담는다
    var ls_trgtnoit      = ""; // 선택된 목표건수 값을 담는다
    var ls_fix_rateclsf  = ""; // 선택된 정렬구분 값을 담는다
    var ls_ratiocalcclsf = ""; // 선택된 비율계산구분  값을 담는다
    var ls_amt           = ""; // 선택된 금액 값을 담는다.
    var ls_ratio         = ""; // 선택된 비율값을 담는다.
    var len  = "" ;
        if(lo_form.insChk){
            len = lo_form.insChk.length;
        }else{
            alert ("해당 사원을 선택하세요!");
            return ;
        }

    var count = 0;
    makeValue(lo_form);
   if (!lo_form.insChk.length) { // 하나의 check박스가 선택된경우
            if(lo_form.insChk.checked) { // check된건에 한하여 데이타 입력
                ls_boemp_no = ls_boemp_no + lo_form.boemp_no.value ;
                ls_ratio =  (ls_ratio) +  (lo_form.ratio[0].value) ;
                if(lo_form.ratio[0].value > 100 ){
                    alert("사원번호 ["+lo_form.boemp_no.value+"] 의 비율이 올바르지 않습니다.");
                    lo_form.ratio[0].focus();
                    return;
                }
                count++;
            }
   } else{  // 여러개의 check 박스가 선택된경우
        for (var i=0; i<len; i++){
            if(lo_form.insChk[i].checked) { // check된건에 한하여 데이타 입력
                    if(ls_boemp_no == "" ) {  // 최초입력시 구분자 제외한다
                        ls_boemp_no = ls_boemp_no + lo_form.boemp_no[i].value ;
                        ls_ratio = ls_ratio + lo_form.ratio[i].value ;
                        if(lo_form.ratio[i].value > 100 ){
                            alert("사원번호 ["+lo_form.boemp_no[i].value+"] 의 비율이 올바르지 않습니다.");
                            lo_form.ratio[i].focus();
                            return;
                        }
                        count++;
                    } else {  // 두번째 이후부터 구분값을 넣는다
                        ls_boemp_no = ls_boemp_no + '##' + lo_form.boemp_no[i].value ;
                        ls_ratio = ls_ratio + '##' + lo_form.ratio[i].value ;
                        if(lo_form.ratio[i].value > 100 ){
                            alert("사원번호 ["+lo_form.boemp_no[i].value+"] 의 비율이 올바르지 않습니다.");
                            lo_form.ratio[i].focus();
                            return;
                        }
                        count++;
                    }
            }
        }
   }

    lo_form.ls_boemp_no.value = ls_boemp_no ;
    lo_form.ls_ratio.value = ls_ratio ;

    if(count ==0) { // delete 처리대상에 한건도 없을 때
        alert("저장 대상건을 선택하세요.");
        return;
    }
    var ls_check = confirm("저장 하시겠습니까?");
    if (!ls_check)  return;
    lo_form.action = "/ps/allow/1311";
    lo_form.target = "ifrm";

    lo_form.submit();
}
// 체크박스일괄 처리
function chkboxAll(){

    var lo_form = document.code_search_form;

    var ls_len  = "" ; // 전체체크및취소구분

    if(!lo_form.insChk){
        return ;
    }

    if (!lo_form.insChk.length) { // 하나의 check박스가 선택된경우
        ls_len = 1 ;
    }else{
        ls_len = lo_form.insChk.length ;
    }

    var ls_chk = "" ;
    if ( ls_len == 1 ){
        if (lo_form.checkall.checked){ // 전체선택
            lo_form.insChk.checked = true ;
        }else{
            lo_form.insChk.checked = false ;
        }
    }else{
        if (lo_form.checkall.checked){ // 전체선택
    	    for (var i=0; i<ls_len; i++){
       		lo_form.insChk[i].checked = true ;
    	    }
        }else{ // 전체취소
    	    for (var i=0; i<ls_len; i++){
       		lo_form.insChk[i].checked = false ;
    	    }
        }
    }
}

//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit();" >
<form name="code_search_form" method="post" action="" onsubmit="list_search(1)">
    <input name="curr_page_no" type="hidden" value ="1">
    <input type="hidden" name="records_per_page" value="<%=records_per_page%>"> <!--//화면에 보여줄  ROW수-->
    <input name="js_fn_nm" type="hidden" value ="page_move">
    <input name="aloncd" type="hidden" value ="03"><!--//직수수당구분 값-->
    <input name="ls_boemp_no" type="hidden" value =""><!--//사원번호 값-->
    <input name="ls_trgtnoit" type="hidden" value =""><!--//목표량 값-->
    <input name="ls_fix_rateclsf" type="hidden" value =""><!--//정액정률구분 값-->
    <input name="ls_ratiocalcclsf" type="hidden" value =""><!--//계산구분 값-->
    <input name="ls_amt" type="hidden" value =""><!--/금액 값-->
    <input name="ls_ratio" type="hidden" value =""><!--//비율 값-->

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle">수당
      &gt; </b>직수수당</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td>
      <!--search-->
      <table width="830" border="0" cellspacing="0" cellpadding="2" class="title1" bgcolor="#EBE9DC">
        <tr>
          <td bgcolor="#EBE9DC" width="700"  >
          <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지사<font color="red">*</font>
            <select name="bocd" class="sel_all" onchange="search_dept()" caption="지사" notEmpty >
              <option value="" >선택</option>
              <%=ds.asinbocdcurOptHtml("")%>
            </select>&nbsp;&nbsp;&nbsp;&nbsp;

            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">부서
            <select id="bodept_sel" name="deptcd" class="sel_all">
              <option value="" >전체</option>
            </select>&nbsp;&nbsp;&nbsp;&nbsp;
            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">사원번호
            <input name="boemp_no_from" type="text" size="5" class="text_box" value="" maxlength="5" dataType="number" caption="사원번호">
            -
            <input name="boemp_no_to" type="text" size="5" class="text_box" value="" maxlength="5" dataType="number" caption="사원번호"> &nbsp;&nbsp;&nbsp;&nbsp;
            </td>
           <td bgcolor="#EBE9DC" width="100" align="right" >
           <input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="list_search(1);window.event.returnValue=false;" tabIndex="4">
           </td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td height="3">
      <!--여백 -->
    </td>
  </tr>
  <tr>
    <td valign="top">
      <!--타이틀 -->
      <table width="830" border="0" cellspacing="0" cellpadding="2">
        <tr>
          <td height="27" class="title" bgcolor="#EBE9DC"><b>직수수당목록</b></td>
          <td height="27" class="title" width="50"  bgcolor="#EBE9DC" align="right">
            <img src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="ins_alon();window.event.returnValue=false;">
          </td>
        </tr>
        <tr>
          <td height="3" colspan="2">
            <!--여백-->
          </td>
        </tr>
      </table>
      <!--리스트 -->
      <table width="830"  cellspacing="0" cellpadding="1" border="0" bgcolor="#FFFFFF" class="gray" id="code_list" >
        <tr align="center">
          <td width="30" align="center" bgcolor="#dddddd" class="gray">
            <input type="checkbox" name="checkbox2" value="checkbox">
          </td>
          <td width="200" bgcolor="#dddddd" class="gray" align="center" > 소속지사 </td>
          <td width="200" bgcolor="#dddddd" class="gray" align="center" > 사원번호 </td>
          <td width="200" bgcolor="#dddddd" class="gray" align="center" > 사원명 </td>
          <td width="200" bgcolor="#dddddd" class="gray" align="center" > 부서명 </td>
          <td width="200" bgcolor="#dddddd" class="gray" align="center" > 비율(%) </td>
        </tr>
<%
	for ( int i= 0 ; i < li_per ; i++ ) {
%>
        <tr>
          <td  width="30" align="center" class="gray">&nbsp;</td>
          <td  width="200" class="gray">&nbsp;</td>
          <td  width="200" class="gray">&nbsp;</td>
          <td  width="200" class="gray">&nbsp;</td>
          <td  width="200" class="gray">&nbsp;</td>
          <td width="200" align="center" class="gray" >
          &nbsp;
          </td>
        </tr>
<%
	}
%>
      </table>
      <!---button-->
      <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="list_page" >
        <tr>
          <td align="center" height="2">
            <!--여백-->
          </td>
        </tr>
        <tr>
          <td align="center" height="24" bgcolor="#E8E8E8">
                            <div align="center">
                            <!--JSP PAGE START---------------------------------------------------------------------------------->
                            <jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
                            <jsp:param name = "curr_page_no" 		value="0"/>
                            <jsp:param name = "total_records" 		value="0"/>
                            <jsp:param name = "js_fn_nm" 	        value="js_page_navigator"/>
                            <jsp:param name = "records_per_page" 	value="15"/>
                            <jsp:param name = "page_set_gubun" 		value="0"/>
                            </jsp:include>
                            <!--JSP PAGE END------------------------------------------------------------------------------------>
        		    </div>
          </td>
        </tr>
      </table>
    </td>
  </tr>
</table>
<br>
<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=0 height=0></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</form>
</body>
</html>
