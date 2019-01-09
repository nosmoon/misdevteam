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

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_TAX_1730_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String frdt;
	public String todt;
	public String medi_clsf;
	public String basi_dt;
	public String pay_clsf;

	public AD_TAX_1730_LDM(){}
	public AD_TAX_1730_LDM(String cmpy_cd, String frdt, String todt, String medi_clsf, String basi_dt, String pay_clsf){
		this.cmpy_cd = cmpy_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.medi_clsf = medi_clsf;
		this.basi_dt = basi_dt;
		this.pay_clsf = pay_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setPay_clsf(String pay_clsf){
		this.pay_clsf = pay_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getPay_clsf(){
		return this.pay_clsf;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_TAX_1730_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_TAX_1730_LDM dm = (AD_TAX_1730_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.frdt);
		cstmt.setString(5, dm.todt);
		cstmt.setString(6, dm.medi_clsf);
		cstmt.setString(7, dm.basi_dt);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.setString(8, dm.pay_clsf);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.tax.ds.AD_TAX_1730_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("pay_clsf = [" + getPay_clsf() + "]");
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
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
}
String pay_clsf = req.getParameter("pay_clsf");
if( pay_clsf == null){
	System.out.println(this.toString+" : pay_clsf is null" );
}else{
	System.out.println(this.toString+" : pay_clsf is "+pay_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String pay_clsf = Util.checkString(req.getParameter("pay_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String pay_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setMedi_clsf(medi_clsf);
dm.setBasi_dt(basi_dt);
dm.setPay_clsf(pay_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 17 11:33:08 KST 2009 */