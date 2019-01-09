<%@ page contentType="text/html; charset=ksc5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_bill_1716_s.jsp
* 기능 : 수금-자동이체신청-자동이체상세
* 작성일자 : 2006-04-17
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    PS_S_APLCDataSet ds = (PS_S_APLCDataSet)request.getAttribute("ds");
    PS_S_APLCRSLTCURRecord rsltcurRec = (PS_S_APLCRSLTCURRecord)ds.rsltcur.get(0);

    boolean closYn = false;	// 마감여부 : true이면 구구독자번호만 수정할 수 있다.
    String trsmyn = Util.checkString(request.getParameter("trsmyn"));				// 전송여부
    String pymtinforflyn = Util.checkString(request.getParameter("pymtinforflyn"));	// 납부정보반영여부
    String closYnStr = null;

    // 마감여부 => 전송여부가 'Y'이거나, 입금정보반영여부가 'Y'이면 마감여부는 true. 상태변경 및 정보수정을 할 수 없음.
	if("Y".equals(trsmyn) || "Y".equals(pymtinforflyn)) {
		closYn = true;
		closYnStr = "Y";
	} else {
		closYn = false;
		closYnStr = "N";
	}
%>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
</head>
<body bgcolor="#F8F7F7">
<table width="830" border="0"  cellpadding="1" cellspacing="0" id="aplc_header_id">
<input type="hidden" name="accflag" value="<%=rsltcurRec.aplcclsf%>">
<input type="hidden" name="cardcmpycd" value="<%=rsltcurRec.cardcmpycd%>">
<input type="hidden" name="cardno" value="<%=rsltcurRec.cardno%>">
<input type="hidden" name="shftclsf" value="<%=rsltcurRec.shftclsf%>">
<input type="hidden" name="pymtnm" value="<%=rsltcurRec.pymtnm%>">
<input type="hidden" name="pymtno_2" value="<%=rsltcurRec.pymtno_2%>">
<input type="hidden" name="pymttel1" value="<%=rsltcurRec.pymttel1%>">
<input type="hidden" name="pymttel2" value="<%=rsltcurRec.pymttel2%>">
<input type="hidden" name="pymttel3" value="<%=rsltcurRec.pymttel3%>">
<input type="hidden" name="bankcd" value="<%=rsltcurRec.recpinstt%>">
<input type="hidden" name="acctno" value="<%=rsltcurRec.acctno%>">
<input type="hidden" name="prn" value="<%=rsltcurRec.prn%>">
<input type="hidden" name="aplyyymm" value="<%=rsltcurRec.aplyyymm%>">
<input type="hidden" name="email" value="<%=rsltcurRec.email%>">
<input type="hidden" name="aplcpathcd" value="<%=rsltcurRec.aplcpathcd%>">

    <tr>
        <td  height="27" bgcolor="#EBE9DC" class="title" width="681">
            상세내역
            <input type="hidden" name="aplcno" value="<%=request.getParameter("aplcno")%>"><%--신청번호--%>
            <input type="hidden" name="shftclsf" value="<%=request.getParameter("shftclsf")%>"><%--이체구분--%>
            <input type="hidden" name="aplcdt" value="<%=request.getParameter("aplcdt")%>"><%--신청일자--%>
            <input type="hidden" name="closyn" value="<%=closYnStr%>"><%--마감여부--%>
        </td>
        <td  height="27" bgcolor="#EBE9DC" class="title" width="145" align="right">&nbsp;</td>
    </tr>
    <tr>
        <td height="3" colspan="2"> <!--여백--> </td>
    </tr>
</table>
<table width="830" border="0" cellpadding="2" cellspacing="0"  class="gray" bgcolor="#ffffff" id="aplc_body_id">
    <tr align="center">
        <td colspan="8" class="gray" bgcolor="#dddddd" height="25"> 납부자 정보 </td>
    </tr>
    <tr>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">납부자명</td>
        <td class="gray" colspan="7"><%= rsltcurRec.pymtnm%>(<%=Util.checkString(request.getParameter("pymttel"))%>)</td>
    </tr>
    <tr>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">납부자번호</td>
        <td colspan="7" class="gray"><%= rsltcurRec.pymtno_2%>&nbsp;</td>
    </tr>
    <tr>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">신청일자</td>
        <td colspan="7" class="gray"><%= Util.convertS(rsltcurRec.aplcdt)%></td>
    </tr>
    <tr>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">이체구분</td>
        <td colspan="7" class="gray"><%= rsltcurRec.shftclsfnm%></td>
    </tr>
    <tr>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">이체시작월<font color="red">*</font></td>
        <td colspan="6" class="gray">

        <%---------------------------------------------------------------------------------------------------
        * 수정내역 : 이체시작월 항시 수정가능하게 변경
        * 수정자 :	노상현
        * 수정일자 :	2004-08-16
        * 백업파일명 : 주석처리
        ---------------------------------------------------------------------------------------------------%>
        <%--
        	if(closYn) {	// 마감된 신청건일 경우 수정할 수 없다.
        %>
        	<%=Util.convertMonthS(rsltcurRec.pymtstrtdt)%>
        	<input type="hidden" name="aplyyymm" value="<%=rsltcurRec.aplyyymm%>">
        <%
        	} else {
        --%>

        	<select name="pymtstrtdt" class="sel_all" notEmpty caption="이체시작월">
        		<option value="<%=rsltcurRec.aplyyymm%>"><%= Util.convertMonthS((rsltcurRec.aplyyymm))%></option>
        	<%
        		String nowDate = Util.getDate();
				String tempDate = nowDate;

                int today = Integer.parseInt(Util.getDate());
                int basiday = Integer.parseInt(Util.getYyyyMm()+"11");
                int j=0;

                if(today > basiday ) {
                  j++;
                }

        		// for(int i=1; i<12; i++) {
        		//	tempDate = Util.addMonth(tempDate, 1);
        		for(int i=j; i<12+j; i++) {
        			tempDate = Util.addMonth(nowDate, i);
        	%>
        		<option value="<%=tempDate.substring(0, 6)%>"><%=Util.convertMonthS(tempDate.substring(0, 6))%></option>
        	<%
        		}
        	%>
        	</select>

        <%--
        	}
        --%>
        </td>
        <td class="gray">&nbsp;<!--2005-01-31 이벤트 종료 <input type="checkbox" name="remk"
            <%--if(rsltcurRec.remk.equals("E1")){out.print(" checked");}else{out.print(" ");} --%>>
            <font color="red">이웃사랑</font> 캠페인 참여--></td>
    </tr>
    <tr align="center">
        <td colspan="8" bgcolor="#dddddd" class="gray" height="25"> 구독 정보 </td>
<%--            <input type="hidden" name="bocd"    value="<%=rsltcurRec.bocd%>" ><!--독자정보에 저장될 지사--> --%>
            <input type="hidden" name="bocd"    value="" ><!--독자정보에 저장될 지사-->
            <input type="hidden" name="rdrprn"  value="" ><!--독자정보에 저장될 주민번호 입력-->
            <input type="hidden" name="dlvzip"  value="" ><!--독자정보에 저장될 우편번호-->
            <input type="hidden" name="dlvaddr" value="" ><!--독자정보에 저장될 주소-->
            <input type="hidden" name="dlvaddrdtls" value="" ><!--독자정보에 저장될 상세주소-->
    </tr>
    <tr>
        <td width="75" height=25 bgcolor="#dddddd" class="gray">구독자명<font color="red">*</font></td>
        <td class="gray"> <input type="text" name="rdrnm"  class="text_box" value="<%= rsltcurRec.rdrnm%>"> </td>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">전화번호<font color="red">*</font></td>
        <td class="gray">
            <input type="text" name="rdrtel_no1"  class="text_box" value="<%=rsltcurRec.rdrtel1%>" size="4">-
            <input type="text" name="rdrtel_no2"  class="text_box" value="<%=rsltcurRec.rdrtel2%>" size="4">-
            <input type="text" name="rdrtel_no3"  class="text_box" value="<%=rsltcurRec.rdrtel3%>" size="4">
        </td>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">핸드폰<font color="red">*</font></td>
        <td colspan="3" class="gray">
            <input type="text" name="rdrptph_no1"  class="text_box" value="" size="4">-
            <input type="text" name="rdrptph_no2"  class="text_box" value="" size="4">-
            <input type="text" name="rdrptph_no3"  class="text_box" value="" size="4">
        </td>
    </tr>
    <tr>

        <td width="75" height="25" bgcolor="#dddddd" class="gray">독자번호<font color="red">*</font></td>
        <td colspan="5" class="gray">

        <%
        	if(closYn) {	// 마감된 신청건일 경우 수정할 수 없다.
        %>
        	<input type="text" name="rdr_no" value="<%= rsltcurRec.rdr_no%>" size="9" class="text_box" notEmpty readOnly=true caption="독자번호">
        	<input type="text" name="medicd" value="<%= rsltcurRec.medicd%>" size="3" class="text_box" notEmpty readOnly=true caption="매체코드">
        	<input type="text" name="termsubsno" value="<%= rsltcurRec.termsubsno%>" size="4" class="text_box" notEmpty readOnly=true caption="정기구독번호">
            <%
                if(rsltcurRec.rdr_no==null || rsltcurRec.rdr_no.equals("") ||
                   rsltcurRec.medicd == null || rsltcurRec.medicd.equals("") ||
                   rsltcurRec.termsubsno ==null || rsltcurRec.termsubsno.equals("")) {
            %>
            <td colspan="2" class="gray" align="right">
            <input type="image" onclick="reader_detail_search();window.event.returnValue=false;" src="/html/comm_img/bu_search.gif" width="36" height="19" border="0" align="absmiddle">
            </td>
            <%
                }
            %>

        <%
        	} else {
        %>
        	<input type="text" name="rdr_no" value="<%= rsltcurRec.rdr_no%>" size="9" class="readonly_box" notEmpty readOnly=true caption="독자번호">
        	<input type="text" name="medicd" value="<%= rsltcurRec.medicd%>" size="3" class="readonly_box" notEmpty readOnly=true caption="매체코드">
        	<input type="text" name="termsubsno" value="<%= rsltcurRec.termsubsno%>" size="4" class="readonly_box" notEmpty readOnly=true caption="정기구독번호">
            <%--독자번호가 없을 경우에 독자검색 버튼 출력--%>
            <%
                if(rsltcurRec.rdr_no==null || rsltcurRec.rdr_no.equals("") ||
                   rsltcurRec.medicd == null || rsltcurRec.medicd.equals("") ||
                   rsltcurRec.termsubsno ==null || rsltcurRec.termsubsno.equals("")) {
            %>
            <td colspan="2" class="gray" align="right">
            <input type="image" onclick="reader_detail_search();window.event.returnValue=false;" src="/html/comm_img/bu_search.gif" width="36" height="19" border="0" align="absmiddle">
            </td>
            <%
                }
            %>

        <%
        	}
        %>
        </td>
    </tr>
    <tr>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">구독매체<font color="red">*</font></td>
        <td width="75" class="gray">

		<%
			boolean mediyn = false;
            if(rsltcurRec.medicd!=null && !rsltcurRec.medicd.equals("")) {
                mediyn = true;
            }

        	if(mediyn) {	// 마감된 신청건일 경우 수정할 수 없다.
        %>
        	<input type="text" name="medinm" value="<%= rsltcurRec.medinm%>" class="readonly_box" notEmpty readOnly=true caption="매체명">
        	<%--input type="hidden" name="medicd" value="<%= rsltcurRec.medicd%>" --%>
        <%
        	} else {
        %>

	        <%--구독매체에 따라서 text출력 또는 select출력--%>
	        <%
	            if(mediyn) {
	        %>
	        	<select name="medicd" class="sel_all" id="medi_list_id">
	                <option value="<%= rsltcurRec.medicd%>"><%= rsltcurRec.medinm%></option>
	            </select>
	        <%
	            } else {
	        %>
	            <select name="medicd" class="sel_all" id="medi_list_id">
	                <option>선택</option>
	            </select>
	        <%
	            }
	        %>

	    <%
	    	}
	    %>
        </td>
        <td width="80" bgcolor="#dddddd" class="gray" >구독기간<font color="red">*</font></td>
        <td class="gray"  width="200">
            <input type="text" name="subsfrser_no" size="10" value="<%=rsltcurRec.subsfrser_no%>" class="readonly_box" style="text-align:center" readonly caption="구독기간" notEmpty> -
            <input type="text" name="substoser_no" size="10" value="<%=rsltcurRec.substoser_no%>" class="readonly_box" style="text-align:center" readonly caption="구독기간" notEmpty>
        </td>

        <td width="90" bgcolor="#dddddd" class="gray" >소속지사<font color="red">*</font></td>
        <td class="gray"  width="200" colspan="5">
            <input type="text" name="bocdnm" value="<%=rsltcurRec.bonm%>" size="20" class="readonly_box" style="text-align:center" readonly caption="소속지사" notEmpty>
        </td>

    </tr>
    <tr>
        <td width="75" height="25" bgcolor="#dddddd" class="gray">구독주소<font color="red">*</font></td>
        <td colspan="7" class="gray">
            <input type="text" size="100" name="addr_all" value="<%=rsltcurRec.dlvaddr%>&nbsp;<%=rsltcurRec.dlvaddrdtls%>" class="readonly_box" style="text-align:left" readonly caption="주소" notEmpty>
        </td>
    </tr>
    <tr>
        <td width="100" class="gray" bgcolor="#dddddd">실구독금액</td>
        <td width="70"  class="gray" align="right" style="border-right-width:0"><span id="realsellamt_id"><% if(mediyn) { out.print(Util.comma(rsltcurRec.realsellamt)); } else { out.print("&nbsp;&nbsp;"); }%></span>원</td>
        <td width="100" class="gray" bgcolor="#dddddd">약정내역</td>
        <td width="150" class="gray" align="left"style="border-right-width:0"> <%=rsltcurRec.agrmnt_list%>&nbsp;</td>
        <td width="100" class="gray" bgcolor="#dddddd">입금내역</td>
        <td width="150" class="gray" align="left" style="border-right-width:0" colspan="3"><%=rsltcurRec.clamt_list%>&nbsp;</td>
    </tr>
</table>
<table  width="830" cellspacing="0" cellpadding="0" border="0" id="pbrdr_list">
    <tr bgcolor="#DDDDDD" >
        <td width="30" align="center" class="gray">
        <input type="checkbox" name="formcheckbox1">
        </td>
        <td width="100" align="center" class="gray"> 소속지사 </td>
        <td width="100" align="center" class="gray"> 구독매체 </td>
        <td width="150" align="center" class="gray"> 독자번호 </td>
        <td width="130" align="center" class="gray"> 구독기간 </td>
        <td width="80"  align="center" class="gray"> 주소 </td>
        <td width="80"  align="center" class="gray"> 납부자번호 </td>
    </tr>
    <tr>
        <td width="30" class="gray" align="center" >
        <input type="checkbox" name="formcheckbox12">
        </td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
    </tr>
</table>
<!---button-->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="aplc_footer_id">
    <tr>
        <td align="center" height="2"> <!--여백--> </td>
    </tr>
    <tr>
        <td align="center" height="24" bgcolor="#E8E8E8">
          <input type="image" src="/html/comm_img/bu_save.gif" onclick="aplc_detail_save();window.event.returnValue=false;" width="39" height="19" border="0" align="absmiddle">
          <input type="image" src="/html/comm_img/bu_list.gif" onclick="list_search();window.event.returnValue=false;" width="65" height="19" align="absmiddle" border="0"><!--img onClick="aplc_list_form.reset();window.event.returnValue=false" style="cursor:hand" src="/html/comm_img/bu_cencle.gif" width="39" height="19" border="0" align="absmiddle"--> </td>
    </tr>
</table>
</body>
</html>
<%
    if(rsltcurRec.rdr_no==null || rsltcurRec.rdr_no.equals("") ||
       rsltcurRec.medicd == null || rsltcurRec.medicd.equals("") ||
       rsltcurRec.termsubsno ==null || rsltcurRec.termsubsno.equals("")) {
%>
<script language="javascript">
    parent.aplc_header_id.outerHTML = aplc_header_id.outerHTML;
    parent.aplc_body_id.outerHTML = aplc_body_id.outerHTML;
    parent.aplc_footer_id.outerHTML = aplc_footer_id.outerHTML;
    parent.pbrdr_list.outerHTML = pbrdr_list.outerHTML;
    parent.setEventHandler();
</script>
<%
    } else {
%>
<script language="javascript">
    parent.aplc_header_id.outerHTML = aplc_header_id.outerHTML;
    parent.aplc_body_id.outerHTML = aplc_body_id.outerHTML;
    parent.aplc_footer_id.outerHTML = aplc_footer_id.outerHTML;
    parent.setEventHandler();
</script>
<%
    }
%>
