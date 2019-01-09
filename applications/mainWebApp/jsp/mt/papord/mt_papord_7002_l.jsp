<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.MailSender
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_7002_LDataSet ds = (MT_PAPORD_7002_LDataSet)request.getAttribute("ds");		//Data
	MT_PAPORD_7001_LDataSet ds1  = (MT_PAPORD_7001_LDataSet)request.getAttribute("ds1");	//��ȸ�Ⱓ
	MT_PAPORD_7003_LDataSet ds2 = (MT_PAPORD_7003_LDataSet)request.getAttribute("ds2");		//�������, ������̸���
	String sFromEmail           = (String)request.getAttribute("fromEmail");				//�������̸���(������ ����̸���)
	String sToEmail             = "";
	String sPapCmpy             = "";
	String sPapCmnpNm           = "";

	MailSender sender = new MailSender();
	StringBuffer sMailSubject = new StringBuffer();
	StringBuffer sMailContent = new StringBuffer();

	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****�������ڵ�, ������� ************************************************/
		System.out.println("#### ds2.curlist1 : " + ds2.curlist1.size());
		MT_PAPORD_7003_LCURLIST1Record rec2 = (MT_PAPORD_7003_LCURLIST1Record)ds2.curlist1.get(0);
		sPapCmnpNm = rec2.cdnm;
		sPapCmpy   = rec2.cd;

		/****�ŷ�ó������̸��� ************************************************/
		MT_PAPORD_7003_LCURLIST2Record rec3 = (MT_PAPORD_7003_LCURLIST2Record)ds2.curlist2.get(0);
		sToEmail = rec3.chrg_pers_email_1;

		/****�������� ************************************************/
		MT_PAPORD_7001_LCURLISTRecord rec1 = (MT_PAPORD_7001_LCURLISTRecord)ds1.curlist.get(0);

		sMailSubject.append("�����ڵ����ּ�");
		sMailContent.append("<html>");
		sMailContent.append("<head>");
		sMailContent.append("<title></title>");
		sMailContent.append("<style>");
		sMailContent.append("datagrid  {");
		sMailContent.append("/*font-size:11px !important;*/");
		sMailContent.append("font-family:����ü,arial !important;");
		sMailContent.append("focuscolor:#fefae2;");
		sMailContent.append("text-align:center;");
		sMailContent.append("extendlastcol:scroll;");
		sMailContent.append("border-style:solid;");
		sMailContent.append("border-color:#d0d0d0;}");
		sMailContent.append("</style>");
		sMailContent.append("</head>");
		sMailContent.append("<body>");
		sMailContent.append("<table border='0' cellpadding='0' cellspacing='0'>");
		sMailContent.append("<tr>");
		sMailContent.append("<td>������</td>");
		sMailContent.append("<td>" + sPapCmnpNm + "</td>");
		sMailContent.append("<td>��������</td>");
		sMailContent.append("<td>"+rec1.date1.substring(0,4) + "." + rec1.date1.substring(4,6) + "." + rec1.date1.substring(6,8)+" ~ "+rec1.date7.substring(0,4) + "." + rec1.date7.substring(4,6) + "." + rec1.date7.substring(6,8)+"</td>");
		sMailContent.append("</tr>");
		sMailContent.append("</table>");
		sMailContent.append("<table border='0' cellpadding='0' cellspacing='1' bgcolor='#666666' class='datagrid'>");
		sMailContent.append("<tr bgcolor='#999999' align='center'>");
		sMailContent.append("	<td nowrap width='75'  rowspan='2'>����</td>");
		sMailContent.append("	<td nowrap width='60'  rowspan='2'>��������</td>");
		sMailContent.append("	<td nowrap width='111' colspan='2'>"+rec1.date1.substring(0,4) + "." + rec1.date1.substring(4,6) + "." + rec1.date1.substring(6,8)+"</td>");
		sMailContent.append("	<td nowrap width='111' colspan='2'>"+rec1.date2.substring(0,4) + "." + rec1.date2.substring(4,6) + "." + rec1.date2.substring(6,8)+"</td>");
		sMailContent.append("	<td nowrap width='111' colspan='2'>"+rec1.date3.substring(0,4) + "." + rec1.date3.substring(4,6) + "." + rec1.date3.substring(6,8)+"</td>");
		sMailContent.append("	<td nowrap width='111' colspan='2'>"+rec1.date4.substring(0,4) + "." + rec1.date4.substring(4,6) + "." + rec1.date4.substring(6,8)+"</td>");
		sMailContent.append("	<td nowrap width='111' colspan='2'>"+rec1.date5.substring(0,4) + "." + rec1.date5.substring(4,6) + "." + rec1.date5.substring(6,8)+"</td>");
		sMailContent.append("	<td nowrap width='111' colspan='2'>"+rec1.date6.substring(0,4) + "." + rec1.date6.substring(4,6) + "." + rec1.date6.substring(6,8)+"</td>");
		sMailContent.append("	<td nowrap width='111' colspan='2'>"+rec1.date7.substring(0,4) + "." + rec1.date7.substring(4,6) + "." + rec1.date7.substring(6,8)+"</td>");
		sMailContent.append("</tr>");
		sMailContent.append("<tr bgcolor='#999999' align='center'>");
		sMailContent.append("	<td nowrap width='49'>��</td>");
		sMailContent.append("	<td nowrap width='62'>�߷�(kg)</td>");
		sMailContent.append("	<td nowrap width='49'>��</td>");
		sMailContent.append("	<td nowrap width='62'>�߷�(kg)</td>");
		sMailContent.append("	<td nowrap width='49'>��</td>");
		sMailContent.append("	<td nowrap width='62'>�߷�(kg)</td>");
		sMailContent.append("	<td nowrap width='49'>��</td>");
		sMailContent.append("	<td nowrap width='62'>�߷�(kg)</td>");
		sMailContent.append("	<td nowrap width='49'>��</td>");
		sMailContent.append("	<td nowrap width='62'>�߷�(kg)</td>");
		sMailContent.append("	<td nowrap width='49'>��</td>");
		sMailContent.append("	<td nowrap width='62'>�߷�(kg)</td>");
		sMailContent.append("	<td nowrap width='49'>��</td>");
		sMailContent.append("	<td nowrap width='62'>�߷�(kg)</td>");
		sMailContent.append("</tr>");
		/****DATA ************************************************/
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_7002_LCURLISTRecord rec = (MT_PAPORD_7002_LCURLISTRecord)ds.curlist.get(i);
			sMailContent.append("<tr bgcolor='#FFFFFF'>");
			sMailContent.append("	<td>" + rec.fac_clsf_nm + "</td>");
			sMailContent.append("	<td>" + rec.roll_wgt + "</td>");
			sMailContent.append("	<td>" + rec.ordr_roll_cnt_1 + "</td>");
			sMailContent.append("	<td>" + rec.ordr_wgt_1 + "</td>");
			sMailContent.append("	<td>" + rec.ordr_roll_cnt_2 + "</td>");
			sMailContent.append("	<td>" + rec.ordr_wgt_2 + "</td>");
			sMailContent.append("	<td>" + rec.ordr_roll_cnt_3 + "</td>");
			sMailContent.append("	<td>" + rec.ordr_wgt_3 + "</td>");
			sMailContent.append("	<td>" + rec.ordr_roll_cnt_4 + "</td>");
			sMailContent.append("	<td>" + rec.ordr_wgt_4 + "</td>");
			sMailContent.append("	<td>" + rec.ordr_roll_cnt_5 + "</td>");
			sMailContent.append("	<td>" + rec.ordr_wgt_5 + "</td>");
			sMailContent.append("	<td>" + rec.ordr_roll_cnt_6 + "</td>");
			sMailContent.append("	<td>" + rec.ordr_wgt_6 + "</td>");
			sMailContent.append("	<td>" + rec.ordr_roll_cnt_7 + "</td>");
			sMailContent.append("	<td>" + rec.ordr_wgt_7 + "</td>");
			sMailContent.append("</tr>");
		}
		sMailContent.append("</table>");
		sMailContent.append("</body>");
		sMailContent.append("</html>");

		sFromEmail = "webmaster@developer-jsp.com";
		sToEmail = "ykm_0312@nate.com";


		String sMailCheck = "";
		if(sFromEmail == "" || sFromEmail == null){
			sMailCheck = "1";
			rx.add(dataSet,"From",sMailCheck);
			return;
		}
		if(sToEmail == "" || sToEmail == null){
			sMailCheck = "2";
			rx.add(dataSet,"To",sMailCheck);
			return;
		}

		sender.sendmail(sMailSubject.toString(), sMailContent.toString(), sFromEmail, sToEmail);


	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* �ۼ��ð� : Fri Apr 17 17:47:02 KST 2009 */ %>