<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.ad.res.ds.*
	,	chosun.ciis.co.base.util.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_RES_1110_LDataSet ds = (AD_RES_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");

	try {
		
		String[] tmp_chro_clsf = new String[]{"", "BW","CL1","CL2","CL3"};
		String[] tmp_bw_clr_yn = new String[]{"", "B/W","C/L"};
		
		rx.add(resData, "clos_yn", ds.clos_yn);
		rx.add(resData, "tot_dn_cnt", ds.tot_dn_cnt);
		rx.add(resData, "advs_ocpy_rate", ds.advs_ocpy_rate);
		
		for(int i = 0; i < ds.sectcurlist.size(); i++) {
			AD_RES_1110_LSECTCURLISTRecord rec = (AD_RES_1110_LSECTCURLISTRecord)ds.sectcurlist.get(i);
			
			String sect_clas_cd = StringUtil.nvl(rec.sect_clas_cd);
			String sect_nm_cd   = StringUtil.nvl(rec.sect_nm_cd);
			String sect_cd   	= StringUtil.nvl(rec.sect_cd);
			
			int gridData = rx.add(resData, "gridData" + (i+1), "");
			
			rx.addCData(gridData, "sect_nm", rec.sect_nm +"("+rec.sect_cd +rec.max_seq+")" + ", CL:" + rec.clr_cnt);
			
			for(int j = 0; j < ds.curlist.size(); j++) {
				AD_RES_1110_LCURLISTRecord sub_rec = (AD_RES_1110_LCURLISTRecord)ds.curlist.get(j);
				
				String sub_sect_clas_cd	=	StringUtil.nvl(sub_rec.sect_clas_cd);
				String sub_sect_nm_cd	=	StringUtil.nvl(sub_rec.sect_nm_cd);
				String sub_sect_cd		=	StringUtil.nvl(sub_rec.sect_cd);
				
				if(!sect_clas_cd.equals(sub_sect_clas_cd)) continue;
				if(!sect_nm_cd.equals(sub_sect_nm_cd)) continue;
				if(!sect_cd.equals(sub_sect_cd)) continue;

				String medi_cd = sub_rec.medi_cd;
				
				int record = rx.add(gridData, "record", "");
				rx.add(record, "issu_side", sub_rec.issu_side);
				rx.add(record, "sect_seq", sub_rec.sect_seq);
				rx.add(record, "cm", DigitUtil.cutUnderPoint(sub_rec.cm,1));
				rx.add(record, "dn", DigitUtil.cutUnderPoint(sub_rec.dn,1));
				
				if("110".equals(medi_cd)){
					int  chro_clsf = StringUtil.toNumber(sub_rec.chro_clsf)+1;
					
//					rx.add(record, "bw_clr_yn", sub_rec.chro_clsf);
					rx.add(record, "bw_clr_yn", chro_clsf);
					rx.add(record, "bw_clr_nm", "".equals(sub_rec.chro_clsf) ? "" : tmp_chro_clsf[chro_clsf]);
					
				}else{
					rx.add(record, "bw_clr_yn", sub_rec.bw_clr_yn);
					rx.add(record, "bw_clr_nm", "".equals(sub_rec.bw_clr_yn) ? "" : tmp_bw_clr_yn[StringUtil.toNumber(sub_rec.bw_clr_yn)]);
				}
				rx.add(record, "preng_cnt", sub_rec.preng_cnt);
			}
		}
	}
	catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
