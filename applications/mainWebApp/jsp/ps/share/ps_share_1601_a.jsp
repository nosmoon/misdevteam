<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_share_1601_a.jsp
* 기능 : 정보공유 달력 초기 화면
* 작성일자 : 2004-03-08
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%

	String strYear = request.getParameter("change_year");
	String strMonth = request.getParameter("change_month");

	//달력객체 생성
	Calendar myCalendar = Calendar.getInstance();

	int year = 0;
	int month = 0;
	int previous_year = 0;
	int previous_month = 0;
	int next_year = 0;
	int next_month = 0;
	int day = 0;
	int id = 0;


	int t_year = 0;
	int t_month = 0;
	int t_day = 0;

	t_year = myCalendar.get(myCalendar.YEAR);
	t_month = myCalendar.get(myCalendar.MONTH)+1;
	t_day = myCalendar.get(myCalendar.DAY_OF_MONTH);

	if (strYear == null) {
		year = myCalendar.get(myCalendar.YEAR);
	} else {
		year = Integer.parseInt(strYear);
	}

	if(strMonth == null) {
		month = myCalendar.get(myCalendar.MONTH);
	} else {
		month = Integer.parseInt(strMonth) -1;
	}

	myCalendar.set(myCalendar.YEAR, year);
	myCalendar.set(myCalendar.MONTH, month);
	month = month + 1;

	previous_year = myCalendar.get(myCalendar.YEAR) - 1;
	previous_month = myCalendar.get(myCalendar.MONTH);

	if (previous_month < 1) {
		previous_month = 12;
	} else if(previous_month > 12) {
		previous_month = 1;
	}

	next_year = myCalendar.get(myCalendar.YEAR) + 1;
	next_month = myCalendar.get(myCalendar.MONTH) + 2;

	if (next_month < 1) {
		next_month = 12;
	} else if (next_month > 12) {
		next_month = 1;
	}

    String select_day = null;
	%>

<%--HTML 코드 시작--%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">

// 이벤트 핸들러 초기화
function jsInit(){
    setEventHandler();
}

// form 단위로 유효성을 검증한 예제
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 달로 이동
function move_month(change) {

    lo_form1= document.calendar_form;

    if(change=="pre") {
        if("<%=previous_month%>" == "12" ) {
            lo_form1.change_year.value = "<%=previous_year%>" ;
            lo_form1.change_month.value = "<%=previous_month%>";
        } else {
            lo_form1.change_year.value = "<%=year%>";
            lo_form1.change_month.value = "<%=previous_month%>";
        }
    } else if(change=="next") {
        if("<%=next_month%>" == "1" ) {
            lo_form1.change_year.value = "<%=next_year%>";
            lo_form1.change_month.value = "<%=next_month%>";
        } else {
            lo_form1.change_year.value = "<%=year%>";
            lo_form1.change_month.value = "<%=next_month%>";
        }
    }

    lo_form1.target = "_self";
    lo_form1.action = "/ps/share/1601";
    lo_form1.submit();
}

    // popup
    function pop_cal_src(select_day) {
        var lo_form1    = document.calendar_form;
        var ls_win      = "scrollbars=yes,toolbar=no,location=no,directories=no,width=500, height=300 resizable=no,mebar=no,left=140,top=50";
        window.open("about:blank" , "cal_pop", ls_win);

        lo_form1.select_day.value = select_day;

        lo_form1.target = "cal_pop";
        lo_form1.action = "/ps/share/1606";
        lo_form1.submit();
    }

</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" LEFTMARGIN="0" TOPMARGIN="0" MARGINWIDTH="0" MARGINHEIGHT="0" onload="jsInit();">
<%--FORM 태그 시작--%>
<form name="calendar_form" method="post" action="">
<input type="hidden" name="change_year" value="">
<input type="hidden" name="change_month" value="">
<input type="hidden" name="select_day" value="">

<table width="100%" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td valign="top" align="center"><br>


	<table width="830" border="0" cellpadding="0" cellspacing="0" valign ="top">
        <tr>
          <td rowspan=2> <img src="/html/comm_img/carlist_01.gif" width=161 height=42 alt=""></td>
          <td> <img src="/html/comm_img/carlist_02.gif" width=539 height=19 alt=""></td>
          <td> <img src="/html/comm_img/carlist_03.gif" width=130 height=19 alt=""></td>
        </tr>
        <tr>
          <td height="23" background="/html/comm_img/carlist_04.gif" align="center">
<input type="image" id="prev" src="/html/comm_img/bu_car01.gif" width="13" height="13" align="absmiddle" alt="이전달" border="0" onclick="javascript:move_month('pre');window.event.returnValue=false;">
            <b><font color="#FFFFFF"><%=year%>년 <%=month%>월</font></b>
<input type="image" id="next" src="/html/comm_img/bu_car02.gif" width="13" height="13" align="absmiddle" alt="다음달" border="0" onclick="javascript:move_month('next');window.event.returnValue=false;">
          </td>
          <td> <img src="/html/comm_img/carlist_05.gif" width=130 height=23 alt=""></td>
        </tr>
    </table>

	<table width="820" border="1" cellspacing="0" cellpadding="2" class="carlendar" bordercolor="#FFFFFF" bgcolor="#E8E9EB">
        <tr>
          <td bgcolor="#D54A82" height="25" align="center" width="117"><font color="#FFFFFF">일</font></td>
          <td height="25" bgcolor="#3A9646" align="center" width="117"><font color="#FFFFFF">월</font></td>
          <td height="25" align="center" bgcolor="#3A9646" width="117"><font color="#FFFFFF">화</font></td>
          <td height="25" align="center" bgcolor="#3A9646" width="117"><font color="#FFFFFF">수</font></td>
          <td height="25" align="center" bgcolor="#3A9646" width="117"><font color="#FFFFFF">목</font></td>
          <td height="25" align="center" bgcolor="#3A9646" width="117"><font color="#FFFFFF">금</font></td>
          <td height="25" align="center" bgcolor="#3A9646" width="117"><font color="#FFFFFF">토</font></td>
        </tr>
	<%
        PS_L_MONTH_SCHEDataSet ds = (PS_L_MONTH_SCHEDataSet)request.getAttribute("ds");


		while(true){
			day++;

			//날짜를 day 값으로 세팅
			myCalendar.set(myCalendar.DAY_OF_MONTH, day);

			//달력의 날짜가 다음달로 넘어가면 day 값이랑 달라짐
			if (day != myCalendar.get(myCalendar.DAY_OF_MONTH)) {
				break;
			}

			if (day == 1) {
				out.println("<tr align='right' valign='top'>");

				//요일 수만큼 빈칸 만들기
				for (int j = 1; j < myCalendar.get(myCalendar.DAY_OF_WEEK); j++) {
					out.print("<td width='117' height='0'>&nbsp;</td>");
				}
			}

			//요일이 일요일이면 빨간색으로 표시
			if (myCalendar.get(myCalendar.DAY_OF_WEEK) == myCalendar.SUNDAY) {
                select_day = year + Util.addZero(Integer.toString(month),2) + Util.addZero(Integer.toString(day),2);
                int today=myCalendar.get(myCalendar.DAY_OF_MONTH);

                if (t_year == year & t_month == month & t_day == day) {
%>
<td class="calendar" BACKGROUND="/html/comm_img/car_no4_<%=Util.addZero(Integer.toString(today),2)%>.gif" width="117" height="50" onclick="pop_cal_src('<%=select_day%>')" style="cursor:hand;">
<%
                } else {
%>
<td class="calendar" BACKGROUND="/html/comm_img/car_no3_<%=Util.addZero(Integer.toString(today),2)%>.gif" width="117" height="50" onclick="pop_cal_src('<%=select_day%>')" style="cursor:hand;">
<%
                }
%>
<table width="100%" border="0" cellspacing="0" cellpadding="1" >
<%@ include file="/jsp/ps/share/ps_share_1602_l.jsp" %>
</table>
</td>
<%
			//요일이 토요일이면 파란색으로 표시
			} else if (myCalendar.get(myCalendar.DAY_OF_WEEK) == myCalendar.SATURDAY) {
                select_day = year + Util.addZero(Integer.toString(month),2) + Util.addZero(Integer.toString(day),2);
                int today=myCalendar.get(myCalendar.DAY_OF_MONTH);

                if (t_year == year & t_month == month & t_day == day) {
%>
<td class="calendar" BACKGROUND="/html/comm_img/car_no4_<%=Util.addZero(Integer.toString(today),2)%>.gif" width="117" height="50" onclick="pop_cal_src('<%=select_day%>')" style="cursor:hand;">
<%
                } else {
%>
<td class="calendar" BACKGROUND="/html/comm_img/car_no2_<%=Util.addZero(Integer.toString(today),2)%>.gif" width="117" height="50" onclick="pop_cal_src('<%=select_day%>')" style="cursor:hand;">
<%
                }
%>
<table width="100%" border="0" cellspacing="0" cellpadding="1" >
<%@ include file="/jsp/ps/share/ps_share_1602_l.jsp" %>
</table>
</td>
<%

			} else if (t_year == year & t_month == month & t_day == day) {
				//오늘일 경우 폰트는 크고 색깔은 검은색으로
                select_day = year + Util.addZero(Integer.toString(month),2) + Util.addZero(Integer.toString(day),2);
                int today=myCalendar.get(myCalendar.DAY_OF_MONTH);
%>
<td class="calendar" BACKGROUND="/html/comm_img/car_no4_<%=Util.addZero(Integer.toString(today),2)%>.gif" width="117" height="50" onclick="pop_cal_src('<%=select_day%>')" style="cursor:hand;" >
<table width="100%" border="0" cellspacing="0" cellpadding="1" >
<%@ include file="/jsp/ps/share/ps_share_1602_l.jsp" %>
</table>
</td>
<%
			} else {
                select_day = year + Util.addZero(Integer.toString(month),2) + Util.addZero(Integer.toString(day),2);
                int today=myCalendar.get(myCalendar.DAY_OF_MONTH);

%>
<td class="calendar" BACKGROUND="/html/comm_img/car_no1_<%=Util.addZero(Integer.toString(today),2)%>.gif" width="117" height="50" onclick="pop_cal_src('<%=select_day%>')" style="cursor:hand;">
<table width="100%" border="0" cellspacing="0" cellpadding="1" onclick="pop_cal_src('<%=select_day%>')" style="cursor:hand;">
<%@ include file="/jsp/ps/share/ps_share_1602_l.jsp" %>
</table>
</td>
<%
			}
			//요일이 토요일이면 다음줄로 내림
			if (myCalendar.get(myCalendar.DAY_OF_WEEK) == myCalendar.SATURDAY) {
				out.println("</tr>");
				out.println("<tr align='right' valign='top'>");
			}
		}

		//마지막이 토요일로 끝나지 않았으면 줄을 닫아줌
		if (myCalendar.get(myCalendar.DAY_OF_WEEK) != myCalendar.SATURDAY){
			out.println("</tr>");
		}
	%>

	</table>


    </td>
  </tr>
</table>
</form>
</body>
</html>
