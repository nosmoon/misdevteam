<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1816_p.jsp
* ���     : �����ڰ��� ���ڰ˻� ������ �� Link
* �ۼ����� : 2003-12-12
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    // dataset �ν��Ͻ� ����κ�
    PS_S_READERINFODataSet ds = (PS_S_READERINFODataSet)request.getAttribute("ds");         //request dataset

    // ���������� dataset
    PS_S_READERINFOREADINFOCURRecord readinfocurRec = null;
    boolean  rdrChk = false;            //������ ����Ÿ ����üũ

    if (ds.readinfocur.size() > 0) {
        readinfocurRec = (PS_S_READERINFOREADINFOCURRecord)ds.readinfocur.get(0);
        rdrChk  =  true;
    }
%>
<html>
<head>
<title>��������</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
</head>
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<body>
    <table width="830" border="0" cellspacing="0" cellpadding="2" >
      <tr>
        <td
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
                ���� �� ����
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
          <!--title end-->
          <!--�⺻����-->
          <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#ffffff">
            <tr bgcolor="#E8E3C4">
              <td colspan="7" class="gray"><b>�⺻ ����</b>&nbsp;&nbsp; </td>
            <% if(readinfocurRec.rdrgrad_dt.equals("")) { %>
              <td width="160" class="gray" >&nbsp;</td>
            <% } else { %>
              <td width="160" class="gray" ><img src="/html/comm_img/mp_new3.gif"> ���ڵ�� : <%=readinfocurRec.rdrgrad_dt%></td>
            <% } %>
            </tr>
            <tr>
              <td width="60"  class="gray" bgcolor="#DDDDDD"><b><font color="#0b0033">���ڹ�ȣ</font></b></td>
              <td width="160" class="gray" >&nbsp;<%= readinfocurRec.rdr_no%> </td>
              <td width="60"  class="gray" bgcolor="#DDDDDD">���ڸ�</td>
              <td width="150" class="gray">&nbsp;<%=readinfocurRec.rdrnm%> </td>
              <td width="60"  class="gray" bgcolor="#DDDDDD">��û����</td>
              <td width="138" class="gray">&nbsp;<%= readinfocurRec.aplcdt%> </td>
              <td width="60"  class="gray" bgcolor="#DDDDDD">�躻����</td>
              <td width="138" class="gray">&nbsp;<%= readinfocurRec.delidt%> </td>
            </tr>
            <tr>
              <td width="60"  class="gray" bgcolor="#DDDDDD"><b><font color="#0b0033">����</font></b></td>
              <td width="160" class="gray">&nbsp;<%=readinfocurRec.bonm%></td>
              <td width="60"  class="gray" bgcolor="#DDDDDD">��û��ü</td>
              <td width="150" class="gray">&nbsp;<%=readinfocurRec.medicd%> </td>
              <td width="60"  class="gray" bgcolor="#DDDDDD">�����</td>
              <td width="138" class="gray">&nbsp;<%=readinfocurRec.subsyys%></td>
              <td width="60"  class="gray" bgcolor="#DDDDDD">����ȣ��</td>
              <td width="138" class="gray">&nbsp;<%= readinfocurRec.subs_serno%></td>
            </tr>
            <tr>
              <td height="3" colspan="6">
                <!--����-->
              </td>
            </tr>
          </table>
          <!--�⺻���� ��-->
          <!--���������� -->
          <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#FFFFFF">
            <tr bgcolor="#E8E3C4" >
              <td colspan="8" class="gray"><b>����������</b></td>
            </tr>
            <tr>
              <td class="gray" bgcolor="#DDDDDD" width="60">����</td>
              <td class="gray" width="120">&nbsp;<%= readinfocurRec.acqnm%></td>
              <td class="gray" bgcolor="#DDDDDD" width="60">��ü����</td>
              <td class="gray" width="220">&nbsp;<%= readinfocurRec.paty_clsfcd%> &nbsp;&nbsp;&nbsp; ��ü��  </td>
              <td class="gray" bgcolor="#DDDDDD" width="60">��ȭ��ȣ</td>
              <td class="gray" width="125">&nbsp;<%= readinfocurRec.rdrtel_no%></td>
              <td class="gray" bgcolor="#DDDDDD" width="60">�޴���</td>
              <td class="gray" width="125">&nbsp;<%= readinfocurRec.rdrptph_no%></td>
            </tr>
            <tr>
              <td class="gray" bgcolor="#DDDDDD" width="60">�ּ�</td>
              <td colspan="7" class="gray">&nbsp;<%= readinfocurRec.dlvaddr%></td>
            </tr>
          </table>
          <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray1" bgcolor="#FFFFFF">
            <tr>
              <td class="gray" bgcolor="#DDDDDD" width="60">�߼۹��</td>
              <td class="gray" width="100">&nbsp;<%= readinfocurRec.sendmthd%></td>
              <td class="gray" bgcolor="#DDDDDD" width="60">���뱸��</td>
              <td class="gray" width="110">&nbsp;<%= readinfocurRec.recpclsf%></td>
              <td class="gray" bgcolor="#DDDDDD" width="60">�����</td>
              <td class="gray" width="115">&nbsp;<%= readinfocurRec.rdroffinm%></td>
              <td class="gray" bgcolor="#DDDDDD" width="60">��å</td>
              <td class="gray" width="65">&nbsp;<%= readinfocurRec.rdrposi%> </td>
              <td class="gray" width="60" bgcolor="#DDDDDD">������ȭ</td>
              <td class="gray" width="125">&nbsp;<%= readinfocurRec.rdroffitel_no%></td>
            </tr>
            <tr>
              <td class="gray" bgcolor="#DDDDDD" width="60">�̸���</td>
              <td class="gray" colspan="3">&nbsp;<%= readinfocurRec.email%></td>
              <td class="gray" bgcolor="#DDDDDD" width="60" >�ֹι�ȣ </td>
              <td class="gray" width="115">&nbsp;<%= readinfocurRec.prn%></td>
              <td class="gray" bgcolor="#DDDDDD" width="60" >�������</td>
              <td class="gray" colspan="3">&nbsp;<%= readinfocurRec.bidt%>
              </td>
            </tr>
            <tr>
              <td height="3" colspan="10">
                <!--����-->
              </td>
            </tr>
          </table>
          <!--������ ���� ��-->
          <!--��û�� �������� ���� -->
          <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#FFFFFF">
            <tr bgcolor="#E8E3C4">
              <td colspan="10" class="gray"><b>��û������</b>&nbsp;&nbsp; </td>
            </tr>
            <tr>
              <td width="60" class="gray" bgcolor="#DDDDDD">����</td>
              <td width="100" class="gray">&nbsp;<%= readinfocurRec.aplc_persflnm%> </td>
              <td width="60" class="gray" bgcolor="#DDDDDD">�����</td>
              <td width="100" class="gray">&nbsp;<%= readinfocurRec.aplc_persoffinm%></td>
              <td width="60" class="gray" bgcolor="#DDDDDD">��å</td>
              <td width="60" class="gray">&nbsp;<%= readinfocurRec.aplc_persposi%></td>
              <td width="60" class="gray" bgcolor="#DDDDDD">��ȭ��ȣ</td>
              <td width="125" class="gray">&nbsp;<%= readinfocurRec.aplc_perstel_no%></td>
              <td width="60" class="gray" bgcolor="#DDDDDD">�޴���</td>
              <td class="gray" width="125">&nbsp;<%= readinfocurRec.aplc_persptph_no%></td>
            </tr>
            <tr>
              <td height="3" colspan="10">
                <!--����-->
              </td>
            </tr>
          </table>
          <!--��û�� ���� �� -->
          <!--û�������� ���� -->
          <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#FFFFFF">
            <tr bgcolor="#E8E3C4">
              <td colspan="10" class="gray"><b>û��������</b>&nbsp;&nbsp; </td>
            </tr>
            <tr>
              <td width="60" class="gray" bgcolor="#DDDDDD">����</td>
              <td width="100" class="gray">&nbsp;<%= readinfocurRec.clamplflnm%></td>
              <td width="60" class="gray" bgcolor="#DDDDDD">�����</td>
              <td width="100" class="gray">&nbsp;<%= readinfocurRec.clamploffinm%></td>
              <td width="60" class="gray" bgcolor="#DDDDDD">��å</td>
              <td width="60" class="gray">&nbsp;<%= readinfocurRec.clamplposi%></td>
              <td width="60" class="gray" bgcolor="#DDDDDD">��ȭ��ȣ</td>
              <td width="125" class="gray">&nbsp;<%= readinfocurRec.clampltel_no%> </td>
              <td width="60" class="gray" bgcolor="#DDDDDD">�޴���</td>
              <td  class="gray" width="125">&nbsp;<%= readinfocurRec.clamplptph_no%></td>
            </tr>
            <tr>
              <td width="60" class="gray" bgcolor="#DDDDDD">�ּ�</td>
              <td colspan="9" class="gray">&nbsp;<%= readinfocurRec.clampladdr%> </td>
            </tr>
            <tr>
              <td height="3" colspan="10">
                <!--����-->
              </td>
            </tr>
          </table>
          <!--û�������� �� -->
          <!--�������� ���� ���� -->
          <table width="830" border="0" cellspacing="0" cellpadding="2"  class="gray" bgcolor="#FFFFFF">
            <tr bgcolor="#E8E3C4">
              <td colspan="6" class="gray"><b>������������</b></td>
            </tr>
            <tr>
              <td width="60" class="gray" bgcolor="#DDDDDD">��������</td>
              <td width="220" class="gray">&nbsp;<%= readinfocurRec.acpntypeclsf%>&nbsp;
              <td width="60" class="gray" bgcolor="#DDDDDD">�߼ۿ���</td>
              <td width="220" class="gray">&nbsp;<%= readinfocurRec.sendyncd%></td>
              <td width="60" class="gray" bgcolor="#DDDDDD">����ó��</td>
              <td width="228" class="gray">&nbsp;<%= readinfocurRec.alonpaycd%></td>
            </tr>
            <tr>
              <td width="60" class="gray" bgcolor="#DDDDDD">Ȯ����</td>
              <td width="220" class="gray">&nbsp;<%= readinfocurRec.aplcpathnm%>&nbsp;
              <td width="60" class="gray" bgcolor="#DDDDDD">Ȯ������</td>
              <td width="220" class="gray">&nbsp;<%= readinfocurRec.rdr_extntypenm%></td>
              <td width="60" class="gray" bgcolor="#DDDDDD">��������</td>
              <td width="228" class="gray">&nbsp;<%= readinfocurRec.suspresnnm%></td>
            </tr>
            <tr>
              <td width="60" class="gray" bgcolor="#DDDDDD">�Աݹ��</td>
              <td width="220" class="gray"> &nbsp;<%= readinfocurRec.rcpmmthd%> </td>
              <td width="60" class="gray" bgcolor="#DDDDDD">�����ݾ�</td>
              <td width="220" class="gray">&nbsp;<%= readinfocurRec.realsellamt%> </td>
               <td width="60" class="gray" bgcolor="#DDDDDD">�̼��ݾ�</td>
              <td width="228" class="gray">&nbsp;<font color="red"><%= readinfocurRec.un_clamtamt%></font></td>
           </tr>
            <tr>
              <td width="60" class="gray" bgcolor="#DDDDDD">�Ա��Ѿ�</td>
              <td width="788" class="gray" colspan="5">&nbsp;<font color="red"><%= readinfocurRec.ttl_rcpmamt%></font> : <%= readinfocurRec.rcpm_list%></td>
            </tr>
            <tr>
              <td width="60" class="gray" bgcolor="#DDDDDD">�������</td>
              <td width="220" class="gray">&nbsp;<%= readinfocurRec.amno%></td>
              <td width="60" class="gray" bgcolor="#DDDDDD">�������</td>
              <td width="220" class="gray">&nbsp;<%= readinfocurRec.mang_empno%>></td>
              <td width="60" class="gray" bgcolor="#DDDDDD">������</td>
              <td width="228" class="gray">&nbsp;<%= readinfocurRec.hdqtemp_no%></td>
            </tr>
          </table>
          <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray1" bgcolor="#FFFFFF">
            <tr>
              <td width="60" class="gray" bgcolor="#DDDDDD">Ȯ���ȣ</td>
              <td width="140" class="gray">&nbsp;<%= readinfocurRec.rdr_extnno%> </td>
              <td width="60" class="gray" bgcolor="#DDDDDD">�����ȣ</td>
              <td width="140" class="gray">&nbsp;<%= readinfocurRec.arbtno%> </td>
              <td width="60" bgcolor="#DDDDDD" class="gray">��꼭</td>
              <td width="180" class="gray">&nbsp;<%= readinfocurRec.taxstmtexne%> &nbsp;
              </td>
              <td width="60" class="gray" bgcolor="#DDDDDD">�߱�����</td>
              <td width="148" class="gray">&nbsp;<%= readinfocurRec.taxstmtissudt%> </td>
            </tr>
            <tr>
              <td width="60" class="gray" bgcolor="#DDDDDD">�޸�</td>
              <td colspan="7" class="gray">&nbsp;<%= readinfocurRec.memo%></td>
            </tr>
            </table>
            <table width="830">
            <tr>
              	<td align="center">
                    <img src="/html/comm_img/bu_close.gif" width="60" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="javascript:self.close();">
                </td>
			</tr>
            </table>
          </table>
          <!--�������� ���� ��-->
        </td>
      </tr>
    </table>
</body>
</html>