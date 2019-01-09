<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.snd.rec.*
	,	chosun.ciis.se.snd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_snd_1910_l.jsp
* 기능 :   판매-발송관리-발송마스터
* 작성일자 : 2009-02-09
* 작성자 : 김대준
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_SND_1910_LDataSet ds = (SE_SND_1910_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData 			= 0;
	int resForm				= 0;
	int recordSet 			= 0;

	formData				= rx.add(root		, "resData", "");
	resForm					= rx.add(formData	, "resform", "");
	
	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_1910_LCURLISTRecord rec = (SE_SND_1910_LCURLISTRecord)ds.curlist.get(i);
			rx.add(resForm, "cmpy_cd"				, rec.cmpy_cd				);
			rx.add(resForm, "bo_cd"					, rec.bo_cd					);
			rx.add(resForm, "send_plac_seq"			, rec.send_plac_seq			);
			rx.add(resForm, "send_plac_nm"			, rec.send_plac_nm			);
			rx.add(resForm, "area_cd"				, rec.area_cd				);
			rx.add(resForm, "send_plac_feat_clas"	, rec.send_plac_feat_clas	);
			rx.add(resForm, "ariv_nomn"				, rec.ariv_nomn				);
			rx.add(resForm, "band"					, rec.band					);
			rx.add(resForm, "stetsell_clsf"			, rec.stetsell_clsf			);
			rx.add(resForm, "stetsell_nm"			, rec.stetsell_nm			);
			rx.add(resForm, "clas_clsf"				, rec.clas_clsf				);
			rx.add(resForm, "etc_area_clas"			, rec.etc_area_clas			);
			rx.add(resForm, "use_yn"				, rec.use_yn				);
			rx.add(resForm, "qty"					, rec.qty					);
			rx.add(resForm, "area_nm"				, rec.area_nm				);
			rx.add(resForm, "sido_cd"				, rec.sido_cd				);
			rx.add(resForm, "sido_nm"				, rec.sido_nm				);
			rx.add(resForm, "part_cd"				, rec.part_cd				);
			rx.add(resForm, "part_nm"				, rec.part_nm				);
			rx.add(resForm, "team_cd"				, rec.team_cd				);
			rx.add(resForm, "team_nm"				, rec.team_nm				);
			rx.add(resForm, "bo_feat_clsf"			, rec.bo_feat_clsf			);
			rx.add(resForm, "bo_feat_nm"			, rec.bo_feat_nm			);
			rx.add(resForm, "ddtotshet_qty"			, rec.ddtotshet_qty			);
			rx.add(resForm, "bo_seq"				, rec.bo_seq				);
		}
		
		resForm				= rx.add(formData	, "gridData"	, "");
		recordSet			= rx.add(resForm	, "routelist"	, "");
		for(int i = 0; i < ds.routelist.size(); i++) {
			SE_SND_1910_LROUTELISTRecord rec = (SE_SND_1910_LROUTELISTRecord)ds.routelist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd"      		, rec.cmpy_cd		);
			rx.add(record, "route_clsf"   		, rec.route_clsf    );
			rx.add(record, "route_clsf_nm"		, rec.route_clsf_nm );
			rx.add(record, "route_cd"     		, rec.route_cd      );
			rx.add(record, "route_rank"    		, rec.route_rank    );
			rx.add(record, "route_nm"     		, rec.route_nm      );
			rx.add(record, "send_rank"    		, rec.send_rank     );
			rx.add(record, "cnsg_seqo"    		, rec.cnsg_seqo     );
			rx.add(record, "use_yn"       		, rec.use_yn		);
		}
		
		recordSet			= rx.add(resForm	, "tranlist"	, "");
		for(int i = 0; i < ds.tranlist.size(); i++) {
			SE_SND_1910_LTRANLISTRecord rec = (SE_SND_1910_LTRANLISTRecord)ds.tranlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd"			, rec.cmpy_cd		);
			rx.add(record, "route_clsf"			, rec.route_clsf	);
			rx.add(record, "route_clsf_nm"		, rec.route_clsf_nm	);
			rx.add(record, "tran_cmpy_nm"		, rec.tran_cmpy_nm	);
			rx.add(record, "tran_cost"			, rec.tran_cost		);
			rx.add(record, "tel_no"				, rec.tel_no		);
			rx.add(record, "ptph_no"			, rec.ptph_no		);
			rx.add(record, "cntr_dt"			, rec.cntr_dt		);
			rx.add(record, "cctr_dt"			, rec.cctr_dt		);
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
			<cmpy_cd/>
			<bo_cd/>
			<send_plac_seq/>
			<send_plac_nm/>
			<area_cd/>
			<send_plac_feat_clas/>
			<ariv_nomn/>
			<band/>
			<stetsell_clsf/>
			<stetsell_nm/>
			<clas_clsf/>
			<use_yn/>
			<qty/>
			<area_nm/>
			<sido_cd/>
			<sido_nm/>
			<part_cd/>
			<part_nm/>
			<team_cd/>
			<team_nm/>
			<bo_feat_clsf/>
			<bo_feat_nm/>
			<ddtotshet_qty/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<TRANLIST>
		<record>
			<cmpy_cd/>
			<route_clsf/>
			<tran_cmpy_nm/>
			<tran_cost/>
			<tel_no/>
			<ptph_no/>
			<cntr_dt/>
			<cctr_dt/>
		</record>
	</TRANLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<curlist/>
		<tranlist/>
		<rownum/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Mon Feb 09 10:18:19 KST 2009 */ %>