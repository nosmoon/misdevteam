<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML 객체 생성 
	
	AD_BAS_2110_SDataSet ds = (AD_BAS_2110_SDataSet)request.getAttribute("ds");
	
	int root 	  = RwXml.rootNodeID;
	int formData  = rx.add( root , "formData" , "");
	
	rx.add(formData, "prfl_no", ds.prfl_no);
	rx.add(formData, "dlco_no", ds.dlco_no);
	rx.add(formData, "dlco_nm", ds.dlco_nm); 
	rx.add(formData, "flnm", ds.flnm);
	rx.add(formData, "chin_flnm", ds.chin_flnm);
	rx.add(formData, "sex", ds.sex);
	rx.add(formData, "bidt", ds.bidt);
	rx.add(formData, "nativ", ds.nativ);  
	rx.add(formData, "cur_job", ds.cur_job);
	rx.add(formData, "offi_zip1", ds.offi_zip1);
	rx.add(formData, "offi_zip2", ds.offi_zip2);
	rx.add(formData, "offi_zip3", ds.offi_zip3);
	rx.add(formData, "offi_addr", ds.offi_addr);
	rx.add(formData, "offi_dtls_addr", ds.offi_dtls_addr);
	rx.add(formData, "offi_tel_no", ds.offi_tel_no);
	rx.add(formData, "home_zip1", ds.home_zip1);
	rx.add(formData, "home_zip2", ds.home_zip2);
	rx.add(formData, "home_zip2", ds.home_zip2);
	rx.add(formData, "home_addr", ds.home_addr);
	rx.add(formData, "home_dtls_addr", ds.home_dtls_addr);
	rx.add(formData, "home_tel_no", ds.home_tel_no);
	rx.add(formData, "etc_addr_zip1", ds.etc_addr_zip1);
	rx.add(formData, "etc_addr_zip2", ds.etc_addr_zip2);
	rx.add(formData, "etc_addr", ds.etc_addr);
	rx.add(formData, "etc_dtls_addr", ds.etc_dtls_addr);
	rx.add(formData, "ceph_no1", ds.ceph_no1);
	rx.add(formData, "ceph_no2", ds.ceph_no2);
	rx.add(formData, "birth_hscl", ds.birth_hscl);
	rx.add(formData, "birth_univ", ds.birth_univ);
	
	String str = ds.email; 
    String[] email = str.split("@"); 	
	rx.add(formData, "email", email[0]);
	rx.add(formData, "gubun_email", email[1]);
	
	rx.add(formData, "wedd_anvy_dt", ds.wedd_anvy_dt);
	rx.add(formData, "relg", ds.relg);
	rx.add(formData, "hby", ds.hby);
	rx.add(formData, "army", ds.army);
	rx.add(formData, "child_cnt", ds.child_cnt);
	rx.add(formData, "golf", ds.golf);
	rx.add(formData, "smok_yn", ds.smok_yn);
	rx.add(formData, "drink_yn", ds.drink_yn);
	rx.add(formData, "main_nwsp_subs", ds.main_nwsp_subs);
	rx.add(formData, "wedd_yn", ds.wedd_yn);
	rx.add(formData, "spc_matt", ds.spc_matt);
	rx.add(formData, "vip_pers_line", ds.vip_pers_line);
	rx.add(formData, "lvcmpy_yn", ds.lvcmpy_yn);
	rx.add(formData, "chg_pers", ds.chg_pers);
	rx.add(formData, "chg_dt_tm", ds.chg_dt_tm);
	
	StringBuffer check =  new StringBuffer();
	String sep = "#";
	for(int i = 0; i < ds.curlist2.size(); i++) {
		AD_BAS_2110_SCURLIST2Record rec = (AD_BAS_2110_SCURLIST2Record)ds.curlist2.get(i);
		//int record = rx.add(formData, "formData", "");
		//rx.add(record, "cust_mang_item", rec.cust_mang_item);
		check.append(rec.cust_mang_item);
		
		if ( i < ds.curlist2.size()-1 ){
			check.append(sep);
		}
	}	
	
	rx.add(formData, "cust_mang_item", check.toString());
	

	int gridData = rx.add(formData, "gridData", "");
	
	for(int i = 0; i < ds.curlist.size(); i++) {
		AD_BAS_2110_SCURLISTRecord rec = (AD_BAS_2110_SCURLISTRecord)ds.curlist.get(i);
		int record = rx.add(gridData, "record", "");
		rx.add(record, "seq", rec.seq);
		rx.add(record, "frdt", rec.frdt); 
		rx.add(record, "todt", rec.todt); 
		rx.add(record, "carr_matt", rec.carr_matt); 

	}	
		
    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>