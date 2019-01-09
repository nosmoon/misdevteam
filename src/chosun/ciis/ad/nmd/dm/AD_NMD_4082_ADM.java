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


package chosun.ciis.ad.nmd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.nmd.ds.*;
import chosun.ciis.ad.nmd.rec.*;

/**
 * 
 */


public class AD_NMD_4082_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String medi_cd;
	public String make_dt;
	public String agn;
	public String agn_nm;
	public String fee;
	public String fee_vat;
	public String tot_fee;
	public String semuro_no;
	public String tax_stmt_no;
	public String tax_item;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_NMD_4082_ADM(){}
	public AD_NMD_4082_ADM(String flag, String cmpy_cd, String slip_occr_dt, String slip_seq, String medi_cd, String make_dt, String agn, String agn_nm, String fee, String fee_vat, String tot_fee, String semuro_no, String tax_stmt_no, String tax_item, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.medi_cd = medi_cd;
		this.make_dt = make_dt;
		this.agn = agn;
		this.agn_nm = agn_nm;
		this.fee = fee;
		this.fee_vat = fee_vat;
		this.tot_fee = tot_fee;
		this.semuro_no = semuro_no;
		this.tax_stmt_no = tax_stmt_no;
		this.tax_item = tax_item;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setAgn(String agn){
		this.agn = agn;
	}

	public void setAgn_nm(String agn_nm){
		this.agn_nm = agn_nm;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setFee_vat(String fee_vat){
		this.fee_vat = fee_vat;
	}

	public void setTot_fee(String tot_fee){
		this.tot_fee = tot_fee;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public void setTax_stmt_no(String tax_stmt_no){
		this.tax_stmt_no = tax_stmt_no;
	}

	public void setTax_item(String tax_item){
		this.tax_item = tax_item;
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

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getAgn(){
		return this.agn;
	}

	public String getAgn_nm(){
		return this.agn_nm;
	}

	public String getFee(){
		return this.fee;
	}

	public String getFee_vat(){
		return this.fee_vat;
	}

	public String getTot_fee(){
		return this.tot_fee;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getTax_stmt_no(){
		return this.tax_stmt_no;
	}

	public String getTax_item(){
		return this.tax_item;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_NMD_4082_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_NMD_4082_ADM dm = (AD_NMD_4082_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.slip_occr_dt);
		cstmt.setString(6, dm.slip_seq);
		cstmt.setString(7, dm.medi_cd);
		cstmt.setString(8, dm.make_dt);
		cstmt.setString(9, dm.agn);
		cstmt.setString(10, dm.agn_nm);
		cstmt.setString(11, dm.fee);
		cstmt.setString(12, dm.fee_vat);
		cstmt.setString(13, dm.tot_fee);
		cstmt.setString(14, dm.semuro_no);
		cstmt.setString(15, dm.tax_stmt_no);
		cstmt.setString(16, dm.tax_item);
		cstmt.setString(17, dm.incmg_pers_ip);
		cstmt.setString(18, dm.incmg_pers);
		cstmt.registerOutParameter(19, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.nmd.ds.AD_NMD_4082_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("agn = [" + getAgn() + "]");
		System.out.println("agn_nm = [" + getAgn_nm() + "]");
		System.out.println("fee = [" + getFee() + "]");
		System.out.println("fee_vat = [" + getFee_vat() + "]");
		System.out.println("tot_fee = [" + getTot_fee() + "]");
		System.out.println("semuro_no = [" + getSemuro_no() + "]");
		System.out.println("tax_stmt_no = [" + getTax_stmt_no() + "]");
		System.out.println("tax_item = [" + getTax_item() + "]");
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
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String agn = req.getParameter("agn");
if( agn == null){
	System.out.println(this.toString+" : agn is null" );
}else{
	System.out.println(this.toString+" : agn is "+agn );
}
String agn_nm = req.getParameter("agn_nm");
if( agn_nm == null){
	System.out.println(this.toString+" : agn_nm is null" );
}else{
	System.out.println(this.toString+" : agn_nm is "+agn_nm );
}
String fee = req.getParameter("fee");
if( fee == null){
	System.out.println(this.toString+" : fee is null" );
}else{
	System.out.println(this.toString+" : fee is "+fee );
}
String fee_vat = req.getParameter("fee_vat");
if( fee_vat == null){
	System.out.println(this.toString+" : fee_vat is null" );
}else{
	System.out.println(this.toString+" : fee_vat is "+fee_vat );
}
String tot_fee = req.getParameter("tot_fee");
if( tot_fee == null){
	System.out.println(this.toString+" : tot_fee is null" );
}else{
	System.out.println(this.toString+" : tot_fee is "+tot_fee );
}
String semuro_no = req.getParameter("semuro_no");
if( semuro_no == null){
	System.out.println(this.toString+" : semuro_no is null" );
}else{
	System.out.println(this.toString+" : semuro_no is "+semuro_no );
}
String tax_stmt_no = req.getParameter("tax_stmt_no");
if( tax_stmt_no == null){
	System.out.println(this.toString+" : tax_stmt_no is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_no is "+tax_stmt_no );
}
String tax_item = req.getParameter("tax_item");
if( tax_item == null){
	System.out.println(this.toString+" : tax_item is null" );
}else{
	System.out.println(this.toString+" : tax_item is "+tax_item );
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
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String agn = Util.checkString(req.getParameter("agn"));
String agn_nm = Util.checkString(req.getParameter("agn_nm"));
String fee = Util.checkString(req.getParameter("fee"));
String fee_vat = Util.checkString(req.getParameter("fee_vat"));
String tot_fee = Util.checkString(req.getParameter("tot_fee"));
String semuro_no = Util.checkString(req.getParameter("semuro_no"));
String tax_stmt_no = Util.checkString(req.getParameter("tax_stmt_no"));
String tax_item = Util.checkString(req.getParameter("tax_item"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String agn = Util.Uni2Ksc(Util.checkString(req.getParameter("agn")));
String agn_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("agn_nm")));
String fee = Util.Uni2Ksc(Util.checkString(req.getParameter("fee")));
String fee_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("fee_vat")));
String tot_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_fee")));
String semuro_no = Util.Uni2Ksc(Util.checkString(req.getParameter("semuro_no")));
String tax_stmt_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_no")));
String tax_item = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_item")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_seq(slip_seq);
dm.setMedi_cd(medi_cd);
dm.setMake_dt(make_dt);
dm.setAgn(agn);
dm.setAgn_nm(agn_nm);
dm.setFee(fee);
dm.setFee_vat(fee_vat);
dm.setTot_fee(tot_fee);
dm.setSemuro_no(semuro_no);
dm.setTax_stmt_no(tax_stmt_no);
dm.setTax_item(tax_item);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 20 20:22:44 KST 2015 */