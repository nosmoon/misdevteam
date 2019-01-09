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


package chosun.ciis.as.base.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.base.ds.*;
import chosun.ciis.as.base.rec.*;

/**
 * 
 */


public class AS_BASE_1003_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String item_cd;
	public String item_nm;
	public String unit_cd;
	public String redm_clsf;
	public String redm_mthd_cd;
	public String svc_yys_cnt;
	public String budg_cd;
	public String use_yn;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;

	public AS_BASE_1003_ADM(){}
	public AS_BASE_1003_ADM(String mode, String cmpy_cd, String item_cd, String item_nm, String unit_cd, String redm_clsf, String redm_mthd_cd, String svc_yys_cnt, String budg_cd, String use_yn, String incmg_pers_ipadd, String incmg_pers, String chg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.item_cd = item_cd;
		this.item_nm = item_nm;
		this.unit_cd = unit_cd;
		this.redm_clsf = redm_clsf;
		this.redm_mthd_cd = redm_mthd_cd;
		this.svc_yys_cnt = svc_yys_cnt;
		this.budg_cd = budg_cd;
		this.use_yn = use_yn;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setItem_cd(String item_cd){
		this.item_cd = item_cd;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public void setUnit_cd(String unit_cd){
		this.unit_cd = unit_cd;
	}

	public void setRedm_clsf(String redm_clsf){
		this.redm_clsf = redm_clsf;
	}

	public void setRedm_mthd_cd(String redm_mthd_cd){
		this.redm_mthd_cd = redm_mthd_cd;
	}

	public void setSvc_yys_cnt(String svc_yys_cnt){
		this.svc_yys_cnt = svc_yys_cnt;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
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

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getItem_cd(){
		return this.item_cd;
	}

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getUnit_cd(){
		return this.unit_cd;
	}

	public String getRedm_clsf(){
		return this.redm_clsf;
	}

	public String getRedm_mthd_cd(){
		return this.redm_mthd_cd;
	}

	public String getSvc_yys_cnt(){
		return this.svc_yys_cnt;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getUse_yn(){
		return this.use_yn;
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

	public String getSQL(){
		 return "{ call MISAST.SP_AS_BASE_1003_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_BASE_1003_ADM dm = (AS_BASE_1003_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.item_cd);
		cstmt.setString(6, dm.item_nm);
		cstmt.setString(7, dm.unit_cd);
		cstmt.setString(8, dm.redm_clsf);
		cstmt.setString(9, dm.redm_mthd_cd);
		cstmt.setString(10, dm.svc_yys_cnt);
		cstmt.setString(11, dm.budg_cd);
		cstmt.setString(12, dm.use_yn);
		cstmt.setString(13, dm.incmg_pers_ipadd);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.setString(15, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.base.ds.AS_BASE_1003_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("item_cd = " + getItem_cd());
        System.out.println("item_nm = " + getItem_nm());
        System.out.println("unit_cd = " + getUnit_cd());
        System.out.println("redm_clsf = " + getRedm_clsf());
        System.out.println("redm_mthd_cd = " + getRedm_mthd_cd());
        System.out.println("svc_yys_cnt = " + getSvc_yys_cnt());
        System.out.println("budg_cd = " + getBudg_cd());
        System.out.println("use_yn = " + getUse_yn());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String item_cd = req.getParameter("item_cd");
if( item_cd == null){
	System.out.println(this.toString+" : item_cd is null" );
}else{
	System.out.println(this.toString+" : item_cd is "+item_cd );
}
String item_nm = req.getParameter("item_nm");
if( item_nm == null){
	System.out.println(this.toString+" : item_nm is null" );
}else{
	System.out.println(this.toString+" : item_nm is "+item_nm );
}
String unit_cd = req.getParameter("unit_cd");
if( unit_cd == null){
	System.out.println(this.toString+" : unit_cd is null" );
}else{
	System.out.println(this.toString+" : unit_cd is "+unit_cd );
}
String redm_clsf = req.getParameter("redm_clsf");
if( redm_clsf == null){
	System.out.println(this.toString+" : redm_clsf is null" );
}else{
	System.out.println(this.toString+" : redm_clsf is "+redm_clsf );
}
String redm_mthd_cd = req.getParameter("redm_mthd_cd");
if( redm_mthd_cd == null){
	System.out.println(this.toString+" : redm_mthd_cd is null" );
}else{
	System.out.println(this.toString+" : redm_mthd_cd is "+redm_mthd_cd );
}
String svc_yys_cnt = req.getParameter("svc_yys_cnt");
if( svc_yys_cnt == null){
	System.out.println(this.toString+" : svc_yys_cnt is null" );
}else{
	System.out.println(this.toString+" : svc_yys_cnt is "+svc_yys_cnt );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String item_cd = Util.checkString(req.getParameter("item_cd"));
String item_nm = Util.checkString(req.getParameter("item_nm"));
String unit_cd = Util.checkString(req.getParameter("unit_cd"));
String redm_clsf = Util.checkString(req.getParameter("redm_clsf"));
String redm_mthd_cd = Util.checkString(req.getParameter("redm_mthd_cd"));
String svc_yys_cnt = Util.checkString(req.getParameter("svc_yys_cnt"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("item_cd")));
String item_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("item_nm")));
String unit_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("unit_cd")));
String redm_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("redm_clsf")));
String redm_mthd_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("redm_mthd_cd")));
String svc_yys_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("svc_yys_cnt")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setItem_cd(item_cd);
dm.setItem_nm(item_nm);
dm.setUnit_cd(unit_cd);
dm.setRedm_clsf(redm_clsf);
dm.setRedm_mthd_cd(redm_mthd_cd);
dm.setSvc_yys_cnt(svc_yys_cnt);
dm.setBudg_cd(budg_cd);
dm.setUse_yn(use_yn);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 18 17:02:08 KST 2009 */