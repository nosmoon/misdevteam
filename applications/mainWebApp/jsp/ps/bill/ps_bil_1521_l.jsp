<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_bil_1521_l.jsp
* 기능 : 독자 리스트
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
PS_L_PBRDR_LISTDataSet ds=(PS_L_PBRDR_LISTDataSet)request.getAttribute("ds"); //request dataset

String total_records = String.valueOf(ds.curcommlist.size());
%>
<!--검색 -->
<table  width="830" cellspacing="0" cellpadding="0" border="0" id="pbrdr_list">
			<tr bgcolor="#dddddd">
				<td width="30" class="title" align="center" >
				<input type="checkbox" name="chkhead" onClick="javascript:select_all(this.checked)">
				</td>
                <td width="100" class="title" align="center" > 소속지사 </td>
                <td width="80"  class="title" align="center" > 구독매체 </td>
                <td width="120" class="title" align="center" > 독자번호 </td>
                <td width="100" class="title" align="center" > 구독기간 </td>
                <td width="130" class="title" align="center" > 주소 </td>
                <td width="90"  class="title" align="center" > 납부자번호 </td>
			</tr>

<%
		for(int i=0; i<ds.curcommlist.size();i++) {
			PS_L_PBRDR_LISTCURCOMMLISTRecord rec=(PS_L_PBRDR_LISTCURCOMMLISTRecord)ds.curcommlist.get(i);
                String rdr_no = rec.rdr_no;
                String medicd = rec.medicd;
                String termsubsno = rec.termsubsno;
                String rdrnm = rec.rdrnm;
                String prn = rec.prn;
                String medinm = rec.medinm;
                String bocd = rec.bocd;
                String bocdnm = rec.bocdnm;
                String rdrtel_no1 = rec.rdrtel_no1;
                String rdrtel_no2 = rec.rdrtel_no2;
                String rdrtel_no3 = rec.rdrtel_no3;
                String rdrptph_no1 = rec.rdrptph_no1;
                String rdrptph_no2 = rec.rdrptph_no2;
                String rdrptph_no3 = rec.rdrptph_no3;
                String dlvzip = rec.dlvzip;
                String dlvaddr = rec.dlvaddr;
                String dlvdtlsaddr = rec.dlvdtlsaddr;
                String subsfrser_no = rec.subsfrser_no;
                String substoser_no = rec.substoser_no;
%>
			<tr onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''" style="cursor:hand;">
				<td width="30" class="gray" align="center" onclick="window.event.cancelBubble=true;" style="cursor:hand;" >
				<input type="checkbox" name="chk" value="<%=bocd%>##<%=dlvzip%>##<%=dlvaddr%>##<%=dlvdtlsaddr%>##<%=prn%>##<%=rdr_no%>##<%=medicd%>##<%=termsubsno%>" onclick="checkOne()">
				</td>
                <td  class="gray" align="center" > <%=bocdnm%>&nbsp;</td>
				<td  class="gray" align="center" > <%=medinm%>&nbsp;</td>
				<td  class="gray" align="center" ><%=rdr_no%>-<%=medicd%>-<%=termsubsno%> </td>
				<td  class="gray" align="center" ><%=subsfrser_no%>-<%=substoser_no%></td>
				<td  class="gray" > <%=dlvaddr%> <%=dlvdtlsaddr%></td>
				<td  class="gray" > <input type="text" name="pymtno_2" size="13" maxlength="13"> </td>
			</tr>
<%
		}
%>
			<tr >
				<td width="30" class="gray" align="center" >
				<input type="checkbox" name="chk" value="" disabled>
				</td>
                <td  class="gray" align="center" >&nbsp;</td>
				<td  class="gray" align="center" >&nbsp;</td>
				<td  class="gray" align="center" >&nbsp;</td>
				<td  class="gray" align="center" >&nbsp;</td>
				<td  class="gray" >&nbsp;</td>
				<td  class="gray" >&nbsp;</td>
			</tr>
    <input type="hidden" name="total_records" value="<%=total_records%>">
</table>

<script>
    parent.document.all.pbrdr_list.outerHTML = pbrdr_list.outerHTML;
	parent.setEventHandler();
</script>
