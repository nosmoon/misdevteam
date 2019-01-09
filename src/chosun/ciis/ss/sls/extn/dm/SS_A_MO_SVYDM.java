/***************************************************************************************************
* 파일명 : SS_L_MO_SVYDM.java
* 기능 :  문자점검독자관리 설문목록을 보여준다.
* 작성일자 : 2015.11.11
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 *
 */


public class SS_A_MO_SVYDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String svyid;
	public String svynm;
	public String sttdt;
	public String enddt;
	public String qstsnum;
	public String url;
	public String s_stat;
	public String giftfg;
	public String memo;
	public String camptype;
	public String basicdt;
	public String qstid1;
	public String qstid2;
	public String qstid3;
	public String qstid4;
	public String qstid5;
	public String qstid6;
	public String qstid7;
	public String qstid8;
	public String qstid9;
	public String qstid10;
	public String cont1;
	public String cont2;
	public String cont3;
	public String cont4;
	public String cont5;
	public String cont6;
	public String cont7;
	public String cont8;
	public String cont9;
	public String cont10;
	public String qtstype1;
	public String qtstype2;
	public String qtstype3;
	public String qtstype4;
	public String qtstype5;
	public String qtstype6;
	public String qtstype7;
	public String qtstype8;
	public String qtstype9;
	public String qtstype10;
	public String ans1_1;
	public String ans1_2;
	public String ans1_3;
	public String ans1_4;
	public String ans1_5;
	public String ans1_6;
	public String ans1_7;
	public String ans2_1;
	public String ans2_2;
	public String ans2_3;
	public String ans2_4;
	public String ans2_5;
	public String ans2_6;
	public String ans2_7;
	public String ans3_1;
	public String ans3_2;
	public String ans3_3;
	public String ans3_4;
	public String ans3_5;
	public String ans3_6;
	public String ans3_7;
	public String ans4_1;
	public String ans4_2;
	public String ans4_3;
	public String ans4_4;
	public String ans4_5;
	public String ans4_6;
	public String ans4_7;
	public String ans5_1;
	public String ans5_2;
	public String ans5_3;
	public String ans5_4;
	public String ans5_5;
	public String ans5_6;
	public String ans5_7;
	public String ans6_1;
	public String ans6_2;
	public String ans6_3;
	public String ans6_4;
	public String ans6_5;
	public String ans6_6;
	public String ans6_7;
	public String ans7_1;
	public String ans7_2;
	public String ans7_3;
	public String ans7_4;
	public String ans7_5;
	public String ans7_6;
	public String ans7_7;
	public String ans8_1;
	public String ans8_2;
	public String ans8_3;
	public String ans8_4;
	public String ans8_5;
	public String ans8_6;
	public String ans8_7;
	public String ans9_1;
	public String ans9_2;
	public String ans9_3;
	public String ans9_4;
	public String ans9_5;
	public String ans9_6;
	public String ans9_7;
	public String ans10_1;
	public String ans10_2;
	public String ans10_3;
	public String ans10_4;
	public String ans10_5;
	public String ans10_6;
	public String ans10_7;
	public String objcnt1;
	public String objcnt2;
	public String objcnt3;
	public String objcnt4;
	public String objcnt5;
	public String objcnt6;
	public String objcnt7;
	public String objcnt8;
	public String objcnt9;
	public String objcnt10;
	public String sbjlgth1;
	public String sbjlgth2;
	public String sbjlgth3;
	public String sbjlgth4;
	public String sbjlgth5;
	public String sbjlgth6;
	public String sbjlgth7;
	public String sbjlgth8;
	public String sbjlgth9;
	public String sbjlgth10;
	public String priority1;
	public String priority2;
	public String priority3;
	public String priority4;
	public String priority5;
	public String priority6;
	public String priority7;
	public String priority8;
	public String priority9;
	public String priority10;
	public String reqfg1;
	public String reqfg2;
	public String reqfg3;
	public String reqfg4;
	public String reqfg5;
	public String reqfg6;
	public String reqfg7;
	public String reqfg8;
	public String reqfg9;
	public String reqfg10;
	public String q_stat1;
	public String q_stat2;
	public String q_stat3;
	public String q_stat4;
	public String q_stat5;
	public String q_stat6;
	public String q_stat7;
	public String q_stat8;
	public String q_stat9;
	public String q_stat10;
	public String qstbsyn1;
	public String qstbsyn2;
	public String qstbsyn3;
	public String qstbsyn4;
	public String qstbsyn5;
	public String qstbsyn6;
	public String qstbsyn7;
	public String qstbsyn8;
	public String qstbsyn9;
	public String qstbsyn10;
	public String ans01_bastat1;
	public String ans01_bastat2;
	public String ans01_bastat3;
	public String ans01_bastat4;
	public String ans01_bastat5;
	public String ans01_bastat6;
	public String ans01_bastat7;
	public String ans02_bastat1;
	public String ans02_bastat2;
	public String ans02_bastat3;
	public String ans02_bastat4;
	public String ans02_bastat5;
	public String ans02_bastat6;
	public String ans02_bastat7;
	public String ans03_bastat1;
	public String ans03_bastat2;
	public String ans03_bastat3;
	public String ans03_bastat4;
	public String ans03_bastat5;
	public String ans03_bastat6;
	public String ans03_bastat7;
	public String ans04_bastat1;
	public String ans04_bastat2;
	public String ans04_bastat3;
	public String ans04_bastat4;
	public String ans04_bastat5;
	public String ans04_bastat6;
	public String ans04_bastat7;
	public String ans05_bastat1;
	public String ans05_bastat2;
	public String ans05_bastat3;
	public String ans05_bastat4;
	public String ans05_bastat5;
	public String ans05_bastat6;
	public String ans05_bastat7;
	public String ans06_bastat1;
	public String ans06_bastat2;
	public String ans06_bastat3;
	public String ans06_bastat4;
	public String ans06_bastat5;
	public String ans06_bastat6;
	public String ans06_bastat7;
	public String ans07_bastat1;
	public String ans07_bastat2;
	public String ans07_bastat3;
	public String ans07_bastat4;
	public String ans07_bastat5;
	public String ans07_bastat6;
	public String ans07_bastat7;
	public String ans08_bastat1;
	public String ans08_bastat2;
	public String ans08_bastat3;
	public String ans08_bastat4;
	public String ans08_bastat5;
	public String ans08_bastat6;
	public String ans08_bastat7;
	public String ans09_bastat1;
	public String ans09_bastat2;
	public String ans09_bastat3;
	public String ans09_bastat4;
	public String ans09_bastat5;
	public String ans09_bastat6;
	public String ans09_bastat7;
	public String ans10_bastat1;
	public String ans10_bastat2;
	public String ans10_bastat3;
	public String ans10_bastat4;
	public String ans10_bastat5;
	public String ans10_bastat6;
	public String ans10_bastat7;

	public SS_A_MO_SVYDM(){}
	public SS_A_MO_SVYDM(String incmgpers, String accflag, String svyid, String svynm, String sttdt, String enddt, String qstsnum, String url, String s_stat, String giftfg, String memo, String camptype, String basicdt, String qstid1, String qstid2, String qstid3, String qstid4, String qstid5, String qstid6, String qstid7, String qstid8, String qstid9, String qstid10, String cont1, String cont2, String cont3, String cont4, String cont5, String cont6, String cont7, String cont8, String cont9, String cont10, String qtstype1, String qtstype2, String qtstype3, String qtstype4, String qtstype5, String qtstype6, String qtstype7, String qtstype8, String qtstype9, String qtstype10, String ans1_1, String ans1_2, String ans1_3, String ans1_4, String ans1_5, String ans1_6, String ans1_7, String ans2_1, String ans2_2, String ans2_3, String ans2_4, String ans2_5, String ans2_6, String ans2_7, String ans3_1, String ans3_2, String ans3_3, String ans3_4, String ans3_5, String ans3_6, String ans3_7, String ans4_1, String ans4_2, String ans4_3, String ans4_4, String ans4_5, String ans4_6, String ans4_7, String ans5_1, String ans5_2, String ans5_3, String ans5_4, String ans5_5, String ans5_6, String ans5_7, String ans6_1, String ans6_2, String ans6_3, String ans6_4, String ans6_5, String ans6_6, String ans6_7, String ans7_1, String ans7_2, String ans7_3, String ans7_4, String ans7_5, String ans7_6, String ans7_7, String ans8_1, String ans8_2, String ans8_3, String ans8_4, String ans8_5, String ans8_6, String ans8_7, String ans9_1, String ans9_2, String ans9_3, String ans9_4, String ans9_5, String ans9_6, String ans9_7, String ans10_1, String ans10_2, String ans10_3, String ans10_4, String ans10_5, String ans10_6, String ans10_7, String objcnt1, String objcnt2, String objcnt3, String objcnt4, String objcnt5, String objcnt6, String objcnt7, String objcnt8, String objcnt9, String objcnt10, String sbjlgth1, String sbjlgth2, String sbjlgth3, String sbjlgth4, String sbjlgth5, String sbjlgth6, String sbjlgth7, String sbjlgth8, String sbjlgth9, String sbjlgth10, String priority1, String priority2, String priority3, String priority4, String priority5, String priority6, String priority7, String priority8, String priority9, String priority10, String reqfg1, String reqfg2, String reqfg3, String reqfg4, String reqfg5, String reqfg6, String reqfg7, String reqfg8, String reqfg9, String reqfg10, String q_stat1, String q_stat2, String q_stat3, String q_stat4, String q_stat5, String q_stat6, String q_stat7, String q_stat8, String q_stat9, String q_stat10, String qstbsyn1, String qstbsyn2, String qstbsyn3, String qstbsyn4, String qstbsyn5, String qstbsyn6, String qstbsyn7, String qstbsyn8, String qstbsyn9, String qstbsyn10, String ans01_bastat1, String ans01_bastat2, String ans01_bastat3, String ans01_bastat4, String ans01_bastat5, String ans01_bastat6, String ans01_bastat7, String ans02_bastat1, String ans02_bastat2, String ans02_bastat3, String ans02_bastat4, String ans02_bastat5, String ans02_bastat6, String ans02_bastat7, String ans03_bastat1, String ans03_bastat2, String ans03_bastat3, String ans03_bastat4, String ans03_bastat5, String ans03_bastat6, String ans03_bastat7, String ans04_bastat1, String ans04_bastat2, String ans04_bastat3, String ans04_bastat4, String ans04_bastat5, String ans04_bastat6, String ans04_bastat7, String ans05_bastat1, String ans05_bastat2, String ans05_bastat3, String ans05_bastat4, String ans05_bastat5, String ans05_bastat6, String ans05_bastat7, String ans06_bastat1, String ans06_bastat2, String ans06_bastat3, String ans06_bastat4, String ans06_bastat5, String ans06_bastat6, String ans06_bastat7, String ans07_bastat1, String ans07_bastat2, String ans07_bastat3, String ans07_bastat4, String ans07_bastat5, String ans07_bastat6, String ans07_bastat7, String ans08_bastat1, String ans08_bastat2, String ans08_bastat3, String ans08_bastat4, String ans08_bastat5, String ans08_bastat6, String ans08_bastat7, String ans09_bastat1, String ans09_bastat2, String ans09_bastat3, String ans09_bastat4, String ans09_bastat5, String ans09_bastat6, String ans09_bastat7, String ans10_bastat1, String ans10_bastat2, String ans10_bastat3, String ans10_bastat4, String ans10_bastat5, String ans10_bastat6, String ans10_bastat7){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.svyid = svyid;
		this.svynm = svynm;
		this.sttdt = sttdt;
		this.enddt = enddt;
		this.qstsnum = qstsnum;
		this.url = url;
		this.s_stat = s_stat;
		this.giftfg = giftfg;
		this.memo = memo;
		this.camptype = camptype;
		this.basicdt = basicdt;
		this.qstid1 = qstid1;
		this.qstid2 = qstid2;
		this.qstid3 = qstid3;
		this.qstid4 = qstid4;
		this.qstid5 = qstid5;
		this.qstid6 = qstid6;
		this.qstid7 = qstid7;
		this.qstid8 = qstid8;
		this.qstid9 = qstid9;
		this.qstid10 = qstid10;
		this.cont1 = cont1;
		this.cont2 = cont2;
		this.cont3 = cont3;
		this.cont4 = cont4;
		this.cont5 = cont5;
		this.cont6 = cont6;
		this.cont7 = cont7;
		this.cont8 = cont8;
		this.cont9 = cont9;
		this.cont10 = cont10;
		this.qtstype1 = qtstype1;
		this.qtstype2 = qtstype2;
		this.qtstype3 = qtstype3;
		this.qtstype4 = qtstype4;
		this.qtstype5 = qtstype5;
		this.qtstype6 = qtstype6;
		this.qtstype7 = qtstype7;
		this.qtstype8 = qtstype8;
		this.qtstype9 = qtstype9;
		this.qtstype10 = qtstype10;
		this.ans1_1 = ans1_1;
		this.ans1_2 = ans1_2;
		this.ans1_3 = ans1_3;
		this.ans1_4 = ans1_4;
		this.ans1_5 = ans1_5;
		this.ans1_6 = ans1_6;
		this.ans1_7 = ans1_7;
		this.ans2_1 = ans2_1;
		this.ans2_2 = ans2_2;
		this.ans2_3 = ans2_3;
		this.ans2_4 = ans2_4;
		this.ans2_5 = ans2_5;
		this.ans2_6 = ans2_6;
		this.ans2_7 = ans2_7;
		this.ans3_1 = ans3_1;
		this.ans3_2 = ans3_2;
		this.ans3_3 = ans3_3;
		this.ans3_4 = ans3_4;
		this.ans3_5 = ans3_5;
		this.ans3_6 = ans3_6;
		this.ans3_7 = ans3_7;
		this.ans4_1 = ans4_1;
		this.ans4_2 = ans4_2;
		this.ans4_3 = ans4_3;
		this.ans4_4 = ans4_4;
		this.ans4_5 = ans4_5;
		this.ans4_6 = ans4_6;
		this.ans4_7 = ans4_7;
		this.ans5_1 = ans5_1;
		this.ans5_2 = ans5_2;
		this.ans5_3 = ans5_3;
		this.ans5_4 = ans5_4;
		this.ans5_5 = ans5_5;
		this.ans5_6 = ans5_6;
		this.ans5_7 = ans5_7;
		this.ans6_1 = ans6_1;
		this.ans6_2 = ans6_2;
		this.ans6_3 = ans6_3;
		this.ans6_4 = ans6_4;
		this.ans6_5 = ans6_5;
		this.ans6_6 = ans6_6;
		this.ans6_7 = ans6_7;
		this.ans7_1 = ans7_1;
		this.ans7_2 = ans7_2;
		this.ans7_3 = ans7_3;
		this.ans7_4 = ans7_4;
		this.ans7_5 = ans7_5;
		this.ans7_6 = ans7_6;
		this.ans7_7 = ans7_7;
		this.ans8_1 = ans8_1;
		this.ans8_2 = ans8_2;
		this.ans8_3 = ans8_3;
		this.ans8_4 = ans8_4;
		this.ans8_5 = ans8_5;
		this.ans8_6 = ans8_6;
		this.ans8_7 = ans8_7;
		this.ans9_1 = ans9_1;
		this.ans9_2 = ans9_2;
		this.ans9_3 = ans9_3;
		this.ans9_4 = ans9_4;
		this.ans9_5 = ans9_5;
		this.ans9_6 = ans9_6;
		this.ans9_7 = ans9_7;
		this.ans10_1 = ans10_1;
		this.ans10_2 = ans10_2;
		this.ans10_3 = ans10_3;
		this.ans10_4 = ans10_4;
		this.ans10_5 = ans10_5;
		this.ans10_6 = ans10_6;
		this.ans10_7 = ans10_7;
		this.objcnt1 = objcnt1;
		this.objcnt2 = objcnt2;
		this.objcnt3 = objcnt3;
		this.objcnt4 = objcnt4;
		this.objcnt5 = objcnt5;
		this.objcnt6 = objcnt6;
		this.objcnt7 = objcnt7;
		this.objcnt8 = objcnt8;
		this.objcnt9 = objcnt9;
		this.objcnt10 = objcnt10;
		this.sbjlgth1 = sbjlgth1;
		this.sbjlgth2 = sbjlgth2;
		this.sbjlgth3 = sbjlgth3;
		this.sbjlgth4 = sbjlgth4;
		this.sbjlgth5 = sbjlgth5;
		this.sbjlgth6 = sbjlgth6;
		this.sbjlgth7 = sbjlgth7;
		this.sbjlgth8 = sbjlgth8;
		this.sbjlgth9 = sbjlgth9;
		this.sbjlgth10 = sbjlgth10;
		this.priority1 = priority1;
		this.priority2 = priority2;
		this.priority3 = priority3;
		this.priority4 = priority4;
		this.priority5 = priority5;
		this.priority6 = priority6;
		this.priority7 = priority7;
		this.priority8 = priority8;
		this.priority9 = priority9;
		this.priority10 = priority10;
		this.reqfg1 = reqfg1;
		this.reqfg2 = reqfg2;
		this.reqfg3 = reqfg3;
		this.reqfg4 = reqfg4;
		this.reqfg5 = reqfg5;
		this.reqfg6 = reqfg6;
		this.reqfg7 = reqfg7;
		this.reqfg8 = reqfg8;
		this.reqfg9 = reqfg9;
		this.reqfg10 = reqfg10;
		this.q_stat1 = q_stat1;
		this.q_stat2 = q_stat2;
		this.q_stat3 = q_stat3;
		this.q_stat4 = q_stat4;
		this.q_stat5 = q_stat5;
		this.q_stat6 = q_stat6;
		this.q_stat7 = q_stat7;
		this.q_stat8 = q_stat8;
		this.q_stat9 = q_stat9;
		this.q_stat10 = q_stat10;
		this.qstbsyn1 = qstbsyn1;
		this.qstbsyn2 = qstbsyn2;
		this.qstbsyn3 = qstbsyn3;
		this.qstbsyn4 = qstbsyn4;
		this.qstbsyn5 = qstbsyn5;
		this.qstbsyn6 = qstbsyn6;
		this.qstbsyn7 = qstbsyn7;
		this.qstbsyn8 = qstbsyn8;
		this.qstbsyn9 = qstbsyn9;
		this.qstbsyn10 = qstbsyn10;
		this.ans01_bastat1 = ans01_bastat1;
		this.ans01_bastat2 = ans01_bastat2;
		this.ans01_bastat3 = ans01_bastat3;
		this.ans01_bastat4 = ans01_bastat4;
		this.ans01_bastat5 = ans01_bastat5;
		this.ans01_bastat6 = ans01_bastat6;
		this.ans01_bastat7 = ans01_bastat7;
		this.ans02_bastat1 = ans02_bastat1;
		this.ans02_bastat2 = ans02_bastat2;
		this.ans02_bastat3 = ans02_bastat3;
		this.ans02_bastat4 = ans02_bastat4;
		this.ans02_bastat5 = ans02_bastat5;
		this.ans02_bastat6 = ans02_bastat6;
		this.ans02_bastat7 = ans02_bastat7;
		this.ans03_bastat1 = ans03_bastat1;
		this.ans03_bastat2 = ans03_bastat2;
		this.ans03_bastat3 = ans03_bastat3;
		this.ans03_bastat4 = ans03_bastat4;
		this.ans03_bastat5 = ans03_bastat5;
		this.ans03_bastat6 = ans03_bastat6;
		this.ans03_bastat7 = ans03_bastat7;
		this.ans04_bastat1 = ans04_bastat1;
		this.ans04_bastat2 = ans04_bastat2;
		this.ans04_bastat3 = ans04_bastat3;
		this.ans04_bastat4 = ans04_bastat4;
		this.ans04_bastat5 = ans04_bastat5;
		this.ans04_bastat6 = ans04_bastat6;
		this.ans04_bastat7 = ans04_bastat7;
		this.ans05_bastat1 = ans05_bastat1;
		this.ans05_bastat2 = ans05_bastat2;
		this.ans05_bastat3 = ans05_bastat3;
		this.ans05_bastat4 = ans05_bastat4;
		this.ans05_bastat5 = ans05_bastat5;
		this.ans05_bastat6 = ans05_bastat6;
		this.ans05_bastat7 = ans05_bastat7;
		this.ans06_bastat1 = ans06_bastat1;
		this.ans06_bastat2 = ans06_bastat2;
		this.ans06_bastat3 = ans06_bastat3;
		this.ans06_bastat4 = ans06_bastat4;
		this.ans06_bastat5 = ans06_bastat5;
		this.ans06_bastat6 = ans06_bastat6;
		this.ans06_bastat7 = ans06_bastat7;
		this.ans07_bastat1 = ans07_bastat1;
		this.ans07_bastat2 = ans07_bastat2;
		this.ans07_bastat3 = ans07_bastat3;
		this.ans07_bastat4 = ans07_bastat4;
		this.ans07_bastat5 = ans07_bastat5;
		this.ans07_bastat6 = ans07_bastat6;
		this.ans07_bastat7 = ans07_bastat7;
		this.ans08_bastat1 = ans08_bastat1;
		this.ans08_bastat2 = ans08_bastat2;
		this.ans08_bastat3 = ans08_bastat3;
		this.ans08_bastat4 = ans08_bastat4;
		this.ans08_bastat5 = ans08_bastat5;
		this.ans08_bastat6 = ans08_bastat6;
		this.ans08_bastat7 = ans08_bastat7;
		this.ans09_bastat1 = ans09_bastat1;
		this.ans09_bastat2 = ans09_bastat2;
		this.ans09_bastat3 = ans09_bastat3;
		this.ans09_bastat4 = ans09_bastat4;
		this.ans09_bastat5 = ans09_bastat5;
		this.ans09_bastat6 = ans09_bastat6;
		this.ans09_bastat7 = ans09_bastat7;
		this.ans10_bastat1 = ans10_bastat1;
		this.ans10_bastat2 = ans10_bastat2;
		this.ans10_bastat3 = ans10_bastat3;
		this.ans10_bastat4 = ans10_bastat4;
		this.ans10_bastat5 = ans10_bastat5;
		this.ans10_bastat6 = ans10_bastat6;
		this.ans10_bastat7 = ans10_bastat7;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setSvyid(String svyid){
		this.svyid = svyid;
	}

	public void setSvynm(String svynm){
		this.svynm = svynm;
	}

	public void setSttdt(String sttdt){
		this.sttdt = sttdt;
	}

	public void setEnddt(String enddt){
		this.enddt = enddt;
	}

	public void setQstsnum(String qstsnum){
		this.qstsnum = qstsnum;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public void setS_stat(String s_stat){
		this.s_stat = s_stat;
	}

	public void setGiftfg(String giftfg){
		this.giftfg = giftfg;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setCamptype(String camptype){
		this.camptype = camptype;
	}

	public void setBasicdt(String basicdt){
		this.basicdt = basicdt;
	}

	public void setQstid1(String qstid1){
		this.qstid1 = qstid1;
	}

	public void setQstid2(String qstid2){
		this.qstid2 = qstid2;
	}

	public void setQstid3(String qstid3){
		this.qstid3 = qstid3;
	}

	public void setQstid4(String qstid4){
		this.qstid4 = qstid4;
	}

	public void setQstid5(String qstid5){
		this.qstid5 = qstid5;
	}

	public void setQstid6(String qstid6){
		this.qstid6 = qstid6;
	}

	public void setQstid7(String qstid7){
		this.qstid7 = qstid7;
	}

	public void setQstid8(String qstid8){
		this.qstid8 = qstid8;
	}

	public void setQstid9(String qstid9){
		this.qstid9 = qstid9;
	}

	public void setQstid10(String qstid10){
		this.qstid10 = qstid10;
	}

	public void setCont1(String cont1){
		this.cont1 = cont1;
	}

	public void setCont2(String cont2){
		this.cont2 = cont2;
	}

	public void setCont3(String cont3){
		this.cont3 = cont3;
	}

	public void setCont4(String cont4){
		this.cont4 = cont4;
	}

	public void setCont5(String cont5){
		this.cont5 = cont5;
	}

	public void setCont6(String cont6){
		this.cont6 = cont6;
	}

	public void setCont7(String cont7){
		this.cont7 = cont7;
	}

	public void setCont8(String cont8){
		this.cont8 = cont8;
	}

	public void setCont9(String cont9){
		this.cont9 = cont9;
	}

	public void setCont10(String cont10){
		this.cont10 = cont10;
	}

	public void setQtstype1(String qtstype1){
		this.qtstype1 = qtstype1;
	}

	public void setQtstype2(String qtstype2){
		this.qtstype2 = qtstype2;
	}

	public void setQtstype3(String qtstype3){
		this.qtstype3 = qtstype3;
	}

	public void setQtstype4(String qtstype4){
		this.qtstype4 = qtstype4;
	}

	public void setQtstype5(String qtstype5){
		this.qtstype5 = qtstype5;
	}

	public void setQtstype6(String qtstype6){
		this.qtstype6 = qtstype6;
	}

	public void setQtstype7(String qtstype7){
		this.qtstype7 = qtstype7;
	}

	public void setQtstype8(String qtstype8){
		this.qtstype8 = qtstype8;
	}

	public void setQtstype9(String qtstype9){
		this.qtstype9 = qtstype9;
	}

	public void setQtstype10(String qtstype10){
		this.qtstype10 = qtstype10;
	}

	public void setAns1_1(String ans1_1){
		this.ans1_1 = ans1_1;
	}

	public void setAns1_2(String ans1_2){
		this.ans1_2 = ans1_2;
	}

	public void setAns1_3(String ans1_3){
		this.ans1_3 = ans1_3;
	}

	public void setAns1_4(String ans1_4){
		this.ans1_4 = ans1_4;
	}

	public void setAns1_5(String ans1_5){
		this.ans1_5 = ans1_5;
	}

	public void setAns1_6(String ans1_6){
		this.ans1_6 = ans1_6;
	}

	public void setAns1_7(String ans1_7){
		this.ans1_7 = ans1_7;
	}

	public void setAns2_1(String ans2_1){
		this.ans2_1 = ans2_1;
	}

	public void setAns2_2(String ans2_2){
		this.ans2_2 = ans2_2;
	}

	public void setAns2_3(String ans2_3){
		this.ans2_3 = ans2_3;
	}

	public void setAns2_4(String ans2_4){
		this.ans2_4 = ans2_4;
	}

	public void setAns2_5(String ans2_5){
		this.ans2_5 = ans2_5;
	}

	public void setAns2_6(String ans2_6){
		this.ans2_6 = ans2_6;
	}

	public void setAns2_7(String ans2_7){
		this.ans2_7 = ans2_7;
	}

	public void setAns3_1(String ans3_1){
		this.ans3_1 = ans3_1;
	}

	public void setAns3_2(String ans3_2){
		this.ans3_2 = ans3_2;
	}

	public void setAns3_3(String ans3_3){
		this.ans3_3 = ans3_3;
	}

	public void setAns3_4(String ans3_4){
		this.ans3_4 = ans3_4;
	}

	public void setAns3_5(String ans3_5){
		this.ans3_5 = ans3_5;
	}

	public void setAns3_6(String ans3_6){
		this.ans3_6 = ans3_6;
	}

	public void setAns3_7(String ans3_7){
		this.ans3_7 = ans3_7;
	}

	public void setAns4_1(String ans4_1){
		this.ans4_1 = ans4_1;
	}

	public void setAns4_2(String ans4_2){
		this.ans4_2 = ans4_2;
	}

	public void setAns4_3(String ans4_3){
		this.ans4_3 = ans4_3;
	}

	public void setAns4_4(String ans4_4){
		this.ans4_4 = ans4_4;
	}

	public void setAns4_5(String ans4_5){
		this.ans4_5 = ans4_5;
	}

	public void setAns4_6(String ans4_6){
		this.ans4_6 = ans4_6;
	}

	public void setAns4_7(String ans4_7){
		this.ans4_7 = ans4_7;
	}

	public void setAns5_1(String ans5_1){
		this.ans5_1 = ans5_1;
	}

	public void setAns5_2(String ans5_2){
		this.ans5_2 = ans5_2;
	}

	public void setAns5_3(String ans5_3){
		this.ans5_3 = ans5_3;
	}

	public void setAns5_4(String ans5_4){
		this.ans5_4 = ans5_4;
	}

	public void setAns5_5(String ans5_5){
		this.ans5_5 = ans5_5;
	}

	public void setAns5_6(String ans5_6){
		this.ans5_6 = ans5_6;
	}

	public void setAns5_7(String ans5_7){
		this.ans5_7 = ans5_7;
	}

	public void setAns6_1(String ans6_1){
		this.ans6_1 = ans6_1;
	}

	public void setAns6_2(String ans6_2){
		this.ans6_2 = ans6_2;
	}

	public void setAns6_3(String ans6_3){
		this.ans6_3 = ans6_3;
	}

	public void setAns6_4(String ans6_4){
		this.ans6_4 = ans6_4;
	}

	public void setAns6_5(String ans6_5){
		this.ans6_5 = ans6_5;
	}

	public void setAns6_6(String ans6_6){
		this.ans6_6 = ans6_6;
	}

	public void setAns6_7(String ans6_7){
		this.ans6_7 = ans6_7;
	}

	public void setAns7_1(String ans7_1){
		this.ans7_1 = ans7_1;
	}

	public void setAns7_2(String ans7_2){
		this.ans7_2 = ans7_2;
	}

	public void setAns7_3(String ans7_3){
		this.ans7_3 = ans7_3;
	}

	public void setAns7_4(String ans7_4){
		this.ans7_4 = ans7_4;
	}

	public void setAns7_5(String ans7_5){
		this.ans7_5 = ans7_5;
	}

	public void setAns7_6(String ans7_6){
		this.ans7_6 = ans7_6;
	}

	public void setAns7_7(String ans7_7){
		this.ans7_7 = ans7_7;
	}

	public void setAns8_1(String ans8_1){
		this.ans8_1 = ans8_1;
	}

	public void setAns8_2(String ans8_2){
		this.ans8_2 = ans8_2;
	}

	public void setAns8_3(String ans8_3){
		this.ans8_3 = ans8_3;
	}

	public void setAns8_4(String ans8_4){
		this.ans8_4 = ans8_4;
	}

	public void setAns8_5(String ans8_5){
		this.ans8_5 = ans8_5;
	}

	public void setAns8_6(String ans8_6){
		this.ans8_6 = ans8_6;
	}

	public void setAns8_7(String ans8_7){
		this.ans8_7 = ans8_7;
	}

	public void setAns9_1(String ans9_1){
		this.ans9_1 = ans9_1;
	}

	public void setAns9_2(String ans9_2){
		this.ans9_2 = ans9_2;
	}

	public void setAns9_3(String ans9_3){
		this.ans9_3 = ans9_3;
	}

	public void setAns9_4(String ans9_4){
		this.ans9_4 = ans9_4;
	}

	public void setAns9_5(String ans9_5){
		this.ans9_5 = ans9_5;
	}

	public void setAns9_6(String ans9_6){
		this.ans9_6 = ans9_6;
	}

	public void setAns9_7(String ans9_7){
		this.ans9_7 = ans9_7;
	}

	public void setAns10_1(String ans10_1){
		this.ans10_1 = ans10_1;
	}

	public void setAns10_2(String ans10_2){
		this.ans10_2 = ans10_2;
	}

	public void setAns10_3(String ans10_3){
		this.ans10_3 = ans10_3;
	}

	public void setAns10_4(String ans10_4){
		this.ans10_4 = ans10_4;
	}

	public void setAns10_5(String ans10_5){
		this.ans10_5 = ans10_5;
	}

	public void setAns10_6(String ans10_6){
		this.ans10_6 = ans10_6;
	}

	public void setAns10_7(String ans10_7){
		this.ans10_7 = ans10_7;
	}

	public void setObjcnt1(String objcnt1){
		this.objcnt1 = objcnt1;
	}

	public void setObjcnt2(String objcnt2){
		this.objcnt2 = objcnt2;
	}

	public void setObjcnt3(String objcnt3){
		this.objcnt3 = objcnt3;
	}

	public void setObjcnt4(String objcnt4){
		this.objcnt4 = objcnt4;
	}

	public void setObjcnt5(String objcnt5){
		this.objcnt5 = objcnt5;
	}

	public void setObjcnt6(String objcnt6){
		this.objcnt6 = objcnt6;
	}

	public void setObjcnt7(String objcnt7){
		this.objcnt7 = objcnt7;
	}

	public void setObjcnt8(String objcnt8){
		this.objcnt8 = objcnt8;
	}

	public void setObjcnt9(String objcnt9){
		this.objcnt9 = objcnt9;
	}

	public void setObjcnt10(String objcnt10){
		this.objcnt10 = objcnt10;
	}

	public void setSbjlgth1(String sbjlgth1){
		this.sbjlgth1 = sbjlgth1;
	}

	public void setSbjlgth2(String sbjlgth2){
		this.sbjlgth2 = sbjlgth2;
	}

	public void setSbjlgth3(String sbjlgth3){
		this.sbjlgth3 = sbjlgth3;
	}

	public void setSbjlgth4(String sbjlgth4){
		this.sbjlgth4 = sbjlgth4;
	}

	public void setSbjlgth5(String sbjlgth5){
		this.sbjlgth5 = sbjlgth5;
	}

	public void setSbjlgth6(String sbjlgth6){
		this.sbjlgth6 = sbjlgth6;
	}

	public void setSbjlgth7(String sbjlgth7){
		this.sbjlgth7 = sbjlgth7;
	}

	public void setSbjlgth8(String sbjlgth8){
		this.sbjlgth8 = sbjlgth8;
	}

	public void setSbjlgth9(String sbjlgth9){
		this.sbjlgth9 = sbjlgth9;
	}

	public void setSbjlgth10(String sbjlgth10){
		this.sbjlgth10 = sbjlgth10;
	}

	public void setPriority1(String priority1){
		this.priority1 = priority1;
	}

	public void setPriority2(String priority2){
		this.priority2 = priority2;
	}

	public void setPriority3(String priority3){
		this.priority3 = priority3;
	}

	public void setPriority4(String priority4){
		this.priority4 = priority4;
	}

	public void setPriority5(String priority5){
		this.priority5 = priority5;
	}

	public void setPriority6(String priority6){
		this.priority6 = priority6;
	}

	public void setPriority7(String priority7){
		this.priority7 = priority7;
	}

	public void setPriority8(String priority8){
		this.priority8 = priority8;
	}

	public void setPriority9(String priority9){
		this.priority9 = priority9;
	}

	public void setPriority10(String priority10){
		this.priority10 = priority10;
	}

	public void setReqfg1(String reqfg1){
		this.reqfg1 = reqfg1;
	}

	public void setReqfg2(String reqfg2){
		this.reqfg2 = reqfg2;
	}

	public void setReqfg3(String reqfg3){
		this.reqfg3 = reqfg3;
	}

	public void setReqfg4(String reqfg4){
		this.reqfg4 = reqfg4;
	}

	public void setReqfg5(String reqfg5){
		this.reqfg5 = reqfg5;
	}

	public void setReqfg6(String reqfg6){
		this.reqfg6 = reqfg6;
	}

	public void setReqfg7(String reqfg7){
		this.reqfg7 = reqfg7;
	}

	public void setReqfg8(String reqfg8){
		this.reqfg8 = reqfg8;
	}

	public void setReqfg9(String reqfg9){
		this.reqfg9 = reqfg9;
	}

	public void setReqfg10(String reqfg10){
		this.reqfg10 = reqfg10;
	}

	public void setQ_stat1(String q_stat1){
		this.q_stat1 = q_stat1;
	}

	public void setQ_stat2(String q_stat2){
		this.q_stat2 = q_stat2;
	}

	public void setQ_stat3(String q_stat3){
		this.q_stat3 = q_stat3;
	}

	public void setQ_stat4(String q_stat4){
		this.q_stat4 = q_stat4;
	}

	public void setQ_stat5(String q_stat5){
		this.q_stat5 = q_stat5;
	}

	public void setQ_stat6(String q_stat6){
		this.q_stat6 = q_stat6;
	}

	public void setQ_stat7(String q_stat7){
		this.q_stat7 = q_stat7;
	}

	public void setQ_stat8(String q_stat8){
		this.q_stat8 = q_stat8;
	}

	public void setQ_stat9(String q_stat9){
		this.q_stat9 = q_stat9;
	}

	public void setQ_stat10(String q_stat10){
		this.q_stat10 = q_stat10;
	}

	public void setQstbsyn1(String qstbsyn1){
		this.qstbsyn1 = qstbsyn1;
	}

	public void setQstbsyn2(String qstbsyn2){
		this.qstbsyn2 = qstbsyn2;
	}

	public void setQstbsyn3(String qstbsyn3){
		this.qstbsyn3 = qstbsyn3;
	}

	public void setQstbsyn4(String qstbsyn4){
		this.qstbsyn4 = qstbsyn4;
	}

	public void setQstbsyn5(String qstbsyn5){
		this.qstbsyn5 = qstbsyn5;
	}

	public void setQstbsyn6(String qstbsyn6){
		this.qstbsyn6 = qstbsyn6;
	}

	public void setQstbsyn7(String qstbsyn7){
		this.qstbsyn7 = qstbsyn7;
	}

	public void setQstbsyn8(String qstbsyn8){
		this.qstbsyn8 = qstbsyn8;
	}

	public void setQstbsyn9(String qstbsyn9){
		this.qstbsyn9 = qstbsyn9;
	}

	public void setQstbsyn10(String qstbsyn10){
		this.qstbsyn10 = qstbsyn10;
	}

	public void setAns01_bastat1(String ans01_bastat1){
		this.ans01_bastat1 = ans01_bastat1;
	}

	public void setAns01_bastat2(String ans01_bastat2){
		this.ans01_bastat2 = ans01_bastat2;
	}

	public void setAns01_bastat3(String ans01_bastat3){
		this.ans01_bastat3 = ans01_bastat3;
	}

	public void setAns01_bastat4(String ans01_bastat4){
		this.ans01_bastat4 = ans01_bastat4;
	}

	public void setAns01_bastat5(String ans01_bastat5){
		this.ans01_bastat5 = ans01_bastat5;
	}

	public void setAns01_bastat6(String ans01_bastat6){
		this.ans01_bastat6 = ans01_bastat6;
	}

	public void setAns01_bastat7(String ans01_bastat7){
		this.ans01_bastat7 = ans01_bastat7;
	}

	public void setAns02_bastat1(String ans02_bastat1){
		this.ans02_bastat1 = ans02_bastat1;
	}

	public void setAns02_bastat2(String ans02_bastat2){
		this.ans02_bastat2 = ans02_bastat2;
	}

	public void setAns02_bastat3(String ans02_bastat3){
		this.ans02_bastat3 = ans02_bastat3;
	}

	public void setAns02_bastat4(String ans02_bastat4){
		this.ans02_bastat4 = ans02_bastat4;
	}

	public void setAns02_bastat5(String ans02_bastat5){
		this.ans02_bastat5 = ans02_bastat5;
	}

	public void setAns02_bastat6(String ans02_bastat6){
		this.ans02_bastat6 = ans02_bastat6;
	}

	public void setAns02_bastat7(String ans02_bastat7){
		this.ans02_bastat7 = ans02_bastat7;
	}

	public void setAns03_bastat1(String ans03_bastat1){
		this.ans03_bastat1 = ans03_bastat1;
	}

	public void setAns03_bastat2(String ans03_bastat2){
		this.ans03_bastat2 = ans03_bastat2;
	}

	public void setAns03_bastat3(String ans03_bastat3){
		this.ans03_bastat3 = ans03_bastat3;
	}

	public void setAns03_bastat4(String ans03_bastat4){
		this.ans03_bastat4 = ans03_bastat4;
	}

	public void setAns03_bastat5(String ans03_bastat5){
		this.ans03_bastat5 = ans03_bastat5;
	}

	public void setAns03_bastat6(String ans03_bastat6){
		this.ans03_bastat6 = ans03_bastat6;
	}

	public void setAns03_bastat7(String ans03_bastat7){
		this.ans03_bastat7 = ans03_bastat7;
	}

	public void setAns04_bastat1(String ans04_bastat1){
		this.ans04_bastat1 = ans04_bastat1;
	}

	public void setAns04_bastat2(String ans04_bastat2){
		this.ans04_bastat2 = ans04_bastat2;
	}

	public void setAns04_bastat3(String ans04_bastat3){
		this.ans04_bastat3 = ans04_bastat3;
	}

	public void setAns04_bastat4(String ans04_bastat4){
		this.ans04_bastat4 = ans04_bastat4;
	}

	public void setAns04_bastat5(String ans04_bastat5){
		this.ans04_bastat5 = ans04_bastat5;
	}

	public void setAns04_bastat6(String ans04_bastat6){
		this.ans04_bastat6 = ans04_bastat6;
	}

	public void setAns04_bastat7(String ans04_bastat7){
		this.ans04_bastat7 = ans04_bastat7;
	}

	public void setAns05_bastat1(String ans05_bastat1){
		this.ans05_bastat1 = ans05_bastat1;
	}

	public void setAns05_bastat2(String ans05_bastat2){
		this.ans05_bastat2 = ans05_bastat2;
	}

	public void setAns05_bastat3(String ans05_bastat3){
		this.ans05_bastat3 = ans05_bastat3;
	}

	public void setAns05_bastat4(String ans05_bastat4){
		this.ans05_bastat4 = ans05_bastat4;
	}

	public void setAns05_bastat5(String ans05_bastat5){
		this.ans05_bastat5 = ans05_bastat5;
	}

	public void setAns05_bastat6(String ans05_bastat6){
		this.ans05_bastat6 = ans05_bastat6;
	}

	public void setAns05_bastat7(String ans05_bastat7){
		this.ans05_bastat7 = ans05_bastat7;
	}

	public void setAns06_bastat1(String ans06_bastat1){
		this.ans06_bastat1 = ans06_bastat1;
	}

	public void setAns06_bastat2(String ans06_bastat2){
		this.ans06_bastat2 = ans06_bastat2;
	}

	public void setAns06_bastat3(String ans06_bastat3){
		this.ans06_bastat3 = ans06_bastat3;
	}

	public void setAns06_bastat4(String ans06_bastat4){
		this.ans06_bastat4 = ans06_bastat4;
	}

	public void setAns06_bastat5(String ans06_bastat5){
		this.ans06_bastat5 = ans06_bastat5;
	}

	public void setAns06_bastat6(String ans06_bastat6){
		this.ans06_bastat6 = ans06_bastat6;
	}

	public void setAns06_bastat7(String ans06_bastat7){
		this.ans06_bastat7 = ans06_bastat7;
	}

	public void setAns07_bastat1(String ans07_bastat1){
		this.ans07_bastat1 = ans07_bastat1;
	}

	public void setAns07_bastat2(String ans07_bastat2){
		this.ans07_bastat2 = ans07_bastat2;
	}

	public void setAns07_bastat3(String ans07_bastat3){
		this.ans07_bastat3 = ans07_bastat3;
	}

	public void setAns07_bastat4(String ans07_bastat4){
		this.ans07_bastat4 = ans07_bastat4;
	}

	public void setAns07_bastat5(String ans07_bastat5){
		this.ans07_bastat5 = ans07_bastat5;
	}

	public void setAns07_bastat6(String ans07_bastat6){
		this.ans07_bastat6 = ans07_bastat6;
	}

	public void setAns07_bastat7(String ans07_bastat7){
		this.ans07_bastat7 = ans07_bastat7;
	}

	public void setAns08_bastat1(String ans08_bastat1){
		this.ans08_bastat1 = ans08_bastat1;
	}

	public void setAns08_bastat2(String ans08_bastat2){
		this.ans08_bastat2 = ans08_bastat2;
	}

	public void setAns08_bastat3(String ans08_bastat3){
		this.ans08_bastat3 = ans08_bastat3;
	}

	public void setAns08_bastat4(String ans08_bastat4){
		this.ans08_bastat4 = ans08_bastat4;
	}

	public void setAns08_bastat5(String ans08_bastat5){
		this.ans08_bastat5 = ans08_bastat5;
	}

	public void setAns08_bastat6(String ans08_bastat6){
		this.ans08_bastat6 = ans08_bastat6;
	}

	public void setAns08_bastat7(String ans08_bastat7){
		this.ans08_bastat7 = ans08_bastat7;
	}

	public void setAns09_bastat1(String ans09_bastat1){
		this.ans09_bastat1 = ans09_bastat1;
	}

	public void setAns09_bastat2(String ans09_bastat2){
		this.ans09_bastat2 = ans09_bastat2;
	}

	public void setAns09_bastat3(String ans09_bastat3){
		this.ans09_bastat3 = ans09_bastat3;
	}

	public void setAns09_bastat4(String ans09_bastat4){
		this.ans09_bastat4 = ans09_bastat4;
	}

	public void setAns09_bastat5(String ans09_bastat5){
		this.ans09_bastat5 = ans09_bastat5;
	}

	public void setAns09_bastat6(String ans09_bastat6){
		this.ans09_bastat6 = ans09_bastat6;
	}

	public void setAns09_bastat7(String ans09_bastat7){
		this.ans09_bastat7 = ans09_bastat7;
	}

	public void setAns10_bastat1(String ans10_bastat1){
		this.ans10_bastat1 = ans10_bastat1;
	}

	public void setAns10_bastat2(String ans10_bastat2){
		this.ans10_bastat2 = ans10_bastat2;
	}

	public void setAns10_bastat3(String ans10_bastat3){
		this.ans10_bastat3 = ans10_bastat3;
	}

	public void setAns10_bastat4(String ans10_bastat4){
		this.ans10_bastat4 = ans10_bastat4;
	}

	public void setAns10_bastat5(String ans10_bastat5){
		this.ans10_bastat5 = ans10_bastat5;
	}

	public void setAns10_bastat6(String ans10_bastat6){
		this.ans10_bastat6 = ans10_bastat6;
	}

	public void setAns10_bastat7(String ans10_bastat7){
		this.ans10_bastat7 = ans10_bastat7;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getSvyid(){
		return this.svyid;
	}

	public String getSvynm(){
		return this.svynm;
	}

	public String getSttdt(){
		return this.sttdt;
	}

	public String getEnddt(){
		return this.enddt;
	}

	public String getQstsnum(){
		return this.qstsnum;
	}

	public String getUrl(){
		return this.url;
	}

	public String getS_stat(){
		return this.s_stat;
	}

	public String getGiftfg(){
		return this.giftfg;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getCamptype(){
		return this.camptype;
	}

	public String getBasicdt(){
		return this.basicdt;
	}

	public String getQstid1(){
		return this.qstid1;
	}

	public String getQstid2(){
		return this.qstid2;
	}

	public String getQstid3(){
		return this.qstid3;
	}

	public String getQstid4(){
		return this.qstid4;
	}

	public String getQstid5(){
		return this.qstid5;
	}

	public String getQstid6(){
		return this.qstid6;
	}

	public String getQstid7(){
		return this.qstid7;
	}

	public String getQstid8(){
		return this.qstid8;
	}

	public String getQstid9(){
		return this.qstid9;
	}

	public String getQstid10(){
		return this.qstid10;
	}

	public String getCont1(){
		return this.cont1;
	}

	public String getCont2(){
		return this.cont2;
	}

	public String getCont3(){
		return this.cont3;
	}

	public String getCont4(){
		return this.cont4;
	}

	public String getCont5(){
		return this.cont5;
	}

	public String getCont6(){
		return this.cont6;
	}

	public String getCont7(){
		return this.cont7;
	}

	public String getCont8(){
		return this.cont8;
	}

	public String getCont9(){
		return this.cont9;
	}

	public String getCont10(){
		return this.cont10;
	}

	public String getQtstype1(){
		return this.qtstype1;
	}

	public String getQtstype2(){
		return this.qtstype2;
	}

	public String getQtstype3(){
		return this.qtstype3;
	}

	public String getQtstype4(){
		return this.qtstype4;
	}

	public String getQtstype5(){
		return this.qtstype5;
	}

	public String getQtstype6(){
		return this.qtstype6;
	}

	public String getQtstype7(){
		return this.qtstype7;
	}

	public String getQtstype8(){
		return this.qtstype8;
	}

	public String getQtstype9(){
		return this.qtstype9;
	}

	public String getQtstype10(){
		return this.qtstype10;
	}

	public String getAns1_1(){
		return this.ans1_1;
	}

	public String getAns1_2(){
		return this.ans1_2;
	}

	public String getAns1_3(){
		return this.ans1_3;
	}

	public String getAns1_4(){
		return this.ans1_4;
	}

	public String getAns1_5(){
		return this.ans1_5;
	}

	public String getAns1_6(){
		return this.ans1_6;
	}

	public String getAns1_7(){
		return this.ans1_7;
	}

	public String getAns2_1(){
		return this.ans2_1;
	}

	public String getAns2_2(){
		return this.ans2_2;
	}

	public String getAns2_3(){
		return this.ans2_3;
	}

	public String getAns2_4(){
		return this.ans2_4;
	}

	public String getAns2_5(){
		return this.ans2_5;
	}

	public String getAns2_6(){
		return this.ans2_6;
	}

	public String getAns2_7(){
		return this.ans2_7;
	}

	public String getAns3_1(){
		return this.ans3_1;
	}

	public String getAns3_2(){
		return this.ans3_2;
	}

	public String getAns3_3(){
		return this.ans3_3;
	}

	public String getAns3_4(){
		return this.ans3_4;
	}

	public String getAns3_5(){
		return this.ans3_5;
	}

	public String getAns3_6(){
		return this.ans3_6;
	}

	public String getAns3_7(){
		return this.ans3_7;
	}

	public String getAns4_1(){
		return this.ans4_1;
	}

	public String getAns4_2(){
		return this.ans4_2;
	}

	public String getAns4_3(){
		return this.ans4_3;
	}

	public String getAns4_4(){
		return this.ans4_4;
	}

	public String getAns4_5(){
		return this.ans4_5;
	}

	public String getAns4_6(){
		return this.ans4_6;
	}

	public String getAns4_7(){
		return this.ans4_7;
	}

	public String getAns5_1(){
		return this.ans5_1;
	}

	public String getAns5_2(){
		return this.ans5_2;
	}

	public String getAns5_3(){
		return this.ans5_3;
	}

	public String getAns5_4(){
		return this.ans5_4;
	}

	public String getAns5_5(){
		return this.ans5_5;
	}

	public String getAns5_6(){
		return this.ans5_6;
	}

	public String getAns5_7(){
		return this.ans5_7;
	}

	public String getAns6_1(){
		return this.ans6_1;
	}

	public String getAns6_2(){
		return this.ans6_2;
	}

	public String getAns6_3(){
		return this.ans6_3;
	}

	public String getAns6_4(){
		return this.ans6_4;
	}

	public String getAns6_5(){
		return this.ans6_5;
	}

	public String getAns6_6(){
		return this.ans6_6;
	}

	public String getAns6_7(){
		return this.ans6_7;
	}

	public String getAns7_1(){
		return this.ans7_1;
	}

	public String getAns7_2(){
		return this.ans7_2;
	}

	public String getAns7_3(){
		return this.ans7_3;
	}

	public String getAns7_4(){
		return this.ans7_4;
	}

	public String getAns7_5(){
		return this.ans7_5;
	}

	public String getAns7_6(){
		return this.ans7_6;
	}

	public String getAns7_7(){
		return this.ans7_7;
	}

	public String getAns8_1(){
		return this.ans8_1;
	}

	public String getAns8_2(){
		return this.ans8_2;
	}

	public String getAns8_3(){
		return this.ans8_3;
	}

	public String getAns8_4(){
		return this.ans8_4;
	}

	public String getAns8_5(){
		return this.ans8_5;
	}

	public String getAns8_6(){
		return this.ans8_6;
	}

	public String getAns8_7(){
		return this.ans8_7;
	}

	public String getAns9_1(){
		return this.ans9_1;
	}

	public String getAns9_2(){
		return this.ans9_2;
	}

	public String getAns9_3(){
		return this.ans9_3;
	}

	public String getAns9_4(){
		return this.ans9_4;
	}

	public String getAns9_5(){
		return this.ans9_5;
	}

	public String getAns9_6(){
		return this.ans9_6;
	}

	public String getAns9_7(){
		return this.ans9_7;
	}

	public String getAns10_1(){
		return this.ans10_1;
	}

	public String getAns10_2(){
		return this.ans10_2;
	}

	public String getAns10_3(){
		return this.ans10_3;
	}

	public String getAns10_4(){
		return this.ans10_4;
	}

	public String getAns10_5(){
		return this.ans10_5;
	}

	public String getAns10_6(){
		return this.ans10_6;
	}

	public String getAns10_7(){
		return this.ans10_7;
	}

	public String getObjcnt1(){
		return this.objcnt1;
	}

	public String getObjcnt2(){
		return this.objcnt2;
	}

	public String getObjcnt3(){
		return this.objcnt3;
	}

	public String getObjcnt4(){
		return this.objcnt4;
	}

	public String getObjcnt5(){
		return this.objcnt5;
	}

	public String getObjcnt6(){
		return this.objcnt6;
	}

	public String getObjcnt7(){
		return this.objcnt7;
	}

	public String getObjcnt8(){
		return this.objcnt8;
	}

	public String getObjcnt9(){
		return this.objcnt9;
	}

	public String getObjcnt10(){
		return this.objcnt10;
	}

	public String getSbjlgth1(){
		return this.sbjlgth1;
	}

	public String getSbjlgth2(){
		return this.sbjlgth2;
	}

	public String getSbjlgth3(){
		return this.sbjlgth3;
	}

	public String getSbjlgth4(){
		return this.sbjlgth4;
	}

	public String getSbjlgth5(){
		return this.sbjlgth5;
	}

	public String getSbjlgth6(){
		return this.sbjlgth6;
	}

	public String getSbjlgth7(){
		return this.sbjlgth7;
	}

	public String getSbjlgth8(){
		return this.sbjlgth8;
	}

	public String getSbjlgth9(){
		return this.sbjlgth9;
	}

	public String getSbjlgth10(){
		return this.sbjlgth10;
	}

	public String getPriority1(){
		return this.priority1;
	}

	public String getPriority2(){
		return this.priority2;
	}

	public String getPriority3(){
		return this.priority3;
	}

	public String getPriority4(){
		return this.priority4;
	}

	public String getPriority5(){
		return this.priority5;
	}

	public String getPriority6(){
		return this.priority6;
	}

	public String getPriority7(){
		return this.priority7;
	}

	public String getPriority8(){
		return this.priority8;
	}

	public String getPriority9(){
		return this.priority9;
	}

	public String getPriority10(){
		return this.priority10;
	}

	public String getReqfg1(){
		return this.reqfg1;
	}

	public String getReqfg2(){
		return this.reqfg2;
	}

	public String getReqfg3(){
		return this.reqfg3;
	}

	public String getReqfg4(){
		return this.reqfg4;
	}

	public String getReqfg5(){
		return this.reqfg5;
	}

	public String getReqfg6(){
		return this.reqfg6;
	}

	public String getReqfg7(){
		return this.reqfg7;
	}

	public String getReqfg8(){
		return this.reqfg8;
	}

	public String getReqfg9(){
		return this.reqfg9;
	}

	public String getReqfg10(){
		return this.reqfg10;
	}

	public String getQ_stat1(){
		return this.q_stat1;
	}

	public String getQ_stat2(){
		return this.q_stat2;
	}

	public String getQ_stat3(){
		return this.q_stat3;
	}

	public String getQ_stat4(){
		return this.q_stat4;
	}

	public String getQ_stat5(){
		return this.q_stat5;
	}

	public String getQ_stat6(){
		return this.q_stat6;
	}

	public String getQ_stat7(){
		return this.q_stat7;
	}

	public String getQ_stat8(){
		return this.q_stat8;
	}

	public String getQ_stat9(){
		return this.q_stat9;
	}

	public String getQ_stat10(){
		return this.q_stat10;
	}

	public String getQstbsyn1(){
		return this.qstbsyn1;
	}

	public String getQstbsyn2(){
		return this.qstbsyn2;
	}

	public String getQstbsyn3(){
		return this.qstbsyn3;
	}

	public String getQstbsyn4(){
		return this.qstbsyn4;
	}

	public String getQstbsyn5(){
		return this.qstbsyn5;
	}

	public String getQstbsyn6(){
		return this.qstbsyn6;
	}

	public String getQstbsyn7(){
		return this.qstbsyn7;
	}

	public String getQstbsyn8(){
		return this.qstbsyn8;
	}

	public String getQstbsyn9(){
		return this.qstbsyn9;
	}

	public String getQstbsyn10(){
		return this.qstbsyn10;
	}

	public String getAns01_bastat1(){
		return this.ans01_bastat1;
	}

	public String getAns01_bastat2(){
		return this.ans01_bastat2;
	}

	public String getAns01_bastat3(){
		return this.ans01_bastat3;
	}

	public String getAns01_bastat4(){
		return this.ans01_bastat4;
	}

	public String getAns01_bastat5(){
		return this.ans01_bastat5;
	}

	public String getAns01_bastat6(){
		return this.ans01_bastat6;
	}

	public String getAns01_bastat7(){
		return this.ans01_bastat7;
	}

	public String getAns02_bastat1(){
		return this.ans02_bastat1;
	}

	public String getAns02_bastat2(){
		return this.ans02_bastat2;
	}

	public String getAns02_bastat3(){
		return this.ans02_bastat3;
	}

	public String getAns02_bastat4(){
		return this.ans02_bastat4;
	}

	public String getAns02_bastat5(){
		return this.ans02_bastat5;
	}

	public String getAns02_bastat6(){
		return this.ans02_bastat6;
	}

	public String getAns02_bastat7(){
		return this.ans02_bastat7;
	}

	public String getAns03_bastat1(){
		return this.ans03_bastat1;
	}

	public String getAns03_bastat2(){
		return this.ans03_bastat2;
	}

	public String getAns03_bastat3(){
		return this.ans03_bastat3;
	}

	public String getAns03_bastat4(){
		return this.ans03_bastat4;
	}

	public String getAns03_bastat5(){
		return this.ans03_bastat5;
	}

	public String getAns03_bastat6(){
		return this.ans03_bastat6;
	}

	public String getAns03_bastat7(){
		return this.ans03_bastat7;
	}

	public String getAns04_bastat1(){
		return this.ans04_bastat1;
	}

	public String getAns04_bastat2(){
		return this.ans04_bastat2;
	}

	public String getAns04_bastat3(){
		return this.ans04_bastat3;
	}

	public String getAns04_bastat4(){
		return this.ans04_bastat4;
	}

	public String getAns04_bastat5(){
		return this.ans04_bastat5;
	}

	public String getAns04_bastat6(){
		return this.ans04_bastat6;
	}

	public String getAns04_bastat7(){
		return this.ans04_bastat7;
	}

	public String getAns05_bastat1(){
		return this.ans05_bastat1;
	}

	public String getAns05_bastat2(){
		return this.ans05_bastat2;
	}

	public String getAns05_bastat3(){
		return this.ans05_bastat3;
	}

	public String getAns05_bastat4(){
		return this.ans05_bastat4;
	}

	public String getAns05_bastat5(){
		return this.ans05_bastat5;
	}

	public String getAns05_bastat6(){
		return this.ans05_bastat6;
	}

	public String getAns05_bastat7(){
		return this.ans05_bastat7;
	}

	public String getAns06_bastat1(){
		return this.ans06_bastat1;
	}

	public String getAns06_bastat2(){
		return this.ans06_bastat2;
	}

	public String getAns06_bastat3(){
		return this.ans06_bastat3;
	}

	public String getAns06_bastat4(){
		return this.ans06_bastat4;
	}

	public String getAns06_bastat5(){
		return this.ans06_bastat5;
	}

	public String getAns06_bastat6(){
		return this.ans06_bastat6;
	}

	public String getAns06_bastat7(){
		return this.ans06_bastat7;
	}

	public String getAns07_bastat1(){
		return this.ans07_bastat1;
	}

	public String getAns07_bastat2(){
		return this.ans07_bastat2;
	}

	public String getAns07_bastat3(){
		return this.ans07_bastat3;
	}

	public String getAns07_bastat4(){
		return this.ans07_bastat4;
	}

	public String getAns07_bastat5(){
		return this.ans07_bastat5;
	}

	public String getAns07_bastat6(){
		return this.ans07_bastat6;
	}

	public String getAns07_bastat7(){
		return this.ans07_bastat7;
	}

	public String getAns08_bastat1(){
		return this.ans08_bastat1;
	}

	public String getAns08_bastat2(){
		return this.ans08_bastat2;
	}

	public String getAns08_bastat3(){
		return this.ans08_bastat3;
	}

	public String getAns08_bastat4(){
		return this.ans08_bastat4;
	}

	public String getAns08_bastat5(){
		return this.ans08_bastat5;
	}

	public String getAns08_bastat6(){
		return this.ans08_bastat6;
	}

	public String getAns08_bastat7(){
		return this.ans08_bastat7;
	}

	public String getAns09_bastat1(){
		return this.ans09_bastat1;
	}

	public String getAns09_bastat2(){
		return this.ans09_bastat2;
	}

	public String getAns09_bastat3(){
		return this.ans09_bastat3;
	}

	public String getAns09_bastat4(){
		return this.ans09_bastat4;
	}

	public String getAns09_bastat5(){
		return this.ans09_bastat5;
	}

	public String getAns09_bastat6(){
		return this.ans09_bastat6;
	}

	public String getAns09_bastat7(){
		return this.ans09_bastat7;
	}

	public String getAns10_bastat1(){
		return this.ans10_bastat1;
	}

	public String getAns10_bastat2(){
		return this.ans10_bastat2;
	}

	public String getAns10_bastat3(){
		return this.ans10_bastat3;
	}

	public String getAns10_bastat4(){
		return this.ans10_bastat4;
	}

	public String getAns10_bastat5(){
		return this.ans10_bastat5;
	}

	public String getAns10_bastat6(){
		return this.ans10_bastat6;
	}

	public String getAns10_bastat7(){
		return this.ans10_bastat7;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_MO_SVY( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_MO_SVYDM dm = (SS_A_MO_SVYDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.svyid);
		cstmt.setString(6, dm.svynm);
		cstmt.setString(7, dm.sttdt);
		cstmt.setString(8, dm.enddt);
		cstmt.setString(9, dm.qstsnum);
		cstmt.setString(10, dm.url);
		cstmt.setString(11, dm.s_stat);
		cstmt.setString(12, dm.giftfg);
		cstmt.setString(13, dm.memo);
		cstmt.setString(14, dm.camptype);
		cstmt.setString(15, dm.basicdt);
		cstmt.setString(16, dm.qstid1);
		cstmt.setString(17, dm.qstid2);
		cstmt.setString(18, dm.qstid3);
		cstmt.setString(19, dm.qstid4);
		cstmt.setString(20, dm.qstid5);
		cstmt.setString(21, dm.qstid6);
		cstmt.setString(22, dm.qstid7);
		cstmt.setString(23, dm.qstid8);
		cstmt.setString(24, dm.qstid9);
		cstmt.setString(25, dm.qstid10);
		cstmt.setString(26, dm.cont1);
		cstmt.setString(27, dm.cont2);
		cstmt.setString(28, dm.cont3);
		cstmt.setString(29, dm.cont4);
		cstmt.setString(30, dm.cont5);
		cstmt.setString(31, dm.cont6);
		cstmt.setString(32, dm.cont7);
		cstmt.setString(33, dm.cont8);
		cstmt.setString(34, dm.cont9);
		cstmt.setString(35, dm.cont10);
		cstmt.setString(36, dm.qtstype1);
		cstmt.setString(37, dm.qtstype2);
		cstmt.setString(38, dm.qtstype3);
		cstmt.setString(39, dm.qtstype4);
		cstmt.setString(40, dm.qtstype5);
		cstmt.setString(41, dm.qtstype6);
		cstmt.setString(42, dm.qtstype7);
		cstmt.setString(43, dm.qtstype8);
		cstmt.setString(44, dm.qtstype9);
		cstmt.setString(45, dm.qtstype10);
		cstmt.setString(46, dm.ans1_1);
		cstmt.setString(47, dm.ans1_2);
		cstmt.setString(48, dm.ans1_3);
		cstmt.setString(49, dm.ans1_4);
		cstmt.setString(50, dm.ans1_5);
		cstmt.setString(51, dm.ans1_6);
		cstmt.setString(52, dm.ans1_7);
		cstmt.setString(53, dm.ans2_1);
		cstmt.setString(54, dm.ans2_2);
		cstmt.setString(55, dm.ans2_3);
		cstmt.setString(56, dm.ans2_4);
		cstmt.setString(57, dm.ans2_5);
		cstmt.setString(58, dm.ans2_6);
		cstmt.setString(59, dm.ans2_7);
		cstmt.setString(60, dm.ans3_1);
		cstmt.setString(61, dm.ans3_2);
		cstmt.setString(62, dm.ans3_3);
		cstmt.setString(63, dm.ans3_4);
		cstmt.setString(64, dm.ans3_5);
		cstmt.setString(65, dm.ans3_6);
		cstmt.setString(66, dm.ans3_7);
		cstmt.setString(67, dm.ans4_1);
		cstmt.setString(68, dm.ans4_2);
		cstmt.setString(69, dm.ans4_3);
		cstmt.setString(70, dm.ans4_4);
		cstmt.setString(71, dm.ans4_5);
		cstmt.setString(72, dm.ans4_6);
		cstmt.setString(73, dm.ans4_7);
		cstmt.setString(74, dm.ans5_1);
		cstmt.setString(75, dm.ans5_2);
		cstmt.setString(76, dm.ans5_3);
		cstmt.setString(77, dm.ans5_4);
		cstmt.setString(78, dm.ans5_5);
		cstmt.setString(79, dm.ans5_6);
		cstmt.setString(80, dm.ans5_7);
		cstmt.setString(81, dm.ans6_1);
		cstmt.setString(82, dm.ans6_2);
		cstmt.setString(83, dm.ans6_3);
		cstmt.setString(84, dm.ans6_4);
		cstmt.setString(85, dm.ans6_5);
		cstmt.setString(86, dm.ans6_6);
		cstmt.setString(87, dm.ans6_7);
		cstmt.setString(88, dm.ans7_1);
		cstmt.setString(89, dm.ans7_2);
		cstmt.setString(90, dm.ans7_3);
		cstmt.setString(91, dm.ans7_4);
		cstmt.setString(92, dm.ans7_5);
		cstmt.setString(93, dm.ans7_6);
		cstmt.setString(94, dm.ans7_7);
		cstmt.setString(95, dm.ans8_1);
		cstmt.setString(96, dm.ans8_2);
		cstmt.setString(97, dm.ans8_3);
		cstmt.setString(98, dm.ans8_4);
		cstmt.setString(99, dm.ans8_5);
		cstmt.setString(100, dm.ans8_6);
		cstmt.setString(101, dm.ans8_7);
		cstmt.setString(102, dm.ans9_1);
		cstmt.setString(103, dm.ans9_2);
		cstmt.setString(104, dm.ans9_3);
		cstmt.setString(105, dm.ans9_4);
		cstmt.setString(106, dm.ans9_5);
		cstmt.setString(107, dm.ans9_6);
		cstmt.setString(108, dm.ans9_7);
		cstmt.setString(109, dm.ans10_1);
		cstmt.setString(110, dm.ans10_2);
		cstmt.setString(111, dm.ans10_3);
		cstmt.setString(112, dm.ans10_4);
		cstmt.setString(113, dm.ans10_5);
		cstmt.setString(114, dm.ans10_6);
		cstmt.setString(115, dm.ans10_7);
		cstmt.setString(116, dm.objcnt1);
		cstmt.setString(117, dm.objcnt2);
		cstmt.setString(118, dm.objcnt3);
		cstmt.setString(119, dm.objcnt4);
		cstmt.setString(120, dm.objcnt5);
		cstmt.setString(121, dm.objcnt6);
		cstmt.setString(122, dm.objcnt7);
		cstmt.setString(123, dm.objcnt8);
		cstmt.setString(124, dm.objcnt9);
		cstmt.setString(125, dm.objcnt10);
		cstmt.setString(126, dm.sbjlgth1);
		cstmt.setString(127, dm.sbjlgth2);
		cstmt.setString(128, dm.sbjlgth3);
		cstmt.setString(129, dm.sbjlgth4);
		cstmt.setString(130, dm.sbjlgth5);
		cstmt.setString(131, dm.sbjlgth6);
		cstmt.setString(132, dm.sbjlgth7);
		cstmt.setString(133, dm.sbjlgth8);
		cstmt.setString(134, dm.sbjlgth9);
		cstmt.setString(135, dm.sbjlgth10);
		cstmt.setString(136, dm.priority1);
		cstmt.setString(137, dm.priority2);
		cstmt.setString(138, dm.priority3);
		cstmt.setString(139, dm.priority4);
		cstmt.setString(140, dm.priority5);
		cstmt.setString(141, dm.priority6);
		cstmt.setString(142, dm.priority7);
		cstmt.setString(143, dm.priority8);
		cstmt.setString(144, dm.priority9);
		cstmt.setString(145, dm.priority10);
		cstmt.setString(146, dm.reqfg1);
		cstmt.setString(147, dm.reqfg2);
		cstmt.setString(148, dm.reqfg3);
		cstmt.setString(149, dm.reqfg4);
		cstmt.setString(150, dm.reqfg5);
		cstmt.setString(151, dm.reqfg6);
		cstmt.setString(152, dm.reqfg7);
		cstmt.setString(153, dm.reqfg8);
		cstmt.setString(154, dm.reqfg9);
		cstmt.setString(155, dm.reqfg10);
		cstmt.setString(156, dm.q_stat1);
		cstmt.setString(157, dm.q_stat2);
		cstmt.setString(158, dm.q_stat3);
		cstmt.setString(159, dm.q_stat4);
		cstmt.setString(160, dm.q_stat5);
		cstmt.setString(161, dm.q_stat6);
		cstmt.setString(162, dm.q_stat7);
		cstmt.setString(163, dm.q_stat8);
		cstmt.setString(164, dm.q_stat9);
		cstmt.setString(165, dm.q_stat10);
		cstmt.setString(166, dm.qstbsyn1);
		cstmt.setString(167, dm.qstbsyn2);
		cstmt.setString(168, dm.qstbsyn3);
		cstmt.setString(169, dm.qstbsyn4);
		cstmt.setString(170, dm.qstbsyn5);
		cstmt.setString(171, dm.qstbsyn6);
		cstmt.setString(172, dm.qstbsyn7);
		cstmt.setString(173, dm.qstbsyn8);
		cstmt.setString(174, dm.qstbsyn9);
		cstmt.setString(175, dm.qstbsyn10);
		cstmt.setString(176, dm.ans01_bastat1);
		cstmt.setString(177, dm.ans01_bastat2);
		cstmt.setString(178, dm.ans01_bastat3);
		cstmt.setString(179, dm.ans01_bastat4);
		cstmt.setString(180, dm.ans01_bastat5);
		cstmt.setString(181, dm.ans01_bastat6);
		cstmt.setString(182, dm.ans01_bastat7);
		cstmt.setString(183, dm.ans02_bastat1);
		cstmt.setString(184, dm.ans02_bastat2);
		cstmt.setString(185, dm.ans02_bastat3);
		cstmt.setString(186, dm.ans02_bastat4);
		cstmt.setString(187, dm.ans02_bastat5);
		cstmt.setString(188, dm.ans02_bastat6);
		cstmt.setString(189, dm.ans02_bastat7);
		cstmt.setString(190, dm.ans03_bastat1);
		cstmt.setString(191, dm.ans03_bastat2);
		cstmt.setString(192, dm.ans03_bastat3);
		cstmt.setString(193, dm.ans03_bastat4);
		cstmt.setString(194, dm.ans03_bastat5);
		cstmt.setString(195, dm.ans03_bastat6);
		cstmt.setString(196, dm.ans03_bastat7);
		cstmt.setString(197, dm.ans04_bastat1);
		cstmt.setString(198, dm.ans04_bastat2);
		cstmt.setString(199, dm.ans04_bastat3);
		cstmt.setString(200, dm.ans04_bastat4);
		cstmt.setString(201, dm.ans04_bastat5);
		cstmt.setString(202, dm.ans04_bastat6);
		cstmt.setString(203, dm.ans04_bastat7);
		cstmt.setString(204, dm.ans05_bastat1);
		cstmt.setString(205, dm.ans05_bastat2);
		cstmt.setString(206, dm.ans05_bastat3);
		cstmt.setString(207, dm.ans05_bastat4);
		cstmt.setString(208, dm.ans05_bastat5);
		cstmt.setString(209, dm.ans05_bastat6);
		cstmt.setString(210, dm.ans05_bastat7);
		cstmt.setString(211, dm.ans06_bastat1);
		cstmt.setString(212, dm.ans06_bastat2);
		cstmt.setString(213, dm.ans06_bastat3);
		cstmt.setString(214, dm.ans06_bastat4);
		cstmt.setString(215, dm.ans06_bastat5);
		cstmt.setString(216, dm.ans06_bastat6);
		cstmt.setString(217, dm.ans06_bastat7);
		cstmt.setString(218, dm.ans07_bastat1);
		cstmt.setString(219, dm.ans07_bastat2);
		cstmt.setString(220, dm.ans07_bastat3);
		cstmt.setString(221, dm.ans07_bastat4);
		cstmt.setString(222, dm.ans07_bastat5);
		cstmt.setString(223, dm.ans07_bastat6);
		cstmt.setString(224, dm.ans07_bastat7);
		cstmt.setString(225, dm.ans08_bastat1);
		cstmt.setString(226, dm.ans08_bastat2);
		cstmt.setString(227, dm.ans08_bastat3);
		cstmt.setString(228, dm.ans08_bastat4);
		cstmt.setString(229, dm.ans08_bastat5);
		cstmt.setString(230, dm.ans08_bastat6);
		cstmt.setString(231, dm.ans08_bastat7);
		cstmt.setString(232, dm.ans09_bastat1);
		cstmt.setString(233, dm.ans09_bastat2);
		cstmt.setString(234, dm.ans09_bastat3);
		cstmt.setString(235, dm.ans09_bastat4);
		cstmt.setString(236, dm.ans09_bastat5);
		cstmt.setString(237, dm.ans09_bastat6);
		cstmt.setString(238, dm.ans09_bastat7);
		cstmt.setString(239, dm.ans10_bastat1);
		cstmt.setString(240, dm.ans10_bastat2);
		cstmt.setString(241, dm.ans10_bastat3);
		cstmt.setString(242, dm.ans10_bastat4);
		cstmt.setString(243, dm.ans10_bastat5);
		cstmt.setString(244, dm.ans10_bastat6);
		cstmt.setString(245, dm.ans10_bastat7);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_A_MO_SVYDataSet();
	}



    public void print(){
        System.out.println("incmgpers = " + getIncmgpers());
        System.out.println("accflag = " + getAccflag());
        System.out.println("svyid = " + getSvyid());
        System.out.println("svynm = " + getSvynm());
        System.out.println("sttdt = " + getSttdt());
        System.out.println("enddt = " + getEnddt());
        System.out.println("qstsnum = " + getQstsnum());
        System.out.println("url = " + getUrl());
        System.out.println("s_stat = " + getS_stat());
        System.out.println("giftfg = " + getGiftfg());
        System.out.println("memo = " + getMemo());
        System.out.println("camptype = " + getCamptype());
        System.out.println("basicdt = " + getBasicdt());
        System.out.println("qstid1 = " + getQstid1());
        System.out.println("qstid2 = " + getQstid2());
        System.out.println("qstid3 = " + getQstid3());
        System.out.println("qstid4 = " + getQstid4());
        System.out.println("qstid5 = " + getQstid5());
        System.out.println("qstid6 = " + getQstid6());
        System.out.println("qstid7 = " + getQstid7());
        System.out.println("qstid8 = " + getQstid8());
        System.out.println("qstid9 = " + getQstid9());
        System.out.println("qstid10 = " + getQstid10());
        System.out.println("cont1 = " + getCont1());
        System.out.println("cont2 = " + getCont2());
        System.out.println("cont3 = " + getCont3());
        System.out.println("cont4 = " + getCont4());
        System.out.println("cont5 = " + getCont5());
        System.out.println("cont6 = " + getCont6());
        System.out.println("cont7 = " + getCont7());
        System.out.println("cont8 = " + getCont8());
        System.out.println("cont9 = " + getCont9());
        System.out.println("cont10 = " + getCont10());
        System.out.println("qtstype1 = " + getQtstype1());
        System.out.println("qtstype2 = " + getQtstype2());
        System.out.println("qtstype3 = " + getQtstype3());
        System.out.println("qtstype4 = " + getQtstype4());
        System.out.println("qtstype5 = " + getQtstype5());
        System.out.println("qtstype6 = " + getQtstype6());
        System.out.println("qtstype7 = " + getQtstype7());
        System.out.println("qtstype8 = " + getQtstype8());
        System.out.println("qtstype9 = " + getQtstype9());
        System.out.println("qtstype10 = " + getQtstype10());
        System.out.println("ans1_1 = " + getAns1_1());
        System.out.println("ans1_2 = " + getAns1_2());
        System.out.println("ans1_3 = " + getAns1_3());
        System.out.println("ans1_4 = " + getAns1_4());
        System.out.println("ans1_5 = " + getAns1_5());
        System.out.println("ans1_6 = " + getAns1_6());
        System.out.println("ans1_7 = " + getAns1_7());
        System.out.println("ans2_1 = " + getAns2_1());
        System.out.println("ans2_2 = " + getAns2_2());
        System.out.println("ans2_3 = " + getAns2_3());
        System.out.println("ans2_4 = " + getAns2_4());
        System.out.println("ans2_5 = " + getAns2_5());
        System.out.println("ans2_6 = " + getAns2_6());
        System.out.println("ans2_7 = " + getAns2_7());
        System.out.println("ans3_1 = " + getAns3_1());
        System.out.println("ans3_2 = " + getAns3_2());
        System.out.println("ans3_3 = " + getAns3_3());
        System.out.println("ans3_4 = " + getAns3_4());
        System.out.println("ans3_5 = " + getAns3_5());
        System.out.println("ans3_6 = " + getAns3_6());
        System.out.println("ans3_7 = " + getAns3_7());
        System.out.println("ans4_1 = " + getAns4_1());
        System.out.println("ans4_2 = " + getAns4_2());
        System.out.println("ans4_3 = " + getAns4_3());
        System.out.println("ans4_4 = " + getAns4_4());
        System.out.println("ans4_5 = " + getAns4_5());
        System.out.println("ans4_6 = " + getAns4_6());
        System.out.println("ans4_7 = " + getAns4_7());
        System.out.println("ans5_1 = " + getAns5_1());
        System.out.println("ans5_2 = " + getAns5_2());
        System.out.println("ans5_3 = " + getAns5_3());
        System.out.println("ans5_4 = " + getAns5_4());
        System.out.println("ans5_5 = " + getAns5_5());
        System.out.println("ans5_6 = " + getAns5_6());
        System.out.println("ans5_7 = " + getAns5_7());
        System.out.println("ans6_1 = " + getAns6_1());
        System.out.println("ans6_2 = " + getAns6_2());
        System.out.println("ans6_3 = " + getAns6_3());
        System.out.println("ans6_4 = " + getAns6_4());
        System.out.println("ans6_5 = " + getAns6_5());
        System.out.println("ans6_6 = " + getAns6_6());
        System.out.println("ans6_7 = " + getAns6_7());
        System.out.println("ans7_1 = " + getAns7_1());
        System.out.println("ans7_2 = " + getAns7_2());
        System.out.println("ans7_3 = " + getAns7_3());
        System.out.println("ans7_4 = " + getAns7_4());
        System.out.println("ans7_5 = " + getAns7_5());
        System.out.println("ans7_6 = " + getAns7_6());
        System.out.println("ans7_7 = " + getAns7_7());
        System.out.println("ans8_1 = " + getAns8_1());
        System.out.println("ans8_2 = " + getAns8_2());
        System.out.println("ans8_3 = " + getAns8_3());
        System.out.println("ans8_4 = " + getAns8_4());
        System.out.println("ans8_5 = " + getAns8_5());
        System.out.println("ans8_6 = " + getAns8_6());
        System.out.println("ans8_7 = " + getAns8_7());
        System.out.println("ans9_1 = " + getAns9_1());
        System.out.println("ans9_2 = " + getAns9_2());
        System.out.println("ans9_3 = " + getAns9_3());
        System.out.println("ans9_4 = " + getAns9_4());
        System.out.println("ans9_5 = " + getAns9_5());
        System.out.println("ans9_6 = " + getAns9_6());
        System.out.println("ans9_7 = " + getAns9_7());
        System.out.println("ans10_1 = " + getAns10_1());
        System.out.println("ans10_2 = " + getAns10_2());
        System.out.println("ans10_3 = " + getAns10_3());
        System.out.println("ans10_4 = " + getAns10_4());
        System.out.println("ans10_5 = " + getAns10_5());
        System.out.println("ans10_6 = " + getAns10_6());
        System.out.println("ans10_7 = " + getAns10_7());
        System.out.println("objcnt1 = " + getObjcnt1());
        System.out.println("objcnt2 = " + getObjcnt2());
        System.out.println("objcnt3 = " + getObjcnt3());
        System.out.println("objcnt4 = " + getObjcnt4());
        System.out.println("objcnt5 = " + getObjcnt5());
        System.out.println("objcnt6 = " + getObjcnt6());
        System.out.println("objcnt7 = " + getObjcnt7());
        System.out.println("objcnt8 = " + getObjcnt8());
        System.out.println("objcnt9 = " + getObjcnt9());
        System.out.println("objcnt10 = " + getObjcnt10());
        System.out.println("sbjlgth1 = " + getSbjlgth1());
        System.out.println("sbjlgth2 = " + getSbjlgth2());
        System.out.println("sbjlgth3 = " + getSbjlgth3());
        System.out.println("sbjlgth4 = " + getSbjlgth4());
        System.out.println("sbjlgth5 = " + getSbjlgth5());
        System.out.println("sbjlgth6 = " + getSbjlgth6());
        System.out.println("sbjlgth7 = " + getSbjlgth7());
        System.out.println("sbjlgth8 = " + getSbjlgth8());
        System.out.println("sbjlgth9 = " + getSbjlgth9());
        System.out.println("sbjlgth10 = " + getSbjlgth10());
        System.out.println("priority1 = " + getPriority1());
        System.out.println("priority2 = " + getPriority2());
        System.out.println("priority3 = " + getPriority3());
        System.out.println("priority4 = " + getPriority4());
        System.out.println("priority5 = " + getPriority5());
        System.out.println("priority6 = " + getPriority6());
        System.out.println("priority7 = " + getPriority7());
        System.out.println("priority8 = " + getPriority8());
        System.out.println("priority9 = " + getPriority9());
        System.out.println("priority10 = " + getPriority10());
        System.out.println("reqfg1 = " + getReqfg1());
        System.out.println("reqfg2 = " + getReqfg2());
        System.out.println("reqfg3 = " + getReqfg3());
        System.out.println("reqfg4 = " + getReqfg4());
        System.out.println("reqfg5 = " + getReqfg5());
        System.out.println("reqfg6 = " + getReqfg6());
        System.out.println("reqfg7 = " + getReqfg7());
        System.out.println("reqfg8 = " + getReqfg8());
        System.out.println("reqfg9 = " + getReqfg9());
        System.out.println("reqfg10 = " + getReqfg10());
        System.out.println("q_stat1 = " + getQ_stat1());
        System.out.println("q_stat2 = " + getQ_stat2());
        System.out.println("q_stat3 = " + getQ_stat3());
        System.out.println("q_stat4 = " + getQ_stat4());
        System.out.println("q_stat5 = " + getQ_stat5());
        System.out.println("q_stat6 = " + getQ_stat6());
        System.out.println("q_stat7 = " + getQ_stat7());
        System.out.println("q_stat8 = " + getQ_stat8());
        System.out.println("q_stat9 = " + getQ_stat9());
        System.out.println("q_stat10 = " + getQ_stat10());
        System.out.println("qstbsyn1 = " + getQstbsyn1());
        System.out.println("qstbsyn2 = " + getQstbsyn2());
        System.out.println("qstbsyn3 = " + getQstbsyn3());
        System.out.println("qstbsyn4 = " + getQstbsyn4());
        System.out.println("qstbsyn5 = " + getQstbsyn5());
        System.out.println("qstbsyn6 = " + getQstbsyn6());
        System.out.println("qstbsyn7 = " + getQstbsyn7());
        System.out.println("qstbsyn8 = " + getQstbsyn8());
        System.out.println("qstbsyn9 = " + getQstbsyn9());
        System.out.println("qstbsyn10 = " + getQstbsyn10());
        System.out.println("ans01_bastat1 = " + getAns01_bastat1());
        System.out.println("ans01_bastat2 = " + getAns01_bastat2());
        System.out.println("ans01_bastat3 = " + getAns01_bastat3());
        System.out.println("ans01_bastat4 = " + getAns01_bastat4());
        System.out.println("ans01_bastat5 = " + getAns01_bastat5());
        System.out.println("ans01_bastat6 = " + getAns01_bastat6());
        System.out.println("ans01_bastat7 = " + getAns01_bastat7());
        System.out.println("ans02_bastat1 = " + getAns02_bastat1());
        System.out.println("ans02_bastat2 = " + getAns02_bastat2());
        System.out.println("ans02_bastat3 = " + getAns02_bastat3());
        System.out.println("ans02_bastat4 = " + getAns02_bastat4());
        System.out.println("ans02_bastat5 = " + getAns02_bastat5());
        System.out.println("ans02_bastat6 = " + getAns02_bastat6());
        System.out.println("ans02_bastat7 = " + getAns02_bastat7());
        System.out.println("ans03_bastat1 = " + getAns03_bastat1());
        System.out.println("ans03_bastat2 = " + getAns03_bastat2());
        System.out.println("ans03_bastat3 = " + getAns03_bastat3());
        System.out.println("ans03_bastat4 = " + getAns03_bastat4());
        System.out.println("ans03_bastat5 = " + getAns03_bastat5());
        System.out.println("ans03_bastat6 = " + getAns03_bastat6());
        System.out.println("ans03_bastat7 = " + getAns03_bastat7());
        System.out.println("ans04_bastat1 = " + getAns04_bastat1());
        System.out.println("ans04_bastat2 = " + getAns04_bastat2());
        System.out.println("ans04_bastat3 = " + getAns04_bastat3());
        System.out.println("ans04_bastat4 = " + getAns04_bastat4());
        System.out.println("ans04_bastat5 = " + getAns04_bastat5());
        System.out.println("ans04_bastat6 = " + getAns04_bastat6());
        System.out.println("ans04_bastat7 = " + getAns04_bastat7());
        System.out.println("ans05_bastat1 = " + getAns05_bastat1());
        System.out.println("ans05_bastat2 = " + getAns05_bastat2());
        System.out.println("ans05_bastat3 = " + getAns05_bastat3());
        System.out.println("ans05_bastat4 = " + getAns05_bastat4());
        System.out.println("ans05_bastat5 = " + getAns05_bastat5());
        System.out.println("ans05_bastat6 = " + getAns05_bastat6());
        System.out.println("ans05_bastat7 = " + getAns05_bastat7());
        System.out.println("ans06_bastat1 = " + getAns06_bastat1());
        System.out.println("ans06_bastat2 = " + getAns06_bastat2());
        System.out.println("ans06_bastat3 = " + getAns06_bastat3());
        System.out.println("ans06_bastat4 = " + getAns06_bastat4());
        System.out.println("ans06_bastat5 = " + getAns06_bastat5());
        System.out.println("ans06_bastat6 = " + getAns06_bastat6());
        System.out.println("ans06_bastat7 = " + getAns06_bastat7());
        System.out.println("ans07_bastat1 = " + getAns07_bastat1());
        System.out.println("ans07_bastat2 = " + getAns07_bastat2());
        System.out.println("ans07_bastat3 = " + getAns07_bastat3());
        System.out.println("ans07_bastat4 = " + getAns07_bastat4());
        System.out.println("ans07_bastat5 = " + getAns07_bastat5());
        System.out.println("ans07_bastat6 = " + getAns07_bastat6());
        System.out.println("ans07_bastat7 = " + getAns07_bastat7());
        System.out.println("ans08_bastat1 = " + getAns08_bastat1());
        System.out.println("ans08_bastat2 = " + getAns08_bastat2());
        System.out.println("ans08_bastat3 = " + getAns08_bastat3());
        System.out.println("ans08_bastat4 = " + getAns08_bastat4());
        System.out.println("ans08_bastat5 = " + getAns08_bastat5());
        System.out.println("ans08_bastat6 = " + getAns08_bastat6());
        System.out.println("ans08_bastat7 = " + getAns08_bastat7());
        System.out.println("ans09_bastat1 = " + getAns09_bastat1());
        System.out.println("ans09_bastat2 = " + getAns09_bastat2());
        System.out.println("ans09_bastat3 = " + getAns09_bastat3());
        System.out.println("ans09_bastat4 = " + getAns09_bastat4());
        System.out.println("ans09_bastat5 = " + getAns09_bastat5());
        System.out.println("ans09_bastat6 = " + getAns09_bastat6());
        System.out.println("ans09_bastat7 = " + getAns09_bastat7());
        System.out.println("ans10_bastat1 = " + getAns10_bastat1());
        System.out.println("ans10_bastat2 = " + getAns10_bastat2());
        System.out.println("ans10_bastat3 = " + getAns10_bastat3());
        System.out.println("ans10_bastat4 = " + getAns10_bastat4());
        System.out.println("ans10_bastat5 = " + getAns10_bastat5());
        System.out.println("ans10_bastat6 = " + getAns10_bastat6());
        System.out.println("ans10_bastat7 = " + getAns10_bastat7());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String svyid = req.getParameter("svyid");
if( svyid == null){
	System.out.println(this.toString+" : svyid is null" );
}else{
	System.out.println(this.toString+" : svyid is "+svyid );
}
String svynm = req.getParameter("svynm");
if( svynm == null){
	System.out.println(this.toString+" : svynm is null" );
}else{
	System.out.println(this.toString+" : svynm is "+svynm );
}
String sttdt = req.getParameter("sttdt");
if( sttdt == null){
	System.out.println(this.toString+" : sttdt is null" );
}else{
	System.out.println(this.toString+" : sttdt is "+sttdt );
}
String enddt = req.getParameter("enddt");
if( enddt == null){
	System.out.println(this.toString+" : enddt is null" );
}else{
	System.out.println(this.toString+" : enddt is "+enddt );
}
String qstsnum = req.getParameter("qstsnum");
if( qstsnum == null){
	System.out.println(this.toString+" : qstsnum is null" );
}else{
	System.out.println(this.toString+" : qstsnum is "+qstsnum );
}
String url = req.getParameter("url");
if( url == null){
	System.out.println(this.toString+" : url is null" );
}else{
	System.out.println(this.toString+" : url is "+url );
}
String s_stat = req.getParameter("s_stat");
if( s_stat == null){
	System.out.println(this.toString+" : s_stat is null" );
}else{
	System.out.println(this.toString+" : s_stat is "+s_stat );
}
String giftfg = req.getParameter("giftfg");
if( giftfg == null){
	System.out.println(this.toString+" : giftfg is null" );
}else{
	System.out.println(this.toString+" : giftfg is "+giftfg );
}
String memo = req.getParameter("memo");
if( memo == null){
	System.out.println(this.toString+" : memo is null" );
}else{
	System.out.println(this.toString+" : memo is "+memo );
}
String camptype = req.getParameter("camptype");
if( camptype == null){
	System.out.println(this.toString+" : camptype is null" );
}else{
	System.out.println(this.toString+" : camptype is "+camptype );
}
String basicdt = req.getParameter("basicdt");
if( basicdt == null){
	System.out.println(this.toString+" : basicdt is null" );
}else{
	System.out.println(this.toString+" : basicdt is "+basicdt );
}
String qstid1 = req.getParameter("qstid1");
if( qstid1 == null){
	System.out.println(this.toString+" : qstid1 is null" );
}else{
	System.out.println(this.toString+" : qstid1 is "+qstid1 );
}
String qstid2 = req.getParameter("qstid2");
if( qstid2 == null){
	System.out.println(this.toString+" : qstid2 is null" );
}else{
	System.out.println(this.toString+" : qstid2 is "+qstid2 );
}
String qstid3 = req.getParameter("qstid3");
if( qstid3 == null){
	System.out.println(this.toString+" : qstid3 is null" );
}else{
	System.out.println(this.toString+" : qstid3 is "+qstid3 );
}
String qstid4 = req.getParameter("qstid4");
if( qstid4 == null){
	System.out.println(this.toString+" : qstid4 is null" );
}else{
	System.out.println(this.toString+" : qstid4 is "+qstid4 );
}
String qstid5 = req.getParameter("qstid5");
if( qstid5 == null){
	System.out.println(this.toString+" : qstid5 is null" );
}else{
	System.out.println(this.toString+" : qstid5 is "+qstid5 );
}
String qstid6 = req.getParameter("qstid6");
if( qstid6 == null){
	System.out.println(this.toString+" : qstid6 is null" );
}else{
	System.out.println(this.toString+" : qstid6 is "+qstid6 );
}
String qstid7 = req.getParameter("qstid7");
if( qstid7 == null){
	System.out.println(this.toString+" : qstid7 is null" );
}else{
	System.out.println(this.toString+" : qstid7 is "+qstid7 );
}
String qstid8 = req.getParameter("qstid8");
if( qstid8 == null){
	System.out.println(this.toString+" : qstid8 is null" );
}else{
	System.out.println(this.toString+" : qstid8 is "+qstid8 );
}
String qstid9 = req.getParameter("qstid9");
if( qstid9 == null){
	System.out.println(this.toString+" : qstid9 is null" );
}else{
	System.out.println(this.toString+" : qstid9 is "+qstid9 );
}
String qstid10 = req.getParameter("qstid10");
if( qstid10 == null){
	System.out.println(this.toString+" : qstid10 is null" );
}else{
	System.out.println(this.toString+" : qstid10 is "+qstid10 );
}
String cont1 = req.getParameter("cont1");
if( cont1 == null){
	System.out.println(this.toString+" : cont1 is null" );
}else{
	System.out.println(this.toString+" : cont1 is "+cont1 );
}
String cont2 = req.getParameter("cont2");
if( cont2 == null){
	System.out.println(this.toString+" : cont2 is null" );
}else{
	System.out.println(this.toString+" : cont2 is "+cont2 );
}
String cont3 = req.getParameter("cont3");
if( cont3 == null){
	System.out.println(this.toString+" : cont3 is null" );
}else{
	System.out.println(this.toString+" : cont3 is "+cont3 );
}
String cont4 = req.getParameter("cont4");
if( cont4 == null){
	System.out.println(this.toString+" : cont4 is null" );
}else{
	System.out.println(this.toString+" : cont4 is "+cont4 );
}
String cont5 = req.getParameter("cont5");
if( cont5 == null){
	System.out.println(this.toString+" : cont5 is null" );
}else{
	System.out.println(this.toString+" : cont5 is "+cont5 );
}
String cont6 = req.getParameter("cont6");
if( cont6 == null){
	System.out.println(this.toString+" : cont6 is null" );
}else{
	System.out.println(this.toString+" : cont6 is "+cont6 );
}
String cont7 = req.getParameter("cont7");
if( cont7 == null){
	System.out.println(this.toString+" : cont7 is null" );
}else{
	System.out.println(this.toString+" : cont7 is "+cont7 );
}
String cont8 = req.getParameter("cont8");
if( cont8 == null){
	System.out.println(this.toString+" : cont8 is null" );
}else{
	System.out.println(this.toString+" : cont8 is "+cont8 );
}
String cont9 = req.getParameter("cont9");
if( cont9 == null){
	System.out.println(this.toString+" : cont9 is null" );
}else{
	System.out.println(this.toString+" : cont9 is "+cont9 );
}
String cont10 = req.getParameter("cont10");
if( cont10 == null){
	System.out.println(this.toString+" : cont10 is null" );
}else{
	System.out.println(this.toString+" : cont10 is "+cont10 );
}
String qtstype1 = req.getParameter("qtstype1");
if( qtstype1 == null){
	System.out.println(this.toString+" : qtstype1 is null" );
}else{
	System.out.println(this.toString+" : qtstype1 is "+qtstype1 );
}
String qtstype2 = req.getParameter("qtstype2");
if( qtstype2 == null){
	System.out.println(this.toString+" : qtstype2 is null" );
}else{
	System.out.println(this.toString+" : qtstype2 is "+qtstype2 );
}
String qtstype3 = req.getParameter("qtstype3");
if( qtstype3 == null){
	System.out.println(this.toString+" : qtstype3 is null" );
}else{
	System.out.println(this.toString+" : qtstype3 is "+qtstype3 );
}
String qtstype4 = req.getParameter("qtstype4");
if( qtstype4 == null){
	System.out.println(this.toString+" : qtstype4 is null" );
}else{
	System.out.println(this.toString+" : qtstype4 is "+qtstype4 );
}
String qtstype5 = req.getParameter("qtstype5");
if( qtstype5 == null){
	System.out.println(this.toString+" : qtstype5 is null" );
}else{
	System.out.println(this.toString+" : qtstype5 is "+qtstype5 );
}
String qtstype6 = req.getParameter("qtstype6");
if( qtstype6 == null){
	System.out.println(this.toString+" : qtstype6 is null" );
}else{
	System.out.println(this.toString+" : qtstype6 is "+qtstype6 );
}
String qtstype7 = req.getParameter("qtstype7");
if( qtstype7 == null){
	System.out.println(this.toString+" : qtstype7 is null" );
}else{
	System.out.println(this.toString+" : qtstype7 is "+qtstype7 );
}
String qtstype8 = req.getParameter("qtstype8");
if( qtstype8 == null){
	System.out.println(this.toString+" : qtstype8 is null" );
}else{
	System.out.println(this.toString+" : qtstype8 is "+qtstype8 );
}
String qtstype9 = req.getParameter("qtstype9");
if( qtstype9 == null){
	System.out.println(this.toString+" : qtstype9 is null" );
}else{
	System.out.println(this.toString+" : qtstype9 is "+qtstype9 );
}
String qtstype10 = req.getParameter("qtstype10");
if( qtstype10 == null){
	System.out.println(this.toString+" : qtstype10 is null" );
}else{
	System.out.println(this.toString+" : qtstype10 is "+qtstype10 );
}
String ans1_1 = req.getParameter("ans1_1");
if( ans1_1 == null){
	System.out.println(this.toString+" : ans1_1 is null" );
}else{
	System.out.println(this.toString+" : ans1_1 is "+ans1_1 );
}
String ans1_2 = req.getParameter("ans1_2");
if( ans1_2 == null){
	System.out.println(this.toString+" : ans1_2 is null" );
}else{
	System.out.println(this.toString+" : ans1_2 is "+ans1_2 );
}
String ans1_3 = req.getParameter("ans1_3");
if( ans1_3 == null){
	System.out.println(this.toString+" : ans1_3 is null" );
}else{
	System.out.println(this.toString+" : ans1_3 is "+ans1_3 );
}
String ans1_4 = req.getParameter("ans1_4");
if( ans1_4 == null){
	System.out.println(this.toString+" : ans1_4 is null" );
}else{
	System.out.println(this.toString+" : ans1_4 is "+ans1_4 );
}
String ans1_5 = req.getParameter("ans1_5");
if( ans1_5 == null){
	System.out.println(this.toString+" : ans1_5 is null" );
}else{
	System.out.println(this.toString+" : ans1_5 is "+ans1_5 );
}
String ans1_6 = req.getParameter("ans1_6");
if( ans1_6 == null){
	System.out.println(this.toString+" : ans1_6 is null" );
}else{
	System.out.println(this.toString+" : ans1_6 is "+ans1_6 );
}
String ans1_7 = req.getParameter("ans1_7");
if( ans1_7 == null){
	System.out.println(this.toString+" : ans1_7 is null" );
}else{
	System.out.println(this.toString+" : ans1_7 is "+ans1_7 );
}
String ans2_1 = req.getParameter("ans2_1");
if( ans2_1 == null){
	System.out.println(this.toString+" : ans2_1 is null" );
}else{
	System.out.println(this.toString+" : ans2_1 is "+ans2_1 );
}
String ans2_2 = req.getParameter("ans2_2");
if( ans2_2 == null){
	System.out.println(this.toString+" : ans2_2 is null" );
}else{
	System.out.println(this.toString+" : ans2_2 is "+ans2_2 );
}
String ans2_3 = req.getParameter("ans2_3");
if( ans2_3 == null){
	System.out.println(this.toString+" : ans2_3 is null" );
}else{
	System.out.println(this.toString+" : ans2_3 is "+ans2_3 );
}
String ans2_4 = req.getParameter("ans2_4");
if( ans2_4 == null){
	System.out.println(this.toString+" : ans2_4 is null" );
}else{
	System.out.println(this.toString+" : ans2_4 is "+ans2_4 );
}
String ans2_5 = req.getParameter("ans2_5");
if( ans2_5 == null){
	System.out.println(this.toString+" : ans2_5 is null" );
}else{
	System.out.println(this.toString+" : ans2_5 is "+ans2_5 );
}
String ans2_6 = req.getParameter("ans2_6");
if( ans2_6 == null){
	System.out.println(this.toString+" : ans2_6 is null" );
}else{
	System.out.println(this.toString+" : ans2_6 is "+ans2_6 );
}
String ans2_7 = req.getParameter("ans2_7");
if( ans2_7 == null){
	System.out.println(this.toString+" : ans2_7 is null" );
}else{
	System.out.println(this.toString+" : ans2_7 is "+ans2_7 );
}
String ans3_1 = req.getParameter("ans3_1");
if( ans3_1 == null){
	System.out.println(this.toString+" : ans3_1 is null" );
}else{
	System.out.println(this.toString+" : ans3_1 is "+ans3_1 );
}
String ans3_2 = req.getParameter("ans3_2");
if( ans3_2 == null){
	System.out.println(this.toString+" : ans3_2 is null" );
}else{
	System.out.println(this.toString+" : ans3_2 is "+ans3_2 );
}
String ans3_3 = req.getParameter("ans3_3");
if( ans3_3 == null){
	System.out.println(this.toString+" : ans3_3 is null" );
}else{
	System.out.println(this.toString+" : ans3_3 is "+ans3_3 );
}
String ans3_4 = req.getParameter("ans3_4");
if( ans3_4 == null){
	System.out.println(this.toString+" : ans3_4 is null" );
}else{
	System.out.println(this.toString+" : ans3_4 is "+ans3_4 );
}
String ans3_5 = req.getParameter("ans3_5");
if( ans3_5 == null){
	System.out.println(this.toString+" : ans3_5 is null" );
}else{
	System.out.println(this.toString+" : ans3_5 is "+ans3_5 );
}
String ans3_6 = req.getParameter("ans3_6");
if( ans3_6 == null){
	System.out.println(this.toString+" : ans3_6 is null" );
}else{
	System.out.println(this.toString+" : ans3_6 is "+ans3_6 );
}
String ans3_7 = req.getParameter("ans3_7");
if( ans3_7 == null){
	System.out.println(this.toString+" : ans3_7 is null" );
}else{
	System.out.println(this.toString+" : ans3_7 is "+ans3_7 );
}
String ans4_1 = req.getParameter("ans4_1");
if( ans4_1 == null){
	System.out.println(this.toString+" : ans4_1 is null" );
}else{
	System.out.println(this.toString+" : ans4_1 is "+ans4_1 );
}
String ans4_2 = req.getParameter("ans4_2");
if( ans4_2 == null){
	System.out.println(this.toString+" : ans4_2 is null" );
}else{
	System.out.println(this.toString+" : ans4_2 is "+ans4_2 );
}
String ans4_3 = req.getParameter("ans4_3");
if( ans4_3 == null){
	System.out.println(this.toString+" : ans4_3 is null" );
}else{
	System.out.println(this.toString+" : ans4_3 is "+ans4_3 );
}
String ans4_4 = req.getParameter("ans4_4");
if( ans4_4 == null){
	System.out.println(this.toString+" : ans4_4 is null" );
}else{
	System.out.println(this.toString+" : ans4_4 is "+ans4_4 );
}
String ans4_5 = req.getParameter("ans4_5");
if( ans4_5 == null){
	System.out.println(this.toString+" : ans4_5 is null" );
}else{
	System.out.println(this.toString+" : ans4_5 is "+ans4_5 );
}
String ans4_6 = req.getParameter("ans4_6");
if( ans4_6 == null){
	System.out.println(this.toString+" : ans4_6 is null" );
}else{
	System.out.println(this.toString+" : ans4_6 is "+ans4_6 );
}
String ans4_7 = req.getParameter("ans4_7");
if( ans4_7 == null){
	System.out.println(this.toString+" : ans4_7 is null" );
}else{
	System.out.println(this.toString+" : ans4_7 is "+ans4_7 );
}
String ans5_1 = req.getParameter("ans5_1");
if( ans5_1 == null){
	System.out.println(this.toString+" : ans5_1 is null" );
}else{
	System.out.println(this.toString+" : ans5_1 is "+ans5_1 );
}
String ans5_2 = req.getParameter("ans5_2");
if( ans5_2 == null){
	System.out.println(this.toString+" : ans5_2 is null" );
}else{
	System.out.println(this.toString+" : ans5_2 is "+ans5_2 );
}
String ans5_3 = req.getParameter("ans5_3");
if( ans5_3 == null){
	System.out.println(this.toString+" : ans5_3 is null" );
}else{
	System.out.println(this.toString+" : ans5_3 is "+ans5_3 );
}
String ans5_4 = req.getParameter("ans5_4");
if( ans5_4 == null){
	System.out.println(this.toString+" : ans5_4 is null" );
}else{
	System.out.println(this.toString+" : ans5_4 is "+ans5_4 );
}
String ans5_5 = req.getParameter("ans5_5");
if( ans5_5 == null){
	System.out.println(this.toString+" : ans5_5 is null" );
}else{
	System.out.println(this.toString+" : ans5_5 is "+ans5_5 );
}
String ans5_6 = req.getParameter("ans5_6");
if( ans5_6 == null){
	System.out.println(this.toString+" : ans5_6 is null" );
}else{
	System.out.println(this.toString+" : ans5_6 is "+ans5_6 );
}
String ans5_7 = req.getParameter("ans5_7");
if( ans5_7 == null){
	System.out.println(this.toString+" : ans5_7 is null" );
}else{
	System.out.println(this.toString+" : ans5_7 is "+ans5_7 );
}
String ans6_1 = req.getParameter("ans6_1");
if( ans6_1 == null){
	System.out.println(this.toString+" : ans6_1 is null" );
}else{
	System.out.println(this.toString+" : ans6_1 is "+ans6_1 );
}
String ans6_2 = req.getParameter("ans6_2");
if( ans6_2 == null){
	System.out.println(this.toString+" : ans6_2 is null" );
}else{
	System.out.println(this.toString+" : ans6_2 is "+ans6_2 );
}
String ans6_3 = req.getParameter("ans6_3");
if( ans6_3 == null){
	System.out.println(this.toString+" : ans6_3 is null" );
}else{
	System.out.println(this.toString+" : ans6_3 is "+ans6_3 );
}
String ans6_4 = req.getParameter("ans6_4");
if( ans6_4 == null){
	System.out.println(this.toString+" : ans6_4 is null" );
}else{
	System.out.println(this.toString+" : ans6_4 is "+ans6_4 );
}
String ans6_5 = req.getParameter("ans6_5");
if( ans6_5 == null){
	System.out.println(this.toString+" : ans6_5 is null" );
}else{
	System.out.println(this.toString+" : ans6_5 is "+ans6_5 );
}
String ans6_6 = req.getParameter("ans6_6");
if( ans6_6 == null){
	System.out.println(this.toString+" : ans6_6 is null" );
}else{
	System.out.println(this.toString+" : ans6_6 is "+ans6_6 );
}
String ans6_7 = req.getParameter("ans6_7");
if( ans6_7 == null){
	System.out.println(this.toString+" : ans6_7 is null" );
}else{
	System.out.println(this.toString+" : ans6_7 is "+ans6_7 );
}
String ans7_1 = req.getParameter("ans7_1");
if( ans7_1 == null){
	System.out.println(this.toString+" : ans7_1 is null" );
}else{
	System.out.println(this.toString+" : ans7_1 is "+ans7_1 );
}
String ans7_2 = req.getParameter("ans7_2");
if( ans7_2 == null){
	System.out.println(this.toString+" : ans7_2 is null" );
}else{
	System.out.println(this.toString+" : ans7_2 is "+ans7_2 );
}
String ans7_3 = req.getParameter("ans7_3");
if( ans7_3 == null){
	System.out.println(this.toString+" : ans7_3 is null" );
}else{
	System.out.println(this.toString+" : ans7_3 is "+ans7_3 );
}
String ans7_4 = req.getParameter("ans7_4");
if( ans7_4 == null){
	System.out.println(this.toString+" : ans7_4 is null" );
}else{
	System.out.println(this.toString+" : ans7_4 is "+ans7_4 );
}
String ans7_5 = req.getParameter("ans7_5");
if( ans7_5 == null){
	System.out.println(this.toString+" : ans7_5 is null" );
}else{
	System.out.println(this.toString+" : ans7_5 is "+ans7_5 );
}
String ans7_6 = req.getParameter("ans7_6");
if( ans7_6 == null){
	System.out.println(this.toString+" : ans7_6 is null" );
}else{
	System.out.println(this.toString+" : ans7_6 is "+ans7_6 );
}
String ans7_7 = req.getParameter("ans7_7");
if( ans7_7 == null){
	System.out.println(this.toString+" : ans7_7 is null" );
}else{
	System.out.println(this.toString+" : ans7_7 is "+ans7_7 );
}
String ans8_1 = req.getParameter("ans8_1");
if( ans8_1 == null){
	System.out.println(this.toString+" : ans8_1 is null" );
}else{
	System.out.println(this.toString+" : ans8_1 is "+ans8_1 );
}
String ans8_2 = req.getParameter("ans8_2");
if( ans8_2 == null){
	System.out.println(this.toString+" : ans8_2 is null" );
}else{
	System.out.println(this.toString+" : ans8_2 is "+ans8_2 );
}
String ans8_3 = req.getParameter("ans8_3");
if( ans8_3 == null){
	System.out.println(this.toString+" : ans8_3 is null" );
}else{
	System.out.println(this.toString+" : ans8_3 is "+ans8_3 );
}
String ans8_4 = req.getParameter("ans8_4");
if( ans8_4 == null){
	System.out.println(this.toString+" : ans8_4 is null" );
}else{
	System.out.println(this.toString+" : ans8_4 is "+ans8_4 );
}
String ans8_5 = req.getParameter("ans8_5");
if( ans8_5 == null){
	System.out.println(this.toString+" : ans8_5 is null" );
}else{
	System.out.println(this.toString+" : ans8_5 is "+ans8_5 );
}
String ans8_6 = req.getParameter("ans8_6");
if( ans8_6 == null){
	System.out.println(this.toString+" : ans8_6 is null" );
}else{
	System.out.println(this.toString+" : ans8_6 is "+ans8_6 );
}
String ans8_7 = req.getParameter("ans8_7");
if( ans8_7 == null){
	System.out.println(this.toString+" : ans8_7 is null" );
}else{
	System.out.println(this.toString+" : ans8_7 is "+ans8_7 );
}
String ans9_1 = req.getParameter("ans9_1");
if( ans9_1 == null){
	System.out.println(this.toString+" : ans9_1 is null" );
}else{
	System.out.println(this.toString+" : ans9_1 is "+ans9_1 );
}
String ans9_2 = req.getParameter("ans9_2");
if( ans9_2 == null){
	System.out.println(this.toString+" : ans9_2 is null" );
}else{
	System.out.println(this.toString+" : ans9_2 is "+ans9_2 );
}
String ans9_3 = req.getParameter("ans9_3");
if( ans9_3 == null){
	System.out.println(this.toString+" : ans9_3 is null" );
}else{
	System.out.println(this.toString+" : ans9_3 is "+ans9_3 );
}
String ans9_4 = req.getParameter("ans9_4");
if( ans9_4 == null){
	System.out.println(this.toString+" : ans9_4 is null" );
}else{
	System.out.println(this.toString+" : ans9_4 is "+ans9_4 );
}
String ans9_5 = req.getParameter("ans9_5");
if( ans9_5 == null){
	System.out.println(this.toString+" : ans9_5 is null" );
}else{
	System.out.println(this.toString+" : ans9_5 is "+ans9_5 );
}
String ans9_6 = req.getParameter("ans9_6");
if( ans9_6 == null){
	System.out.println(this.toString+" : ans9_6 is null" );
}else{
	System.out.println(this.toString+" : ans9_6 is "+ans9_6 );
}
String ans9_7 = req.getParameter("ans9_7");
if( ans9_7 == null){
	System.out.println(this.toString+" : ans9_7 is null" );
}else{
	System.out.println(this.toString+" : ans9_7 is "+ans9_7 );
}
String ans10_1 = req.getParameter("ans10_1");
if( ans10_1 == null){
	System.out.println(this.toString+" : ans10_1 is null" );
}else{
	System.out.println(this.toString+" : ans10_1 is "+ans10_1 );
}
String ans10_2 = req.getParameter("ans10_2");
if( ans10_2 == null){
	System.out.println(this.toString+" : ans10_2 is null" );
}else{
	System.out.println(this.toString+" : ans10_2 is "+ans10_2 );
}
String ans10_3 = req.getParameter("ans10_3");
if( ans10_3 == null){
	System.out.println(this.toString+" : ans10_3 is null" );
}else{
	System.out.println(this.toString+" : ans10_3 is "+ans10_3 );
}
String ans10_4 = req.getParameter("ans10_4");
if( ans10_4 == null){
	System.out.println(this.toString+" : ans10_4 is null" );
}else{
	System.out.println(this.toString+" : ans10_4 is "+ans10_4 );
}
String ans10_5 = req.getParameter("ans10_5");
if( ans10_5 == null){
	System.out.println(this.toString+" : ans10_5 is null" );
}else{
	System.out.println(this.toString+" : ans10_5 is "+ans10_5 );
}
String ans10_6 = req.getParameter("ans10_6");
if( ans10_6 == null){
	System.out.println(this.toString+" : ans10_6 is null" );
}else{
	System.out.println(this.toString+" : ans10_6 is "+ans10_6 );
}
String ans10_7 = req.getParameter("ans10_7");
if( ans10_7 == null){
	System.out.println(this.toString+" : ans10_7 is null" );
}else{
	System.out.println(this.toString+" : ans10_7 is "+ans10_7 );
}
String objcnt1 = req.getParameter("objcnt1");
if( objcnt1 == null){
	System.out.println(this.toString+" : objcnt1 is null" );
}else{
	System.out.println(this.toString+" : objcnt1 is "+objcnt1 );
}
String objcnt2 = req.getParameter("objcnt2");
if( objcnt2 == null){
	System.out.println(this.toString+" : objcnt2 is null" );
}else{
	System.out.println(this.toString+" : objcnt2 is "+objcnt2 );
}
String objcnt3 = req.getParameter("objcnt3");
if( objcnt3 == null){
	System.out.println(this.toString+" : objcnt3 is null" );
}else{
	System.out.println(this.toString+" : objcnt3 is "+objcnt3 );
}
String objcnt4 = req.getParameter("objcnt4");
if( objcnt4 == null){
	System.out.println(this.toString+" : objcnt4 is null" );
}else{
	System.out.println(this.toString+" : objcnt4 is "+objcnt4 );
}
String objcnt5 = req.getParameter("objcnt5");
if( objcnt5 == null){
	System.out.println(this.toString+" : objcnt5 is null" );
}else{
	System.out.println(this.toString+" : objcnt5 is "+objcnt5 );
}
String objcnt6 = req.getParameter("objcnt6");
if( objcnt6 == null){
	System.out.println(this.toString+" : objcnt6 is null" );
}else{
	System.out.println(this.toString+" : objcnt6 is "+objcnt6 );
}
String objcnt7 = req.getParameter("objcnt7");
if( objcnt7 == null){
	System.out.println(this.toString+" : objcnt7 is null" );
}else{
	System.out.println(this.toString+" : objcnt7 is "+objcnt7 );
}
String objcnt8 = req.getParameter("objcnt8");
if( objcnt8 == null){
	System.out.println(this.toString+" : objcnt8 is null" );
}else{
	System.out.println(this.toString+" : objcnt8 is "+objcnt8 );
}
String objcnt9 = req.getParameter("objcnt9");
if( objcnt9 == null){
	System.out.println(this.toString+" : objcnt9 is null" );
}else{
	System.out.println(this.toString+" : objcnt9 is "+objcnt9 );
}
String objcnt10 = req.getParameter("objcnt10");
if( objcnt10 == null){
	System.out.println(this.toString+" : objcnt10 is null" );
}else{
	System.out.println(this.toString+" : objcnt10 is "+objcnt10 );
}
String sbjlgth1 = req.getParameter("sbjlgth1");
if( sbjlgth1 == null){
	System.out.println(this.toString+" : sbjlgth1 is null" );
}else{
	System.out.println(this.toString+" : sbjlgth1 is "+sbjlgth1 );
}
String sbjlgth2 = req.getParameter("sbjlgth2");
if( sbjlgth2 == null){
	System.out.println(this.toString+" : sbjlgth2 is null" );
}else{
	System.out.println(this.toString+" : sbjlgth2 is "+sbjlgth2 );
}
String sbjlgth3 = req.getParameter("sbjlgth3");
if( sbjlgth3 == null){
	System.out.println(this.toString+" : sbjlgth3 is null" );
}else{
	System.out.println(this.toString+" : sbjlgth3 is "+sbjlgth3 );
}
String sbjlgth4 = req.getParameter("sbjlgth4");
if( sbjlgth4 == null){
	System.out.println(this.toString+" : sbjlgth4 is null" );
}else{
	System.out.println(this.toString+" : sbjlgth4 is "+sbjlgth4 );
}
String sbjlgth5 = req.getParameter("sbjlgth5");
if( sbjlgth5 == null){
	System.out.println(this.toString+" : sbjlgth5 is null" );
}else{
	System.out.println(this.toString+" : sbjlgth5 is "+sbjlgth5 );
}
String sbjlgth6 = req.getParameter("sbjlgth6");
if( sbjlgth6 == null){
	System.out.println(this.toString+" : sbjlgth6 is null" );
}else{
	System.out.println(this.toString+" : sbjlgth6 is "+sbjlgth6 );
}
String sbjlgth7 = req.getParameter("sbjlgth7");
if( sbjlgth7 == null){
	System.out.println(this.toString+" : sbjlgth7 is null" );
}else{
	System.out.println(this.toString+" : sbjlgth7 is "+sbjlgth7 );
}
String sbjlgth8 = req.getParameter("sbjlgth8");
if( sbjlgth8 == null){
	System.out.println(this.toString+" : sbjlgth8 is null" );
}else{
	System.out.println(this.toString+" : sbjlgth8 is "+sbjlgth8 );
}
String sbjlgth9 = req.getParameter("sbjlgth9");
if( sbjlgth9 == null){
	System.out.println(this.toString+" : sbjlgth9 is null" );
}else{
	System.out.println(this.toString+" : sbjlgth9 is "+sbjlgth9 );
}
String sbjlgth10 = req.getParameter("sbjlgth10");
if( sbjlgth10 == null){
	System.out.println(this.toString+" : sbjlgth10 is null" );
}else{
	System.out.println(this.toString+" : sbjlgth10 is "+sbjlgth10 );
}
String priority1 = req.getParameter("priority1");
if( priority1 == null){
	System.out.println(this.toString+" : priority1 is null" );
}else{
	System.out.println(this.toString+" : priority1 is "+priority1 );
}
String priority2 = req.getParameter("priority2");
if( priority2 == null){
	System.out.println(this.toString+" : priority2 is null" );
}else{
	System.out.println(this.toString+" : priority2 is "+priority2 );
}
String priority3 = req.getParameter("priority3");
if( priority3 == null){
	System.out.println(this.toString+" : priority3 is null" );
}else{
	System.out.println(this.toString+" : priority3 is "+priority3 );
}
String priority4 = req.getParameter("priority4");
if( priority4 == null){
	System.out.println(this.toString+" : priority4 is null" );
}else{
	System.out.println(this.toString+" : priority4 is "+priority4 );
}
String priority5 = req.getParameter("priority5");
if( priority5 == null){
	System.out.println(this.toString+" : priority5 is null" );
}else{
	System.out.println(this.toString+" : priority5 is "+priority5 );
}
String priority6 = req.getParameter("priority6");
if( priority6 == null){
	System.out.println(this.toString+" : priority6 is null" );
}else{
	System.out.println(this.toString+" : priority6 is "+priority6 );
}
String priority7 = req.getParameter("priority7");
if( priority7 == null){
	System.out.println(this.toString+" : priority7 is null" );
}else{
	System.out.println(this.toString+" : priority7 is "+priority7 );
}
String priority8 = req.getParameter("priority8");
if( priority8 == null){
	System.out.println(this.toString+" : priority8 is null" );
}else{
	System.out.println(this.toString+" : priority8 is "+priority8 );
}
String priority9 = req.getParameter("priority9");
if( priority9 == null){
	System.out.println(this.toString+" : priority9 is null" );
}else{
	System.out.println(this.toString+" : priority9 is "+priority9 );
}
String priority10 = req.getParameter("priority10");
if( priority10 == null){
	System.out.println(this.toString+" : priority10 is null" );
}else{
	System.out.println(this.toString+" : priority10 is "+priority10 );
}
String reqfg1 = req.getParameter("reqfg1");
if( reqfg1 == null){
	System.out.println(this.toString+" : reqfg1 is null" );
}else{
	System.out.println(this.toString+" : reqfg1 is "+reqfg1 );
}
String reqfg2 = req.getParameter("reqfg2");
if( reqfg2 == null){
	System.out.println(this.toString+" : reqfg2 is null" );
}else{
	System.out.println(this.toString+" : reqfg2 is "+reqfg2 );
}
String reqfg3 = req.getParameter("reqfg3");
if( reqfg3 == null){
	System.out.println(this.toString+" : reqfg3 is null" );
}else{
	System.out.println(this.toString+" : reqfg3 is "+reqfg3 );
}
String reqfg4 = req.getParameter("reqfg4");
if( reqfg4 == null){
	System.out.println(this.toString+" : reqfg4 is null" );
}else{
	System.out.println(this.toString+" : reqfg4 is "+reqfg4 );
}
String reqfg5 = req.getParameter("reqfg5");
if( reqfg5 == null){
	System.out.println(this.toString+" : reqfg5 is null" );
}else{
	System.out.println(this.toString+" : reqfg5 is "+reqfg5 );
}
String reqfg6 = req.getParameter("reqfg6");
if( reqfg6 == null){
	System.out.println(this.toString+" : reqfg6 is null" );
}else{
	System.out.println(this.toString+" : reqfg6 is "+reqfg6 );
}
String reqfg7 = req.getParameter("reqfg7");
if( reqfg7 == null){
	System.out.println(this.toString+" : reqfg7 is null" );
}else{
	System.out.println(this.toString+" : reqfg7 is "+reqfg7 );
}
String reqfg8 = req.getParameter("reqfg8");
if( reqfg8 == null){
	System.out.println(this.toString+" : reqfg8 is null" );
}else{
	System.out.println(this.toString+" : reqfg8 is "+reqfg8 );
}
String reqfg9 = req.getParameter("reqfg9");
if( reqfg9 == null){
	System.out.println(this.toString+" : reqfg9 is null" );
}else{
	System.out.println(this.toString+" : reqfg9 is "+reqfg9 );
}
String reqfg10 = req.getParameter("reqfg10");
if( reqfg10 == null){
	System.out.println(this.toString+" : reqfg10 is null" );
}else{
	System.out.println(this.toString+" : reqfg10 is "+reqfg10 );
}
String q_stat1 = req.getParameter("q_stat1");
if( q_stat1 == null){
	System.out.println(this.toString+" : q_stat1 is null" );
}else{
	System.out.println(this.toString+" : q_stat1 is "+q_stat1 );
}
String q_stat2 = req.getParameter("q_stat2");
if( q_stat2 == null){
	System.out.println(this.toString+" : q_stat2 is null" );
}else{
	System.out.println(this.toString+" : q_stat2 is "+q_stat2 );
}
String q_stat3 = req.getParameter("q_stat3");
if( q_stat3 == null){
	System.out.println(this.toString+" : q_stat3 is null" );
}else{
	System.out.println(this.toString+" : q_stat3 is "+q_stat3 );
}
String q_stat4 = req.getParameter("q_stat4");
if( q_stat4 == null){
	System.out.println(this.toString+" : q_stat4 is null" );
}else{
	System.out.println(this.toString+" : q_stat4 is "+q_stat4 );
}
String q_stat5 = req.getParameter("q_stat5");
if( q_stat5 == null){
	System.out.println(this.toString+" : q_stat5 is null" );
}else{
	System.out.println(this.toString+" : q_stat5 is "+q_stat5 );
}
String q_stat6 = req.getParameter("q_stat6");
if( q_stat6 == null){
	System.out.println(this.toString+" : q_stat6 is null" );
}else{
	System.out.println(this.toString+" : q_stat6 is "+q_stat6 );
}
String q_stat7 = req.getParameter("q_stat7");
if( q_stat7 == null){
	System.out.println(this.toString+" : q_stat7 is null" );
}else{
	System.out.println(this.toString+" : q_stat7 is "+q_stat7 );
}
String q_stat8 = req.getParameter("q_stat8");
if( q_stat8 == null){
	System.out.println(this.toString+" : q_stat8 is null" );
}else{
	System.out.println(this.toString+" : q_stat8 is "+q_stat8 );
}
String q_stat9 = req.getParameter("q_stat9");
if( q_stat9 == null){
	System.out.println(this.toString+" : q_stat9 is null" );
}else{
	System.out.println(this.toString+" : q_stat9 is "+q_stat9 );
}
String q_stat10 = req.getParameter("q_stat10");
if( q_stat10 == null){
	System.out.println(this.toString+" : q_stat10 is null" );
}else{
	System.out.println(this.toString+" : q_stat10 is "+q_stat10 );
}
String qstbsyn1 = req.getParameter("qstbsyn1");
if( qstbsyn1 == null){
	System.out.println(this.toString+" : qstbsyn1 is null" );
}else{
	System.out.println(this.toString+" : qstbsyn1 is "+qstbsyn1 );
}
String qstbsyn2 = req.getParameter("qstbsyn2");
if( qstbsyn2 == null){
	System.out.println(this.toString+" : qstbsyn2 is null" );
}else{
	System.out.println(this.toString+" : qstbsyn2 is "+qstbsyn2 );
}
String qstbsyn3 = req.getParameter("qstbsyn3");
if( qstbsyn3 == null){
	System.out.println(this.toString+" : qstbsyn3 is null" );
}else{
	System.out.println(this.toString+" : qstbsyn3 is "+qstbsyn3 );
}
String qstbsyn4 = req.getParameter("qstbsyn4");
if( qstbsyn4 == null){
	System.out.println(this.toString+" : qstbsyn4 is null" );
}else{
	System.out.println(this.toString+" : qstbsyn4 is "+qstbsyn4 );
}
String qstbsyn5 = req.getParameter("qstbsyn5");
if( qstbsyn5 == null){
	System.out.println(this.toString+" : qstbsyn5 is null" );
}else{
	System.out.println(this.toString+" : qstbsyn5 is "+qstbsyn5 );
}
String qstbsyn6 = req.getParameter("qstbsyn6");
if( qstbsyn6 == null){
	System.out.println(this.toString+" : qstbsyn6 is null" );
}else{
	System.out.println(this.toString+" : qstbsyn6 is "+qstbsyn6 );
}
String qstbsyn7 = req.getParameter("qstbsyn7");
if( qstbsyn7 == null){
	System.out.println(this.toString+" : qstbsyn7 is null" );
}else{
	System.out.println(this.toString+" : qstbsyn7 is "+qstbsyn7 );
}
String qstbsyn8 = req.getParameter("qstbsyn8");
if( qstbsyn8 == null){
	System.out.println(this.toString+" : qstbsyn8 is null" );
}else{
	System.out.println(this.toString+" : qstbsyn8 is "+qstbsyn8 );
}
String qstbsyn9 = req.getParameter("qstbsyn9");
if( qstbsyn9 == null){
	System.out.println(this.toString+" : qstbsyn9 is null" );
}else{
	System.out.println(this.toString+" : qstbsyn9 is "+qstbsyn9 );
}
String qstbsyn10 = req.getParameter("qstbsyn10");
if( qstbsyn10 == null){
	System.out.println(this.toString+" : qstbsyn10 is null" );
}else{
	System.out.println(this.toString+" : qstbsyn10 is "+qstbsyn10 );
}
String ans01_bastat1 = req.getParameter("ans01_bastat1");
if( ans01_bastat1 == null){
	System.out.println(this.toString+" : ans01_bastat1 is null" );
}else{
	System.out.println(this.toString+" : ans01_bastat1 is "+ans01_bastat1 );
}
String ans01_bastat2 = req.getParameter("ans01_bastat2");
if( ans01_bastat2 == null){
	System.out.println(this.toString+" : ans01_bastat2 is null" );
}else{
	System.out.println(this.toString+" : ans01_bastat2 is "+ans01_bastat2 );
}
String ans01_bastat3 = req.getParameter("ans01_bastat3");
if( ans01_bastat3 == null){
	System.out.println(this.toString+" : ans01_bastat3 is null" );
}else{
	System.out.println(this.toString+" : ans01_bastat3 is "+ans01_bastat3 );
}
String ans01_bastat4 = req.getParameter("ans01_bastat4");
if( ans01_bastat4 == null){
	System.out.println(this.toString+" : ans01_bastat4 is null" );
}else{
	System.out.println(this.toString+" : ans01_bastat4 is "+ans01_bastat4 );
}
String ans01_bastat5 = req.getParameter("ans01_bastat5");
if( ans01_bastat5 == null){
	System.out.println(this.toString+" : ans01_bastat5 is null" );
}else{
	System.out.println(this.toString+" : ans01_bastat5 is "+ans01_bastat5 );
}
String ans01_bastat6 = req.getParameter("ans01_bastat6");
if( ans01_bastat6 == null){
	System.out.println(this.toString+" : ans01_bastat6 is null" );
}else{
	System.out.println(this.toString+" : ans01_bastat6 is "+ans01_bastat6 );
}
String ans01_bastat7 = req.getParameter("ans01_bastat7");
if( ans01_bastat7 == null){
	System.out.println(this.toString+" : ans01_bastat7 is null" );
}else{
	System.out.println(this.toString+" : ans01_bastat7 is "+ans01_bastat7 );
}
String ans02_bastat1 = req.getParameter("ans02_bastat1");
if( ans02_bastat1 == null){
	System.out.println(this.toString+" : ans02_bastat1 is null" );
}else{
	System.out.println(this.toString+" : ans02_bastat1 is "+ans02_bastat1 );
}
String ans02_bastat2 = req.getParameter("ans02_bastat2");
if( ans02_bastat2 == null){
	System.out.println(this.toString+" : ans02_bastat2 is null" );
}else{
	System.out.println(this.toString+" : ans02_bastat2 is "+ans02_bastat2 );
}
String ans02_bastat3 = req.getParameter("ans02_bastat3");
if( ans02_bastat3 == null){
	System.out.println(this.toString+" : ans02_bastat3 is null" );
}else{
	System.out.println(this.toString+" : ans02_bastat3 is "+ans02_bastat3 );
}
String ans02_bastat4 = req.getParameter("ans02_bastat4");
if( ans02_bastat4 == null){
	System.out.println(this.toString+" : ans02_bastat4 is null" );
}else{
	System.out.println(this.toString+" : ans02_bastat4 is "+ans02_bastat4 );
}
String ans02_bastat5 = req.getParameter("ans02_bastat5");
if( ans02_bastat5 == null){
	System.out.println(this.toString+" : ans02_bastat5 is null" );
}else{
	System.out.println(this.toString+" : ans02_bastat5 is "+ans02_bastat5 );
}
String ans02_bastat6 = req.getParameter("ans02_bastat6");
if( ans02_bastat6 == null){
	System.out.println(this.toString+" : ans02_bastat6 is null" );
}else{
	System.out.println(this.toString+" : ans02_bastat6 is "+ans02_bastat6 );
}
String ans02_bastat7 = req.getParameter("ans02_bastat7");
if( ans02_bastat7 == null){
	System.out.println(this.toString+" : ans02_bastat7 is null" );
}else{
	System.out.println(this.toString+" : ans02_bastat7 is "+ans02_bastat7 );
}
String ans03_bastat1 = req.getParameter("ans03_bastat1");
if( ans03_bastat1 == null){
	System.out.println(this.toString+" : ans03_bastat1 is null" );
}else{
	System.out.println(this.toString+" : ans03_bastat1 is "+ans03_bastat1 );
}
String ans03_bastat2 = req.getParameter("ans03_bastat2");
if( ans03_bastat2 == null){
	System.out.println(this.toString+" : ans03_bastat2 is null" );
}else{
	System.out.println(this.toString+" : ans03_bastat2 is "+ans03_bastat2 );
}
String ans03_bastat3 = req.getParameter("ans03_bastat3");
if( ans03_bastat3 == null){
	System.out.println(this.toString+" : ans03_bastat3 is null" );
}else{
	System.out.println(this.toString+" : ans03_bastat3 is "+ans03_bastat3 );
}
String ans03_bastat4 = req.getParameter("ans03_bastat4");
if( ans03_bastat4 == null){
	System.out.println(this.toString+" : ans03_bastat4 is null" );
}else{
	System.out.println(this.toString+" : ans03_bastat4 is "+ans03_bastat4 );
}
String ans03_bastat5 = req.getParameter("ans03_bastat5");
if( ans03_bastat5 == null){
	System.out.println(this.toString+" : ans03_bastat5 is null" );
}else{
	System.out.println(this.toString+" : ans03_bastat5 is "+ans03_bastat5 );
}
String ans03_bastat6 = req.getParameter("ans03_bastat6");
if( ans03_bastat6 == null){
	System.out.println(this.toString+" : ans03_bastat6 is null" );
}else{
	System.out.println(this.toString+" : ans03_bastat6 is "+ans03_bastat6 );
}
String ans03_bastat7 = req.getParameter("ans03_bastat7");
if( ans03_bastat7 == null){
	System.out.println(this.toString+" : ans03_bastat7 is null" );
}else{
	System.out.println(this.toString+" : ans03_bastat7 is "+ans03_bastat7 );
}
String ans04_bastat1 = req.getParameter("ans04_bastat1");
if( ans04_bastat1 == null){
	System.out.println(this.toString+" : ans04_bastat1 is null" );
}else{
	System.out.println(this.toString+" : ans04_bastat1 is "+ans04_bastat1 );
}
String ans04_bastat2 = req.getParameter("ans04_bastat2");
if( ans04_bastat2 == null){
	System.out.println(this.toString+" : ans04_bastat2 is null" );
}else{
	System.out.println(this.toString+" : ans04_bastat2 is "+ans04_bastat2 );
}
String ans04_bastat3 = req.getParameter("ans04_bastat3");
if( ans04_bastat3 == null){
	System.out.println(this.toString+" : ans04_bastat3 is null" );
}else{
	System.out.println(this.toString+" : ans04_bastat3 is "+ans04_bastat3 );
}
String ans04_bastat4 = req.getParameter("ans04_bastat4");
if( ans04_bastat4 == null){
	System.out.println(this.toString+" : ans04_bastat4 is null" );
}else{
	System.out.println(this.toString+" : ans04_bastat4 is "+ans04_bastat4 );
}
String ans04_bastat5 = req.getParameter("ans04_bastat5");
if( ans04_bastat5 == null){
	System.out.println(this.toString+" : ans04_bastat5 is null" );
}else{
	System.out.println(this.toString+" : ans04_bastat5 is "+ans04_bastat5 );
}
String ans04_bastat6 = req.getParameter("ans04_bastat6");
if( ans04_bastat6 == null){
	System.out.println(this.toString+" : ans04_bastat6 is null" );
}else{
	System.out.println(this.toString+" : ans04_bastat6 is "+ans04_bastat6 );
}
String ans04_bastat7 = req.getParameter("ans04_bastat7");
if( ans04_bastat7 == null){
	System.out.println(this.toString+" : ans04_bastat7 is null" );
}else{
	System.out.println(this.toString+" : ans04_bastat7 is "+ans04_bastat7 );
}
String ans05_bastat1 = req.getParameter("ans05_bastat1");
if( ans05_bastat1 == null){
	System.out.println(this.toString+" : ans05_bastat1 is null" );
}else{
	System.out.println(this.toString+" : ans05_bastat1 is "+ans05_bastat1 );
}
String ans05_bastat2 = req.getParameter("ans05_bastat2");
if( ans05_bastat2 == null){
	System.out.println(this.toString+" : ans05_bastat2 is null" );
}else{
	System.out.println(this.toString+" : ans05_bastat2 is "+ans05_bastat2 );
}
String ans05_bastat3 = req.getParameter("ans05_bastat3");
if( ans05_bastat3 == null){
	System.out.println(this.toString+" : ans05_bastat3 is null" );
}else{
	System.out.println(this.toString+" : ans05_bastat3 is "+ans05_bastat3 );
}
String ans05_bastat4 = req.getParameter("ans05_bastat4");
if( ans05_bastat4 == null){
	System.out.println(this.toString+" : ans05_bastat4 is null" );
}else{
	System.out.println(this.toString+" : ans05_bastat4 is "+ans05_bastat4 );
}
String ans05_bastat5 = req.getParameter("ans05_bastat5");
if( ans05_bastat5 == null){
	System.out.println(this.toString+" : ans05_bastat5 is null" );
}else{
	System.out.println(this.toString+" : ans05_bastat5 is "+ans05_bastat5 );
}
String ans05_bastat6 = req.getParameter("ans05_bastat6");
if( ans05_bastat6 == null){
	System.out.println(this.toString+" : ans05_bastat6 is null" );
}else{
	System.out.println(this.toString+" : ans05_bastat6 is "+ans05_bastat6 );
}
String ans05_bastat7 = req.getParameter("ans05_bastat7");
if( ans05_bastat7 == null){
	System.out.println(this.toString+" : ans05_bastat7 is null" );
}else{
	System.out.println(this.toString+" : ans05_bastat7 is "+ans05_bastat7 );
}
String ans06_bastat1 = req.getParameter("ans06_bastat1");
if( ans06_bastat1 == null){
	System.out.println(this.toString+" : ans06_bastat1 is null" );
}else{
	System.out.println(this.toString+" : ans06_bastat1 is "+ans06_bastat1 );
}
String ans06_bastat2 = req.getParameter("ans06_bastat2");
if( ans06_bastat2 == null){
	System.out.println(this.toString+" : ans06_bastat2 is null" );
}else{
	System.out.println(this.toString+" : ans06_bastat2 is "+ans06_bastat2 );
}
String ans06_bastat3 = req.getParameter("ans06_bastat3");
if( ans06_bastat3 == null){
	System.out.println(this.toString+" : ans06_bastat3 is null" );
}else{
	System.out.println(this.toString+" : ans06_bastat3 is "+ans06_bastat3 );
}
String ans06_bastat4 = req.getParameter("ans06_bastat4");
if( ans06_bastat4 == null){
	System.out.println(this.toString+" : ans06_bastat4 is null" );
}else{
	System.out.println(this.toString+" : ans06_bastat4 is "+ans06_bastat4 );
}
String ans06_bastat5 = req.getParameter("ans06_bastat5");
if( ans06_bastat5 == null){
	System.out.println(this.toString+" : ans06_bastat5 is null" );
}else{
	System.out.println(this.toString+" : ans06_bastat5 is "+ans06_bastat5 );
}
String ans06_bastat6 = req.getParameter("ans06_bastat6");
if( ans06_bastat6 == null){
	System.out.println(this.toString+" : ans06_bastat6 is null" );
}else{
	System.out.println(this.toString+" : ans06_bastat6 is "+ans06_bastat6 );
}
String ans06_bastat7 = req.getParameter("ans06_bastat7");
if( ans06_bastat7 == null){
	System.out.println(this.toString+" : ans06_bastat7 is null" );
}else{
	System.out.println(this.toString+" : ans06_bastat7 is "+ans06_bastat7 );
}
String ans07_bastat1 = req.getParameter("ans07_bastat1");
if( ans07_bastat1 == null){
	System.out.println(this.toString+" : ans07_bastat1 is null" );
}else{
	System.out.println(this.toString+" : ans07_bastat1 is "+ans07_bastat1 );
}
String ans07_bastat2 = req.getParameter("ans07_bastat2");
if( ans07_bastat2 == null){
	System.out.println(this.toString+" : ans07_bastat2 is null" );
}else{
	System.out.println(this.toString+" : ans07_bastat2 is "+ans07_bastat2 );
}
String ans07_bastat3 = req.getParameter("ans07_bastat3");
if( ans07_bastat3 == null){
	System.out.println(this.toString+" : ans07_bastat3 is null" );
}else{
	System.out.println(this.toString+" : ans07_bastat3 is "+ans07_bastat3 );
}
String ans07_bastat4 = req.getParameter("ans07_bastat4");
if( ans07_bastat4 == null){
	System.out.println(this.toString+" : ans07_bastat4 is null" );
}else{
	System.out.println(this.toString+" : ans07_bastat4 is "+ans07_bastat4 );
}
String ans07_bastat5 = req.getParameter("ans07_bastat5");
if( ans07_bastat5 == null){
	System.out.println(this.toString+" : ans07_bastat5 is null" );
}else{
	System.out.println(this.toString+" : ans07_bastat5 is "+ans07_bastat5 );
}
String ans07_bastat6 = req.getParameter("ans07_bastat6");
if( ans07_bastat6 == null){
	System.out.println(this.toString+" : ans07_bastat6 is null" );
}else{
	System.out.println(this.toString+" : ans07_bastat6 is "+ans07_bastat6 );
}
String ans07_bastat7 = req.getParameter("ans07_bastat7");
if( ans07_bastat7 == null){
	System.out.println(this.toString+" : ans07_bastat7 is null" );
}else{
	System.out.println(this.toString+" : ans07_bastat7 is "+ans07_bastat7 );
}
String ans08_bastat1 = req.getParameter("ans08_bastat1");
if( ans08_bastat1 == null){
	System.out.println(this.toString+" : ans08_bastat1 is null" );
}else{
	System.out.println(this.toString+" : ans08_bastat1 is "+ans08_bastat1 );
}
String ans08_bastat2 = req.getParameter("ans08_bastat2");
if( ans08_bastat2 == null){
	System.out.println(this.toString+" : ans08_bastat2 is null" );
}else{
	System.out.println(this.toString+" : ans08_bastat2 is "+ans08_bastat2 );
}
String ans08_bastat3 = req.getParameter("ans08_bastat3");
if( ans08_bastat3 == null){
	System.out.println(this.toString+" : ans08_bastat3 is null" );
}else{
	System.out.println(this.toString+" : ans08_bastat3 is "+ans08_bastat3 );
}
String ans08_bastat4 = req.getParameter("ans08_bastat4");
if( ans08_bastat4 == null){
	System.out.println(this.toString+" : ans08_bastat4 is null" );
}else{
	System.out.println(this.toString+" : ans08_bastat4 is "+ans08_bastat4 );
}
String ans08_bastat5 = req.getParameter("ans08_bastat5");
if( ans08_bastat5 == null){
	System.out.println(this.toString+" : ans08_bastat5 is null" );
}else{
	System.out.println(this.toString+" : ans08_bastat5 is "+ans08_bastat5 );
}
String ans08_bastat6 = req.getParameter("ans08_bastat6");
if( ans08_bastat6 == null){
	System.out.println(this.toString+" : ans08_bastat6 is null" );
}else{
	System.out.println(this.toString+" : ans08_bastat6 is "+ans08_bastat6 );
}
String ans08_bastat7 = req.getParameter("ans08_bastat7");
if( ans08_bastat7 == null){
	System.out.println(this.toString+" : ans08_bastat7 is null" );
}else{
	System.out.println(this.toString+" : ans08_bastat7 is "+ans08_bastat7 );
}
String ans09_bastat1 = req.getParameter("ans09_bastat1");
if( ans09_bastat1 == null){
	System.out.println(this.toString+" : ans09_bastat1 is null" );
}else{
	System.out.println(this.toString+" : ans09_bastat1 is "+ans09_bastat1 );
}
String ans09_bastat2 = req.getParameter("ans09_bastat2");
if( ans09_bastat2 == null){
	System.out.println(this.toString+" : ans09_bastat2 is null" );
}else{
	System.out.println(this.toString+" : ans09_bastat2 is "+ans09_bastat2 );
}
String ans09_bastat3 = req.getParameter("ans09_bastat3");
if( ans09_bastat3 == null){
	System.out.println(this.toString+" : ans09_bastat3 is null" );
}else{
	System.out.println(this.toString+" : ans09_bastat3 is "+ans09_bastat3 );
}
String ans09_bastat4 = req.getParameter("ans09_bastat4");
if( ans09_bastat4 == null){
	System.out.println(this.toString+" : ans09_bastat4 is null" );
}else{
	System.out.println(this.toString+" : ans09_bastat4 is "+ans09_bastat4 );
}
String ans09_bastat5 = req.getParameter("ans09_bastat5");
if( ans09_bastat5 == null){
	System.out.println(this.toString+" : ans09_bastat5 is null" );
}else{
	System.out.println(this.toString+" : ans09_bastat5 is "+ans09_bastat5 );
}
String ans09_bastat6 = req.getParameter("ans09_bastat6");
if( ans09_bastat6 == null){
	System.out.println(this.toString+" : ans09_bastat6 is null" );
}else{
	System.out.println(this.toString+" : ans09_bastat6 is "+ans09_bastat6 );
}
String ans09_bastat7 = req.getParameter("ans09_bastat7");
if( ans09_bastat7 == null){
	System.out.println(this.toString+" : ans09_bastat7 is null" );
}else{
	System.out.println(this.toString+" : ans09_bastat7 is "+ans09_bastat7 );
}
String ans10_bastat1 = req.getParameter("ans10_bastat1");
if( ans10_bastat1 == null){
	System.out.println(this.toString+" : ans10_bastat1 is null" );
}else{
	System.out.println(this.toString+" : ans10_bastat1 is "+ans10_bastat1 );
}
String ans10_bastat2 = req.getParameter("ans10_bastat2");
if( ans10_bastat2 == null){
	System.out.println(this.toString+" : ans10_bastat2 is null" );
}else{
	System.out.println(this.toString+" : ans10_bastat2 is "+ans10_bastat2 );
}
String ans10_bastat3 = req.getParameter("ans10_bastat3");
if( ans10_bastat3 == null){
	System.out.println(this.toString+" : ans10_bastat3 is null" );
}else{
	System.out.println(this.toString+" : ans10_bastat3 is "+ans10_bastat3 );
}
String ans10_bastat4 = req.getParameter("ans10_bastat4");
if( ans10_bastat4 == null){
	System.out.println(this.toString+" : ans10_bastat4 is null" );
}else{
	System.out.println(this.toString+" : ans10_bastat4 is "+ans10_bastat4 );
}
String ans10_bastat5 = req.getParameter("ans10_bastat5");
if( ans10_bastat5 == null){
	System.out.println(this.toString+" : ans10_bastat5 is null" );
}else{
	System.out.println(this.toString+" : ans10_bastat5 is "+ans10_bastat5 );
}
String ans10_bastat6 = req.getParameter("ans10_bastat6");
if( ans10_bastat6 == null){
	System.out.println(this.toString+" : ans10_bastat6 is null" );
}else{
	System.out.println(this.toString+" : ans10_bastat6 is "+ans10_bastat6 );
}
String ans10_bastat7 = req.getParameter("ans10_bastat7");
if( ans10_bastat7 == null){
	System.out.println(this.toString+" : ans10_bastat7 is null" );
}else{
	System.out.println(this.toString+" : ans10_bastat7 is "+ans10_bastat7 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String svyid = Util.checkString(req.getParameter("svyid"));
String svynm = Util.checkString(req.getParameter("svynm"));
String sttdt = Util.checkString(req.getParameter("sttdt"));
String enddt = Util.checkString(req.getParameter("enddt"));
String qstsnum = Util.checkString(req.getParameter("qstsnum"));
String url = Util.checkString(req.getParameter("url"));
String s_stat = Util.checkString(req.getParameter("s_stat"));
String giftfg = Util.checkString(req.getParameter("giftfg"));
String memo = Util.checkString(req.getParameter("memo"));
String camptype = Util.checkString(req.getParameter("camptype"));
String basicdt = Util.checkString(req.getParameter("basicdt"));
String qstid1 = Util.checkString(req.getParameter("qstid1"));
String qstid2 = Util.checkString(req.getParameter("qstid2"));
String qstid3 = Util.checkString(req.getParameter("qstid3"));
String qstid4 = Util.checkString(req.getParameter("qstid4"));
String qstid5 = Util.checkString(req.getParameter("qstid5"));
String qstid6 = Util.checkString(req.getParameter("qstid6"));
String qstid7 = Util.checkString(req.getParameter("qstid7"));
String qstid8 = Util.checkString(req.getParameter("qstid8"));
String qstid9 = Util.checkString(req.getParameter("qstid9"));
String qstid10 = Util.checkString(req.getParameter("qstid10"));
String cont1 = Util.checkString(req.getParameter("cont1"));
String cont2 = Util.checkString(req.getParameter("cont2"));
String cont3 = Util.checkString(req.getParameter("cont3"));
String cont4 = Util.checkString(req.getParameter("cont4"));
String cont5 = Util.checkString(req.getParameter("cont5"));
String cont6 = Util.checkString(req.getParameter("cont6"));
String cont7 = Util.checkString(req.getParameter("cont7"));
String cont8 = Util.checkString(req.getParameter("cont8"));
String cont9 = Util.checkString(req.getParameter("cont9"));
String cont10 = Util.checkString(req.getParameter("cont10"));
String qtstype1 = Util.checkString(req.getParameter("qtstype1"));
String qtstype2 = Util.checkString(req.getParameter("qtstype2"));
String qtstype3 = Util.checkString(req.getParameter("qtstype3"));
String qtstype4 = Util.checkString(req.getParameter("qtstype4"));
String qtstype5 = Util.checkString(req.getParameter("qtstype5"));
String qtstype6 = Util.checkString(req.getParameter("qtstype6"));
String qtstype7 = Util.checkString(req.getParameter("qtstype7"));
String qtstype8 = Util.checkString(req.getParameter("qtstype8"));
String qtstype9 = Util.checkString(req.getParameter("qtstype9"));
String qtstype10 = Util.checkString(req.getParameter("qtstype10"));
String ans1_1 = Util.checkString(req.getParameter("ans1_1"));
String ans1_2 = Util.checkString(req.getParameter("ans1_2"));
String ans1_3 = Util.checkString(req.getParameter("ans1_3"));
String ans1_4 = Util.checkString(req.getParameter("ans1_4"));
String ans1_5 = Util.checkString(req.getParameter("ans1_5"));
String ans1_6 = Util.checkString(req.getParameter("ans1_6"));
String ans1_7 = Util.checkString(req.getParameter("ans1_7"));
String ans2_1 = Util.checkString(req.getParameter("ans2_1"));
String ans2_2 = Util.checkString(req.getParameter("ans2_2"));
String ans2_3 = Util.checkString(req.getParameter("ans2_3"));
String ans2_4 = Util.checkString(req.getParameter("ans2_4"));
String ans2_5 = Util.checkString(req.getParameter("ans2_5"));
String ans2_6 = Util.checkString(req.getParameter("ans2_6"));
String ans2_7 = Util.checkString(req.getParameter("ans2_7"));
String ans3_1 = Util.checkString(req.getParameter("ans3_1"));
String ans3_2 = Util.checkString(req.getParameter("ans3_2"));
String ans3_3 = Util.checkString(req.getParameter("ans3_3"));
String ans3_4 = Util.checkString(req.getParameter("ans3_4"));
String ans3_5 = Util.checkString(req.getParameter("ans3_5"));
String ans3_6 = Util.checkString(req.getParameter("ans3_6"));
String ans3_7 = Util.checkString(req.getParameter("ans3_7"));
String ans4_1 = Util.checkString(req.getParameter("ans4_1"));
String ans4_2 = Util.checkString(req.getParameter("ans4_2"));
String ans4_3 = Util.checkString(req.getParameter("ans4_3"));
String ans4_4 = Util.checkString(req.getParameter("ans4_4"));
String ans4_5 = Util.checkString(req.getParameter("ans4_5"));
String ans4_6 = Util.checkString(req.getParameter("ans4_6"));
String ans4_7 = Util.checkString(req.getParameter("ans4_7"));
String ans5_1 = Util.checkString(req.getParameter("ans5_1"));
String ans5_2 = Util.checkString(req.getParameter("ans5_2"));
String ans5_3 = Util.checkString(req.getParameter("ans5_3"));
String ans5_4 = Util.checkString(req.getParameter("ans5_4"));
String ans5_5 = Util.checkString(req.getParameter("ans5_5"));
String ans5_6 = Util.checkString(req.getParameter("ans5_6"));
String ans5_7 = Util.checkString(req.getParameter("ans5_7"));
String ans6_1 = Util.checkString(req.getParameter("ans6_1"));
String ans6_2 = Util.checkString(req.getParameter("ans6_2"));
String ans6_3 = Util.checkString(req.getParameter("ans6_3"));
String ans6_4 = Util.checkString(req.getParameter("ans6_4"));
String ans6_5 = Util.checkString(req.getParameter("ans6_5"));
String ans6_6 = Util.checkString(req.getParameter("ans6_6"));
String ans6_7 = Util.checkString(req.getParameter("ans6_7"));
String ans7_1 = Util.checkString(req.getParameter("ans7_1"));
String ans7_2 = Util.checkString(req.getParameter("ans7_2"));
String ans7_3 = Util.checkString(req.getParameter("ans7_3"));
String ans7_4 = Util.checkString(req.getParameter("ans7_4"));
String ans7_5 = Util.checkString(req.getParameter("ans7_5"));
String ans7_6 = Util.checkString(req.getParameter("ans7_6"));
String ans7_7 = Util.checkString(req.getParameter("ans7_7"));
String ans8_1 = Util.checkString(req.getParameter("ans8_1"));
String ans8_2 = Util.checkString(req.getParameter("ans8_2"));
String ans8_3 = Util.checkString(req.getParameter("ans8_3"));
String ans8_4 = Util.checkString(req.getParameter("ans8_4"));
String ans8_5 = Util.checkString(req.getParameter("ans8_5"));
String ans8_6 = Util.checkString(req.getParameter("ans8_6"));
String ans8_7 = Util.checkString(req.getParameter("ans8_7"));
String ans9_1 = Util.checkString(req.getParameter("ans9_1"));
String ans9_2 = Util.checkString(req.getParameter("ans9_2"));
String ans9_3 = Util.checkString(req.getParameter("ans9_3"));
String ans9_4 = Util.checkString(req.getParameter("ans9_4"));
String ans9_5 = Util.checkString(req.getParameter("ans9_5"));
String ans9_6 = Util.checkString(req.getParameter("ans9_6"));
String ans9_7 = Util.checkString(req.getParameter("ans9_7"));
String ans10_1 = Util.checkString(req.getParameter("ans10_1"));
String ans10_2 = Util.checkString(req.getParameter("ans10_2"));
String ans10_3 = Util.checkString(req.getParameter("ans10_3"));
String ans10_4 = Util.checkString(req.getParameter("ans10_4"));
String ans10_5 = Util.checkString(req.getParameter("ans10_5"));
String ans10_6 = Util.checkString(req.getParameter("ans10_6"));
String ans10_7 = Util.checkString(req.getParameter("ans10_7"));
String objcnt1 = Util.checkString(req.getParameter("objcnt1"));
String objcnt2 = Util.checkString(req.getParameter("objcnt2"));
String objcnt3 = Util.checkString(req.getParameter("objcnt3"));
String objcnt4 = Util.checkString(req.getParameter("objcnt4"));
String objcnt5 = Util.checkString(req.getParameter("objcnt5"));
String objcnt6 = Util.checkString(req.getParameter("objcnt6"));
String objcnt7 = Util.checkString(req.getParameter("objcnt7"));
String objcnt8 = Util.checkString(req.getParameter("objcnt8"));
String objcnt9 = Util.checkString(req.getParameter("objcnt9"));
String objcnt10 = Util.checkString(req.getParameter("objcnt10"));
String sbjlgth1 = Util.checkString(req.getParameter("sbjlgth1"));
String sbjlgth2 = Util.checkString(req.getParameter("sbjlgth2"));
String sbjlgth3 = Util.checkString(req.getParameter("sbjlgth3"));
String sbjlgth4 = Util.checkString(req.getParameter("sbjlgth4"));
String sbjlgth5 = Util.checkString(req.getParameter("sbjlgth5"));
String sbjlgth6 = Util.checkString(req.getParameter("sbjlgth6"));
String sbjlgth7 = Util.checkString(req.getParameter("sbjlgth7"));
String sbjlgth8 = Util.checkString(req.getParameter("sbjlgth8"));
String sbjlgth9 = Util.checkString(req.getParameter("sbjlgth9"));
String sbjlgth10 = Util.checkString(req.getParameter("sbjlgth10"));
String priority1 = Util.checkString(req.getParameter("priority1"));
String priority2 = Util.checkString(req.getParameter("priority2"));
String priority3 = Util.checkString(req.getParameter("priority3"));
String priority4 = Util.checkString(req.getParameter("priority4"));
String priority5 = Util.checkString(req.getParameter("priority5"));
String priority6 = Util.checkString(req.getParameter("priority6"));
String priority7 = Util.checkString(req.getParameter("priority7"));
String priority8 = Util.checkString(req.getParameter("priority8"));
String priority9 = Util.checkString(req.getParameter("priority9"));
String priority10 = Util.checkString(req.getParameter("priority10"));
String reqfg1 = Util.checkString(req.getParameter("reqfg1"));
String reqfg2 = Util.checkString(req.getParameter("reqfg2"));
String reqfg3 = Util.checkString(req.getParameter("reqfg3"));
String reqfg4 = Util.checkString(req.getParameter("reqfg4"));
String reqfg5 = Util.checkString(req.getParameter("reqfg5"));
String reqfg6 = Util.checkString(req.getParameter("reqfg6"));
String reqfg7 = Util.checkString(req.getParameter("reqfg7"));
String reqfg8 = Util.checkString(req.getParameter("reqfg8"));
String reqfg9 = Util.checkString(req.getParameter("reqfg9"));
String reqfg10 = Util.checkString(req.getParameter("reqfg10"));
String q_stat1 = Util.checkString(req.getParameter("q_stat1"));
String q_stat2 = Util.checkString(req.getParameter("q_stat2"));
String q_stat3 = Util.checkString(req.getParameter("q_stat3"));
String q_stat4 = Util.checkString(req.getParameter("q_stat4"));
String q_stat5 = Util.checkString(req.getParameter("q_stat5"));
String q_stat6 = Util.checkString(req.getParameter("q_stat6"));
String q_stat7 = Util.checkString(req.getParameter("q_stat7"));
String q_stat8 = Util.checkString(req.getParameter("q_stat8"));
String q_stat9 = Util.checkString(req.getParameter("q_stat9"));
String q_stat10 = Util.checkString(req.getParameter("q_stat10"));
String qstbsyn1 = Util.checkString(req.getParameter("qstbsyn1"));
String qstbsyn2 = Util.checkString(req.getParameter("qstbsyn2"));
String qstbsyn3 = Util.checkString(req.getParameter("qstbsyn3"));
String qstbsyn4 = Util.checkString(req.getParameter("qstbsyn4"));
String qstbsyn5 = Util.checkString(req.getParameter("qstbsyn5"));
String qstbsyn6 = Util.checkString(req.getParameter("qstbsyn6"));
String qstbsyn7 = Util.checkString(req.getParameter("qstbsyn7"));
String qstbsyn8 = Util.checkString(req.getParameter("qstbsyn8"));
String qstbsyn9 = Util.checkString(req.getParameter("qstbsyn9"));
String qstbsyn10 = Util.checkString(req.getParameter("qstbsyn10"));
String ans01_bastat1 = Util.checkString(req.getParameter("ans01_bastat1"));
String ans01_bastat2 = Util.checkString(req.getParameter("ans01_bastat2"));
String ans01_bastat3 = Util.checkString(req.getParameter("ans01_bastat3"));
String ans01_bastat4 = Util.checkString(req.getParameter("ans01_bastat4"));
String ans01_bastat5 = Util.checkString(req.getParameter("ans01_bastat5"));
String ans01_bastat6 = Util.checkString(req.getParameter("ans01_bastat6"));
String ans01_bastat7 = Util.checkString(req.getParameter("ans01_bastat7"));
String ans02_bastat1 = Util.checkString(req.getParameter("ans02_bastat1"));
String ans02_bastat2 = Util.checkString(req.getParameter("ans02_bastat2"));
String ans02_bastat3 = Util.checkString(req.getParameter("ans02_bastat3"));
String ans02_bastat4 = Util.checkString(req.getParameter("ans02_bastat4"));
String ans02_bastat5 = Util.checkString(req.getParameter("ans02_bastat5"));
String ans02_bastat6 = Util.checkString(req.getParameter("ans02_bastat6"));
String ans02_bastat7 = Util.checkString(req.getParameter("ans02_bastat7"));
String ans03_bastat1 = Util.checkString(req.getParameter("ans03_bastat1"));
String ans03_bastat2 = Util.checkString(req.getParameter("ans03_bastat2"));
String ans03_bastat3 = Util.checkString(req.getParameter("ans03_bastat3"));
String ans03_bastat4 = Util.checkString(req.getParameter("ans03_bastat4"));
String ans03_bastat5 = Util.checkString(req.getParameter("ans03_bastat5"));
String ans03_bastat6 = Util.checkString(req.getParameter("ans03_bastat6"));
String ans03_bastat7 = Util.checkString(req.getParameter("ans03_bastat7"));
String ans04_bastat1 = Util.checkString(req.getParameter("ans04_bastat1"));
String ans04_bastat2 = Util.checkString(req.getParameter("ans04_bastat2"));
String ans04_bastat3 = Util.checkString(req.getParameter("ans04_bastat3"));
String ans04_bastat4 = Util.checkString(req.getParameter("ans04_bastat4"));
String ans04_bastat5 = Util.checkString(req.getParameter("ans04_bastat5"));
String ans04_bastat6 = Util.checkString(req.getParameter("ans04_bastat6"));
String ans04_bastat7 = Util.checkString(req.getParameter("ans04_bastat7"));
String ans05_bastat1 = Util.checkString(req.getParameter("ans05_bastat1"));
String ans05_bastat2 = Util.checkString(req.getParameter("ans05_bastat2"));
String ans05_bastat3 = Util.checkString(req.getParameter("ans05_bastat3"));
String ans05_bastat4 = Util.checkString(req.getParameter("ans05_bastat4"));
String ans05_bastat5 = Util.checkString(req.getParameter("ans05_bastat5"));
String ans05_bastat6 = Util.checkString(req.getParameter("ans05_bastat6"));
String ans05_bastat7 = Util.checkString(req.getParameter("ans05_bastat7"));
String ans06_bastat1 = Util.checkString(req.getParameter("ans06_bastat1"));
String ans06_bastat2 = Util.checkString(req.getParameter("ans06_bastat2"));
String ans06_bastat3 = Util.checkString(req.getParameter("ans06_bastat3"));
String ans06_bastat4 = Util.checkString(req.getParameter("ans06_bastat4"));
String ans06_bastat5 = Util.checkString(req.getParameter("ans06_bastat5"));
String ans06_bastat6 = Util.checkString(req.getParameter("ans06_bastat6"));
String ans06_bastat7 = Util.checkString(req.getParameter("ans06_bastat7"));
String ans07_bastat1 = Util.checkString(req.getParameter("ans07_bastat1"));
String ans07_bastat2 = Util.checkString(req.getParameter("ans07_bastat2"));
String ans07_bastat3 = Util.checkString(req.getParameter("ans07_bastat3"));
String ans07_bastat4 = Util.checkString(req.getParameter("ans07_bastat4"));
String ans07_bastat5 = Util.checkString(req.getParameter("ans07_bastat5"));
String ans07_bastat6 = Util.checkString(req.getParameter("ans07_bastat6"));
String ans07_bastat7 = Util.checkString(req.getParameter("ans07_bastat7"));
String ans08_bastat1 = Util.checkString(req.getParameter("ans08_bastat1"));
String ans08_bastat2 = Util.checkString(req.getParameter("ans08_bastat2"));
String ans08_bastat3 = Util.checkString(req.getParameter("ans08_bastat3"));
String ans08_bastat4 = Util.checkString(req.getParameter("ans08_bastat4"));
String ans08_bastat5 = Util.checkString(req.getParameter("ans08_bastat5"));
String ans08_bastat6 = Util.checkString(req.getParameter("ans08_bastat6"));
String ans08_bastat7 = Util.checkString(req.getParameter("ans08_bastat7"));
String ans09_bastat1 = Util.checkString(req.getParameter("ans09_bastat1"));
String ans09_bastat2 = Util.checkString(req.getParameter("ans09_bastat2"));
String ans09_bastat3 = Util.checkString(req.getParameter("ans09_bastat3"));
String ans09_bastat4 = Util.checkString(req.getParameter("ans09_bastat4"));
String ans09_bastat5 = Util.checkString(req.getParameter("ans09_bastat5"));
String ans09_bastat6 = Util.checkString(req.getParameter("ans09_bastat6"));
String ans09_bastat7 = Util.checkString(req.getParameter("ans09_bastat7"));
String ans10_bastat1 = Util.checkString(req.getParameter("ans10_bastat1"));
String ans10_bastat2 = Util.checkString(req.getParameter("ans10_bastat2"));
String ans10_bastat3 = Util.checkString(req.getParameter("ans10_bastat3"));
String ans10_bastat4 = Util.checkString(req.getParameter("ans10_bastat4"));
String ans10_bastat5 = Util.checkString(req.getParameter("ans10_bastat5"));
String ans10_bastat6 = Util.checkString(req.getParameter("ans10_bastat6"));
String ans10_bastat7 = Util.checkString(req.getParameter("ans10_bastat7"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String svyid = Util.Uni2Ksc(Util.checkString(req.getParameter("svyid")));
String svynm = Util.Uni2Ksc(Util.checkString(req.getParameter("svynm")));
String sttdt = Util.Uni2Ksc(Util.checkString(req.getParameter("sttdt")));
String enddt = Util.Uni2Ksc(Util.checkString(req.getParameter("enddt")));
String qstsnum = Util.Uni2Ksc(Util.checkString(req.getParameter("qstsnum")));
String url = Util.Uni2Ksc(Util.checkString(req.getParameter("url")));
String s_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("s_stat")));
String giftfg = Util.Uni2Ksc(Util.checkString(req.getParameter("giftfg")));
String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));
String camptype = Util.Uni2Ksc(Util.checkString(req.getParameter("camptype")));
String basicdt = Util.Uni2Ksc(Util.checkString(req.getParameter("basicdt")));
String qstid1 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstid1")));
String qstid2 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstid2")));
String qstid3 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstid3")));
String qstid4 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstid4")));
String qstid5 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstid5")));
String qstid6 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstid6")));
String qstid7 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstid7")));
String qstid8 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstid8")));
String qstid9 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstid9")));
String qstid10 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstid10")));
String cont1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont1")));
String cont2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont2")));
String cont3 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont3")));
String cont4 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont4")));
String cont5 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont5")));
String cont6 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont6")));
String cont7 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont7")));
String cont8 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont8")));
String cont9 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont9")));
String cont10 = Util.Uni2Ksc(Util.checkString(req.getParameter("cont10")));
String qtstype1 = Util.Uni2Ksc(Util.checkString(req.getParameter("qtstype1")));
String qtstype2 = Util.Uni2Ksc(Util.checkString(req.getParameter("qtstype2")));
String qtstype3 = Util.Uni2Ksc(Util.checkString(req.getParameter("qtstype3")));
String qtstype4 = Util.Uni2Ksc(Util.checkString(req.getParameter("qtstype4")));
String qtstype5 = Util.Uni2Ksc(Util.checkString(req.getParameter("qtstype5")));
String qtstype6 = Util.Uni2Ksc(Util.checkString(req.getParameter("qtstype6")));
String qtstype7 = Util.Uni2Ksc(Util.checkString(req.getParameter("qtstype7")));
String qtstype8 = Util.Uni2Ksc(Util.checkString(req.getParameter("qtstype8")));
String qtstype9 = Util.Uni2Ksc(Util.checkString(req.getParameter("qtstype9")));
String qtstype10 = Util.Uni2Ksc(Util.checkString(req.getParameter("qtstype10")));
String ans1_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans1_1")));
String ans1_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans1_2")));
String ans1_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans1_3")));
String ans1_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans1_4")));
String ans1_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans1_5")));
String ans1_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans1_6")));
String ans1_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans1_7")));
String ans2_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans2_1")));
String ans2_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans2_2")));
String ans2_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans2_3")));
String ans2_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans2_4")));
String ans2_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans2_5")));
String ans2_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans2_6")));
String ans2_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans2_7")));
String ans3_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans3_1")));
String ans3_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans3_2")));
String ans3_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans3_3")));
String ans3_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans3_4")));
String ans3_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans3_5")));
String ans3_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans3_6")));
String ans3_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans3_7")));
String ans4_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans4_1")));
String ans4_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans4_2")));
String ans4_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans4_3")));
String ans4_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans4_4")));
String ans4_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans4_5")));
String ans4_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans4_6")));
String ans4_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans4_7")));
String ans5_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans5_1")));
String ans5_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans5_2")));
String ans5_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans5_3")));
String ans5_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans5_4")));
String ans5_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans5_5")));
String ans5_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans5_6")));
String ans5_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans5_7")));
String ans6_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans6_1")));
String ans6_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans6_2")));
String ans6_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans6_3")));
String ans6_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans6_4")));
String ans6_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans6_5")));
String ans6_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans6_6")));
String ans6_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans6_7")));
String ans7_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans7_1")));
String ans7_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans7_2")));
String ans7_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans7_3")));
String ans7_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans7_4")));
String ans7_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans7_5")));
String ans7_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans7_6")));
String ans7_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans7_7")));
String ans8_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans8_1")));
String ans8_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans8_2")));
String ans8_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans8_3")));
String ans8_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans8_4")));
String ans8_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans8_5")));
String ans8_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans8_6")));
String ans8_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans8_7")));
String ans9_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans9_1")));
String ans9_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans9_2")));
String ans9_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans9_3")));
String ans9_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans9_4")));
String ans9_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans9_5")));
String ans9_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans9_6")));
String ans9_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans9_7")));
String ans10_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans10_1")));
String ans10_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans10_2")));
String ans10_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans10_3")));
String ans10_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans10_4")));
String ans10_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans10_5")));
String ans10_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans10_6")));
String ans10_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans10_7")));
String objcnt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("objcnt1")));
String objcnt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("objcnt2")));
String objcnt3 = Util.Uni2Ksc(Util.checkString(req.getParameter("objcnt3")));
String objcnt4 = Util.Uni2Ksc(Util.checkString(req.getParameter("objcnt4")));
String objcnt5 = Util.Uni2Ksc(Util.checkString(req.getParameter("objcnt5")));
String objcnt6 = Util.Uni2Ksc(Util.checkString(req.getParameter("objcnt6")));
String objcnt7 = Util.Uni2Ksc(Util.checkString(req.getParameter("objcnt7")));
String objcnt8 = Util.Uni2Ksc(Util.checkString(req.getParameter("objcnt8")));
String objcnt9 = Util.Uni2Ksc(Util.checkString(req.getParameter("objcnt9")));
String objcnt10 = Util.Uni2Ksc(Util.checkString(req.getParameter("objcnt10")));
String sbjlgth1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sbjlgth1")));
String sbjlgth2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sbjlgth2")));
String sbjlgth3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sbjlgth3")));
String sbjlgth4 = Util.Uni2Ksc(Util.checkString(req.getParameter("sbjlgth4")));
String sbjlgth5 = Util.Uni2Ksc(Util.checkString(req.getParameter("sbjlgth5")));
String sbjlgth6 = Util.Uni2Ksc(Util.checkString(req.getParameter("sbjlgth6")));
String sbjlgth7 = Util.Uni2Ksc(Util.checkString(req.getParameter("sbjlgth7")));
String sbjlgth8 = Util.Uni2Ksc(Util.checkString(req.getParameter("sbjlgth8")));
String sbjlgth9 = Util.Uni2Ksc(Util.checkString(req.getParameter("sbjlgth9")));
String sbjlgth10 = Util.Uni2Ksc(Util.checkString(req.getParameter("sbjlgth10")));
String priority1 = Util.Uni2Ksc(Util.checkString(req.getParameter("priority1")));
String priority2 = Util.Uni2Ksc(Util.checkString(req.getParameter("priority2")));
String priority3 = Util.Uni2Ksc(Util.checkString(req.getParameter("priority3")));
String priority4 = Util.Uni2Ksc(Util.checkString(req.getParameter("priority4")));
String priority5 = Util.Uni2Ksc(Util.checkString(req.getParameter("priority5")));
String priority6 = Util.Uni2Ksc(Util.checkString(req.getParameter("priority6")));
String priority7 = Util.Uni2Ksc(Util.checkString(req.getParameter("priority7")));
String priority8 = Util.Uni2Ksc(Util.checkString(req.getParameter("priority8")));
String priority9 = Util.Uni2Ksc(Util.checkString(req.getParameter("priority9")));
String priority10 = Util.Uni2Ksc(Util.checkString(req.getParameter("priority10")));
String reqfg1 = Util.Uni2Ksc(Util.checkString(req.getParameter("reqfg1")));
String reqfg2 = Util.Uni2Ksc(Util.checkString(req.getParameter("reqfg2")));
String reqfg3 = Util.Uni2Ksc(Util.checkString(req.getParameter("reqfg3")));
String reqfg4 = Util.Uni2Ksc(Util.checkString(req.getParameter("reqfg4")));
String reqfg5 = Util.Uni2Ksc(Util.checkString(req.getParameter("reqfg5")));
String reqfg6 = Util.Uni2Ksc(Util.checkString(req.getParameter("reqfg6")));
String reqfg7 = Util.Uni2Ksc(Util.checkString(req.getParameter("reqfg7")));
String reqfg8 = Util.Uni2Ksc(Util.checkString(req.getParameter("reqfg8")));
String reqfg9 = Util.Uni2Ksc(Util.checkString(req.getParameter("reqfg9")));
String reqfg10 = Util.Uni2Ksc(Util.checkString(req.getParameter("reqfg10")));
String q_stat1 = Util.Uni2Ksc(Util.checkString(req.getParameter("q_stat1")));
String q_stat2 = Util.Uni2Ksc(Util.checkString(req.getParameter("q_stat2")));
String q_stat3 = Util.Uni2Ksc(Util.checkString(req.getParameter("q_stat3")));
String q_stat4 = Util.Uni2Ksc(Util.checkString(req.getParameter("q_stat4")));
String q_stat5 = Util.Uni2Ksc(Util.checkString(req.getParameter("q_stat5")));
String q_stat6 = Util.Uni2Ksc(Util.checkString(req.getParameter("q_stat6")));
String q_stat7 = Util.Uni2Ksc(Util.checkString(req.getParameter("q_stat7")));
String q_stat8 = Util.Uni2Ksc(Util.checkString(req.getParameter("q_stat8")));
String q_stat9 = Util.Uni2Ksc(Util.checkString(req.getParameter("q_stat9")));
String q_stat10 = Util.Uni2Ksc(Util.checkString(req.getParameter("q_stat10")));
String qstbsyn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstbsyn1")));
String qstbsyn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstbsyn2")));
String qstbsyn3 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstbsyn3")));
String qstbsyn4 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstbsyn4")));
String qstbsyn5 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstbsyn5")));
String qstbsyn6 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstbsyn6")));
String qstbsyn7 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstbsyn7")));
String qstbsyn8 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstbsyn8")));
String qstbsyn9 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstbsyn9")));
String qstbsyn10 = Util.Uni2Ksc(Util.checkString(req.getParameter("qstbsyn10")));
String ans01_bastat1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans01_bastat1")));
String ans01_bastat2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans01_bastat2")));
String ans01_bastat3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans01_bastat3")));
String ans01_bastat4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans01_bastat4")));
String ans01_bastat5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans01_bastat5")));
String ans01_bastat6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans01_bastat6")));
String ans01_bastat7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans01_bastat7")));
String ans02_bastat1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans02_bastat1")));
String ans02_bastat2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans02_bastat2")));
String ans02_bastat3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans02_bastat3")));
String ans02_bastat4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans02_bastat4")));
String ans02_bastat5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans02_bastat5")));
String ans02_bastat6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans02_bastat6")));
String ans02_bastat7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans02_bastat7")));
String ans03_bastat1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans03_bastat1")));
String ans03_bastat2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans03_bastat2")));
String ans03_bastat3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans03_bastat3")));
String ans03_bastat4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans03_bastat4")));
String ans03_bastat5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans03_bastat5")));
String ans03_bastat6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans03_bastat6")));
String ans03_bastat7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans03_bastat7")));
String ans04_bastat1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans04_bastat1")));
String ans04_bastat2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans04_bastat2")));
String ans04_bastat3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans04_bastat3")));
String ans04_bastat4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans04_bastat4")));
String ans04_bastat5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans04_bastat5")));
String ans04_bastat6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans04_bastat6")));
String ans04_bastat7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans04_bastat7")));
String ans05_bastat1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans05_bastat1")));
String ans05_bastat2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans05_bastat2")));
String ans05_bastat3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans05_bastat3")));
String ans05_bastat4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans05_bastat4")));
String ans05_bastat5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans05_bastat5")));
String ans05_bastat6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans05_bastat6")));
String ans05_bastat7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans05_bastat7")));
String ans06_bastat1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans06_bastat1")));
String ans06_bastat2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans06_bastat2")));
String ans06_bastat3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans06_bastat3")));
String ans06_bastat4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans06_bastat4")));
String ans06_bastat5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans06_bastat5")));
String ans06_bastat6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans06_bastat6")));
String ans06_bastat7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans06_bastat7")));
String ans07_bastat1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans07_bastat1")));
String ans07_bastat2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans07_bastat2")));
String ans07_bastat3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans07_bastat3")));
String ans07_bastat4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans07_bastat4")));
String ans07_bastat5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans07_bastat5")));
String ans07_bastat6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans07_bastat6")));
String ans07_bastat7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans07_bastat7")));
String ans08_bastat1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans08_bastat1")));
String ans08_bastat2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans08_bastat2")));
String ans08_bastat3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans08_bastat3")));
String ans08_bastat4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans08_bastat4")));
String ans08_bastat5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans08_bastat5")));
String ans08_bastat6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans08_bastat6")));
String ans08_bastat7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans08_bastat7")));
String ans09_bastat1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans09_bastat1")));
String ans09_bastat2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans09_bastat2")));
String ans09_bastat3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans09_bastat3")));
String ans09_bastat4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans09_bastat4")));
String ans09_bastat5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans09_bastat5")));
String ans09_bastat6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans09_bastat6")));
String ans09_bastat7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans09_bastat7")));
String ans10_bastat1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans10_bastat1")));
String ans10_bastat2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans10_bastat2")));
String ans10_bastat3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans10_bastat3")));
String ans10_bastat4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans10_bastat4")));
String ans10_bastat5 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans10_bastat5")));
String ans10_bastat6 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans10_bastat6")));
String ans10_bastat7 = Util.Uni2Ksc(Util.checkString(req.getParameter("ans10_bastat7")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setSvyid(svyid);
dm.setSvynm(svynm);
dm.setSttdt(sttdt);
dm.setEnddt(enddt);
dm.setQstsnum(qstsnum);
dm.setUrl(url);
dm.setS_stat(s_stat);
dm.setGiftfg(giftfg);
dm.setMemo(memo);
dm.setCamptype(camptype);
dm.setBasicdt(basicdt);
dm.setQstid1(qstid1);
dm.setQstid2(qstid2);
dm.setQstid3(qstid3);
dm.setQstid4(qstid4);
dm.setQstid5(qstid5);
dm.setQstid6(qstid6);
dm.setQstid7(qstid7);
dm.setQstid8(qstid8);
dm.setQstid9(qstid9);
dm.setQstid10(qstid10);
dm.setCont1(cont1);
dm.setCont2(cont2);
dm.setCont3(cont3);
dm.setCont4(cont4);
dm.setCont5(cont5);
dm.setCont6(cont6);
dm.setCont7(cont7);
dm.setCont8(cont8);
dm.setCont9(cont9);
dm.setCont10(cont10);
dm.setQtstype1(qtstype1);
dm.setQtstype2(qtstype2);
dm.setQtstype3(qtstype3);
dm.setQtstype4(qtstype4);
dm.setQtstype5(qtstype5);
dm.setQtstype6(qtstype6);
dm.setQtstype7(qtstype7);
dm.setQtstype8(qtstype8);
dm.setQtstype9(qtstype9);
dm.setQtstype10(qtstype10);
dm.setAns1_1(ans1_1);
dm.setAns1_2(ans1_2);
dm.setAns1_3(ans1_3);
dm.setAns1_4(ans1_4);
dm.setAns1_5(ans1_5);
dm.setAns1_6(ans1_6);
dm.setAns1_7(ans1_7);
dm.setAns2_1(ans2_1);
dm.setAns2_2(ans2_2);
dm.setAns2_3(ans2_3);
dm.setAns2_4(ans2_4);
dm.setAns2_5(ans2_5);
dm.setAns2_6(ans2_6);
dm.setAns2_7(ans2_7);
dm.setAns3_1(ans3_1);
dm.setAns3_2(ans3_2);
dm.setAns3_3(ans3_3);
dm.setAns3_4(ans3_4);
dm.setAns3_5(ans3_5);
dm.setAns3_6(ans3_6);
dm.setAns3_7(ans3_7);
dm.setAns4_1(ans4_1);
dm.setAns4_2(ans4_2);
dm.setAns4_3(ans4_3);
dm.setAns4_4(ans4_4);
dm.setAns4_5(ans4_5);
dm.setAns4_6(ans4_6);
dm.setAns4_7(ans4_7);
dm.setAns5_1(ans5_1);
dm.setAns5_2(ans5_2);
dm.setAns5_3(ans5_3);
dm.setAns5_4(ans5_4);
dm.setAns5_5(ans5_5);
dm.setAns5_6(ans5_6);
dm.setAns5_7(ans5_7);
dm.setAns6_1(ans6_1);
dm.setAns6_2(ans6_2);
dm.setAns6_3(ans6_3);
dm.setAns6_4(ans6_4);
dm.setAns6_5(ans6_5);
dm.setAns6_6(ans6_6);
dm.setAns6_7(ans6_7);
dm.setAns7_1(ans7_1);
dm.setAns7_2(ans7_2);
dm.setAns7_3(ans7_3);
dm.setAns7_4(ans7_4);
dm.setAns7_5(ans7_5);
dm.setAns7_6(ans7_6);
dm.setAns7_7(ans7_7);
dm.setAns8_1(ans8_1);
dm.setAns8_2(ans8_2);
dm.setAns8_3(ans8_3);
dm.setAns8_4(ans8_4);
dm.setAns8_5(ans8_5);
dm.setAns8_6(ans8_6);
dm.setAns8_7(ans8_7);
dm.setAns9_1(ans9_1);
dm.setAns9_2(ans9_2);
dm.setAns9_3(ans9_3);
dm.setAns9_4(ans9_4);
dm.setAns9_5(ans9_5);
dm.setAns9_6(ans9_6);
dm.setAns9_7(ans9_7);
dm.setAns10_1(ans10_1);
dm.setAns10_2(ans10_2);
dm.setAns10_3(ans10_3);
dm.setAns10_4(ans10_4);
dm.setAns10_5(ans10_5);
dm.setAns10_6(ans10_6);
dm.setAns10_7(ans10_7);
dm.setObjcnt1(objcnt1);
dm.setObjcnt2(objcnt2);
dm.setObjcnt3(objcnt3);
dm.setObjcnt4(objcnt4);
dm.setObjcnt5(objcnt5);
dm.setObjcnt6(objcnt6);
dm.setObjcnt7(objcnt7);
dm.setObjcnt8(objcnt8);
dm.setObjcnt9(objcnt9);
dm.setObjcnt10(objcnt10);
dm.setSbjlgth1(sbjlgth1);
dm.setSbjlgth2(sbjlgth2);
dm.setSbjlgth3(sbjlgth3);
dm.setSbjlgth4(sbjlgth4);
dm.setSbjlgth5(sbjlgth5);
dm.setSbjlgth6(sbjlgth6);
dm.setSbjlgth7(sbjlgth7);
dm.setSbjlgth8(sbjlgth8);
dm.setSbjlgth9(sbjlgth9);
dm.setSbjlgth10(sbjlgth10);
dm.setPriority1(priority1);
dm.setPriority2(priority2);
dm.setPriority3(priority3);
dm.setPriority4(priority4);
dm.setPriority5(priority5);
dm.setPriority6(priority6);
dm.setPriority7(priority7);
dm.setPriority8(priority8);
dm.setPriority9(priority9);
dm.setPriority10(priority10);
dm.setReqfg1(reqfg1);
dm.setReqfg2(reqfg2);
dm.setReqfg3(reqfg3);
dm.setReqfg4(reqfg4);
dm.setReqfg5(reqfg5);
dm.setReqfg6(reqfg6);
dm.setReqfg7(reqfg7);
dm.setReqfg8(reqfg8);
dm.setReqfg9(reqfg9);
dm.setReqfg10(reqfg10);
dm.setQ_stat1(q_stat1);
dm.setQ_stat2(q_stat2);
dm.setQ_stat3(q_stat3);
dm.setQ_stat4(q_stat4);
dm.setQ_stat5(q_stat5);
dm.setQ_stat6(q_stat6);
dm.setQ_stat7(q_stat7);
dm.setQ_stat8(q_stat8);
dm.setQ_stat9(q_stat9);
dm.setQ_stat10(q_stat10);
dm.setQstbsyn1(qstbsyn1);
dm.setQstbsyn2(qstbsyn2);
dm.setQstbsyn3(qstbsyn3);
dm.setQstbsyn4(qstbsyn4);
dm.setQstbsyn5(qstbsyn5);
dm.setQstbsyn6(qstbsyn6);
dm.setQstbsyn7(qstbsyn7);
dm.setQstbsyn8(qstbsyn8);
dm.setQstbsyn9(qstbsyn9);
dm.setQstbsyn10(qstbsyn10);
dm.setAns01_bastat1(ans01_bastat1);
dm.setAns01_bastat2(ans01_bastat2);
dm.setAns01_bastat3(ans01_bastat3);
dm.setAns01_bastat4(ans01_bastat4);
dm.setAns01_bastat5(ans01_bastat5);
dm.setAns01_bastat6(ans01_bastat6);
dm.setAns01_bastat7(ans01_bastat7);
dm.setAns02_bastat1(ans02_bastat1);
dm.setAns02_bastat2(ans02_bastat2);
dm.setAns02_bastat3(ans02_bastat3);
dm.setAns02_bastat4(ans02_bastat4);
dm.setAns02_bastat5(ans02_bastat5);
dm.setAns02_bastat6(ans02_bastat6);
dm.setAns02_bastat7(ans02_bastat7);
dm.setAns03_bastat1(ans03_bastat1);
dm.setAns03_bastat2(ans03_bastat2);
dm.setAns03_bastat3(ans03_bastat3);
dm.setAns03_bastat4(ans03_bastat4);
dm.setAns03_bastat5(ans03_bastat5);
dm.setAns03_bastat6(ans03_bastat6);
dm.setAns03_bastat7(ans03_bastat7);
dm.setAns04_bastat1(ans04_bastat1);
dm.setAns04_bastat2(ans04_bastat2);
dm.setAns04_bastat3(ans04_bastat3);
dm.setAns04_bastat4(ans04_bastat4);
dm.setAns04_bastat5(ans04_bastat5);
dm.setAns04_bastat6(ans04_bastat6);
dm.setAns04_bastat7(ans04_bastat7);
dm.setAns05_bastat1(ans05_bastat1);
dm.setAns05_bastat2(ans05_bastat2);
dm.setAns05_bastat3(ans05_bastat3);
dm.setAns05_bastat4(ans05_bastat4);
dm.setAns05_bastat5(ans05_bastat5);
dm.setAns05_bastat6(ans05_bastat6);
dm.setAns05_bastat7(ans05_bastat7);
dm.setAns06_bastat1(ans06_bastat1);
dm.setAns06_bastat2(ans06_bastat2);
dm.setAns06_bastat3(ans06_bastat3);
dm.setAns06_bastat4(ans06_bastat4);
dm.setAns06_bastat5(ans06_bastat5);
dm.setAns06_bastat6(ans06_bastat6);
dm.setAns06_bastat7(ans06_bastat7);
dm.setAns07_bastat1(ans07_bastat1);
dm.setAns07_bastat2(ans07_bastat2);
dm.setAns07_bastat3(ans07_bastat3);
dm.setAns07_bastat4(ans07_bastat4);
dm.setAns07_bastat5(ans07_bastat5);
dm.setAns07_bastat6(ans07_bastat6);
dm.setAns07_bastat7(ans07_bastat7);
dm.setAns08_bastat1(ans08_bastat1);
dm.setAns08_bastat2(ans08_bastat2);
dm.setAns08_bastat3(ans08_bastat3);
dm.setAns08_bastat4(ans08_bastat4);
dm.setAns08_bastat5(ans08_bastat5);
dm.setAns08_bastat6(ans08_bastat6);
dm.setAns08_bastat7(ans08_bastat7);
dm.setAns09_bastat1(ans09_bastat1);
dm.setAns09_bastat2(ans09_bastat2);
dm.setAns09_bastat3(ans09_bastat3);
dm.setAns09_bastat4(ans09_bastat4);
dm.setAns09_bastat5(ans09_bastat5);
dm.setAns09_bastat6(ans09_bastat6);
dm.setAns09_bastat7(ans09_bastat7);
dm.setAns10_bastat1(ans10_bastat1);
dm.setAns10_bastat2(ans10_bastat2);
dm.setAns10_bastat3(ans10_bastat3);
dm.setAns10_bastat4(ans10_bastat4);
dm.setAns10_bastat5(ans10_bastat5);
dm.setAns10_bastat6(ans10_bastat6);
dm.setAns10_bastat7(ans10_bastat7);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 16 10:35:57 KST 2015 */