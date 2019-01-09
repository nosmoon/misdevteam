<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_8002_LDataSet ds = (MT_PAPORD_8002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "main2", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_8002_LCURLISTRecord rec = (MT_PAPORD_8002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "issu_dt_day", rec.issu_dt_day);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.addCData(record, "sect_nm", rec.sect_nm);
			rx.add(record, "pcnt", rec.pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "std", rec.std);
			rx.add(record, "prt_dt", rec.prt_dt);
			rx.add(record, "prt_tm", rec.prt_tm);
			rx.add(record, "dual_out_nm", rec.dual_out_nm);
			rx.add(record, "tm_in_yn", rec.tm_in_yn);
			rx.add(record, "add_prt_seq", rec.add_prt_seq);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "use_a", rec.use_a);
			rx.add(record, "use_b", rec.use_b);
			rx.add(record, "use_c", rec.use_c);
			rx.add(record, "bf_dt", rec.bf_dt);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "bal_wgt_a", rec.bal_wgt_a);
			rx.add(record, "bal_wgt_c", rec.bal_wgt_c);
			rx.add(record, "bal_wgt_b", rec.bal_wgt_b);
			rx.add(record, "bal_wgt_tot", rec.bal_wgt_tot);
			rx.add(record, "bal_roll_a", rec.bal_roll_a);
			rx.add(record, "bal_roll_c", rec.bal_roll_c);
			rx.add(record, "bal_roll_b", rec.bal_roll_b);
			rx.add(record, "roll_wgt_a", rec.roll_wgt_a);	
			rx.add(record, "roll_wgt_b", rec.roll_wgt_b);	
			rx.add(record, "roll_wgt_c", rec.roll_wgt_c);	
			rx.add(record, "roll_cnt_a", rec.roll_cnt_a);	
			rx.add(record, "roll_cnt_b", rec.roll_cnt_b);	
			rx.add(record, "roll_cnt_c", rec.roll_cnt_c);	
			rx.add(record, "bf_bal_wgt_a", rec.bf_bal_wgt_a);
			rx.add(record, "bf_bal_wgt_c", rec.bf_bal_wgt_c);
			rx.add(record, "bf_bal_wgt_b", rec.bf_bal_wgt_b);
			rx.add(record, "wgt_a", rec.wgt_a);
			rx.add(record, "wgt_c", rec.wgt_c);
			rx.add(record, "wgt_b", rec.wgt_b);
			rx.add(record, "roll_a", rec.roll_a);	
			rx.add(record, "roll_b", rec.roll_b);	
			rx.add(record, "roll_c", rec.roll_c);	
			rx.add(record, "clos_clsf", rec.clos_clsf);	
			rx.add(record, "row_num", rec.row_num);
			rx.add(record, "dual_out_clsf", rec.dual_out_clsf);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "car_cnt", rec.car_cnt);	
			rx.add(record, "car_b", rec.car_b);	
			rx.add(record, "car_c", rec.car_c);
			rx.add(record, "ewh_roll_a", rec.ewh_roll_cnt_a);	
			rx.add(record, "ewh_roll_b", rec.ewh_roll_cnt_b);	
			rx.add(record, "ewh_roll_c", rec.ewh_roll_cnt_c);	
			rx.add(record, "ewh_wgt_a", rec.ewh_wgt_a);
			rx.add(record, "ewh_wgt_c", rec.ewh_wgt_c);
			rx.add(record, "ewh_wgt_b", rec.ewh_wgt_b);
									
			
		}
		/****** CURLIST_2 END */


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
<dataSet>
	<CURLIST_2>
		<record>
			<issu_dt/>
			<medi_nm/>
			<sect_nm/>
			<pcnt/>
			<clr_pcnt/>
			<prt_dt/>
			<prt_tm/>
			<dual_out_nm/>
			<tm_in_yn/>
			<remk/>
		</record>
	</CURLIST_2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST_1>
		<record>
			<issu_dt/>
			<add_prt_seq/>
			<pcnt/>
			<clr_pcnt/>
			<prt_dt/>
			<prt_tm/>
			<dual_out_nm/>
			<tm_in_yn/>
			<rdata/>
		</record>
	</CURLIST_1>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Apr 28 23:53:34 KST 2009 */ %>