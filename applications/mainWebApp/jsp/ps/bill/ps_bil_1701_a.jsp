<%@ page contentType="text/html; charset=ksc5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_bil_1701_a.jsp
* 기능 : 수금-자동이체 신청목록-검색초기화면
* 작성일자 : 2006-04-14
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

	String sysDate = Util.getDate().substring(0,6);	// 현재년월

    String concatDelimiter = "##";	// 입금처리 시 강 항목을 concatenate할 때 사용되는 delimiter
%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
<script language="javascript" src="/html/comm_js/progress.js"></script>
<script language="javascript">
<!--

    // 배경색깔 바꿔주기
    function change_bgColor(obj, color_name) {
        obj.bgColor = color_name;
        if(obj.name=="first_tr") {
            obj.nextSibling.bgColor = color_name;
        } else if(obj.name=="second_tr") {
            obj.previousSibling.bgColor = color_name;
        }
    }

    // 엔터키 잡아내기
    function f_aplc_search() {
        if(event.keyCode == 13) list_search();
    }

	// 자동이체가입신청 등록,수정란 clear(취소)
	function shftaplc_cancel()
	{
		var lo_form = document.aplc_list_form;	// 상세정보 폼
		for( var i =0; i< lo_form.length; i++){
			lo_form(i).value = "";
		}
	}

    // 신청목록 검색
    function list_search(curr_page_no) {
        aplc_list_form.searchflag.value = "N";
        if(curr_page_no!=null) {
            aplc_search_form.curr_page_no.value = curr_page_no;
        }

        aplc_search_form.method = "post";
        aplc_search_form.action = "1706";
        aplc_search_form.target = "ifrm";

        check_all(aplc_search_form);
    }

    // 신청확인
    function aplc_cnfm() {
        aplc_list_form2.aplcyn.value = 'A';
        aplc_save();
    }

    // 신청취소
    function aplc_canc() {
        aplc_list_form2.aplcyn.value = 'C';
        aplc_save();
    }

    // 은행, 전자접수건인지를 리턴
    function isBankAplc(val) {
        if(val=="01"||val=="03"||val=="04"||val=="05"||val=="07") {
            return true;
        }
    }

    // 신청확인/취소
    function aplc_save() {
        var lo_form1;

        lo_form1 = document.aplc_list_form;
        lo_form2 = document.aplc_list_form2;

        if(lo_form1.idx==null) { // 대상에 한건도 없을 때
            return;
        } else if(!lo_form1.idx.length) { // 대상에 한건만 있을 때
            if(!lo_form1.idx.checked) return; // 체크된 건이 없을 때
            if(lo_form1.closyn.value=="Y") { // 전송여부 체크
                alert("마감된건에 대해서는 처리상태를 변경하실 수 없습니다.");
                return;
            }
            /*
            // 변경하도록 허용. 20040724 김상열
            if(isBankAplc(lo_form1.shftaplcclsf.value)) { // 이체신청구분(은행,전자접수)에 대해서 체크
                alert("은행, 전자접수건에 대해서는 처리상태를 변경하실 수 없습니다.");
                return;
            }
            */
            if(lo_form2.aplcyn.value=="A" && lo_form1.aplcprocstat.value=="30") { // '승인오류'건에 대한 신청확인일 때
                alert("승인오류건에 대해서는 신청확인하실 수 없습니다.");
                return;
            }
            if(lo_form1.idx.checked) {
                lo_form2.aplcno.value = lo_form1.aplcno.value;
	            lo_form2.shftclsf.value = lo_form1.shftclsf.value;
	            lo_form2.aplcdt.value = lo_form1.aplcdt.value;

	            lo_form2.method = "post";
	            lo_form2.action = "1711";
	            lo_form2.target = "ifrm";

	            lo_form2.submit();
            }
        } else { // 대상에 여러건일때
            var j = 0;
            for(var i=0; i<lo_form1.idx.length; i++) {
                if(lo_form1.idx[i].checked) {
                    if(lo_form1.closyn[i].value=="Y") {
                        alert("마감된건에 대해서는 처리상태를 변경하실 수 없습니다.");
                        return;
                    }
                    /*
            		// 변경하도록 허용. 20040724 김상열
                    if(isBankAplc(lo_form1.shftaplcclsf[i].value)) {
                        alert("은행, 전자접수건에 대해서는 처리상태를 변경하실 수 없습니다.");
                        return;
                    }
                    */
                    if(lo_form2.aplcyn.value=="A" && lo_form1.aplcprocstat[i].value=="30") { // '승인오류'건에 대한 신청확인일 때
                        alert("승인오류건에 대해서는 신청확인하실 수 없습니다.");
                        return;
                    }
                    j++; // 체크된 건수를 합산
                }
            }
            if(j==0) { // 체크된 건이 없을 때
                //alert('debug...한건도 없슴');
                return;
            }

            var ls_concat_str = "<%=concatDelimiter%>";

            lo_form2.aplcno.value = concatenate_with_delimiter(lo_form1.aplcno, ls_concat_str, lo_form1.idx);
            lo_form2.shftclsf.value = concatenate_with_delimiter(lo_form1.shftclsf, ls_concat_str, lo_form1.idx);
            lo_form2.aplcdt.value = concatenate_with_delimiter(lo_form1.aplcdt, ls_concat_str, lo_form1.idx);

            lo_form2.method = "post";
            lo_form2.action = "1711";
            lo_form2.target = "ifrm";

            lo_form2.submit();
        }

        jsShowProgress();
    }

    // 해당 인덱스의 key_obj가 체크되어있는지에 따라서 concat_str로 연결된 문자열을 조합한다.
    // array_obj는 collection type이다.
    function concatenate_with_delimiter(array_obj, concat_str, key_obj) {
        var ls_ret_str = "";
        var ls_obj_val;

        if(!array_obj.length) {
	    	if(key_obj.checked) {
	    		return array_obj.value;
	    	} else {
	    		return "";
    	}
	    }

        for(var i=0; i<array_obj.length; i++) {

            if(key_obj[i].checked) {
                ls_obj_val = array_obj[i].value;
                //if(ls_obj_val=="") ls_obj_val = null;
                ls_ret_str += (concat_str + ls_obj_val);
            }
        }

        ls_ret_str = ls_ret_str.substr(concat_str.length);

        return ls_ret_str;
    }

    // 상세보기
    function detail(aplcno, shftclsf, aplcdt, pymttel, trsmyn, pymtinforflyn) {
        lo_form1 = document.aplc_list_form2;

        lo_form1.aplcno.value = aplcno;
        lo_form1.shftclsf.value = shftclsf;
        lo_form1.aplcdt.value = aplcdt;
        lo_form1.pymttel.value = pymttel;
        lo_form1.trsmyn.value = trsmyn;
        lo_form1.pymtinforflyn.value = pymtinforflyn;

        lo_form1.method = "post";
        lo_form1.target = "ifrm";
        lo_form1.action = "1716";
        lo_form1.submit();
    }

    // 독자 검색
    function reader_detail_search() {
        var lo_form1 = document.aplc_list_form;
        lo_form1.searchflag.value = "Y";
        var rdrnm =  lo_form1.rdrnm.value ;
        var rdrtel_no1 = lo_form1.rdrtel_no1.value ;
        var rdrtel_no2 = lo_form1.rdrtel_no2.value ;
        var rdrtel_no3 = lo_form1.rdrtel_no3.value ;

        var rdrptph1 = lo_form1.rdrptph_no1.value;
        var rdrptph2 = lo_form1.rdrptph_no2.value;
        var rdrptph3 = lo_form1.rdrptph_no3.value;

        var lo_chk = "";
        lo_chk = ""
        if (rdrnm == "") {
            alert("독자명을 입력하세요!");
            lo_form1.rdrnm.focus();
            return;
        }

        lo_form1.action = "/ps/bill/1521";
        lo_form1.target = "ifrm";
        lo_form1.submit();
    }

    // 실구독금액, 부수 화면세팅
    function set_medi(obj) {
        if(obj.value=="") {
            document.all.realsubsamt_id.innerText = "  ";
            document.all.dlvqty_id.innerText = "       ";
        } else {
            document.all.realsubsamt_id.innerText = addCommaStr(obj.options(obj.selectedIndex).realsubsamt);
            document.all.dlvqty_id.innerText = obj.options(obj.selectedIndex).dlvqty;
        }
    }

    // 상세정보 저장
    function aplc_detail_save() {
        lo_form1 = document.aplc_list_form;

        /* 2005-01-31 이벤트 종료
        // 우리이웃이벤트 추가
        if(lo_form1.remk.checked == true){
           lo_form1.remk.value = "E1";
        }else{
           lo_form1.remk.value = "";
        }
        */
        //alert(lo_form1.searchflag.value);
        if(lo_form1.searchflag.value == "N") {
          makeValue(lo_form1);

          lo_form1.method = "post";
          lo_form1.action = "1726";
          lo_form1.target = "ifrm";

          check_all(lo_form1);
        }else {
            var lo_form = document.aplc_list_form;

            if(lo_form.total_records.value=="0") {
                alert("저장할 목록이 없습니다");
                return false;
            }
            var bocd="";
            var dlvzip="";
            var dlvaddr="";
            var dlvaddrdtls="";
            var rdrprn="";

            var rdr_no="";
            var medicd="";
            var termsubsno="";
            var pymtno_2="";

            //if(!check_all(form2)) return false;

            for(var i = 0; i < lo_form.chk.length; i++){
                if(lo_form.chk[i].checked){
                    if(!validateObj(lo_form, lo_form.pymtno_2[i])) return false;

                    makeValueObj(lo_form, lo_form.pymtno_2[i]);

                    var temp=lo_form.chk[i].value;
                    var ss = temp.split("##");
                    if(ss.length!=8) {
                        alert("선택시 문제가 발생했습니다.");
                        return false;
                    } else {
                        bocd += "##"+ss[0];
                        dlvzip += "##"+ss[1];
                        dlvaddr += "##" +ss[2];
                        dlvaddrdtls += "##"+ss[3];
                        rdrprn += "##"+ss[4];
                        rdr_no += "##"+ss[5];
                        medicd += "##"+ss[6];
                        termsubsno += "##"+ss[7];
                        pymtno_2 += "##" + lo_form.pymtno_2[i].value;
                    }
                }
            }
            if(rdr_no != ""){
                bocd = bocd.substr(2);
                dlvzip = dlvzip.substr(2);
                dlvaddr = dlvaddr.substr(2);
                dlvaddrdtls = dlvaddrdtls.substr(2);
                rdrprn = rdrprn.substr(2);

                rdr_no = rdr_no.substr(2);
                medicd = medicd.substr(2);
                termsubsno = termsubsno.substr(2);
                pymtno_2 = pymtno_2.substr(2);
            } else {
                alert("신청할 목록을 체크하십시요");
                return false;
            }

            lo_form.bocd.value=bocd;
            lo_form.dlvzip.value=dlvzip;
            lo_form.dlvaddr.value=dlvaddr;
            lo_form.dlvaddrdtls.value=dlvaddrdtls;
            lo_form.rdrprn.value=rdrprn;
            lo_form.rdr_no.value=rdr_no;
            lo_form.medicd.value=medicd;
            lo_form.termsubsno.value=termsubsno;
            lo_form.pymtno_2.value=pymtno_2;

            //if(!validate(lo_form)) return false;

            var check = "";
            check = confirm("자동이체를 등록하시겠습니까?");

            if (!check) {
                return false;
            }

            lo_form.accflag.value = 'N';		// 작업구분(신규)
            lo_form.shftclsf.value = '110';		// 이체구분(지로)

            makeValue(lo_form);

            lo_form.action = "/ps/bill/1516";
            lo_form.target = "ifrm";
            lo_form.method = "post";
            lo_form.submit();
        }
    }

    // 폼 구성요소 초기화
    function jsInit(){
        setEventHandler();
    	setEnterKeyEventHandler();
    	setInputBackgroundColor();
        aplc_search_form.sechcont.focus();
    } // jsInit

    // 폼 유효성 검사 및 전송
    function check_all(form){
        if(!validate(form)) return false;
        else{
            makeValue(form);
            form.submit();
        }
    }

/*
	// 체크박스를 클릭해서 모든 체크박스를 선택 또는 선택해제한다.
	function select_all(bool) {
		var lo_form1;
		lo_form1 = document.aplc_list_form;

		if(lo_form1.chk==null) {					// 선택된 건이 없는 경우
			return;
		} else if(lo_form1.chk.type=="checkbox") {	// 한건인 경우
			if(lo_form1.chk.disabled==false) {
			lo_form1.chk.checked = bool;
			}
		} else {									// 여러건인 경우
			for(var i=0; i<lo_form1.chk.length; i++) {
				if(lo_form1.chk[i].disabled==false) {
					lo_form1.chk[i].checked = bool;
				}
			}
		}
	} // select_all

    // 체크박스를 클릭해서 모든 체크박스를 선택 또는 선택해제한다.
    function select_all(bool) {
        var lo_form1;
        lo_form1 = document.aplc_list_form;

        if(lo_form1.idx==null) {					// 선택된 건이 없는 경우
            return;
        } else if(!lo_form1.idx.length) {	// 한건인 경우
            lo_form1.idx.checked = bool;
        } else {									// 여러건인 경우
            for(var i=0; i<lo_form1.idx.length; i++) {
                lo_form1.idx[i].checked = bool;
            }
        }
    } // select_all

*/
    //해당 체크박스 전체 체크 또는 해제
    function select_all(hchk,dchk) {
        var size = hchk.checked;
        var len  = "";

        if (!dchk){
            return;
        }else{
            len = dchk.length ;
        }

        if(dchk == null) {                        // 선택된 건이 없는 경우
            return;
        } else if (dchk.type == "checkbox") {     // 한건인 경우
            dchk.checked = size;
        } else {
            for(var i=0; i<len; i++) {            // 여러건인 경우
                dchk[i].checked = size;
            }
        }
    }

	// 체크박스 선택시 chkhead 의 체크 유무
	function checkOne()
	{
		var len  = document.aplc_list_form.chk.length;
		var check = true;
		for (var i=0; i<len; i++){
			if((!aplc_list_form.chk[i].checked) && (!aplc_list_form.chk[i].disabled)) {
				check = false;
			}
		}
		//alert("check===== "+check);
		document.aplc_list_form.chkhead.checked = check;
		window.event.cancelBubble=true;
	}
-->
</script>
</head>
<body onload="jsInit()" bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle"></b>자동이체신청관리</td>
    </tr>
    <tr>
        <td height="10"> <!--내용을 위한 여백--> </td>
    </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
    <tr>
        <form name="aplc_search_form">
        <td> <!--검색-->
            <table width="830" border="0" cellspacing="0" cellpadding="2" class="title1" bgcolor="#EBE9DC">
                <input type="hidden" name="curr_page_no" value="1"><%--현재페이지--%>
                <input type="hidden" name="records_per_page" value="5"><%--한페이지당 레코드수--%>
                <input type="hidden" name="js_fn_nm" value="list_search"><%--페이지이동 시 호출되는 자바스크립트 이름--%>
                <tr>
                    <td bgcolor="#EBE9DC" width="60" > <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">이체구분</td>
                    <td width="85"> <select name="shftclsf" class="sel_all" style="width:85;">
                            <option value="">전체</option>
                            <%=ds.shftclsfOptHtml("")%>
                        </select> </td>
                    <td bgcolor="#EBE9DC" width="60" ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">신청구분</td>
                    <td > <select name="aplcclsf" class="sel_all">
                            <option value="">전체</option>
                            <%=ds.aplcclsfOptHtml("")%>
                        </select> </td>
                    <td ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">처리상태</td>
                    <td ><select name="aplcprocstat" class="sel_all">
                    		<option value="">전체</option>
                            <%=ds.aplcprocstatOptHtml("10")%>
                    </select></td>
                    <td width="60" ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">검색조건</td>

                    <td > <select name="sechcond" class="sel_all">
                            <option value="">전체</option>
                            <option value="10">납부자명</option>
                            <option value="20">구독자명</option>
                            <option value="30">구독주소</option>
                            <option value="40">독자번호</option>
                        </select>
                        <input name="sechcont" type="text" size="13" class="text_box" onKeyDown="f_aplc_search()">
                    </td>
                    <td bgcolor="#EBE9DC" width="50" ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">접수월</td>
                    <td bgcolor="#EBE9DC" width="50" >
                        <input name="aplcdt" type="text" value="<%=sysDate%>" size="6" maxLength="7" class="text_box" dataType=month caption="접수월">
                    </td>
                    <td rowspan="2">
                        <%---------------------------------------------------------------------------------------------------
                        * 수정내역 :	조회 조건에서 접수월(당월) 디스플레이 없앰
                        * 수정자 :	노상현
                        * 수정일자 :	2004-08-16
                        * 백업파일명 : 주석처리
                        ---------------------------------------------------------------------------------------------------%>
	                    <%--<input name="aplcdt" type="text" value="<%=Util.convertMonthS(Util.getYyyyMm())%>" size="6" maxLength="7" class="text_box" dataType=month caption="접수월">--%>
                    	<input type="image" onclick="list_search(1);window.event.returnValue=false;" src="/html/comm_img/bu_search03.gif" align="absmiddle">
                    </td>
                </tr>
                <!-- -->
                <tr>
                    <td bgcolor="#EBE9DC" colspan="10">
                    <table border="0" cellspacing="0" cellpadding="0" bgcolor="#EBE9DC">
                    <tr>
                        <td width="64" bgcolor="#EBE9DC"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">정렬조건</td>
                        <td bgcolor="#EBE9DC" width="89">
                            <select name="sortcond" class="sel_all" style="width:85;">
                                <option value="">전체</option>
                                <option value="10">이체시작월</option>
                                <option value="20">접수일자</option>
                                <option value="30">독자번호</option>
                                <option value="40">독자명</option>
                                <option value="50">납부자번호</option>
                                <option value="60">납부자명</option>
                            </select>
                        </td>
                        <td width="64" bgcolor="#EBE9DC"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">정렬기준</td>
                        <td width="*" bgcolor="#EBE9DC">
                            <select name="sortorder" class="sel_all">
                                <option value="">전체</option>
                                <option value="10">오름차순</option>
                                <option value="20">내림차순</option>
                            </select>
                        </td>

                    </tr>
                    </table>
                </td>
                </tr>
                </form>
            </table>
            <!--검색 끝--> </td>
    </tr>
    <tr>
        <td height="10"> <!------여백--- --> </td>
    </tr>
    <form name="aplc_list_form" method="post" action="" >
    <input type="hidden" name="searchflag" value="N">
    <tr>
        <td>
            <table width="830" border="0"  cellpadding="1" cellspacing="0" id="aplc_header_id">
                <tr>
                    <td  height="27" bgcolor="#EBE9DC" class="title" width="627">자동이체 신청(해지) 신청자 목록 </td>
                    <td  height="27" bgcolor="#EBE9DC" class="title" width="145" align="right">
                      <input type="image" onclick="aplc_cnfm();window.event.returnValue=false;" src="/html/comm_img/bu_sin01.gif" width="65" height="19" border="0" align="absmiddle">
                      <input type="image" onclick="aplc_canc();window.event.returnValue=false;" src="/html/comm_img/bu_sin02.gif" width="65" height="19" border="0" align="absmiddle">
                    </td>
                </tr>
                <tr>
                    <td height="3" colspan="2"> <!--여백--> </td>
                </tr>
            </table>
            <table width="830" height="290" border="0" cellpadding="2" cellspacing="0" bgcolor="#ffffff" class="gray" id="aplc_body_id">
                <tr align="left" bgcolor="#CCCCCC" >
                    <td width="24" rowspan="2" class="gray"> <input type="checkbox" name="formcheckbox1"> </td>
                    <td width="102" rowspan="2" class="gray"> 독자명<br>
                        (납부자번호) </td>
                    <td height="16" class="gray"> 납부자명(전화번호) </td>
                    <td width="80" class="gray" align="center"> 이체구분 </td>
                    <td width="56" class="gray" align="center"> 신청구분 </td>
                    <td width="52" class="gray" align="center"> 처리상태 </td>
                    <td width="52" class="gray" align="center"> 마감여부 </td>
                    <td width="86" class="gray" align="center"> 매체 </td>
                    <td width="61" class="gray" align="center"> 접수일자 </td>
                    <td width="61" class="gray" align="center"> 이체시작월 </td>
                    <td width="61" class="gray" align="center"> 최초신청일 </td>

                </tr>
                <tr align="left" >
                    <td height="13" bgcolor="#CCCCCC" class="gray"> 독자번호 </td>
                    <td height="13" colspan="8" bgcolor="#CCCCCC" class="gray" align="center"> 구독주소 </td>
                </tr>

                <% for (int i=0; i<5 ; i++) { %>
                  <tr align="left" >
                    <td rowspan="2" class="gray">&nbsp;</td>
                    <td rowspan="2" class="gray">&nbsp;<br>&nbsp;</td>
                      <td height="17" class="gray">&nbsp;</td>
                      <td class="gray">&nbsp;</td>
                      <td class="gray">&nbsp;</td>
                      <td class="gray">&nbsp;</td>
                      <td class="gray">&nbsp;</td>
                      <td class="gray">&nbsp;</td>
                      <td class="gray" align="center">&nbsp;</td>
                      <td class="gray" align="center">&nbsp;</td>
                      <td class="gray" align="center">&nbsp;</td>
                  </tr>
                  <tr align="left" >
                    <td height="17" class="gray">&nbsp;</td>
                    <td height="17" colspan="9" class="gray" align="center">&nbsp;</td>
                  </tr>
                <% } %>

                <tr align="right" bgcolor="#dddddd" >
                    <td colspan="10" class="gray" align="left" style="border-right-width:0"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">미확인 <b><font color="red">0건</font></b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">확인 <b>0건</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">취소 <b>0건</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">승인오류 <b>0건 </b></td><td class="gray"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">총 <b>0건</b></td>
                </tr>
            </table>
            <!---button-->
            <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="pbrdr_list">
                <tr>
                    <td align="center" height="2"> <!--여백--> </td>
                </tr>
            </table>
            <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="aplc_footer_id">
                <tr>
                    <td align="center" height="2"> <!--여백--> </td>
                </tr>
                <tr>
                   <td align="center" height="24" bgcolor="#E8E8E8"> <img src="/html/comm_img/bu_first01.gif" alt="처음 페이지로" border="0" ><img src="/html/comm_img/bu_prev01.gif" alt="이전 페이지로"><img src="/html/comm_img/bu_next01.gif" alt="다음 페이지로" border="0" ><img src="/html/comm_img/bu_end01.gif" border="0" alt="마지막 페이지로"></td>
                </tr>
            </table>
        </td>
    </tr>
    </form>
</table>
<br>
<br>
<form name="aplc_list_form2">
    <input type="hidden" name="aplcyn" value=""><%--작업구분 : 신청확인('A'), 신청취소('C')--%>
    <input type="hidden" name="aplcno" value=""><%--신청번호--%>
    <input type="hidden" name="shftclsf" value=""><%--이체구분--%>
    <input type="hidden" name="aplcdt" value=""><%--신청일자--%>
    <input type="hidden" name="pymttel" value=""><%--납부자전화번호--%>
    <input type="hidden" name="trsmyn" value=""><%--전송여부--%>
    <input type="hidden" name="pymtinforflyn" value=""><%--납부정보반영여부--%>
</form>
<iframe name="ifrm" width="100%" height="0"></iframe>
</body>
</html>
