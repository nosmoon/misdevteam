<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bas.rec.*
	,	chosun.ciis.se.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_bas_1200_m.jsp
* 기능 : 
* 작성일자 : 2009-02-09
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
	SE_BAS_1200_MDataSet ds = (SE_BAS_1200_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int comboSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int medi_cd = rx.add(comboSet, "medi_cd", "");
		for(int i = 0; i < ds.medilist.size(); i++) {
			SE_BAS_1200_MMEDILISTRecord rec = (SE_BAS_1200_MMEDILISTRecord)ds.medilist.get(i);
			
			item  = rx.add( medi_cd , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}
		int sell_net_clsf = rx.add(comboSet, "sell_net_clsf", "");
		for(int i = 0; i < ds.sellclsflist.size(); i++) {
			SE_BAS_1200_MSELLCLSFLISTRecord rec = (SE_BAS_1200_MSELLCLSFLISTRecord)ds.sellclsflist.get(i);
			
			item  = rx.add( sell_net_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}
		int uprc_aply_clsf = rx.add(comboSet, "uprc_aply_clsf", "");
		System.out.println("size::" + ds.sellclsflist.size() );
		for(int i = 0; i < ds.uprcclsflist.size(); i++) {
			SE_BAS_1200_MUPRCCLSFLISTRecord rec = (SE_BAS_1200_MUPRCCLSFLISTRecord)ds.uprcclsflist.get(i);
			
			item  = rx.add( uprc_aply_clsf , "item" , "");
			System.out.println("value:::" + rec.cd );
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}
		int search_medi_cd = rx.add(comboSet, "search_medi_cd", "");
		for(int i = 0; i < ds.medilist.size(); i++) {
			SE_BAS_1200_MMEDILISTRecord rec = (SE_BAS_1200_MMEDILISTRecord)ds.medilist.get(i);
			
			item  = rx.add( medi_cd , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}
		int search_sell_net_clsf = rx.add(comboSet, "search_sell_net_clsf", "");
		for(int i = 0; i < ds.sellclsflist.size(); i++) {
			SE_BAS_1200_MSELLCLSFLISTRecord rec = (SE_BAS_1200_MSELLCLSFLISTRecord)ds.sellclsflist.get(i);
			
			item  = rx.add( sell_net_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
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
	<SELLCLSFLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</SELLCLSFLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<UPRCCLSFLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</UPRCCLSFLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<MEDILIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</MEDILIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Mon Feb 09 15:29:11 KST 2009 */ %>