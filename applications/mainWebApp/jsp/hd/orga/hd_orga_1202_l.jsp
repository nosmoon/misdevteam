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
	HD_ORGA_1202_LDataSet ds = (HD_ORGA_1202_LDataSet)request.getAttribute("ds");
	
	int root = RwXml.rootNodeID;
	int formData = 0;
	int tempData = 0;
	int record = 0;
	int iLvl_cnt = 0;
	int[] levelSet = null;
	formData = rx.add(root, "deptTree", "");
	levelSet = new int[iLvl_cnt];
	int supr_levelSet	= 0;
	int supr_level		= 0;
	int iLevel = 0;
	
	try {

		int temp = ds.curlist.size();
		int temp_sub = temp + 1;

			/* 120126 김정회 주석 처리 (SP_HD_ORGA_1202_L 프로시저로 옮김)
			record = rx.add(formData, "item", "");
				rx.add(record, "dept_nm", "조선일보");
				rx.add(record, "dept_cd", "10");
				rx.add(record, "level", "1");
				rx.add(record, "insd_dept_cd", "10");
				rx.add(record, "supr_dept_cd", "10");
				rx.add(record, "sub_cnt", "");
				*/
			
			for(int i = 0; i < temp_sub; i++) {
				HD_ORGA_1202_LCURLISTRecord rec = (HD_ORGA_1202_LCURLISTRecord)ds.curlist.get(i);
				
				if(rec.lvl.equals("999")) { //회사 레벨일경우
					record = rx.add(formData, "item", "");
					rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
					rx.add(record, "dept_cd", "10");
					rx.add(record, "level", "1");
					rx.add(record, "insd_dept_cd", "10");
					rx.add(record, "supr_dept_cd", "10");
					rx.add(record, "sub_cnt", "");
				} else {
					record = rx.add(formData, "item", "");
					rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm) + "(" + rec.dept_cd + ") ");
					//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
					rx.add(record, "dept_cd", rec.dept_cd);
					rx.add(record, "level", Integer.toString(Integer.parseInt(rec.lvl) + 2));
					rx.add(record, "insd_dept_cd", rec.insd_dept_cd);
					rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
					rx.add(record, "sub_cnt", rec.sub_cnt);
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

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<lvl/>
			<supr_dept_cd/>
			<dept_cd/>
			<dept_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sun Feb 15 18:11:04 KST 2009 */ %>