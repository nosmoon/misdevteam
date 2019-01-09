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
	AD_BAS_2820_LDataSet ds = (AD_BAS_2820_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	try{
	
		int gridData  = rx.add(root, "gridData2", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_2820_LCURLISTRecord rec = (AD_BAS_2820_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
/*			
			long pubc_amt 		= StringUtil.toLong(rec.pubc_amt);
			long prvmm_pubc_amt = StringUtil.toLong(rec.prvmm_pubc_amt);
			
			double prvmm_chrg_pubc_rate = ((double)(pubc_amt-prvmm_pubc_amt)/(double)prvmm_pubc_amt) * 100;
			  
			long rcpm_amt 		= StringUtil.toLong(rec.rcpm_amt);
			long prvmm_rcpm_amt = StringUtil.toLong(rec.prvmm_rcpm_amt);
			    
			double prvmm_chrg_rcpm_rate = ((double)(rcpm_amt-prvmm_rcpm_amt)/(double)prvmm_rcpm_amt) * 100;
*/			
			rx.add(record, "pubc_yymm",             rec.pubc_yymm               );         
			rx.add(record, "part_nm",          		rec.part_nm            );
			rx.add(record, "pubc_noit",             rec.pubc_noit               );
			rx.add(record, "pubc_amt",              rec.pubc_amt                );
			rx.add(record, "prvmm_pubc_amt",        rec.prvmm_pubc_amt          );
			rx.add(record, "prvmm_part_pubc_rate",  DigitUtil.cutUnderPoint(rec.prvmm_part_pubc_rate,2));
			rx.add(record, "rcpm_amt",              rec.rcpm_amt                );
			rx.add(record, "unrcp_amt",             rec.unrcp_amt               );
			rx.add(record, "prvmm_rcpm_amt",        rec.prvmm_rcpm_amt          );
			rx.add(record, "prvmm_part_rcpm_rate",  DigitUtil.cutUnderPoint(rec.prvmm_part_rcpm_rate,2));
			rx.add(record, "part_rcpm_icdc_rank",   rec.part_rcpm_icdc_rank      );
			rx.add(record, "dhon_amt",              rec.dhon_amt                );
			rx.add(record, "part_dhon_rank",        rec.part_dhon_rank           );
			rx.add(record, "dhon_bal",              rec.dhon_bal                );
			rx.add(record, "part_dhon_bal_rank",    rec.part_dhon_bal_rank       );
			rx.add(record, "dhon_fix_amt",          rec.dhon_fix_amt           );
		}
		
	} catch (Exception e) {
		System.out.println("error = " + e.getLocalizedMessage());
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

