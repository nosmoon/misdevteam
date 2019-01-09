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
	AD_BAS_3210_LDataSet ds = (AD_BAS_3210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int gridData = rx.add(root, "gridData", "");
 
	try{
		for(int i = 0; i < ds.curlist1.size(); i++) {
			AD_BAS_3210_LCURLIST1Record rec = (AD_BAS_3210_LCURLIST1Record)ds.curlist1.get(i);
			int curlist1 = rx.add(gridData, "curlist1", "");
			
			rx.add(curlist1, "tot_pcnt", rec.tot_pcnt);
			rx.add(curlist1, "tot_cell", DigitUtil.cutUnderPoint(rec.tot_cell,1));
			rx.add(curlist1, "clr_cell", DigitUtil.cutUnderPoint(rec.clr_cell,1)); 
			rx.add(curlist1, "asum_pubc_amt", rec.asum_pubc_amt);
			rx.add(curlist1, "c0101_pcnt", rec.c0101_pcnt);  
			rx.add(curlist1, "c0102_pcnt", rec.c0102_pcnt);  
			rx.add(curlist1, "c0103_pcnt", rec.c0103_pcnt);  
			rx.add(curlist1, "c0104_pcnt", rec.c0104_pcnt);  
			rx.add(curlist1, "c0105_pcnt", rec.c0105_pcnt);  
			rx.add(curlist1, "c0106_pcnt", rec.c0106_pcnt);    
			rx.add(curlist1, "c0107_pcnt", rec.c0107_pcnt);  
			
			rx.add(curlist1, "c0108_sect_nm", rec.c0108_sect_nm);
			rx.add(curlist1, "c0108_pcnt", rec.c0108_pcnt); 
			rx.add(curlist1, "c0109_sect_nm", rec.c0109_sect_nm);
			rx.add(curlist1, "c0109_pcnt", rec.c0109_pcnt);
			rx.add(curlist1, "c0110_sect_nm", rec.c0110_sect_nm);
			rx.add(curlist1, "c0110_out_clsf", rec.c0110_out_clsf);
			rx.add(curlist1, "c0111_sect_nm", rec.c0111_sect_nm);
			rx.add(curlist1, "c0111_out_clsf", rec.c0111_out_clsf);
			rx.add(curlist1, "c0112_sect_nm", rec.c0112_sect_nm);
			rx.add(curlist1, "c0112_out_clsf", rec.c0112_out_clsf);
			rx.add(curlist1, "advt_ocpy_rate", DigitUtil.cutUnderPoint(rec.advt_ocpy_rate,1));
			rx.add(curlist1, "seq", rec.seq);
		}
		
		for(int i = 0; i < 1-ds.curlist1.size(); i++) {
			int curlist1 = rx.add(gridData, "curlist1", "");
			
			rx.add(curlist1, "tot_pcnt", "");
			rx.add(curlist1, "tot_cell", "");
			rx.add(curlist1, "clr_cell", "");
			rx.add(curlist1, "asum_pubc_amt", "");
			rx.add(curlist1, "c0101_pcnt", "");
			rx.add(curlist1, "c0102_pcnt", ""); 
			rx.add(curlist1, "c0103_pcnt", "");
			rx.add(curlist1, "c0104_pcnt", "");
			rx.add(curlist1, "c0105_pcnt", ""); 
			rx.add(curlist1, "c0106_pcnt", "");  
			rx.add(curlist1, "c0107_pcnt", ""); 
			
			rx.add(curlist1, "c0108_sect_nm", "");
			rx.add(curlist1, "c0108_pcnt", "");
			rx.add(curlist1, "c0109_sect_nm", "");
			rx.add(curlist1, "c0109_pcnt", "");
			rx.add(curlist1, "c0110_sect_nm", "");
			rx.add(curlist1, "c0110_out_clsf", "");
			rx.add(curlist1, "c0111_sect_nm", "");
			rx.add(curlist1, "c0111_out_clsf", "");
			rx.add(curlist1, "c0112_sect_nm", "");
			rx.add(curlist1, "c0112_out_clsf", "");
			rx.add(curlist1, "advt_ocpy_rate", "");
			rx.add(curlist1, "seq", "");
		}
		

		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_BAS_3210_LCURLIST2Record rec = (AD_BAS_3210_LCURLIST2Record)ds.curlist2.get(i);
			int curlist2 = rx.add(gridData, "curlist2", "");
			
			rx.add(curlist2, "tot_pcnt", rec.tot_pcnt);
			rx.add(curlist2, "tot_clas", DigitUtil.cutUnderPoint(rec.tot_clas,1));
			rx.add(curlist2, "clr_clas", DigitUtil.cutUnderPoint(rec.clr_clas,1)); 
			rx.add(curlist2, "asum_pubc_amt", rec.asum_pubc_amt);
			rx.add(curlist2, "c0201_pcnt", rec.c0201_pcnt);  
			rx.add(curlist2, "c0202_pcnt", rec.c0202_pcnt);  
			rx.add(curlist2, "c0203_pcnt", rec.c0203_pcnt);  
			rx.add(curlist2, "c0204_pcnt", rec.c0204_pcnt);    
			rx.add(curlist2, "c0205_pcnt", rec.c0205_pcnt);  
			rx.add(curlist2, "c0206_pcnt", rec.c0206_pcnt);    
			
			rx.add(curlist2, "c0207_sect_nm", rec.c0207_sect_nm);
			rx.add(curlist2, "c0207_pcnt", rec.c0207_pcnt); 
			rx.add(curlist2, "c0208_sect_nm", rec.c0208_sect_nm);
			rx.add(curlist2, "c0208_pcnt", rec.c0208_pcnt);
			rx.add(curlist2, "c0209_sect_nm", rec.c0209_sect_nm);
			rx.add(curlist2, "c0209_out_clsf", rec.c0209_out_clsf);
			rx.add(curlist2, "c0210_sect_nm", rec.c0210_sect_nm);
			rx.add(curlist2, "c0210_out_clsf", rec.c0210_out_clsf);
			rx.add(curlist2, "c0211_sect_nm", rec.c0211_sect_nm);
			rx.add(curlist2, "c0211_out_clsf", rec.c0211_out_clsf);
			rx.add(curlist2, "advt_ocpy_rate", DigitUtil.cutUnderPoint(rec.advt_ocpy_rate,1));
			rx.add(curlist2, "seq", rec.seq);
		}
		for(int i = 0; i < 1-ds.curlist2.size(); i++) {
			int curlist2 = rx.add(gridData, "curlist2", "");
			
			rx.add(curlist2, "tot_pcnt", "");
			rx.add(curlist2, "tot_clas", "");
			rx.add(curlist2, "clr_clas", ""); 
			rx.add(curlist2, "asum_pubc_amt", "");
			rx.add(curlist2, "c0201_pcnt", "");  
			rx.add(curlist2, "c0202_pcnt", "");  
			rx.add(curlist2, "c0203_pcnt", "");  
			rx.add(curlist2, "c0204_pcnt", "");    
			rx.add(curlist2, "c0205_pcnt", "");  
			rx.add(curlist2, "c0206_pcnt", "");    
			
			rx.add(curlist2, "c0207_sect_nm", "");
			rx.add(curlist2, "c0207_pcnt", "");
			rx.add(curlist2, "c0208_sect_nm", "");
			rx.add(curlist2, "c0208_pcnt", "");
			rx.add(curlist2, "c0209_sect_nm", "");
			rx.add(curlist2, "c0209_out_clsf", "");
			rx.add(curlist2, "c0210_sect_nm", "");
			rx.add(curlist2, "c0210_out_clsf", "");
			rx.add(curlist2, "c0211_sect_nm", "");
			rx.add(curlist2, "c0211_out_clsf", "");
			rx.add(curlist2, "advt_ocpy_rate", "");
			rx.add(curlist2, "seq", "");
		}
				

		for(int i = 0; i < ds.curlist3.size(); i++) {
			AD_BAS_3210_LCURLIST3Record rec = (AD_BAS_3210_LCURLIST3Record)ds.curlist3.get(i);
			int curlist3 = rx.add(gridData, "curlist3", "");
			
			rx.add(curlist3, "tot_pcnt", rec.tot_pcnt);
			rx.add(curlist3, "tot_cell", DigitUtil.cutUnderPoint(rec.tot_cell,1));
			rx.add(curlist3, "clr_cell", DigitUtil.cutUnderPoint(rec.clr_cell,1)); 
			rx.add(curlist3, "asum_pubc_amt", rec.asum_pubc_amt);
			rx.add(curlist3, "c0301_pcnt", rec.c0301_pcnt);  
			rx.add(curlist3, "c0302_pcnt", rec.c0302_pcnt);  
			rx.add(curlist3, "c0303_sect_nm", rec.c0303_sect_nm);
			rx.add(curlist3, "c0303_pcnt", rec.c0303_pcnt);  
			rx.add(curlist3, "c0304_sect_nm", rec.c0304_sect_nm);
			rx.add(curlist3, "c0304_pcnt", rec.c0304_pcnt);  
			rx.add(curlist3, "advt_ocpy_rate", DigitUtil.cutUnderPoint(rec.advt_ocpy_rate,1));
			rx.add(curlist3, "seq", rec.seq);
		}
		for(int i = 0; i < 1-ds.curlist3.size(); i++) {
			int curlist3 = rx.add(gridData, "curlist3", "");
			
			rx.add(curlist3, "tot_pcnt", "");
			rx.add(curlist3, "tot_cell", "");
			rx.add(curlist3, "clr_cell", ""); 
			rx.add(curlist3, "asum_pubc_amt", "");
			rx.add(curlist3, "c0301_pcnt", "");  
			rx.add(curlist3, "c0302_pcnt", "");  
			rx.add(curlist3, "c0303_sect_nm", "");
			rx.add(curlist3, "c0303_pcnt", "");  
			rx.add(curlist3, "c0304_sect_nm", "");
			rx.add(curlist3, "c0304_pcnt", "");  
			rx.add(curlist3, "advt_ocpy_rate", "");
			rx.add(curlist3, "seq", "");
		}
		  
		for(int i = 0; i < ds.curlist4.size(); i++) {
			AD_BAS_3210_LCURLIST4Record rec = (AD_BAS_3210_LCURLIST4Record)ds.curlist4.get(i);
			int curlist4 = rx.add(gridData, "curlist4", "");
			
			rx.add(curlist4, "tot_pcnt", rec.tot_pcnt);
			rx.add(curlist4, "tot_clas", DigitUtil.cutUnderPoint(rec.tot_clas,1));
			rx.add(curlist4, "asum_pubc_amt", rec.asum_pubc_amt);
			rx.add(curlist4, "seq", rec.seq);
		}
		for(int i = 0; i < 1-ds.curlist4.size(); i++) {
			int curlist4 = rx.add(gridData, "curlist4", "");
			
			rx.add(curlist4, "tot_pcnt", "");
			rx.add(curlist4, "tot_clas", "");
			rx.add(curlist4, "asum_pubc_amt", "");
			rx.add(curlist4, "seq", "");
		}
						
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
