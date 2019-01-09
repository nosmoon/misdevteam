<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.co.lib.xi.RwXmlWrapper;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_2810_l.jsp
* 기능 : 신문대금담보조회 
* 작성일자 : 2016-11-01
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
/*
	RwXml rx = new RwXml();
	SE_BOI_2810_LDataSet ds = (SE_BOI_2810_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	int gridData2 = 0;
	gridData = rx.add(root, "gridData", "");
	gridData2 = rx.add(root, "gridData2", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_2810_LCURLISTRecord rec = (SE_BOI_2810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "cntr_stat_clsf", rec.cntr_stat_clsf);
			rx.add(record, "deptnm", rec.deptnm);
			rx.add(record, "partnm", rec.partnm);
			rx.add(record, "areanm", rec.areanm);
			rx.add(record, "bonm", rec.bonm);
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "bo_cntr_dt", rec.bo_cntr_dt);
			rx.add(record, "bogurt_clsf", rec.bogurt_clsf);
			rx.add(record, "net_sale_amt", rec.net_sale_amt);
			rx.add(record, "jont_d", rec.jont_d);
			rx.add(record, "add_bogurt_amt", rec.add_bogurt_amt);
			rx.add(record, "mort_amt", rec.mort_amt);
			rx.add(record, "gurt_amt_chk", rec.gurt_amt_chk);
			rx.add(record, "bo_seq", rec.bo_seq);			
			rx.add(record, "cntr_gurt_amt_stot", rec.cntr_gurt_amt_stot);
		}
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			SE_BOI_2810_LCURLISTRecord rec2 = (SE_BOI_2810_LCURLISTRecord)ds.curlist2.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "cntr_stat_clsf", rec2.cntr_stat_clsf);
			rx.add(record, "deptnm", rec2.deptnm);
			rx.add(record, "partnm", rec2.partnm);
			rx.add(record, "areanm", rec2.areanm);
			rx.add(record, "bonm", rec2.bonm);
			rx.add(record, "bo_cd", rec2.bo_cd);
			rx.addCData(record, "bo_head_nm", rec2.bo_head_nm);
			rx.add(record, "bo_cntr_dt", rec2.bo_cntr_dt);			
			rx.add(record, "net_sale_amt", rec2.net_sale_amt);
			rx.add(record, "insr_cmpy", rec2.jont_d);
			rx.add(record, "insr_no", rec2.add_bogurt_amt);
			rx.add(record, "insr_amt", rec2.mort_amt);
			rx.add(record, "insr_fr_dt", rec2.bo_seq);			
			rx.add(record, "insr_to_dt", rec2.bo_seq);			
			rx.add(record, "insr_prem", rec2.bo_seq);			
			rx.add(record, "insr_clsf", rec2.bo_seq);			
			rx.add(record, "end_yn", rec2.bo_seq);			
			rx.add(record, "bo_seq", rec2.bo_seq);			
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
*/

	SE_BOI_2810_LDataSet ds = (SE_BOI_2810_LDataSet)request.getAttribute("ds");
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.makeParentNode(root, "resTemp");
	
	rxw.makeDataToBulk(ds, "curlist", resTemp, "gridData");
	rxw.makeDataToBulk(ds, "curlist2", resTemp, "gridData2");
		
	rxw.flush(out);
%>
