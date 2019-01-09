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
* 파일명 : ad_bas_3711_l.jsp
* 기능 : 통합 조중동광고데이터베이스 목록조회
* 작성일자 : 2012.06.22
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
	AD_BAS_3711_LDataSet ds = (AD_BAS_3711_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData3", "");
//	int resForm = rx.add(resData, "resForm", "");
	int c_tot_cnt = 0;
	int j_tot_cnt = 0;
	int d_tot_cnt = 0;
	try
	{System.out.print("jsp 도착");
		//조선
		int gd_cs = rx.add(resData, "dg_tot", "");
		for(int i=0; i<ds.curlist.size(); i++)
		{
			AD_BAS_3711_LCURLISTRecord rec = (AD_BAS_3711_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gd_cs, "record", "");
			
			//조선
			rx.add(record, "c_pubc_dt", rec.c_pubc_dt);
			rx.add(record, "c_pubc_seq", rec.c_pubc_seq);
			rx.add(record, "c_sect", rec.c_sect);
			rx.addCData(record, "c_advt_cont", rec.c_advt_cont);
			rx.add(record, "c_slcrg_nm", rec.c_slcrg_nm);
			//rx.add(record, "c_remk", rec.c_remk);
			if(!"".equals(rec.c_sect)){
				c_tot_cnt = c_tot_cnt + 1;
			}
			//중앙
			rx.add(record, "j_pubc_dt", rec.j_pubc_dt);
			rx.add(record, "j_pubc_seq", rec.j_pubc_seq);
			rx.add(record, "j_sect", rec.j_sect);
			rx.addCData(record, "j_advt_cont", rec.j_advt_cont);
			rx.add(record, "j_slcrg_nm", rec.j_slcrg_nm);
			//rx.add(record, "j_remk", rec.j_remk);	
			if(!"".equals(rec.j_sect)){
				j_tot_cnt = j_tot_cnt + 1;
			}					
			//동아
			rx.add(record, "d_pubc_dt", rec.d_pubc_dt);
			rx.add(record, "d_pubc_seq", rec.d_pubc_seq);
			rx.add(record, "d_sect", rec.d_sect);
			rx.addCData(record, "d_advt_cont", rec.d_advt_cont);
			rx.add(record, "d_slcrg_nm", rec.d_slcrg_nm);
			//rx.add(record, "d_remk", rec.d_remk);		
			if(!"".equals(rec.d_sect)){
				d_tot_cnt = d_tot_cnt + 1;
			}									
		}
		System.out.print("jsp last row");
		//마지막 행에 총건수 표기
		int record2 = rx.add(gd_cs, "record", "");
		
		//조선
		rx.add(record2, "c_pubc_dt", "건수");
		rx.add(record2, "c_pubc_seq", "");
		rx.add(record2, "c_sect", "");
		rx.add(record2, "c_advt_cont", c_tot_cnt);
		rx.add(record2, "c_slcrg_nm", "");
		//중앙
		rx.add(record2, "j_pubc_dt", "");
		rx.add(record2, "j_pubc_seq", "");
		rx.add(record2, "j_sect", "");
		rx.add(record2, "j_advt_cont", j_tot_cnt);
		rx.add(record2, "j_slcrg_nm", "");
    		//동아
		rx.add(record2, "d_pubc_dt", "");
		rx.add(record2, "d_pubc_seq", "");
		rx.add(record2, "d_sect", "");
		rx.add(record2, "d_advt_cont", d_tot_cnt);
		rx.add(record2, "d_slcrg_nm", "");		

	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
