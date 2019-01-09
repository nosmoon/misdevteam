<%@ page contentType="text/html; charset=euc-kr" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_bil_1901_a.jsp
* 기능 : 수금-자동이체청구결과 초기화면
* 작성일자 : 2006-04-19
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    PS_L_AUTO_SHIFT_APLC_INITDataSet ds = (PS_L_AUTO_SHIFT_APLC_INITDataSet)request.getAttribute("ds");

	String monthOptionsHtml = null; // 년월 리스트를 구성할 options를 write하기 위한 임시 변수

	StringBuffer sb = new StringBuffer("");
	Calendar calendar = new GregorianCalendar(Locale.KOREA);
//    calendar.add(Calendar.YEAR, -1);

	String tempMonth = null;
	for(int i=0; i<13; i++){
		tempMonth = String.valueOf(calendar.get(Calendar.MONTH)+1);
		if(tempMonth.length()==1) {
    		tempMonth = "0" + tempMonth;
    	}
		sb.append("<option value=\"");
		sb.append(String.valueOf(calendar.get(Calendar.YEAR))+tempMonth);
		sb.append("\"");
		sb.append(">");
		sb.append(calendar.get(Calendar.YEAR) + "년 " + tempMonth + "월");
		sb.append("</option>");

		calendar.add(Calendar.MONTH, -1);
	}
	monthOptionsHtml = sb.toString();
%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
<script language="javascript">
<!--
    // 엔터키 잡아내기
    function f_list_search() {
        if(event.keyCode == 13) list_search();
    }

    // 청구결과 검색
    function ocom_list_search(curr_page_no) {
        if(curr_page_no!=null) {
            clam_ocom_search_form.curr_page_no.value = curr_page_no;
        }

        clam_ocom_search_form.method = "post";
        clam_ocom_search_form.action = "/ps/bill/1911";
        clam_ocom_search_form.target = "ifrm";

        clam_ocom_search_form.submit();

        //check_all(clam_ocom_search_form);
    }

    // 자동이체구분,청구월로 상세 목록 조회
    function ocom_detl_list(startpage,shftclsfcd,bocd) {
    	var lo_form1 = document.clam_ssum_form;
        var lo_form2 = document.clam_ocom_search_form;

        lo_form2.basidt.value = lo_form1.basidt.value;
        lo_form2.shftclsfcd.value = shftclsfcd;
        lo_form2.bocd.value = bocd;

        lo_form2.curr_page_no.value = startpage;
        lo_form2.action = "/ps/bill/1911";
        lo_form2.target = "ifrm";
        lo_form2.submit();
    }

    // 청구결과 인쇄
    function ocom_list_print() {
        clam_ocom_search_form.method = "post";
        clam_ocom_search_form.action = "/ps/bill/1916";
        clam_ocom_search_form.target = "ifrm";

        clam_ocom_search_form.submit();

        //check_all(clam_ocom_search_form);
    }

    // 폼 구성요소 초기화
    function jsInit(){
        setEventHandler();
    	setEnterKeyEventHandler();
    	setInputBackgroundColor();
    } // jsInit

    // 폼 유효성 검사 및 전송
    function check_all(form){
        if(!validate(form)) return false;
        else{
            makeValue(form);
            form.submit();
        }
    }

	// 청구결과요약 조회
    function list_search() {
    	var lo_form = document.clam_ssum_form;
    	if(lo_form.basidt.value=="") {
    		alert("청구월은 필수입력사항입니다.");
    		return;
    	}

    	lo_form.action="/ps/bill/1906";
    	lo_form.target="ifrm";
    	lo_form.method="post";
    	lo_form.submit();
    }
-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle"></b>자동이체청구결과</td>
    </tr>
    <tr>
        <td height="10"> <!--내용을 위한 여백--> </td>
    </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
    <tr>
        <td> <!--검색-->
            <table width="830" border="0" cellspacing="0" cellpadding="2">
            	<form name="clam_ssum_form">
                <tr>
                    <td bgcolor="#EBE9DC"  width="70" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지사
                    </td>
                    <td bgcolor="#EBE9DC"  width="120" class="title">
                        <select name="bocd" size="1" class="sel_all" notEmpty caption="지사">
                            <option value="">전체</option>
                            <%=ds.intgbocdcurOptHtml("") %>
                        </select>
                    </td>

                    <td bgcolor="#EBE9DC" width="70"  class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">청구월</td>
                    <td bgcolor="#EBE9DC" class="title"> <select name="basidt" class="sel_all">
                            <%=monthOptionsHtml%>
                        </select>
                        <input type="image" onclick="list_search();window.event.returnValue=false;" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle"> </td>
                </tr>
                <tr>
                    <td height="3" colspan="2"> <!--여백--> </td>
                </tr>
                </form>
            </table>
            <!--검색 끝-->
            <!--list -->
            <table width="830" border="0" cellpadding="1" cellspacing="0" class="gray" id="clam_ssum_id">
                <tr align="center" bgcolor="#dddddd">
                    <td width="100" class="gray">지사구분</td>
                    <td width="100" class="gray">이체구분</td>
                    <td width="100" class="gray">청구건수</td>
                    <td width="100" class="gray">청구금액</td>
                    <td width="100" class="gray">수납건수</td>
                    <td width="100" class="gray">수납금액</td>
                    <td width="100" class="gray">수수료</td>
                    <td width="100" class="gray">지사송금액</td>
                </tr>
                <tr  bgcolor="#FFFFFF">
                    <td height="17" class="gray">&nbsp;</td>
                    <td height="17" class="gray">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                </tr>
                <tr  bgcolor="#FFFFFF">
                    <td height="17" class="gray">&nbsp;</td>
                    <td height="17" class="gray">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                </tr>
                <tr  bgcolor="#FFFFFF">
                    <td height="17" class="gray">&nbsp;</td>
                    <td height="17" class="gray">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                </tr>
            </table></td>
    </tr>
    <tr>
        <td height="10"> <!------여백--- --> </td>
    </tr>
    <tr>
        <td> <!--검색 -->
            <table width="830" border="0" cellspacing="0" cellpadding="2">
            	<form name="clam_ocom_search_form" method="post" action="" >
                <input type="hidden" name="curr_page_no" value="1"><%--현재페이지--%>
	            <input type="hidden" name="records_per_page" value="15"><%--한페이지당 레코드수--%>
	            <input type="hidden" name="js_fn_nm" value="ocom_list_search"><%--페이지이동 시 호출되는 자바스크립트 이름--%>
                <tr>
                    <td bgcolor="#EBE9DC"  width="60" class="sea_top"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지사
                    </td>
                    <td bgcolor="#EBE9DC"  width="100" class="sea_top">
                        <select name="bocd" size="1" class="sel_all" notEmpty caption="지사">
                            <option value="">전체</option>
                            <%=ds.intgbocdcurOptHtml("") %>
                        </select>
                    </td>
                    <td bgcolor="#EBE9DC" width="60" class="sea_top"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">청구월</td>
                    <td bgcolor="#EBE9DC" width="180" class="sea_top"> <select name="basidt" class="sel_all" id="basidt">
                            <%=monthOptionsHtml%>
                        </select> </td>
                    <td bgcolor="#EBE9DC" width="186" class="sea_top" colspan="2"> &nbsp;</td>
                    <input type="hidden" name="subsmappli" value="">
<!--                    <td bgcolor="#EBE9DC" width="86" class="sea_top"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구독월분</td>
                    <td bgcolor="#EBE9DC" width="100" class="sea_top"> <select name="subsmappli" class="sel_all" id="subsmappli">
                            <option value="" selected>선택</option>
                            < %=monthOptionsHtml%>
                        </select> </td> -->
                    <td bgcolor="#EBE9DC" rowspan="2" align="right" width="48" class="sea_top"><input type="image" onclick="ocom_list_search(1);window.event.returnValue=false;" src="/html/comm_img/bu_search03.gif" width="39" height="35" border="0"></td>
                </tr>
                <tr>
                    <td bgcolor="#EBE9DC" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">청구결과</td>
                    <td bgcolor="#EBE9DC" width="100"> <select name="erryn" class="sel_all" id="erryn">
                            <option value="" selected>전체</option>
                            <option value="N">정상</option>
                            <option value="Y">오류</option>
                        </select> </td>
                    <td bgcolor="#EBE9DC" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">검색조건</td>
                    <td bgcolor="#EBE9DC" width="180"> <select name="sechcond" class="sel_all">
                            <option value="" selected>전체</option>
                            <option value="20">수취인</option>
                            <option value="30">독자번호</option>
                        </select>
                        <input name="sechcont" type="text" size="13" class="text_box"> </td>
                    <td bgcolor="#EBE9DC" width="86"  ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">이체구분</td>
                    <td bgcolor="#EBE9DC" width="100"  > <select name="shftclsfcd" class="sel_all">
                            <option value="">전체</option>
                            <%=ds.shftclsfOptHtml("")%>
                        </select> </td>
                </tr>
                <tr>
                    <td height="1" colspan="7" bgcolor="#927F5B"> <!--line--> </td>
                </tr>
                <tr>
                    <td height="3" colspan="7"> <!--여백--> </td>
                </tr>
                </form>
            </table>
            <!--검색 끝-->
            <!--title -->
            <table width="830" border="0" cellspacing="0" cellpadding="2">
                <tr>
                    <td bgcolor="#EBE9DC" class="title">자동이체 청구 결과 목록</td>
                    <td bgcolor="#EBE9DC" width="80" class="title" align="right"><input type="image" onclick="ocom_list_print();window.event.returnValue=false;" src="/html/comm_img/bu_print.gif" width="39" height="19" border="0" align="absmiddle"></td>
                </tr>
                <tr>
                    <td height="3" colspan="2" align="right"> <!--여백--> </td>
                </tr>
            </table>
            <!--list -->
            <table width="829" border="0" cellpadding="1" cellspacing="0" bgcolor="#ffffff" class="gray" id="clam_ocom_id">
                <tr>
                    <td width="60" bgcolor="#dddddd" class="gray" align="center"> 청구월</td>
                    <td width="60" bgcolor="#dddddd" class="gray" align="center"> 구독월분</td>
                    <td width="140" bgcolor="#dddddd" class="gray" align="center"> 독자번호 </td>
                    <td height="16" bgcolor="#dddddd" width="110" class="gray" align="center"> 독자명</td>
                    <td bgcolor="#dddddd" width="80" class="gray" align="center"> 매체</td>
                    <td bgcolor="#dddddd" width="50" class="gray" align="center"> 부수</td>
                    <td bgcolor="#dddddd" width="60" class="gray" align="center"> 청구금액</td>
                    <td bgcolor="#dddddd" width="80" class="gray" align="center"> 구분</td>
                    <td bgcolor="#dddddd" width="50" class="gray" align="center"> 결과</td>
                    <td bgcolor="#dddddd" width="70" class="gray" align="center"> 입금여부 </td>
                    <td bgcolor="#dddddd" width="220" class="gray" align="center"> 오류사유</td>
               </tr>
            <% for(int i=0; i<15; i++) { %>
              <tr>
                <td width="60" class="gray">&nbsp;</td>
                <td width="60" class="gray">&nbsp;</td>
                <td width="140" class="gray">&nbsp;</td>
                <td width="110" class="gray"height="16" >&nbsp;</td>
                <td width="80" class="gray">&nbsp;</td>
                <td width="50" align="right" class="gray">&nbsp;</td>
                <td width="60" align="right" class="gray">&nbsp;</td>
                <td width="80" align="center" class="gray">&nbsp;</td>
                <td width="50" align="center" class="gray">&nbsp;</td>
                <td width="70" align="center" class="gray">&nbsp;</td>
                <td width="220" class="gray">&nbsp;</td>
              </tr>
            <% } %>
                <tr bgcolor="#dddddd">
                    <td colspan="3" height="20" class="gray" style="border-right:0;"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">총 <b>0건 </b><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">정상 <b>0건</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">오류 <b><font color="red">0건</font></b></td>
                    <td colspan="8" height="20" class="gray" align="right" bgcolor="#dddddd"> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">총 청구금액 <b>0원</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">정상금액 <b>0원</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">오류금액<b> <font color="red">0원</font></b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">수수료<b> 0원</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">지국송금액<b> 0원</b></td>
                </tr>
            </table>
            <!---button-->
            <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="clam_ocom_nav_id">
                <tr>
                    <td align="center" height="2"> <!--여백--> </td>
                </tr>
                <tr>
                    <td align="center" height="24" bgcolor="#E8E8E8"> <img src="/html/comm_img/bu_first01.gif" alt="10페이지 앞으로" width="17" height="15" border="0"> <img src="/html/comm_img/bu_prev01.gif" width="22" height="15"> <img src="/html/comm_img/bu_next01.gif" alt="다음페이지" width="22" height="15" border="0"> <img src="/html/comm_img/bu_end01.gif" alt="10페이지 뒤로" width="17" height="15" border="0"></td>
                </tr>
            </table></td>
    </tr>
</table>
<br>
<br>
<iframe name="ifrm" width="100%" height="0"></iframe>
</body>
</html>
