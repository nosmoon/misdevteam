<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*
				,chosun.ciis.ad.bas.ds.*
				,chosun.ciis.co.base.util.*
				,somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BAS_1540_SDataSet ds = (AD_BAS_1540_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int formData = 0;
	String errcode = "";
	String errmsg = "";

	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** CURLIST2 BEGIN */
		if(ds.page_id.equals("AD_BAS_1500")){		//일일보고
			formData = rx.add(root, "formData", "");
			for(int i = 0; i < ds.curlist1.size(); i++) {
				AD_BAS_1540_SCURLIST1Record rec = (AD_BAS_1540_SCURLIST1Record)ds.curlist1.get(i);
				rx.add(formData, "cont", rec.cont);//System.out.println("cont::"+rec.cont);
				rx.add(formData, "taem_chf_opn", rec.taem_chf_opn);
			}		
		}else if(ds.page_id.equals("AD_BAS_1501")){	//일일보고 등록
			resData = rx.add(root, "resData", "");
			resform = rx.add(resData, "resform", "");			
			
			for(int i = 0; i < ds.curlist2.size(); i++) {
				AD_BAS_1540_SCURLIST2Record rec = (AD_BAS_1540_SCURLIST2Record)ds.curlist2.get(i);	
				switch (i){
    				case  0 :
						rx.add(resform, "add_file_no1", rec.add_file_no);
						rx.add(resform, "add_file_nm1", rec.add_file_nm);
						break;
    				case  1 :
						rx.add(resform, "add_file_no2", rec.add_file_no);
						rx.add(resform, "add_file_nm2", rec.add_file_nm);						
						break;
    				case  2 :
						rx.add(resform, "add_file_no3", rec.add_file_no);
						rx.add(resform, "add_file_nm3", rec.add_file_nm);
						break;
    				case  3 :
						rx.add(resform, "add_file_no4", rec.add_file_no);
						rx.add(resform, "add_file_nm4", rec.add_file_nm);
						break;
    				case  4 :
						rx.add(resform, "add_file_no5", rec.add_file_no);
						rx.add(resform, "add_file_nm5", rec.add_file_nm);
						break;
				}
			}
		
			switch (ds.curlist2.size()){
   				case  0 :
					rx.add(resform, "add_file_no1", "");
					rx.add(resform, "add_file_nm1", "");
					rx.add(resform, "add_file_no2", "");
					rx.add(resform, "add_file_nm2", "");
					rx.add(resform, "add_file_no3", "");
					rx.add(resform, "add_file_nm3", "");
					rx.add(resform, "add_file_no4", "");
					rx.add(resform, "add_file_nm4", "");
					rx.add(resform, "add_file_no5", "");
					rx.add(resform, "add_file_nm5", "");	
					break;			
   				case  1 :
					rx.add(resform, "add_file_no2", "");
					rx.add(resform, "add_file_nm2", "");
					rx.add(resform, "add_file_no3", "");
					rx.add(resform, "add_file_nm3", "");
					rx.add(resform, "add_file_no4", "");
					rx.add(resform, "add_file_nm4", "");
					rx.add(resform, "add_file_no5", "");
					rx.add(resform, "add_file_nm5", "");	
					break;
   				case  2 :
					rx.add(resform, "add_file_no3", "");
					rx.add(resform, "add_file_nm3", "");
					rx.add(resform, "add_file_no4", "");
					rx.add(resform, "add_file_nm4", "");
					rx.add(resform, "add_file_no5", "");
					rx.add(resform, "add_file_nm5", "");
					break;
   				case  3 :
					rx.add(resform, "add_file_no4", "");
					rx.add(resform, "add_file_nm4", "");
					rx.add(resform, "add_file_no5", "");
					rx.add(resform, "add_file_nm5", "");
					break;
   				case  4 :
					rx.add(resform, "add_file_no5", "");
					rx.add(resform, "add_file_nm5", "");
					break;
			}
			/****** CURLIST2 END */

			/****** CURLIST1 BEGIN */
			for(int i = 0; i < ds.curlist1.size(); i++) {
				AD_BAS_1540_SCURLIST1Record rec = (AD_BAS_1540_SCURLIST1Record)ds.curlist1.get(i);
	
				rx.add(resform, "cmpy_cd", rec.cmpy_cd);
				rx.add(resform, "rept_clsf", rec.rept_clsf);
				rx.add(resform, "make_dt", rec.make_dt);
				rx.add(resform, "rept_no", rec.rept_no);
				rx.add(resform, "advcs_clsf", rec.advcs_clsf);
				rx.add(resform, "medi_clsf", rec.medi_clsf);
				rx.add(resform, "data_clsf", rec.data_clsf);  
				rx.add(resform, "chrg_pers", rec.chrg_pers);
				rx.add(resform, "dlco_no", rec.dlco_no);
				rx.addCData(resform, "dlco_nm", rec.dlco_nm); 
				rx.add(resform, "patr_chrg_pers", rec.patr_chrg_pers);
				rx.addCData(resform, "titl", rec.titl);
				rx.add(resform, "cont", rec.cont);
				rx.add(resform, "incmg_dt_tm", rec.incmg_dt_tm);
				rx.add(resform, "chg_dt_tm", rec.chg_dt_tm);
				rx.add(resform, "flag", "");
				
			}
			/****** CURLIST1 END */
			
		}
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
//		rx.add(dataSet, "errcode", errcode);
//		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<cmpy_cd/>
			<rept_clsf/>
			<make_dt/>
			<rept_no/>
			<add_file_no/>
			<add_file_nm/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<cmpy_cd/>
			<rept_clsf/>
			<make_dt/>
			<rept_no/>
			<advcs_clsf/>
			<medi_clsf/>
			<chrg_pers/>
			<dlco_no/>
			<patr_chrg_pers/>
			<titl/>
			<cont/>
			<incmg_dt_tm/>
			<chg_dt_tm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Feb 12 15:00:06 KST 2009 */ %>