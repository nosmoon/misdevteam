<%@ page contentType="text/html; charset=KSC5601" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*
	,  somo.framework.util.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_account_1576_l.jsp
* ��� 	 	 : �Ǹ�����-�渮-����(����)-����������-(���ݰ�꼭)�˾���ȸ
* �ۼ����� 	 : 2012-07-25
* �ۼ��� 	 : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    int	idx = 0;
    int tot_amt = 0;
    int space_cnt = 0;
    String   cur_yymm = "";
    String[] suply_amt = new String[11];
    String[] vat_amt = new String[10];
    String[] uspace = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��" };
    
    //	dataset �ν��Ͻ� ����κ�
    SP_SAL_1530_LDataSet ds = (SP_SAL_1530_LDataSet)request.getAttribute("ds");  // request dataset
    
    
    if(ds.curlist.size() > 0 ) {
    
	    for(int i=0; i<ds.curlist.size(); i++){
	    	SP_SAL_1530_LCURLISTRecord rsltcurRec = (SP_SAL_1530_LCURLISTRecord)ds.curlist.get(i);
	    	
	    	//���ް����÷����
	    	idx = rsltcurRec.suply_amt.length();
	    	System.out.println("idx:"+idx);	    	
	    	for( int n=10; n>=0; n-- ) {
	    		if(idx>0) {
		    		suply_amt[n] = rsltcurRec.suply_amt.substring(idx-1,idx);
		    		idx -= 1;
		    	} else {
		    		suply_amt[n] = "";
		    		space_cnt += 1;
		    	}
	    		
	    		System.out.println("n"+n);	 
	    		
	    	}
	    	
	    	//�����÷����
/*	    	
	    	idx = rsltcurRec.vat_amt.length();
	    	for( int n=9; n>=0; n-- ) {
	    		if(idx>0) {
		    		vat_amt[n] = rsltcurRec.vat_amt.substring(idx-1,idx);
		    		idx -= 1;
		    	} else {
		    		vat_amt[n] = "";
		    		//space_cnt += 1;
		    	}
	    	}
*/	    	
	    	//�հ�ݾ�
	    	tot_amt = Integer.parseInt(rsltcurRec.suply_amt) + Integer.parseInt(rsltcurRec.vat_amt);
	    	cur_yymm = rsltcurRec.make_dt;
%>
  <table border="0" id="taxform_detail_table_id">
    <tr>
      <td align="left"><span style="font-size: 9pt">[������11ȣ����]</span></td>
      <td style="width: 381px" align="right"><img src="/images/btn_print.gif" id="imgbtn_print" border="0" onclick="printDiv();" style="cursor:pointer;" /></td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <table border="0" cellpadding="2" cellspacing="0" width="600" class="sam">
          <tr>
            <td colspan="26" align="center" height="50"><font size="6"><b>��꼭</b></font><font>(���޹޴��ں�����)</font></td>
          </tr>
          <tr>
            <td colspan="26">
              <table width="100%" border="0" cellspacing="0" cellpadding="2" class="sam">
                <tr>
                  <td align="center" rowspan="4" width="20" class="sam">��<br/>��<br/>��</td>
                  <td align="center" width="80" class="sam">��Ϲ�ȣ</td>
                  <td align="center" width="200" colspan="4" class="sam"><span id="l1" style="font-size:16pt;font-weight:bold;"><%=rsltcurRec.ern2%></span></td>
                  <td align="center" rowspan="4" width="20" class="sam">��<br/>��<br/>��<br/>��<br/>��</td>
                  <td align="center" width="80" class="sam">��Ϲ�ȣ</td>
                  <td align="center" width="200" colspan="4" class="sam"><span id="r1" style="font-size:16pt;font-weight:bold;"><%=rsltcurRec.ern%></span></td>                                
                </tr>
                <tr>
                  <td align="center" width="80" class="sam">�� ȣ<br/>(���θ�)</td>
                  <td align="center" colspan="2" width="100" class="sam"><%=rsltcurRec.dlco_nm2%></td>
                  <td align="center" width="20" class="sam">��<br/>��</td>
                  <td align="center" width="80" class="sam"><%=rsltcurRec.presi_nm2%></td>
                  <td align="center" width="80" class="sam">�� ȣ<br/>(���θ�)</td>
                  <td align="center" colspan="2" width="100" class="sam"><%=rsltcurRec.dlco_nm%></td>
                  <td align="center" width="20" class="sam">��<br/>��</td>
                  <td align="center" width="100" class="sam"><%=rsltcurRec.presi_nm%></td>
                </tr>
                <tr>
                  <td align="center" width="80" class="sam">�����<br/>�� ��</td>
                  <td align="center" colspan="4" width="220" class="sam"><%=rsltcurRec.addr2%></td>
                  <td align="center" width="80" class="sam">�����<br/>�� ��</td>
                  <td align="center" colspan="4" width="220" class="sam"><%=rsltcurRec.addr%></td>
                </tr>
                <tr>
                  <td align="center" width="80" class="sam">�� ��</td>
                  <td align="center" width="100" class="sam"><%=rsltcurRec.bizcond2%></td>
                  <td align="center" width="20" class="sam">��<br/>��</td>
                  <td colspan="2" width="100" class="sam"><%=rsltcurRec.item2%></td>
                  <td align="center" width="80" class="sam">�� ��</td>
                  <td align="center" width="100" class="sam"><%=rsltcurRec.bizcond%></td>
                  <td align="center" width="20" class="sam">��<br/>��</td>
                  <td align="center" colspan="2" width="100" class="sam"><%=rsltcurRec.item%></td>
                </tr>
              </table>              
              </td>
          </tr>
          <tr>
            <td height="25" colspan="3" align="center" class="sam">�� &nbsp;&nbsp;��</td>
            <td colspan="12" align="center" class="sam">�� &nbsp;&nbsp;�� &nbsp;&nbsp;��&nbsp;&nbsp;��</td>
            <!--td colspan="10" align="center" class="sam">�� &nbsp;&nbsp;��</td-->
            <td width="280" align="center" style="text-align: center;" class="sam">�� &nbsp;&nbsp;��</td>
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
            <!--td height="22" align="center" class="sam">��</td>
            <td align="center" class="sam">��</td>
            <td align="center" class="sam">õ</td>
            <td align="center" class="sam">��</td>
            <td align="center" class="sam">��</td>
            <td align="center" class="sam">��</td>
            <td align="center" class="sam">õ</td>
            <td align="center" class="sam">��</td>
            <td align="center" class="sam">��</td>
            <td align="center" class="sam">��</td-->
            <td height="45" rowspan="2" align="center" class="sam">&nbsp;</td>
          </tr>
          <tr>
            <td height="23" align="center" class="sam">&nbsp;<%=cur_yymm.substring(2,4)%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=cur_yymm.substring(4,6)%></td>
            <td height="23" align="center" class="sam" >&nbsp;<%=cur_yymm.substring(6,8)%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=uspace[space_cnt-1]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[0]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[1]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[2]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[3]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[4]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[5]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[6]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[7]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[8]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[9]%></td>
            <td height="23" align="center" class="sam">&nbsp;<%=suply_amt[10]%></td>
            <!--td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td>
            <td height="23" align="center" class="sam">&nbsp;</td-->
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
                </tr>
                <tr>
                  <td align="center" class="sam"><%=rsltcurRec.mmdd.substring(0,2)%></td>
                  <td align="center" class="sam"><%=rsltcurRec.mmdd.substring(2,4)%></td>
                  <td align="center" class="sam"><%=rsltcurRec.item_2%></td>
                  <td class="sam">&nbsp;</td>
                  <td align="center" class="sam"><%=Util.comma(Integer.parseInt(rsltcurRec.qunt))%></td>
                  <td align="center" class="sam">&nbsp;</td>
                  <td align="center" class="sam"><%=Util.comma(Integer.parseInt(rsltcurRec.suply_amt_2))%></td>
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
                  <td class="sam">�� <%=Util.comma(tot_amt)%></td>
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
<%
		}
%>

<script>
    parent.document.all.taxform_detail_table_id.outerHTML = taxform_detail_table_id.outerHTML;
//    parent.jsInit();
</script>
<%
	}
	else 
	{
%>
<script>
<%
        	out.print("alert(\"������ ������ �����ϴ�.\");");
        	out.print("window.close();");
%>
</script>
<%
	}
%>