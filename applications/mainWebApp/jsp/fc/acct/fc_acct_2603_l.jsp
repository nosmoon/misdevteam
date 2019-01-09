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
	FC_ACCT_2603_LDataSet ds = (FC_ACCT_2603_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = 0;
	int recordSet = 0;
	//double tmp_per = 0;
	//long amt_inc = 0;


	//long valid_src_amt1 = 0;
	//long valid_src_amt2 = 0;
	//long valid_amt1 = 0;	//당기
	//long valid_amt2 = 0;	//전기

	
	//double amt_per = 0;
	//String amt_per = "0";
	String valid_result1 = "";	//당기결과
	String valid_result2 = "";	//전기결과
	String valid_logic  = "";
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	tempData = rx.add(root, "tempData", "");
	
	String acct_type_cd = request.getParameter("acct_type_cd");

	recordSet = rx.add(tempData, "curList", "");

	for(int i = 0; i < ds.curlist.size(); i++) {
		FC_ACCT_2603_LCURLISTRecord rec = (FC_ACCT_2603_LCURLISTRecord)ds.curlist.get(i);
		
		if( rec.acct_subj_nm.equals("자산") || rec.acct_subj_nm.equals("부채") || rec.acct_subj_nm.equals("자본") ) {
			int record = rx.add(recordSet, "record", "");
			
			//blank
			rx.add(record, "acct_levl", rec.acct_levl);
			rx.add(record, "acct_cd", rec.acct_cd);
			rx.addCData(record, "acct_subj_nm", rec.acct_subj_nm.replace("*", " "));
			rx.add(record, "amt0",   "");
			rx.add(record, "amt1",   "");
			rx.add(record, "amt2",   "");
			rx.add(record, "amt3",   "");
			rx.add(record, "amt4",   "");
			rx.add(record, "amt5",   "");
			rx.add(record, "amt6",   "");
			rx.add(record, "amt7",   "");
			rx.add(record, "amt8",   "");
			rx.add(record, "amt9",   "");
			rx.add(record, "amt10",  "");
			rx.add(record, "amt11",  "");
			rx.add(record, "amt12",  "");					
			rx.add(record, "totamt", "");
							
		} else {
		
			//
			//if( acct_type_cd.equals("001") && rec.acct_cd.equals("010000000") ) {
			//	//손익계산서 검증계산
			//	valid_amt1 = valid_amt1 + rec.acct_amt1;	//당기(당기순이익)
			//	valid_amt2 = valid_amt2 + rec.acct_amt2;	//전기(당기순이익)
			//	
			//} else if( acct_type_cd.equals("002") && rec.acct_cd.equals("001009000") ) {
			//	//재무상태표 검증계산(자산총계)
			//	valid_src_amt1 = valid_src_amt1 + rec.acct_amt1;	//당기(자산총계)
			//	valid_src_amt2 = valid_src_amt2 + rec.acct_amt2;	//전기(자산총계)
			//	
			//} else if( !rec.cmpy_cd.equals("326") && acct_type_cd.equals("002") && (rec.acct_cd.equals("002003000") || rec.acct_cd.equals("003005000")) ) {
			//	//재무상태표 검증계산(부채총계,자본총계)
			//	valid_amt1 = valid_amt1 + rec.acct_amt1;	//당기(부채총계,자본총계)
			//	valid_amt2 = valid_amt2 + rec.acct_amt2;	//전기(부채총계,자본총계)
			//	
			//} else if( rec.cmpy_cd.equals("326") && acct_type_cd.equals("002") && (rec.acct_cd.equals("002003000") || rec.acct_cd.equals("003006000")) ) {
			//	//재무상태표 검증계산(부채총계,자본총계)
			//	valid_amt1 = valid_amt1 + rec.acct_amt1;	//당기(부채총계,자본총계)
			//	valid_amt2 = valid_amt2 + rec.acct_amt2;	//전기(부채총계,자본총계)
			//	
			//} else if( acct_type_cd.equals("003") && rec.acct_cd.equals("006000000") ) {
			//	//제조원가명세서 검증계산
			//	valid_amt1 = valid_amt1 + rec.acct_amt1;	//당기(당기제품제조원가)
			//	valid_amt2 = valid_amt2 + rec.acct_amt2;	//전기(당기제품제조원가)
			//}
			//
			
			if( !rec.acct_cd.equals("999999999") ) {
			
				if( rec.cmpy_cd.equals("100") && rec.amt1 == "0" && rec.amt2 == "0" ) {
					//예외사항: 손익계산서(기초제품재고액,기말제품재고액)
					//         제조원가명세서(기초재공품재고액, 기말재공품재고액)
					if( (acct_type_cd.equals("001") && (rec.acct_cd.equals("002001001") || rec.acct_cd.equals("002001003")) ) ||
					    (acct_type_cd.equals("003") && (rec.acct_cd.equals("004001000") || rec.acct_cd.equals("005001000")) )
					  ) 
					{
						int record = rx.add(recordSet, "record", "");
						
						rx.add(record, "acct_levl", rec.acct_levl);
						rx.add(record, "acct_cd", rec.acct_cd);
						rx.addCData(record, "acct_subj_nm", rec.acct_subj_nm.replace("*", " "));
						rx.add(record, "amt0",   rec.amt0  );
						rx.add(record, "amt1",   rec.amt1  );
						rx.add(record, "amt2",   rec.amt2  );
						rx.add(record, "amt3",   rec.amt3  );
						rx.add(record, "amt4",   rec.amt4  );
						rx.add(record, "amt5",   rec.amt5  );
						rx.add(record, "amt6",   rec.amt6  );
						rx.add(record, "amt7",   rec.amt7  );
						rx.add(record, "amt8",   rec.amt8  );
						rx.add(record, "amt9",   rec.amt9  );
						rx.add(record, "amt10",  rec.amt10 );
						rx.add(record, "amt11",  rec.amt11 );
						rx.add(record, "amt12",  rec.amt12 );					
						rx.add(record, "totamt", rec.totamt);
					}
	
				} else {
					int record = rx.add(recordSet, "record", "");

					rx.add(record, "acct_levl", rec.acct_levl);
					rx.add(record, "acct_cd", rec.acct_cd);
					rx.addCData(record, "acct_subj_nm", rec.acct_subj_nm.replace("*", " "));
					rx.add(record, "amt0",   rec.amt0  );
					rx.add(record, "amt1",   rec.amt1  );
					rx.add(record, "amt2",   rec.amt2  );
					rx.add(record, "amt3",   rec.amt3  );
					rx.add(record, "amt4",   rec.amt4  );
					rx.add(record, "amt5",   rec.amt5  );
					rx.add(record, "amt6",   rec.amt6  );
					rx.add(record, "amt7",   rec.amt7  );
					rx.add(record, "amt8",   rec.amt8  );
					rx.add(record, "amt9",   rec.amt9  );
					rx.add(record, "amt10",  rec.amt10 );
					rx.add(record, "amt11",  rec.amt11 );
					rx.add(record, "amt12",  rec.amt12 );					
					rx.add(record, "totamt", rec.totamt);
					
				}
			} else {
				//재무상태표가 아닌 경우 만.
				//if( !acct_type_cd.equals("002") ) {
				//	valid_src_amt1 = rec.acct_amt1;
				//	valid_src_amt2 = rec.acct_amt2;
				//}
			}
			
		}
	}


	if(acct_type_cd.equals("001")) {
		//손익계산서
		valid_logic = "시 산-[ 손 익 계 정 ] = 당 기 순 이 익";
	} else if(acct_type_cd.equals("002")) {
		//재무상태표
		valid_logic = "자 산 총 계  = (부 채 총 계 + 자 본 총 계)";
	} else if(acct_type_cd.equals("003")) {
		//제조원가명세서
		valid_logic = "시 산-당 기 제 품  제 조 원 가 = 당 기 제 품  제 조 원 가";
	}
	
	//System.out.println("당기: " + valid_src_amt1 + " : " + valid_amt1);
	//System.out.println("전기: " + valid_src_amt2 + " : " + valid_amt2);

	//if(acct_type_cd.equals("004") || acct_type_cd.equals("005") || acct_type_cd.equals("006")) {
	//	rx.add(tempData, "valid_result1", "-");
	//	rx.add(tempData, "valid_result2", "-");
	//	rx.add(tempData, "valid_logic",   "-");
	//} else {
	//	rx.add(tempData, "valid_result1", (valid_src_amt1 == valid_amt1) ? "OK" : "Error");
	//	rx.add(tempData, "valid_result2", (valid_src_amt2 == valid_amt2) ? "OK" : "Error");
	//	rx.add(tempData, "valid_logic", valid_logic);
	//}

	
	rx.add(tempData, "errcode", errcode);
	rx.add(tempData, "errmsg", errmsg);
	
	out.println(rx.xmlFlush());
	out.println(rx.xmlEndFlush());
%>

<% /* 작성시간 : Fri Jul 04 11:43:37 KST 2014 */ %>
