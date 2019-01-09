<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.etc.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.se.etc.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_etc_1610_l.jsp
* 기능 :  판매 - 기타관리 - ABC제출자료
* 작성일자 : 2011-08-05
* 작성자 : 이민효
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_ETC_1610_LDataSet ds = (SE_ETC_1610_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	rx.add(formData		, "real_qty"			, ds.real_qty		);
	rx.add(formData		, "avg_qty"				, ds.avg_qty		);
	rx.add(formData		, "rate"				, ds.rate			);
	rx.add(formData		, "fix_msg"				, ds.fix_msg		);
	rx.add(formData		, "fix_dt"				, ds.fix_dt			);
	rx.add(formData		, "noval_qty_rate"		, ds.noval_qty_rate	);
	rx.add(formData		, "nvqrate_aply_yn"		, ds.nvqrate_aply_yn);
	rx.add(formData		, "house_qty_rate"		, ds.house_qty_rate	);
	rx.add(formData		, "bnsite_qty_rate"		, ds.bnsite_qty_rate);
	rx.add(formData		, "hsbs_aply_yn"		, ds.hsbs_aply_yn	);
	rx.add(formData		, "totclos_yn"			, ds.totclos_yn		);
	rx.add(formData		, "areaclos_yn"			, ds.areaclos_yn	);
	rx.add(formData		, "oth_qty_rate"		, ds.oth_qty_rate	);
	rx.add(formData		, "othrate_aply_yn"		, ds.othrate_aply_yn);
	rx.add(formData		, "month_qty"			, ds.month_qty);
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_ETC_1610_LCURLISTRecord rec = (SE_ETC_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"			, "");
			
			String lst_aply	  = "";
			if("1".equals(rec.lst_aply))      lst_aply = "한경";
			else if("2".equals(rec.lst_aply)) lst_aply = "매경";
			else if("3".equals(rec.lst_aply)) lst_aply = "KH";
			else if("4".equals(rec.lst_aply)) lst_aply = "국민";
			else if("5".equals(rec.lst_aply)) lst_aply = "동아";
			else if("6".equals(rec.lst_aply)) lst_aply = "중앙";
			else if(StringUtil.toNumber(rec.lst_aply) >= 9) lst_aply = ""; 
			
			rx.add(record, "dept_cd"		, rec.dept_cd			);
			rx.add(record, "dept_nm"		, rec.dept_nm			);
			rx.add(record, "part_cd"		, rec.part_cd			);
			rx.add(record, "part_nm"		, rec.part_nm			);
			rx.add(record, "area_nm"		, rec.area_nm			);		
			rx.add(record, "sido_gugun_nm"	, rec.sido_gugun_nm		); 
			rx.add(record, "bo_nm"			, rec.bo_nm				);
			rx.add(record, "house_qty"  	, rec.house_qty 		);
			rx.add(record, "business_site_qty"	, rec.business_site_qty	);
			rx.add(record, "curmm_val_qty"  , rec.curmm_val_qty	    );
			rx.add(record, "abc_val_qty"	, rec.abc_val_qty	    ); 
			rx.add(record, "avg_send_qty"	, rec.avg_send_qty		);
			rx.add(record, "end_dt_send_qty", rec.end_dt_send_qty	);
			rx.add(record, "no_val_rate"	, rec.no_val_rate		);
			rx.add(record, "livingin_yn"	, rec.livingin_yn		);
			rx.add(record, "remk"			, rec.remk		);
			rx.add(record, "yymm"			, rec.yymm				);
			rx.add(record, "bo_cd"			, rec.bo_cd				);
			rx.add(record, "bo_seq"			, rec.bo_seq			);
			rx.add(record, "area_cd"		, rec.area_cd			);
			rx.add(record, "sell_net_clsf"	, rec.sell_net_clsf		);
			rx.add(record, "sido_gugun_cd"	, rec.sido_gugun_cd		);
			rx.add(record, "hk_housqty"			, rec.hk_housqty				);
			rx.add(record, "hk_busiqty"			, rec.hk_busiqty				);		
			rx.add(record, "mk_housqty"			, rec.mk_housqty				);
			rx.add(record, "mk_busiqty"			, rec.mk_busiqty				);
			rx.add(record, "kh_housqty"			, rec.kh_housqty				);
			rx.add(record, "kh_busiqty"			, rec.kh_busiqty				);
			rx.add(record, "km_housqty"			, rec.km_housqty				);
			rx.add(record, "km_busiqty"			, rec.km_busiqty				);
			rx.add(record, "da_housqty"			, rec.da_housqty				);
			rx.add(record, "da_busiqty"			, rec.da_busiqty				);
			rx.add(record, "ja_housqty"			, rec.ja_housqty				);
			rx.add(record, "ja_busiqty"			, rec.ja_busiqty				);
			rx.add(record, "hap"				, rec.hap				);
			rx.add(record, "lst_aply"			, lst_aply				);
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
TrustForm의 Instance 선언부에 복사해서 사용
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

<% /* 작성시간 : Tue May 26 13:55:15 KST 2009 */ %>