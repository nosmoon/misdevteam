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
* 파일명 : ad_bas_3601_l.jsp
* 기능 : 거래처인물정보 리스트
* 작성일자 : 2010.07.26
* 작성자 : KBS
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	AD_BAS_3601_LDataSet ds = (AD_BAS_3601_LDataSet)request.getAttribute("ds");

	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
 
	try{
		for( int i = 0; i < ds.curlist.size(); i++ )
		{
			AD_BAS_3601_LCURLISTRecord rec = (AD_BAS_3601_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "checked", "N"); 
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "cust_seq", rec.cust_seq);
			rx.add(record, "cust_name", rec.cust_name);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "department", rec.department);
			rx.add(record, "position", rec.position);
			rx.add(record, "mobile1", rec.mobile1);
			rx.add(record, "mobile2", rec.mobile2);
			rx.add(record, "phone1", rec.phone1);
			rx.add(record, "phone2", rec.phone2);
			rx.add(record, "homepage", rec.homepage);
			rx.add(record, "fax", rec.fax);
			rx.add(record, "email", rec.email);
			rx.add(record, "cmpy_addr", rec.cmpy_addr);
			rx.add(record, "home_addr", rec.home_addr);
			rx.add(record, "etc_addr", rec.etc_addr);
			rx.add(record, "task1", rec.task1);
			rx.add(record, "task1_represent", rec.task1_represent);
			rx.add(record, "task2", rec.task2);
			rx.add(record, "task2_represent", rec.task2_represent);
			rx.add(record, "incumbent_yn", rec.incumbent_yn);
			rx.add(record, "birth_place", rec.birth_place);
			rx.add(record, "birth_day", rec.birth_day);
			rx.add(record, "sex", rec.sex);
			rx.add(record, "wedding_yn", rec.wedding_yn);
			rx.add(record, "wedding_day", rec.wedding_day);
			rx.add(record, "family_size", rec.family_size);
			rx.add(record, "religion", rec.religion);
			rx.add(record, "military_service", rec.military_service);
			rx.add(record, "hobby", rec.hobby);
			rx.add(record, "golf", rec.golf);
			rx.add(record, "drinking", rec.drinking);
			rx.add(record, "smoking", rec.smoking);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "protensity", rec.protensity);
			rx.add(record, "reputation", rec.reputation);
			rx.add(record, "slcrg_pers", rec.slcrg_pers);
			rx.add(record, "slcrg_pers_nm", rec.slcrg_pers_nm);
			rx.add(record, "mchrg_pers", rec.mchrg_pers);
			rx.add(record, "mchrg_pers_nm", rec.mchrg_pers_nm);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_pers_nm", rec.incmg_pers_nm);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_pers_nm", rec.chg_pers_nm);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.add(record, "peopledb_no", rec.peopledb_no);
			if( rec.peopledb_no != "" )		rx.add(record, "btn_peopledb", "연결");
			else							rx.add(record, "btn_peopledb", "");
			rx.add(record, "item_list", rec.item_list);
			rx.add(record, "grp_cmpy_cd", rec.grp_cmpy_cd);
			rx.add(record, "grp_cmpy", rec.grp_cmpy);
		}
		
	} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
