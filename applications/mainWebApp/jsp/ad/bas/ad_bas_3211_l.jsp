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
* 파일명 : ad_bas_3310_l.jsp
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
	AD_BAS_3211_LDataSet ds = (AD_BAS_3211_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int gridData = rx.add(root, "gridData1", "");
 
	try{
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_3211_LCURLISTRecord rec = (AD_BAS_3211_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "tot_pcnt", rec.tot_pcnt);
			rx.add(record, "tot_cell", rec.tot_cell);
			rx.add(record, "clr_cell", rec.clr_cell); 
			rx.add(record, "asum_pubc_amt", rec.asum_pubc_amt);
			rx.add(record, "c0101_pcnt", rec.c0101_pcnt);  
			rx.add(record, "c0102_pcnt", rec.c0102_pcnt);  
			rx.add(record, "c0103_pcnt", rec.c0103_pcnt);  
			rx.add(record, "c0104_pcnt", rec.c0104_pcnt);  
			rx.add(record, "c0105_pcnt", rec.c0105_pcnt);  
			rx.add(record, "c0106_pcnt", rec.c0106_pcnt);    
			rx.add(record, "c0107_pcnt", rec.c0107_pcnt);  
			
			rx.add(record, "c0108_sect_nm", rec.c0108_sect_nm);
			rx.add(record, "c0108_pcnt", rec.c0108_pcnt); 
			rx.add(record, "c0109_sect_nm", rec.c0109_sect_nm);
			rx.add(record, "c0109_pcnt", rec.c0109_pcnt);
			rx.add(record, "c0110_sect_nm", rec.c0110_sect_nm);
			rx.add(record, "c0110_out_clsf", rec.c0110_out_clsf);
			rx.add(record, "c0111_sect_nm", rec.c0111_sect_nm);
			rx.add(record, "c0111_out_clsf", rec.c0111_out_clsf);
			rx.add(record, "c0112_sect_nm", rec.c0112_sect_nm);
			rx.add(record, "c0112_out_clsf", rec.c0112_out_clsf);
			rx.add(record, "advt_ocpy_rate", rec.advt_ocpy_rate);
			rx.add(record, "seq", rec.seq);
		}
		
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
