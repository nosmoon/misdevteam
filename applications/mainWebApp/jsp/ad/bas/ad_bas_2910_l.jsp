<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ad_bas_3110_l.jsp
* 기능 : 
* 작성일자 : 2009-02-17
* 작성자 : 김상훈
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	AD_BAS_2910_LDataSet ds = (AD_BAS_2910_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	try{
	
		int gridData  = rx.add(root, "gridData1", "");  
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_2910_LCURLISTRecord rec = (AD_BAS_2910_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "pubc_yymm",             rec.pubc_yymm               );         
			rx.add(record, "chrg_pers_nm",          rec.chrg_pers_nm            );
			rx.add(record, "pubc_noit",             rec.pubc_noit               );
			rx.add(record, "pubc_amt",              rec.pubc_amt                );
			rx.add(record, "prvmm_pubc_amt",        rec.prvmm_pubc_amt          );
			rx.add(record, "prvmm_chrg_pubc_rate",  DigitUtil.cutUnderPoint(rec.prvmm_chrg_pubc_rate,2)   );
			rx.add(record, "rcpm_amt",              rec.rcpm_amt                );
			rx.add(record, "unrcp_amt",             rec.unrcp_amt               );
			rx.add(record, "prvmm_rcpm_amt",        rec.prvmm_rcpm_amt          );
			rx.add(record, "prvmm_chrg_rcpm_rate",  DigitUtil.cutUnderPoint(rec.prvmm_chrg_rcpm_rate,2));
			rx.add(record, "job_rcpm_icdc_rank",    rec.job_rcpm_icdc_rank      );
			rx.add(record, "dhon_amt",              rec.dhon_amt                );
			rx.add(record, "job_dhon_rank",         rec.job_dhon_rank           );
			rx.add(record, "dhon_bal",              rec.dhon_bal                );
			rx.add(record, "job_dhon_bal_rank",     rec.job_dhon_bal_rank       );
			rx.add(record, "dhon_fix_amt",          rec.dhon_fix_amt           );
		}
		
	} catch (Exception e) {
		System.out.println("error = " + e.getLocalizedMessage());
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

