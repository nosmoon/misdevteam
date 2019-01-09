<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.comm.rec.*
	,	chosun.ciis.se.comm.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_comm_2410_l.jsp
* 기능 :   발송관리 - 수송업자 팝업
* 작성일자 : 2009-06-09
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
	SE_COMM_2410_LDataSet ds = (SE_COMM_2410_LDataSet)request.getAttribute("ds");
	int root 					= RwXml.rootNodeID;
	int formData 				= 0;
	
	formData					= rx.add(root	,	"gridData"	, "");
	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_COMM_2410_LCURLISTRecord rec = (SE_COMM_2410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record"	, "");
			rx.add(record, "route_clsf"			, rec.route_clsf            );
			rx.add(record, "tran_cmpy_cd"		, rec.tran_cmpy_cd			);
			rx.add(record, "tran_cmpy_nm"		, rec.tran_cmpy_nm			);
			rx.add(record, "tran_uprc_clas"		, rec.tran_uprc_clas        );
			rx.add(record, "tran_uprc_cd"		, rec.tran_uprc_cd          );
			rx.add(record, "tran_uprc_route_nm"	, rec.tran_uprc_route_nm    );
			rx.add(record, "prt_plac_cd"		, rec.prt_plac_cd           );
			rx.add(record, "medi_cd"			, rec.medi_cd               );
			rx.add(record, "sect_cd"			, rec.sect_cd               );
			rx.add(record, "sect_nm"			, rec.sect_nm               );			
			rx.add(record, "pay_tran_uprc"		, rec.pay_tran_uprc         );
			rx.add(record, "work_dds"			, rec.work_dds              );
			rx.add(record, "pay_tran_cost"		, rec.pay_tran_cost         );
			rx.add(record, "dlco_no"			, rec.dlco_no               );
			rx.add(record, "dlco_clsf"			, rec.dlco_clsf             );
			rx.add(record, "tran_uprc_qty_clsf"	, rec.tran_uprc_qty_clsf    );
			rx.add(record, "cntr_dt"			, rec.cntr_dt               );
			rx.add(record, "cctr_dt"			, rec.cctr_dt               );
			rx.add(record, "eps_no"				, rec.ern                   );
			rx.add(record, "bank_cd"			, rec.bank_cd	             );
			rx.add(record, "acct_no"			, rec.acct_no               );
			rx.add(record, "zip"				, rec.zip                   );
			rx.add(record, "addr"				, rec.addr                  );
			rx.add(record, "dtls_addr"			, rec.dtls_addr             );
			rx.add(record, "tel_no"				, rec.tel_no                );
			rx.add(record, "car_no"				, rec.car_no                );

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
			<bns_item_cd/>
			<bns_item_nm/>
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
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Tue Apr 28 14:55:09 KST 2009 */ %>