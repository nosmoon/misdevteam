<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_bil_1106_l.jsp
* 기능 : 개별입금 리스트
* 작성일자 : 2003-11-25
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
PS_L_BILL_SEPRDataSet ds=(PS_L_BILL_SEPRDataSet)request.getAttribute("ds"); //request dataset
%>
<%
    int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) -ds.curcommlist.size();
%>

<!--검색 -->
<table  width="830" cellspacing="0" cellpadding="0" border="0" id="seprrcpm_list">
	<tr><td>
		<table width="830" border="0" cellspacing="0" cellpadding="2">
			<tr>
				<td bgcolor="#EBE9DC" class="title">상세목록</td>
				<td bgcolor="#EBE9DC" class="title" width="100" align="right"> <img src="/html/comm_img/bu_print.gif" width="39" height="19" border="0" align="absmiddle"  onClick="print_list()" style="cursor:hand;" >
				<img src="/html/comm_img/bu_del01.gif" width="36" height="19" align="absmiddle"  onclick="javascript:seprrcpm_del()"  style="cursor:hand;" ></td>
			</tr>
			<tr>
				<td height="3" colspan="2">
				<!--여백-->
				</td>
			</tr>
		</table>
		<!--리스트 -->

		<table  width="830" cellspacing="0" cellpadding="1" border="0" class="gray" bgcolor="#FFFFFF">
			<tr bgcolor="#dddddd">
				<td width="30" class="gray" align="center" >
				<input type="checkbox" name="chkhead" onClick="javascript:select_all(this.checked)">
				</td>
                    <td width="100" class="gray" align="center" > 소속지사 </td>
                    <td width="100" class="gray" align="center" > 입금일자 </td>
                    <td width="150" class="gray" align="center" > 독자번호 </td>
                    <td width="130" class="gray" align="center" > 성명 </td>
                    <td width="80" class="gray" align="center" > 구독매체 </td>
                    <td width="80" class="gray" align="center" > 입금방법 </td>
                    <td width="100" class="gray" align="center" > 수납일자 </td>
                    <td width="50" class="gray" align="center" > 금액 </td>
			</tr>
<%
String curr_page_no = request.getParameter("curr_page_no");
String total_records = String.valueOf(ds.getTotalcnt());
String js_fn_nm = request.getParameter("js_fn_nm");
%>
<%
		for(int i=0; i<ds.curcommlist.size();i++) {
			PS_L_BILL_SEPRCURCOMMLISTRecord rec=(PS_L_BILL_SEPRCURCOMMLISTRecord)ds.curcommlist.get(i);

			String str1=rec.getProcdt();            //입금 일자
			String str2=rec.getRdr_no();            //독자번호
			String str3=rec.getMedicd();            //매체코드
			String str4=rec.getTermsubsno();        //출판정기독자번호
			String str5=rec.getRcpmseq();           //수취순번
			String str6=rec.getRdrnm();             //독자명
			String str7=rec.getMedicdnm();          //매체명
			String str8=rec.getRecpmthd();          //수납방법코드
			String str9=rec.getRecpdt();            //수납일
			int str10=rec.getRcpmamt();             //수납액
			String str11=rec.getRecpmthdnm();       //수납방법명
            String str12=rec.getBocd();             //지국지사코드
            String str13=rec.getBonm();             //지국지사명
%>
			<tr onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''"
                style="cursor:hand;" onclick="javascript:seprrcpm_detl('<%=str1%>','<%=str2%>','<%=str3%>','<%=str4%>','<%=str5%>','<%=str6%>','<%=str7%>','<%=str8%>','<%=str9%>','<%=str10%>','<%=str12%>','<%=str13%>','<%=curr_page_no%>','<%=js_fn_nm%>')">
				<td width="30" class="gray" align="center" onclick="window.event.cancelBubble=true;" style="cursor:hand;" >
				<input type="checkbox" name="chk" value="<%=str2%>##<%=str3%>##<%=str4%>##<%=str5%>##<%=str12%>" onclick="checkOne()">
				</td>
                <td  class="gray" align="center" > <%=str13%>&nbsp;</td>
				<td  class="gray" align="center" > <%=Util.convertS(Util.checkString(str1))%>&nbsp;</td>
				<td  class="gray" align="center" ><%=str2%>-<%=str3%>-<%=str4%></td>
				<td  class="gray" > <%=Util.convertNull(str6,"&nbsp;")%> </td>
				<td  class="gray" > <%=Util.convertNull(str7,"&nbsp;")%> </td>
				<td  class="gray" > <%=Util.convertNull(str11,"&nbsp;")%> </td>
				<td  class="gray" align="center" > <%=Util.convertNull(Util.convertS(Util.checkString(str9)),"&nbsp")%></td>
				<td  class="gray" align="right" > <%=Util.comma(str10)%>&nbsp;</td>
			</tr>
<%
		}
	   	for(int i=0; i< no_data_page; i++) {
%>
			<tr>
				<td width="30" class="gray" align="center" >
				<input type="checkbox" name="chk" disabled>
				</td>
                <td  class="gray" align="center" > &nbsp; </td>
				<td  class="gray" align="center" > &nbsp; </td>
				<td  class="gray" align="center" > &nbsp;</td>
				<td  class="gray" > &nbsp; </td>
				<td  class="gray" > &nbsp; </td>
				<td  class="gray" > &nbsp; </td>
				<td  class="gray" align="center" > &nbsp;</td>
				<td  class="gray" align="right" > &nbsp;</td>
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

				<input type="hidden" name="total_records" value="<%=total_records%>">

				<jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
				<jsp:param name = "curr_page_no" 		value="<%=curr_page_no%>"/>
				<jsp:param name = "total_records" 	value="<%=total_records%>"/>
				<jsp:param name = "js_fn_nm" 			value="<%=js_fn_nm%>"/>
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
    parent.document.all.seprrcpm_list.outerHTML = seprrcpm_list.outerHTML;
	parent.seprrcpm_list_form.proc_dd_1.focus()
	parent.setEventHandler();
</script>