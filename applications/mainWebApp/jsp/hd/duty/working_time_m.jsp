<%@ page contentType="text/html; charset=KSC5601"%>
<%@	page import="
		java.sql.*,
		java.text.*,
		java.lang.*,
		java.util.*,
		java.io.*,
        somo.framework.util.*,
"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : working_time.jsp
* ��� : �ٹ��ð� �Է� �ý���
* �ۼ����� : 2018-06-28
* �ۼ��� : 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 	
* ������ : 	
* �������� : 	
---------------------------------------------------------------------------------------------------%>
<%!
    // ���޵� ��Ű�� ������ ���� �� �����Ѵ�.
    public String GetCookie(HttpServletRequest req, HttpServletResponse res, String param) throws Exception{
        String ret = "";
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            for(int i=0; i<cookies.length; i++){
                if(cookies[i].getName().equals(param)){
                    ret = cookies[i].getValue();
					break;
                }	
            }
        }
        return ret;
    }
%>
<%
		String uid = (String)session.getAttribute("ACCT_CD") == null ? "" : (String)session.getAttribute("ACCT_CD");				// ���̵�
		String emp_no = (String)session.getAttribute("EMPNO") == null ? "" : (String)session.getAttribute("EMPNO");				// ���
		String emp_nm = (String)session.getAttribute("NM") == null ? "" : (String)session.getAttribute("NM");					// ����
		
		String cmpycd = (String)session.getAttribute("BLNG_CMPY_CD") == null ? "" : (String)session.getAttribute("BLNG_CMPY_CD");		// ȸ��
		String cmpynm = (String)session.getAttribute("BLNG_CMPY_NM") == null ? "" : (String)session.getAttribute("BLNG_CMPY_NM");		// ȸ���
		
		String deptcd = (String)session.getAttribute("PART_CD") == null ? "" : (String)session.getAttribute("PART_CD");			// �μ�
		String deptnm = (String)session.getAttribute("PART_NM") == null ? "" : (String)session.getAttribute("PART_NM");			// �μ���
		
		String selldeptcd = (String)session.getAttribute("CRM_SELL_DEPT_CD") == null ? "" : (String)session.getAttribute("CRM_SELL_DEPT_CD");		// �Ǹźμ�
		String selldeptnm = (String)session.getAttribute("CRM_SELL_DEPT_NM") == null ? "" : (String)session.getAttribute("CRM_SELL_DEPT_NM");		// �Ǹźμ���
		
		String areacd = (String)session.getAttribute("CRM_MANG_AREA_CD") == null ? "" : (String)session.getAttribute("CRM_MANG_AREA_CD");			// ���������ڵ�
		String areanm = (String)session.getAttribute("CRM_MANG_AREA_NM") == null ? "" : (String)session.getAttribute("CRM_MANG_AREA_NM");			// ����������
		
		
		
		String jobcd = (String)session.getAttribute("JOB_CLSF_CD") == null ? "" : (String)session.getAttribute("JOB_CLSF_CD");				// ��������
		String jobnm = (String)session.getAttribute("JOB_CLSF_NM") == null ? "" : (String)session.getAttribute("JOB_CLSF_NM");				// �������и�
		
		String posicd = (String)session.getAttribute("DTY_CD") == null ? "" : (String)session.getAttribute("DTY_CD");			// ��å�ڵ�
		String posinm = (String)session.getAttribute("DTY_NM") == null ? "" : (String)session.getAttribute("DTY_NM");			// ��å��
		
		String usertypecd = (String)session.getAttribute("EMP_CLSF_CD") == null ? "" : (String)session.getAttribute("EMP_CLSF_CD");		// ��������ڵ�
		String usertypenm = (String)session.getAttribute("EMP_CLSF_NM") == null ? "" : (String)session.getAttribute("EMP_CLSF_NM");		// ������и�
		
		String email = (String)session.getAttribute("EMAIL_ID") == null ? "" : (String)session.getAttribute("EMAIL_ID");				// �̸���
		
		String dealdeptcd = (String)session.getAttribute("CRM_MANG_DEPT_CD") == null ? "" : (String)session.getAttribute("CRM_MANG_DEPT_CD");		// �����μ��ڵ�
		String dealdeptnm = (String)session.getAttribute("CRM_MANG_DEPT_NM") == null ? "" : (String)session.getAttribute("CRM_MANG_DEPT_NM");		// �����μ���
			
		String mobile = (String)session.getAttribute("PTPH") == null ? "" : (String)session.getAttribute("PTPH");			// �޴���ȭ
		String dealmedicd	= (String)session.getAttribute("dealmedicd") == null ? "" : (String)session.getAttribute("dealmedicd"); 		// ������ü�ڵ�
		
		// ��ü�Ҹ�
		String hdqtcd = "";			// �����ڵ�
		String hdqtnm = "";			// ���θ�
		String partcd = "";			// ��Ʈ�ڵ�
		String partnm = "";			// ��Ʈ��
		String deptplacyn = "";												// �μ��忩��
		String hdqtplacyn = "";												// �����忩��
		String partplacyn = "";												// ��Ʈ�忩��
		// -------
		
		//cmpycd = "100";
		//uid = "c202029";
		//emp_no = "202029";
		
		if(uid.equals("")){
			//response.sendRedirect("/");			
		}

		// LDAP ����� ���� Request ó�� (�� CRM ������� �׸��)
		/*
		String uid			= request.getHeader("UID")   		== null ? "" : Util.Uni2Ksc(request.getHeader("UID")); 		 	  // ���̵�
		String emp_no       = request.getHeader("EMP_NO")       == null ? "" : Util.Uni2Ksc(request.getHeader("EMP_NO"));         // ���
		String emp_nm       = request.getHeader("EMP_NM")       == null ? "" : Util.Uni2Ksc(request.getHeader("EMP_NM"));         // ����
		String cmpycd       = request.getHeader("CMPYCD")       == null ? "" : Util.Uni2Ksc(request.getHeader("CMPYCD"));         // ȸ��
		String cmpynm       = request.getHeader("CMPYNM")       == null ? "" : Util.Uni2Ksc(request.getHeader("CMPYNM"));         // ȸ��		
		String deptcd       = request.getHeader("DEPTCD")       == null ? "" : Util.Uni2Ksc(request.getHeader("DEPTCD"));         // �μ�
		String deptnm       = request.getHeader("DEPTNM")       == null ? "" : Util.Uni2Ksc(request.getHeader("DEPTNM"));         // �μ���
		String selldeptcd	= request.getHeader("SELLDEPTCD")   == null ? "" : Util.Uni2Ksc(request.getHeader("SELLDEPTCD"));     // �Ǹźμ�
		String selldeptnm   = request.getHeader("SELLDEPTNM")   == null ? "" : Util.Uni2Ksc(request.getHeader("SELLDEPTNM"));     // �Ǹźμ���
		String areacd       = request.getHeader("AREACD")       == null ? "" : Util.Uni2Ksc(request.getHeader("AREACD"));         // ���������ڵ�
		String areanm       = request.getHeader("AREANM")       == null ? "" : Util.Uni2Ksc(request.getHeader("AREANM"));         // ����������
		String deptplacyn   = request.getHeader("DEPTPLACYN")   == null ? "" : Util.Uni2Ksc(request.getHeader("DEPTPLACYN"));     // �μ��忩��
		String jobcd        = request.getHeader("JOBCD")        == null ? "" : Util.Uni2Ksc(request.getHeader("JOBCD"));          // ��������
		String jobnm        = request.getHeader("JOBNM")        == null ? "" : Util.Uni2Ksc(request.getHeader("JOBNM"));          // �������и�
		String posicd       = request.getHeader("POSICD")       == null ? "" : Util.Uni2Ksc(request.getHeader("POSICD"));         // ��å�ڵ�
		String posinm       = request.getHeader("POSINM")       == null ? "" : Util.Uni2Ksc(request.getHeader("POSINM"));         // ��å��
		String usertypecd   = request.getHeader("USERTYPECD")   == null ? "" : Util.Uni2Ksc(request.getHeader("USERTYPECD"));     // ��������ڵ�
		String usertypenm   = request.getHeader("USERTYPENM")   == null ? "" : Util.Uni2Ksc(request.getHeader("USERTYPENM"));     // ������и�
		String email        = request.getHeader("EMAIL")        == null ? "" : Util.Uni2Ksc(request.getHeader("EMAIL"));          // �̸���
		String dealdeptcd   = request.getHeader("DEALDEPTCD")   == null ? "" : Util.Uni2Ksc(request.getHeader("DEALDEPTCD"));     // �����μ��ڵ�
		String dealdeptnm   = request.getHeader("DEALDEPTNM")   == null ? "" : Util.Uni2Ksc(request.getHeader("DEALDEPTNM"));	  // �����μ���

		// CIIS �߰� �׸��
		String hdqtcd		= request.getHeader("HDQTCD")   	== null ? "" : Util.Uni2Ksc(request.getHeader("HDQTCD")); 			// ����
		String hdqtnm		= request.getHeader("HDQTNM")   	== null ? "" : Util.Uni2Ksc(request.getHeader("HDQTNM")); 			// ���θ�
		String partcd		= request.getHeader("PARTCD")   	== null ? "" : Util.Uni2Ksc(request.getHeader("PARTCD")); 			// ��Ʈ�ڵ�
		String partnm		= request.getHeader("PARTNM")   	== null ? "" : Util.Uni2Ksc(request.getHeader("PARTNM")); 			// ��Ʈ��
		String hdqtplacyn	= request.getHeader("HDQTPLACYN") 	== null ? "" : Util.Uni2Ksc(request.getHeader("HDQTPLACYN")); 		// �����忩��
		String partplacyn	= request.getHeader("PARTPLACYN") 	== null ? "" : Util.Uni2Ksc(request.getHeader("PARTPLACYN")); 		// ��Ʈ�忩��
		String dealmedicd	= request.getHeader("DEALMEDICD")  	== null ? "" : Util.Uni2Ksc(request.getHeader("DEALMEDICD")); 		// ������ü�ڵ�
		String mobile	= request.getHeader("MOBILE")  	== null ? "" : Util.Uni2Ksc(request.getHeader("MOBILE")); 		// ������ü�ڵ�
		*/

//	uid="c191003";	
//	emp_no="191003";
//	deptcd="154500";
//	deptnm="CSI��";
//	cmpycd="100";
//	emp_nm="�̱���";
//	dealmedicd = "1";

//	uid="c190053";	
//	emp_no="190053";
//	deptcd="154500";
//	deptnm="CSI��";
//	cmpycd="100";
//	emp_nm="�̱��";
	
//	uid="c153001";	
//	emp_no="153001";
//	deptcd="154500";
//	deptnm="CSI��";
//	cmpycd="100";
//	emp_nm="��쿵";

//  uid="cit0000";
//  emp_no="cit0000";
//  deptcd="361100";
//  deptnm="�ӿ���";
//  cmpycd="100";
  
//  uid="ait0000";
//  emp_no="ait0000";
//  deptcd="361100";
//  deptnm="�ӿ���";
//  cmpycd="500";  
  
  //cmpycd="332";
  //cmpynm="�系�������";
//  cmpynm="�����Ϻ�";
//  emp_nm="�����";
  //dealmedicd = "1";
	
//  dealmedicd	 = "1";

		// LDAP ����� ���� Session ó��
		
		session.setAttribute("uid"			,uid		); 		// ���̵�
		//	���翡�� �߰��ϴ� ����
		//	�а���� ��ȸ�翡�� �α����ϴ� ��� ����� ���� ���̵� �ְ� �ȴ�.
		//	���̵� ������ ������� ���
		System.out.println("emp_no=_" + emp_no + "_");
		if (emp_no.equals("")){
			session.setAttribute("emp_no"		,uid     );      // ���
		} else {
			session.setAttribute("emp_no"		,emp_no     );      // ���
		}
		session.setAttribute("emp_nm"		,emp_nm    	);      // ����
		session.setAttribute("cmpycd"		,cmpycd     );      // ȸ��
		session.setAttribute("cmpynm"		,cmpynm     );      // ȸ��
		session.setAttribute("deptcd"		,deptcd     );      // �μ�
		session.setAttribute("deptnm"		,deptnm     );      // �μ���
		session.setAttribute("selldeptcd"   ,selldeptcd );      // �Ǹźμ�
		session.setAttribute("selldeptnm"   ,selldeptnm );      // �Ǹźμ���
		session.setAttribute("dealdeptcd"   ,dealdeptcd );      // �����μ��ڵ�
		session.setAttribute("dealdeptnm"   ,dealdeptnm );      // �����μ���
		session.setAttribute("areacd"       ,areacd     );      // ���������ڵ�
		session.setAttribute("areanm"       ,areanm     );      // ����������
		session.setAttribute("deptplacyn"   ,deptplacyn );      // �μ��忩��
		session.setAttribute("jobcd"        ,jobcd      );      // ��������
		session.setAttribute("jobnm"        ,jobnm      );      // �������и�
		session.setAttribute("posicd"       ,posicd     );      // ��å�ڵ�
		session.setAttribute("posinm"       ,posinm     );      // ��å��
		session.setAttribute("usertypecd"   ,usertypecd );      // ��������ڵ�
		session.setAttribute("usertypenm"   ,usertypenm );      // ������и�
		session.setAttribute("email"        ,email      );      // �̸���
		
		// CIIS �߰� �׸��  - ����(��),��Ʈ(��) LDAP���� ���� �ȵǴ� ����� ������.
		//session.setAttribute("hdqtcd"     ,hdqtcd     );      // ����        
		//session.setAttribute("hdqtnm"     ,hdqtnm     );      // ���θ�      
		//session.setAttribute("partcd"     ,partcd     );      // ��Ʈ�ڵ�    
		//session.setAttribute("partnm"     ,partnm     );      // ��Ʈ��      
		session.setAttribute("hdqtplacyn" 	,hdqtplacyn );      // �����忩��  
		session.setAttribute("partplacyn" 	,partplacyn );      // ��Ʈ�忩��  
		session.setAttribute("dealmedicd"  	,dealmedicd );      // ������ü�ڵ�
		session.setAttribute("mobile"  	,mobile );      // ������ü�ڵ�		
System.out.println("1");		
	String domainName = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
	String strMenuUrl = "";
	String strmainFrame = "";
	
	System.out.println("domainName : " + domainName);
	//domainName = "http://192.168.1.102:8100";
	System.out.println("uid : " + uid);
	if (uid == null) {
		uid = GetCookie(request,response,"uid");
		System.out.println("uid null : " + uid);
	}
	System.out.println("2");
	if (uid == null){
		response.sendRedirect("/"); 
	}
	System.out.println("3");
	System.out.println("strmainFrame == " + strmainFrame);
	System.out.println("domainName == " + domainName);
	
	//http://news.chosun.com/cs_intranet/html/css/intranet_common.css
	



	//���Ǿ��� �� �α�������
	if(cmpycd.equals("")){
		response.sendRedirect("/");			
	}

	//������ ���� �� ���
	String last_week = request.getParameter("last_week");
	String week_cls1 = "";
	String week_cls2 = "";
	int week_back = 0;
	if(last_week == null || last_week.equals("")) { 
		week_back = 0;
		week_cls1 = "active";
		week_cls2 = "";
	} else {
		week_back = Integer.parseInt(last_week) + 7;
		week_cls1 = "";
		week_cls2 = "active";
	}
	
%>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
        <title>�ٹ��ð��Է�</title>
        <meta name="author" content="����Ʋ�����Ϻ�">
        <script type="text/javascript" src="http://news.chosun.com/realty/resources/js/jquery-1.11.0.min.js"></script>
        <link rel="stylesheet" href="http://news.chosun.com/cs_intranet/m/c_intranet.css?d=20180706">
				<link rel="apple-touch-icon-precomposed" href="http://m.chosun.com/images/apple-touch-icon.png">
        <script>

        //�ʱ�ȭ����ȸ
        function search_time() {
      	  var frm = document.frm1;
      	  frm.action = "/hd/duty/1001004";
      	  frm.target = "ifrm";	  	 
      	  frm.submit();
        }

	function set_default_tm(prsnt_tm, finish_tm, addm_rest_minute) {
		$("#time2").val( prsnt_tm );
		$("#time3").val( finish_tm );
		$("#time_label_1").html("");
		$("#time_label_2").html("");

		if(addm_rest_minute != "" && addm_rest_minute != "0") {
			$("#sel4 option:contains('" + addm_rest_minute + "')").attr("selected", "selected");
		}
	}

        
        //�ʱ�ȭ
        function init() {
        	//var frm = document.frm_content;
      	  	//frm.reset();	
		//frm.prsnt_tm.value = "";
		//frm.finish_tm.value = "";
		//$("#time_label_1").html("��ٽð��� �����ϼ���");
      		//$("#time_label_2").html("��ٽð��� �����ϼ���");
      		location.reload();
        }


	function chk_duty_clsf(obj) {
        	var frm = document.frm_content;
		if(obj.checked) {
			//frm.sel2.selectedIndex = 1;
			//frm.sel3.selectedIndex = 10;
			frm.prsnt_tm.value = "09:30";
			frm.finish_tm.value = "18:30";
			frm.prsnt_tm.readOnly = true;
			frm.finish_tm.readOnly = true;
			$("#time_label_1").html("");
			$("#time_label_2").html("");
			frm.sel4.value = "";
		} else {
			//frm.sel2.value = "";
			//frm.sel3.value = "";
			frm.prsnt_tm.readOnly = false;
			frm.finish_tm.readOnly = false;
			frm.prsnt_tm.value = "";
			frm.finish_tm.value = "";
			$("#time_label_1").html("��ٽð��� �����ϼ���");
      			$("#time_label_2").html("��ٽð��� �����ϼ���");
			frm.sel4.value = "";
		}
	}
        
        
        //�Է�
        function save() {
      	  var frm = document.frm_content;
      	  var tmp = "";      	  
      	 
      	  if(frm.duty_dt.value == "") {
      		  alert("��¥�� ������ �ּ���");
      		  return;
      	  }
      	        	  
      	  if(!frm.duty_clsf.checked) {
	      	  if(frm.prsnt_tm.value == "") {
	      		alert("��ٽð��� ������ �ּ���");
	      		return;
	      	  }
	
	      	  if(frm.finish_tm.value == "") {
	      		alert("��ٽð��� ������ �ּ���");
	      		return;
	      	  }
      	  }
      
	  //frm.prsnt_tm.value  = frm.sel2.value; 
	  //frm.finish_tm.value = frm.sel3.value; 
	  frm.addm_rest_minute.value = frm.sel4.value; 

      	  //alert(frm.prsnt_tm.value.replace(":","") + " : " + frm.finish_tm.value.replace(":","") + " : " + frm.addm_rest_minute.value.replace(":","") );
	  //return;

      	  frm.action = "/hd/duty/1001002";
      	  frm.method = "post";
      	  frm.target = "ifrm";
      	  frm.submit();

	
	  //�������� �ԷµȰ�� ���� �� ������� 
          if(frm.duty_clsf.checked) {
		$(".chk_input").trigger("click");
	  }
	  
	  $(".sel_input").removeClass("done");

        }
        
        </script>
    </head>
<body onload="search_time();">
    <div id="wrapper" class="wt_wrap">
        <div id="header">
            <h1 class="logo"><a href="#"><img src="http://m.chosun.com/img/mcsg_tit_logo.png" alt="�����Ϻ�"></a></h1>
        </div>
        
        <form id="frm_content" name="frm_content" action="" method="post" target="ifrm">
        <div class="intranet_cont">
            <div class="wt1">
                <div class="t_area">
                    <h2 class="title">�ٹ��ð� �Է�</h2>

		    <div class="time_table">
		    	<div class="cate_btn">
		    		<div class="p_right">
                        		<ul>
                            			<li class="<%=week_cls1%>"><a href="/jsp/hd/duty/working_time_m.jsp">����</a></li>
                            			<li class="<%=week_cls2%>"><a href="/jsp/hd/duty/working_time_m.jsp?last_week=<%=week_back%>">������></a></li>
                        		</ul>
                    		</div>
		    	</div>
               	    </div>

                    <!-- a href="#" class="p_btn" onclick="search();">���� �ٹ��ð� Ȯ��</a -->
                    <!-- a href="http://news.chosun.com/cs_intranet/m//working_time2.html" class="p_btn">���� �ٹ��ð� Ȯ��</a>-->
                    <!-- a href="working_time_list_m.jsp" class="p_btn">���� �ٹ��ð� Ȯ��</a-->
                    <a href="/hd/duty/1001001?basi_dt=<%=Util.getDate()%>&emp_no=<%=emp_no%>&clsf=M" class="p_btn">���� �ٹ��ð� Ȯ��</a>
                </div>

            	<select name="duty_dt" id="sel1" class="sel_input" onchange="">
            		<option value="" disabled selected>��¥�� �����ϼ���</option>
<%
	String[] week_days = {"��", "��", "ȭ", "��", "��", "��", "��"};
	String dt = "";
	Calendar now = Calendar.getInstance();
	int	day_of_week = now.get(now.DAY_OF_WEEK);
	int inc;
	String today = Util.getDate();


	//������ ������ Ƚ���� ŭ �ڷ�
	if(last_week != null) {
		today = Util.addDate(today, -week_back);
	}

	
	for(int d=1; d<=7; d++) {
		
		if(d == day_of_week) {
			inc = 0;
		} else {
			inc = ((d < day_of_week) ? -(day_of_week - d) : (d-day_of_week));
		}

		dt = Util.addDate(today, inc);
%>
		<option value="<%=dt%>" <%=(day_of_week == d ? "selected" : "")%>><%=dt.substring(4,6)%>��<%=dt.substring(6,8)%>��(<%=week_days[d-1]%>)</option>
<%
	}
%>
            	</select>
  
                <div class="time_wrap">
                    <input type="time" id="time2" name="prsnt_tm" class="time_input">
                    <label for="time2" class="time_label" id="time_label_1">��ٽð��� �����ϼ���</label>
                </div>

                <div class="time_wrap">
                    <input type="time" id="time3" name="finish_tm" class="time_input">
                    <label for="time3" class="time_label" id="time_label_2">��ٽð��� �����ϼ���</label>
                </div>
<!--
                <div class="time_wrap">
                    <input type="time" id="time4" name="addm_rest_minute" class="time_input">
                    <label for="time4" class="time_label">�߰� �ްԽð��� �����ϼ���</label>
                </div>
-->

<!-- 
                <select name="sel2" id="sel2" class="sel_input">
                    <option value="" disabled selected>��ٽð��� �����ϼ���</option>
                    <option value="0900">09:00</option>
                    <option value="1000">10:00</option>
                    <option value="1100">11:00</option>
                    <option value="1200">12:00</option>
                    <option value="1300">13:00</option>
                    <option value="1400">14:00</option>
                    <option value="1500">15:00</option>
                    <option value="1600">16:00</option>
                    <option value="1700">17:00</option>
                    <option value="1800">18:00</option>
                    <option value="1900">19:00</option>
                </select>

                <select name="sel3" id="sel3" class="sel_input">
                    <option value="" disabled selected>��ٽð��� �����ϼ���</option>
                    <option value="0900">09:00</option>
                    <option value="1000">10:00</option>
                    <option value="1100">11:00</option>
                    <option value="1200">12:00</option>
                    <option value="1300">13:00</option>
                    <option value="1400">14:00</option>
                    <option value="1500">15:00</option>
                    <option value="1600">16:00</option>
                    <option value="1700">17:00</option>
                    <option value="1800">18:00</option>
                    <option value="1900">19:00</option>
                </select>
-->

                <select name="sel4" id="sel4" class="sel_input">
                    <option value="" disabled selected>�߰� �ްԽð��� �����ϼ���</option>
                    <option value="0030">00:30</option>
                    <option value="0100">01:00</option>
                    <option value="0130">01:30</option>
                    <option value="0200">02:00</option>
                    <option value="0230">02:30</option>
                    <option value="0300">03:00</option>
                    <option value="0330">03:30</option>
                    <option value="0400">04:00</option>
                    <option value="0430">04:30</option>
                    <option value="0500">05:00</option>
                    <option value="0530">05:30</option>
                    <option value="0600">06:00</option>
                    <option value="0630">06:30</option>
                    <option value="0700">07:00</option>
                    <option value="0730">07:30</option>
                    <option value="0800">08:00</option>
                    <option value="0830">08:30</option>                    
                    <option value="0900">09:00</option>
                    <option value="0930">09:30</option>
                    <option value="1000">10:00</option>
                </select>

                <div class="chk_wrap">
                    <input type="checkbox" id="chk" name="duty_clsf" value="10" class="chk_input" onclick="chk_duty_clsf(this);">
                    <label for="chk" class="chk_label">�����Դϴ�</label>
                    <span class="chk_mark"></span>
                </div>

                <div class="btn_wrap">
                    <button class="reset" onclick="init();"><span>�ʱ�ȭ</span></button>
                    <button type="button" class="active" onclick="save();">�Է�</button>
                </div>
            </div><!-- wt1 -->
        </div><!-- intranet_cont -->
		<input type="hidden" id="cmpycd" name="cmpycd"	value="<%=cmpycd%>"/>
		<input type="hidden" id="emp_no" name="emp_no"  value="<%=emp_no%>"/>    
<!--
		<input type="hidden" id="prsnt_tm"         name="prsnt_tm"  value=""/>    
		<input type="hidden" id="finish_tm"        name="finish_tm"  value=""/>    
-->
		<input type="hidden" id="addm_rest_minute" name="addm_rest_minute"  value=""/>    
		</form>
    </div><!-- wrapper -->
    <script src="http://news.chosun.com/cs_intranet/m/c_intranet.js"></script>

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