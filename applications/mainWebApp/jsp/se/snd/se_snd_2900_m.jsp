<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.snd.ds.*
	,	chosun.ciis.se.snd.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_snd_2900_m.jsp
* ��� : �߼۰��� - Ư�Ǻμ��߼۰���
* �ۼ����� : 2009-03-13
* �ۼ��� : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_SND_2900_MDataSet ds = (SE_SND_2900_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int area_cd = rx.add(comboSet, "area_cd", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_SND_2900_MCOMMCDCUR1Record rec = (SE_SND_2900_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			item  = rx.add( area_cd , "item" , "");
			rx.add(item, "value", rec.area_cd);
			rx.add(item, "label", rec.area_nm);
		}
		int cnfm_stat_clsf = rx.add(comboSet, "cnfm_stat_clsf", "");
		for(int i = 0; i < ds.commcdcur2.size(); i++) {
			SE_SND_2900_MCOMMCDCUR2Record rec = (SE_SND_2900_MCOMMCDCUR2Record)ds.commcdcur2.get(i);
			item  = rx.add( cnfm_stat_clsf , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
		}
		int route_clsf = rx.add(comboSet, "route_clsf", "");
		for(int i = 0; i < ds.commcdcur3.size(); i++) {
			SE_SND_2900_MCOMMCDCUR3Record rec = (SE_SND_2900_MCOMMCDCUR3Record)ds.commcdcur3.get(i);
			item  = rx.add( route_clsf , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
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
	<COMMCDCUR2>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</COMMCDCUR2>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<COMMCDCUR1>
		<record>
			<area_cd/>
			<area_nm/>
			<dept_cd/>
		</record>
	</COMMCDCUR1>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<commcdcur1/>
		<commcdcur2/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Fri Mar 13 15:17:41 KST 2009 */ %>