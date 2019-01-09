<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1025_s.jsp
* 기능 : 독자현황-독자정보-독자이력 상세(매체별)
* 작성일자 : 2003-12-29
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_RDR_SUBSDataSet ds = (SS_S_RDR_SUBSDataSet)request.getAttribute("ds");
%>
<!--구독 정보 상세 시작-->
<table width="280" border="0" cellpadding="0" cellspacing="0" align="top" class="gray" id="subs_detail_id">
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">매체명</td>
        <td bgcolor="#FFFFFF" class="gray" colspan="3">
            <select name="medicd" onChange="subs_detail_view(this.value);"class="sel_all">
            <%-- 독자 구독매체 목록 --%>
            <%-- 독자 구독매체 중 대표매체를 선택하여 보여준다. --%>
            <%
            for(int i=0; i<ds.curcommlist.size(); i++){
				SS_S_RDR_SUBSCURCOMMLISTRecord curcommlistRec = (SS_S_RDR_SUBSCURCOMMLISTRecord)ds.curcommlist.get(i);
				if(curcommlistRec.medicd != null && curcommlistRec.medicd.equals(ds.getMedicd())){%>
					<%-- 검색된 대표매체코드와 동일한 경우 선택되도록 처리한다. --%>
					<option value="<%= curcommlistRec.medicd%>" selected><%=curcommlistRec.medicdnm%></option>
				<%}else{%>
					<option value="<%= curcommlistRec.medicd%>"><%=curcommlistRec.medicdnm%></option>
				<%}%>
            <%}%>
            </select>
        </td>
    </tr>
	<tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">단가</td>
        <td bgcolor="#FFFFFF" class="gray" align="right" colspan="3"><%= Util.comma(ds.getSubsamt())%></td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">유료부수</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right"><%= ds.getValqty()%> 부</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">준유가부수</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right"><%= ds.getPre_valqty()%> 부</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">무료부수</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right"><%= ds.getNo_valqty()%> 부</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">무료구분</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right"><%= ds.getRptvfreeclsf()%>&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">확장일자</td>
        <td width="70" bgcolor="#FFFFFF" class="gray"><%= Util.convertS(ds.getRptvrdr_extndt())%>&nbsp; </td>
        <td width="70" bgcolor="#DDDDDD" class="gray">확장유형</td>
        <td width="70" bgcolor="#FFFFFF" class="gray"><%= ds.getRptvrdr_extntype()%>&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">확장자</td>
        <td width="70" bgcolor="#FFFFFF" class="gray"><%= ds.getRptvextn()%>&nbsp; </td>
        <td width="70" bgcolor="#DDDDDD" class="gray">확장비용</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right"><%= Util.comma(ds.getTotrdr_extncost())%>&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">구독일자</td>
        <td width="70" bgcolor="#FFFFFF" class="gray"><%= Util.convertS(ds.getRptvsubsdt())%>&nbsp;</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">수금방법</td>
        <td width="70" bgcolor="#FFFFFF" class="gray"><%= ds.getClamtmthdcdnm()%>&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">유가월</td>
        <td width="70" bgcolor="#FFFFFF" class="gray"><%= ds.getRptvvalmm()%>&nbsp;</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">분기</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right"><%= ds.getClamtcyclcdnm()%>&nbsp;월</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">이전일자</td>
        <td width="70" bgcolor="#FFFFFF" class="gray"><%= ds.getRptvrdr_movmdt()%>&nbsp;</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">판촉물</td>
        <td width="70" bgcolor="#FFFFFF" class="gray"><%= ds.getRptvbns_item()%>&nbsp;</td>
    </tr>
</table>
<!--구독 정보 상세 끝-->

<script>
    parent.document.all.subs_detail_id.outerHTML = subs_detail_id.outerHTML;
</script>
