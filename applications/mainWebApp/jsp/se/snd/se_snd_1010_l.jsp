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
* ���ϸ� : se_comm_2010_l.jsp
* ��� : �Ǹ� - �߼۰��� - ��ǥ�뼱��� - ��ǥ�뼱 ��ȸ
* �ۼ����� : 2009.02.02
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	RwXml rx = new RwXml();
	SE_SND_1010_LDataSet ds = (SE_SND_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData 	= rx.add(root		, "resData"		, "");
	recordSet 	= rx.add(formData	, "gridData"	, "");
	SE_SND_1010_LCURLISTRecord rec_pre = null;
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_1010_LCURLISTRecord rec = (SE_SND_1010_LCURLISTRecord)ds.curlist.get(i);
		
			int record = rx.add(recordSet, "record", "");

			rx.add(record, "cmpy_cd"			, rec.cmpy_cd				);
			
			if(i>0){
				rec_pre = (SE_SND_1010_LCURLISTRecord)ds.curlist.get(i-1);
			}else{
				rec_pre = (SE_SND_1010_LCURLISTRecord)ds.curlist.get(i);
			}
			
			if(rec.rptv_route_cd.equals(rec_pre.rptv_route_cd) && i>0){
				rx.add(record, "prt_plac_cd"		, ""						);	
				rx.add(record, "rptv_route_cd"		, ""						);
				rx.add(record, "ecnt_cd"			, ""						);
				rx.add(record, "ledt_cd"			, ""						);
				rx.add(record, "rptv_route_nm"		, ""						);
				rx.add(record, "rptv_route_clsf"	, ""						);
				rx.add(record, "route_rank"			, ""						);							
				
			}else{
				rx.add(record, "rptv_route_clsf"	, rec.rptv_route_clsf		);
				rx.add(record, "prt_plac_cd"		, rec.prt_plac_cd			);
				rx.add(record, "ecnt_cd"			, rec.ecnt_cd				);
				rx.add(record, "ledt_cd"			, rec.ledt_cd				);
			
				rx.add(record, "rptv_route_cd"		, rec.rptv_route_cd			);
				rx.add(record, "rptv_route_nm"		, rec.rptv_route_nm			);
				rx.add(record, "route_rank"				, rec.route_rank			);			
				
			}

			rx.add(record, "route_cd"				, rec.route_cd				);
			rx.add(record, "route_nm"				, rec.route_nm				);
			rx.add(record, "qty"					, rec.qty					);
			rx.add(record, "prt_plac_cd_key"		, rec.prt_plac_cd			);
			rx.add(record, "rptv_route_clsf_key"	, rec.rptv_route_clsf		);
			rx.add(record, "rptv_route_cd_key"  	, rec.rptv_route_cd			);
		}
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
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<rptv_route_clsf/>
			<rptv_route_cd/>
			<rptv_route_nm/>
			<route_rank/>
			<prt_plac_cd/>
			<ecnt_cd/>
			<ledt_cd/>
			<route_cd/>
			<route_nm/>
			<qty/>
			<rptv_route_clsf/>
			<rptv_route_cd/>
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
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Mon Feb 02 14:56:04 KST 2009 */ %>