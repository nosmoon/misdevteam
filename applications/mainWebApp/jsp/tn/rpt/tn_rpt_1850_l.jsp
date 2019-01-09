<%@ page contentType="application/vnd.ms-excel; charset=EUC-KR" import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,   java.lang.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.rpt.rec.*
	,	chosun.ciis.tn.rpt.ds.*;
	"%>
<%@ page buffer="none"%>
	
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : tn_rpt_1850_l.jsp
* ��� : ��ݺ���-���Ը��-�����ٿ�ε�
* �ۼ����� : 2017-01-05
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%
	//TrustForm ����.
	//content type�� text/html, text/xml�� �ƴ� ��� �ڵ����� download ��ȯ�̶�� �ϳ� �Ʒ��� ���� �̸� �������� ������ ����� �������� ����.
	//response.reset();  //���������°��̻���
	//response.setHeader("Content-Type", "application/vnd.ms-excel; charset=KSC5601");
	response.setHeader("Content-Disposition","attachment; filename=paymentlist.xls");
	response.setHeader("Content-Description", "JSP Generated Data");
	//response.setHeader("Content-Transfer-Encoding", "binary;");
    //response.setHeader("Pragma", "no-cache;");
    //response.setHeader("Expires", "-1;");

	TN_RPT_1800_LDataSet ds = (TN_RPT_1800_LDataSet)request.getAttribute("ds");
%>
<%--
    int Csize = 477;
    //System.out.print(">>>>>>>>>bong����::");
    //System.out.print(">>>>>>>>>bong::"+ds.curlist.getBytes());
     //System.out.print(">>>>>>>>>bong::"+ds.curlist.length);
     //int stringByteLength = ds.curlist.getBytes();
    //System.out.print(">>>>>>>>>stringByteLength::"+stringByteLength);
	//Csize = stringByteLength + 517;
	/*
	response.setHeader("Accept-Ranges", "bytes");

	for(int i=0; i<ds.curlist.size(); i++){
		TN_RPT_1800_LCURLISTRecord curlistRec = (TN_RPT_1800_LCURLISTRecord)ds.curlist.get(i); 
 
		Csize = Csize + curlistRec.membercode.getBytes().length;         
		Csize = Csize + curlistRec.name.getBytes().length;       
		Csize = Csize + curlistRec.memo.getBytes().length;
		Csize = Csize + curlistRec.cellphone.getBytes().length;
		Csize = Csize + curlistRec.address1.getBytes().length;
		Csize = Csize + curlistRec.promisecode.getBytes().length;
		Csize = Csize + curlistRec.promisedate.getBytes().length;
		Csize = Csize + curlistRec.paydate.getBytes().length;
		Csize = Csize + curlistRec.bankaccount.getBytes().length;     
		Csize = Csize + curlistRec.payprice.getBytes().length;     
		Csize = Csize + curlistRec.totalpayprice.getBytes().length;  
		Csize = Csize + curlistRec.paymemo.getBytes().length; 
		Csize = Csize + curlistRec.promiseprice.getBytes().length;
		Csize = Csize + curlistRec.paymethodnm.getBytes().length;			
		Csize = Csize + curlistRec.partitiontype.getBytes().length; 
		Csize = Csize + curlistRec.paystartdate.getBytes().length;  
		Csize = Csize + curlistRec.payenddate.getBytes().length;  
		Csize = Csize + curlistRec.monthlypayday.getBytes().length;  
		Csize = Csize + curlistRec.monthlypayprice.getBytes().length;  
		Csize = Csize + curlistRec.partitioncount.getBytes().length;  
		Csize = Csize + curlistRec.onlineproyn.getBytes().length;  
		Csize = Csize + curlistRec.writedate.getBytes().length;  
		Csize = Csize + curlistRec.fund2.getBytes().length; 
		Csize = Csize + 274;
		
	}	
	
	Csize = Csize + 26;
	System.out.println(":::"+Csize);
	response.setContentLength(Csize);	

	//System.out.print(">>>>>>>>>>>rt_length::"+Csize);
   
--%>
<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=KSC5601" />
</head>
<body>
<table border="1">
<tr> 
<td> �̸� </td>
<td> �ֹι�ȣ </td>
<td> ȸ���޸� </td>
<td> �޴���ȭ </td>
<td> �ּ� </td>
<td> �����ڵ� </td>
<td> �����ݾ� </td>
<td> ���Թ�� </td>
<td> �г���� </td>
<td> �г��� </td>
<td> �г�Ƚ�� </td>
<td> �����޸� </td>
<td> ���2�� </td>
<td> ������ </td>
<td> ���Ծ�  </td>
<td> �������Ծ�  </td>
<td> ���԰���  </td>
<td> ���Ը޸�  </td>
<td> ���������  </td>
<td> ������  </td>
</tr>
<%
for(int j=0; j<ds.curlist.size(); j++){
	TN_RPT_1800_LCURLISTRecord curlistRec = (TN_RPT_1800_LCURLISTRecord)ds.curlist.get(j);
%>
<tr>      
<td><%= curlistRec.name%>&nbsp;</td>
<td><%= curlistRec.member_regno%>&nbsp;</td>       
<td><%= curlistRec.memo%>&nbsp;</td>
<td><%= curlistRec.cellphone%>&nbsp;</td>
<td><%= curlistRec.address1%>&nbsp;</td>
<td><%= curlistRec.promisecode%>&nbsp;</td>
<td><%= curlistRec.promiseprice%></td>
<td><%= curlistRec.paymethodnm%>&nbsp;</td>
<td><%= curlistRec.partitiontype%>&nbsp;</td> 
<td><%= curlistRec.monthlypayprice%></td>  
<td><%= curlistRec.partitioncount%></td>  
<td><%= curlistRec.onlineproyn%>&nbsp;</td> 
<td><%= curlistRec.fund2%>&nbsp;</td> 
<td><%= curlistRec.paydate%></td>     
<td><%= curlistRec.payprice%></td>     
<td><%= curlistRec.totalpayprice%></td>  
<td><%= curlistRec.bankaccount%>&nbsp;</td>     
<td><%= curlistRec.paymemo%>&nbsp;</td> 
<td><%= curlistRec.promisedate%>&nbsp;</td>
<td><%= curlistRec.writedate%>&nbsp;</td>  
</tr>
<%
}
%>
</table>
</body>
</html>