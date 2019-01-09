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


package chosun.ciis.ad.tax.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_TAX_1720_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String tax_stmt_no;
	public String rcpm_mtry_dt;
	public String mtry_dt;
	public String pay_dt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_TAX_1720_ADM(){}
	public AD_TAX_1720_ADM(String flag, String cmpy_cd, String tax_stmt_no, String rcpm_mtry_dt, String mtry_dt, String pay_dt, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.tax_stmt_no = tax_stmt_no;
		this.rcpm_mtry_dt = rcpm_mtry_dt;
		this.mtry_dt = mtry_dt;
		this.pay_dt = pay_dt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTax_stmt_no(String tax_stmt_no){
		this.tax_stmt_no = tax_stmt_no;
	}

	public void setRcpm_mtry_dt(String rcpm_mtry_dt){
		this.rcpm_mtry_dt = rcpm_mtry_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTax_stmt_no(){
		return this.tax_stmt_no;
	}

	public String getRcpm_mtry_dt(){
		return this.rcpm_mtry_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_TAX_1720_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_TAX_1720_ADM dm = (AD_TAX_1720_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.tax_stmt_no);
		cstmt.setString(6, dm.rcpm_mtry_dt);
		cstmt.setString(7, dm.mtry_dt);
		cstmt.setString(8, dm.pay_dt);
		cstmt.setString(9, dm.incmg_pers_ip);
		cstmt.setString(10, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.tax.ds.AD_TAX_1720_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("tax_stmt_no = [" + getTax_stmt_no() + "]");
		System.out.println("rcpm_mtry_dt = [" + getRcpm_mtry_dt() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("pay_dt = [" + getPay_dt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String tax_stmt_no = req.getParameter("tax_stmt_no");
if( tax_stmt_no == null){
	System.out.println(this.toString+" : tax_stmt_no is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_no is "+tax_stmt_no );
}
String rcpm_mtry_dt = req.getParameter("rcpm_mtry_dt");
if( rcpm_mtry_dt == null){
	System.out.println(this.toString+" : rcpm_mtry_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_mtry_dt is "+rcpm_mtry_dt );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String pay_dt = req.getParameter("pay_dt");
if( pay_dt == null){
	System.out.println(this.toString+" : pay_dt is null" );
}else{
	System.out.println(this.toString+" : pay_dt is "+pay_dt );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String tax_stmt_no = Util.checkString(req.getParameter("tax_stmt_no"));
String rcpm_mtry_dt = Util.checkString(req.getParameter("rcpm_mtry_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String pay_dt = Util.checkString(req.getParameter("pay_dt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String tax_stmt_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_no")));
String rcpm_mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_mtry_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setTax_stmt_no(tax_stmt_no);
dm.setRcpm_mtry_dt(rcpm_mtry_dt);
dm.setMtry_dt(mtry_dt);
dm.setPay_dt(pay_dt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 17 11:40:59 KST 2009 */