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
* ���ϸ� : se_boi_2210_l.jsp
* ��� : 
* �ۼ����� : 2009-05-22
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
	SE_BOI_2210_LDataSet ds = (SE_BOI_2210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	//int resData = 0;
	//int resform = 0;
	int gridData = 0;
	gridData = rx.add(root, "donglist", "");

	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_2210_LCURLISTRecord rec = (SE_BOI_2210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "dong_cd", rec.dong_cd);
			rx.add(record, "yy", rec.yy);
			rx.add(record, "sido", rec.sido);
			rx.add(record, "gugun", rec.gugun);
			rx.add(record, "dong", rec.dong);
			rx.add(record, "apt_cnt", rec.apt_cnt);
			rx.add(record, "mvin_apt_cnt", rec.mvin_apt_cnt);
			rx.add(record, "tot_apt_cnt", rec.tot_apt_cnt);
			rx.add(record, "hous_cnt", rec.hous_cnt);
			rx.add(record, "shop_cnt", rec.shop_cnt);
			rx.add(record, "offi_room_cnt", rec.offi_room_cnt);
			rx.add(record, "tot_cnt", rec.tot_cnt);
			rx.add(record, "popl_cnt", rec.popl_cnt);
	  }
    }catch (Exception e) {
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
			<dong_cd/>
			<yy/>
			<sido/>
			<gugun/>
			<dong/>
			<apt_cnt/>
			<mvin_apt_cnt/>
			<tot_apt_cnt/>
			<hous_cnt/>
			<shop_cnt/>
			<offi_room_cnt/>
			<tot_cnt/>
			<popl_cnt/>
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

<% /* �ۼ��ð� : Fri May 22 17:52:50 KST 2009 */ %>