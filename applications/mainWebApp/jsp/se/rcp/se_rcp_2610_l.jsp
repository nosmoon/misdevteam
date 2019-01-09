<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.rcp.ds.*
	,	chosun.ciis.se.rcp.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_rcp_2610_l.jsp
* 기능 : 
* 작성일자 : 2009-04-24
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_RCP_2610_LDataSet ds = (SE_RCP_2610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int mainlist = 0;
	int gridData = 0;
	gridData = rx.add(root, "gridData", "");
	
	String s_drcr_clsf = "";
	String s_budg_cd = "";
	String s_patr_budg_cd = "";
	String s_dtlremk = "";
	String s_rcpm_dt = "";
	String s_rcpm_no = "";
	String s_name = "";
	String s_amt = "";

	try {
		mainlist = rx.add(gridData, "mainlist", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_2610_LCURLISTRecord rec = (SE_RCP_2610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(mainlist, "record", "");
			s_drcr_clsf = rec.drcr_clsf;
			s_budg_cd = rec.budg_cd;
			s_patr_budg_cd = rec.patr_budg_cd;
			s_rcpm_dt = rec.rcpm_dt;
			s_rcpm_no = rec.rcpm_no;
			s_name = rec.name;
			s_amt = rec.amt;
			s_dtlremk = rec.dtlremk;
			
    		//대변일경우
			if("9".equals(s_drcr_clsf)){
				if("030200".equals(s_budg_cd)){
					if("775505".equals(s_patr_budg_cd)){
						s_name = "지대입금";
						s_dtlremk = "우송중계료대체";
					}else if("484100".equals(s_patr_budg_cd)){
						s_name = "계약보증금지대대체";
					}else{
						s_name = "지대입금";
					}
				}else if("031300".equals(s_budg_cd)){
					s_name = "정리구좌입금";
				}else if("484100".equals(s_budg_cd)){
					if("13".equals(s_rcpm_no.substring(10,2)) && Integer.parseInt(s_amt) < 0){
						s_name = "계약보증금인계";
					}else if("13".equals(s_rcpm_no.substring(10,2)) && Integer.parseInt(s_amt) > 0){
						s_name = "계약보증금인수";
					}else{
						s_name = "계약보증금입금";
					}
				}else if("071500".equals(s_budg_cd)){
					s_name = "판촉물입금";
				}else if("468600".equals(s_budg_cd)){
					s_name = "스포츠(예수)";
				}
			
			}else if("1".equals(s_drcr_clsf)){		//차변일경우
				if("001100".equals(s_budg_cd)){
					if("030200".equals(s_patr_budg_cd)){
						s_name = "지대환불";
					}else if("031300".equals(s_patr_budg_cd)){
						s_name = "정리구좌환불";
					}else if("484100".equals(s_patr_budg_cd)){
						s_name = "계약보증금환불";
					}else if("071500".equals(s_patr_budg_cd)){
						s_name = "판촉물환불";
					}else if("468600".equals(s_patr_budg_cd)){
						s_name = "스포츠(예수)환불";
					}
				}
			}
			
			rx.add(record, "rcpm_dt", s_rcpm_dt);
			rx.add(record, "rcpm_no", s_rcpm_no);
			rx.add(record, "name", s_name);
			rx.add(record, "amt", s_amt);
			rx.add(record, "dtlremk", s_dtlremk);
		}
		int sub1 = rx.add(gridData, "sub1", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			SE_RCP_2610_LCURLIST2Record rec = (SE_RCP_2610_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(sub1, "record", "");
			rx.add(record, "cyov_bal", rec.cyov_bal);
			rx.add(record, "net_sale_amt", rec.net_sale_amt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "bal", rec.bal);
		}
		int sub2 = rx.add(gridData, "sub2", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			SE_RCP_2610_LCURLIST3Record rec = (SE_RCP_2610_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(sub2, "record", "");
			rx.add(record, "cyov_bal", rec.cyov_bal);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "bal", rec.bal);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURLIST3>
		<record>
			<cyov_bal/>
			<rcpm_amt/>
			<bal/>
		</record>
	</CURLIST3>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURLIST2>
		<record>
			<cyov_bal/>
			<net_sale_amt/>
			<rcpm_amt/>
			<bal/>
		</record>
	</CURLIST2>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURLIST>
		<record>
			<rcpm_dt/>
			<rcpm_no/>
			<drcr_clsf/>
			<name/>
			<amt/>
			<budg_cd/>
			<patr_budg_cd/>
			<dtlremk/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<curlist/>
		<curlist2/>
		<curlist3/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Fri Apr 24 10:55:48 KST 2009 */ %>