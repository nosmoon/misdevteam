<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_3101_LDataSet ds = (MT_PAPINOUT_3101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	String[][] tbBody = null;
	String[]   tbhead  = null;
	String strCap1 = "";
	String strCap2 = "";

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "roll_wgt", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_PAPINOUT_3101_LCURLIST3Record rec = (MT_PAPINOUT_3101_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "roll_wgt", rec.roll_wgt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "top_gridData", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PAPINOUT_3101_LCURLIST2Record rec = (MT_PAPINOUT_3101_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.addCData(record, "sect_nm", rec.sect_nm);
			rx.add(record, "pap_std", rec.pap_std);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "bw_pcnt", rec.bw_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "coll_yn", rec.coll_yn);
			rx.add(record, "a_wgt", rec.a_wgt);
			rx.add(record, "b_wgt", rec.b_wgt);
			rx.add(record, "c_wgt", rec.c_wgt);
			rx.add(record, "a_base", rec.a_wgt);
			rx.add(record, "b_base", rec.b_wgt);
			rx.add(record, "c_base", rec.c_wgt);
			rx.add(record, "a_roll", rec.a_roll);
			rx.add(record, "b_roll", rec.b_roll);
			rx.add(record, "c_roll", rec.c_roll);
			rx.add(record, "a_wgt_l", "0");
			rx.add(record, "b_wgt_l", "0");
			rx.add(record, "c_wgt_l", "0");
			rx.add(record, "a_base_l", "0");
			rx.add(record, "b_base_l", "0");
			rx.add(record, "c_base_l", "0");
			rx.add(record, "tot_wgt_l", "0");
			rx.add(record, "chk_a", rec.chk_a);
			rx.add(record, "chk_b", rec.chk_b);
			rx.add(record, "chk_c", rec.chk_c);
			rx.add(record, "a_rwgt", rec.a_rwgt);
			rx.add(record, "b_rwgt", rec.b_rwgt);
			rx.add(record, "c_rwgt", rec.c_rwgt);
			rx.add(record, "prt_wgt", rec.prt_wgt);
			rx.add(record, "prt_clsf", rec.prt_clsf);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "pre_gridData", "");
		for(int i = 0; i < ds.curlist5.size(); i++) {
			MT_PAPINOUT_3101_LCURLIST5Record rec = (MT_PAPINOUT_3101_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.addCData(record, "sect_nm", rec.sect_nm);
			rx.add(record, "pap_std", rec.pap_std);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "bw_pcnt", rec.bw_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "a_wgt", rec.a_wgt);
			rx.add(record, "b_wgt", rec.b_wgt);
			rx.add(record, "c_wgt", rec.c_wgt);
			rx.add(record, "chk_a", rec.chk_a);
			rx.add(record, "chk_b", rec.chk_b);
			rx.add(record, "chk_c", rec.chk_c);
			rx.add(record, "prt_wgt", rec.prt_wgt);
			rx.add(record, "prt_clsf", rec.prt_clsf);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST2 END */
		
		/****** CURLIST1 BEGIN */
		//recordSet = rx.add(dataSet, "title", "");

		//for(int i = 0; i < ds.curlist1.size(); i++) {
		//	MT_PAPINOUT_3101_LCURLIST1Record rec = (MT_PAPINOUT_3101_LCURLIST1Record)ds.curlist1.get(i);
		//int record = rx.add(recordSet, "record", "");
		//	rx.add(record, "title", rec.title);
		//}

//		for(int i = 0; i < ds.curlist4.size(); i++) {
//			MT_PAPINOUT_3101_LCURLIST4Record rec = (MT_PAPINOUT_3101_LCURLIST4Record)ds.curlist4.get(i);
//			int record = rx.add(recordSet, "record", "");
//			rx.add(record, "medi_cd", rec.medi_cd);
//			rx.add(record, "sect_cd", rec.sect_cd);
//			rx.add(record, "matr_cd", rec.matr_cd);
//			rx.add(record, "use_qunt", rec.use_qunt);
//			rx.add(record, "roll", rec.roll);
//		}
//		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		tbhead = new String[ds.curlist1.size() * 2 + 4];
		if( ds.curlist1.size() > 0 ){
			tbhead[0] = "자재코드";
			tbhead[1] = "자재명";
			tbhead[2] = "용지구분";
			tbhead[3] = "코드그룹";

			for ( int i = 0 ; i < ds.curlist1.size() ; i++){
				MT_PAPINOUT_3101_LCURLIST1Record rec = (MT_PAPINOUT_3101_LCURLIST1Record)ds.curlist1.get(i);
				tbhead[i * 2 + 4 ] = rec.title;
				tbhead[i * 2 + 5 ] = rec.title;
			}
		}

		for( int i = 0 ; i < tbhead.length ; i++){
			if( i == 0 ) {
				 strCap1 = tbhead[i];
				 strCap2 = tbhead[i];
			}
			else {
				 strCap1 = strCap1 + "^" + tbhead[i];
				 if( i < 4 ) {
					 strCap2 = strCap2 + "^" + tbhead[i];
				 }else{
					 if( ( i % 2) == 0 ){
					 	strCap2 = strCap2 + "^" + "ROLL";
					 }else{
					 	strCap2 = strCap2 + "^" + "중량";
					 }
				 }
			}
		}

        strCap1 = strCap1 + "|" + strCap2;

        recordSet = rx.add(dataSet, "caption_size", tbhead.length);
        recordSet = rx.add(dataSet, "caption", strCap1);
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */

		tbBody = new String[ds.curlist.size()][tbhead.length];
System.out.println("----------");
		for(int i = 0; i < tbBody.length ; i++){
			for ( int ii = 0 ; ii < tbBody[i].length ; ii++){
				tbBody[i][ii] = "0";
			}
		}
System.out.println("-------2---");
		if( ds.curlist.size() > 0 ) {
			for(int i = 0; i < tbBody.length ; i++){
					MT_PAPINOUT_3101_LCURLISTRecord rec = (MT_PAPINOUT_3101_LCURLISTRecord)ds.curlist.get(i);
					tbBody[i][0] = rec.matr_cd;
					tbBody[i][1] = rec.matr_nm;
					tbBody[i][2] = rec.paper_clsf_cd;
					tbBody[i][3] = rec.grp;
					System.out.println("-------배분---"+ tbBody[i][0]);
					if( tbBody[i][1].equals("배분")){
						System.out.println("-------배분---");
						for( int ii = 4 ; ii < tbBody[i].length ; ii++){
							tbBody[i][ii] = " " ;
						}

					}
			}
		}
System.out.println("-------3---");
		if ( ds.curlist4.size() > 0 ) {
			for(int i = 0; i < tbBody.length ; i++){
				String matr_cd = tbBody[i][0];

				for(int ii = 4; ii < tbhead.length ; ii++){
				     String tempData = tbhead[ii];
				     String medi_cd  = tempData.substring(1,4);
				     String sect_cd  = tempData.substring(5,9);
				     System.out.println(medi_cd);
				     System.out.println(sect_cd);

				     for(int iii = 0; iii < ds.curlist4.size(); iii++) {
				    	 MT_PAPINOUT_3101_LCURLIST4Record rec = (MT_PAPINOUT_3101_LCURLIST4Record)ds.curlist4.get(iii);
				    	 String resMedi = rec.medi_cd;
				    	 String resSect = rec.sect_cd;
				    	 String resMatr = rec.matr_cd;

				    	 if ( matr_cd.equals(resMatr) && medi_cd.equals(resMedi) && sect_cd.equals(resSect)){
				    		 tbBody[i][ii] = rec.roll;
				    		 tbBody[i][ii + 1] = rec.use_qunt;
				    	 }
				     }
				     ii = ii + 1;
				}
			}
		}
System.out.println("-------4---");
		recordSet = rx.add(dataSet, "rowData", strCap1);
		for(int i = 0 ; i < tbBody.length ; i++){
			int record = rx.add(recordSet, "record", "");

			for(int ii = 0; ii < tbBody[i].length ; ii++){
				rx.add(record, "row_" + ii , tbBody[i][ii]);
			}
		}
		recordSet = rx.add(dataSet, "SelectCnt", ds.curlist4.size());
		recordSet = rx.add(dataSet, "arvyul", ds.arvyul);
		recordSet = rx.add(dataSet, "pajiyul", ds.pajiyul);

//		for(int i = 0; i < ds.curlist4.size(); i++) {
//		MT_PAPINOUT_3101_LCURLIST4Record rec = (MT_PAPINOUT_3101_LCURLIST4Record)ds.curlist4.get(i);
//		int record = rx.add(recordSet, "record", "");
//		rx.add(record, "medi_cd", rec.medi_cd);
//		rx.add(record, "sect_cd", rec.sect_cd);
//		rx.add(record, "matr_cd", rec.matr_cd);
//		rx.add(record, "use_qunt", rec.use_qunt);
//		rx.add(record, "roll", rec.roll);
//	}
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
	<CURLIST3>
		<record>
			<cd/>
			<cdnm/>
		</record>
	</CURLIST3>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<medi_cd/>
			<sect_cd/>
			<issu_pcnt/>
			<slip_qty/>
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
			<title/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<matr_cd/>
			<matr_nm/>
			<paper_clsf_cd/>
			<grp/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Jun 10 16:44:23 KST 2009 */ %>