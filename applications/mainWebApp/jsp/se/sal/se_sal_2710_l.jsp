<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.rec.*
	,	chosun.ciis.se.sal.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_sal_2610_l.jsp
* ��� :  �Ǹ� - ��Ÿ���� - �������ں����Ǻμ�
* �ۼ����� : 2010-05-26
* �ۼ��� : �̹�ȿ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_SAL_2710_LDataSet ds = (SE_SAL_2710_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID; 
	int formData			= 0;
	int recordSet			= 0;
	formData				= rx.add(root		, "resData"		, "");
	rx.add(formData		, "fix_msg"				, ds.fix_msg		);
	rx.add(formData		, "fix_dt"				, ds.fix_dt			);
	rx.add(formData		, "totclos_yn"		   	, ds.totclos_yn		);
	rx.add(formData		, "areaclos_yn"		   	, ds.areaclos_yn	);
	rx.add(formData		, "fix_msg"		    	, ds.fix_msg		);
	rx.add(formData		, "fix_dt"		    	, ds.fix_dt			);
	rx.add(formData		, "issu_dt_cnt"			, ds.issu_dt_cnt	);
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SAL_2710_LCURLISTRecord rec = (SE_SAL_2710_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"			, "");
			//rx.add(record, "yymm"			, rec.yymm				);
			rx.add(record, "dept_nm"		, rec.dept_nm			);
			rx.add(record, "dept_cd"		, rec.dept_cd			);
			rx.add(record, "part_nm"		, rec.part_nm			);
			rx.add(record, "sub_dept_cd"	, rec.sub_dept_cd		);
			rx.add(record, "area_nm"		, rec.area_nm			);	
			rx.add(record, "area_cd"		, rec.area_cd			);	
			rx.add(record, "bo_cd"			, rec.bo_cd				);
			rx.add(record, "bo_seq"			, rec.bo_seq			);	
			rx.add(record, "bo_nm"			, rec.bo_nm				);
			rx.add(record, "bo_head_nm"	    , rec.bo_head_nm		); //bo_head_nm
			rx.add(record, "chrg_pers"	    , rec.chrg_pers			); 
			rx.add(record, "chrg_pers_nm"	, rec.chrg_pers_nm		); 
			rx.add(record, "bgn_mm"	    	, rec.bgn_mm			); 
			rx.add(record, "end_mm"	    	, rec.end_mm			);
			rx.add(record, "months"	    	, rec.months			);
			rx.add(record, "src_months"	   	, rec.src_months		);
			rx.add(record, "damt_decid_amt"	, rec.damt_decid_amt	);
			rx.add(record, "result_amt"		, rec.result_amt		);
			rx.add(record, "widr_yn"	    , rec.widr_yn			);
			rx.add(record, "widr_bgn_mm"	, rec.widr_bgn_mm		);
			rx.add(record, "widr_amt"	    , rec.widr_amt			);
		}  
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<CURLIST>
		<record>
			<dept_cd/>
			<dept_nm/>
			<part_cd/>
			<part_nm/>
			<area_cd/>
			<area_nm/>
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<trmrd_qty_0/>
			<dscn_rdr_qty_0/>
			<month_aft_qty_1/>
			<month_aft_qty_2/>
			<month_aft_qty_3/>
			<month_aft_qty_4/>
			<month_aft_qty_5/>
			<aft_qty/>
			<dnt_qty/>
			<avg_send_qty/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<curlist/>
		<trmrd_qty/>
		<dncn_qty/>
		<month_qty/>
		<aft_qty/>
		<real_qty/>
		<avg_qty/>
		<rate/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Tue May 26 13:55:15 KST 2009 */ %>