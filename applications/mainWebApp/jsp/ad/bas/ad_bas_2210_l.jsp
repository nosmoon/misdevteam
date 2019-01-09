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
* 파일명 : ad_bas_2210_l.jsp
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
	AD_BAS_2210_LDataSet ds = (AD_BAS_2210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	
 
	try{
	
		//광고게재현황
		int gridData01 = rx.add(resData, "gridData01", "");
		long tot_pubc_amt	=	0;
		long tot_pubc_cnt	=	0;
		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			AD_BAS_2210_LCURLIST1Record rec = (AD_BAS_2210_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData01, "record", "");
			
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "dlco_nm", rec.dlco_nm); 
			rx.add(record, "advt_fee", rec.advt_fee);
			tot_pubc_amt	+=	StringUtil.toLong(rec.advt_fee);
			tot_pubc_cnt++;
		}
		rx.add(resData, "tot_pubc_amt", tot_pubc_amt);
		rx.add(resData, "tot_pubc_cnt", tot_pubc_cnt);
		
		//부실채권
		int gridData02 = rx.add(resData, "gridData02", "");
		long tot_dhon_amt	=	0;
		long tot_dhon_cnt	=	0;
		
		for(int i = 0; i < ds.curlist6.size(); i++) {
			AD_BAS_2210_LCURLIST6Record rec = (AD_BAS_2210_LCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(gridData02, "record", "");
			
			rx.add(record, "enty_dt", rec.enty_dt);
			rx.add(record, "dlco_nm", rec.dlco_nm); 
			rx.add(record, "dhon_amt", rec.dhon_amt);
			tot_dhon_amt	+=	StringUtil.toLong(rec.dhon_amt);
			tot_dhon_cnt++;
		}
		rx.add(resData, "tot_dhon_amt", tot_dhon_amt);
		rx.add(resData, "tot_dhon_cnt", tot_dhon_cnt);
		

		//거래처(광고주)
		int gridData1 = rx.add(resData, "gridData1", "");
		long tot_dlco_cnt	=	0;
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_BAS_2210_LCURLIST2Record rec = (AD_BAS_2210_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(gridData1, "record", "");
			
			rx.add(record, "dlco_nm", rec.dlco_nm); 
			rx.add(record, "advt_fee", rec.advt_fee);
			tot_dlco_cnt++;
		}
		rx.add(resData, "tot_dlco_cnt", tot_dlco_cnt);
		

		//거래처(대행사)
		int gridData2 = rx.add(resData, "gridData2", "");
		long tot_agn_cnt	=	0;
		
		for(int i = 0; i < ds.curlist3.size(); i++) {
			AD_BAS_2210_LCURLIST3Record rec = (AD_BAS_2210_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(gridData2, "record", "");
			
			rx.add(record, "agn_nm", rec.agn_nm); 
			rx.add(record, "advt_fee", rec.advt_fee);
			tot_agn_cnt++;
		}
		rx.add(resData, "tot_agn_cnt", tot_agn_cnt);
		

		//일일보고(거래처접촉자료)
		int gridData3 = rx.add(resData, "gridData3", "");
		long tot_rept01_cnt	=	0;
		
		for(int i = 0; i < ds.curlist4.size(); i++) {
			AD_BAS_2210_LCURLIST4Record rec = (AD_BAS_2210_LCURLIST4Record)ds.curlist4.get(i);
			
			if(!"01".equals(rec.rept_clsf)) continue;
			
			int record = rx.add(gridData3, "record", "");
			
			rx.add(record, "make_dt", rec.make_dt); 
			rx.add(record, "dlco_nm", rec.dlco_nm); 
			rx.add(record, "titl", rec.titl);
			rx.add(record, "rept_clsf", rec.rept_clsf);
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "advcs_clsf", rec.advcs_clsf);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "rept_no", rec.rept_no);
			
			tot_rept01_cnt++;
		}
		rx.add(resData, "tot_rept01_cnt", tot_rept01_cnt);
			 
		//일일보고(정보보고)
		int gridData4 = rx.add(resData, "gridData4", "");
		long tot_rept02_cnt	=	0;		
		for(int i = 0; i < ds.curlist4.size(); i++) {
			AD_BAS_2210_LCURLIST4Record rec = (AD_BAS_2210_LCURLIST4Record)ds.curlist4.get(i);

			if(!"02".equals(rec.rept_clsf)) continue;  
			
			int record = rx.add(gridData4, "record", "");
			
			rx.add(record, "make_dt", rec.make_dt); 
			rx.add(record, "dlco_nm", rec.dlco_nm); 
			rx.add(record, "titl", rec.titl);
			rx.add(record, "rept_clsf", rec.rept_clsf);
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "advcs_clsf", rec.advcs_clsf);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "rept_no", rec.rept_no);
			tot_rept02_cnt++;
		}
		rx.add(resData, "tot_rept02_cnt", tot_rept02_cnt);		
		
		
		//일일조중동비교(선게재)
		int gridData7 = rx.add(resData, "gridData7", "");
		long tot_pubc01_cnt	=	0;		
		for(int i = 0; i < ds.curlist5.size(); i++) {
			AD_BAS_2210_LCURLIST5Record rec = (AD_BAS_2210_LCURLIST5Record)ds.curlist5.get(i);

			if(!"1".equals(rec.pubc_clsf)) continue;
			
			int record = rx.add(gridData7, "record", "");
			
			rx.add(record, "medi_nm", rec.medi_nm);  
			rx.add(record, "pubc_dt", rec.pubc_dt); 
			rx.add(record, "advt_cont", rec.advt_cont); 
			rx.add(record, "advt_size", rec.advt_size);
			rx.add(record, "remk", rec.remk);
			tot_pubc01_cnt++;
		}
		rx.add(resData, "tot_pubc01_cnt", tot_pubc01_cnt);
		//일일조중동비교(단독게재)
		int gridData8 = rx.add(resData, "gridData8", "");
		long tot_pubc02_cnt	=	0;		
		for(int i = 0; i < ds.curlist5.size(); i++) {
			AD_BAS_2210_LCURLIST5Record rec = (AD_BAS_2210_LCURLIST5Record)ds.curlist5.get(i);

			if(!"2".equals(rec.pubc_clsf)) continue;
			
			int record = rx.add(gridData8, "record", "");
			
			rx.add(record, "medi_nm", rec.medi_nm); 
			rx.add(record, "pubc_dt", rec.pubc_dt); 
			rx.add(record, "advt_cont", rec.advt_cont); 
			rx.add(record, "advt_size", rec.advt_size);
			rx.add(record, "remk", rec.remk);
			tot_pubc02_cnt++;
		}
		rx.add(resData, "tot_pubc02_cnt", tot_pubc02_cnt);		
		//일일조중동비교(추가게재)
		int gridData9 = rx.add(resData, "gridData9", "");
		long tot_pubc03_cnt	=	0;		
		for(int i = 0; i < ds.curlist5.size(); i++) {
			AD_BAS_2210_LCURLIST5Record rec = (AD_BAS_2210_LCURLIST5Record)ds.curlist5.get(i);

			if(!"3".equals(rec.pubc_clsf)) continue;
			
			int record = rx.add(gridData9, "record", "");
			
			rx.add(record, "medi_nm", rec.medi_nm); 
			rx.add(record, "pubc_dt", rec.pubc_dt); 
			rx.add(record, "advt_cont", rec.advt_cont); 
			rx.add(record, "advt_size", rec.advt_size);
			rx.add(record, "remk", rec.remk);
			tot_pubc03_cnt++;
		}
		rx.add(resData, "tot_pubc03_cnt", tot_pubc03_cnt);		
			
		//일일조중동비교(미게재)
		int gridData10 = rx.add(resData, "gridData10", "");
		long tot_pubc04_cnt	=	0;		
		for(int i = 0; i < ds.curlist5.size(); i++) {
			AD_BAS_2210_LCURLIST5Record rec = (AD_BAS_2210_LCURLIST5Record)ds.curlist5.get(i);

			if(!"4".equals(rec.pubc_clsf)) continue;
			
			int record = rx.add(gridData10, "record", "");
			
			rx.add(record, "medi_nm", rec.medi_nm); 
			rx.add(record, "pubc_dt", rec.pubc_dt); 
			rx.add(record, "advt_cont", rec.advt_cont); 
			rx.add(record, "advt_size", rec.advt_size);
			rx.add(record, "remk", rec.remk);
			tot_pubc04_cnt++;
		}
		rx.add(resData, "tot_pubc04_cnt", tot_pubc04_cnt);		
		
		
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
