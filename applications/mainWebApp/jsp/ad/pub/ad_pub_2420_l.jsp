<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ad_pub_2420_l.jsp
* 기능 : 
* 작성일자 : 2009-02-26
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
	AD_PUB_2420_LDataSet ds = (AD_PUB_2420_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData2", "");
	
	try {

		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_2420_LCURLISTRecord rec = (AD_PUB_2420_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "ch_yn", "N");
			rx.add(record, "pubc_side", rec.pubc_side);
			rx.addCData(record, "dlco_nm", StringUtil.strip(rec.dlco_nm));
			rx.addCData(record, "sect_nm", rec.sect_nm);
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "wkdy", rec.wkdy);
			rx.add(record, "advt_fee", rec.advt_fee);  
			rx.add(record, "chro_clsf", rec.chro_clsf);
			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm,1));
			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn,1));
			rx.add(record, "agn", rec.agn);
			rx.add(record, "fee", rec.fee);
			rx.add(record, "medi_cd", rec.medi_cd);  
			rx.add(record, "pubc_occr_dt", rec.pubc_occr_dt);
			rx.add(record, "pubc_occr_seq", rec.pubc_occr_seq);
		}
	} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>  
