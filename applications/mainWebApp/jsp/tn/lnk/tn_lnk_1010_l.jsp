<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*;
	"
%>

<%	System.out.println("jsp go");
	RwXml rx = new RwXml();
	TN_LNK_1010_LDataSet ds = (TN_LNK_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_LNK_1010_LCURLISTRecord rec = (TN_LNK_1010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record,"select","");
			rx.add(record, "onl_memb_cd", rec.onl_memb_cd);
			rx.add(record, "onl_prms_cd", rec.onl_prms_cd);
			rx.add(record, "onl_pmnt_cd", rec.onl_pmnt_cd);
			rx.addCData(record, "name", rec.name);
			rx.add(record, "tel_no", rec.tel_no);
			rx.addCData(record, "fund_nm", rec.fund_nm);
			rx.add(record, "pmnt_clsf_cd", rec.pmnt_clsf_cd);
			rx.add(record, "prms_amt", rec.prms_amt);
			rx.add(record, "pay_amt", rec.pay_amt);
			rx.add(record, "req_dt", rec.req_dt);
			rx.add(record, "memb_cd", rec.memb_cd);
			rx.add(record, "prms_cd", rec.prms_cd);
			rx.add(record, "pmnt_cd", rec.pmnt_cd);			
			rx.add(record, "regi_dt", rec.regi_dt);
			rx.add(record, "status", rec.status);
			rx.add(record, "onl_memb_idx", rec.onl_memb_idx);			
			rx.add(record, "onl_prms_idx", rec.onl_prms_idx);
			rx.add(record, "onl_pmnt_idx", rec.onl_pmnt_idx);
			rx.add(record, "memb_idx", rec.memb_idx);
			rx.add(record, "prms_idx", rec.prms_idx);
			rx.add(record, "pmnt_idx", rec.pmnt_idx);

		}
		int resForm = rx.add(resData, "resForm", "");
		
		rx.add(resForm, "memb_cnt", ds.memb_cnt );
		rx.add(resForm, "memb_0_cnt", ds.memb_0_cnt );
		rx.add(resForm, "memb_1_cnt", ds.memb_1_cnt );
		rx.add(resForm, "memb_3_cnt", ds.memb_3_cnt );
		rx.add(resForm, "prms_cnt", ds.prms_cnt );
		rx.add(resForm, "prms_0_cnt", ds.prms_0_cnt );
		rx.add(resForm, "prms_1_cnt", ds.prms_1_cnt );
		rx.add(resForm, "prms_3_cnt", ds.prms_3_cnt );
		rx.add(resForm, "pmnt_cnt", ds.pmnt_cnt );
		rx.add(resForm, "pmnt_0_cnt", ds.pmnt_0_cnt );
		rx.add(resForm, "pmnt_1_cnt", ds.pmnt_1_cnt );
		rx.add(resForm, "pmnt_3_cnt", ds.pmnt_3_cnt );
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_lnk_1010_l>
	<dataSet>
		<CURLIST>
			<record>
				<onl_memb_idx/>
				<onl_memb_cd/>
				<onl_prms_idx/>
				<onl_prms_cd/>
				<onl_pmnt_idx/>
				<onl_pmnt_cd/>
				<name/>
				<tel_no/>
				<req_dt/>
				<regi_dt/>
				<fund_nm/>
				<pmnt_cd/>
				<prms_amt/>
				<pay_amt/>
				<status/>
				<memb_idx/>
				<prms_idx/>
				<pmnt_idx/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_1010_l>
*/
%>

<% /* 작성시간 : Thu Jan 15 11:10:47 KST 2009 */ %>