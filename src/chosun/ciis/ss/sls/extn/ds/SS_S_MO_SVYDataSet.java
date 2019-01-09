/***************************************************************************************************
* 파일명 : SS_S_MO_SVYDataSet.java
* 기능 :
* 작성일자 : 2015.11.11
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 *
 */


public class SS_S_MO_SVYDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String svyid;
	public String svynm;
	public String sttdt;
	public String enddt;
	public long qstsnum;
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

	public SS_S_MO_SVYDataSet(){}
	public SS_S_MO_SVYDataSet(String errcode, String errmsg, String svyid, String svynm, String sttdt, String enddt, long qstsnum, String url, String s_stat, String giftfg, String memo, String camptype, String basicdt, String qstid1, String qstid2, String qstid3, String qstid4, String qstid5, String qstid6, String qstid7, String qstid8, String qstid9, String qstid10, String cont1, String cont2, String cont3, String cont4, String cont5, String cont6, String cont7, String cont8, String cont9, String cont10, String qtstype1, String qtstype2, String qtstype3, String qtstype4, String qtstype5, String qtstype6, String qtstype7, String qtstype8, String qtstype9, String qtstype10, String ans1_1, String ans1_2, String ans1_3, String ans1_4, String ans1_5, String ans1_6, String ans1_7, String ans2_1, String ans2_2, String ans2_3, String ans2_4, String ans2_5, String ans2_6, String ans2_7, String ans3_1, String ans3_2, String ans3_3, String ans3_4, String ans3_5, String ans3_6, String ans3_7, String ans4_1, String ans4_2, String ans4_3, String ans4_4, String ans4_5, String ans4_6, String ans4_7, String ans5_1, String ans5_2, String ans5_3, String ans5_4, String ans5_5, String ans5_6, String ans5_7, String ans6_1, String ans6_2, String ans6_3, String ans6_4, String ans6_5, String ans6_6, String ans6_7, String ans7_1, String ans7_2, String ans7_3, String ans7_4, String ans7_5, String ans7_6, String ans7_7, String ans8_1, String ans8_2, String ans8_3, String ans8_4, String ans8_5, String ans8_6, String ans8_7, String ans9_1, String ans9_2, String ans9_3, String ans9_4, String ans9_5, String ans9_6, String ans9_7, String ans10_1, String ans10_2, String ans10_3, String ans10_4, String ans10_5, String ans10_6, String ans10_7, String objcnt1, String objcnt2, String objcnt3, String objcnt4, String objcnt5, String objcnt6, String objcnt7, String objcnt8, String objcnt9, String objcnt10, String sbjlgth1, String sbjlgth2, String sbjlgth3, String sbjlgth4, String sbjlgth5, String sbjlgth6, String sbjlgth7, String sbjlgth8, String sbjlgth9, String sbjlgth10, String priority1, String priority2, String priority3, String priority4, String priority5, String priority6, String priority7, String priority8, String priority9, String priority10, String reqfg1, String reqfg2, String reqfg3, String reqfg4, String reqfg5, String reqfg6, String reqfg7, String reqfg8, String reqfg9, String reqfg10, String q_stat1, String q_stat2, String q_stat3, String q_stat4, String q_stat5, String q_stat6, String q_stat7, String q_stat8, String q_stat9, String q_stat10, String qstbsyn1, String qstbsyn2, String qstbsyn3, String qstbsyn4, String qstbsyn5, String qstbsyn6, String qstbsyn7, String qstbsyn8, String qstbsyn9, String qstbsyn10, String ans01_bastat1, String ans01_bastat2, String ans01_bastat3, String ans01_bastat4, String ans01_bastat5, String ans01_bastat6, String ans01_bastat7, String ans02_bastat1, String ans02_bastat2, String ans02_bastat3, String ans02_bastat4, String ans02_bastat5, String ans02_bastat6, String ans02_bastat7, String ans03_bastat1, String ans03_bastat2, String ans03_bastat3, String ans03_bastat4, String ans03_bastat5, String ans03_bastat6, String ans03_bastat7, String ans04_bastat1, String ans04_bastat2, String ans04_bastat3, String ans04_bastat4, String ans04_bastat5, String ans04_bastat6, String ans04_bastat7, String ans05_bastat1, String ans05_bastat2, String ans05_bastat3, String ans05_bastat4, String ans05_bastat5, String ans05_bastat6, String ans05_bastat7, String ans06_bastat1, String ans06_bastat2, String ans06_bastat3, String ans06_bastat4, String ans06_bastat5, String ans06_bastat6, String ans06_bastat7, String ans07_bastat1, String ans07_bastat2, String ans07_bastat3, String ans07_bastat4, String ans07_bastat5, String ans07_bastat6, String ans07_bastat7, String ans08_bastat1, String ans08_bastat2, String ans08_bastat3, String ans08_bastat4, String ans08_bastat5, String ans08_bastat6, String ans08_bastat7, String ans09_bastat1, String ans09_bastat2, String ans09_bastat3, String ans09_bastat4, String ans09_bastat5, String ans09_bastat6, String ans09_bastat7, String ans10_bastat1, String ans10_bastat2, String ans10_bastat3, String ans10_bastat4, String ans10_bastat5, String ans10_bastat6, String ans10_bastat7){
		this.errcode = errcode;
		this.errmsg = errmsg;
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

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
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

	public void setQstsnum(long qstsnum){
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

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
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

	public long getQstsnum(){
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

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.svyid = Util.checkString(cstmt.getString(4));
		this.svynm = Util.checkString(cstmt.getString(5));
		this.sttdt = Util.checkString(cstmt.getString(6));
		this.enddt = Util.checkString(cstmt.getString(7));
		this.qstsnum = cstmt.getLong(8);
		this.url = Util.checkString(cstmt.getString(9));
		this.s_stat = Util.checkString(cstmt.getString(10));
		this.giftfg = Util.checkString(cstmt.getString(11));
		this.memo = Util.checkString(cstmt.getString(12));
		this.camptype = Util.checkString(cstmt.getString(13));
		this.basicdt = Util.checkString(cstmt.getString(14));
		this.qstid1 = Util.checkString(cstmt.getString(15));
		this.qstid2 = Util.checkString(cstmt.getString(16));
		this.qstid3 = Util.checkString(cstmt.getString(17));
		this.qstid4 = Util.checkString(cstmt.getString(18));
		this.qstid5 = Util.checkString(cstmt.getString(19));
		this.qstid6 = Util.checkString(cstmt.getString(20));
		this.qstid7 = Util.checkString(cstmt.getString(21));
		this.qstid8 = Util.checkString(cstmt.getString(22));
		this.qstid9 = Util.checkString(cstmt.getString(23));
		this.qstid10 = Util.checkString(cstmt.getString(24));
		this.cont1 = Util.checkString(cstmt.getString(25));
		this.cont2 = Util.checkString(cstmt.getString(26));
		this.cont3 = Util.checkString(cstmt.getString(27));
		this.cont4 = Util.checkString(cstmt.getString(28));
		this.cont5 = Util.checkString(cstmt.getString(29));
		this.cont6 = Util.checkString(cstmt.getString(30));
		this.cont7 = Util.checkString(cstmt.getString(31));
		this.cont8 = Util.checkString(cstmt.getString(32));
		this.cont9 = Util.checkString(cstmt.getString(33));
		this.cont10 = Util.checkString(cstmt.getString(34));
		this.qtstype1 = Util.checkString(cstmt.getString(35));
		this.qtstype2 = Util.checkString(cstmt.getString(36));
		this.qtstype3 = Util.checkString(cstmt.getString(37));
		this.qtstype4 = Util.checkString(cstmt.getString(38));
		this.qtstype5 = Util.checkString(cstmt.getString(39));
		this.qtstype6 = Util.checkString(cstmt.getString(40));
		this.qtstype7 = Util.checkString(cstmt.getString(41));
		this.qtstype8 = Util.checkString(cstmt.getString(42));
		this.qtstype9 = Util.checkString(cstmt.getString(43));
		this.qtstype10 = Util.checkString(cstmt.getString(44));
		this.ans1_1 = Util.checkString(cstmt.getString(45));
		this.ans1_2 = Util.checkString(cstmt.getString(46));
		this.ans1_3 = Util.checkString(cstmt.getString(47));
		this.ans1_4 = Util.checkString(cstmt.getString(48));
		this.ans1_5 = Util.checkString(cstmt.getString(49));
		this.ans1_6 = Util.checkString(cstmt.getString(50));
		this.ans1_7 = Util.checkString(cstmt.getString(51));
		this.ans2_1 = Util.checkString(cstmt.getString(52));
		this.ans2_2 = Util.checkString(cstmt.getString(53));
		this.ans2_3 = Util.checkString(cstmt.getString(54));
		this.ans2_4 = Util.checkString(cstmt.getString(55));
		this.ans2_5 = Util.checkString(cstmt.getString(56));
		this.ans2_6 = Util.checkString(cstmt.getString(57));
		this.ans2_7 = Util.checkString(cstmt.getString(58));
		this.ans3_1 = Util.checkString(cstmt.getString(59));
		this.ans3_2 = Util.checkString(cstmt.getString(60));
		this.ans3_3 = Util.checkString(cstmt.getString(61));
		this.ans3_4 = Util.checkString(cstmt.getString(62));
		this.ans3_5 = Util.checkString(cstmt.getString(63));
		this.ans3_6 = Util.checkString(cstmt.getString(64));
		this.ans3_7 = Util.checkString(cstmt.getString(65));
		this.ans4_1 = Util.checkString(cstmt.getString(66));
		this.ans4_2 = Util.checkString(cstmt.getString(67));
		this.ans4_3 = Util.checkString(cstmt.getString(68));
		this.ans4_4 = Util.checkString(cstmt.getString(69));
		this.ans4_5 = Util.checkString(cstmt.getString(70));
		this.ans4_6 = Util.checkString(cstmt.getString(71));
		this.ans4_7 = Util.checkString(cstmt.getString(72));
		this.ans5_1 = Util.checkString(cstmt.getString(73));
		this.ans5_2 = Util.checkString(cstmt.getString(74));
		this.ans5_3 = Util.checkString(cstmt.getString(75));
		this.ans5_4 = Util.checkString(cstmt.getString(76));
		this.ans5_5 = Util.checkString(cstmt.getString(77));
		this.ans5_6 = Util.checkString(cstmt.getString(78));
		this.ans5_7 = Util.checkString(cstmt.getString(79));
		this.ans6_1 = Util.checkString(cstmt.getString(80));
		this.ans6_2 = Util.checkString(cstmt.getString(81));
		this.ans6_3 = Util.checkString(cstmt.getString(82));
		this.ans6_4 = Util.checkString(cstmt.getString(83));
		this.ans6_5 = Util.checkString(cstmt.getString(84));
		this.ans6_6 = Util.checkString(cstmt.getString(85));
		this.ans6_7 = Util.checkString(cstmt.getString(86));
		this.ans7_1 = Util.checkString(cstmt.getString(87));
		this.ans7_2 = Util.checkString(cstmt.getString(88));
		this.ans7_3 = Util.checkString(cstmt.getString(89));
		this.ans7_4 = Util.checkString(cstmt.getString(90));
		this.ans7_5 = Util.checkString(cstmt.getString(91));
		this.ans7_6 = Util.checkString(cstmt.getString(92));
		this.ans7_7 = Util.checkString(cstmt.getString(93));
		this.ans8_1 = Util.checkString(cstmt.getString(94));
		this.ans8_2 = Util.checkString(cstmt.getString(95));
		this.ans8_3 = Util.checkString(cstmt.getString(96));
		this.ans8_4 = Util.checkString(cstmt.getString(97));
		this.ans8_5 = Util.checkString(cstmt.getString(98));
		this.ans8_6 = Util.checkString(cstmt.getString(99));
		this.ans8_7 = Util.checkString(cstmt.getString(100));
		this.ans9_1 = Util.checkString(cstmt.getString(101));
		this.ans9_2 = Util.checkString(cstmt.getString(102));
		this.ans9_3 = Util.checkString(cstmt.getString(103));
		this.ans9_4 = Util.checkString(cstmt.getString(104));
		this.ans9_5 = Util.checkString(cstmt.getString(105));
		this.ans9_6 = Util.checkString(cstmt.getString(106));
		this.ans9_7 = Util.checkString(cstmt.getString(107));
		this.ans10_1 = Util.checkString(cstmt.getString(108));
		this.ans10_2 = Util.checkString(cstmt.getString(109));
		this.ans10_3 = Util.checkString(cstmt.getString(110));
		this.ans10_4 = Util.checkString(cstmt.getString(111));
		this.ans10_5 = Util.checkString(cstmt.getString(112));
		this.ans10_6 = Util.checkString(cstmt.getString(113));
		this.ans10_7 = Util.checkString(cstmt.getString(114));
		this.objcnt1 = Util.checkString(cstmt.getString(115));
		this.objcnt2 = Util.checkString(cstmt.getString(116));
		this.objcnt3 = Util.checkString(cstmt.getString(117));
		this.objcnt4 = Util.checkString(cstmt.getString(118));
		this.objcnt5 = Util.checkString(cstmt.getString(119));
		this.objcnt6 = Util.checkString(cstmt.getString(120));
		this.objcnt7 = Util.checkString(cstmt.getString(121));
		this.objcnt8 = Util.checkString(cstmt.getString(122));
		this.objcnt9 = Util.checkString(cstmt.getString(123));
		this.objcnt10 = Util.checkString(cstmt.getString(124));
		this.sbjlgth1 = Util.checkString(cstmt.getString(125));
		this.sbjlgth2 = Util.checkString(cstmt.getString(126));
		this.sbjlgth3 = Util.checkString(cstmt.getString(127));
		this.sbjlgth4 = Util.checkString(cstmt.getString(128));
		this.sbjlgth5 = Util.checkString(cstmt.getString(129));
		this.sbjlgth6 = Util.checkString(cstmt.getString(130));
		this.sbjlgth7 = Util.checkString(cstmt.getString(131));
		this.sbjlgth8 = Util.checkString(cstmt.getString(132));
		this.sbjlgth9 = Util.checkString(cstmt.getString(133));
		this.sbjlgth10 = Util.checkString(cstmt.getString(134));
		this.priority1 = Util.checkString(cstmt.getString(135));
		this.priority2 = Util.checkString(cstmt.getString(136));
		this.priority3 = Util.checkString(cstmt.getString(137));
		this.priority4 = Util.checkString(cstmt.getString(138));
		this.priority5 = Util.checkString(cstmt.getString(139));
		this.priority6 = Util.checkString(cstmt.getString(140));
		this.priority7 = Util.checkString(cstmt.getString(141));
		this.priority8 = Util.checkString(cstmt.getString(142));
		this.priority9 = Util.checkString(cstmt.getString(143));
		this.priority10 = Util.checkString(cstmt.getString(144));
		this.reqfg1 = Util.checkString(cstmt.getString(145));
		this.reqfg2 = Util.checkString(cstmt.getString(146));
		this.reqfg3 = Util.checkString(cstmt.getString(147));
		this.reqfg4 = Util.checkString(cstmt.getString(148));
		this.reqfg5 = Util.checkString(cstmt.getString(149));
		this.reqfg6 = Util.checkString(cstmt.getString(150));
		this.reqfg7 = Util.checkString(cstmt.getString(151));
		this.reqfg8 = Util.checkString(cstmt.getString(152));
		this.reqfg9 = Util.checkString(cstmt.getString(153));
		this.reqfg10 = Util.checkString(cstmt.getString(154));
		this.q_stat1 = Util.checkString(cstmt.getString(155));
		this.q_stat2 = Util.checkString(cstmt.getString(156));
		this.q_stat3 = Util.checkString(cstmt.getString(157));
		this.q_stat4 = Util.checkString(cstmt.getString(158));
		this.q_stat5 = Util.checkString(cstmt.getString(159));
		this.q_stat6 = Util.checkString(cstmt.getString(160));
		this.q_stat7 = Util.checkString(cstmt.getString(161));
		this.q_stat8 = Util.checkString(cstmt.getString(162));
		this.q_stat9 = Util.checkString(cstmt.getString(163));
		this.q_stat10 = Util.checkString(cstmt.getString(164));
		this.qstbsyn1 = Util.checkString(cstmt.getString(165));
		this.qstbsyn2 = Util.checkString(cstmt.getString(166));
		this.qstbsyn3 = Util.checkString(cstmt.getString(167));
		this.qstbsyn4 = Util.checkString(cstmt.getString(168));
		this.qstbsyn5 = Util.checkString(cstmt.getString(169));
		this.qstbsyn6 = Util.checkString(cstmt.getString(170));
		this.qstbsyn7 = Util.checkString(cstmt.getString(171));
		this.qstbsyn8 = Util.checkString(cstmt.getString(172));
		this.qstbsyn9 = Util.checkString(cstmt.getString(173));
		this.qstbsyn10 = Util.checkString(cstmt.getString(174));
		this.ans01_bastat1 = Util.checkString(cstmt.getString(175));
		this.ans01_bastat2 = Util.checkString(cstmt.getString(176));
		this.ans01_bastat3 = Util.checkString(cstmt.getString(177));
		this.ans01_bastat4 = Util.checkString(cstmt.getString(178));
		this.ans01_bastat5 = Util.checkString(cstmt.getString(179));
		this.ans01_bastat6 = Util.checkString(cstmt.getString(180));
		this.ans01_bastat7 = Util.checkString(cstmt.getString(181));
		this.ans02_bastat1 = Util.checkString(cstmt.getString(182));
		this.ans02_bastat2 = Util.checkString(cstmt.getString(183));
		this.ans02_bastat3 = Util.checkString(cstmt.getString(184));
		this.ans02_bastat4 = Util.checkString(cstmt.getString(185));
		this.ans02_bastat5 = Util.checkString(cstmt.getString(186));
		this.ans02_bastat6 = Util.checkString(cstmt.getString(187));
		this.ans02_bastat7 = Util.checkString(cstmt.getString(188));
		this.ans03_bastat1 = Util.checkString(cstmt.getString(189));
		this.ans03_bastat2 = Util.checkString(cstmt.getString(190));
		this.ans03_bastat3 = Util.checkString(cstmt.getString(191));
		this.ans03_bastat4 = Util.checkString(cstmt.getString(192));
		this.ans03_bastat5 = Util.checkString(cstmt.getString(193));
		this.ans03_bastat6 = Util.checkString(cstmt.getString(194));
		this.ans03_bastat7 = Util.checkString(cstmt.getString(195));
		this.ans04_bastat1 = Util.checkString(cstmt.getString(196));
		this.ans04_bastat2 = Util.checkString(cstmt.getString(197));
		this.ans04_bastat3 = Util.checkString(cstmt.getString(198));
		this.ans04_bastat4 = Util.checkString(cstmt.getString(199));
		this.ans04_bastat5 = Util.checkString(cstmt.getString(200));
		this.ans04_bastat6 = Util.checkString(cstmt.getString(201));
		this.ans04_bastat7 = Util.checkString(cstmt.getString(202));
		this.ans05_bastat1 = Util.checkString(cstmt.getString(203));
		this.ans05_bastat2 = Util.checkString(cstmt.getString(204));
		this.ans05_bastat3 = Util.checkString(cstmt.getString(205));
		this.ans05_bastat4 = Util.checkString(cstmt.getString(206));
		this.ans05_bastat5 = Util.checkString(cstmt.getString(207));
		this.ans05_bastat6 = Util.checkString(cstmt.getString(208));
		this.ans05_bastat7 = Util.checkString(cstmt.getString(209));
		this.ans06_bastat1 = Util.checkString(cstmt.getString(210));
		this.ans06_bastat2 = Util.checkString(cstmt.getString(211));
		this.ans06_bastat3 = Util.checkString(cstmt.getString(212));
		this.ans06_bastat4 = Util.checkString(cstmt.getString(213));
		this.ans06_bastat5 = Util.checkString(cstmt.getString(214));
		this.ans06_bastat6 = Util.checkString(cstmt.getString(215));
		this.ans06_bastat7 = Util.checkString(cstmt.getString(216));
		this.ans07_bastat1 = Util.checkString(cstmt.getString(217));
		this.ans07_bastat2 = Util.checkString(cstmt.getString(218));
		this.ans07_bastat3 = Util.checkString(cstmt.getString(219));
		this.ans07_bastat4 = Util.checkString(cstmt.getString(220));
		this.ans07_bastat5 = Util.checkString(cstmt.getString(221));
		this.ans07_bastat6 = Util.checkString(cstmt.getString(222));
		this.ans07_bastat7 = Util.checkString(cstmt.getString(223));
		this.ans08_bastat1 = Util.checkString(cstmt.getString(224));
		this.ans08_bastat2 = Util.checkString(cstmt.getString(225));
		this.ans08_bastat3 = Util.checkString(cstmt.getString(226));
		this.ans08_bastat4 = Util.checkString(cstmt.getString(227));
		this.ans08_bastat5 = Util.checkString(cstmt.getString(228));
		this.ans08_bastat6 = Util.checkString(cstmt.getString(229));
		this.ans08_bastat7 = Util.checkString(cstmt.getString(230));
		this.ans09_bastat1 = Util.checkString(cstmt.getString(231));
		this.ans09_bastat2 = Util.checkString(cstmt.getString(232));
		this.ans09_bastat3 = Util.checkString(cstmt.getString(233));
		this.ans09_bastat4 = Util.checkString(cstmt.getString(234));
		this.ans09_bastat5 = Util.checkString(cstmt.getString(235));
		this.ans09_bastat6 = Util.checkString(cstmt.getString(236));
		this.ans09_bastat7 = Util.checkString(cstmt.getString(237));
		this.ans10_bastat1 = Util.checkString(cstmt.getString(238));
		this.ans10_bastat2 = Util.checkString(cstmt.getString(239));
		this.ans10_bastat3 = Util.checkString(cstmt.getString(240));
		this.ans10_bastat4 = Util.checkString(cstmt.getString(241));
		this.ans10_bastat5 = Util.checkString(cstmt.getString(242));
		this.ans10_bastat6 = Util.checkString(cstmt.getString(243));
		this.ans10_bastat7 = Util.checkString(cstmt.getString(244));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_MO_SVYDataSet ds = (SS_S_MO_SVYDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSvyid()%>
<%= ds.getSvynm()%>
<%= ds.getSttdt()%>
<%= ds.getEnddt()%>
<%= ds.getQstsnum()%>
<%= ds.getUrl()%>
<%= ds.getS_stat()%>
<%= ds.getGiftfg()%>
<%= ds.getMemo()%>
<%= ds.getCamptype()%>
<%= ds.getBasicdt()%>
<%= ds.getQstid1()%>
<%= ds.getQstid2()%>
<%= ds.getQstid3()%>
<%= ds.getQstid4()%>
<%= ds.getQstid5()%>
<%= ds.getQstid6()%>
<%= ds.getQstid7()%>
<%= ds.getQstid8()%>
<%= ds.getQstid9()%>
<%= ds.getQstid10()%>
<%= ds.getCont1()%>
<%= ds.getCont2()%>
<%= ds.getCont3()%>
<%= ds.getCont4()%>
<%= ds.getCont5()%>
<%= ds.getCont6()%>
<%= ds.getCont7()%>
<%= ds.getCont8()%>
<%= ds.getCont9()%>
<%= ds.getCont10()%>
<%= ds.getQtstype1()%>
<%= ds.getQtstype2()%>
<%= ds.getQtstype3()%>
<%= ds.getQtstype4()%>
<%= ds.getQtstype5()%>
<%= ds.getQtstype6()%>
<%= ds.getQtstype7()%>
<%= ds.getQtstype8()%>
<%= ds.getQtstype9()%>
<%= ds.getQtstype10()%>
<%= ds.getAns1_1()%>
<%= ds.getAns1_2()%>
<%= ds.getAns1_3()%>
<%= ds.getAns1_4()%>
<%= ds.getAns1_5()%>
<%= ds.getAns1_6()%>
<%= ds.getAns1_7()%>
<%= ds.getAns2_1()%>
<%= ds.getAns2_2()%>
<%= ds.getAns2_3()%>
<%= ds.getAns2_4()%>
<%= ds.getAns2_5()%>
<%= ds.getAns2_6()%>
<%= ds.getAns2_7()%>
<%= ds.getAns3_1()%>
<%= ds.getAns3_2()%>
<%= ds.getAns3_3()%>
<%= ds.getAns3_4()%>
<%= ds.getAns3_5()%>
<%= ds.getAns3_6()%>
<%= ds.getAns3_7()%>
<%= ds.getAns4_1()%>
<%= ds.getAns4_2()%>
<%= ds.getAns4_3()%>
<%= ds.getAns4_4()%>
<%= ds.getAns4_5()%>
<%= ds.getAns4_6()%>
<%= ds.getAns4_7()%>
<%= ds.getAns5_1()%>
<%= ds.getAns5_2()%>
<%= ds.getAns5_3()%>
<%= ds.getAns5_4()%>
<%= ds.getAns5_5()%>
<%= ds.getAns5_6()%>
<%= ds.getAns5_7()%>
<%= ds.getAns6_1()%>
<%= ds.getAns6_2()%>
<%= ds.getAns6_3()%>
<%= ds.getAns6_4()%>
<%= ds.getAns6_5()%>
<%= ds.getAns6_6()%>
<%= ds.getAns6_7()%>
<%= ds.getAns7_1()%>
<%= ds.getAns7_2()%>
<%= ds.getAns7_3()%>
<%= ds.getAns7_4()%>
<%= ds.getAns7_5()%>
<%= ds.getAns7_6()%>
<%= ds.getAns7_7()%>
<%= ds.getAns8_1()%>
<%= ds.getAns8_2()%>
<%= ds.getAns8_3()%>
<%= ds.getAns8_4()%>
<%= ds.getAns8_5()%>
<%= ds.getAns8_6()%>
<%= ds.getAns8_7()%>
<%= ds.getAns9_1()%>
<%= ds.getAns9_2()%>
<%= ds.getAns9_3()%>
<%= ds.getAns9_4()%>
<%= ds.getAns9_5()%>
<%= ds.getAns9_6()%>
<%= ds.getAns9_7()%>
<%= ds.getAns10_1()%>
<%= ds.getAns10_2()%>
<%= ds.getAns10_3()%>
<%= ds.getAns10_4()%>
<%= ds.getAns10_5()%>
<%= ds.getAns10_6()%>
<%= ds.getAns10_7()%>
<%= ds.getObjcnt1()%>
<%= ds.getObjcnt2()%>
<%= ds.getObjcnt3()%>
<%= ds.getObjcnt4()%>
<%= ds.getObjcnt5()%>
<%= ds.getObjcnt6()%>
<%= ds.getObjcnt7()%>
<%= ds.getObjcnt8()%>
<%= ds.getObjcnt9()%>
<%= ds.getObjcnt10()%>
<%= ds.getSbjlgth1()%>
<%= ds.getSbjlgth2()%>
<%= ds.getSbjlgth3()%>
<%= ds.getSbjlgth4()%>
<%= ds.getSbjlgth5()%>
<%= ds.getSbjlgth6()%>
<%= ds.getSbjlgth7()%>
<%= ds.getSbjlgth8()%>
<%= ds.getSbjlgth9()%>
<%= ds.getSbjlgth10()%>
<%= ds.getPriority1()%>
<%= ds.getPriority2()%>
<%= ds.getPriority3()%>
<%= ds.getPriority4()%>
<%= ds.getPriority5()%>
<%= ds.getPriority6()%>
<%= ds.getPriority7()%>
<%= ds.getPriority8()%>
<%= ds.getPriority9()%>
<%= ds.getPriority10()%>
<%= ds.getReqfg1()%>
<%= ds.getReqfg2()%>
<%= ds.getReqfg3()%>
<%= ds.getReqfg4()%>
<%= ds.getReqfg5()%>
<%= ds.getReqfg6()%>
<%= ds.getReqfg7()%>
<%= ds.getReqfg8()%>
<%= ds.getReqfg9()%>
<%= ds.getReqfg10()%>
<%= ds.getQ_stat1()%>
<%= ds.getQ_stat2()%>
<%= ds.getQ_stat3()%>
<%= ds.getQ_stat4()%>
<%= ds.getQ_stat5()%>
<%= ds.getQ_stat6()%>
<%= ds.getQ_stat7()%>
<%= ds.getQ_stat8()%>
<%= ds.getQ_stat9()%>
<%= ds.getQ_stat10()%>
<%= ds.getQstbsyn1()%>
<%= ds.getQstbsyn2()%>
<%= ds.getQstbsyn3()%>
<%= ds.getQstbsyn4()%>
<%= ds.getQstbsyn5()%>
<%= ds.getQstbsyn6()%>
<%= ds.getQstbsyn7()%>
<%= ds.getQstbsyn8()%>
<%= ds.getQstbsyn9()%>
<%= ds.getQstbsyn10()%>
<%= ds.getAns01_bastat1()%>
<%= ds.getAns01_bastat2()%>
<%= ds.getAns01_bastat3()%>
<%= ds.getAns01_bastat4()%>
<%= ds.getAns01_bastat5()%>
<%= ds.getAns01_bastat6()%>
<%= ds.getAns01_bastat7()%>
<%= ds.getAns02_bastat1()%>
<%= ds.getAns02_bastat2()%>
<%= ds.getAns02_bastat3()%>
<%= ds.getAns02_bastat4()%>
<%= ds.getAns02_bastat5()%>
<%= ds.getAns02_bastat6()%>
<%= ds.getAns02_bastat7()%>
<%= ds.getAns03_bastat1()%>
<%= ds.getAns03_bastat2()%>
<%= ds.getAns03_bastat3()%>
<%= ds.getAns03_bastat4()%>
<%= ds.getAns03_bastat5()%>
<%= ds.getAns03_bastat6()%>
<%= ds.getAns03_bastat7()%>
<%= ds.getAns04_bastat1()%>
<%= ds.getAns04_bastat2()%>
<%= ds.getAns04_bastat3()%>
<%= ds.getAns04_bastat4()%>
<%= ds.getAns04_bastat5()%>
<%= ds.getAns04_bastat6()%>
<%= ds.getAns04_bastat7()%>
<%= ds.getAns05_bastat1()%>
<%= ds.getAns05_bastat2()%>
<%= ds.getAns05_bastat3()%>
<%= ds.getAns05_bastat4()%>
<%= ds.getAns05_bastat5()%>
<%= ds.getAns05_bastat6()%>
<%= ds.getAns05_bastat7()%>
<%= ds.getAns06_bastat1()%>
<%= ds.getAns06_bastat2()%>
<%= ds.getAns06_bastat3()%>
<%= ds.getAns06_bastat4()%>
<%= ds.getAns06_bastat5()%>
<%= ds.getAns06_bastat6()%>
<%= ds.getAns06_bastat7()%>
<%= ds.getAns07_bastat1()%>
<%= ds.getAns07_bastat2()%>
<%= ds.getAns07_bastat3()%>
<%= ds.getAns07_bastat4()%>
<%= ds.getAns07_bastat5()%>
<%= ds.getAns07_bastat6()%>
<%= ds.getAns07_bastat7()%>
<%= ds.getAns08_bastat1()%>
<%= ds.getAns08_bastat2()%>
<%= ds.getAns08_bastat3()%>
<%= ds.getAns08_bastat4()%>
<%= ds.getAns08_bastat5()%>
<%= ds.getAns08_bastat6()%>
<%= ds.getAns08_bastat7()%>
<%= ds.getAns09_bastat1()%>
<%= ds.getAns09_bastat2()%>
<%= ds.getAns09_bastat3()%>
<%= ds.getAns09_bastat4()%>
<%= ds.getAns09_bastat5()%>
<%= ds.getAns09_bastat6()%>
<%= ds.getAns09_bastat7()%>
<%= ds.getAns10_bastat1()%>
<%= ds.getAns10_bastat2()%>
<%= ds.getAns10_bastat3()%>
<%= ds.getAns10_bastat4()%>
<%= ds.getAns10_bastat5()%>
<%= ds.getAns10_bastat6()%>
<%= ds.getAns10_bastat7()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 15 20:59:50 KST 2015 */