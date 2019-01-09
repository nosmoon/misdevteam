<%@ page contentType="text/html; charset=KSC5601"%>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.duty.rec.*
	,	chosun.ciis.hd.duty.ds.*
	,	somo.framework.util.*;
	"
%>
<%

String cmpycd = (String)session.getAttribute("BLNG_CMPY_CD") == null ? "" : (String)session.getAttribute("BLNG_CMPY_CD");		// 회사
String emp_no = (String)session.getAttribute("EMPNO") == null ? "" : (String)session.getAttribute("EMPNO");						// 사번
String today  = "";  
String last_week = "";
String week_cls1 = "";
String week_cls2 = "";


//----------test-----------
//cmpycd = "100";
//emp_no = "202029";
//----------test-----------


//세션없을 시 로그인으I로
if(cmpycd.equals("")){
	response.sendRedirect("/");
}

today     = Util.getDate();
week_cls1 = (request.getParameter("basi_dt").equals(today) ? "active" : "");
week_cls2 = (!request.getParameter("basi_dt").equals(today) ? "active" : "");
last_week = Util.addDate(request.getParameter("basi_dt"), -7);
%>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
        <title>조선 - 인트라넷</title>
        <meta name="author" content="IT조선">
        <script type="text/javascript" src="http://news.chosun.com/realty/resources/js/jquery-1.11.0.min.js"></script>
        <link rel="stylesheet" href="http://news.chosun.com/cs_intranet/m/c_intranet.css?d=20180706">
	<link rel="apple-touch-icon-precomposed" href="http://m.chosun.com/images/apple-touch-icon.png">        
    </head>
<body>
    <div id="wrapper" class="wt2_wrap">
        <div id="header">
            <h1 class="logo"><a href="#"><img src="http://m.chosun.com/img/mcsg_tit_logo.png" alt="조선일보"></a></h1>
        </div>

        <div class="pop_cont">
            <div class="p_cont_top">
                <h2>금주 근무시간</h2>
                <!--a href="javascript:history.back()" class="close"><img src="http://image.chosun.com/img/intranet//close.png" alt="뒤로가기"></a-->
                <a href="/jsp/hd/duty/working_time_m.jsp" class="close"><img src="http://image.chosun.com/img/intranet/close.png" alt="뒤로가기"></a>
            </div>
            <div class="time_table">
                <div class="cate_btn">
                    <div class="p_left">
                        <a href="#" onclick="chk_show(this); return false;" class="edit_btn" style="display: inline;">삭제</a>
                        <input type="checkbox" name="" value="" id="select_all">
                        <label for="select_all" class="select_all" style="display: none;">전체선택</label>
                    </div>
		    <div class="p_right">
                        <ul>
                            <li class="<%=week_cls1%>"><a href="/hd/duty/1001001?basi_dt=<%=Util.getDate()%>&emp_no=<%=emp_no%>&clsf=M">금주</a></li>
                            <li class="<%=week_cls2%>"><a href="/hd/duty/1001001?basi_dt=<%=last_week%>&emp_no=<%=emp_no%>&clsf=M">지난주</a></li>
                        </ul>
                    </div>
                </div>
                <table class="wt_table">
                    <thead>
                        <tr>
                            <th></th>
                            <th scope="col">날짜</th>
                            <th scope="col">출근</th>
                            <th scope="col">퇴근</th>
                            <th scope="col">휴게</th>
                            <th scope="col">비고</th>
                            <th scope="col">근무시간</th>
                        </tr>
                    </thead>
                    <tbody>
<%
	HD_DUTY_WORK_1001_LDataSet ds = (HD_DUTY_WORK_1001_LDataSet)request.getAttribute("ds");	            	
	String str_style = "";
	String str_disabled = "";            		
	
	for(int i = 0; i < ds.curlist.size(); i++) {
		HD_DUTY_WORK_1001_LCURLISTRecord rec = (HD_DUTY_WORK_1001_LCURLISTRecord)ds.curlist.get(i);		
		str_style = (i==0) ? "" : "";

		//진행상태에 따른 삭제여부
		if(rec.proc_stat != null && rec.proc_stat != "") {
			str_disabled = (Integer.parseInt(rec.proc_stat) >= 14 ) ? "disabled" : "";
		} else {
			str_disabled = "";
		}
%>
                        <tr>
                            <td class="chk_area">
                                <label for="chk_sel<%=i%>" class="icon"><img src="http://news.chosun.com/test_2010/saladin_test/images/chk_off.gif" alt=""></label>
                                <input type="checkbox" name="chk_art[]" id="chk_sel<%=i%>" class="wt_chk" value="<%=rec.duty_dt %>" <%=str_disabled%>>
                            </td>
                            <td><%=rec.clndr_dt.replace(" ","<br>")%></td>
                            <td><%=rec.prsnt_tm%></td>
                            <td><%=rec.finish_tm%></td>
                            <td><%=rec.rest_tm %></td>
                            <td><%=rec.duty_clsf_nm %></td>
                            <td>
                            	<strong><%=rec.duty_tm %></strong>
                            	<input type="hidden" id="duty_dt" name="duty_dt" value="<%=rec.duty_dt %>">
								<input type="hidden" id="proc_stat" name="proc_stat" value="<%=rec.proc_stat %>">
                            </td>
                        </tr>		                        
<%
	}
%>
<!--
                     
                        <tr>
                            <td class="chk_area">
                                <label for="chk_sel10" class="icon"><img src="http://news.chosun.com/test_2010/saladin_test/images/chk_off.gif" alt=""></label>
                                <input type="checkbox" name="chk_art[]" value="" id="chk_sel10" class="wt_chk">
                            </td>
                            <td>
                                6월10일<br>
                                (일)
                            </td>
                            <td>09:00</td>
                            <td>18:00</td>
                            <td>01:00</td>
                            <td>-</td>
                            <td><strong>9시간</strong></td>
                        </tr>
                        <tr>
                            <td class="chk_area">
                                <label for="chk_sel11" class="icon"><img src="http://news.chosun.com/test_2010/saladin_test/images/chk_off.gif" alt=""></label>
                                <input type="checkbox" name="chk_art[]" value="" id="chk_sel11" class="wt_chk">
                            </td>
                            <td>
                                6월10일<br>
                                (월)
                            </td>
                            <td>09:00</td>
                            <td>18:00</td>
                            <td>01:00</td>
                            <td>-</td>
                            <td><strong>9시간</strong></td>
                        </tr>                        
                        <tr>
                            <td class="chk_area">
                                <label for="chk_sel10" class="icon"><img src="http://news.chosun.com/test_2010/saladin_test/images/chk_off.gif" alt=""></label>
                                <input type="checkbox" name="chk_art[]" value="" id="chk_sel10" class="wt_chk">
                            </td>
                            <td>
                                6월10일<br>
                                (화)
                            </td>
                            <td>09:00</td>
                            <td>18:00</td>
                            <td>01:00</td>
                            <td>-</td>
                            <td><strong>9시간</strong></td>
                        </tr>
                        <tr>
                            <td class="chk_area">
                                <label for="chk_sel11" class="icon"><img src="http://news.chosun.com/test_2010/saladin_test/images/chk_off.gif" alt=""></label>
                                <input type="checkbox" name="chk_art[]" value="" id="chk_sel11" class="wt_chk">
                            </td>
                            <td>
                                6월10일<br>
                                (수)
                            </td>
                            <td>09:00</td>
                            <td>18:00</td>
                            <td>01:00</td>
                            <td>-</td>
                            <td><strong>9시간</strong></td>
                        </tr>
                        <tr>
                            <td class="chk_area">
                                <label for="chk_sel10" class="icon"><img src="http://news.chosun.com/test_2010/saladin_test/images/chk_off.gif" alt=""></label>
                                <input type="checkbox" name="chk_art[]" value="" id="chk_sel10" class="wt_chk">
                            </td>
                            <td>
                                6월10일<br>
                                (목)
                            </td>
                            <td>09:00</td>
                            <td>18:00</td>
                            <td>01:00</td>
                            <td>-</td>
                            <td><strong>9시간</strong></td>
                        </tr>
                        <tr>
                            <td class="chk_area">
                                <label for="chk_sel11" class="icon"><img src="http://news.chosun.com/test_2010/saladin_test/images/chk_off.gif" alt=""></label>
                                <input type="checkbox" name="chk_art[]" value="" id="chk_sel11" class="wt_chk">
                            </td>
                            <td>
                                6월10일<br>
                                (금)
                            </td>
                            <td>09:00</td>
                            <td>18:00</td>
                            <td>01:00</td>
                            <td>-</td>
                            <td><strong>9시간</strong></td>
                        </tr>
                        <tr>
                            <td class="chk_area">
                                <label for="chk_sel11" class="icon"><img src="http://news.chosun.com/test_2010/saladin_test/images/chk_off.gif" alt=""></label>
                                <input type="checkbox" name="chk_art[]" value="" id="chk_sel11" class="wt_chk">
                            </td>
                            <td>
                                6월10일<br>
                                (토)
                            </td>
                            <td>09:00</td>
                            <td>18:00</td>
                            <td>01:00</td>
                            <td>-</td>
                            <td><strong>9시간</strong></td>
                        </tr>
-->                        
                    </tbody>
                </table>

                <div class="total_area">
                    <p>총 근무시간 <strong><%=ds.xx_tot_duty_tm %></strong></p>
                </div>

                <div class="del_btn">
                    <a href="#;" class="p_left" onclick="cancel_fn(this); return false;">취소</a>
                    <a href="#;" class="p_right" onclick="chk_delete(this); return false;">삭제하기</a>
                </div>
            </div><!-- time_table -->
        </div>
    </div><!-- wrapper -->
    <script src="http://news.chosun.com/cs_intranet/m/c_intranet.js"></script>
    <script>
    	function init() {
			location.reload();    		
    	}
    	
	    function chk_delete(t) {
	        var $t = $(t);
	        if($("input:checked").length<=0){
	        	alert("선택된  항목이 없습니다");
	            return false;
	        }else{
	        	
	  		  if(confirm("삭제하시겠습니까?")) {

				  var frm1 = document.frm1;
				  var ocheck = document.getElementsByName("chk_art[]");
				  var param = "";
				  var chk	= "";

		    	  for(var i=0; i<ocheck.length; i++) {
		    		chk = document.getElementById("chk_sel"+i);
		    		param += (chk.checked == true) ? chk.value + "#" : "";
		    	  }

		    	  //alert(param);
				  
				  frm1.duty_dt.value = param.substring(0, param.length - 1);
				  frm1.action = "/hd/duty/1001003";
				  frm1.target = "ifrm";
				  frm1.submit();			  
			  } else {
				  return;
			  }
	        }
	    }
    </script>

<form id="frm1" name="frm1" action="" method="post" target="ifrm">
<input type="hidden" name="cmpycd" value="<%=cmpycd%>"/>
<input type="hidden" name="emp_no" value="<%=emp_no%>"/>
<input type="hidden" name="basi_dt" value="<%=today%>"/>
<input type="hidden" name="duty_dt" value=""/>
</form>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" style="width:0px;height:0px;"/>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
