<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1626_p.jsp
* ���     : ���+ ���ݿ�����-����÷��� ȸ�� �˻�
* �ۼ����� : 2005-09-15
* �ۼ���   : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    // dataset �ν��Ͻ� ����κ�
    CO_S_TASOM_RDRIDDataSet ds = (CO_S_TASOM_RDRIDDataSet)request.getAttribute("ds");         //request dataset

    // ���������� dataset
	int mplist_cnt = ds.tasom_rdridlist.size();
%>
<html>
<head>
<title>��������</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
</head>
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<body>
    <table width="600" border="0" cellspacing="0" cellpadding="1" >
      <tr>
        <td>
          <!--title-->
          <table width=100% border=0 cellpadding=0 cellspacing=0>
            <tr>
              <td width=2> <img src="/html/comm_img/pop_ti_01.gif" width=2 height=3 ></td>
              <td background="/html/comm_img/pop_ti_02.gif"></td>
              <td> <img src="/html/comm_img/pop_ti_03.gif" width=2 height=3 ></td>
            </tr>
            <tr>
              <td width=2> <img src="/html/comm_img/pop_ti_04.gif" width=2 height=23 ></td>
              <td background="/html/comm_img/pop_ti_05.gif" align="center" class="pup">&nbsp;&nbsp;&nbsp;
                <img src="/html/comm_img/ic_pup.gif" width="19" height="8" align="absmiddle">
                ��� �÷��� ����
                <img src="/html/comm_img/ic_pup.gif" width="19" height="8"  align="absmiddle">&nbsp;&nbsp;&nbsp;
              </td>
              <td width=2><img src="/html/comm_img/pop_ti_06.gif" width=2 height=23 ></td>
            </tr>
            <tr>
              <td width=2><img src="/html/comm_img/pop_ti_07.gif" width=2 height=7 ></td>
              <td background="/html/comm_img/pop_ti_08.gif"></td>
              <td width=2> <img src="/html/comm_img/pop_ti_09.gif" width=2 height=7 ></td>
            </tr>
          </table>
          <!--���������� -->
          <table width="600" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF">
            <tr bgcolor="#E8E3C4" >
              <td class="gray" width="60"><b>ȸ����</b></td>
              <td class="gray" width="70"><b>ȸ�����̵�</b></td>
              <td class="gray" width="170"><b>����ó</b></td>
              <td class="gray" width="*"><b>�ּ�</b></td>
            </tr>
<% if ( mplist_cnt == 0 ) { %>
            <tr>
              <td class="gray" width="60">&nbsp;  </td>
              <td class="gray" width="70">&nbsp; </td>
              <td class="gray" width="170">&nbsp; </td>
              <td class="gray" width="*">&nbsp;   </td>
            </tr>
<% } else {
        for(int i=0; i<ds.tasom_rdridlist.size(); i++){
            CO_S_TASOM_RDRIDTASOM_RDRIDLISTRecord tasom_rdridlistRec = (CO_S_TASOM_RDRIDTASOM_RDRIDLISTRecord)ds.tasom_rdridlist.get(i);
%>
            <tr>
              <td class="gray" width="60"><%= tasom_rdridlistRec.memb_nm_korn%> </td>
              <td class="gray" width="70"><%= tasom_rdridlistRec.onlmembid%> </td>
              <td class="gray" width="170"><%= tasom_rdridlistRec.tel%> </td>
              <td class="gray" width="*"><%= tasom_rdridlistRec.address%> </td>
            </tr>
<% } } %>
          </table>
            <table width="600">
            <tr>
              	<td align="center">
                    <img src="/html/comm_img/bu_close.gif" width="60" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="javascript:self.close();">
                </td>
			</tr>
            </table>
          <!--�������� ���� ��-->
        </td>
      </tr>
    </table>
</body>
</html>
