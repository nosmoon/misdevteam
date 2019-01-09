/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.evlu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.ds.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_5502_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evlu_yy;
	public String tms_clsf;
	public String cd;
	public String t1;
	public String t2;
	public String t3;
	public String t4;
	public String t5;
	public String t6;
	public String t7;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String flag;

	public HD_EVLU_5502_ADM(){}
	public HD_EVLU_5502_ADM(String cmpy_cd, String evlu_yy, String tms_clsf, String cd, String t1, String t2, String t3, String t4, String t5, String t6, String t7, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String flag){
		this.cmpy_cd = cmpy_cd;
		this.evlu_yy = evlu_yy;
		this.tms_clsf = tms_clsf;
		this.cd = cd;
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
		this.t5 = t5;
		this.t6 = t6;
		this.t7 = t7;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setT1(String t1){
		this.t1 = t1;
	}

	public void setT2(String t2){
		this.t2 = t2;
	}

	public void setT3(String t3){
		this.t3 = t3;
	}

	public void setT4(String t4){
		this.t4 = t4;
	}

	public void setT5(String t5){
		this.t5 = t5;
	}

	public void setT6(String t6){
		this.t6 = t6;
	}

	public void setT7(String t7){
		this.t7 = t7;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getCd(){
		return this.cd;
	}

	public String getT1(){
		return this.t1;
	}

	public String getT2(){
		return this.t2;
	}

	public String getT3(){
		return this.t3;
	}

	public String getT4(){
		return this.t4;
	}

	public String getT5(){
		return this.t5;
	}

	public String getT6(){
		return this.t6;
	}

	public String getT7(){
		return this.t7;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EVLU_5502_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EVLU_5502_ADM dm = (HD_EVLU_5502_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.evlu_yy);
		cstmt.setString(6, dm.tms_clsf);
		cstmt.setString(7, dm.cd);
		cstmt.setString(8, dm.t1);
		cstmt.setString(9, dm.t2);
		cstmt.setString(10, dm.t3);
		cstmt.setString(11, dm.t4);
		cstmt.setString(12, dm.t5);
		cstmt.setString(13, dm.t6);
		cstmt.setString(14, dm.t7);
		cstmt.setString(15, dm.incmg_pers_ipadd);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.chg_pers);
		cstmt.setString(18, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_EVLU_5502_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("evlu_yy = [" + getEvlu_yy() + "]");
		System.out.println("tms_clsf = [" + getTms_clsf() + "]");
		System.out.println("cd = [" + getCd() + "]");
		System.out.println("t1 = [" + getT1() + "]");
		System.out.println("t2 = [" + getT2() + "]");
		System.out.println("t3 = [" + getT3() + "]");
		System.out.println("t4 = [" + getT4() + "]");
		System.out.println("t5 = [" + getT5() + "]");
		System.out.println("t6 = [" + getT6() + "]");
		System.out.println("t7 = [" + getT7() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("flag = [" + getFlag() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String evlu_yy = req.getParameter("evlu_yy");
if( evlu_yy == null){
	System.out.println(this.toString+" : evlu_yy is null" );
}else{
	System.out.println(this.toString+" : evlu_yy is "+evlu_yy );
}
String tms_clsf = req.getParameter("tms_clsf");
if( tms_clsf == null){
	System.out.println(this.toString+" : tms_clsf is null" );
}else{
	System.out.println(this.toString+" : tms_clsf is "+tms_clsf );
}
String cd = req.getParameter("cd");
if( cd == null){
	System.out.println(this.toString+" : cd is null" );
}else{
	System.out.println(this.toString+" : cd is "+cd );
}
String t1 = req.getParameter("t1");
if( t1 == null){
	System.out.println(this.toString+" : t1 is null" );
}else{
	System.out.println(this.toString+" : t1 is "+t1 );
}
String t2 = req.getParameter("t2");
if( t2 == null){
	System.out.println(this.toString+" : t2 is null" );
}else{
	System.out.println(this.toString+" : t2 is "+t2 );
}
String t3 = req.getParameter("t3");
if( t3 == null){
	System.out.println(this.toString+" : t3 is null" );
}else{
	System.out.println(this.toString+" : t3 is "+t3 );
}
String t4 = req.getParameter("t4");
if( t4 == null){
	System.out.println(this.toString+" : t4 is null" );
}else{
	System.out.println(this.toString+" : t4 is "+t4 );
}
String t5 = req.getParameter("t5");
if( t5 == null){
	System.out.println(this.toString+" : t5 is null" );
}else{
	System.out.println(this.toString+" : t5 is "+t5 );
}
String t6 = req.getParameter("t6");
if( t6 == null){
	System.out.println(this.toString+" : t6 is null" );
}else{
	System.out.println(this.toString+" : t6 is "+t6 );
}
String t7 = req.getParameter("t7");
if( t7 == null){
	System.out.println(this.toString+" : t7 is null" );
}else{
	System.out.println(this.toString+" : t7 is "+t7 );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
String tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
String cd = Util.checkString(req.getParameter("cd"));
String t1 = Util.checkString(req.getParameter("t1"));
String t2 = Util.checkString(req.getParameter("t2"));
String t3 = Util.checkString(req.getParameter("t3"));
String t4 = Util.checkString(req.getParameter("t4"));
String t5 = Util.checkString(req.getParameter("t5"));
String t6 = Util.checkString(req.getParameter("t6"));
String t7 = Util.checkString(req.getParameter("t7"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evlu_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_yy")));
String tms_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_clsf")));
String cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cd")));
String t1 = Util.Uni2Ksc(Util.checkString(req.getParameter("t1")));
String t2 = Util.Uni2Ksc(Util.checkString(req.getParameter("t2")));
String t3 = Util.Uni2Ksc(Util.checkString(req.getParameter("t3")));
String t4 = Util.Uni2Ksc(Util.checkString(req.getParameter("t4")));
String t5 = Util.Uni2Ksc(Util.checkString(req.getParameter("t5")));
String t6 = Util.Uni2Ksc(Util.checkString(req.getParameter("t6")));
String t7 = Util.Uni2Ksc(Util.checkString(req.getParameter("t7")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvlu_yy(evlu_yy);
dm.setTms_clsf(tms_clsf);
dm.setCd(cd);
dm.setT1(t1);
dm.setT2(t2);
dm.setT3(t3);
dm.setT4(t4);
dm.setT5(t5);
dm.setT6(t6);
dm.setT7(t7);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 04 17:21:49 KST 2009 */