<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.base.util.*
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.se.boi.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_1430_s.jsp
* 기능 : 지국장조회 - 지국장정보탭 조회
* 작성일자 : 2009-02-06
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_BOI_1430_SDataSet ds = (SE_BOI_1430_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int dtlform = 0;
	int dtlgrid1 = 0;
	int dtlgrid2 = 0;
	int dtlgrid3 = 0;
	
	resform = rx.add(root, "tab2form", "");
	dtlform = rx.add(resform, "dtlform", "");

	try {
		if(ds != null){
			rx.add(dtlform, "phot_size", ds.phot_size);
			rx.addCData(dtlform, "bo_head_nm", ds.bo_head_nm);
			rx.add(dtlform, "bo_head_prn", ds.bo_head_prn);
			rx.add(dtlform, "tel_no", ds.tel_no);
			rx.add(dtlform, "ptph_no", ds.ptph_no);
			rx.add(dtlform, "wedd_anvy_dd", ds.wedd_anvy_dd);
			rx.add(dtlform, "nativ", ds.nativ);
			rx.add(dtlform, "relg", ds.relg);
			rx.add(dtlform, "addr", ds.zip+" "+ds.addr+" "+ds.dtls_addr);
			
			if(ds.bo_head_phot != null && ds.phot_size>0){
	       		String filenm = ds.bo_head_prn + ".gif";
	       		//String filepath = request.getRealPath("") +"/images/photo/";
	       		String imgpath = "/jsp/se/boi/bohead_img/";
	       		String filepath = request.getRealPath("") + imgpath;
	       		File f = new File(filepath);
      				if (!f.exists()){
                	f.mkdirs();                 
				}
	       		ImageUtil.savePhoto(filepath, filenm, ds.bo_head_phot);
				rx.add(dtlform, "bo_head_phot"     	,imgpath+filenm	);  
	       	}else{
				rx.add(dtlform, "bo_head_phot"     	,""	);  
	       	}
		}
		
		dtlgrid1 = rx.add(resform, "dtlgrid1", "");
		for(int i = 0; i < ds.boheadhstycur.size(); i++) {
			SE_BOI_1430_SBOHEADHSTYCURRecord rec = (SE_BOI_1430_SBOHEADHSTYCURRecord)ds.boheadhstycur.get(i);
			int record = rx.add(dtlgrid1, "record", "");
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "hsty_matt", rec.hsty_matt);
		}
		dtlgrid2 = rx.add(resform, "dtlgrid2", "");
		for(int i = 0; i < ds.boheadideacur.size(); i++) {
			SE_BOI_1430_SBOHEADIDEACURRecord rec = (SE_BOI_1430_SBOHEADIDEACURRecord)ds.boheadideacur.get(i);
			int record = rx.add(dtlgrid2, "record", "");
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "make_pers_nm", rec.make_pers_nm);
			rx.add(record, "idea", rec.idea);
		}
		dtlgrid3 = rx.add(resform, "dtlgrid3", "");
		for(int i = 0; i < ds.boheadfamcur.size(); i++) {
			SE_BOI_1430_SBOHEADFAMCURRecord rec = (SE_BOI_1430_SBOHEADFAMCURRecord)ds.boheadfamcur.get(i);
			int record = rx.add(dtlgrid3, "record", "");
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "faml_rshp_cd", rec.faml_rshp_cd);
			rx.add(record, "bidt", rec.bidt);
			rx.add(record, "luso_clsf", rec.luso_clsf);
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
<resData>
	<BOHEADIDEACUR>
		<record>
			<make_dt/>
			<make_pers_nm/>
			<idea/>
		</record>
	</BOHEADIDEACUR>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<BOHEADHSTYCUR>
		<record>
			<yymm/>
			<hsty_matt/>
		</record>
	</BOHEADHSTYCUR>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<BOHEADFAMCUR>
		<record>
			<flnm/>
			<faml_rshp_cd/>
			<bidt/>
			<luso_clsf/>
		</record>
	</BOHEADFAMCUR>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<bo_head_phot/>
		<phot_size/>
		<bo_head_nm/>
		<bo_head_prn/>
		<tel_no/>
		<ptph_no/>
		<wedd_anvy_dd/>
		<nativ/>
		<relg/>
		<zip/>
		<addr/>
		<dtls_addr/>
		<boheadhstycur/>
		<boheadideacur/>
		<boheadfamcur/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Wed Feb 04 21:28:13 KST 2009 */ %>
