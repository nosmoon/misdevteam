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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_2311_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String select_dt;
	public String frdt;
	public String todt;
	public String notaxrate_data_yn;
	public String chro_clsf;
	public String medi_cd;
	public String indt_clsf;
	public String indt_clsf2;
	public String std_clsf;
	public String nwsp_type_clsf;
	public String advt_cont;
	public String grp_cmpy_cd;
	public String sale_stmt_issu_yn;
	public String dlco_nm;
	public String fradvt_fee;
	public String toadvt_fee;
	public String frvat;
	public String tovat;
	public String frtot_rcpm_amt;
	public String totot_rcpm_amt;
	public String frtot_misu_amt;
	public String totot_misu_amt;
	public String elec_tax_stmt_yn;

	public AD_PUB_2311_LDM(){}
	public AD_PUB_2311_LDM(String cmpy_cd, String select_dt, String frdt, String todt, String notaxrate_data_yn, String chro_clsf, String medi_cd, String indt_clsf, String indt_clsf2, String std_clsf, String nwsp_type_clsf, String advt_cont, String grp_cmpy_cd, String sale_stmt_issu_yn, String dlco_nm, String fradvt_fee, String toadvt_fee, String frvat, String tovat, String frtot_rcpm_amt, String totot_rcpm_amt, String frtot_misu_amt, String totot_misu_amt, String elec_tax_stmt_yn){
		this.cmpy_cd = cmpy_cd;
		this.select_dt = select_dt;
		this.frdt = frdt;
		this.todt = todt;
		this.notaxrate_data_yn = notaxrate_data_yn;
		this.chro_clsf = chro_clsf;
		this.medi_cd = medi_cd;
		this.indt_clsf = indt_clsf;
		this.indt_clsf2 = indt_clsf2;
		this.std_clsf = std_clsf;
		this.nwsp_type_clsf = nwsp_type_clsf;
		this.advt_cont = advt_cont;
		this.grp_cmpy_cd = grp_cmpy_cd;
		this.sale_stmt_issu_yn = sale_stmt_issu_yn;
		this.dlco_nm = dlco_nm;
		this.fradvt_fee = fradvt_fee;
		this.toadvt_fee = toadvt_fee;
		this.frvat = frvat;
		this.tovat = tovat;
		this.frtot_rcpm_amt = frtot_rcpm_amt;
		this.totot_rcpm_amt = totot_rcpm_amt;
		this.frtot_misu_amt = frtot_misu_amt;
		this.totot_misu_amt = totot_misu_amt;
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSelect_dt(String select_dt){
		this.select_dt = select_dt;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setNotaxrate_data_yn(String notaxrate_data_yn){
		this.notaxrate_data_yn = notaxrate_data_yn;
	}

	public void setChro_clsf(String chro_clsf){
		this.chro_clsf = chro_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setIndt_clsf(String indt_clsf){
		this.indt_clsf = indt_clsf;
	}

	public void setIndt_clsf2(String indt_clsf2){
		this.indt_clsf2 = indt_clsf2;
	}

	public void setStd_clsf(String std_clsf){
		this.std_clsf = std_clsf;
	}

	public void setNwsp_type_clsf(String nwsp_type_clsf){
		this.nwsp_type_clsf = nwsp_type_clsf;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setGrp_cmpy_cd(String grp_cmpy_cd){
		this.grp_cmpy_cd = grp_cmpy_cd;
	}

	public void setSale_stmt_issu_yn(String sale_stmt_issu_yn){
		this.sale_stmt_issu_yn = sale_stmt_issu_yn;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setFradvt_fee(String fradvt_fee){
		this.fradvt_fee = fradvt_fee;
	}

	public void setToadvt_fee(String toadvt_fee){
		this.toadvt_fee = toadvt_fee;
	}

	public void setFrvat(String frvat){
		this.frvat = frvat;
	}

	public void setTovat(String tovat){
		this.tovat = tovat;
	}

	public void setFrtot_rcpm_amt(String frtot_rcpm_amt){
		this.frtot_rcpm_amt = frtot_rcpm_amt;
	}

	public void setTotot_rcpm_amt(String totot_rcpm_amt){
		this.totot_rcpm_amt = totot_rcpm_amt;
	}

	public void setFrtot_misu_amt(String frtot_misu_amt){
		this.frtot_misu_amt = frtot_misu_amt;
	}

	public void setTotot_misu_amt(String totot_misu_amt){
		this.totot_misu_amt = totot_misu_amt;
	}

	public void setElec_tax_stmt_yn(String elec_tax_stmt_yn){
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSelect_dt(){
		return this.select_dt;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getNotaxrate_data_yn(){
		return this.notaxrate_data_yn;
	}

	public String getChro_clsf(){
		return this.chro_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getIndt_clsf(){
		return this.indt_clsf;
	}

	public String getIndt_clsf2(){
		return this.indt_clsf2;
	}

	public String getStd_clsf(){
		return this.std_clsf;
	}

	public String getNwsp_type_clsf(){
		return this.nwsp_type_clsf;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getGrp_cmpy_cd(){
		return this.grp_cmpy_cd;
	}

	public String getSale_stmt_issu_yn(){
		return this.sale_stmt_issu_yn;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getFradvt_fee(){
		return this.fradvt_fee;
	}

	public String getToadvt_fee(){
		return this.toadvt_fee;
	}

	public String getFrvat(){
		return this.frvat;
	}

	public String getTovat(){
		return this.tovat;
	}

	public String getFrtot_rcpm_amt(){
		return this.frtot_rcpm_amt;
	}

	public String getTotot_rcpm_amt(){
		return this.totot_rcpm_amt;
	}

	public String getFrtot_misu_amt(){
		return this.frtot_misu_amt;
	}

	public String getTotot_misu_amt(){
		return this.totot_misu_amt;
	}

	public String getElec_tax_stmt_yn(){
		return this.elec_tax_stmt_yn;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_2311_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_2311_LDM dm = (AD_PUB_2311_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.select_dt);
		cstmt.setString(5, dm.frdt);
		cstmt.setString(6, dm.todt);
		cstmt.setString(7, dm.notaxrate_data_yn);
		cstmt.setString(8, dm.chro_clsf);
		cstmt.setString(9, dm.medi_cd);
		cstmt.setString(10, dm.indt_clsf);
		cstmt.setString(11, dm.indt_clsf2);
		cstmt.setString(12, dm.std_clsf);
		cstmt.setString(13, dm.nwsp_type_clsf);
		cstmt.setString(14, dm.advt_cont);
		cstmt.setString(15, dm.grp_cmpy_cd);
		cstmt.setString(16, dm.sale_stmt_issu_yn);
		cstmt.setString(17, dm.dlco_nm);
		cstmt.setString(18, dm.fradvt_fee);
		cstmt.setString(19, dm.toadvt_fee);
		cstmt.setString(20, dm.frvat);
		cstmt.setString(21, dm.tovat);
		cstmt.setString(22, dm.frtot_rcpm_amt);
		cstmt.setString(23, dm.totot_rcpm_amt);
		cstmt.setString(24, dm.frtot_misu_amt);
		cstmt.setString(25, dm.totot_misu_amt);
		cstmt.setString(26, dm.elec_tax_stmt_yn);
		cstmt.registerOutParameter(27, Types.VARCHAR);
		cstmt.registerOutParameter(28, Types.VARCHAR);
		cstmt.registerOutParameter(29, Types.VARCHAR);
		cstmt.registerOutParameter(30, Types.VARCHAR);
		cstmt.registerOutParameter(31, Types.VARCHAR);
		cstmt.registerOutParameter(32, Types.VARCHAR);
		cstmt.registerOutParameter(33, Types.VARCHAR);
		cstmt.registerOutParameter(34, Types.VARCHAR);
		cstmt.registerOutParameter(35, Types.VARCHAR);
		cstmt.registerOutParameter(36, Types.VARCHAR);
		cstmt.registerOutParameter(37, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_2311_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("select_dt = [" + getSelect_dt() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("notaxrate_data_yn = [" + getNotaxrate_data_yn() + "]");
		System.out.println("chro_clsf = [" + getChro_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("indt_clsf = [" + getIndt_clsf() + "]");
		System.out.println("indt_clsf2 = [" + getIndt_clsf2() + "]");
		System.out.println("std_clsf = [" + getStd_clsf() + "]");
		System.out.println("nwsp_type_clsf = [" + getNwsp_type_clsf() + "]");
		System.out.println("advt_cont = [" + getAdvt_cont() + "]");
		System.out.println("grp_cmpy_cd = [" + getGrp_cmpy_cd() + "]");
		System.out.println("sale_stmt_issu_yn = [" + getSale_stmt_issu_yn() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("fradvt_fee = [" + getFradvt_fee() + "]");
		System.out.println("toadvt_fee = [" + getToadvt_fee() + "]");
		System.out.println("frvat = [" + getFrvat() + "]");
		System.out.println("tovat = [" + getTovat() + "]");
		System.out.println("frtot_rcpm_amt = [" + getFrtot_rcpm_amt() + "]");
		System.out.println("totot_rcpm_amt = [" + getTotot_rcpm_amt() + "]");
		System.out.println("frtot_misu_amt = [" + getFrtot_misu_amt() + "]");
		System.out.println("totot_misu_amt = [" + getTotot_misu_amt() + "]");
		System.out.println("elec_tax_stmt_yn = [" + getElec_tax_stmt_yn() + "]");
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
String select_dt = req.getParameter("select_dt");
if( select_dt == null){
	System.out.println(this.toString+" : select_dt is null" );
}else{
	System.out.println(this.toString+" : select_dt is "+select_dt );
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
String notaxrate_data_yn = req.getParameter("notaxrate_data_yn");
if( notaxrate_data_yn == null){
	System.out.println(this.toString+" : notaxrate_data_yn is null" );
}else{
	System.out.println(this.toString+" : notaxrate_data_yn is "+notaxrate_data_yn );
}
String chro_clsf = req.getParameter("chro_clsf");
if( chro_clsf == null){
	System.out.println(this.toString+" : chro_clsf is null" );
}else{
	System.out.println(this.toString+" : chro_clsf is "+chro_clsf );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String indt_clsf = req.getParameter("indt_clsf");
if( indt_clsf == null){
	System.out.println(this.toString+" : indt_clsf is null" );
}else{
	System.out.println(this.toString+" : indt_clsf is "+indt_clsf );
}
String indt_clsf2 = req.getParameter("indt_clsf2");
if( indt_clsf2 == null){
	System.out.println(this.toString+" : indt_clsf2 is null" );
}else{
	System.out.println(this.toString+" : indt_clsf2 is "+indt_clsf2 );
}
String std_clsf = req.getParameter("std_clsf");
if( std_clsf == null){
	System.out.println(this.toString+" : std_clsf is null" );
}else{
	System.out.println(this.toString+" : std_clsf is "+std_clsf );
}
String nwsp_type_clsf = req.getParameter("nwsp_type_clsf");
if( nwsp_type_clsf == null){
	System.out.println(this.toString+" : nwsp_type_clsf is null" );
}else{
	System.out.println(this.toString+" : nwsp_type_clsf is "+nwsp_type_clsf );
}
String advt_cont = req.getParameter("advt_cont");
if( advt_cont == null){
	System.out.println(this.toString+" : advt_cont is null" );
}else{
	System.out.println(this.toString+" : advt_cont is "+advt_cont );
}
String grp_cmpy_cd = req.getParameter("grp_cmpy_cd");
if( grp_cmpy_cd == null){
	System.out.println(this.toString+" : grp_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : grp_cmpy_cd is "+grp_cmpy_cd );
}
String sale_stmt_issu_yn = req.getParameter("sale_stmt_issu_yn");
if( sale_stmt_issu_yn == null){
	System.out.println(this.toString+" : sale_stmt_issu_yn is null" );
}else{
	System.out.println(this.toString+" : sale_stmt_issu_yn is "+sale_stmt_issu_yn );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String fradvt_fee = req.getParameter("fradvt_fee");
if( fradvt_fee == null){
	System.out.println(this.toString+" : fradvt_fee is null" );
}else{
	System.out.println(this.toString+" : fradvt_fee is "+fradvt_fee );
}
String toadvt_fee = req.getParameter("toadvt_fee");
if( toadvt_fee == null){
	System.out.println(this.toString+" : toadvt_fee is null" );
}else{
	System.out.println(this.toString+" : toadvt_fee is "+toadvt_fee );
}
String frvat = req.getParameter("frvat");
if( frvat == null){
	System.out.println(this.toString+" : frvat is null" );
}else{
	System.out.println(this.toString+" : frvat is "+frvat );
}
String tovat = req.getParameter("tovat");
if( tovat == null){
	System.out.println(this.toString+" : tovat is null" );
}else{
	System.out.println(this.toString+" : tovat is "+tovat );
}
String frtot_rcpm_amt = req.getParameter("frtot_rcpm_amt");
if( frtot_rcpm_amt == null){
	System.out.println(this.toString+" : frtot_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : frtot_rcpm_amt is "+frtot_rcpm_amt );
}
String totot_rcpm_amt = req.getParameter("totot_rcpm_amt");
if( totot_rcpm_amt == null){
	System.out.println(this.toString+" : totot_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : totot_rcpm_amt is "+totot_rcpm_amt );
}
String frtot_misu_amt = req.getParameter("frtot_misu_amt");
if( frtot_misu_amt == null){
	System.out.println(this.toString+" : frtot_misu_amt is null" );
}else{
	System.out.println(this.toString+" : frtot_misu_amt is "+frtot_misu_amt );
}
String totot_misu_amt = req.getParameter("totot_misu_amt");
if( totot_misu_amt == null){
	System.out.println(this.toString+" : totot_misu_amt is null" );
}else{
	System.out.println(this.toString+" : totot_misu_amt is "+totot_misu_amt );
}
String elec_tax_stmt_yn = req.getParameter("elec_tax_stmt_yn");
if( elec_tax_stmt_yn == null){
	System.out.println(this.toString+" : elec_tax_stmt_yn is null" );
}else{
	System.out.println(this.toString+" : elec_tax_stmt_yn is "+elec_tax_stmt_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String select_dt = Util.checkString(req.getParameter("select_dt"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String notaxrate_data_yn = Util.checkString(req.getParameter("notaxrate_data_yn"));
String chro_clsf = Util.checkString(req.getParameter("chro_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String indt_clsf = Util.checkString(req.getParameter("indt_clsf"));
String indt_clsf2 = Util.checkString(req.getParameter("indt_clsf2"));
String std_clsf = Util.checkString(req.getParameter("std_clsf"));
String nwsp_type_clsf = Util.checkString(req.getParameter("nwsp_type_clsf"));
String advt_cont = Util.checkString(req.getParameter("advt_cont"));
String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));
String sale_stmt_issu_yn = Util.checkString(req.getParameter("sale_stmt_issu_yn"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String fradvt_fee = Util.checkString(req.getParameter("fradvt_fee"));
String toadvt_fee = Util.checkString(req.getParameter("toadvt_fee"));
String frvat = Util.checkString(req.getParameter("frvat"));
String tovat = Util.checkString(req.getParameter("tovat"));
String frtot_rcpm_amt = Util.checkString(req.getParameter("frtot_rcpm_amt"));
String totot_rcpm_amt = Util.checkString(req.getParameter("totot_rcpm_amt"));
String frtot_misu_amt = Util.checkString(req.getParameter("frtot_misu_amt"));
String totot_misu_amt = Util.checkString(req.getParameter("totot_misu_amt"));
String elec_tax_stmt_yn = Util.checkString(req.getParameter("elec_tax_stmt_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String select_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("select_dt")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String notaxrate_data_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("notaxrate_data_yn")));
String chro_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chro_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String indt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_clsf")));
String indt_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_clsf2")));
String std_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("std_clsf")));
String nwsp_type_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("nwsp_type_clsf")));
String advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont")));
String grp_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grp_cmpy_cd")));
String sale_stmt_issu_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_stmt_issu_yn")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String fradvt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("fradvt_fee")));
String toadvt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("toadvt_fee")));
String frvat = Util.Uni2Ksc(Util.checkString(req.getParameter("frvat")));
String tovat = Util.Uni2Ksc(Util.checkString(req.getParameter("tovat")));
String frtot_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("frtot_rcpm_amt")));
String totot_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("totot_rcpm_amt")));
String frtot_misu_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("frtot_misu_amt")));
String totot_misu_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("totot_misu_amt")));
String elec_tax_stmt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_tax_stmt_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSelect_dt(select_dt);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setNotaxrate_data_yn(notaxrate_data_yn);
dm.setChro_clsf(chro_clsf);
dm.setMedi_cd(medi_cd);
dm.setIndt_clsf(indt_clsf);
dm.setIndt_clsf2(indt_clsf2);
dm.setStd_clsf(std_clsf);
dm.setNwsp_type_clsf(nwsp_type_clsf);
dm.setAdvt_cont(advt_cont);
dm.setGrp_cmpy_cd(grp_cmpy_cd);
dm.setSale_stmt_issu_yn(sale_stmt_issu_yn);
dm.setDlco_nm(dlco_nm);
dm.setFradvt_fee(fradvt_fee);
dm.setToadvt_fee(toadvt_fee);
dm.setFrvat(frvat);
dm.setTovat(tovat);
dm.setFrtot_rcpm_amt(frtot_rcpm_amt);
dm.setTotot_rcpm_amt(totot_rcpm_amt);
dm.setFrtot_misu_amt(frtot_misu_amt);
dm.setTotot_misu_amt(totot_misu_amt);
dm.setElec_tax_stmt_yn(elec_tax_stmt_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 01 14:12:59 KST 2014 */