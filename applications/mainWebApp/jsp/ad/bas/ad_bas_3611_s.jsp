<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML °´Ã¼ »ý¼º 
	
	AD_BAS_3611_SDataSet ds = (AD_BAS_3611_SDataSet)request.getAttribute("ds");
	
	int root 	  = RwXml.rootNodeID;
	int resData  = rx.add(root, 	"resData" 		, "");

	int formData = rx.add(resData, 	"resForm"		, "");
	
	
	try
	{
		rx.add(formData, "medi_clsf", ds.medi_clsf);
		rx.add(formData, "dlco_no", ds.dlco_no);
		rx.add(formData, "dlco_nm", ds.dlco_nm);
		rx.add(formData, "cust_seq", ds.cust_seq);
		rx.add(formData, "cust_name", ds.cust_name);
		rx.add(formData, "department", ds.department);
		rx.add(formData, "position", ds.position); 
		rx.add(formData, "mobile1", ds.mobile1);
		rx.add(formData, "mobile2", ds.mobile2);
		rx.add(formData, "phone1", ds.phone1);
		rx.add(formData, "phone2", ds.phone2);
		rx.add(formData, "fax", ds.fax);  
		rx.add(formData, "homepage", ds.homepage);
	//	rx.add(formData, "email", ds.email);
		rx.add(formData, "cmpy_zip1", ds.cmpy_zip1);
		rx.add(formData, "cmpy_zip2", ds.cmpy_zip2);
		rx.add(formData, "cmpy_addr", ds.cmpy_addr);
		rx.add(formData, "cmpy_dtls_addr", ds.cmpy_dtls_addr);
		rx.add(formData, "home_zip1", ds.home_zip1);
		rx.add(formData, "home_zip2", ds.home_zip2);
		rx.add(formData, "home_addr", ds.home_addr);
		rx.add(formData, "home_dtls_addr", ds.home_dtls_addr);
		rx.add(formData, "etc_zip1", ds.etc_zip1);
		rx.add(formData, "etc_zip2", ds.etc_zip2);
		rx.add(formData, "etc_addr", ds.etc_addr);
		rx.add(formData, "etc_dtls_addr", ds.etc_dtls_addr);
		rx.add(formData, "task1", ds.task1);
		rx.add(formData, "task1_represent", ds.task1_represent);
		rx.add(formData, "task2", ds.task2);
		rx.add(formData, "task2_represent", ds.task2_represent);	
		rx.add(formData, "incumbent_yn", ds.incumbent_yn);
		rx.add(formData, "sex", ds.sex);
		rx.add(formData, "birth_place", ds.birth_place);
		rx.add(formData, "birth_day", ds.birth_day);
		rx.add(formData, "wedding_yn", ds.wedding_yn);
		rx.add(formData, "wedding_day", ds.wedding_day);
		rx.add(formData, "family_size", ds.family_size);
		rx.add(formData, "religion", ds.religion);
		rx.add(formData, "military_service", ds.military_service);
		rx.add(formData, "hobby", ds.hobby);
		rx.add(formData, "golf", ds.golf);
		rx.add(formData, "drinking", ds.drinking);
		rx.add(formData, "smoking", ds.smoking);
		rx.add(formData, "remk", ds.remk);
		rx.add(formData, "protensity", ds.protensity);
		rx.add(formData, "reputation", ds.reputation);
		rx.add(formData, "slcrg_pers", ds.slcrg_pers);
		rx.add(formData, "slcrg_pers_nm", ds.slcrg_pers_nm);
		rx.add(formData, "mchrg_pers", ds.mchrg_pers);
		rx.add(formData, "mchrg_pers_nm", ds.mchrg_pers_nm);
		rx.add(formData, "peopledb_no", ds.peopledb_no);
		rx.add(formData, "del_yn", ds.del_yn);
	
		rx.add(formData, "chg_pers", ds.chg_pers);
		rx.add(formData, "chg_pers_nm", ds.chg_pers_nm);
		rx.add(formData, "chg_dt_tm", ds.chg_dt_tm);
	
		//multiupdatedata1,2 init
		rx.add(formData, "multiUpdateData1", "");
		rx.add(formData, "multiUpdateData2", "");
		
		rx.add(formData, "dlco_no_pre", ds.dlco_no);
		rx.add(formData, "cust_seq_pre", ds.cust_seq);
		
		//cust_item
		StringBuffer check =  new StringBuffer();
		String sep = "#";
		for(int i = 0; i < ds.item_curlist.size(); i++)
		{
			AD_BAS_3611_SCURLIST2Record rec = (AD_BAS_3611_SCURLIST2Record)ds.item_curlist.get(i);
			//int record = rx.add(formData, "formData", "");
			//rx.add(record, "cust_mang_item", rec.cust_mang_item);
			check.append(rec.item_cd);
			if ( i < ds.item_curlist.size()-1 )
			{
				check.append(sep);
			}
		}
		rx.add(formData, "cust_item", check.toString());
		
		//email
		String strEmail = ds.email;
		if( strEmail.length() == 0 )
		{
			rx.add(formData, "email", "");
			rx.add(formData, "email_addr", "");
		}
		else
		{
		    String[] email = strEmail.split("@"); 	
			rx.add(formData, "email", email[0]);
			rx.add(formData, "email_addr", email[1]);
		}	
		
		
		
		int gridData = rx.add(resData, 	"resDatagrid"	, "");
		int dg_school = rx.add(gridData,"dg_school"	, "");
		for(int i = 0; i < ds.school_curlist.size(); i++)
		{
			AD_BAS_3611_SCURLISTRecord rec = (AD_BAS_3611_SCURLISTRecord)ds.school_curlist.get(i);
			int record = rx.add(dg_school, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "frdt", rec.frdt); 
			rx.add(record, "sep", "~");
			rx.add(record, "todt", rec.todt); 
			rx.add(record, "memo", rec.memo); 
	
		}
		int dg_career = rx.add(gridData,"dg_career"	, "");
		for(int i = 0; i < ds.career_curlist.size(); i++)
		{
			AD_BAS_3611_SCURLISTRecord rec = (AD_BAS_3611_SCURLISTRecord)ds.career_curlist.get(i);
			int record = rx.add(dg_career, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "frdt", rec.frdt); 
			rx.add(record, "sep", "~");
			rx.add(record, "todt", rec.todt); 
			rx.add(record, "memo", rec.memo);	
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