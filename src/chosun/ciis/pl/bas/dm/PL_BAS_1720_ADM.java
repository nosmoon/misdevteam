/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.bas.ds.*;
import chosun.ciis.pl.bas.rec.*;

/**
 * 
 */


public class PL_BAS_1720_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acc_flag;
	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String medi_cd_old;
	public String medi_cd;
	public String dlco_clsf;
	public String aply_bgn_yymm;
	public String aply_end_yymm;
	public String sale_aply_clsf;
	public String sale_rate;
	public String purc_aply_clsf;
	public String purc_rate;
	public String cntr_amt;
	public String dcrate_basi;
	public String dcrate_basi_rate;

	public PL_BAS_1720_ADM(){}
	public PL_BAS_1720_ADM(String acc_flag, String cmpy_cd, String incmg_pers, String incmg_pers_ip, String medi_cd_old, String medi_cd, String dlco_clsf, String aply_bgn_yymm, String aply_end_yymm, String sale_aply_clsf, String sale_rate, String purc_aply_clsf, String purc_rate, String cntr_amt, String dcrate_basi, String dcrate_basi_rate){
		this.acc_flag = acc_flag;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.medi_cd_old = medi_cd_old;
		this.medi_cd = medi_cd;
		this.dlco_clsf = dlco_clsf;
		this.aply_bgn_yymm = aply_bgn_yymm;
		this.aply_end_yymm = aply_end_yymm;
		this.sale_aply_clsf = sale_aply_clsf;
		this.sale_rate = sale_rate;
		this.purc_aply_clsf = purc_aply_clsf;
		this.purc_rate = purc_rate;
		this.cntr_amt = cntr_amt;
		this.dcrate_basi = dcrate_basi;
		this.dcrate_basi_rate = dcrate_basi_rate;
	}

	public void setAcc_flag(String acc_flag){
		this.acc_flag = acc_flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setMedi_cd_old(String medi_cd_old){
		this.medi_cd_old = medi_cd_old;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setAply_bgn_yymm(String aply_bgn_yymm){
		this.aply_bgn_yymm = aply_bgn_yymm;
	}

	public void setAply_end_yymm(String aply_end_yymm){
		this.aply_end_yymm = aply_end_yymm;
	}

	public void setSale_aply_clsf(String sale_aply_clsf){
		this.sale_aply_clsf = sale_aply_clsf;
	}

	public void setSale_rate(String sale_rate){
		this.sale_rate = sale_rate;
	}

	public void setPurc_aply_clsf(String purc_aply_clsf){
		this.purc_aply_clsf = purc_aply_clsf;
	}

	public void setPurc_rate(String purc_rate){
		this.purc_rate = purc_rate;
	}

	public void setCntr_amt(String cntr_amt){
		this.cntr_amt = cntr_amt;
	}

	public void setDcrate_basi(String dcrate_basi){
		this.dcrate_basi = dcrate_basi;
	}

	public void setDcrate_basi_rate(String dcrate_basi_rate){
		this.dcrate_basi_rate = dcrate_basi_rate;
	}

	public String getAcc_flag(){
		return this.acc_flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getMedi_cd_old(){
		return this.medi_cd_old;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getAply_bgn_yymm(){
		return this.aply_bgn_yymm;
	}

	public String getAply_end_yymm(){
		return this.aply_end_yymm;
	}

	public String getSale_aply_clsf(){
		return this.sale_aply_clsf;
	}

	public String getSale_rate(){
		return this.sale_rate;
	}

	public String getPurc_aply_clsf(){
		return this.purc_aply_clsf;
	}

	public String getPurc_rate(){
		return this.purc_rate;
	}

	public String getCntr_amt(){
		return this.cntr_amt;
	}

	public String getDcrate_basi(){
		return this.dcrate_basi;
	}

	public String getDcrate_basi_rate(){
		return this.dcrate_basi_rate;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_BAS_1720_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_BAS_1720_ADM dm = (PL_BAS_1720_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acc_flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.medi_cd_old);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.dlco_clsf);
		cstmt.setString(10, dm.aply_bgn_yymm);
		cstmt.setString(11, dm.aply_end_yymm);
		cstmt.setString(12, dm.sale_aply_clsf);
		cstmt.setString(13, dm.sale_rate);
		cstmt.setString(14, dm.purc_aply_clsf);
		cstmt.setString(15, dm.purc_rate);
		cstmt.setString(16, dm.cntr_amt);
		cstmt.setString(17, dm.dcrate_basi);
		cstmt.setString(18, dm.dcrate_basi_rate);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.bas.ds.PL_BAS_1720_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("acc_flag = [" + getAcc_flag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("medi_cd_old = [" + getMedi_cd_old() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("aply_bgn_yymm = [" + getAply_bgn_yymm() + "]");
		System.out.println("aply_end_yymm = [" + getAply_end_yymm() + "]");
		System.out.println("sale_aply_clsf = [" + getSale_aply_clsf() + "]");
		System.out.println("sale_rate = [" + getSale_rate() + "]");
		System.out.println("purc_aply_clsf = [" + getPurc_aply_clsf() + "]");
		System.out.println("purc_rate = [" + getPurc_rate() + "]");
		System.out.println("cntr_amt = [" + getCntr_amt() + "]");
		System.out.println("dcrate_basi = [" + getDcrate_basi() + "]");
		System.out.println("dcrate_basi_rate = [" + getDcrate_basi_rate() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String acc_flag = req.getParameter("acc_flag");
if( acc_flag == null){
	System.out.println(this.toString+" : acc_flag is null" );
}else{
	System.out.println(this.toString+" : acc_flag is "+acc_flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String medi_cd_old = req.getParameter("medi_cd_old");
if( medi_cd_old == null){
	System.out.println(this.toString+" : medi_cd_old is null" );
}else{
	System.out.println(this.toString+" : medi_cd_old is "+medi_cd_old );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String aply_bgn_yymm = req.getParameter("aply_bgn_yymm");
if( aply_bgn_yymm == null){
	System.out.println(this.toString+" : aply_bgn_yymm is null" );
}else{
	System.out.println(this.toString+" : aply_bgn_yymm is "+aply_bgn_yymm );
}
String aply_end_yymm = req.getParameter("aply_end_yymm");
if( aply_end_yymm == null){
	System.out.println(this.toString+" : aply_end_yymm is null" );
}else{
	System.out.println(this.toString+" : aply_end_yymm is "+aply_end_yymm );
}
String sale_aply_clsf = req.getParameter("sale_aply_clsf");
if( sale_aply_clsf == null){
	System.out.println(this.toString+" : sale_aply_clsf is null" );
}else{
	System.out.println(this.toString+" : sale_aply_clsf is "+sale_aply_clsf );
}
String sale_rate = req.getParameter("sale_rate");
if( sale_rate == null){
	System.out.println(this.toString+" : sale_rate is null" );
}else{
	System.out.println(this.toString+" : sale_rate is "+sale_rate );
}
String purc_aply_clsf = req.getParameter("purc_aply_clsf");
if( purc_aply_clsf == null){
	System.out.println(this.toString+" : purc_aply_clsf is null" );
}else{
	System.out.println(this.toString+" : purc_aply_clsf is "+purc_aply_clsf );
}
String purc_rate = req.getParameter("purc_rate");
if( purc_rate == null){
	System.out.println(this.toString+" : purc_rate is null" );
}else{
	System.out.println(this.toString+" : purc_rate is "+purc_rate );
}
String cntr_amt = req.getParameter("cntr_amt");
if( cntr_amt == null){
	System.out.println(this.toString+" : cntr_amt is null" );
}else{
	System.out.println(this.toString+" : cntr_amt is "+cntr_amt );
}
String dcrate_basi = req.getParameter("dcrate_basi");
if( dcrate_basi == null){
	System.out.println(this.toString+" : dcrate_basi is null" );
}else{
	System.out.println(this.toString+" : dcrate_basi is "+dcrate_basi );
}
String dcrate_basi_rate = req.getParameter("dcrate_basi_rate");
if( dcrate_basi_rate == null){
	System.out.println(this.toString+" : dcrate_basi_rate is null" );
}else{
	System.out.println(this.toString+" : dcrate_basi_rate is "+dcrate_basi_rate );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.checkString(req.getParameter("acc_flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String medi_cd_old = Util.checkString(req.getParameter("medi_cd_old"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String aply_bgn_yymm = Util.checkString(req.getParameter("aply_bgn_yymm"));
String aply_end_yymm = Util.checkString(req.getParameter("aply_end_yymm"));
String sale_aply_clsf = Util.checkString(req.getParameter("sale_aply_clsf"));
String sale_rate = Util.checkString(req.getParameter("sale_rate"));
String purc_aply_clsf = Util.checkString(req.getParameter("purc_aply_clsf"));
String purc_rate = Util.checkString(req.getParameter("purc_rate"));
String cntr_amt = Util.checkString(req.getParameter("cntr_amt"));
String dcrate_basi = Util.checkString(req.getParameter("dcrate_basi"));
String dcrate_basi_rate = Util.checkString(req.getParameter("dcrate_basi_rate"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String medi_cd_old = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd_old")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String aply_bgn_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_bgn_yymm")));
String aply_end_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_end_yymm")));
String sale_aply_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_aply_clsf")));
String sale_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_rate")));
String purc_aply_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_aply_clsf")));
String purc_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_rate")));
String cntr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_amt")));
String dcrate_basi = Util.Uni2Ksc(Util.checkString(req.getParameter("dcrate_basi")));
String dcrate_basi_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("dcrate_basi_rate")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAcc_flag(acc_flag);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setMedi_cd_old(medi_cd_old);
dm.setMedi_cd(medi_cd);
dm.setDlco_clsf(dlco_clsf);
dm.setAply_bgn_yymm(aply_bgn_yymm);
dm.setAply_end_yymm(aply_end_yymm);
dm.setSale_aply_clsf(sale_aply_clsf);
dm.setSale_rate(sale_rate);
dm.setPurc_aply_clsf(purc_aply_clsf);
dm.setPurc_rate(purc_rate);
dm.setCntr_amt(cntr_amt);
dm.setDcrate_basi(dcrate_basi);
dm.setDcrate_basi_rate(dcrate_basi_rate);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 17 17:26:41 KST 2009 */