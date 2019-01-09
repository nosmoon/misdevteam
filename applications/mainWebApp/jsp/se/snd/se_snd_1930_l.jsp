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
* ���ϸ� : se_snd_1930_l.jsp
* ��� : �Ǹ�-�߼۰���-�߼۸�����
* �ۼ����� : 2009-02-11
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
	SE_SND_1930_LDataSet ds = (SE_SND_1930_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData 			= 0;
	int resForm				= 0;
	int recordSet 			= 0;

	try {
		for(int i = 0; i < ds.routelist.size(); i++) {
			SE_SND_1930_LROUTELISTRecord rec = (SE_SND_1930_LROUTELISTRecord)ds.routelist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "route_clsf", rec.route_clsf);
			rx.add(record, "route_clsf_nm", rec.route_clsf_nm);
			rx.add(record, "route_cd", rec.route_cd);
			rx.add(record, "route_nm", rec.route_nm);
			rx.add(record, "send_rank", rec.send_rank);
			rx.add(record, "cnsg_seqo", rec.cnsg_seqo);
			rx.add(record, "use_yn", rec.use_yn);
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
	<ROUTELIST>
		<record>
			<cmpy_cd/>
			<route_clsf/>
			<route_clsf_nm/>
			<route_cd/>
			<route_nm/>
			<send_rank/>
			<cnsg_seqo/>
			<use_yn/>
		</record>
	</ROUTELIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<routelist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Wed Feb 11 15:16:08 KST 2009 */ %>