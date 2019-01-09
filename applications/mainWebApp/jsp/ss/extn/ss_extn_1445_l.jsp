<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1445_l.jsp
* 기능 : 확장현황-확장지원비-등록/조회-목록
* 작성일자 : 2003-12-18
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTN_SLSCOSTDataSet ds = (SS_L_RDR_EXTN_SLSCOSTDataSet)request.getAttribute("ds");
    int listCount = 10;		// 화면당 항목수
	int colCount = 0;		// 화면선택에 따라 보여주여하 할 컬럼수
	int tdWidth = 0;		// 컬럼의 너비
	// 선택항목의 갯수를 계산한다.
	if("Y".equals(ds.getBoextn())){
		colCount++;
	}
	if("Y".equals(ds.getMovm())){
		colCount++;
	}
	if("Y".equals(ds.getEmpextn())){
		colCount++;
	}
	if("Y".equals(ds.getExgextn())){
		colCount++;
	}

	// 0 나누기 체크
	if(colCount == 0){
		tdWidth = 180;
	}else{
		tdWidth = (int)(180/colCount);
	}
%>

<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="sply_list_id">
<form name="sply_list_form" method="post" action="" >
    <input name="basidtary" type="hidden" value ="">
    <input name="bocdary" type="hidden" value ="">
    <input name="payqtyary" type="hidden" value ="">
    <input name="uprcary" type="hidden" value ="">
    <input name="splyamtary" type="hidden" value ="">
    
	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray">지국</td>
		<td width="45" rowspan="2" class="gray">실독자</td>
<%	if(! "Y".equals(ds.getBoextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" rowspan="2" class="gray">지국</td>
<%	if(! "Y".equals(ds.getBoextn())){%>--><%}%>
<%	if(! "Y".equals(ds.getMovm())){%><!--<%}%>
		<td width="<%= tdWidth %>" rowspan="2" class="gray">이사</td>
<%	if(! "Y".equals(ds.getMovm())){%>--><%}%>
<%	if(! "Y".equals(ds.getEmpextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" rowspan="2" class="gray">사원</td>
<%	if(! "Y".equals(ds.getEmpextn())){%>--><%}%>
<%	if(! "Y".equals(ds.getExgextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" rowspan="2" class="gray">품앗이</td>
<%	if(! "Y".equals(ds.getExgextn())){%>--><%}%>
		<td width="45" rowspan="2" class="gray">계</td>
		<td colspan="6" class="gray">주거형태</td>
		<td width="55" rowspan="2" class="gray" bgcolor="#dddddd"> 지급부수</td>
		<td width="55" rowspan="2" class="gray">수당단가</td>
		<td width="60" rowspan="2" class="gray"> 지원금액</td>
	</tr>
	<tr bgcolor="#dddddd" align="center">
		<td width="40" class="gray"> APT</td>
		<td width="40" class="gray"> 빌라</td>
		<td width="40" class="gray"> 주택</td>
		<td width="40" class="gray"> 사무실</td>
		<td width="40" class="gray">상가</td>
		<td width="40" class="gray">기타</td>
	</tr>

<%
for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_RDR_EXTN_SLSCOSTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_SLSCOSTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <input name="basidt" type="hidden" value ="<%= curcommlistRec.basidt%>">	<!-- 기준일자 -->
    <input name="bocd" type="hidden" value ="<%= curcommlistRec.bocd%>">		<!-- 지국지사코드 -->
    
	<tr>
		<td class="gray" align="left"><%= curcommlistRec.bocdnm%>&nbsp;</td>
		<td width="45" class="gray" align="right"><%= Util.comma(curcommlistRec.realrdrcnt)%>&nbsp;</td>
<%	if(! "Y".equals(ds.getBoextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" class="gray" align="right"><%= Util.comma(curcommlistRec.boqty)%>&nbsp;</td>
<%	if(! "Y".equals(ds.getBoextn())){%>--><%}%>
<%	if(! "Y".equals(ds.getMovm())){%><!--<%}%>
		<td width="<%= tdWidth %>" class="gray" align="right"><%= Util.comma(curcommlistRec.movmqty)%>&nbsp;</td>
<%	if(! "Y".equals(ds.getMovm())){%>--><%}%>
<%	if(! "Y".equals(ds.getEmpextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" class="gray" align="right"><%= Util.comma(curcommlistRec.empqty)%>&nbsp;</td>
<%	if(! "Y".equals(ds.getEmpextn())){%>--><%}%>
<%	if(! "Y".equals(ds.getExgextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" class="gray" align="right"><%= Util.comma(curcommlistRec.exgqty)%>&nbsp;</td>
<%	if(! "Y".equals(ds.getExgextn())){%>--><%}%>
		<td width="45" class="gray" align="right"><%= Util.comma(curcommlistRec.sumqty)%>&nbsp;</td>
		<td width="40" class="gray" align="right"><%= Util.comma(curcommlistRec.apt)%>&nbsp; </td>
		<td width="40" class="gray" align="right"><%= Util.comma(curcommlistRec.villa)%>&nbsp;</td>
		<td width="40" class="gray" align="right"><%= Util.comma(curcommlistRec.hous)%>&nbsp;</td>
		<td width="40" class="gray" align="right"><%= Util.comma(curcommlistRec.offi_room)%>&nbsp;</td>
		<td width="40" class="gray" align="right"><%= Util.comma(curcommlistRec.shop)%>&nbsp;</td>
		<td width="40" class="gray" align="right"><%= Util.comma(curcommlistRec.etc)%>&nbsp;</td>
		<td width="55" class="gray" align="center">
			<input name="payqty" type="text" size="7" class="text_box" value="<%= curcommlistRec.payqty%>" dataType="integer" comma style="text-align:right">
		</td>
		<td width="55" class="gray" align="center">
			<input name="uprc" type="text" size="7" class="text_box" value="<%= curcommlistRec.uprc%>" dataType="integer" comma style="text-align:right">
		</td>
		<td width="60" class="gray" align="center">
			<input name="splyamt" type="text" size="8" class="text_box" value="<%= curcommlistRec.splyamt%>" dataType="integer" comma style="text-align:right">
		</td>
	</tr>
<%}%>

<%if(ds.curcommlist.size() == 0){%>
	<%for(int i=0; i<listCount; i++){%>
	<tr align="center">
		<td class="gray" align="left">&nbsp;</td>
		<td width="45" class="gray" align="left">&nbsp;</td>
<%	if(! "Y".equals(ds.getBoextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" class="gray" align="right">&nbsp;</td>
<%	if(! "Y".equals(ds.getBoextn())){%>--><%}%>
<%	if(! "Y".equals(ds.getMovm())){%><!--<%}%>
		<td width="<%= tdWidth %>" class="gray" align="right">&nbsp;</td>
<%	if(! "Y".equals(ds.getMovm())){%>--><%}%>
<%	if(! "Y".equals(ds.getEmpextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" class="gray" align="right">&nbsp;</td>
<%	if(! "Y".equals(ds.getEmpextn())){%>--><%}%>
<%	if(! "Y".equals(ds.getExgextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" class="gray" align="right">&nbsp;</td>
<%	if(! "Y".equals(ds.getExgextn())){%>--><%}%>
		<td width="45" class="gray" align="right">&nbsp;</td>
		<td width="40" class="gray" align="right">&nbsp;</td>
		<td width="40" class="gray" align="right">&nbsp;</td>
		<td width="40" class="gray" align="right">&nbsp;</td>
		<td width="40" class="gray" align="right">&nbsp;</td>
		<td width="40" class="gray" align="right">&nbsp;</td>
		<td width="40" class="gray" align="right">&nbsp;</td>
		<td width="55" class="gray" align="center"><input name="text" type="text" size="7" class="text_box"></td>
		<td width="55" class="gray" align="center"><input name="text" type="text" size="7" class="text_box"></td>
		<td width="60" class="gray" align="center"><input name="text" type="text" size="8" class="text_box"></td>
	</tr>
	<%}%>
<%}%>

	<tr bgcolor="#dddddd">
		<td colspan="16" class="gray" height="23">
			<div align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총지원금액 <%= Util.comma(ds.getTotalsplyamt())%> 원 </b>&nbsp;&nbsp;&nbsp;					
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.getTotalcnt())%> 건 </b>
			</div>
		</td>
	</tr>
</form>
</table>


<script>
    parent.document.all.sply_list_id.outerHTML = sply_list_id.outerHTML;

    //화면 초기화
    parent.jsInit();
    
<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>     
</script>

