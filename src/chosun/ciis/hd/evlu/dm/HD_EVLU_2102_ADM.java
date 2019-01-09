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


public class HD_EVLU_2102_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evlu_yy;
	public String tms_clsf;
	public String evlu_pers_nops;
	public String s_nops_1tms;
	public String a_pls_nops_1tms;
	public String a_nops_1tms;
	public String s_nops_2tms;
	public String a_pls_nops_2tms;
	public String s_a_nops_2tms_sum;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String flag;

	public HD_EVLU_2102_ADM(){}
	public HD_EVLU_2102_ADM(String cmpy_cd, String evlu_yy, String tms_clsf, String evlu_pers_nops, String s_nops_1tms, String a_pls_nops_1tms, String a_nops_1tms, String s_nops_2tms, String a_pls_nops_2tms, String s_a_nops_2tms_sum, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String flag){
		this.cmpy_cd = cmpy_cd;
		this.evlu_yy = evlu_yy;
		this.tms_clsf = tms_clsf;
		this.evlu_pers_nops = evlu_pers_nops;
		this.s_nops_1tms = s_nops_1tms;
		this.a_pls_nops_1tms = a_pls_nops_1tms;
		this.a_nops_1tms = a_nops_1tms;
		this.s_nops_2tms = s_nops_2tms;
		this.a_pls_nops_2tms = a_pls_nops_2tms;
		this.s_a_nops_2tms_sum = s_a_nops_2tms_sum;
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

	public void setEvlu_pers_nops(String evlu_pers_nops){
		this.evlu_pers_nops = evlu_pers_nops;
	}

	public void setS_nops_1tms(String s_nops_1tms){
		this.s_nops_1tms = s_nops_1tms;
	}

	public void setA_pls_nops_1tms(String a_pls_nops_1tms){
		this.a_pls_nops_1tms = a_pls_nops_1tms;
	}

	public void setA_nops_1tms(String a_nops_1tms){
		this.a_nops_1tms = a_nops_1tms;
	}

	public void setS_nops_2tms(String s_nops_2tms){
		this.s_nops_2tms = s_nops_2tms;
	}

	public void setA_pls_nops_2tms(String a_pls_nops_2tms){
		this.a_pls_nops_2tms = a_pls_nops_2tms;
	}

	public void setS_a_nops_2tms_sum(String s_a_nops_2tms_sum){
		this.s_a_nops_2tms_sum = s_a_nops_2tms_sum;
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

	public String getEvlu_pers_nops(){
		return this.evlu_pers_nops;
	}

	public String getS_nops_1tms(){
		return this.s_nops_1tms;
	}

	public String getA_pls_nops_1tms(){
		return this.a_pls_nops_1tms;
	}

	public String getA_nops_1tms(){
		return this.a_nops_1tms;
	}

	public String getS_nops_2tms(){
		return this.s_nops_2tms;
	}

	public String getA_pls_nops_2tms(){
		return this.a_pls_nops_2tms;
	}

	public String getS_a_nops_2tms_sum(){
		return this.s_a_nops_2tms_sum;
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
		 return "{ call MISHDL.SP_HD_EVLU_2102_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EVLU_2102_ADM dm = (HD_EVLU_2102_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evlu_yy);
		cstmt.setString(5, dm.tms_clsf);
		cstmt.setString(6, dm.evlu_pers_nops);
		cstmt.setString(7, dm.s_nops_1tms);
		cstmt.setString(8, dm.a_pls_nops_1tms);
		cstmt.setString(9, dm.a_nops_1tms);
		cstmt.setString(10, dm.s_nops_2tms);
		cstmt.setString(11, dm.a_pls_nops_2tms);
		cstmt.setString(12, dm.s_a_nops_2tms_sum);
		cstmt.setString(13, dm.incmg_pers_ipadd);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.setString(15, dm.chg_pers);
		cstmt.setString(16, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.evlu.ds.HD_EVLU_2102_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("evlu_yy = [" + getEvlu_yy() + "]");
		System.out.println("tms_clsf = [" + getTms_clsf() + "]");
		System.out.println("evlu_pers_nops = [" + getEvlu_pers_nops() + "]");
		System.out.println("s_nops_1tms = [" + getS_nops_1tms() + "]");
		System.out.println("a_pls_nops_1tms = [" + getA_pls_nops_1tms() + "]");
		System.out.println("a_nops_1tms = [" + getA_nops_1tms() + "]");
		System.out.println("s_nops_2tms = [" + getS_nops_2tms() + "]");
		System.out.println("a_pls_nops_2tms = [" + getA_pls_nops_2tms() + "]");
		System.out.println("s_a_nops_2tms_sum = [" + getS_a_nops_2tms_sum() + "]");
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
String evlu_pers_nops = req.getParameter("evlu_pers_nops");
if( evlu_pers_nops == null){
	System.out.println(this.toString+" : evlu_pers_nops is null" );
}else{
	System.out.println(this.toString+" : evlu_pers_nops is "+evlu_pers_nops );
}
String s_nops_1tms = req.getParameter("s_nops_1tms");
if( s_nops_1tms == null){
	System.out.println(this.toString+" : s_nops_1tms is null" );
}else{
	System.out.println(this.toString+" : s_nops_1tms is "+s_nops_1tms );
}
String a_pls_nops_1tms = req.getParameter("a_pls_nops_1tms");
if( a_pls_nops_1tms == null){
	System.out.println(this.toString+" : a_pls_nops_1tms is null" );
}else{
	System.out.println(this.toString+" : a_pls_nops_1tms is "+a_pls_nops_1tms );
}
String a_nops_1tms = req.getParameter("a_nops_1tms");
if( a_nops_1tms == null){
	System.out.println(this.toString+" : a_nops_1tms is null" );
}else{
	System.out.println(this.toString+" : a_nops_1tms is "+a_nops_1tms );
}
String s_nops_2tms = req.getParameter("s_nops_2tms");
if( s_nops_2tms == null){
	System.out.println(this.toString+" : s_nops_2tms is null" );
}else{
	System.out.println(this.toString+" : s_nops_2tms is "+s_nops_2tms );
}
String a_pls_nops_2tms = req.getParameter("a_pls_nops_2tms");
if( a_pls_nops_2tms == null){
	System.out.println(this.toString+" : a_pls_nops_2tms is null" );
}else{
	System.out.println(this.toString+" : a_pls_nops_2tms is "+a_pls_nops_2tms );
}
String s_a_nops_2tms_sum = req.getParameter("s_a_nops_2tms_sum");
if( s_a_nops_2tms_sum == null){
	System.out.println(this.toString+" : s_a_nops_2tms_sum is null" );
}else{
	System.out.println(this.toString+" : s_a_nops_2tms_sum is "+s_a_nops_2tms_sum );
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
String evlu_pers_nops = Util.checkString(req.getParameter("evlu_pers_nops"));
String s_nops_1tms = Util.checkString(req.getParameter("s_nops_1tms"));
String a_pls_nops_1tms = Util.checkString(req.getParameter("a_pls_nops_1tms"));
String a_nops_1tms = Util.checkString(req.getParameter("a_nops_1tms"));
String s_nops_2tms = Util.checkString(req.getParameter("s_nops_2tms"));
String a_pls_nops_2tms = Util.checkString(req.getParameter("a_pls_nops_2tms"));
String s_a_nops_2tms_sum = Util.checkString(req.getParameter("s_a_nops_2tms_sum"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evlu_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_yy")));
String tms_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_clsf")));
String evlu_pers_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_pers_nops")));
String s_nops_1tms = Util.Uni2Ksc(Util.checkString(req.getParameter("s_nops_1tms")));
String a_pls_nops_1tms = Util.Uni2Ksc(Util.checkString(req.getParameter("a_pls_nops_1tms")));
String a_nops_1tms = Util.Uni2Ksc(Util.checkString(req.getParameter("a_nops_1tms")));
String s_nops_2tms = Util.Uni2Ksc(Util.checkString(req.getParameter("s_nops_2tms")));
String a_pls_nops_2tms = Util.Uni2Ksc(Util.checkString(req.getParameter("a_pls_nops_2tms")));
String s_a_nops_2tms_sum = Util.Uni2Ksc(Util.checkString(req.getParameter("s_a_nops_2tms_sum")));
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
dm.setEvlu_pers_nops(evlu_pers_nops);
dm.setS_nops_1tms(s_nops_1tms);
dm.setA_pls_nops_1tms(a_pls_nops_1tms);
dm.setA_nops_1tms(a_nops_1tms);
dm.setS_nops_2tms(s_nops_2tms);
dm.setA_pls_nops_2tms(a_pls_nops_2tms);
dm.setS_a_nops_2tms_sum(s_a_nops_2tms_sum);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 06 16:58:51 KST 2014 */