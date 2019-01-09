<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.close.rec.*
	,	chosun.ciis.mt.close.ds.*;
	"
%>

<%
	boolean buf = true; //버퍼링 할건지 말건지
	RwText rt= new RwText();
	MT_CLOSE_8004_LDataSet ds = (MT_CLOSE_8004_LDataSet)request.getAttribute("ds");
	
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String str_cap_1    = "공장^ 예산코드^ 예산명^ 소모금액합계^ 소모량합계";
	String str_cap_2    = "공장^ 예산코드^ 예산명^ 소모금액합계^ 소모량합계";
	String str_cap_3    = "공장^ 예산코드^ 예산명^ 소모금액합계^ 소모량합계";
	String str_width    = "70,70,120,100,100";
	
	try {
	        if(ds.curlist2.size() > 0){
	            arrTbl = new String[ds.curlist2.size()][ds.curlist1.size() + 5];
	            System.out.println("y축=" + arrTbl.length + "x축=" + arrTbl[0].length);
	            
	            
	            for(int i = 0; i < ds.curlist1.size(); i++) {
	                MT_CLOSE_8004_LCURLIST1Record rec = (MT_CLOSE_8004_LCURLIST1Record)ds.curlist1.get(i);
	                str_width += ", 100";
	                str_cap_1 += "^" + rec.medi_nm;
	                str_cap_2 += "^" + rec.sect_nm + " ";
	                str_cap_3 += "^" + rec.sonm + " ";
	            }
	            
	            for(int i = 0; i < ds.curlist2.size(); i++) {
	                MT_CLOSE_8004_LCURLIST2Record rec = (MT_CLOSE_8004_LCURLIST2Record)ds.curlist2.get(i);
	                arrTbl[i][0] = rec.fac_clsf + "  " + rec.fac_clsf_nm;
	                arrTbl[i][1] = rec.owh_budg_cd;
	                arrTbl[i][2] = rec.budg_nm;
	                arrTbl[i][3] = rec.be_amt;
	                arrTbl[i][4] = rec.be_qunt;	                
	                arrTbl[i][5] = rec.qunt1;
	                arrTbl[i][6] = rec.amt1;	                
	                arrTbl[i][7] = rec.qunt2;
	                arrTbl[i][8] = rec.amt2;	                
	                arrTbl[i][9] = rec.qunt3;
	                arrTbl[i][10] = rec.amt3;	                
	                arrTbl[i][11] = rec.qunt4;
	                arrTbl[i][12] = rec.amt4;    
	                arrTbl[i][13] = rec.qunt5;
	                arrTbl[i][14] = rec.amt5;	                
	                arrTbl[i][15] = rec.qunt6;
	                arrTbl[i][16] = rec.amt6;	                
	                arrTbl[i][17] = rec.qunt7;
	                arrTbl[i][18] = rec.amt7;	                
	                arrTbl[i][19] = rec.qunt8;
	                arrTbl[i][20] = rec.amt8;	                
	                arrTbl[i][21] = rec.qunt9;
	                arrTbl[i][22] = rec.amt9;	                
	                arrTbl[i][23] = rec.qunt10;
	                arrTbl[i][24] = rec.amt10;	                
	                arrTbl[i][25] = rec.qunt11;
	                arrTbl[i][26] = rec.amt11;	                
	                arrTbl[i][27] = rec.qunt12;
	                arrTbl[i][28] = rec.amt12;	                
	                arrTbl[i][29] = rec.qunt13;
	                arrTbl[i][30] = rec.amt13;	                
	                arrTbl[i][31] = rec.qunt14;
	                arrTbl[i][32] = rec.amt14;	                
	                arrTbl[i][33] = rec.qunt15;
	                arrTbl[i][34] = rec.amt15;	                
	                arrTbl[i][35] = rec.qunt16;
	                arrTbl[i][36] = rec.amt16;	                
	                arrTbl[i][37] = rec.qunt17;
	                arrTbl[i][38] = rec.amt17;	                
	                arrTbl[i][39] = rec.qunt18;
	                arrTbl[i][40] = rec.amt18;	                
	                arrTbl[i][41] = rec.qunt19;
	                arrTbl[i][42] = rec.amt19;	                
	                arrTbl[i][43] = rec.qunt20;
	                arrTbl[i][44] = rec.amt20;	                
	                arrTbl[i][45] = rec.qunt21;
                    arrTbl[i][46] = rec.amt21;                    
                    arrTbl[i][47] = rec.qunt22;
                    arrTbl[i][48] = rec.amt22;                    
                    arrTbl[i][49] = rec.qunt23;
                    arrTbl[i][50] = rec.amt23;                    
                    arrTbl[i][51] = rec.qunt24;
                    arrTbl[i][52] = rec.amt24;                    
                    arrTbl[i][53] = rec.qunt25;
                    arrTbl[i][54] = rec.amt25;                    
                    arrTbl[i][55] = rec.qunt26;
                    arrTbl[i][56] = rec.amt26;                    
                    arrTbl[i][57] = rec.qunt27;
                    arrTbl[i][58] = rec.amt27;                    
                    arrTbl[i][59] = rec.qunt28;
                    arrTbl[i][60] = rec.amt28;                    
                    arrTbl[i][61] = rec.qunt29;
                    arrTbl[i][62] = rec.amt29;                    
                    arrTbl[i][63] = rec.qunt30;
                    arrTbl[i][64] = rec.amt30;                    
                    arrTbl[i][65] = rec.qunt31;
                    arrTbl[i][66] = rec.amt31;                    
                    arrTbl[i][67] = rec.qunt32;
                    arrTbl[i][68] = rec.amt32;                    
                    arrTbl[i][69] = rec.qunt33;
                    arrTbl[i][70] = rec.amt33;                    
                    arrTbl[i][71] = rec.qunt34;
                    arrTbl[i][72] = rec.amt34;                    
                    arrTbl[i][73] = rec.qunt35;
                    arrTbl[i][74] = rec.amt35;                    
                    arrTbl[i][75] = rec.qunt36;
                    arrTbl[i][76] = rec.amt36;                    
                    arrTbl[i][77] = rec.qunt37;
                    arrTbl[i][78] = rec.amt37;                    
                    arrTbl[i][79] = rec.qunt38;
                    arrTbl[i][80] = rec.amt38;                    
                    arrTbl[i][81] = rec.qunt39;
                    arrTbl[i][82] = rec.amt39;                    
                    arrTbl[i][83] = rec.qunt40;
                    arrTbl[i][84] = rec.amt40;                    
                    arrTbl[i][85] = rec.qunt41;
                    arrTbl[i][86] = rec.amt41;                    
                    arrTbl[i][87] = rec.qunt42;
                    arrTbl[i][88] = rec.amt42;                    
                    arrTbl[i][89] = rec.qunt43;
                    arrTbl[i][90] = rec.amt43;                    
                    arrTbl[i][91] = rec.qunt44;
                    arrTbl[i][92] = rec.amt44;                    
                    arrTbl[i][93] = rec.qunt45;
                    arrTbl[i][94] = rec.amt45;                    
                    arrTbl[i][95] = rec.qunt46;
                    arrTbl[i][96] = rec.amt46;                    
                    arrTbl[i][97] = rec.qunt47;
                    arrTbl[i][98] = rec.amt47;                    
                    arrTbl[i][99] = rec.qunt48;
                    arrTbl[i][100] = rec.amt48;                    
                    arrTbl[i][101] = rec.qunt49;
                    arrTbl[i][102] = rec.amt49;                    
                    arrTbl[i][103] = rec.qunt50;
                    arrTbl[i][104] = rec.amt50;                    
                    arrTbl[i][105] = rec.qunt51;
                    arrTbl[i][106] = rec.amt51;                    
                    arrTbl[i][107] = rec.qunt52;
                    arrTbl[i][108] = rec.amt52;                    
                    arrTbl[i][109] = rec.qunt53;
                    arrTbl[i][110] = rec.amt53;                    
                    arrTbl[i][111] = rec.qunt54;
                    arrTbl[i][112] = rec.amt54;                    
                    arrTbl[i][113] = rec.qunt55;
                    arrTbl[i][114] = rec.amt55;                    
                    arrTbl[i][115] = rec.qunt56;
                    arrTbl[i][116] = rec.amt56;                    
                    arrTbl[i][117] = rec.qunt57;
                    arrTbl[i][118] = rec.amt57;                    
                    arrTbl[i][119] = rec.qunt58;
                    arrTbl[i][120] = rec.amt58;                    
                    arrTbl[i][121] = rec.qunt59;
                    arrTbl[i][122] = rec.amt59;                    
                    arrTbl[i][123] = rec.qunt60;
                    arrTbl[i][124] = rec.amt60;                    
                    arrTbl[i][125] = rec.qunt61;
                    arrTbl[i][126] = rec.amt61;                    
                    arrTbl[i][127] = rec.qunt62;
                    arrTbl[i][128] = rec.amt62;                    
                    arrTbl[i][129] = rec.qunt63;
                    arrTbl[i][130] = rec.amt63;                    
                    arrTbl[i][131] = rec.qunt64;
                    arrTbl[i][132] = rec.amt64;                    
                    arrTbl[i][133] = rec.qunt65;
                    arrTbl[i][134] = rec.amt65;                    
                    arrTbl[i][135] = rec.qunt66;
                    arrTbl[i][136] = rec.amt66;                    
                    arrTbl[i][137] = rec.qunt67;
                    arrTbl[i][138] = rec.amt67;                    
                    arrTbl[i][139] = rec.qunt68;
                    arrTbl[i][140] = rec.amt68;                    
                    arrTbl[i][141] = rec.qunt69;
                    arrTbl[i][142] = rec.amt69;                    
                    arrTbl[i][143] = rec.qunt70;
                    arrTbl[i][144] = rec.amt70;                    
                    arrTbl[i][145] = rec.qunt71;
                    arrTbl[i][146] = rec.amt71;                    
                    arrTbl[i][147] = rec.qunt72;
                    arrTbl[i][148] = rec.amt72;                    
                    arrTbl[i][149] = rec.qunt73;
                    arrTbl[i][150] = rec.amt73;                    
                    arrTbl[i][151] = rec.qunt74;
                    arrTbl[i][152] = rec.amt74;                    
                    arrTbl[i][153] = rec.qunt75;
                    arrTbl[i][154] = rec.amt75;                    
                    arrTbl[i][155] = rec.qunt76;
                    arrTbl[i][156] = rec.amt76;                    
                    arrTbl[i][157] = rec.qunt77;
                    arrTbl[i][158] = rec.amt77;                    
                    arrTbl[i][159] = rec.qunt78;
                    arrTbl[i][160] = rec.amt78;                    
                    arrTbl[i][161] = rec.qunt79;
                    arrTbl[i][162] = rec.amt79;                    
                    arrTbl[i][163] = rec.qunt80;
                    arrTbl[i][164] = rec.amt80;                    
                    arrTbl[i][165] = rec.qunt81;
                    arrTbl[i][166] = rec.amt81;                    
                    arrTbl[i][167] = rec.qunt82;
                    arrTbl[i][168] = rec.amt82;                    
                    arrTbl[i][169] = rec.qunt83;
                    arrTbl[i][170] = rec.amt83;                    
                    arrTbl[i][171] = rec.qunt84;
                    arrTbl[i][172] = rec.amt84;
                    arrTbl[i][173] = rec.qunt85;
                    arrTbl[i][174] = rec.amt85;                    
                    arrTbl[i][175] = rec.qunt86;
                    arrTbl[i][176] = rec.amt86;                    
                    arrTbl[i][177] = rec.qunt87;
                    arrTbl[i][178] = rec.amt87;                    
                    arrTbl[i][179] = rec.qunt88;
                    arrTbl[i][180] = rec.amt88;                    
                    arrTbl[i][181] = rec.qunt89;
                    arrTbl[i][182] = rec.amt89;                    
                    arrTbl[i][183] = rec.qunt90;
                    arrTbl[i][184] = rec.amt90;                    
                    arrTbl[i][185] = rec.qunt91;
                    arrTbl[i][186] = rec.amt91;                    
                    arrTbl[i][187] = rec.qunt92;
                    arrTbl[i][188] = rec.amt92;                    
                    arrTbl[i][189] = rec.qunt93;
                    arrTbl[i][190] = rec.amt93;                    
                    arrTbl[i][191] = rec.qunt94;
                    arrTbl[i][192] = rec.amt94;                    
                    arrTbl[i][193] = rec.qunt95;
                    arrTbl[i][194] = rec.amt95;                    
                    arrTbl[i][195] = rec.qunt96;
                    arrTbl[i][196] = rec.amt96;                    
                    arrTbl[i][197] = rec.qunt97;
                    arrTbl[i][198] = rec.amt97;                    
                    arrTbl[i][199] = rec.qunt98;
                    arrTbl[i][200] = rec.amt98;                    
                    arrTbl[i][201] = rec.qunt99;
                    arrTbl[i][202] = rec.amt99;                    
                    arrTbl[i][203] = rec.qunt100;
                    arrTbl[i][204] = rec.amt100;
	            }
	            
	            rt.setBuffering(buf);
	            rt.setRowCnt(ds.curlist2.size());  
	            rt.setColCnt(ds.curlist1.size() + 5);
	            rt.setCaption(str_cap_1 + "|" + str_cap_2 + "|" + str_cap_3);
	            rt.setColWidth(str_width);
	            rt.addColumn("output","");
	            rt.addColumn("output","");
	            rt.addColumn("output","");
	            rt.addColumn("output","format:#,###;ta:right;");
	            rt.addColumn("output","format:#,##0.################;ta:right;");
	            for(int i = 1; i <= ds.curlist1.size(); i++) {
	                if(i%2 == 0){
	                    rt.addColumn("output","format:#,###;ta:right;");
	                }else{
	                    rt.addColumn("output","format:#,##0.################;ta:right;");   
	                }
	            }
	            rt.setColumn();
	                
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
	        }else{
	            rt.setBuffering(buf);
	            rt.setRowCnt(-1);  
	            rt.setColCnt(5);
	            rt.setCaption(str_cap_1 + "|" + str_cap_2 + "|" + str_cap_3);
	            rt.setColWidth(str_width);
	            rt.addColumn("output","");
	            rt.addColumn("output","");
	            rt.addColumn("output","");
	            rt.addColumn("output","format:#,###;ta:right;");
	            rt.addColumn("output","format:#,##0.################;ta:right;");
	            rt.setColumn();
	        }
	
	}catch(Exception e){
	    out.print(rt.textFlush());
	}finally{
	    out.print(rt.textFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_close_8004_l>
	<dataSet>
		<CURLIST2>
			<record>
				<fac_clsf/>
				<owh_budg_cd/>
				<budg_nm/>
				<matr_cd/>
				<matr_nm/>
				<be_qunt/>
				<be_amt/>
				<qunt1/>
				<amt1/>
				<qunt2/>
				<amt2/>
				<qunt3/>
				<amt3/>
				<qunt4/>
				<amt4/>
				<qunt5/>
				<amt5/>
				<qunt6/>
				<amt6/>
				<qunt7/>
				<amt7/>
				<qunt8/>
				<amt8/>
				<qunt9/>
				<amt9/>
				<qunt10/>
				<amt10/>
				<qunt11/>
				<amt11/>
				<qunt12/>
				<amt12/>
				<qunt13/>
				<amt13/>
				<qunt14/>
				<amt14/>
				<qunt15/>
				<amt15/>
				<qunt16/>
				<amt16/>
				<qunt17/>
				<amt17/>
				<qunt18/>
				<amt18/>
				<qunt19/>
				<amt19/>
				<qunt20/>
				<amt20/>
				<qunt21/>
				<amt21/>
				<qunt22/>
				<amt22/>
				<qunt23/>
				<amt23/>
				<qunt24/>
				<amt24/>
				<qunt25/>
				<amt25/>
				<qunt26/>
				<amt26/>
				<qunt27/>
				<amt27/>
				<qunt28/>
				<amt28/>
				<qunt29/>
				<amt29/>
				<qunt30/>
				<amt30/>
				<qunt31/>
				<amt31/>
				<qunt32/>
				<amt32/>
				<qunt33/>
				<amt33/>
				<qunt34/>
				<amt34/>
				<qunt35/>
				<amt35/>
				<qunt36/>
				<amt36/>
				<qunt37/>
				<amt37/>
				<qunt38/>
				<amt38/>
				<qunt39/>
				<amt39/>
				<qunt40/>
				<amt40/>
				<qunt41/>
				<amt41/>
				<qunt42/>
				<amt42/>
				<qunt43/>
				<amt43/>
				<qunt44/>
				<amt44/>
				<qunt45/>
				<amt45/>
				<qunt46/>
				<amt46/>
				<qunt47/>
				<amt47/>
				<qunt48/>
				<amt48/>
				<qunt49/>
				<amt49/>
				<qunt50/>
				<amt50/>
			</record>
		</CURLIST2>
	</dataSet>
</mt_close_8004_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_close_8004_l>
	<dataSet>
		<CURLIST1>
			<record>
				<irow/>
				<medi_cd/>
				<sect_cd/>
				<medi_nm/>
				<sect_nm/>
				<so_irow/>
				<sonm/>
				<irow2/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_close_8004_l>
*/
%>

<% /* 작성시간 : Wed Aug 19 14:04:41 KST 2009 */ %>