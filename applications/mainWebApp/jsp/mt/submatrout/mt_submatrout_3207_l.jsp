<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.MailSender
	,	chosun.ciis.mt.submatrout.rec.*
	,	chosun.ciis.mt.submatrout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATROUT_3207_LDataSet ds = (MT_SUBMATROUT_3207_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	//dataSet = rx.add(root, "dataSet", "");
	MailSender sender = new MailSender();
	StringBuffer sMailSubject = new StringBuffer();
	StringBuffer sMailContent = new StringBuffer();
	String sToEmail = null;


	try {

		/****** CURLIST1 BEGIN */
		if( ds.curlist.size() > 0 ){
			MT_SUBMATROUT_3207_LCURLISTRecord rec0 = (MT_SUBMATROUT_3207_LCURLISTRecord)ds.curlist.get(0);
			sToEmail   = rec0.chrg_pers_email;

 			sMailSubject.append("���ּ�");
			sMailContent.append("<html>");
			sMailContent.append("<head>");
			sMailContent.append("<title></title>");
			sMailContent.append("<style>");
			sMailContent.append("datagrid  { ");
			sMailContent.append("/*font-size:11px !important;*/ ");
			sMailContent.append("font-family:����ü,arial !important;");
			sMailContent.append("focuscolor:#fefae2; ");
			sMailContent.append("text-align:center;  ");
			sMailContent.append("extendlastcol:scroll; ");
			sMailContent.append("border-style:solid;  ");
			sMailContent.append("border-color:#d0d0d0;} ");
			sMailContent.append("</style> ");
			sMailContent.append("</head> ");
			sMailContent.append("<body>  ");
			sMailContent.append("<table border='0' cellpadding='0' cellspacing='0' width='1000'> ");
			sMailContent.append("<tr>");
			sMailContent.append("<td>����ó : </td>");
			sMailContent.append("<td>"+ rec0.dlco_nm + "</td>");
		    sMailContent.append("</tr>   	");
			sMailContent.append("<tr> ");
			sMailContent.append("<td>����� : </td>");
			sMailContent.append("<td>" + rec0.dlco_per + " </td>");
		    sMailContent.append("</tr> ");
		    sMailContent.append("<tr>");
			sMailContent.append("<td>����ó : </td>");
			sMailContent.append("<td> �� : " + rec0.dlco_telno + "/ FAX : " + rec0.dlco_faxno + "</td>   ");
			sMailContent.append("</tr> ");
			sMailContent.append("<tr>");
			sMailContent.append("<td></td>");
			sMailContent.append("<td> H.P :  </td>");
		    sMailContent.append("</tr>");
		    sMailContent.append("<tr><td colspan=2>&nbsp;</td> </tr>");
		    sMailContent.append("<tr><td colspan=2>&nbsp;</td> </tr>");
		    sMailContent.append("<tr>");
			sMailContent.append("<td>�߽� :  </td>");
			sMailContent.append("<td>(��)�����Ϻ���&nbsp;" + rec0.dept_nm + " </td>");
		    sMailContent.append("</tr> ");
			sMailContent.append("<tr>");
			sMailContent.append("<td>����� : </td>");
			sMailContent.append("<td>" + rec0.ordr_per_nm + " </td>");
		    sMailContent.append("</tr> ");
		    sMailContent.append("<tr>");
			sMailContent.append("<td>����ó : </td> ");
			sMailContent.append("<td> �� : " + rec0.ordr_telno + " / FAX : " + rec0.ordr_faxno + " / E-MAIL : " + rec0.ordr_per_email + "</td> ");
			sMailContent.append("</tr>");
			sMailContent.append("<tr> ");
			sMailContent.append("<td></td>");
			sMailContent.append("<td> H.P : " + rec0.ordr_hp + " </td>");
		    sMailContent.append("</tr> ");
		    sMailContent.append("<tr><td colspan=2>&nbsp;</td> </tr>");
		    sMailContent.append("<tr>");
			sMailContent.append("<td colspan=2>�Ʒ��� ���� �����Ͽ��� ���⳻�� ��ǰ�Ͽ� �ֽñ� �ٶ��ϴ�.</td>");
		    sMailContent.append("</tr>");
		    sMailContent.append("<tr>");
		    sMailContent.append("<td colspan=2 align=right>" + rec0.ordr_dt.substring(0,4) + "��" + rec0.ordr_dt.substring(4,6) + " ��" + rec0.ordr_dt.substring(6,8)+ "</td>");
		    sMailContent.append("</tr>");
		    sMailContent.append("<tr><td colspan=2>&nbsp;</td> </tr>");
		    sMailContent.append("<tr><td colspan=2>&nbsp;</td> </tr>	");
		    sMailContent.append("<tr><td colspan=2 align=center>�� &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ��</td> </tr>");
		    sMailContent.append("<tr><td colspan=2 align=right>(�ΰ�������)</td> </tr>");
		    sMailContent.append("<tr><td colspan=2 align=center>");
		    sMailContent.append("<table border='1' cellpadding='0' cellspacing='0' width='950' class='datagrid'>");
		    sMailContent.append("<tr align=center> <td>NO</td><td>ǰ��</td><td>�԰�</td><td>����</td><td>�ܰ�</td><td>�ݾ�</td><td>���</td></tr>");

		    for(int i = 0; i < ds.curlist1.size(); i++) {
		    	MT_SUBMATROUT_3207_LCURLIST1Record rec = (MT_SUBMATROUT_3207_LCURLIST1Record)ds.curlist1.get(i);
		    	if( rec.num.equals("TOTSUM") ){
		    		if ( i < 10 ) {

		    		       for ( int j = i ;  j < 10 ; j++){
		    		    	    sMailContent.append("<tr>");
		    			    	sMailContent.append("<td align=center>" + j + "</td>");
		    			    	sMailContent.append("<td align=center>&nbsp;</td>");
		    			    	sMailContent.append("<td align=center>&nbsp;</td>");
		    			    	sMailContent.append("<td align=left>&nbsp;</td>");
		    			    	sMailContent.append("<td align=left>&nbsp;</td>");
		    			    	sMailContent.append("<td align=left>&nbsp;</td>");
		    			    	sMailContent.append("<td align=center>&nbsp;</td>");
		    			    	sMailContent.append("</tr>");
		    		       }
		    		}
		    		sMailContent.append("<tr>");
			    	sMailContent.append("<td align=right colspan=3>  ��  </td>");
			    	sMailContent.append("<td align=right>&nbsp;" + rec.ordr_qunt + "</td>");
			    	sMailContent.append("<td align=right>&nbsp;</td>");
			    	sMailContent.append("<td align=right>&nbsp;" + rec.ordr_amt + "</td>");
			    	sMailContent.append("<td align=center>&nbsp;</td>");
			    	sMailContent.append("</tr>");
		    	}
		    	else {
			    	sMailContent.append("<tr>");
			    	sMailContent.append("<td align=center>" + rec.num + "</td>");
			    	sMailContent.append("<td align=center>" + rec.item_nm + "</td>");
			    	sMailContent.append("<td align=center>" + rec.std_modl + "</td>");
			    	sMailContent.append("<td align=left>&nbsp;" + rec.ordr_qunt + "</td>");
			    	sMailContent.append("<td align=left>&nbsp;" + rec.ordr_uprc + "</td>");
			    	sMailContent.append("<td align=left>&nbsp;" + rec.ordr_amt + "</td>");
			    	sMailContent.append("<td align=center>&nbsp;" + rec.remk_ar + "</td>");
			    	sMailContent.append("</tr>");
		    	}
		    }

		    sMailContent.append("</table>");
		    sMailContent.append("</td>");
		    sMailContent.append("</tr>");
		    sMailContent.append("<tr><td colspan=2>&nbsp;</td> </tr>");
		    sMailContent.append("<tr><td colspan=2>&nbsp;</td> </tr>");
		    sMailContent.append("<tr><td>��ǰ����:</td><td>" + rec0.dlvs_dt.substring(0,4)+ "&nbsp;��" + rec0.dlvs_dt.substring(4,6) + "&nbsp;�� " + rec0.dlvs_dt.substring(6,8) + "&nbsp;��" + "</td></tr>");
		    sMailContent.append("<tr><td>��ǰ���:</td><td>" + rec0.fac_cd_nm + "����</td></tr>");
		    sMailContent.append("<tr><td>�����:</td><td>���������� ����</td></tr>");
		    sMailContent.append("<tr>");
			sMailContent.append("<td>����ó : </td>");
			sMailContent.append("<td> �� : 02-724-5934 / FAX : 02-724-5919 / E-MAIL : dongari@chosun.com</td>");
			sMailContent.append("</tr>");
			sMailContent.append("<tr>");
			sMailContent.append("<td></td>");
			sMailContent.append("<td> H.P : 010-8259-1115 </td>");
		    sMailContent.append("</tr> ");
		    sMailContent.append("<tr><td colspan=2>&nbsp;</td> </tr>");
		    sMailContent.append("<tr><td colspan=2>&nbsp;</td> </tr>");
		    sMailContent.append("<tr><td>������ҹ��:</td><td>" + rec0.amt_pay_mthd +" (��ǰ�� �Ϳ� 11�� ~ 15�� ������ ���翡�� ����)" + "</td></tr>");
		    sMailContent.append("<tr><td>Ư�����:</td><td>" + rec0.remk +  "</td></tr>");
		    sMailContent.append("<tr><td colspan=2>&nbsp;</td> </tr>");
		    sMailContent.append("<tr><td colspan=2>&nbsp;</td> </tr>");
		    sMailContent.append("<td colspan=2 align=right>�����Ϻ���&nbsp;&nbsp;&nbsp;" + rec0.ordr_per_nm + "</td>");
			sMailContent.append("</table>");
			sMailContent.append("</body> ");

		}

		sender.sendmail(sMailSubject.toString(), sMailContent.toString(), sToEmail);
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

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST1>
		<record>
			<num/>
			<item_nm/>
			<std_modl/>
			<ordr_qunt/>
			<ordr_uprc/>
			<ordr_amt/>
			<remk_ar/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<dlco_nm/>
			<dlco_per/>
			<dlco_telno/>
			<dlco_faxno/>
			<ordr_per_nm/>
			<dept_nm/>
			<ordr_per_email/>
			<ordr_telno/>
			<ordr_faxno/>
			<ordr_hp/>
			<ordr_dt/>
			<dlvs_dt/>
			<fac_cd_nm/>
			<amt_pay_mthd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Fri May 08 17:18:10 KST 2009 */ %>