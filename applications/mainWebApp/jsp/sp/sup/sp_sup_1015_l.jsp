<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sup.rec.*
	,	chosun.ciis.sp.sup.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SUP_1015_LDataSet ds = (SP_SUP_1015_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int iLvl_cnt = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "deptTree", "");

	try {
		/****** CURLIST1 BEGIN*/
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SP_SUP_1015_LCURLIST1Record rec = (SP_SUP_1015_LCURLIST1Record)ds.curlist1.get(i);
			if(Integer.parseInt(rec.step) == 0){
				int record = rx.add(dataSet, "item", "");
				rx.add(record, "label", StringUtil.replaceToXml(rec.cdnm));
				rx.add(record, "value", rec.cd);
				rx.add(record, "selectImage", "select.gif");
				rx.add(record, "image", "image.gif");
				
				for(int j = 0; j < ds.curlist1.size(); j++) {
					SP_SUP_1015_LCURLIST1Record sub_rec = (SP_SUP_1015_LCURLIST1Record)ds.curlist1.get(j);
					if(Integer.parseInt(sub_rec.step) == 1 && sub_rec.up_cd.equals(rec.cd)){
						int sub_record = rx.add(record, "item", "");
						rx.add(sub_record, "label", StringUtil.replaceToXml(sub_rec.cdnm));
						rx.add(sub_record, "value", sub_rec.cd);
						rx.add(sub_record, "selectImage", "select.gif");
						rx.add(sub_record, "image", "image.gif");
						
						
						for(int k = 0; k < ds.curlist1.size(); k++) {
							SP_SUP_1015_LCURLIST1Record sub_1_rec = (SP_SUP_1015_LCURLIST1Record)ds.curlist1.get(k);
							if(Integer.parseInt(sub_1_rec.step) == 2 && sub_1_rec.up_cd.equals(sub_rec.cd)){
								int sub_1_record = rx.add(sub_record, "item", "");
									rx.add(sub_1_record, "label", StringUtil.replaceToXml(sub_1_rec.cdnm) + "(" + sub_1_rec.cd + ") ");
									rx.add(sub_1_record, "value", sub_1_rec.cd);
									rx.add(sub_1_record, "selectImage", "select.gif");
									rx.add(sub_1_record, "image", "image.gif");
									
								/*	
								for(int l = 0; l < ds.curlist1.size(); l++) {
									SP_SUP_1015_LCURLIST1Record sub_2_rec = (SP_SUP_1015_LCURLIST1Record)ds.curlist1.get(l);
									if(Integer.parseInt(sub_2_rec.step) == 3 && sub_2_rec.up_cd.equals(sub_1_rec.cd)){
										int sub_2_record = rx.add(sub_1_record, "item", "");
										rx.add(sub_2_record, "label", StringUtil.replaceToXml(sub_2_rec.cdnm) + "(" + sub_2_rec.cd + ") ");
										rx.add(sub_2_record, "value", sub_2_rec.cd);
										rx.add(sub_2_record, "selectImage", "select.gif");
										rx.add(sub_2_record, "image", "image.gif");
									}
								}
								*/
							}
						}
					
					}
				}
			}
		}

		/****** CURLIST1 END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
