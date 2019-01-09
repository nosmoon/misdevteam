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
	AD_BAS_3212_LDataSet ds = (AD_BAS_3212_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int gridData = rx.add(root, "gridData2", "");
 
	try{
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_3212_LCURLISTRecord rec = (AD_BAS_3212_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "tot_pcnt", rec.tot_pcnt);
			rx.add(record, "tot_clas", rec.tot_clas);
			rx.add(record, "clr_clas", rec.clr_clas); 
			rx.add(record, "asum_pubc_amt", rec.asum_pubc_amt);
			rx.add(record, "c0201_pcnt", rec.c0201_pcnt);  
			rx.add(record, "c0202_pcnt", rec.c0202_pcnt);  
			rx.add(record, "c0203_pcnt", rec.c0203_pcnt);  
			rx.add(record, "c0204_pcnt", rec.c0204_pcnt);    
			rx.add(record, "c0205_pcnt", rec.c0205_pcnt);  
			rx.add(record, "c0206_pcnt", rec.c0206_pcnt);    
			
			rx.add(record, "c0207_sect_nm", rec.c0207_sect_nm);
			rx.add(record, "c0207_pcnt", rec.c0207_pcnt); 
			rx.add(record, "c0208_sect_nm", rec.c0208_sect_nm);
			rx.add(record, "c0208_pcnt", rec.c0208_pcnt);
			rx.add(record, "c0209_sect_nm", rec.c0209_sect_nm);
			rx.add(record, "c0209_out_clsf", rec.c0209_out_clsf);
			rx.add(record, "c0210_sect_nm", rec.c0210_sect_nm);
			rx.add(record, "c0210_out_clsf", rec.c0210_out_clsf);
			rx.add(record, "c0211_sect_nm", rec.c0211_sect_nm);
			rx.add(record, "c0211_out_clsf", rec.c0211_out_clsf);
			rx.add(record, "advt_ocpy_rate", rec.advt_ocpy_rate);
			rx.add(record, "seq", rec.seq);
		}
		
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
