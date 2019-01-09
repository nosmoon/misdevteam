<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.card.rec.*
	,	chosun.ciis.hd.card.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_CARD_1100_LDataSet ds = (HD_CARD_1100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "deptTree", "");
//	int iLvl_cnt = 0;
	
	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_CARD_1100_LCURLISTRecord rec = (HD_CARD_1100_LCURLISTRecord)ds.curlist.get(i);
			if(Integer.parseInt(rec.lvl) == 0){
				int record = rx.add(dataSet, "item", "");
				//rx.add(record, "label", StringUtil.replaceToXml(rec.dept_nm) + "(" + rec.dept_cd + ") ");
				rx.add(record, "label", StringUtil.replaceToXml(rec.dept_nm));
				rx.add(record, "value", rec.dept_cd);
				//rx.add(record, "selectImage", "select.gif");
				//rx.add(record, "image", "image.gif");
				
				for(int j = 0; j < ds.curlist.size(); j++) {
					HD_CARD_1100_LCURLISTRecord sub_rec = (HD_CARD_1100_LCURLISTRecord)ds.curlist.get(j);
					if(Integer.parseInt(sub_rec.lvl) == 1 && sub_rec.insd_dept_cd.substring(0,7).equals(rec.insd_dept_cd)){
						int sub_record = rx.add(record, "item", "");
						//rx.add(sub_record, "label", StringUtil.replaceToXml(sub_rec.dept_nm) + "(" + sub_rec.dept_cd + ") ");
						rx.add(sub_record, "label", StringUtil.replaceToXml(sub_rec.dept_nm));
						rx.add(sub_record, "value", sub_rec.dept_cd);
						//rx.add(sub_record, "selectImage", "select.gif");
						//rx.add(sub_record, "image", "image.gif");
						
						for(int k = 0; k < ds.curlist.size(); k++) { 
							HD_CARD_1100_LCURLISTRecord sub_1_rec = (HD_CARD_1100_LCURLISTRecord)ds.curlist.get(k);
							if(Integer.parseInt(sub_1_rec.lvl) == 2 && sub_1_rec.insd_dept_cd.substring(0,9).equals(sub_rec.insd_dept_cd)){
								int sub_1_record = rx.add(sub_record, "item", "");
									//rx.add(sub_1_record, "label", StringUtil.replaceToXml(sub_1_rec.dept_nm) + "(" + sub_1_rec.dept_cd + ") ");
									rx.add(sub_1_record, "label", StringUtil.replaceToXml(sub_1_rec.dept_nm));
									rx.add(sub_1_record, "value", sub_1_rec.dept_cd);
									//rx.add(sub_1_record, "selectImage", "select.gif");
									//rx.add(sub_1_record, "image", "image.gif");
									
									for(int l = 0; l < ds.curlist.size(); l++) {
										HD_CARD_1100_LCURLISTRecord sub_2_rec = (HD_CARD_1100_LCURLISTRecord)ds.curlist.get(l);
										if(Integer.parseInt(sub_2_rec.lvl) == 3 && sub_2_rec.insd_dept_cd.substring(0,11).equals(sub_1_rec.insd_dept_cd)){
											int sub_2_record = rx.add(sub_1_record, "item", "");
											//rx.add(sub_2_record, "label", StringUtil.replaceToXml(sub_2_rec.dept_nm) + "(" + sub_2_rec.dept_cd + ") ");
											rx.add(sub_2_record, "label", StringUtil.replaceToXml(sub_2_rec.dept_nm));
											rx.add(sub_2_record, "value", sub_2_rec.dept_cd);
											//rx.add(sub_2_record, "selectImage", "select.gif");
											//rx.add(sub_2_record, "image", "image.gif");
										}
									}
								}
							}
						}
					}
				}
				//rx.add(record, "lvl", rec.lvl);
				//rx.add(record, "dept_cd", rec.dept_cd);
				//rx.add(record, "dept_nm", rec.dept_nm);
				//rx.add(record, "lvl", StringUtil.replaceToXml(rec.lvl));
				//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
				//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
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
<hd_card_1100_l>
	<dataSet>
		<CURLIST>
			<record>
				<lvl/>
				<dept_cd/>
				<dept_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_card_1100_l>
*/
%>

<% /* 작성시간 : Mon Jun 08 13:50:24 KST 2009 */ %>