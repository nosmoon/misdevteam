<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_alon_1721_p.jsp
* 기능     : 캠페인수당 관리
* 작성일자 : 2004-01-16
* 작성자   : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    // dataset 인스턴스 선언부분
	PS_S_CAMPAIGNDataSet ds = (PS_S_CAMPAIGNDataSet)request.getAttribute("ds");

    //화면에 보여줄 레코드 수 설정
    int   showRecCnt  =  10;
%>

<html>
<head>
<title>캠페인관리-사원별 캠페인수당 관리</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
    //이벤트초기화
    function jsInit() {
        setEventHandler();
        //setEnterKeyEventHandler();
    }

    // 지사별 부서조회
    function search_dept(){
        var lo_form1 = document.search_form;

        //밸류값을 check한다.
        if(window.event) window.event.returnValue = false;
        if(!validate(lo_form1)){
            return;
        }
        makeValue(lo_form1);
        lo_form1.action = "/ps/common/1301";
        lo_form1.target = "empcampifrm1";
        lo_form1.submit();
    }

    //검색버튼
    function sear_button(pageno) {
        var lo_form1 = document.search_form;

    	//event check.
    	if(window.event) window.event.returnValue = false;

        lo_form1.hd_boemp_no1.value = lo_form1.sh_boemp_no1.value;
        lo_form1.hd_boemp_no2.value = lo_form1.sh_boemp_no2.value;
        lo_form1.hd_deptcd.value    = lo_form1.deptcd.value;

        if (!chk_search(pageno)) return;
    }


    //PAGE버튼
    function list_search(pageno) {
        var lo_form1 = document.search_form;

        //기존 검색조건과 변경여부 체크
        lo_form1.sh_boemp_no1.value = lo_form1.hd_boemp_no1.value;
        lo_form1.sh_boemp_no2.value = lo_form1.hd_boemp_no2.value;
        lo_form1.deptcd.value    = lo_form1.hd_deptcd.value;

        if (!chk_search(pageno)) return;
    }


    //캠페인 수당 조회
    function chk_search(pageno) {
        var lo_form1 = document.search_form;
        var ls_boemp_no_from = trim(lo_form1.sh_boemp_no1.value); //사원번호 from
        var ls_boemp_no_to = trim(lo_form1.sh_boemp_no2.value);   //사원번호 to

        //사원번호1 5자리 유지
        if (ls_boemp_no_from.length > 0) {
            ls_boemp_no_from = lpad(ls_boemp_no_from,5,'0');
            lo_form1.sh_boemp_no1.value = ls_boemp_no_from;
        }

        //사원번호2 5자리 유지
        if (ls_boemp_no_to.length > 0) {
            ls_boemp_no_to = lpad(ls_boemp_no_to,5,'0');
            lo_form1.sh_boemp_no2.value = ls_boemp_no_to;
        }

        lo_form1.pageno.value = pageno;
        if(!validate(lo_form1)){return;}
        makeValue(lo_form1);
        lo_form1.method = "post";
        lo_form1.action = "/ps/allow/1726";
        lo_form1.target = "empcampifrm1";
        lo_form1.submit();
    }


    //사원별 캠페인수당 저장
    function empcamp_save() {
        var lo_form1    = document.campalon_form;

        if(lo_form1.amt0){
            len = lo_form1.amt0.length;
        }else{
            alert ("해당 사원을 조회하세요!");
            return ;
        }
        makeValue(lo_form1);
        lo_form1.action = "/ps/allow/1731";
        lo_form1.target = "empcampifrm1";
        lo_form1.method = "post";
        lo_form1.submit();
    }
-->
</script>

</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit();search_form.sh_boemp_no1.focus();">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle">사원별 캠페인수당</b></td>
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
      <!--print title -->
      <table width="830" border="0" cellspacing="0" cellpadding="2">
        <tr>
          <td height="27" class="title" bgcolor="#EBE9DC"><b>캠페인정보</b></td>
        </tr>
        <tr>
          <td height="3">
            <!--여백-->
          </td>
        </tr>
      </table>
      <!--list -->
      <table  cellspacing="0" width="830" cellpadding="2" border="0" bgcolor="#FFFFFF" class="gray">
        <tr>
          <td width="100" class="gray" bgcolor="#dddddd" >지사</td>
          <td width="300" class="gray" >&nbsp;<%= ds.getBonm()%>&nbsp;</td>
          <td width="100" class="gray" bgcolor="#dddddd" >캠페인기간</td>
          <td width="300" class="gray" >&nbsp;<%= ds.getBgncampdt()%> - <%= ds.getEndcampdt()%>&nbsp;</td>
        </tr>
        <tr>
          <td width="100" class="gray" bgcolor="#dddddd" >캠페인명</td>
          <td colspan="3" width="451" class="gray" >&nbsp;<%= ds.getCampnm()%>&nbsp;</td>
        </tr>
        <tr>
          <td width="100" class="gray" bgcolor="#dddddd" >내용</td>
          <td colspan="3" class="gray" >&nbsp;<%= ds.getCont()%>&nbsp;</td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td height="15">
      <!------여백--- -->
    </td>
  </tr>
  <tr>
    <td>
      <!--search-->
      <table width="830" border="0" cellspacing="0" cellpadding="2" class="title1" bgcolor="#EBE9DC">
        <form name="search_form" method="post" action="" onsubmit="sear_button(1);">
        <input type="hidden" name="campseq"      value="<%= ds.getCampseq()%>">
        <input type="hidden" name="pageno"       value="1">                <%--현재페이지--%>
        <input type="hidden" name="pagesize"     value="<%=showRecCnt%>">  <%--한페이지당 레코드수--%>
        <input type="hidden" name="js_fn_nm"     value="list_search">      <%--페이지이동시 호출되는 자바스크립트 이름--%>
        <input type="hidden" name="hd_boemp_no1" value="">
        <input type="hidden" name="hd_boemp_no2" value="">
        <input type="hidden" name="hd_deptcd"    value="">

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
            <input name="sh_boemp_no1" type="text" size="9" class="text_box" value="" maxlength="5">
            -
            <input name="sh_boemp_no2" type="text" size="9" class="text_box" value="" maxlength="5"> &nbsp;&nbsp;&nbsp;&nbsp;
            </td>
           <td bgcolor="#EBE9DC" width="100" align="right" >
           <input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="sear_button(1);window.event.returnValue=false;" tabIndex="4">
           </td>
        </tr>
<!--
        <tr>
          <td width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">사원번호</td>
          <td width="200">
            <input type="text" name="sh_boemp_no1" size="5" maxlength="5" class="text_box" value="" >
            -
            <input type="text" name="sh_boemp_no2" size="5" maxlength="5" class="text_box" value="" >
          </td>
          <td width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">부서</td>
          <td>
            <select name="deptcd" size="1" class="sel_all" caption="부서" notEmpty >
              <option value="">전체</option>
            </select> &nbsp;&nbsp;
            <input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="sear_button(1);window.event.returnValue=false;">
          </td>
        </tr>
-->
        </form>
      </table>
    </td>
  </tr>
    <tr>
      <td height="7">
        <!--여백 -->
      </td>
    </tr>
  <tr>
    <td width="80">
      <table width="830" border="0" cellspacing="0" cellpadding="0">
        <form name="campalon_form" method="post" action="" >
        <input type="hidden" name="campseq"      value="<%= ds.getCampseq()%>">
        <input type="hidden" name="checkcnt"     value="0">                <%--선택된 캠페인 수량(삭제시 필요)--%>
        <tr>
          <td width="80">
            <!--타이틀 -->
            <table width="830" border="0" cellspacing="0" cellpadding="2">
              <tr>
                <td height="27" class="title" bgcolor="#EBE9DC"><b>캠페인수당목록</b></td>
                <td height="27" class="title" width="50"  bgcolor="#EBE9DC" align="right">
                  <img src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="empcamp_save();window.event.returnValue=false;">
                </td>
              </tr>
              <tr>
                <td height="3" colspan="2">
                  <!--여백-->
                </td>
              </tr>
            </table>
            <!--리스트 -->
            <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="list_zone">
              <tr align="center" bgcolor="#dddddd">
                <td class="gray" width="200">사원번호</td>
                <td class="gray" width="200">사원명</td>
                <td class="gray" width="200">부서명</td>
                <td class="gray" width="230">건당금액</td>
              </tr>
<%--화면에 보여줄 기본 레코드수에 따라 포멧에 맞게 Display--%>
<%
    for(int i=0; i < showRecCnt ; i++) {
%>
              <tr>
                <td class="gray" width="200" height="23" align="center">&nbsp;</td>
                <td class="gray" width="200" height="23" align="center">&nbsp;</td>
                <td class="gray" width="200" height="23" align="center">&nbsp;</td>
                <td class="gray" width="230" height="23" align="center">&nbsp;</td>
              </tr>
<%
    }
%>
            </table>
            <!---button-->
      <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_zone" >

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
        </form>
      </table>
    </td>
  </tr>
</table>
<br>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td align="center" height="45"  bgcolor="#959595"> <a href="javascript:self.close();"><img src="/html/reader/images/bu_close.gif" width="49" height="19" border="0"></a></td>
  </tr>
<table>
<br>
</body>
<iframe name="empcampifrm1" width=0 height=0></iframe>
</html>
