<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1936_l.jsp
* ��� : ���� �����ڵ�,�ڵ�� ��� ��������
* �ۼ����� : 2003-11-20
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� : �ż��� �����ڵ�, ������ ��� �ݿ�
* ������ : ��뼷
* �������� : 2004-02-17
* ������ϸ� : ss_common_1100_l.jsp.backup.20040217
* �������� : SiteMinder  �������� ���� ����� ������  ���������ڵ�, ���������� ��� ȭ�� �ݿ�
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_BO_SEND_INITDataSet ds = (SS_S_BO_SEND_INITDataSet)request.getAttribute("ds");
%>
<select name="areacd" size="1" id="areacd_id" class="sel_all"  id=areacd_id>  <!--�����ڵ�, ������ ���-->
    <option value='' selected>��ü</option>
    <%= ds.areacdcurOptHtml("") %>
</select>
<script>
    parent.document.all.areacd_id.outerHTML = areacd_id.outerHTML;
</script>
