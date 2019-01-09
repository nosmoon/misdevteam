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


public class HD_EVLU_5404_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evlu_yy;
	public String tms_clsf;
	public String evlu_subj_cd;
	public String evlu_clon_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String flag;

	public HD_EVLU_5404_ADM(){}
	public HD_EVLU_5404_ADM(String cmpy_cd, String evlu_yy, String tms_clsf, String evlu_subj_cd, String evlu_clon_cd, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String flag){
		this.cmpy_cd = cmpy_cd;
		this.evlu_yy = evlu_yy;
		this.tms_clsf = tms_clsf;
		this.evlu_subj_cd = evlu_subj_cd;
		this.evlu_clon_cd = evlu_clon_cd;
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

	public void setEvlu_subj_cd(String evlu_subj_cd){
		this.evlu_subj_cd = evlu_subj_cd;
	}

	public void setEvlu_clon_cd(String evlu_clon_cd){
		this.evlu_clon_cd = evlu_clon_cd;
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

	public String getEvlu_subj_cd(){
		return this.evlu_subj_cd;
	}

	public String getEvlu_clon_cd(){
		return this.evlu_clon_cd;
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
		 return "{ call MISHDL.SP_HD_EVLU_5404_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EVLU_5404_ADM dm = (HD_EVLU_5404_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.evlu_yy);
		cstmt.setString(6, dm.tms_clsf);
		cstmt.setString(7, dm.evlu_subj_cd);
		cstmt.setString(8, dm.evlu_clon_cd);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.chg_pers);
		cstmt.setString(12, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_EVLU_5404_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("evlu_yy = [" + getEvlu_yy() + "]");
		System.out.println("tms_clsf = [" + getTms_clsf() + "]");
		System.out.println("evlu_subj_cd = [" + getEvlu_subj_cd() + "]");
		System.out.println("evlu_clon_cd = [" + getEvlu_clon_cd() + "]");
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
String evlu_subj_cd = req.getParameter("evlu_subj_cd");
if( evlu_subj_cd == null){
	System.out.println(this.toString+" : evlu_subj_cd is null" );
}else{
	System.out.println(this.toString+" : evlu_subj_cd is "+evlu_subj_cd );
}
String evlu_clon_cd = req.getParameter("evlu_clon_cd");
if( evlu_clon_cd == null){
	System.out.println(this.toString+" : evlu_clon_cd is null" );
}else{
	System.out.println(this.toString+" : evlu_clon_cd is "+evlu_clon_cd );
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
String evlu_subj_cd = Util.checkString(req.getParameter("evlu_subj_cd"));
String evlu_clon_cd = Util.checkString(req.getParameter("evlu_clon_cd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evlu_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_yy")));
String tms_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_clsf")));
String evlu_subj_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_subj_cd")));
String evlu_clon_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_clon_cd")));
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
dm.setEvlu_subj_cd(evlu_subj_cd);
dm.setEvlu_clon_cd(evlu_clon_cd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 04 10:56:14 KST 2009 */