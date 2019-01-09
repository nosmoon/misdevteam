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


public class AD_TAX_1810_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String pay_clsf;
	public String tax_frdt;
	public String tax_todt;
	public String rcpm_frdt;
	public String rcpm_todt;
	public String agn;

	public AD_TAX_1810_LDM(){}
	public AD_TAX_1810_LDM(String cmpy_cd, String medi_cd, String pay_clsf, String tax_frdt, String tax_todt, String rcpm_frdt, String rcpm_todt, String agn){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.pay_clsf = pay_clsf;
		this.tax_frdt = tax_frdt;
		this.tax_todt = tax_todt;
		this.rcpm_frdt = rcpm_frdt;
		this.rcpm_todt = rcpm_todt;
		this.agn = agn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setPay_clsf(String pay_clsf){
		this.pay_clsf = pay_clsf;
	}

	public void setTax_frdt(String tax_frdt){
		this.tax_frdt = tax_frdt;
	}

	public void setTax_todt(String tax_todt){
		this.tax_todt = tax_todt;
	}

	public void setRcpm_frdt(String rcpm_frdt){
		this.rcpm_frdt = rcpm_frdt;
	}

	public void setRcpm_todt(String rcpm_todt){
		this.rcpm_todt = rcpm_todt;
	}

	public void setAgn(String agn){
		this.agn = agn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getPay_clsf(){
		return this.pay_clsf;
	}

	public String getTax_frdt(){
		return this.tax_frdt;
	}

	public String getTax_todt(){
		return this.tax_todt;
	}

	public String getRcpm_frdt(){
		return this.rcpm_frdt;
	}

	public String getRcpm_todt(){
		return this.rcpm_todt;
	}

	public String getAgn(){
		return this.agn;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_TAX_1810_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_TAX_1810_LDM dm = (AD_TAX_1810_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.pay_clsf);
		cstmt.setString(6, dm.tax_frdt);
		cstmt.setString(7, dm.tax_todt);
		cstmt.setString(8, dm.rcpm_frdt);
		cstmt.setString(9, dm.rcpm_todt);
		cstmt.setString(10, dm.agn);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.tax.ds.AD_TAX_1810_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("pay_clsf = [" + getPay_clsf() + "]");
		System.out.println("tax_frdt = [" + getTax_frdt() + "]");
		System.out.println("tax_todt = [" + getTax_todt() + "]");
		System.out.println("rcpm_frdt = [" + getRcpm_frdt() + "]");
		System.out.println("rcpm_todt = [" + getRcpm_todt() + "]");
		System.out.println("agn = [" + getAgn() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String pay_clsf = req.getParameter("pay_clsf");
if( pay_clsf == null){
	System.out.println(this.toString+" : pay_clsf is null" );
}else{
	System.out.println(this.toString+" : pay_clsf is "+pay_clsf );
}
String tax_frdt = req.getParameter("tax_frdt");
if( tax_frdt == null){
	System.out.println(this.toString+" : tax_frdt is null" );
}else{
	System.out.println(this.toString+" : tax_frdt is "+tax_frdt );
}
String tax_todt = req.getParameter("tax_todt");
if( tax_todt == null){
	System.out.println(this.toString+" : tax_todt is null" );
}else{
	System.out.println(this.toString+" : tax_todt is "+tax_todt );
}
String rcpm_frdt = req.getParameter("rcpm_frdt");
if( rcpm_frdt == null){
	System.out.println(this.toString+" : rcpm_frdt is null" );
}else{
	System.out.println(this.toString+" : rcpm_frdt is "+rcpm_frdt );
}
String rcpm_todt = req.getParameter("rcpm_todt");
if( rcpm_todt == null){
	System.out.println(this.toString+" : rcpm_todt is null" );
}else{
	System.out.println(this.toString+" : rcpm_todt is "+rcpm_todt );
}
String agn = req.getParameter("agn");
if( agn == null){
	System.out.println(this.toString+" : agn is null" );
}else{
	System.out.println(this.toString+" : agn is "+agn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String pay_clsf = Util.checkString(req.getParameter("pay_clsf"));
String tax_frdt = Util.checkString(req.getParameter("tax_frdt"));
String tax_todt = Util.checkString(req.getParameter("tax_todt"));
String rcpm_frdt = Util.checkString(req.getParameter("rcpm_frdt"));
String rcpm_todt = Util.checkString(req.getParameter("rcpm_todt"));
String agn = Util.checkString(req.getParameter("agn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String pay_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_clsf")));
String tax_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_frdt")));
String tax_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_todt")));
String rcpm_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_frdt")));
String rcpm_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_todt")));
String agn = Util.Uni2Ksc(Util.checkString(req.getParameter("agn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setPay_clsf(pay_clsf);
dm.setTax_frdt(tax_frdt);
dm.setTax_todt(tax_todt);
dm.setRcpm_frdt(rcpm_frdt);
dm.setRcpm_todt(rcpm_todt);
dm.setAgn(agn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 18:03:48 KST 2009 */