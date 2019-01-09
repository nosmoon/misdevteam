<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.ad.res.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_RES_1000_MDataSet ds = (AD_RES_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
//	int resData = rx.add(root, "resData", "");

	try {
	
		int gridData1 = rx.add(root, "gridData1", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_RES_1000_MCURLISTRecord rec = (AD_RES_1000_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "sun", rec.sun);
			rx.add(record, "sun_cnt", "0".equals(rec.sun_cnt) ? "" :rec.sun_cnt);
			rx.add(record, "sun_pcnt_clos_yn", rec.sun_pcnt_clos_yn);
			rx.add(record, "sun_clos_yn", rec.sun_clos_yn);
			rx.add(record, "mon", rec.mon);
			rx.add(record, "mon_cnt",  "0".equals(rec.mon_cnt) ? "" :rec.mon_cnt);
			rx.add(record, "mon_pcnt_clos_yn", rec.mon_pcnt_clos_yn);
			rx.add(record, "mon_clos_yn", rec.mon_clos_yn);
			rx.add(record, "tue", rec.tue);
			rx.add(record, "tue_cnt",  "0".equals(rec.tue_cnt) ? "" :rec.tue_cnt);
			rx.add(record, "tue_pcnt_clos_yn", rec.tue_pcnt_clos_yn);
			rx.add(record, "tue_clos_yn", rec.tue_clos_yn);
			rx.add(record, "wed", rec.wed);
			rx.add(record, "wed_cnt",  "0".equals(rec.wed_cnt) ? "" :rec.wed_cnt);
			rx.add(record, "wed_pcnt_clos_yn", rec.wed_pcnt_clos_yn);
			rx.add(record, "wed_clos_yn", rec.wed_clos_yn);
			rx.add(record, "thr", rec.thr);
			rx.add(record, "thr_cnt",  "0".equals(rec.thr_cnt) ? "" :rec.thr_cnt);
			rx.add(record, "thr_pcnt_clos_yn", rec.thr_pcnt_clos_yn);
			rx.add(record, "thr_clos_yn", rec.thr_clos_yn);
			rx.add(record, "fri", rec.fri);
			rx.add(record, "fri_cnt",  "0".equals(rec.fri_cnt) ? "" :rec.fri_cnt);
			rx.add(record, "fri_pcnt_clos_yn", rec.fri_pcnt_clos_yn);
			rx.add(record, "fri_clos_yn", rec.fri_clos_yn);
			rx.add(record, "sat", rec.sat);
			rx.add(record, "sat_cnt",  "0".equals(rec.sat_cnt) ? "" :rec.sat_cnt);
			rx.add(record, "sat_pcnt_clos_yn", rec.sat_pcnt_clos_yn);
			rx.add(record, "sat_clos_yn", rec.sat_clos_yn);
		}
		

		int sect_clsf_cd = rx.add( root , "sect_clsf_cd" , "");		
		for(int i=0; i<ds.sectclsfcurlist.size(); i++){
			AD_RES_1000_MSECTCLSFCURLISTRecord rec = (AD_RES_1000_MSECTCLSFCURLISTRecord)ds.sectclsfcurlist.get(i);
			
			int item  = rx.add( sect_clsf_cd , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
			rx.add ( item, "pcode", "");
			
		}	
		int sect_clsf_cd1 = rx.add( root , "sect_clsf_cd1" , "");		
		for(int i=0; i<ds.sectclsfcurlist.size(); i++){
			AD_RES_1000_MSECTCLSFCURLISTRecord rec = (AD_RES_1000_MSECTCLSFCURLISTRecord)ds.sectclsfcurlist.get(i);
			
			int item  = rx.add( sect_clsf_cd1 , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
			rx.add ( item, "pcode", "");
			
		}	
		int sect_clsf_cd2 = rx.add( root , "sect_clsf_cd2" , "");		
		for(int i=0; i<ds.sectclsfcurlist.size(); i++){
			AD_RES_1000_MSECTCLSFCURLISTRecord rec = (AD_RES_1000_MSECTCLSFCURLISTRecord)ds.sectclsfcurlist.get(i);
			
			int item  = rx.add( sect_clsf_cd2 , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
			rx.add ( item, "pcode", "");
			
		}	
		int sect_clsf_cd3 = rx.add( root , "sect_clsf_cd3" , "");		
		for(int i=0; i<ds.sectclsfcurlist.size(); i++){
			AD_RES_1000_MSECTCLSFCURLISTRecord rec = (AD_RES_1000_MSECTCLSFCURLISTRecord)ds.sectclsfcurlist.get(i);
			
			int item  = rx.add( sect_clsf_cd3 , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
			rx.add ( item, "pcode", "");
			
		}	
		int sect_clsf_cd4 = rx.add( root , "sect_clsf_cd4" , "");		
		for(int i=0; i<ds.sectclsfcurlist.size(); i++){
			AD_RES_1000_MSECTCLSFCURLISTRecord rec = (AD_RES_1000_MSECTCLSFCURLISTRecord)ds.sectclsfcurlist.get(i);
			
			int item  = rx.add( sect_clsf_cd4 , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
			rx.add ( item, "pcode", "");
			
		}	
		int sect_clsf_cd5 = rx.add( root , "sect_clsf_cd5" , "");		
		for(int i=0; i<ds.sectclsfcurlist.size(); i++){
			AD_RES_1000_MSECTCLSFCURLISTRecord rec = (AD_RES_1000_MSECTCLSFCURLISTRecord)ds.sectclsfcurlist.get(i);
			
			int item  = rx.add( sect_clsf_cd5 , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", i+1+""+rec.cdnm);
			rx.add ( item, "pcode", "");
			
		}	
		int sect_nm_cd = rx.add( root , "sect_nm_cd" , "");		
		for(int i=0; i<ds.sectnmcurlist.size(); i++){
			AD_RES_1000_MSECTNMCURLISTRecord rec = (AD_RES_1000_MSECTNMCURLISTRecord)ds.sectnmcurlist.get(i);
			
			int item  = rx.add( sect_nm_cd , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
			rx.add ( item, "pcode", rec.mang_cd_1);
			
		}		
		int sect_nm_cd1 = rx.add( root , "sect_nm_cd1" , "");		
		for(int i=0; i<ds.sectnmcurlist.size(); i++){
			AD_RES_1000_MSECTNMCURLISTRecord rec = (AD_RES_1000_MSECTNMCURLISTRecord)ds.sectnmcurlist.get(i);
			
			int item  = rx.add( sect_nm_cd1 , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
			rx.add ( item, "pcode", rec.mang_cd_1);
			
		}	
		int sect_nm_cd2 = rx.add( root , "sect_nm_cd2" , "");		
		for(int i=0; i<ds.sectnmcurlist.size(); i++){
			AD_RES_1000_MSECTNMCURLISTRecord rec = (AD_RES_1000_MSECTNMCURLISTRecord)ds.sectnmcurlist.get(i);
			
			int item  = rx.add( sect_nm_cd2 , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
			rx.add ( item, "pcode", rec.mang_cd_1);
			
		}	
		int sect_nm_cd3 = rx.add( root , "sect_nm_cd3" , "");		
		for(int i=0; i<ds.sectnmcurlist.size(); i++){
			AD_RES_1000_MSECTNMCURLISTRecord rec = (AD_RES_1000_MSECTNMCURLISTRecord)ds.sectnmcurlist.get(i);
			
			int item  = rx.add( sect_nm_cd3 , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
			rx.add ( item, "pcode", rec.mang_cd_1);
			
		}	
		int sect_nm_cd4 = rx.add( root , "sect_nm_cd4" , "");		
		for(int i=0; i<ds.sectnmcurlist.size(); i++){
			AD_RES_1000_MSECTNMCURLISTRecord rec = (AD_RES_1000_MSECTNMCURLISTRecord)ds.sectnmcurlist.get(i);
			
			int item  = rx.add( sect_nm_cd4 , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
			rx.add ( item, "pcode", rec.mang_cd_1);
			
		}	
		int sect_nm_cd5 = rx.add( root , "sect_nm_cd5" , "");		
		for(int i=0; i<ds.sectnmcurlist.size(); i++){
			AD_RES_1000_MSECTNMCURLISTRecord rec = (AD_RES_1000_MSECTNMCURLISTRecord)ds.sectnmcurlist.get(i);
			
			int item  = rx.add( sect_nm_cd5 , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
			rx.add ( item, "pcode", rec.mang_cd_1);
			
		}	

		int edt_clsf = rx.add( root , "edt_clsf" , "");		
		for(int i=0; i<ds.panclsfcurlist.size(); i++){
			AD_RES_1000_MPANCLSFCURLISTRecord rec = (AD_RES_1000_MPANCLSFCURLISTRecord)ds.panclsfcurlist.get(i);
			
			int item  = rx.add( edt_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.addCData ( item, "label", rec.cdnm);
			
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
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<sun/>
			<mon/>
			<tue/>
			<wed/>
			<thr/>
			<fri/>
			<sat/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>