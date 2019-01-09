<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_1020_MDataSet ds = (FC_ACCT_1020_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	tempData  = rx.add( root , "tempData" , "");
	recordSet = rx.add(tempData, "curList", "");
		
	for(int i = 0; i < ds.curlist.size(); i++) {
		FC_ACCT_1020_MCURLISTRecord rec = (FC_ACCT_1020_MCURLISTRecord)ds.curlist.get(i);

		int menu_level       = StringUtil.toNumber(rec.menu_levl) + recordSet;	
		int itemset1  = rx.add( menu_level - 1 , "itemset" , "");
		
		String img 		= "";	//"0".equals(StringUtil.nvl(rec.menu_seq3)) ? "/images/folderClosed.gif" : "/images/leaf.gif";
		String sel_img 	= "";
		String exp_img 	= "";	//"0".equals(StringUtil.nvl(rec.menu_seq3)) ? "/images/folderOpen.gif" : "";
		
		if("1".equals(StringUtil.nvl(rec.menu_levl))) {
			img 		= "/images/folderClosed.gif";
			sel_img 	= "";
			exp_img 	= "/images/folderOpen.gif";
			
		} else {
			if("Y".equals(StringUtil.nvl(rec.subyn))) {
				img 		= "/images/folderClosed.gif";
				sel_img 	= "";
				exp_img 	= "";

			} else {
				img 		= "/images/leaf.gif";
				sel_img 	= "";
				exp_img 	= "";
			}
		}

		
		rx.add(itemset1, "cmpy_cd", rec.cmpy_cd);
		rx.add(itemset1, "acct_cd", rec.acct_cd);
		rx.add(itemset1, "acct_nm", rec.acct_nm);
		rx.add(itemset1, "menu_levl", rec.menu_levl);
		rx.add(itemset1, "menu_seq1", rec.menu_seq1);
		rx.add(itemset1, "menu_seq2", rec.menu_seq2);
		rx.add(itemset1, "menu_seq3", rec.menu_seq3);
		rx.add(itemset1, "menu_seq4", rec.menu_seq4);

		rx.addCData(itemset1, "label", rec.acct_nm);
		rx.add(itemset1, "value", rec.acct_cd );
		rx.add(itemset1, "img", img);
		rx.add(itemset1, "sel_img", sel_img);
		rx.add(itemset1, "exp_img", exp_img);
		
	}
	rx.add(recordSet, "totalcnt", ds.curlist.size());
	
	
	//data2
	int tempData2 = 0;
	int recordSet2 = 0;
	String str_depth = "";
	tempData2 = rx.add(root, "tempData2", "");
	
	recordSet2 = rx.add(tempData2, "gridData", "");
	
	for(int i = 0; i < ds.curlist.size(); i++) {
		FC_ACCT_1020_MCURLISTRecord rec = (FC_ACCT_1020_MCURLISTRecord)ds.curlist.get(i);
		
		int record = rx.add(recordSet2, "record", "");
		int depth = Integer.parseInt(rec.menu_levl);
		
		str_depth = "▶";
		if(depth==1) {
			str_depth = " ";
		} else {
			for(int k=0; k<depth; k++) {
				str_depth += "    ";
			}
		}
				
		//rx.add(record, "menu_levl1", (rec.menu_levl.equals("1")?rec.acct_nm:""));
		rx.add(record, "title_nm", str_depth + "["+rec.acct_nm+"]" ); //(rec.menu_levl.equals("1")?rec.acct_nm:""));
		rx.add(record, "acct_cd", rec.acct_cd);
		rx.add(record, "acct_nm", "["+rec.acct_nm+"]");
	}
	

	out.println(rx.xmlFlush());
	out.println(rx.xmlEndFlush());

%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_1020_m>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<acct_cd/>
				<acct_nm/>
				<menu_levl/>
				<menu_seq1/>
				<menu_seq2/>
				<menu_seq3/>
				<menu_seq4/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_1020_m>
*/
%>

<% /* 작성시간 : Wed Jun 11 13:53:35 KST 2014 */ %>