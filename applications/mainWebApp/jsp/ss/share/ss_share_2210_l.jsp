<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_2210_l.jsp
* ��� : �Ǹű�����-�޷�-��������
* �ۼ����� : 2004-04-22
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
	SS_L_MONTH_SCHEDataSet ds = (SS_L_MONTH_SCHEDataSet)request.getAttribute("ds");
	    
	String strYear = request.getParameter("change_year");
	String strMonth = request.getParameter("change_month");
		
	String selected = new String();
			
	//�޷°�ü ����
	Calendar myCalendar = Calendar.getInstance();
	
	int year = 0;
	int month = 0;
	int previous_year = 0;
	int previous_month = 0;
	int next_year = 0;
	int next_month = 0;
	int day = 0;
		
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
%>
<html>
<head>
<title>�Ǹű��������� �ý���</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// �̺�Ʈ �ڵ鷯 �ʱ�ȭ
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
}

// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// �� �̵�
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
    
	// ���̵� �������� ������.
	lo_form1.target = "_self";
    lo_form1.action = "/ss/share/2210";
    check_all(lo_form1);
    lo_form1.submit();
    
}

//popup ����
function pop_cal_src(yyyymmdd) {
    var lo_form1    = document.calendar_form;

    var ls_win      = "scrollbars=yes,toolbar=no,location=no,directories=no,width=600, height=300 resizable=no,mebar=no,left=140,top=50";
    window.open("about:blank" , "cal_pop", ls_win);

    lo_form1.yyyymmdd.value = yyyymmdd;

    lo_form1.target = "cal_pop";
    lo_form1.action = "/ss/share/2212";
    lo_form1.submit();
}

-->
</script>
</head>
<body bgcolor="#DEDEDE" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">
      <!---ī���ٽ���-->
      <table width=190 border=0 cellpadding=0 cellspacing=0>
		<form name="calendar_form" method="post" action="">
		  <input type="hidden" name="change_year" value="">
		  <input type="hidden" name="change_month" value="">
		  <input type="hidden" name="select_day" value="">
		  <input type="hidden" name="yyyymmdd" value="">
      
        <tr> 
          <td width=2> <img src="/html/comm_img/car_01.gif" width=2 height=3 ></td>
          <td background="/html/comm_img/car_02.gif"></td>
          <td> <img src="/html/comm_img/car_03.gif" width=2 height=3 ></td>
        </tr>
        <tr> 
          <td width=2> <img src="/html/comm_img/car_04.gif" width=2 height=23 ></td>
          <td background="/html/comm_img/car_05.gif" align="center">
          	<input type="image" id="cal_prev" src="/html/comm_img/bu_car01.gif" width="13" height="13" align="absmiddle" alt="������" border="0" onclick="javascript:move_month('pre');window.event.returnValue=false;">
            <b><font color="#FFFFFF"><%= year %>�� <%= month %>��</font></b>
			<input type="image" id="cal_next" src="/html/comm_img/bu_car02.gif" width="13" height="13" align="absmiddle" alt="������" border="0" onclick="javascript:move_month('next');window.event.returnValue=false;">            
            </td>
          <td><img src="/html/comm_img/car_06.gif" width=2 height=23 ></td>
        </tr>
        <tr> 
          <td width=2><img src="/html/comm_img/car_07.gif" width=2 height=7 ></td>
          <td background="/html/comm_img/car_08.gif"></td>
          <td> <img src="/html/comm_img/car_09.gif" width=2 height=7 ></td>
        </tr>
      </table>
      <table width="190" border="1" cellspacing="0" cellpadding="0" class="carlendar" bordercolor="#FFFFFF">
        <tr align="center" bgcolor="#3A5696"> 
          <td bgcolor="#D54A82" height="20"><font color="#FFFFFF">��</font></td>
          <td height="20"><font color="#FFFFFF">��</font></td>
          <td height="20"><font color="#FFFFFF">ȭ</font></td>
          <td height="20"><font color="#FFFFFF">��</font></td>
          <td height="20"><font color="#FFFFFF">��</font></td>
          <td height="20"><font color="#FFFFFF">��</font></td>
          <td height="20"><font color="#FFFFFF">��</font></td>
        </tr>
	<%
		boolean day01_sche_check = false;
		boolean day02_sche_check = false;
		boolean day03_sche_check = false;
		boolean day04_sche_check = false;
		boolean day05_sche_check = false;
		boolean day06_sche_check = false;
		boolean day07_sche_check = false;
		boolean day08_sche_check = false;
		boolean day09_sche_check = false;
		boolean day10_sche_check = false;
		boolean day11_sche_check = false;
		boolean day12_sche_check = false;
		boolean day13_sche_check = false;
		boolean day14_sche_check = false;
		boolean day15_sche_check = false;
		boolean day16_sche_check = false;
		boolean day17_sche_check = false;
		boolean day18_sche_check = false;
		boolean day19_sche_check = false;
		boolean day20_sche_check = false;
		boolean day21_sche_check = false;
		boolean day22_sche_check = false;
		boolean day23_sche_check = false;
		boolean day24_sche_check = false;
		boolean day25_sche_check = false;
		boolean day26_sche_check = false;
		boolean day27_sche_check = false;
		boolean day28_sche_check = false;
		boolean day29_sche_check = false;
		boolean day30_sche_check = false;
		boolean day31_sche_check = false;
		
		if(ds.day01schecur.size() > 0){ day01_sche_check = true; }
		if(ds.day02schecur.size() > 0){ day02_sche_check = true; }
		if(ds.day03schecur.size() > 0){ day03_sche_check = true; }
		if(ds.day04schecur.size() > 0){ day04_sche_check = true; }
		if(ds.day05schecur.size() > 0){ day05_sche_check = true; }
		if(ds.day06schecur.size() > 0){ day06_sche_check = true; }
		if(ds.day07schecur.size() > 0){ day07_sche_check = true; }
		if(ds.day08schecur.size() > 0){ day08_sche_check = true; }
		if(ds.day09schecur.size() > 0){ day09_sche_check = true; }
		if(ds.day10schecur.size() > 0){ day10_sche_check = true; }
		if(ds.day11schecur.size() > 0){ day11_sche_check = true; }
		if(ds.day12schecur.size() > 0){ day12_sche_check = true; }
		if(ds.day13schecur.size() > 0){ day13_sche_check = true; }
		if(ds.day14schecur.size() > 0){ day14_sche_check = true; }
		if(ds.day15schecur.size() > 0){ day15_sche_check = true; }
		if(ds.day16schecur.size() > 0){ day16_sche_check = true; }
		if(ds.day17schecur.size() > 0){ day17_sche_check = true; }
		if(ds.day18schecur.size() > 0){ day18_sche_check = true; }
		if(ds.day19schecur.size() > 0){ day19_sche_check = true; }
		if(ds.day20schecur.size() > 0){ day20_sche_check = true; }
		if(ds.day21schecur.size() > 0){ day21_sche_check = true; }
		if(ds.day22schecur.size() > 0){ day22_sche_check = true; }
		if(ds.day23schecur.size() > 0){ day23_sche_check = true; }
		if(ds.day24schecur.size() > 0){ day24_sche_check = true; }
		if(ds.day25schecur.size() > 0){ day25_sche_check = true; }
		if(ds.day26schecur.size() > 0){ day26_sche_check = true; }
		if(ds.day27schecur.size() > 0){ day27_sche_check = true; }
		if(ds.day28schecur.size() > 0){ day28_sche_check = true; }
		if(ds.day29schecur.size() > 0){ day29_sche_check = true; }
		if(ds.day30schecur.size() > 0){ day30_sche_check = true; }
		if(ds.day31schecur.size() > 0){ day31_sche_check = true; }
		
		while(true){
			day++;
			
			//��¥�� day ������ ����
			myCalendar.set(myCalendar.DAY_OF_MONTH, day);
			
			//�޷��� ��¥�� �����޷� �Ѿ�� day ���̶� �޶���
			if (day != myCalendar.get(myCalendar.DAY_OF_MONTH)) {
				break;
			}
			
			if (day == 1) {
				out.println("<tr align='center' bgcolor='#E8E9EB'>");
				
				//���� ����ŭ ��ĭ �����
				for (int j = 1; j < myCalendar.get(myCalendar.DAY_OF_WEEK); j++) {
					out.print("<td>&nbsp;</td>");
				}
			}
			
			String day_str = null;
			String month_str = null;
			
			//��¥ ��ȯ
			if(day >= 1 && day <= 9){
				day_str = "0"+day;
			}else{
				day_str = Integer.toString(day);
			}
			
			
			//�� ��ȯ
			if(month >= 1 && month <= 9){
				month_str = "0"+month;
			}else{
				month_str = Integer.toString(month);
			}
			
			boolean day_sche_check = false;

			switch (day) {
			    case  1 :
			                if(day01_sche_check){ day_sche_check = true;}
			                break;
			    case  2 :
			                if(day02_sche_check){ day_sche_check = true;}
			                break;
			    case  3 :
			                if(day03_sche_check){ day_sche_check = true;}
			                break;
			    case  4 :
			                if(day04_sche_check){ day_sche_check = true;}
			                break;
			    case  5 :
			                if(day05_sche_check){ day_sche_check = true;}
			                break;
			    case  6 :
			                if(day06_sche_check){ day_sche_check = true;}
			                break;
			    case  7 :
			                if(day07_sche_check){ day_sche_check = true;}
			                break;
			    case  8 :
			                if(day08_sche_check){ day_sche_check = true;}
			                break;
			    case  9 :
			                if(day09_sche_check){ day_sche_check = true;}
			                break;
			    case 10 :
			                if(day10_sche_check){ day_sche_check = true;}
			                break;
			    case 11 :
			                if(day11_sche_check){ day_sche_check = true;}
			                break;
			    case 12 :
			                if(day12_sche_check){ day_sche_check = true;}
			                break;
			    case 13 :
			                if(day13_sche_check){ day_sche_check = true;}
			                break;
			    case 14 :
			                if(day14_sche_check){ day_sche_check = true;}
			                break;
			    case 15 :
			                if(day15_sche_check){ day_sche_check = true;}
			                break;
			    case 16 :
			                if(day16_sche_check){ day_sche_check = true;}
			                break;
			    case 17 :
			                if(day17_sche_check){ day_sche_check = true;}
			                break;
			    case 18 :
			                if(day18_sche_check){ day_sche_check = true;}
			                break;
			    case 19 :
			                if(day19_sche_check){ day_sche_check = true;}
			                break;
			    case 20 :
			                if(day20_sche_check){ day_sche_check = true;}
			                break;
			    case 21 :
			                if(day21_sche_check){ day_sche_check = true;}
			                break;
			    case 22 :
			                if(day22_sche_check){ day_sche_check = true;}
			                break;
			    case 23 :
			                if(day23_sche_check){ day_sche_check = true;}
			                break;
			    case 24 :
			                if(day24_sche_check){ day_sche_check = true;}
			                break;
			    case 25 :
			                if(day25_sche_check){ day_sche_check = true;}
			                break;
			    case 26 :
			                if(day26_sche_check){ day_sche_check = true;}
			                break;
			    case 27 :
			                if(day27_sche_check){ day_sche_check = true;}
			                break;
			    case 28 :
			                if(day28_sche_check){ day_sche_check = true;}
			                break;
			    case 29 :
			                if(day29_sche_check){ day_sche_check = true;}
			                break;
			    case 30 :
			                if(day30_sche_check){ day_sche_check = true;}
			                break;
			    case 31 :
			                if(day31_sche_check){ day_sche_check = true;}
			                break;
			    default :
							break;
			}		
			
			out.println("<td>");
			
			//������ ��ϵǾ� �ִ� ���(��Ʈ ũ��)
			if(day_sche_check){
				out.println("<a onClick='pop_cal_src("+year+month_str+day_str+");' style='cursor:hand;'>");
			
				//�Ͽ���
				if (myCalendar.get(myCalendar.DAY_OF_WEEK) == myCalendar.SUNDAY) {
					if (t_year == year & t_month == month & t_day == day) {
						//������ ��� ��Ʈ�� ũ�� ������ ��ȫ������				
						out.println("<font color=#EE7EAD><b>");
						out.println(myCalendar.get(myCalendar.DAY_OF_MONTH));
						out.println("</b></font>");
					}else{
						out.println("<font color=red><b>");
						out.println(myCalendar.get(myCalendar.DAY_OF_MONTH));
						out.println("</b></font>");
					}
				//������	
				} else if (myCalendar.get(myCalendar.DAY_OF_WEEK) == myCalendar.SATURDAY) {
					if (t_year == year & t_month == month & t_day == day) {
						//������ ��� ��Ʈ�� ũ�� ������ ��ȫ������				
						out.println("<font color=#EE7EAD><b>");
						out.println(myCalendar.get(myCalendar.DAY_OF_MONTH));
						out.println("</b></font>");
					}else{
						//������ ������̸� �Ķ������� ǥ��					
						out.println("<font color=blue><b>");
						out.println(myCalendar.get(myCalendar.DAY_OF_MONTH));
						out.println("</b></font>");
					}	
				//����													
				} else if (t_year == year & t_month == month & t_day == day) {
					//������ ��� ��Ʈ�� ũ�� ������ ��ȫ������				
					out.println("<font color=#EE7EAD><b>");
					out.println(myCalendar.get(myCalendar.DAY_OF_MONTH));
					out.println("</b></font>");
				
				} else {
					out.println("<b>"+myCalendar.get(myCalendar.DAY_OF_MONTH)+"</b>");
				}
				
				out.println("</a></td>");
			//������ ��ϵǾ� ���� ���� ���(��Ʈ �۰�)
			}else{
				//�Ͽ���
				if (myCalendar.get(myCalendar.DAY_OF_WEEK) == myCalendar.SUNDAY) {
					if (t_year == year & t_month == month & t_day == day) {
						//������ ��� ��Ʈ�� �۰� ������ ��ȫ������				
						out.println("<font color=#EE7EAD>");
						out.println(myCalendar.get(myCalendar.DAY_OF_MONTH));
						out.println("</font>");
					}else{
						out.println("<font color=red>");
						out.println(myCalendar.get(myCalendar.DAY_OF_MONTH));
						out.println("</font>");
					}
				//�����	
				} else if (myCalendar.get(myCalendar.DAY_OF_WEEK) == myCalendar.SATURDAY) {
					if (t_year == year & t_month == month & t_day == day) {
						//������ ��� ��Ʈ�� �۰� ������ ��ȫ������				
						out.println("<font color=#EE7EAD>");
						out.println(myCalendar.get(myCalendar.DAY_OF_MONTH));
						out.println("</font>");
					}else{
						//������ ������̸� �Ķ������� ǥ��					
						out.println("<font color=blue>");
						out.println(myCalendar.get(myCalendar.DAY_OF_MONTH));
						out.println("</font>");
					}
				//����	
				} else if (t_year == year & t_month == month & t_day == day) {
					//������ ��� ��Ʈ�� �۰� ������ ��ȫ������				
					out.println("<font color=#EE7EAD>");
					out.println(myCalendar.get(myCalendar.DAY_OF_MONTH));
					out.println("</font>");
				
				} else {
					out.println(myCalendar.get(myCalendar.DAY_OF_MONTH));
				}
			
				out.println("</td>");
			}
			
			//������ ������̸� �����ٷ� ����
			if (myCalendar.get(myCalendar.DAY_OF_WEEK) == myCalendar.SATURDAY) {
				out.println("</tr>");
				out.println("<tr align='center' bgcolor='#E8E9EB'>");
			}
		}
		
		
		//�������� ����Ϸ� ������ �ʾ����� ���� �ݾ���
		if (myCalendar.get(myCalendar.DAY_OF_WEEK) != myCalendar.SATURDAY){
			out.println("</tr>");
		}
		
	%>        
      </form>        
      </table>
      <!---ī���ٳ�-->
</body>
</html>      
