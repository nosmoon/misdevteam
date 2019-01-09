<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.se.boi.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_boi_1300_m.jsp
* ��� : �������� - ������Ȳ��ȸ
* �ۼ����� : 2009-02-06
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
	SE_BOI_1300_MDataSet ds = (SE_BOI_1300_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		recordSet = rx.add(comboSet, "teamlist", "");		
		for(int i = 0; i < ds.team_cdcur.size(); i++) {
			SE_BOI_1300_MTEAM_CDCURRecord rec = (SE_BOI_1300_MTEAM_CDCURRecord)ds.team_cdcur.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm", rec.dept_nm);			//�μ���
		}
		recordSet--;
		recordSet = rx.add(comboSet, "partlist_temp", "");
		for(int i = 0; i < ds.part_cdcur.size(); i++) {
			SE_BOI_1300_MPART_CDCURRecord rec = (SE_BOI_1300_MPART_CDCURRecord)ds.part_cdcur.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd"		, rec.dept_cd);  		//�μ��ڵ�
			rx.add(record, "dept_nm"		, rec.dept_nm);			//�μ���
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);	//�����μ��ڵ�
		}
		recordSet--;
		recordSet = rx.add(comboSet, "arealist_temp", "");
		for(int i = 0; i < ds.area_cdcur.size(); i++) {
			SE_BOI_1300_MAREA_CDCURRecord rec = (SE_BOI_1300_MAREA_CDCURRecord)ds.area_cdcur.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "area_cd"		, rec.area_cd);  		//�����ڵ�
			rx.add(record, "area_nm"		, rec.area_nm);			//�����ڵ��
			rx.add(record, "dept_cd"		, rec.dept_cd);			//�μ��ڵ�
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);    //�����μ��ڵ�
		}
		int bo_feat_clsf = rx.add(comboSet, "bo_feat_clsf", "");
		item  = rx.add( bo_feat_clsf , "item" , "");
		rx.add ( item, "value", "");
		rx.add ( item, "label", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_BOI_1300_MCOMMCDCUR1Record rec = (SE_BOI_1300_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			item  = rx.add( bo_feat_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+"  "+rec.cdnm);
		}
		int cntr_stat_clsf = rx.add(comboSet, "cntr_stat_clsf", "");
		item  = rx.add( cntr_stat_clsf , "item" , "");
		rx.add ( item, "value", "");
		rx.add ( item, "label", "");
		for(int i = 0; i < ds.commcdcur2.size(); i++) {
			SE_BOI_1300_MCOMMCDCUR2Record rec = (SE_BOI_1300_MCOMMCDCUR2Record)ds.commcdcur2.get(i);
			item  = rx.add( cntr_stat_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+"  "+rec.cdnm);
		}
		int sido_cd = rx.add(comboSet, "sido_cd", "");
		item  = rx.add( sido_cd , "item" , "");
		rx.add ( item, "value", "");
		rx.add ( item, "label", "");
		for(int i = 0; i < ds.commcdcur3.size(); i++) {
			SE_BOI_1300_MCOMMCDCUR3Record rec = (SE_BOI_1300_MCOMMCDCUR3Record)ds.commcdcur3.get(i);
			item  = rx.add( sido_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+"  "+rec.cdnm);
		}
		int adms_dstc_cd = rx.add(comboSet, "adms_dstc_cd", "");
		item  = rx.add( adms_dstc_cd , "item" , "");
		rx.add ( item, "value", "");
		rx.add ( item, "label", "");
		for(int i = 0; i < ds.commcdcur4.size(); i++) {
			SE_BOI_1300_MCOMMCDCUR4Record rec = (SE_BOI_1300_MCOMMCDCUR4Record)ds.commcdcur4.get(i);
			item  = rx.add( adms_dstc_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+"  "+rec.cdnm);
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
	<COMMCDCUR4>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</COMMCDCUR4>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<AREA_CDCUR>
		<record>
			<area_cd/>
			<area_nm/>
			<dept_cd/>
			<supr_dept_cd/>
		</record>
	</AREA_CDCUR>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<COMMCDCUR3>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</COMMCDCUR3>
</resData>
*/
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
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</COMMCDCUR1>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<TEAM_CDCUR>
		<record>
			<dept_cd/>
			<dept_nm/>
		</record>
	</TEAM_CDCUR>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<PART_CDCUR>
		<record>
			<dept_cd/>
			<dept_nm/>
			<supr_dept_cd/>
		</record>
	</PART_CDCUR>
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

<% /* �ۼ��ð� : Tue Feb 03 10:01:21 KST 2009 */ %>