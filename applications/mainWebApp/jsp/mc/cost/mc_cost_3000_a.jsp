<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.cost.rec.*
	,	chosun.ciis.mc.cost.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_COST_3000_ADataSet ds = (MC_COST_3000_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_clos_clsf_010", ds.getXx_clos_clsf_010());
		rx.add(dataSet, "xx_clos_clsf_020", ds.getXx_clos_clsf_020());
		rx.add(dataSet, "xx_clos_clsf_030", ds.getXx_clos_clsf_030());
		rx.add(dataSet, "xx_clos_clsf_040", ds.getXx_clos_clsf_040());
		rx.add(dataSet, "xx_clos_clsf_050", ds.getXx_clos_clsf_050());
		
		/****** CURLIST_09 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST_09", "");

		for(int i = 0; i < ds.curlist_09.size(); i++) {
			MC_COST_3000_ACURLIST_09Record rec = (MC_COST_3000_ACURLIST_09Record)ds.curlist_09.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "excp_dstb_cd", rec.excp_dstb_cd);
			//rx.add(record, "excp_dstb_cd", StringUtil.replaceToXml(rec.excp_dstb_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist_09.size());
		/****** CURLIST_09 END */

		/****** CURLIST_08 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST_08", "");

		for(int i = 0; i < ds.curlist_08.size(); i++) {
			MC_COST_3000_ACURLIST_08Record rec = (MC_COST_3000_ACURLIST_08Record)ds.curlist_08.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bsbbcd_no_entry", rec.bsbbcd_no_entry);
			rx.add(record, "bsbbcd_err", rec.bsbbcd_err);
			//rx.add(record, "bsbbcd_no_entry", StringUtil.replaceToXml(rec.bsbbcd_no_entry));
			//rx.add(record, "bsbbcd_err", StringUtil.replaceToXml(rec.bsbbcd_err));
		}
		rx.add(recordSet, "totalcnt", ds.curlist_08.size());
		/****** CURLIST_08 END */

		/****** CURLIST_07 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST_07", "");

		for(int i = 0; i < ds.curlist_07.size(); i++) {
			MC_COST_3000_ACURLIST_07Record rec = (MC_COST_3000_ACURLIST_07Record)ds.curlist_07.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bscd_no_entry", rec.bscd_no_entry);
			rx.add(record, "bscd_err", rec.bscd_err);
			//rx.add(record, "bscd_no_entry", StringUtil.replaceToXml(rec.bscd_no_entry));
			//rx.add(record, "bscd_err", StringUtil.replaceToXml(rec.bscd_err));
		}
		rx.add(recordSet, "totalcnt", ds.curlist_07.size());
		/****** CURLIST_07 END */

		/****** CURLIST_06 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST_06", "");

		for(int i = 0; i < ds.curlist_06.size(); i++) {
			MC_COST_3000_ACURLIST_06Record rec = (MC_COST_3000_ACURLIST_06Record)ds.curlist_06.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dstb_nm", rec.dstb_nm);
			//rx.add(record, "dstb_nm", StringUtil.replaceToXml(rec.dstb_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist_06.size());
		/****** CURLIST_06 END */

		/****** CURLIST_05 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST_05", "");

		for(int i = 0; i < ds.curlist_05.size(); i++) {
			MC_COST_3000_ACURLIST_05Record rec = (MC_COST_3000_ACURLIST_05Record)ds.curlist_05.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "ndstb_cd", rec.ndstb_cd);
			//rx.add(record, "ndstb_cd", StringUtil.replaceToXml(rec.ndstb_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist_05.size());
		/****** CURLIST_05 END */

		/****** CURLIST_04 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST_04", "");

		for(int i = 0; i < ds.curlist_04.size(); i++) {
			MC_COST_3000_ACURLIST_04Record rec = (MC_COST_3000_ACURLIST_04Record)ds.curlist_04.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cdnm", rec.budg_cdnm);
			//rx.add(record, "budg_cdnm", StringUtil.replaceToXml(rec.budg_cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist_04.size());
		/****** CURLIST_04 END */

		/****** CURLIST_03 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST_03", "");

		for(int i = 0; i < ds.curlist_03.size(); i++) {
			MC_COST_3000_ACURLIST_03Record rec = (MC_COST_3000_ACURLIST_03Record)ds.curlist_03.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "col1", rec.col1);
			//rx.add(record, "col1", StringUtil.replaceToXml(rec.col1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist_03.size());
		/****** CURLIST_03 END */

		/****** CURLIST_02 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST_02", "");

		for(int i = 0; i < ds.curlist_02.size(); i++) {
			MC_COST_3000_ACURLIST_02Record rec = (MC_COST_3000_ACURLIST_02Record)ds.curlist_02.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "col1", rec.col1);
			//rx.add(record, "col1", StringUtil.replaceToXml(rec.col1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist_02.size());
		/****** CURLIST_02 END */

		/****** CURLIST_01 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST_01", "");

		for(int i = 0; i < ds.curlist_01.size(); i++) {
			MC_COST_3000_ACURLIST_01Record rec = (MC_COST_3000_ACURLIST_01Record)ds.curlist_01.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "col1", rec.col1);
			//rx.add(record, "col1", StringUtil.replaceToXml(rec.col1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist_01.size());
		/****** CURLIST_01 END */

		/****** CURLIST_00 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST_00", "");

		for(int i = 0; i < ds.curlist_00.size(); i++) {
			MC_COST_3000_ACURLIST_00Record rec = (MC_COST_3000_ACURLIST_00Record)ds.curlist_00.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tms", rec.tms);
			//rx.add(record, "tms", StringUtil.replaceToXml(rec.tms));
		}
		rx.add(recordSet, "totalcnt", ds.curlist_00.size());
		/****** CURLIST_00 END */

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
<mc_cost_3000_a>
	<dataSet>
		<CURLIST_09>
			<record>
				<excp_dstb_cd/>
			</record>
		</CURLIST_09>
	</dataSet>
</mc_cost_3000_a>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_cost_3000_a>
	<dataSet>
		<CURLIST_08>
			<record>
				<bsbbcd_no_entry/>
				<bsbbcd_err/>
			</record>
		</CURLIST_08>
	</dataSet>
</mc_cost_3000_a>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_cost_3000_a>
	<dataSet>
		<CURLIST_07>
			<record>
				<bscd_no_entry/>
				<bscd_err/>
			</record>
		</CURLIST_07>
	</dataSet>
</mc_cost_3000_a>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_cost_3000_a>
	<dataSet>
		<CURLIST_06>
			<record>
				<dstb_nm/>
			</record>
		</CURLIST_06>
	</dataSet>
</mc_cost_3000_a>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_cost_3000_a>
	<dataSet>
		<CURLIST_05>
			<record>
				<ndstb_cd/>
			</record>
		</CURLIST_05>
	</dataSet>
</mc_cost_3000_a>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_cost_3000_a>
	<dataSet>
		<CURLIST_04>
			<record>
				<budg_cdnm/>
			</record>
		</CURLIST_04>
	</dataSet>
</mc_cost_3000_a>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_cost_3000_a>
	<dataSet>
		<CURLIST_03>
			<record>
				<col1/>
			</record>
		</CURLIST_03>
	</dataSet>
</mc_cost_3000_a>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_cost_3000_a>
	<dataSet>
		<CURLIST_02>
			<record>
				<col1/>
			</record>
		</CURLIST_02>
	</dataSet>
</mc_cost_3000_a>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_cost_3000_a>
	<dataSet>
		<CURLIST_01>
			<record>
				<col1/>
			</record>
		</CURLIST_01>
	</dataSet>
</mc_cost_3000_a>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_cost_3000_a>
	<dataSet>
		<CURLIST_00>
			<record>
				<tms/>
			</record>
		</CURLIST_00>
	</dataSet>
</mc_cost_3000_a>
*/
%>

<% /* 작성시간 : Wed May 20 12:54:27 KST 2009 */ %>