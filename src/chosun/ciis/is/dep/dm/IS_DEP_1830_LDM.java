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


package chosun.ciis.is.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.ds.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_1830_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String flag;
	public String sale_proc_frdt;
	public String sale_proc_todt;
	public String trc_reg_frdt;
	public String trc_reg_todt;
	public String chg_prv_chrg_pers;
	public String chrg_pers;
	public String dlco_no;
	public String incmg_pers;

	public IS_DEP_1830_LDM(){}
	public IS_DEP_1830_LDM(String cmpy_cd, String flag, String sale_proc_frdt, String sale_proc_todt, String trc_reg_frdt, String trc_reg_todt, String chg_prv_chrg_pers, String chrg_pers, String dlco_no, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.flag = flag;
		this.sale_proc_frdt = sale_proc_frdt;
		this.sale_proc_todt = sale_proc_todt;
		this.trc_reg_frdt = trc_reg_frdt;
		this.trc_reg_todt = trc_reg_todt;
		this.chg_prv_chrg_pers = chg_prv_chrg_pers;
		this.chrg_pers = chrg_pers;
		this.dlco_no = dlco_no;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setSale_proc_frdt(String sale_proc_frdt){
		this.sale_proc_frdt = sale_proc_frdt;
	}

	public void setSale_proc_todt(String sale_proc_todt){
		this.sale_proc_todt = sale_proc_todt;
	}

	public void setTrc_reg_frdt(String trc_reg_frdt){
		this.trc_reg_frdt = trc_reg_frdt;
	}

	public void setTrc_reg_todt(String trc_reg_todt){
		this.trc_reg_todt = trc_reg_todt;
	}

	public void setChg_prv_chrg_pers(String chg_prv_chrg_pers){
		this.chg_prv_chrg_pers = chg_prv_chrg_pers;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSale_proc_frdt(){
		return this.sale_proc_frdt;
	}

	public String getSale_proc_todt(){
		return this.sale_proc_todt;
	}

	public String getTrc_reg_frdt(){
		return this.trc_reg_frdt;
	}

	public String getTrc_reg_todt(){
		return this.trc_reg_todt;
	}

	public String getChg_prv_chrg_pers(){
		return this.chg_prv_chrg_pers;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_1830_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_1830_LDM dm = (IS_DEP_1830_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.flag);
		cstmt.setString(5, dm.sale_proc_frdt);
		cstmt.setString(6, dm.sale_proc_todt);
		cstmt.setString(7, dm.trc_reg_frdt);
		cstmt.setString(8, dm.trc_reg_todt);
		cstmt.setString(9, dm.chg_prv_chrg_pers);
		cstmt.setString(10, dm.chrg_pers);
		cstmt.setString(11, dm.dlco_no);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_1830_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("sale_proc_frdt = [" + getSale_proc_frdt() + "]");
		System.out.println("sale_proc_todt = [" + getSale_proc_todt() + "]");
		System.out.println("trc_reg_frdt = [" + getTrc_reg_frdt() + "]");
		System.out.println("trc_reg_todt = [" + getTrc_reg_todt() + "]");
		System.out.println("chg_prv_chrg_pers = [" + getChg_prv_chrg_pers() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String sale_proc_frdt = req.getParameter("sale_proc_frdt");
if( sale_proc_frdt == null){
	System.out.println(this.toString+" : sale_proc_frdt is null" );
}else{
	System.out.println(this.toString+" : sale_proc_frdt is "+sale_proc_frdt );
}
String sale_proc_todt = req.getParameter("sale_proc_todt");
if( sale_proc_todt == null){
	System.out.println(this.toString+" : sale_proc_todt is null" );
}else{
	System.out.println(this.toString+" : sale_proc_todt is "+sale_proc_todt );
}
String trc_reg_frdt = req.getParameter("trc_reg_frdt");
if( trc_reg_frdt == null){
	System.out.println(this.toString+" : trc_reg_frdt is null" );
}else{
	System.out.println(this.toString+" : trc_reg_frdt is "+trc_reg_frdt );
}
String trc_reg_todt = req.getParameter("trc_reg_todt");
if( trc_reg_todt == null){
	System.out.println(this.toString+" : trc_reg_todt is null" );
}else{
	System.out.println(this.toString+" : trc_reg_todt is "+trc_reg_todt );
}
String chg_prv_chrg_pers = req.getParameter("chg_prv_chrg_pers");
if( chg_prv_chrg_pers == null){
	System.out.println(this.toString+" : chg_prv_chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_prv_chrg_pers is "+chg_prv_chrg_pers );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String flag = Util.checkString(req.getParameter("flag"));
String sale_proc_frdt = Util.checkString(req.getParameter("sale_proc_frdt"));
String sale_proc_todt = Util.checkString(req.getParameter("sale_proc_todt"));
String trc_reg_frdt = Util.checkString(req.getParameter("trc_reg_frdt"));
String trc_reg_todt = Util.checkString(req.getParameter("trc_reg_todt"));
String chg_prv_chrg_pers = Util.checkString(req.getParameter("chg_prv_chrg_pers"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String sale_proc_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_proc_frdt")));
String sale_proc_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_proc_todt")));
String trc_reg_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("trc_reg_frdt")));
String trc_reg_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("trc_reg_todt")));
String chg_prv_chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_prv_chrg_pers")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFlag(flag);
dm.setSale_proc_frdt(sale_proc_frdt);
dm.setSale_proc_todt(sale_proc_todt);
dm.setTrc_reg_frdt(trc_reg_frdt);
dm.setTrc_reg_todt(trc_reg_todt);
dm.setChg_prv_chrg_pers(chg_prv_chrg_pers);
dm.setChrg_pers(chrg_pers);
dm.setDlco_no(dlco_no);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 23 10:14:52 KST 2012 */