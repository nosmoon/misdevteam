<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pr.prtcnsg.rec.*
	,	chosun.ciis.pr.prtcnsg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTCNSG_1100_LDataSet ds = (PR_PRTCNSG_1100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");
		//System.out.println("ds.curlist1.size()=>"+ds.curlist1.size());
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PRTCNSG_1100_LCURLIST1Record rec = (PR_PRTCNSG_1100_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "psplat_clsf", rec.psplat_clsf);
			rx.add(record, "use_qunt", rec.use_qunt);
			rx.add(record, "nul_plat_cnt", rec.nul_plat_cnt);
			rx.add(record, "psplat_fee", rec.psplat_fee);
			rx.add(record, "gnaw_fee", rec.gnaw_fee);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "sub_seq", rec.sub_seq);
			
			if(!"".equalsIgnoreCase(rec.use_qunt) && !"".equalsIgnoreCase(rec.nul_plat_cnt) && !"".equalsIgnoreCase(rec.psplat_fee)){
				// (소모+공판)*PS단가
				rx.add(record, "psbg", (Integer.parseInt(rec.use_qunt)+Integer.parseInt(rec.nul_plat_cnt))*Integer.parseInt(rec.psplat_fee));					
			}else{
				rx.add(record, "psbg", "");					
			}
			if(!"".equalsIgnoreCase(rec.use_qunt) &&!"".equalsIgnoreCase(rec.gnaw_fee)){
				//소모 * 소부비단가
				rx.add(record, "sbbg", Integer.parseInt(rec.use_qunt)*Integer.parseInt(rec.gnaw_fee));
			}else{
				rx.add(record, "sbbg", "");
			}
			//rx.add(record, "psplat_clsf", StringUtil.replaceToXml(rec.psplat_clsf));
			//rx.add(record, "use_qunt", StringUtil.replaceToXml(rec.use_qunt));
			//rx.add(record, "nul_plat_cnt", StringUtil.replaceToXml(rec.nul_plat_cnt));
			//rx.add(record, "psplat_fee", StringUtil.replaceToXml(rec.psplat_fee));
			//rx.add(record, "gnaw_fee", StringUtil.replaceToXml(rec.gnaw_fee));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */
	
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");
		//System.out.println("ds.curlist2.size()=>"+ds.curlist2.size());
		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_PRTCNSG_1100_LCURLIST2Record rec = (PR_PRTCNSG_1100_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "data", rec.data);
			//rx.add(record, "prt_uprc_bw_1", StringUtil.replaceToXml(rec.prt_uprc_bw_1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST3 BEGIN */
		//recordSet = rx.add(dataSet, "gridData3", "");
		//System.out.println("ds.curlist3.size()=>"+ds.curlist3.size());
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_PRTCNSG_1100_LCURLIST3Record rec = (PR_PRTCNSG_1100_LCURLIST3Record)ds.curlist3.get(0);
			int record = rx.add(dataSet, "curlist3", "");
			rx.add(record, "film_use_qunt", rec.film_use_qunt);
			rx.add(record, "paper_wgt", rec.paper_wgt);
			//System.out.println("rec.seq=>"+rec.seq);
			String[] seq = null;
			seq = rec.seq.split(",");
			if(seq.length > 1) {
				rx.add(record, "seq_curlist3", seq[0]);
				rx.add(record, "occr_dt_curlist3", seq[1]);
			} else {
				rx.add(record, "seq_curlist3", "");
				rx.add(record, "occr_dt_curlist3", "");
			}
			rx.add(record, "seq_curlist3", rec.seq);
			//rx.add(record, "film_use_qunt", StringUtil.replaceToXml(rec.film_use_qunt));
			//rx.add(record, "paper_wgt", StringUtil.replaceToXml(rec.paper_wgt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */
	
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "gridData4", "");
		//System.out.println("ds.curlist4.size()=>"+ds.curlist4.size());
		for(int i = 0; i < ds.curlist4.size(); i++) {
			PR_PRTCNSG_1100_LCURLIST4Record rec = (PR_PRTCNSG_1100_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "prt_fee", rec.prt_fee);
			rx.add(record, "paper_amt", rec.paper_amt);
			rx.add(record, "psplat_use_amt", rec.psplat_use_amt);
			rx.add(record, "gnaw_fee", rec.gnaw_fee);
			rx.add(record, "pack_fee", rec.pack_fee);
			rx.add(record, "paper_portage", rec.paper_portage);
			rx.add(record, "clr_prt_fee", rec.clr_prt_fee);
			rx.add(record, "bw_prt_fee", rec.bw_prt_fee);
			rx.add(record, "total", rec.total);
			rx.add(record, "film", rec.film_make_fee);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			//rx.add(record, "prt_fee", StringUtil.replaceToXml(rec.prt_fee));
			//rx.add(record, "psplat_use_amt", StringUtil.replaceToXml(rec.psplat_use_amt));
			//rx.add(record, "gnaw_fee", StringUtil.replaceToXml(rec.gnaw_fee));
			//rx.add(record, "pack_fee", StringUtil.replaceToXml(rec.pack_fee));
			//rx.add(record, "paper_portage", StringUtil.replaceToXml(rec.paper_portage));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "gridData5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			PR_PRTCNSG_1100_LCURLIST5Record rec = (PR_PRTCNSG_1100_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "issu_qty", rec.issu_qty);
			rx.add(record, "pap_std", rec.pap_std);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "bw_pcnt", rec.bw_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "paper_portage", rec.paper_portage);
			rx.add(record, "tot_bw_pcnt", Integer.parseInt(rec.issu_qty)* Integer.parseInt(rec.bw_pcnt));
			rx.add(record, "tot_clr_pcnt", Integer.parseInt(rec.issu_qty)* Integer.parseInt(rec.clr_pcnt));
			rx.add(record, "total", (Integer.parseInt(rec.issu_qty)* Integer.parseInt(rec.bw_pcnt)+(Integer.parseInt(rec.issu_qty)* Integer.parseInt(rec.clr_pcnt))));
			
			//rx.add(record, "issu_qty", StringUtil.replaceToXml(rec.issu_qty));
			//rx.add(record, "issu_pcnt", StringUtil.replaceToXml(rec.issu_pcnt));
			//rx.add(record, "bw_pcnt", StringUtil.replaceToXml(rec.bw_pcnt));
			//rx.add(record, "clr_pcnt", StringUtil.replaceToXml(rec.clr_pcnt));
			//rx.add(record, "paper_portage", StringUtil.replaceToXml(rec.paper_portage));
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */
		
		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "gridData6", "");
		//System.out.println("ds.curlist6.size()=>"+ds.curlist6.size());
		for(int i = 0; i < ds.curlist6.size(); i++) {
			PR_PRTCNSG_1100_LCURLIST6Record rec = (PR_PRTCNSG_1100_LCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "film_make_fee", rec.film_make_fee);
			rx.add(record, "pack_fee", rec.pack_fee);
			rx.add(record, "paper_portage", rec.paper_portage);
			rx.add(record, "pj_basi_qty", rec.pj_basi_qty);
			
			String[] prt_pj = null;
			prt_pj = rec.prt_pj_rate_bw_1.split(".");
			if(prt_pj.length < 1){
				rx.add(record, "prt_pj_rate_bw_1", rec.prt_pj_rate_bw_1);
			}else{
				rx.add(record, "prt_pj_rate_bw_1", rec.prt_pj_rate_bw_1);
			}
			
			prt_pj = rec.prt_pj_rate_clr_1.split(".");
			if(prt_pj.length < 1){
				rx.add(record, "prt_pj_rate_clr_1", rec.prt_pj_rate_clr_1);
			}else{
				rx.add(record, "prt_pj_rate_clr_1", rec.prt_pj_rate_clr_1);
//				rx.add(record, "prt_pj_rate_clr_1", rec.prt_pj_rate_clr_1);
			}
			
			prt_pj = rec.prt_pj_rate_bw_2.split(".");
			if(prt_pj.length < 1){
				rx.add(record, "prt_pj_rate_bw_2", rec.prt_pj_rate_bw_2);
			}else{
				rx.add(record, "prt_pj_rate_bw_2", rec.prt_pj_rate_bw_2);
//				rx.add(record, "prt_pj_rate_bw_2", rec.prt_pj_rate_bw_2);
			}
			
			prt_pj = rec.prt_pj_rate_clr_2.split(".");
			if(prt_pj.length < 1){
				rx.add(record, "prt_pj_rate_clr_2", rec.prt_pj_rate_clr_2);
			}else{
				rx.add(record, "prt_pj_rate_clr_2", rec.prt_pj_rate_clr_2);
//				rx.add(record, "prt_pj_rate_clr_2", rec.prt_pj_rate_clr_2);
			}
			
			rx.add(record, "paper_wgt", rec.paper_wgt);
			rx.add(record, "eps_no", rec.eps_no);
			//rx.add(record, "film_make_fee", StringUtil.replaceToXml(rec.film_make_fee));
			//rx.add(record, "pack_fee", StringUtil.replaceToXml(rec.pack_fee));
			//rx.add(record, "pj_basi_qty", StringUtil.replaceToXml(rec.pj_basi_qty));
			//rx.add(record, "paper_wgt", StringUtil.replaceToXml(rec.paper_wgt));
			//rx.add(record, "eps_no", StringUtil.replaceToXml(rec.eps_no));
			//rx.add(record, "prt_pj_rate_bw_1", StringUtil.replaceToXml(rec.prt_pj_rate_bw_1));
			//rx.add(record, "prt_pj_rate_clr_1", StringUtil.replaceToXml(rec.prt_pj_rate_clr_1));
			//rx.add(record, "prt_pj_rate_bw_2", StringUtil.replaceToXml(rec.prt_pj_rate_bw_2));
			//rx.add(record, "prt_pj_rate_clr_2", StringUtil.replaceToXml(rec.prt_pj_rate_clr_2));
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */
		
		/****** CURLIST7 BEGIN */
		recordSet = rx.add(dataSet, "gridData7", "");
		for(int i = 0; i < ds.curlist7.size(); i++) {
			PR_PRTCNSG_1100_LCURLIST7Record rec = (PR_PRTCNSG_1100_LCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "paper_uprc", rec.paper_uprc);
			rx.add(record, "paper_portage", rec.paper_portage);
		}
		rx.add(recordSet, "totalcnt", ds.curlist7.size());
		/****** CURLIST7 END */
		
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
TrustForm의 Instance 선언부에 복사해서 사용
<pr_prtcnsg_1100_l>
	<dataSet>
		<CURLIST4>
			<record>
				<prt_fee/>
				<psplat_use_amt/>
				<gnaw_fee/>
				<pack_fee/>
				<paper_portage/>
			</record>
		</CURLIST4>
	</dataSet>
</pr_prtcnsg_1100_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_prtcnsg_1100_l>
	<dataSet>
		<CURLIST3>
			<record>
				<film_use_qunt/>
				<paper_wgt/>
			</record>
		</CURLIST3>
	</dataSet>
</pr_prtcnsg_1100_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_prtcnsg_1100_l>
	<dataSet>
		<CURLIST2>
			<record>
				<prt_uprc_bw_1/>
			</record>
		</CURLIST2>
	</dataSet>
</pr_prtcnsg_1100_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_prtcnsg_1100_l>
	<dataSet>
		<CURLIST1>
			<record>
				<psplat_clsf/>
				<use_qunt/>
				<nul_plat_cnt/>
				<psplat_fee/>
				<gnaw_fee/>
			</record>
		</CURLIST1>
	</dataSet>
</pr_prtcnsg_1100_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_prtcnsg_1100_l>
	<dataSet>
		<CURLIST6>
			<record>
				<film_make_fee/>
				<pack_fee/>
				<pj_basi_qty/>
				<paper_wgt/>
				<eps_no/>
				<prt_pj_rate_bw_1/>
				<prt_pj_rate_clr_1/>
				<prt_pj_rate_bw_2/>
				<prt_pj_rate_clr_2/>
			</record>
		</CURLIST6>
	</dataSet>
</pr_prtcnsg_1100_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_prtcnsg_1100_l>
	<dataSet>
		<CURLIST5>
			<record>
				<issu_qty/>
				<issu_pcnt/>
				<bw_pcnt/>
				<clr_pcnt/>
				<paper_portage/>
			</record>
		</CURLIST5>
	</dataSet>
</pr_prtcnsg_1100_l>
*/
%>

<% /* 작성시간 : Tue May 19 11:37:34 KST 2009 */ %>