<%@ page contentType="text/html; charset=KSC5601" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_account_1573_p.jsp
* ��� 	 	 : �Ǹ�����-�渮-����(����)-����������(���ݰ�꼭)�˾�
* �ۼ����� 	 : 2012-07-25
* �ۼ��� 	 : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<html xmlns="http://www.w3.org/1999/xhtml" >
<head><title>
	��ġ����޷�(���ݰ�꼭)
</title>
    
<style type="text/css">
body, table, tr, td {font-size:12px; font-family:"����", Arial;}
.sam {border:1px solid black; border-collapse:collapse;}
</style>
<script type="text/javascript" language="JavaScript">

    //�������� �ε��ɶ� �⺻������ �˻�
    function default_search(){
        var ls_args = ""; // dialog argument
        var sale_yymm = "";
        var cta_rdr_extn_amt_clsf = "";
        var bo_cd = "";
        
        
        if(window.dialogArguments){
           ls_args = window.dialogArguments;

           var sale_yymm             = ls_args.sale_yymm;
           var cta_rdr_extn_amt_clsf = ls_args.cta_rdr_extn_amt_clsf;
           var bo_cd                  = ls_args.bo_cd;
          // alert ("������"+sale_yymm+'*'+cta_rdr_extn_amt_clsf+'*'+ bo_cd);
           window.returnValue = ls_args;
           list_search(sale_yymm,cta_rdr_extn_amt_clsf,bo_cd);
        }

    }
    
    
    function list_search(sale_yymm,cta_rdr_extn_amt_clsf,bo_cd) {
	var lo_form = document.taxform_detail_form;

	lo_form.sale_yymm.value = sale_yymm;
	lo_form.cta_rdr_extn_amt_clsf.value = cta_rdr_extn_amt_clsf;
	lo_form.bo_cd.value = bo_cd;
	
	lo_form.method = "post";
	lo_form.action = "/sp/sal/1531";
	lo_form.target = "ifrm";
        lo_form.submit();
    }
    
    
    function printDiv () {
	window.print();
	window.close();
    }

</script>

</head>
<body onload="default_search();">
<center>
   <form name="taxform_detail_form" method="post" action="">
   <input type="hidden" name="sale_yymm" value="">
   <input type="hidden" name="cta_rdr_extn_amt_clsf" value="">
   <input type="hidden" name="bo_cd" value="">
   
    <span id="taxspan" width="600">
           <table border="0" id="taxform_detail_table_id">
              <tr>
                <td align="left"><span style="font-size: 9pt">[������11ȣ����]</span></td>
                <td style="width: 381px" align="right"><img src="/images/btn_print.gif" id="imgbtn_print" border="0" onclick="printDiv();" style="cursor:pointer;" /></td>
              </tr>
              <tr>
                <td colspan="2" align="center">
                  <table border="0" cellpadding="2" cellspacing="0" width="600" class="sam">
                    <tr>
                      <td colspan="26" align="center" height="50"><font size="6"><b>���ݰ�꼭</b></font><font>(���޹޴��ں�����)</font></td>
                    </tr>
                    <tr>
                      <td colspan="26">
                        <table width="100%" border="0" cellspacing="0" cellpadding="2" class="sam">
                          <tr>
                            <td rowspan="4" width="20" align="center" class="sam">��<br/>��<br/>��</td>
                            <td width="80" class="sam">��Ϲ�ȣ</td>
                            <td width="200" colspan="4" class="sam" align="center"><span id="l1" style="font-size:16pt;font-weight:bold;">&nbsp;</span></td>
                            <td rowspan="4" width="20" align="center" class="sam">��<br/>��<br/>��<br/>��<br/>��</td>
                            <td width="80" class="sam">��Ϲ�ȣ</td>
                            <td width="200" colspan="4" class="sam" align="center"><span id="r1" style="font-size:16pt;font-weight:bold;">&nbsp;</span></td>                                
                          </tr>
                          <tr>
                            <td width="80" class="sam">�� ȣ<br/>(���θ�)</td>
                            <td colspan="2" width="100" align="left" class="sam">&nbsp;</td>
                            <td width="20" class="sam">��<br/>��</td>
                            <td width="80" align="left" class="sam">&nbsp;</td>
                            <td width="80" class="sam">�� ȣ<br/>(���θ�)</td>
                            <td colspan="2" width="100" align="left" class="sam">&nbsp;</td>
                            <td width="20" class="sam">��<br/>��</td>
                            <td width="100" align="left" class="sam">&nbsp;</td>
                          </tr>
                          <tr>
                            <td width="80" class="sam">�����<br/>�� ��</td>
                            <td colspan="4" width="220" align="left" class="sam">&nbsp;</td>
                            <td  width="80" class="sam">�����<br/>�� ��</td>
                            <td colspan="4" width="220" align="left" class="sam">&nbsp;</td>
                          </tr>
                          <tr>
                            <td width="80" class="sam">�� ��</td>
                            <td width="100" align="left" class="sam">&nbsp;</td>
                            <td width="20" class="sam">��<br/>��</td>
                            <td colspan="2" width="100" align="left" class="sam">&nbsp;</td>
                            <td width="80" class="sam">�� ��</td>
                            <td width="100" align="left" class="sam">&nbsp;</td>
                            <td width="20" class="sam">��<br/>��</td>
                            <td colspan="2" width="100" align="left" class="sam">&nbsp;</td>
                          </tr>
                        </table>              
                        </td>
                    </tr>
                    <tr>
                      <td height="25" colspan="3" align="center" class="sam">�� &nbsp;&nbsp;��</td>
                      <td colspan="12" align="center" class="sam">�� &nbsp;&nbsp;�� &nbsp;&nbsp;��&nbsp;&nbsp;��</td>
                      <td colspan="10" align="center" class="sam">�� &nbsp;&nbsp;��</td>
                      <td align="center" style="text-align: center;" class="sam">�� &nbsp;&nbsp;��</td>
                    </tr>
                    <tr>
                      <td height="22" align="center" class="sam">��</td>
                      <td align="center" class="sam">��</td>
                      <td align="center" class="sam">��</td>
                      <td height="22" align="center" class="sam"><span style="font-size: 8pt; font-family: ����">����</span></td>
                      <td align="center" class="sam">��</td>
                      <td align="center" class="sam">��</td>
                      <td align="center" class="sam">��</td>
                      <td align="center" class="sam">õ</td>
                      <td align="center" class="sam">��</td>
                      <td align="center" class="sam">��</td>
                      <td align="center" class="sam">��</td>
                      <td align="center" class="sam">õ</td>
                      <td align="center" class="sam">��</td>
                      <td align="center" class="sam">��</td>
                      <td align="center" class="sam">��</td>
                      <td height="22" align="center" class="sam">��</td>
                      <td align="center" class="sam">��</td>
                      <td align="center" class="sam">õ</td>
                      <td align="center" class="sam">��</td>
                      <td align="center" class="sam">��</td>
                      <td align="center" class="sam">��</td>
                      <td align="center" class="sam">õ</td>
                      <td align="center" class="sam">��</td>
                      <td align="center" class="sam">��</td>
                      <td align="center" class="sam">��</td>
                      <td height="45" rowspan="2" align="center" style="width: 99px" class="sam">&nbsp;</td>
                    </tr>
                    <tr>
                      <td height="23" align="center" class="sam">&nbsp;</td>
                      <td height="23" align="center" class="sam">&nbsp;</td>
                      <td height="23" align="center" class="sam">&nbsp;</td>
                      <td height="23" align="center" class="sam">&nbsp;</td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp;0</td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp; </td>
                      <td height="23" align="center" class="sam">&nbsp;0</td>
                    </tr>
                    <tr>
                      <td colspan="26" height="86">
                        <table cellpadding="1" cellspacing="0" width="100%" class="sam">
                          <tr align="center">
                            <td class="sam">��</td>
                            <td class="sam">��</td>
                            <td class="sam">ǰ ��</td>
                            <td class="sam">�� ��</td>
                            <td class="sam">�� ��</td>
                            <td class="sam">�� ��</td>
                            <td class="sam">���ް���</td>
                            <td class="sam">�� ��</td>
                            <td class="sam">�� ��</td>
                          </tr>
                          <tr>
                            <td align="center" class="sam">&nbsp;</td>
                            <td align="center" class="sam">&nbsp;</td>
                            <td align="center" class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td align="center" class="sam">0</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td align="right" class="sam">0</td>
                            <td align="right" class="sam">0</td>
                            <td class="sam">&nbsp;</td>
                          </tr>
                          <tr>
                            <td align="center" class="sam">&nbsp;</td>
                            <td align="center" class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td align="center" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                          </tr>
                          <tr>
                            <td align="center" class="sam">&nbsp;</td>
                            <td align="center" class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td align="center" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                          </tr>
                          <tr>
                            <td align="center" class="sam">&nbsp;</td>
                            <td align="center" class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td align="center" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td align="right" class="sam">&nbsp;</td>
                            <td></td>
                          </tr>
                        </table>              
                        </td>
                    </tr>
                    <tr>
                      <td colspan="26">
                        <table cellpadding="1" cellspacing="0" width="100%" class="sam">
                          <tr align="center">
                            <td class="sam">�� �� �� ��</td>
                            <td class="sam">�� ��</td>
                            <td class="sam">�� ǥ</td>
                            <td class="sam">�� ��</td>
                            <td class="sam">�� �� �� �� ��</td>
                            <td rowspan="2" width="120" align="center" class="sam"><span style="font-size: 9pt; font-family: ����ü">�� �ݾ��� <br/>���� ��.
                                </span></td>
                          </tr>
                          <tr align="center">
                            <td class="sam">��0</td>
                            <td class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                            <td class="sam">&nbsp;</td>
                          </tr>
                        </table>
                        </td>
                    </tr>
                  </table>
                </td>
              </tr>
              <tr>
                <td align="left" style="height: 16px">22226-28131��'95.1.25����</td>
                <td align="right" style="width: 421px; height: 16px;">�μ����(Ư��)34g/m 182mm*128mm</td>
              </tr>
          </table>       
          </span>
    </form>
</center>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=00 height=00></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>