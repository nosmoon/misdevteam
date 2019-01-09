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
* ���ϸ� : se_snd_1610_l.jsp
* ��� :  �Ǹ� - �߼۰��� - �����Ǻ��߼۳��� ��ȸ
* �ۼ����� : 2009-03-13
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
	SE_SND_1610_LDataSet ds = (SE_SND_1610_LDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;
	int formData 	= 0;
	int recordSet 	= 0;
	formData 		= rx.add(root		, "resData"		, "");
	formData 		= rx.add(formData	, "gridData"	, "");
	String ariv_nomn;
	StringTokenizer st;
	int j 			= 0, k = 0;
	try {
		recordSet 	= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_1610_LCURLISTRecord rec = (SE_SND_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "prt_plac_nm"	, rec.prt_plac_nm	);
			rx.add(record, "ledt_nm"		, rec.ledt_nm		);
			rx.add(record, "ecnt_nm"		, rec.ecnt_nm		);
			rx.add(record, "route_cd"		, rec.route_cd		);
			rx.add(record, "route_nm"		, rec.route_nm		);
			rx.add(record, "qty"			, rec.qty		);
			
			ariv_nomn 	= rec.ariv_nomn;
			st 			= new StringTokenizer(ariv_nomn, ",");
			
			j = 0;
			k = 0;
	        while ( st.hasMoreTokens() ){
	        	j++;
	        	k++;
	        	if ( (j % 7) == 0 ){
					rx.add(recordSet, "record"		, "");
					rx.add(record	, "prt_plac_nm"	, "");
					rx.add(record	, "ledt_nm"		, "");
					rx.add(record	, "ecnt_nm"		, "");
					rx.add(record	, "route_cd"	, "");
					rx.add(record	, "route_nm"	, "");
					rx.add(record	, "qty"			, "");
					k = 1;
	        	}
	        	rx.add(record, "ariv_nomn" + k	, st.nextToken());
	        }
	        k++;
	        for ( int l = k ; l < 7 ; l++ ){
	        	rx.add(record, "ariv_nomn" + l	, ""			);
	        }
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
			<prt_plac_nm/>
			<ledt_nm/>
			<ecnt_nm/>
			<route_cd/>
			<route_nm/>
			<qty/>
			<ariv_nomn/>
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

<% /* �ۼ��ð� : Fri Mar 13 15:28:37 KST 2009 */ %>