<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.sendmg.rec.*
	,	chosun.ciis.pr.sendmg.ds.*;
	"
%>

<%
	boolean buf = true;	//버퍼링 할건지 말건지

	RwText rt= new RwText();

	PR_SENDMG_1000_LDataSet ds = (PR_SENDMG_1000_LDataSet)request.getAttribute("ds");
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String col_ecnt		= "";
	String col_ecnt_sub	= "";
	String col_ecnt_width	= "";
	String base_width		= "";
	
	try {
		
		arrTbl = new String[ds.curlist2.size() > 0 ? ds.curlist4.size() : 0][(ds.curlist3.size() * 5) + 7];
		
		if (ds.curlist3.size() == 0){
			base_width = "170";
		} else if (ds.curlist3.size() == 2){
			base_width = "77";
		} else if (ds.curlist3.size() == 3){
			base_width = "60";
		} else if (ds.curlist3.size() == 4){
			base_width = "50";
		}
		
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_SENDMG_1000_LCURLIST3Record rec = (PR_SENDMG_1000_LCURLIST3Record)ds.curlist3.get(i);
			col_ecnt_sub += "^전송^시쇄^종쇄^판수^마감";
			for (int ii=0; ii<5; ii++){
				col_ecnt += "^" + rec.ecnt + "판";
				col_ecnt_width += ", " + base_width;
			}
		}
//		System.out.println("002");
//		System.out.println("col_ecnt=" + col_ecnt);
//		System.out.println("col_ecnt_width=" + col_ecnt_width);
//		System.out.println("col_ecnt_sub=" + col_ecnt_sub);
		
		rt.setBuffering(buf);
		//rt.setRowCnt(ds.curlist4.size());
		//rt.setRowCnt(ds.curlist4.size());
		rt.setRowCnt(-1);
		//column 갯수  정보 셋팅 		
		rt.setColCnt((ds.curlist3.size() * 5) + 7);
		rt.setCaption("구분^공장^당직자" + col_ecnt + "^발송현황^발송현황^발송현황^발송현황|구분^공장^당직자" + col_ecnt_sub + "^첫출발노선^첫출발노선^최종노선^최종노선");
		//rt.setCaption("구분^공장^당직자" + col_ecnt + "^발송현황^발송현황^발송현황^발송현황");
		rt.setColWidth("80, " + base_width + ", " + base_width + col_ecnt_width + ", " + base_width + ", " + base_width + ", " + base_width + ", " + base_width);

		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		//column type 및 스타일 정보 추가.
		rt.addColumn("output","");
		rt.addColumn("input","visibility:hidden;");
		rt.addColumn("input","");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_SENDMG_1000_LCURLIST3Record rec = (PR_SENDMG_1000_LCURLIST3Record)ds.curlist3.get(i);
			rt.addColumn("output","format:hh\\:nn;");
			rt.addColumn("input","format:hh\\:nn;");
			rt.addColumn("input","format:hh\\:nn;");
			rt.addColumn("input","visibility:hidden;");
			rt.addColumn("input","visibility:hidden;");
		}
		
		rt.addColumn("input","");
		rt.addColumn("input","format:hh\\:nn;");
		rt.addColumn("input","");
		rt.addColumn("input","format:hh\\:nn;");
		//column type 및 스타일 정보 셋팅
		rt.setColumn();

		out.print(rt.textFlush());
//		System.out.println("003");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		for(int i = 0; i < ds.curlist4.size(); i++) {
			PR_SENDMG_1000_LCURLIST4Record rec = (PR_SENDMG_1000_LCURLIST4Record)ds.curlist4.get(i);
			if (ds.curlist2.size() > 0){
				arrTbl[i][0] = rec.cd_abrv_cdnm;
				arrTbl[i][1] = rec.cd;
			}
		}

//		System.out.println("004");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_SENDMG_1000_LCURLIST2Record rec = (PR_SENDMG_1000_LCURLIST2Record)ds.curlist2.get(i);
			
			if (i % (ds.curlist3.size()) == 0){
				rowCount++;
				colCount = 3;
			} else {
				colCount += 5;
			}
			
			arrTbl[rowCount-1][(colCount)] = rec.off_plat_tm;
			arrTbl[rowCount-1][(colCount) + 1] = rec.prt_bgn_tm;
			arrTbl[rowCount-1][(colCount) + 2] = rec.prt_end_tm;
			arrTbl[rowCount-1][(colCount) + 3] = rec.ecnt;
			arrTbl[rowCount-1][(colCount) + 4] = rec.clos_clsf;
		}

//		System.out.println("005");
		for(int i = 0; i < ds.curlist6.size(); i++) {
			PR_SENDMG_1000_LCURLIST6Record rec = (PR_SENDMG_1000_LCURLIST6Record)ds.curlist6.get(i);
			//System.out.println("arrTbl[i][1]=" + arrTbl[i][1]);
			//System.out.println("rec.fac_clsf=" + rec.fac_clsf);
			if (arrTbl[i][1].equals(rec.fac_clsf)){
				arrTbl[i][2] = rec.chrg_pers;
				arrTbl[i][((ds.curlist3.size() * 5) + 3)] = rec.fst_route;
				arrTbl[i][((ds.curlist3.size() * 5) + 4)] = rec.fst_route_tm;
				arrTbl[i][((ds.curlist3.size() * 5) + 5)] = rec.last_route;
				arrTbl[i][((ds.curlist3.size() * 5) + 6)] = rec.last_route_tm;
			}
		}
		
//		System.out.println("006");
		for(int i = 0; i < arrTbl.length; i++) {
			for(int ii = 0; ii < arrTbl[i].length; ii++) {
				if (ii < (arrTbl[i].length - 1)){
					rt.addColValue( arrTbl[i][ii] );
				} else {
					rt.addRowValue( arrTbl[i][ii] );
				}
			}
			//out.print(rt.textFlush());
		}
		
//		System.out.println("007");
	}catch(Exception e){
		out.print(rt.textFlush());
	}finally{
		out.print(rt.textFlush());
	}
%>