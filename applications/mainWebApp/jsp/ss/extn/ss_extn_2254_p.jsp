<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%
        response.reset();
        response.setHeader("Content-Type", "application/vnd.ms-excel; charset=KSC5601");
        response.setHeader("Content-Disposition", "attachment; filename=CRMDATA.xls;");
        response.setHeader("Content-Transfer-Encoding", "binary;");
        response.setHeader("Pragma", "no-cache;");
        response.setHeader("Expires", "-1;");
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1665_p.jsp
* ��� : Ȯ����Ȳ-���̹�Ȯ��-����-�μ�
* �ۼ����� : 2004-09-14
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BOCLOS_2DataSet ds = (SS_L_BOCLOS_2DataSet)request.getAttribute("ds");
%>

<html>
<head>
<style>
<!--

.xl26
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;}

-->
</style>
</head>

<body>

<table>
 <tr>
	<td class=xl26 style='border-top:none;border-left:none'>�μ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>��Ʈ</td>
	<td class=xl26 style='border-top:none;border-left:none'>����</td>
	<td class=xl26 style='border-top:none;border-left:none'>������</td>
	<td class=xl26 style='border-top:none;border-left:none'>���࿩��</td>
	<td class=xl26 style='border-top:none;border-left:none'>�ǸŸ�����</td>
	<td class=xl26 style='border-top:none;border-left:none'>�����ڵ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>Ȯ���û</td>
	<td class=xl26 style='border-top:none;border-left:none'>Ȯ������</td>
	<td class=xl26 style='border-top:none;border-left:none'>Ȯ����</td>
	<td class=xl26 style='border-top:none;border-left:none'>Ȯ������</td>
	<td class=xl26 style='border-top:none;border-left:none'>Ȯ�庻��</td>
	<td class=xl26 style='border-top:none;border-left:none'>Ȯ��ǰ����</td>
	<td class=xl26 style='border-top:none;border-left:none'>Ȯ�����</td>
	<td class=xl26 style='border-top:none;border-left:none'>Ȯ���Ÿ</td>
	<td class=xl26 style='border-top:none;border-left:none'>Ȯ����</td>
	<td class=xl26 style='border-top:none;border-left:none'>�����̻�</td>
	<td class=xl26 style='border-top:none;border-left:none'>��������</td>
	<td class=xl26 style='border-top:none;border-left:none'>����Ÿ��</td>
	<td class=xl26 style='border-top:none;border-left:none'>������Ÿ</td>
	<td class=xl26 style='border-top:none;border-left:none'>������Ÿ1</td>
	<td class=xl26 style='border-top:none;border-left:none'>������Ÿ2</td>
	<td class=xl26 style='border-top:none;border-left:none'>������Ÿ3</td>
	<td class=xl26 style='border-top:none;border-left:none'>������Ÿ4</td>
	<td class=xl26 style='border-top:none;border-left:none'>������</td>
	<td class=xl26 style='border-top:none;border-left:none'>������û</td>
	<td class=xl26 style='border-top:none;border-left:none'>��������</td>
	<td class=xl26 style='border-top:none;border-left:none'>�������</td>
	<td class=xl26 style='border-top:none;border-left:none'>��������</td>
	<td class=xl26 style='border-top:none;border-left:none'>��������</td>
	<td class=xl26 style='border-top:none;border-left:none'>����ǰ����</td>
	<td class=xl26 style='border-top:none;border-left:none'>��������Ȯ��</td>
	<td class=xl26 style='border-top:none;border-left:none'>������ŸȮ��</td>
	<td class=xl26 style='border-top:none;border-left:none'>����߼ۺμ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>��������μ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>�ļ�1</td>
	<td class=xl26 style='border-top:none;border-left:none'>�ļ�2</td>
	<td class=xl26 style='border-top:none;border-left:none'>�ļ�3</td>
	<td class=xl26 style='border-top:none;border-left:none'>�ļ�4</td>
	<td class=xl26 style='border-top:none;border-left:none'>�ļ�5</td>
	<td class=xl26 style='border-top:none;border-left:none'>�ļ�6</td>
	<td class=xl26 style='border-top:none;border-left:none'>�ʰ��ļ�6</td>
	<td class=xl26 style='border-top:none;border-left:none'>����Ʈ�μ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>�����μ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>���úμ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>�繫�Ǻμ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>�󰡺μ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>��Ÿ�μ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>ȫ����</td>
	<td class=xl26 style='border-top:none;border-left:none'>���������</td>
	<td class=xl26 style='border-top:none;border-left:none'>����������</td>
	<td class=xl26 style='border-top:none;border-left:none'>������</td>
	<td class=xl26 style='border-top:none;border-left:none'>��Ÿ������</td>
	<td class=xl26 style='border-top:none;border-left:none'>������</td>
	<td class=xl26 style='border-top:none;border-left:none'>����</td>
	<td class=xl26 style='border-top:none;border-left:none'>��������μ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>����μ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>���̼��μ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>�����μ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>�繫�μ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>��պμ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>���Һμ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>�޵��μ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>���̼���</td>
	<td class=xl26 style='border-top:none;border-left:none'>����ݾ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>������αݾ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>�����۷�</td>
	<td class=xl26 style='border-top:none;border-left:none'>������</td>
	<td class=xl26 style='border-top:none;border-left:none'>�繫�ݾ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>��ձݾ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>���ұݾ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>�޵��ݾ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>���μ��ݾ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>�湮���ݾ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>�����ڵ���ü���ݾ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>����ī����ü���ݾ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>�Ϲ�ī����ü���ݾ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>�¶��ΰ������ݾ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>��Ÿ���ݾ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>�̼��Ա�</td>
	<td class=xl26 style='border-top:none;border-left:none'>�ż��Ա�</td>
	<td class=xl26 style='border-top:none;border-left:none'>���Ա�</td>
	<td class=xl26 style='border-top:none;border-left:none'>�������ܼ��ݾ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>����IS���ܼ��ݾ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>����ڵ���ü���κμ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>����Ϲ����κμ�</td>
	<td class=xl26 style='border-top:none;border-left:none'>�̼�</td>
 </tr>
 
<%	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BOCLOS_2CURCOMMLISTRecord curcommlistRec = (SS_L_BOCLOS_2CURCOMMLISTRecord)ds.curcommlist.get(i);%> 
 <tr>
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.deptnm%></td>             
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.partnm%></td>             
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.areanm%></td>             
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.bonm%></td>               
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.oprenvclsfcd%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.sellnetclsf%></td>        
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.dstccd%></td>             
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnaplc%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnemp%></td>        
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnstaf%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnrdr_movm%></td>   
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnhdqt%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnexg%></td>        
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extncnvs%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnetc%></td>        
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnrate%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspmovm%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.susprefu%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspothnwsp%></td>        
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspetc%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspetc1%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspetc2%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspetc3%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspetc4%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.susprate%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspaplc%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspemp%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspstaf%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.susprdr_movm%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.susphdqt%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspexg%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspcnvsrdr_extn%></td>   
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.suspetcrdr_extn%></td>    
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.thmmsendqty%></td>        
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.thmmvalqty%></td>         
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.aftcnt1%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.aftcnt2%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.aftcnt3%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.aftcnt4%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.aftcnt5%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.aftcnt6%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.excsaftcnt6%></td>        
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.aptqty%></td>             
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.villaqty%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.housqty%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.offi_roomqty%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.shopqty%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.etcqty%></td>             
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.pub_infonwsp%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.hdqt_dntnwsp%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.bodntnwsp%></td>          
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.frc_thrwnwsp%></td>       
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.etcfreenwsp%></td>        
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.resvnwsp%></td>           
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.cupn%></td>               
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.thmmno_valqty%></td>      
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.thmmqty%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.nowun_recpqty%></td>      
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.medaqty%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.re_freeqty%></td>         
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.lossqty%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.ppymqty%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.temp_stopqty%></td>            
	<td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.misu%></td>
 </tr>
<%}%> 
</table>

</body>

</html>
