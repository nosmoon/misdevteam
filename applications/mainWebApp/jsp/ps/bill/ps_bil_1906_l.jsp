<%@ page contentType="text/html; charset=ksc5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_bil_1906_l.jsp
* 기능 : 수금-자동이체청구결과요약
* 작성일자 : 2006-04-19
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    PS_L_SHFT_CLAM_SSUMDataSet ds = (PS_L_SHFT_CLAM_SSUMDataSet)request.getAttribute("ds");
%>
<table width="830" border="0" cellpadding="1" cellspacing="0" class="gray" id="clam_ssum_id">
    <tr align="center" bgcolor="#dddddd">
        <td width="100" class="gray">지사구분</td>
        <td width="100" class="gray">이체구분</td>
        <td width="100" class="gray">청구건수</td>
        <td width="100" class="gray">청구금액</td>
        <td width="100" class="gray">수납건수</td>
        <td width="100" class="gray">수납금액</td>
        <td width="100" class="gray">수수료</td>
        <td width="100" class="gray">지사송금액</td>
    </tr>
    <%--리스트보기 시작%--%>
    <%
    int i = 0;
    for(i=0; i<ds.rsltcur.size(); i++){
        PS_L_SHFT_CLAM_SSUMRSLTCURRecord rsltcurRec = (PS_L_SHFT_CLAM_SSUMRSLTCURRecord)ds.rsltcur.get(i);
    %>
    <tr onclick="javascript:ocom_detl_list(1,'<%=rsltcurRec.shftclsfcd%>','<%= rsltcurRec.bocd%>')"  onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''" style="cursor:hand;" >
        <td height="17" class="gray"><%= rsltcurRec.bonm%>&nbsp;</td>
        <td height="17" class="gray"><%= rsltcurRec.shftclsfnm%>&nbsp;</td>
        <td class="gray" align="right"><%= Util.comma(rsltcurRec.clamnoit)%>&nbsp;	    </td>
        <td class="gray" align="right"><%= Util.comma(rsltcurRec.clamtotamt)%>&nbsp;	</td>
        <td class="gray" align="right"><%= Util.comma(rsltcurRec.recpnoit)%>&nbsp;	    </td>
        <td class="gray" align="right"><%= Util.comma(rsltcurRec.recptotamt)%>&nbsp;	</td>
        <td class="gray" align="right"><%= Util.comma(rsltcurRec.billcoms)%>&nbsp;	    </td>
        <td class="gray" align="right"><%= Util.comma(rsltcurRec.recptotamt-rsltcurRec.billcoms)%>&nbsp;</td>
    </tr>
    <%--빈 줄 생성--%>
    <%
    }

    if(i<3) {
        for(int j=0; j<3-i; j++) {
    %>
    <tr  bgcolor="#FFFFFF">
        <td height="17" class="gray">&nbsp;</td>
        <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
        <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
        <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
        <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
        <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
        <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
        <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
    </tr>
    <%
        }
    }
   %>
</table>

<script language="javascript">
    parent.document.all.clam_ssum_id.outerHTML = document.all.clam_ssum_id.outerHTML;
    <%
        if(ds.rsltcur.size()==0) {
    %>
    alert("검색결과가 없습니다.");
    <%
        }
    %>
</script>
