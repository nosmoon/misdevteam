<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1215_l.jsp
* 기능 : 관리자-작업-마이그레이션-검증목록
* 작성일자 : 2004-04-01
* 작성자 : 노상현
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_MIGRGUYUKDataSet ds = (SS_L_MIGRGUYUKDataSet)request.getAttribute("ds");
    int migListCount = 5;	// 한 화면당 리스트 항목 수
	int bigListCount = (ds.migrtmpguyukcur.size() > ds.migrcrmguyukcur.size())? ds.migrtmpguyukcur.size() : ds.migrcrmguyukcur.size();
	if (migListCount < bigListCount) {
        migListCount = bigListCount;
	}
	System.out.print(ds.migrtmpguyukcur.size());
	System.out.print(ds.migrcrmguyukcur.size());
%>
    <table width="830" border="0" cellspacing="0" cellpadding="0" class="gray" id="mig_mecd">
    <tr>
        <td height="25" align="left" class="gray">&nbsp;지국도우미</td>
        <td height="25" align="left" class="gray">&nbsp;CRM시스템</td>
    </tr>
    <tr valign="top">
        <td width="50%">
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr bgcolor="#dddddd" align="center">
              <td height="23" class="gray">구역</td>
              <td class="gray">유가</td>
              <td class="gray">준유가</td>
              <td class="gray">무가</td>
              <td class="gray">기타</td>
              <td class="gray">배부수</td>
              <td class="gray">중지독자</td>
            </tr>
            <%-- 목록 반복 시작 --%>
            <%
            for(int i=0; i<ds.migrtmpguyukcur.size(); i++){
                SS_L_MIGRGUYUKMIGRTMPGUYUKCURRecord migrtmpguyukcurRec = (SS_L_MIGRGUYUKMIGRTMPGUYUKCURRecord)ds.migrtmpguyukcur.get(i);%>
            <tr align="center" style="cursor:hand;" onmouseover='this.className="over";' onmouseout='this.className="out";'>
              <td height="23" class="gray"><%= migrtmpguyukcurRec.guyuk%>&nbsp;</td>
              <td class="gray"><%= migrtmpguyukcurRec.yuga%>&nbsp;</td>
              <td class="gray"><%= migrtmpguyukcurRec.jyuga%>&nbsp;</td>
              <td class="gray"><%= migrtmpguyukcurRec.muga%>&nbsp;</td>
              <td class="gray"><%= migrtmpguyukcurRec.etc%>&nbsp;</td>
              <td class="gray"><%= migrtmpguyukcurRec.total%>&nbsp;</td>
              <td class="gray"><%= migrtmpguyukcurRec.jungji%>&nbsp;</td>
            </tr>
            <%}%>
            <%-- 목록 반복 시작 --%>
            <%for(int i=0; i<(migListCount-ds.migrtmpguyukcur.size()); i++){%>
            <tr>
              <td height="23" class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
            <%}%>
            <tr bgcolor="#dddddd">
              <td height="23" colspan="7" class="gray">
                <%-- 합계 --%>&nbsp;
              </td>
            </tr>
          </table>
        </td>
        <td width="50%">
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr bgcolor="#dddddd" align="center">
              <td height="23" class="gray">구역</td>
              <td class="gray">유가</td>
              <td class="gray">준유가</td>
              <td class="gray">무가</td>
              <td class="gray">기타</td>
              <td class="gray">배부수</td>
              <td class="gray">중지독자</td>
            </tr>
            <%-- 목록 반복 시작 --%>
            <%
            for(int i=0; i<ds.migrcrmguyukcur.size(); i++){
                SS_L_MIGRGUYUKMIGRCRMGUYUKCURRecord migrcrmguyukcurRec = (SS_L_MIGRGUYUKMIGRCRMGUYUKCURRecord)ds.migrcrmguyukcur.get(i);%>
            <tr align="center"
			style="cursor:hand;" onmouseover='this.className="over";' onmouseout='this.className="out";'>
              <td height="23" class="gray"><%= migrcrmguyukcurRec.guyuk%>&nbsp;</td>
              <td class="gray"><%= migrcrmguyukcurRec.yuga%>&nbsp;</td>
              <td class="gray"><%= migrcrmguyukcurRec.jyuga%>&nbsp;</td>
              <td class="gray"><%= migrcrmguyukcurRec.muga%>&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray"><%= migrcrmguyukcurRec.total%>&nbsp;</td>
              <td class="gray"><%= migrcrmguyukcurRec.jungji%>&nbsp;</td>
            </tr>
            <%}%>
            <%-- 목록 반복 시작 --%>
            <%for(int i=0; i<(migListCount-ds.migrcrmguyukcur.size()); i++){%>
            <tr>
              <td height="23" class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
            <%}%>
            <tr bgcolor="#dddddd">
              <td height="23" colspan="7" class="gray">
                <%-- 합계 --%> &nbsp;
              </td>
            </tr>
          </table>
        </td>
    </tr>
    </table>

<script>
    parent.document.all.mig_mecd.outerHTML = mig_mecd.outerHTML;

<%if(ds.migrtmpguyukcur.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>    

</script>

