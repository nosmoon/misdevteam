<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_bil_1201_a.jsp
* 기능 : 일괄입금 초기화면
* 작성일자 : 2003-12-05
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    // dataset 인스턴스 선언 부분
    PS_S_BILL_SEPRDataSet ds=(PS_S_BILL_SEPRDataSet)request.getAttribute("ds"); //request dataset
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">

function jsinit(){
	setEventHandler();
}


// 수취일자로 리스트 조회
function list_search(startpage)
{
	var lo_form1 = document.acqdt_form;

    if(lo_form1.acqdt_1.value == '') {
        alert("수취일자를 입력해주세요.");
        lo_form1.acqdt_1.focus();
        return;
    } else if(lo_form1.acqdt_2.value == '') {
        alert("수취일자를 자동으로 같은 날짜로.");
        lo_form1.acqdt_2.value=lo_form1.acqdt_1.value;
    }

    if(window.event) window.event.returnValue = false;
	if(!validate(lo_form1)) return false;

	makeValue(lo_form1);

	// 시작일과 종료일을 비교
	if(!isValidDateBW(lo_form1,lo_form1.acqdt_1,lo_form1.acqdt_2)) {
		return false;
	}

    lo_form1.curr_page_no.value = startpage;
	lo_form1.action = "/ps/bill/1206";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 시작일과 종료일을 비교
function isValidDateBW(form,from,to) {

	if(from.value > to.value) {
		alert("시작일자가 종료일자보다 작아야 합니다.");
		from.value=<%=Util.getDate()%>;
		from.focus();
		return false;
	}
	if(to.value > <%=Util.getDate()%>) {
		alert("종료일자는 오늘 날짜 보다 커서는 안 됩니다.");
		to.value=<%=Util.getDate()%>;
		to.focus();
		return false;
	}
	return true;
}

// 수취일,수취번호,지로번호로 상세 목록 조회
function acqdt_detl_list(startpage,str1,str2,str3)
{
	var lo_form2 = document.acqdt_list_form;

	lo_form2.acqdt.value=str1;
	lo_form2.acqno.value=str2;
	lo_form2.girono.value=str3;
    lo_form2.curr_page_no.value = startpage;

    lo_form2.action = "/ps/bill/1211";
    lo_form2.target = "ifrm";
    lo_form2.submit();
}

// 페이지 이동
function page_move(curr_page_no) {
    var lo_form3 = document.acqdt_form;
//alert("curr_page_no=="+curr_page_no);

    if(!curr_page_no) {
        lo_form3.curr_page_no.value = '1';
    } else {
        lo_form3.curr_page_no.value = curr_page_no;
    }

    list_search(curr_page_no);
}

// 상세 목록 이동
function page_move_detl(curr_page_no) {
    var lo_form4 = document.acqdt_detl_form;
	var lo_form5 = document.acqdt_list_form;

//alert("curr_page_no=="+curr_page_no);

    if(!curr_page_no) {
        lo_form4.curr_page_no.value = '1';
    } else {
        lo_form4.curr_page_no.value = curr_page_no;
    }
    acqdt_detl_list(curr_page_no,lo_form5.acqdt.value,lo_form5.acqno.value,lo_form5.girono.value);
}

//OZ PRINT 설정
function print_list(){
    var lo_form1 = document.acqdt_list_form;
    var lo_form2 = document.acqdt_form;

    lo_form1.bocd.value=lo_form2.slt_bocd.value ;
    lo_form1.action = "/ps/bill/1216";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsinit();acqdt_form.acqdt_1.focus();">
<table width="100%" border="0" cellspacing="0" cellpadding="0" height="100%">
	<tr>
		<td valign="top" align="center">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td bgcolor="#797777" height="25" class="home"><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle"><b>수금
					&gt; </b>일괄입금</td>
				</tr>
				<tr>
					<td height="10">
					<!--내용을 위한 여백-->
					</td>
				</tr>
			</table>
			<table width="830" border="0" cellspacing="0" cellpadding="2">
				<form name="acqdt_form" method="post" action="" onSubmit="list_search(1)">
				<input name="curr_page_no" type="hidden" value ="1">
				<input name="records_per_page" type="hidden" value ="5">
				<input name="js_fn_nm" type="hidden" value ="page_move">
				<tr bgcolor="#EBE9DC">
					<td  class="title" width="80"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">수취일자 <font color="red">*</font></td>
					<td  class="title" width="200">
					<input type="text" name="acqdt_1" size="11" class="text_box" value="<%=Util.getDate()%>" datatype="date" notEmpty caption="수취일 시작일">
					-
					<input type="text" name="acqdt_2" size="11" class="text_box" value="<%=Util.getDate()%>" datatype="date" notEmpty caption="수취일 마감일">
					</td>
                    <td  class="title" width="80"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">처리지사
                    </td>
                    <td  class="title" width="120" bgcolor="#EBE9DC">
                    <select name="slt_bocd" size="1" class="sel_all">
                    <option value="ALL">전체</option>
                    <%=ds.intgbocdcurOptHtml("") %>
                    </select>
                    </td>
					<td  class="title" width="100"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">입금처리구분</td>
					<td  class="title" bgcolor="#EBE9DC">
					<select name="rcpmrflendyn" size="1" class="sel_all">
						<option value="ALL">전체</option>
						<option value="Y">입금완료</option>
                        <option value="N">미입금</option>
					</select>
					<input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" border="0" onclick="javascript:list_search(1)"  style="cursor:hand;" >
					</td>
				</tr>
				<tr>
					<td height="3" colspan="4">
					<!--여백-->
					</td>
				</tr>
				</form>
			</table>
			<!--리스트 -->
			<table  cellspacing="0" width="830" cellpadding="0" border="0" >
			<form name="acqdt_list_form" method="post" action="">
			<input name="curr_page_no" type="hidden" value ="1">
			<input name="records_per_page" type="hidden" value ="10">
			<input name="js_fn_nm" type="hidden" value ="page_move">
			<input type="hidden" name="acqdt" value="">
			<input type="hidden" name="acqno" value="">
			<input type="hidden" name="girono" value="">
            <input type="hidden" name="bocd" value="">
            <tr><td>
				<table  cellspacing="0" width="830" cellpadding="0" border="0"  id="acqdt_list">
					<tr><td>
						<table  cellspacing="0" width="830" cellpadding="1" border="0" class="gray" bgcolor="#ffffff">
							<tr align="center" bgcolor="#dddddd">
								<td width="90" class="gray" > 수취일자 </td>
								<td width="90" class="gray" > 수납건수 </td>
								<td width="160" class="gray" > 수납금액 </td>
								<td width="90" class="gray" > 정상건수 </td>
								<td width="90" class="gray" > 오류건수 </td>
								<td width="130" class="gray" > 오류금액 </td>
								<td width="90" class="gray" > 입금처리구분 </td>
								<td width="90" class="gray" > 입금일자 </td>
							</tr>
							<tr>
								<td width="90" class="gray" align="center" > &nbsp; </td>
								<td width="90" class="gray" align="right" >  &nbsp; </td>
								<td width="160" class="gray" align="right" >  &nbsp; </td>
								<td width="90" class="gray" align="right" >  &nbsp; </td>
								<td width="90" class="gray" align="right" >  &nbsp; </td>
								<td width="130" class="gray" align="right" >  &nbsp; </td>
								<td width="90" class="gray" >  &nbsp;  </td>
								<td width="90" class="gray" align="center" >  &nbsp; </td>
							</tr>
							<tr>
								<td width="90" class="gray" align="center" >  &nbsp; </td>
								<td width="90" class="gray" align="right" >  &nbsp; </td>
								<td width="160" class="gray" align="right" >  &nbsp; </td>
								<td width="90" class="gray" align="right" >  &nbsp; </td>
								<td width="90" class="gray" align="right" >  &nbsp;  </td>
								<td width="130" class="gray" align="right" >  &nbsp; </td>
								<td width="90" class="gray" >  &nbsp;  </td>
								<td width="90" class="gray" align="center" >  &nbsp;  </td>
							</tr>
							<tr>
								<td width="90" class="gray" align="center" >  &nbsp; </td>
								<td width="90" class="gray" align="right" >  &nbsp; </td>
								<td width="160" class="gray" align="right" >  &nbsp; </td>
								<td width="90" class="gray" align="right" >  &nbsp; </td>
								<td width="90" class="gray" align="right" >  &nbsp;  </td>
								<td width="130" class="gray" align="right" >  &nbsp; </td>
								<td width="90" class="gray" >  &nbsp;  </td>
								<td width="90" class="gray" align="center" >  &nbsp;  </td>
							</tr>
							<tr>
								<td width="90" class="gray" align="center" >  &nbsp; </td>
								<td width="90" class="gray" align="right" >  &nbsp; </td>
								<td width="160" class="gray" align="right" >  &nbsp; </td>
								<td width="90" class="gray" align="right" >  &nbsp; </td>
								<td width="90" class="gray" align="right" >  &nbsp;  </td>
								<td width="130" class="gray" align="right" >  &nbsp; </td>
								<td width="90" class="gray" >  &nbsp;  </td>
								<td width="90" class="gray" align="center" >  &nbsp;  </td>
							</tr>
							<tr>
								<td width="90" class="gray" align="center" >  &nbsp; </td>
								<td width="90" class="gray" align="right" >  &nbsp; </td>
								<td width="160" class="gray" align="right" >  &nbsp; </td>
								<td width="90" class="gray" align="right" >  &nbsp; </td>
								<td width="90" class="gray" align="right" >  &nbsp;  </td>
								<td width="130" class="gray" align="right" >  &nbsp; </td>
								<td width="90" class="gray" >  &nbsp;  </td>
								<td width="90" class="gray" align="center" >  &nbsp;  </td>
							</tr>
						</table>
					</td></tr>
					<tr><td>
						<!---button-->
						<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
							<tr>
								<td align="center" height="2">
								<!--여백-->
								</td>
							</tr>
							<tr height="24">
								<td align="center" height="24" bgcolor="#E8E8E8">
								<!--JSP PAGE START---------------------------------------------------------------------------------->
								<jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
								<jsp:param name = "curr_page_no" 		value="0"/>
								<jsp:param name = "total_records" 	value="0"/>
								<jsp:param name = "js_fn_nm" 			value="page_move"/>
								<jsp:param name = "records_per_page" 	value="5"/>
								<jsp:param name = "page_set_gubun" 	value="0"/>
								</jsp:include>

								<!--JSP PAGE END------------------------------------------------------------------------------------>
								</td>
							</tr>
						</table>

					</td></tr>
				</table>
			</td></tr>
   			</form>
        <tr>
            <td height="10" colspan="2">
            <!--여백-->
            </td>
        </tr>
			<tr><td>
			<!--리스트 끝 -->

			<!--검색 -->
			<table  cellspacing="0" width="830" cellpadding="1" border="0">
				<tr><td>
				<form name="acqdt_detl_form" method="post" action="">
				<input name="curr_page_no" type="hidden" value ="1">
				<input name="records_per_page" type="hidden" value ="10">
				<input name="js_fn_nm" type="hidden" value ="page_move_detl">
				<table width="830" border="0" cellspacing="0" cellpadding="0" id="acqdt_detl_list">
					<tr><td>
						<table width="830" border="0" cellspacing="0" cellpadding="2">
							<tr>
								<td bgcolor="#EBE9DC" class="title"><b>상세목록</b></td>
								<td bgcolor="#EBE9DC" class="title" width="60" align="right"> <img src="/html/comm_img/bu_print.gif" width="39" height="19" border="0" align="absmiddle" onclick="print_list();window.event.returnValue=false; " style="cursor:hand">
								</td>
							</tr>
							<tr>
								<td height="3" colspan="2">
								<!--여백-->
								</td>
							</tr>
						</table>
					</td></tr>
					<tr><td>
					<!--리스트 -->
						<table  cellspacing="0" width="830" class="gray" cellpadding="1" border="0" bgcolor="#FFFFFF">
							<tr bgcolor="#dddddd" align="center">
                                <td width="80" class="gray" > 처리지사</td>
                                <td width="130" class="gray" > 독자번호</td>
                                <td width="80" class="gray" > 성명</td>
                                <td width="80" class="gray" > 구독매체</td>
                                <td width="80" class="gray" > 입금금액</td>
                                <td width="80" class="gray" > 수납점</td>
                                <td width="80" class="gray" > 수납일자</td>
                                <td width="80" class="gray" > 입금반영여부 </td>
                                <td width="180" class="gray" > 비고</td>
							</tr>
							<tr>
								<td   class="gray" > &nbsp; </td>
                                <td   class="gray" > &nbsp; </td>
								<td   class="gray" > &nbsp; </td>
								<td   class="gray" >&nbsp; </td>
								<td   class="gray" align="right" >&nbsp;</td>
								<td   class="gray" align="right" > &nbsp;</td>
								<td   class="gray" align="center" > &nbsp; </td>
								<td   class="gray" > &nbsp;</td>
								<td   class="gray" >&nbsp;</td>
							</tr>
							<tr>
								<td   class="gray" > &nbsp; </td>
                                <td   class="gray" > &nbsp; </td>
								<td   class="gray" > &nbsp; </td>
								<td   class="gray" >&nbsp; </td>
								<td   class="gray" align="right" >&nbsp;</td>
								<td   class="gray" align="right" > &nbsp;</td>
								<td   class="gray" align="center" > &nbsp; </td>
								<td   class="gray" > &nbsp;</td>
								<td   class="gray" >&nbsp;</td>
							</tr>
							<tr>
								<td   class="gray" > &nbsp; </td>
                                <td   class="gray" > &nbsp; </td>
								<td   class="gray" > &nbsp; </td>
								<td   class="gray" >&nbsp; </td>
								<td   class="gray" align="right" >&nbsp;</td>
								<td   class="gray" align="right" > &nbsp;</td>
								<td   class="gray" align="center" > &nbsp; </td>
								<td   class="gray" > &nbsp;</td>
								<td   class="gray" >&nbsp;</td>
							</tr>
							<tr>
								<td   class="gray" > &nbsp; </td>
                                <td   class="gray" > &nbsp; </td>
								<td   class="gray" > &nbsp; </td>
								<td   class="gray" >&nbsp; </td>
								<td   class="gray" align="right" >&nbsp;</td>
								<td   class="gray" align="right" > &nbsp;</td>
								<td   class="gray" align="center" > &nbsp; </td>
								<td   class="gray" > &nbsp;</td>
								<td   class="gray" >&nbsp;</td>
							</tr>
							<tr>
								<td   class="gray" > &nbsp; </td>
                                <td   class="gray" > &nbsp; </td>
								<td   class="gray" > &nbsp; </td>
								<td   class="gray" >&nbsp; </td>
								<td   class="gray" align="right" >&nbsp;</td>
								<td   class="gray" align="right" > &nbsp;</td>
								<td   class="gray" align="center" > &nbsp; </td>
								<td   class="gray" > &nbsp;</td>
								<td   class="gray" >&nbsp;</td>
							</tr>
							<tr>
								<td   class="gray" > &nbsp; </td>
                                <td   class="gray" > &nbsp; </td>
								<td   class="gray" > &nbsp; </td>
								<td   class="gray" >&nbsp; </td>
								<td   class="gray" align="right" >&nbsp;</td>
								<td   class="gray" align="right" > &nbsp;</td>
								<td   class="gray" align="center" > &nbsp; </td>
								<td   class="gray" > &nbsp;</td>
								<td   class="gray" >&nbsp;</td>
							</tr>
							<tr>
								<td   class="gray" > &nbsp; </td>
                                <td   class="gray" > &nbsp; </td>
								<td   class="gray" > &nbsp; </td>
								<td   class="gray" >&nbsp; </td>
								<td   class="gray" align="right" >&nbsp;</td>
								<td   class="gray" align="right" > &nbsp;</td>
								<td   class="gray" align="center" > &nbsp; </td>
								<td   class="gray" > &nbsp;</td>
								<td   class="gray" >&nbsp;</td>
							</tr>
							<tr>
								<td   class="gray" > &nbsp; </td>
                                <td   class="gray" > &nbsp; </td>
								<td   class="gray" > &nbsp; </td>
								<td   class="gray" >&nbsp; </td>
								<td   class="gray" align="right" >&nbsp;</td>
								<td   class="gray" align="right" > &nbsp;</td>
								<td   class="gray" align="center" > &nbsp; </td>
								<td   class="gray" > &nbsp;</td>
								<td   class="gray" >&nbsp;</td>
							</tr>
							<tr>
								<td   class="gray" > &nbsp; </td>
                                <td   class="gray" > &nbsp; </td>
								<td   class="gray" > &nbsp; </td>
								<td   class="gray" >&nbsp; </td>
								<td   class="gray" align="right" >&nbsp;</td>
								<td   class="gray" align="right" > &nbsp;</td>
								<td   class="gray" align="center" > &nbsp; </td>
								<td   class="gray" > &nbsp;</td>
								<td   class="gray" >&nbsp;</td>
							</tr>
							<tr>
								<td   class="gray" > &nbsp; </td>
                                <td   class="gray" > &nbsp; </td>
								<td   class="gray" > &nbsp; </td>
								<td   class="gray" >&nbsp; </td>
								<td   class="gray" align="right" >&nbsp;</td>
								<td   class="gray" align="right" > &nbsp;</td>
								<td   class="gray" align="center" > &nbsp; </td>
								<td   class="gray" > &nbsp;</td>
								<td   class="gray" >&nbsp;</td>
							</tr>
						</table>
					</td></tr>
					<tr><td>
						<!---button-->
						<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
						<tr>
							<td align="center" height="2">
							<!--여백-->
							</td>
						</tr>
						<tr>
							<td align="center" height="24" bgcolor="#E8E8E8">
							<!--JSP PAGE START---------------------------------------------------------------------------------->
							<%
							String curr_page_no = request.getParameter("curr_page_no");
							String js_fn_nm = request.getParameter("js_fn_nm");
							%>
							<!--JSP PAGE START---------------------------------------------------------------------------------->
							<jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
							<jsp:param name = "curr_page_no" 		value="0"/>
							<jsp:param name = "total_records" 	value="0"/>
							<jsp:param name = "js_fn_nm" 			value="page_move_detl"/>
							<jsp:param name = "records_per_page" 	value="10"/>
							<jsp:param name = "page_set_gubun" 	value="0"/>
							</jsp:include>
							<!--JSP PAGE END------------------------------------------------------------------------------------>
							</td>
						</tr>
						</table>

					</td></tr>
				</table>
				</form>
			</td></tr>
			</table>

		</td></tr>
		</table>

	<br>
	<br>
	</td></tr>
</table>

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=830 height=0></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

</body>
</html>