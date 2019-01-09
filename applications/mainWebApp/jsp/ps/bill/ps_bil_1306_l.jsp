<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_bil_1306_l.jsp
* 기능 : 비정상입금 리스트
* 작성일자 : 2004-03-29
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
// dataset 인스턴스 선언 부분
PS_L_BILL_NONRCPMDataSet ds=(PS_L_BILL_NONRCPMDataSet)request.getAttribute("ds");

int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.curcommlist.size();
%>


<!--검색 -->
<table width="830" cellspacing="0" cellpadding="0" border="0" id="non_rcpm_list"><tr><td>
	<table width="830" cellspacing="0" cellpadding="2" border="0" class="gray" bgcolor="#FFFFFF">
		<tr bgcolor="#dddddd" align="center">
			<td width="30" class="gray" >
			<input type="checkbox" name="chkhead" onClick="javascript:select_all(this.checked)">
			</td>
                <td width="70" class="gray" > 입금일자 </td>
                <td width="310" class="gray" > 독자번호 </td>
                <td width="70" class="gray" > 처리지사 </td>
                <td width="70" class="gray" > 오류구분 </td>
                <td width="70" class="gray" > 입금금액 </td>
                <td width="60" class="gray" > 수납점 </td>
                <td width="70" class="gray" > 수납일자 </td>
                <td width="60" class="gray" > 처리상태 </td>
		</tr>
		<%
		//실제 디비에서 검색한 데이터를 가져옮
		for(int i=0; i<ds.curcommlist.size();i++) {
			PS_L_BILL_NONRCPMCURCOMMLISTRecord rec = (PS_L_BILL_NONRCPMCURCOMMLISTRecord)ds.curcommlist.get(i);

			String seq      = rec.getSeq();                  // 일련번호
			String acqdt	= rec.getAcqdt();                // 수취 일자
			String acqno	= rec.getAcqno();                // 수취 번호
			String rcpmrfldt= rec.getRcpmrfldt();             // 입금 반영일자
			String custbrwsno = rec.getCustbrwsno();         // 고객 조회 번호
            String bonm      = rec.getBonm();               // 처리지사
			String recpdt   = rec.getRecpdt();               // 수납 일자
			int    amt  	= rec.getAmt();					 // 수납 금액
			String recpbrchcd = rec.getRecpbrchcd();         // 수납점 코드

			String rdr_no   = rec.getRdr_no();               // 독자 번호
			String medicd   = rec.getMedicd();               // 매체 코드
			String termsubsno = rec.getTermsubsno();         // 정기독자 번호
            String bocd    = rec.getBocd();                  // 지국지사코드

			String rdrnm = rec.getRdrnm();                   // 독자명
			String medinm= rec.getMedinm();                  // 매체명
			String tbstprocclsf=rec.getTbstprocclsf();       // 수납구분코드(오류구분)
			String tbstprocclsfnm=rec.getTbstprocclsfnm();   // 수납구분이름(오류구분)
			String rcpmrflyn= rec.getRcpmrflyn();            // 입금반영 여부명
			String rcpmrflynnm= rec.getRcpmrflynnm();            // 입금반영 여부명
		%>
		<tr>
			<td width="30" class="gray" align="center" >
			<%
				if(rcpmrflyn.equals("N")) {
			%>
			<input type="checkbox" name="chk" value="<%=seq%>##<%=acqdt%>##<%=acqno%>##<%=rcpmrfldt%>##<%=recpdt%>##<%=amt%>##<%=recpbrchcd%>##<%=tbstprocclsf%>##<%=custbrwsno%>##<%=rdr_no%>##<%=medicd%>##<%=termsubsno%>##<%=bocd%>" onclick="checkOne();">
			</td>
			<td width="80" class="gray" align="center" >
				<input type="text" name="rcpmrfldt" value="<%=Util.convertS(rcpmrfldt)%>" size="10" class="text_box" caption="입금일자" notEmpty datatype="date" onkeyup="passFocus_Enter(this, this.form.rdr_no[<%=i%>],8)">
			</td>
			<td width="310" class="gray" align="center" >
	<!--
	        <input type="text" name="rdr_no" maxlength="9" value="<%=rdr_no%>" size="9" tabIndex="1" datatype="number"  len="9" class="text_box"caption="독자번호" notEmpty onkeyup="passFocus(this, this.form.medicd[<%=i%>],9)">
			<input type="text" name="medicd" maxlength="3" value="<%=medicd%>" size="3" tabIndex="2"  datatype="number"  		   class="text_box"caption="독자번호" notEmpty onkeyup="passFocus(this, this.form.termsubsno[<%=i%>],3)">
			<input type="text" name="termsubsno" maxlength="4" value="<%=termsubsno%>" size="4" tabIndex="3" datatype="number" len="4" class="text_box" caption="독자번호" notEmpty onkeyup="search_rdrnm_medicdnm(<%=i%>)">
	-->
			<input type="text" name="rdr_no" maxlength="9" value="<%=rdr_no%>" size="9" datatype="number"  len="9" class="text_box" caption="독자번호" notEmpty onkeyup="passFocus_Enter(this, this.form.medicd[<%=i%>],9)">
			<input type="text" name="medicd" maxlength="3" value="<%=medicd%>" size="3" datatype="number"  		   class="text_box" caption="독자번호" notEmpty onkeyup="passFocus_Enter(this, this.form.termsubsno[<%=i%>],3)">
			<input type="text" name="termsubsno" maxlength="4" value="<%=termsubsno%>" size="4" datatype="number" len="4" class="text_box" caption="독자번호" notEmpty onchange="search_rdrnm_medicdnm(<%=i%>);">

			<%
				} else {
			%>
			<input type="checkbox" name="chk" disabled>
			</td>
			<td   class="gray" align="center" >
			<input type="text" name="rcpmrfldt" value="<%=Util.convertS(rcpmrfldt)%>" size="10" class="readonly_box" readOnly>
			</td>
			<td   class="gray" align="center" >
			<input type="text" name="rdr_no" maxlength="9" value="<%=rdr_no%>" size="9" class="readonly_box" readOnly>
			<input type="text" name="medicd" maxlength="3" value="<%=medicd%>" size="3"  class="readonly_box" readOnly>
			<input type="text" name="termsubsno" maxlength="4" value="<%=termsubsno%>" size="4" class="readonly_box" readOnly>
			<%
				}
			%>
			<input type="text" name="rdrnm" value="<%=rdrnm%>" size="10" class="readonly_box" readOnly>
			<input type="text" name="medinm" value="<%=medinm%>" size="10" class="readonly_box" readOnly>
			</td>
            <td   class="gray" > <%=bonm.equals("")? "&nbsp;" : bonm %></td>
			<td   class="gray" > <%=tbstprocclsfnm%></td>
			<td   class="gray" align="right" > <%=Util.comma(amt)%></td>
			<td   class="gray" align="center" > <%=recpbrchcd%></td>
			<td   class="gray" align="center" > <%=Util.convertS(recpdt)%></td>
			<td   class="gray" > <%=rcpmrflynnm%> </td>
		</tr>
			<%
			}
				for(int i=0; i < no_data_page; i++) {
			%>
		<tr>
			<td width="30" class="gray" align="center" >
			<input type="checkbox" name="chk" disabled>
			</td>
			<td   class="gray" align="center" >
			<input type="text" name="rcpmrfldt" size="10" class="readonly_box" readOnly>
			</td>
			<td  class="gray" align="center" >
			<input type="text" name="rdr_no" size="9" class="readonly_box" readOnly>
			<input type="text" name="medicd" size="3" class="readonly_box" readOnly>
			<input type="text" name="termsubsno" size="4" class="readonly_box" readOnly>
			<input type="text" name="rdrnm" size="10" class="readonly_box" readOnly>
			<input type="text" name="medinm" size="10" class="readonly_box" readOnly>
			</td>
			<td   class="gray" > &nbsp;</td>
            <td   class="gray" > &nbsp;</td>
			<td   class="gray" align="right" > &nbsp;</td>
			<td   class="gray" align="center" > &nbsp;</td>
			<td   class="gray" align="center" > &nbsp;</td>
			<td   class="gray" > &nbsp; </td>
		</tr>
	<%
		}
	%>
	</table>
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
			String total_records = String.valueOf(ds.getTotalcnt());
			String js_fn_nm = request.getParameter("js_fn_nm");
			%>
			<input type="hidden" name="total_records" value="<%=total_records%>">
			<jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
			<jsp:param name = "curr_page_no" 		value="<%=curr_page_no%>"/>
			<jsp:param name = "total_records" 	value="<%=total_records%>"/>
			<jsp:param name = "js_fn_nm" 			value="page_move"/>
			<jsp:param name = "records_per_page" 	value="15"/>
			<jsp:param name = "page_set_gubun" 	value="0"/>
			</jsp:include>

			<!--JSP PAGE END------------------------------------------------------------------------------------>
			</td>
		</tr>
	</table>
</td></tr>
</table>
<script>
parent.document.all.non_rcpm_list.outerHTML = non_rcpm_list.outerHTML;

parent.setEventHandler();
</script>