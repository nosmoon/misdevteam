<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%@ page import = "java.util.*" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_cns_1240_l.jsp
* 기능 : 상담원-불편통계 목록
* 작성일자 : 2004-07-21
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-03-19
* 백업파일명 : ss_share_1240_l.jsp.bak
---------------------------------------------------------------------------------------------------%>

<%
	String jobcd = request.getParameter("jobcd");	// 일간,주간,월간 구분코드
	String srchdt = request.getParameter("srchdt");	// 검색일자
	SS_L_DSCTSTAT_TMDataSet ds = (SS_L_DSCTSTAT_TMDataSet)request.getAttribute("ds");

	int total = 0;
	int pers = 0;
	
	int sum1 = 0;
	int sum2 = 0;
	int sum3 = 0;
	int sum4 = 0;
	int sum5 = 0;
	int sum6 = 0;
	int sum7 = 0;
	
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
    rxw.add(resTemp, "high1", Util.convertS(Util.addDate(srchdt, Calendar.DATE,-6)));
    rxw.add(resTemp, "high2", Util.convertS(Util.addDate(srchdt, Calendar.DATE,-5)));
    rxw.add(resTemp, "high3", Util.convertS(Util.addDate(srchdt, Calendar.DATE,-4)));
    rxw.add(resTemp, "high4", Util.convertS(Util.addDate(srchdt, Calendar.DATE,-3)));
    rxw.add(resTemp, "high5", Util.convertS(Util.addDate(srchdt, Calendar.DATE,-2)));
    rxw.add(resTemp, "high6", Util.convertS(Util.addDate(srchdt, Calendar.DATE,-1)));
    rxw.add(resTemp, "high7", Util.convertS(srchdt));
    
    rxw.add(resTemp, "down1", Util.convertS(Util.addDate(srchdt, Calendar.DATE,-6)));
    rxw.add(resTemp, "down2", Util.convertS(Util.addDate(srchdt, Calendar.DATE,-5)));
    rxw.add(resTemp, "down3", Util.convertS(Util.addDate(srchdt, Calendar.DATE,-4)));
    rxw.add(resTemp, "down4", Util.convertS(Util.addDate(srchdt, Calendar.DATE,-3)));
    rxw.add(resTemp, "down5", Util.convertS(Util.addDate(srchdt, Calendar.DATE,-2)));
    rxw.add(resTemp, "down6", Util.convertS(Util.addDate(srchdt, Calendar.DATE,-1)));
    rxw.add(resTemp, "down7", Util.convertS(srchdt));
    
    rxw.add(resTemp, "total", total);    

	if("D".equals(jobcd)){
		rxw.makeHugeStart(resTemp, "listGrid", ds.dsctlist.size());
		for(int i=0; i<ds.dsctlist.size(); i++){
			SS_L_DSCTSTAT_TMDSCTLISTRecord dsctlistRec = (SS_L_DSCTSTAT_TMDSCTLISTRecord)ds.dsctlist.get(i);
			if("2".equals(dsctlistRec.gubun)){
				total += dsctlistRec.col1;
			}
		}
		for(int i=0; i<ds.dsctlist.size(); i++){
			SS_L_DSCTSTAT_TMDSCTLISTRecord dsctlistRec = (SS_L_DSCTSTAT_TMDSCTLISTRecord)ds.dsctlist.get(i);
			if(i == 0){
	        	rxw.add_ColVal("dscttypenm_f");
				rxw.add_RowVal("total_f");
			}
			if("2".equals(dsctlistRec.gubun)){
			
				if(total == 0){
					pers = 0;
				}else{
					pers = (int)(Util.round( ((double)dsctlistRec.col1) / ((double)total), 2)*100);
				}
				rxw.add_ColVal(dsctlistRec.dscttypenm);
				rxw.add_RowVal(dsctlistRec.col1 + "(" + pers + "%"+")");
			}
		}
		rxw.add_ColVal("합계");
		rxw.add_RowVal(total);
		rxw.makeHugeEnd();
		
		total = 0;
		rxw.makeHugeStart(resTemp, "listBigGrid", ds.dsctlist.size());
		for(int i=0; i<ds.dsctlist.size(); i++){
			SS_L_DSCTSTAT_TMDSCTLISTRecord dsctlistRec = (SS_L_DSCTSTAT_TMDSCTLISTRecord)ds.dsctlist.get(i);
			if("1".equals(dsctlistRec.gubun)){
				total += dsctlistRec.col1;
			}
		}
		
		for(int i=0; i<ds.dsctlist.size(); i++){
			SS_L_DSCTSTAT_TMDSCTLISTRecord dsctlistRec = (SS_L_DSCTSTAT_TMDSCTLISTRecord)ds.dsctlist.get(i);
			if(i == 0){
	        	rxw.add_ColVal("dscttypenm_ff");
				rxw.add_RowVal("total_ff");
			}
			if("1".equals(dsctlistRec.gubun)){
			
				if(total == 0){
					pers = 0;
				}else{
					pers = (int)(Util.round( ((double)dsctlistRec.col1) / ((double)total), 2)*100);
				}
				rxw.add_ColVal(dsctlistRec.dscttypenm);
				rxw.add_RowVal(dsctlistRec.col1+ "(" + pers + "%"+")");
			}
		}
		rxw.add_ColVal("합계");
		rxw.add_RowVal(total);		
		rxw.makeHugeEnd();
		
	}else if("W".equals(jobcd)){
		rxw.makeHugeStart(resTemp, "listGrid2", ds.dsctlist.size());
		for(int i=0; i<ds.dsctlist.size(); i++){
			SS_L_DSCTSTAT_TMDSCTLISTRecord dsctlistRec = (SS_L_DSCTSTAT_TMDSCTLISTRecord)ds.dsctlist.get(i);
			if(i == 0){
	        	rxw.add_ColVal("colOne");
	        	rxw.add_ColVal("colTwo");
	        	rxw.add_ColVal("colThree");
	        	rxw.add_ColVal("colFour");
	        	rxw.add_ColVal("colFive");
	        	rxw.add_ColVal("colSix");
	        	rxw.add_ColVal("colSeven");
	        	rxw.add_ColVal("colEight");
	        	rxw.add_RowVal("colNine");
			}
			if("2".equals(dsctlistRec.gubun)){
				rxw.add_ColVal(dsctlistRec.dscttypenm);
				rxw.add_ColVal(dsctlistRec.col1);
				rxw.add_ColVal(dsctlistRec.col2);
				rxw.add_ColVal(dsctlistRec.col3);
				rxw.add_ColVal(dsctlistRec.col4);
				rxw.add_ColVal(dsctlistRec.col5);
				rxw.add_ColVal(dsctlistRec.col6);
				rxw.add_ColVal(dsctlistRec.col7);
				rxw.add_RowVal(dsctlistRec.col8);
			}
		}
		rxw.makeHugeEnd();
		rxw.makeHugeStart(resTemp, "listBigGrid2", ds.dsctlist.size());
		for(int i=0; i<ds.dsctlist.size(); i++){
			SS_L_DSCTSTAT_TMDSCTLISTRecord dsctlistRec = (SS_L_DSCTSTAT_TMDSCTLISTRecord)ds.dsctlist.get(i);
			if(i == 0){
				rxw.add_ColVal("colDownOne");
	        	rxw.add_ColVal("colDownTwo");
	        	rxw.add_ColVal("colDownThree");
	        	rxw.add_ColVal("colDownFour");
	        	rxw.add_ColVal("colDownFive");
	        	rxw.add_ColVal("colDownSix");
	        	rxw.add_ColVal("colDownSeven");
	        	rxw.add_ColVal("colDownEight");
	        	rxw.add_RowVal("colDownNine");
			}
			if("1".equals(dsctlistRec.gubun)){
				rxw.add_ColVal(dsctlistRec.dscttypenm);
				rxw.add_ColVal(dsctlistRec.col1);
				rxw.add_ColVal(dsctlistRec.col2);
				rxw.add_ColVal(dsctlistRec.col3);
				rxw.add_ColVal(dsctlistRec.col4);
				rxw.add_ColVal(dsctlistRec.col5);
				rxw.add_ColVal(dsctlistRec.col6);
				rxw.add_ColVal(dsctlistRec.col7);
				rxw.add_RowVal(dsctlistRec.col8);
			}
		}
		rxw.makeHugeEnd();
	}else if("M".equals(jobcd)){
		rxw.makeHugeStart(resTemp, "listGrid3", ds.dsctlist.size());		
		for(int i=0; i<ds.dsctlist.size(); i++){
			SS_L_DSCTSTAT_TMDSCTLISTRecord dsctlistRec = (SS_L_DSCTSTAT_TMDSCTLISTRecord)ds.dsctlist.get(i);
			if(i == 0){
	        	rxw.add_ColVal("monthOne");
	        	rxw.add_ColVal("monthTwo");
	        	rxw.add_ColVal("monthThree");
	        	rxw.add_ColVal("monthFour");
	        	rxw.add_ColVal("monthFive");
	        	rxw.add_ColVal("monthSix");
	        	rxw.add_ColVal("monthSeven");
	        	rxw.add_RowVal("monthEight");
			}
			if("2".equals(dsctlistRec.gubun)){
				rxw.add_ColVal(dsctlistRec.dscttypenm);
				rxw.add_ColVal(dsctlistRec.col1);
				rxw.add_ColVal(dsctlistRec.col2);
				rxw.add_ColVal(dsctlistRec.col3);
				rxw.add_ColVal(dsctlistRec.col4);
				rxw.add_ColVal(dsctlistRec.col5);
				rxw.add_ColVal(dsctlistRec.col6);
				rxw.add_RowVal(dsctlistRec.col7);
			}
		}
		rxw.makeHugeEnd();
		rxw.makeHugeStart(resTemp, "listBigGrid3", ds.dsctlist.size());
		for(int i=0; i<ds.dsctlist.size(); i++){
			SS_L_DSCTSTAT_TMDSCTLISTRecord dsctlistRec = (SS_L_DSCTSTAT_TMDSCTLISTRecord)ds.dsctlist.get(i);
			if(i == 0){
				rxw.add_ColVal("monthDownOne");
	        	rxw.add_ColVal("monthDownTwo");
	        	rxw.add_ColVal("monthDownThree");
	        	rxw.add_ColVal("monthDownFour");
	        	rxw.add_ColVal("monthDownFive");
	        	rxw.add_ColVal("monthDownSix");
	        	rxw.add_ColVal("monthDownSeven");
	        	rxw.add_RowVal("monthDownEight");
			}
			if("1".equals(dsctlistRec.gubun)){
				rxw.add_ColVal(dsctlistRec.dscttypenm);
				rxw.add_ColVal(dsctlistRec.col1);
				rxw.add_ColVal(dsctlistRec.col2);
				rxw.add_ColVal(dsctlistRec.col3);
				rxw.add_ColVal(dsctlistRec.col4);
				rxw.add_ColVal(dsctlistRec.col5);
				rxw.add_ColVal(dsctlistRec.col6);
				rxw.add_RowVal(dsctlistRec.col7);
			}
		}
		rxw.makeHugeEnd();
	}
	rxw.flush(out);
%>