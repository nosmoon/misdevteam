<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.bas.rec.*
	,	chosun.ciis.is.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_BAS_1810_LDataSet ds = (IS_BAS_1810_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int iLvl_cnt = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "deptTree", "");

	try {
		/****** CURLIST BEGIN */
		/*
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_BAS_1810_LCURLISTRecord rec = (IS_BAS_1810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "step", rec.step);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
		}
		*/
		/****** CURLIST END */


		/****** CURLIST BEGIN*/
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_BAS_1810_LCURLISTRecord rec = (IS_BAS_1810_LCURLISTRecord)ds.curlist.get(i);
			if(Integer.parseInt(rec.step) == 0){
				int record = rx.add(dataSet, "item", "");
				rx.add(record, "label", StringUtil.replaceToXml(rec.dept_nm) + "(" + rec.dept_cd + ")");
				rx.add(record, "value", rec.dept_cd);
				rx.add(record, "selectImage", "select.gif");
				rx.add(record, "image", "image.gif");
				
				for(int j = 0; j < ds.curlist.size(); j++) {
					IS_BAS_1810_LCURLISTRecord sub_rec = (IS_BAS_1810_LCURLISTRecord)ds.curlist.get(j);
					if(Integer.parseInt(sub_rec.step) == 1 && sub_rec.supr_dept_cd.equals(rec.dept_cd)){
						int sub_record = rx.add(record, "item", "");
						rx.add(sub_record, "label", StringUtil.replaceToXml(sub_rec.dept_nm) + "(" + sub_rec.dept_cd + ") ");
						rx.add(sub_record, "value", sub_rec.dept_cd);
						rx.add(sub_record, "selectImage", "select.gif");
						rx.add(sub_record, "image", "image.gif");
						
						
						for(int k = 0; k < ds.curlist.size(); k++) {
							IS_BAS_1810_LCURLISTRecord sub_1_rec = (IS_BAS_1810_LCURLISTRecord)ds.curlist.get(k);
							if(Integer.parseInt(sub_1_rec.step) == 2 && sub_1_rec.supr_dept_cd.equals(sub_rec.dept_cd)){
								int sub_1_record = rx.add(sub_record, "item", "");
									rx.add(sub_1_record, "label", StringUtil.replaceToXml(sub_1_rec.dept_nm) + "(" + sub_1_rec.dept_cd + ") ");
									rx.add(sub_1_record, "value", sub_1_rec.dept_cd);
									rx.add(sub_1_record, "selectImage", "select.gif");
									rx.add(sub_1_record, "image", "image.gif");
									
									
								for(int l = 0; l < ds.curlist.size(); l++) {
									IS_BAS_1810_LCURLISTRecord sub_2_rec = (IS_BAS_1810_LCURLISTRecord)ds.curlist.get(l);
									if(Integer.parseInt(sub_2_rec.step) == 3 && sub_2_rec.supr_dept_cd.equals(sub_1_rec.dept_cd)){
										int sub_2_record = rx.add(sub_1_record, "item", "");
										rx.add(sub_2_record, "label", StringUtil.replaceToXml(sub_2_rec.dept_nm) + "(" + sub_2_rec.dept_cd + ") ");
										rx.add(sub_2_record, "value", sub_2_rec.dept_cd);
										rx.add(sub_2_record, "selectImage", "select.gif");
										rx.add(sub_2_record, "image", "image.gif");
									}
								}
							}
						}
					//}else if(Integer.parseInt(sub_rec.lvl) == 2 && sub_rec.insd_dept_cd.substring(0,4).equals(rec.insd_dept_cd)){
					//	int sub_record = rx.add(record, "item", "");
					//	rx.add(sub_record, "label", StringUtil.replaceToXml(sub_rec.dept_nm) + "(" + sub_rec.dept_cd + ") ");
					//	rx.add(sub_record, "value", sub_rec.dept_cd);
					//	rx.add(sub_record, "selectImage", "select.gif");
					//	rx.add(sub_record, "image", "image.gif");
						
					//	int sub_1_record = rx.add(sub_record, "item", "");
					//	rx.add(sub_1_record, "label", StringUtil.replaceToXml(sub_rec.dept_nm) + "(" + sub_rec.dept_cd + ") ");
					//	rx.add(sub_1_record, "value", sub_rec.dept_cd);
					//	rx.add(sub_1_record, "selectImage", "select.gif");
					//	rx.add(sub_1_record, "image", "image.gif");
					}
				}
			}
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>