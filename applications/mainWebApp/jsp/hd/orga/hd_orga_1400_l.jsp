<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.orga.rec.*
	,	chosun.ciis.hd.orga.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_ORGA_1400_LDataSet ds = (HD_ORGA_1400_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int iLvl_cnt = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "deptTree", "");

	try {
		/****** CURLIST BEGIN*/
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_ORGA_1400_LCURLISTRecord rec = (HD_ORGA_1400_LCURLISTRecord)ds.curlist.get(i);
			if(Integer.parseInt(rec.lvl) == 0){
				int record = rx.add(dataSet, "item", "");
				rx.add(record, "label", StringUtil.replaceToXml(rec.dept_nm) + "(" + rec.dept_cd + ") ");
				rx.add(record, "value", rec.dept_cd);
				rx.add(record, "selectImage", "select.gif");
				rx.add(record, "image", "image.gif");
				
				for(int j = 0; j < ds.curlist.size(); j++) {
					HD_ORGA_1400_LCURLISTRecord sub_rec = (HD_ORGA_1400_LCURLISTRecord)ds.curlist.get(j);
					if(Integer.parseInt(sub_rec.lvl) == 1 && sub_rec.insd_dept_cd.substring(0,4).equals(rec.insd_dept_cd)){
						int sub_record = rx.add(record, "item", "");
						rx.add(sub_record, "label", StringUtil.replaceToXml(sub_rec.dept_nm) + "(" + sub_rec.dept_cd + ") ");
						rx.add(sub_record, "value", sub_rec.dept_cd);
						rx.add(sub_record, "selectImage", "select.gif");
						rx.add(sub_record, "image", "image.gif");
						
						for(int k = 0; k < ds.curlist.size(); k++) {
							HD_ORGA_1400_LCURLISTRecord sub_1_rec = (HD_ORGA_1400_LCURLISTRecord)ds.curlist.get(k);
							if(Integer.parseInt(sub_1_rec.lvl) == 2 && sub_1_rec.insd_dept_cd.substring(0,6).equals(sub_rec.insd_dept_cd)){
								int sub_1_record = rx.add(sub_record, "item", "");
									rx.add(sub_1_record, "label", StringUtil.replaceToXml(sub_1_rec.dept_nm) + "(" + sub_1_rec.dept_cd + ") ");
									rx.add(sub_1_record, "value", sub_1_rec.dept_cd);
									rx.add(sub_1_record, "selectImage", "select.gif");
									rx.add(sub_1_record, "image", "image.gif");
									
								for(int l = 0; l < ds.curlist.size(); l++) {
									HD_ORGA_1400_LCURLISTRecord sub_2_rec = (HD_ORGA_1400_LCURLISTRecord)ds.curlist.get(l);
									if(Integer.parseInt(sub_2_rec.lvl) == 3 && sub_2_rec.insd_dept_cd.substring(0,8).equals(sub_1_rec.insd_dept_cd)){
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
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<lvl/>
			<dept_nm/>
			<part_dn_nm/>
			<abrv_nm/>
			<supr_dept_cd/>
			<dept_cd/>
			<now_use_yn/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 13 14:40:46 KST 2009 */ %>