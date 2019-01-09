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


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_2202_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String owh_dt;
	public String owh_clsf;
	public String fac_clsf;
	public String inout_fac_clsf;
	public String matr_cd;
	public String dan;
	public String roll;
	public String wt;
	public String ibgo_amt;
	public String ibgo_vat;
	public String cut_err_tms;
	public String medi_cd;
	public String sect_cd;
	public String issu_dt;
	public String prt_dt;
	public String prt_wgt;
	public String per_ip_addr;
	public String per_id;
	public String issu_pcnt;
	public String clr_pcnt;
	public String tot_jgwgt;
	
	public MT_PAPINOUT_2202_ADM(){}
	public MT_PAPINOUT_2202_ADM(String cmpy_cd, String owh_dt, String owh_clsf, String fac_clsf, String inout_fac_clsf, String matr_cd, String dan, String roll, String wt, String ibgo_amt, String ibgo_vat, String cut_err_tms, String medi_cd, String sect_cd, String issu_dt, String prt_dt, String prt_wgt, String per_ip_addr, String per_id, String issu_pcnt, String clr_pcnt, String tot_jgwgt){
		this.cmpy_cd = cmpy_cd;
		this.owh_dt = owh_dt;
		this.owh_clsf = owh_clsf;
		this.fac_clsf = fac_clsf;
		this.inout_fac_clsf = inout_fac_clsf;
		this.matr_cd = matr_cd;
		this.dan = dan;
		this.roll = roll;
		this.wt = wt;
		this.ibgo_amt = ibgo_amt;
		this.ibgo_vat = ibgo_vat;
		this.cut_err_tms = cut_err_tms;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.issu_dt = issu_dt;
		this.prt_dt = prt_dt;
		this.prt_wgt = prt_wgt;
		this.per_ip_addr = per_ip_addr;
		this.per_id = per_id;
		this.issu_pcnt = issu_pcnt;
		this.clr_pcnt = clr_pcnt;
		this.tot_jgwgt = tot_jgwgt;
		
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOwh_dt(String owh_dt){
		this.owh_dt = owh_dt;
	}

	public void setOwh_clsf(String owh_clsf){
		this.owh_clsf = owh_clsf;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setInout_fac_clsf(String inout_fac_clsf){
		this.inout_fac_clsf = inout_fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setDan(String dan){
		this.dan = dan;
	}

	public void setRoll(String roll){
		this.roll = roll;
	}

	public void setWt(String wt){
		this.wt = wt;
	}

	public void setIbgo_amt(String ibgo_amt){
		this.ibgo_amt = ibgo_amt;
	}

	public void setIbgo_vat(String ibgo_vat){
		this.ibgo_vat = ibgo_vat;
	}

	public void setCut_err_tms(String cut_err_tms){
		this.cut_err_tms = cut_err_tms;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setPrt_wgt(String prt_wgt){
		this.prt_wgt = prt_wgt;
	}

	public void setPer_ip_addr(String per_ip_addr){
		this.per_ip_addr = per_ip_addr;
	}

	public void setPer_id(String per_id){
		this.per_id = per_id;
	}
	
	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}
	
	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}
	
	public void setTot_jgwgt(String tot_jgwgt){
		this.tot_jgwgt = tot_jgwgt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOwh_dt(){
		return this.owh_dt;
	}

	public String getOwh_clsf(){
		return this.owh_clsf;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getInout_fac_clsf(){
		return this.inout_fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getDan(){
		return this.dan;
	}

	public String getRoll(){
		return this.roll;
	}

	public String getWt(){
		return this.wt;
	}

	public String getIbgo_amt(){
		return this.ibgo_amt;
	}

	public String getIbgo_vat(){
		return this.ibgo_vat;
	}

	public String getCut_err_tms(){
		return this.cut_err_tms;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getPrt_wgt(){
		return this.prt_wgt;
	}

	public String getPer_ip_addr(){
		return this.per_ip_addr;
	}

	public String getPer_id(){
		return this.per_id;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}
	
	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getTot_jgwgt(){
		return this.tot_jgwgt;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_2202_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?,?,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_2202_ADM dm = (MT_PAPINOUT_2202_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.owh_dt);
		cstmt.setString(5, dm.owh_clsf);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.inout_fac_clsf);
		cstmt.setString(8, dm.matr_cd);
		cstmt.setString(9, dm.dan);
		cstmt.setString(10, dm.roll);
		cstmt.setString(11, dm.wt);
		cstmt.setString(12, dm.ibgo_amt);
		cstmt.setString(13, dm.ibgo_vat);
		cstmt.setString(14, dm.cut_err_tms);
		cstmt.setString(15, dm.medi_cd);
		cstmt.setString(16, dm.sect_cd);
		cstmt.setString(17, dm.issu_dt);
		cstmt.setString(18, dm.prt_dt);
		cstmt.setString(19, dm.prt_wgt);
		cstmt.setString(20, dm.per_ip_addr);
		cstmt.setString(21, dm.per_id);
		cstmt.setString(22, dm.issu_pcnt);
		cstmt.setString(23, dm.clr_pcnt);
		cstmt.setString(24, dm.tot_jgwgt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_2202_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("owh_dt = [" + getOwh_dt() + "]");
		System.out.println("owh_clsf = [" + getOwh_clsf() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("inout_fac_clsf = [" + getInout_fac_clsf() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("dan = [" + getDan() + "]");
		System.out.println("roll = [" + getRoll() + "]");
		System.out.println("wt = [" + getWt() + "]");
		System.out.println("ibgo_amt = [" + getIbgo_amt() + "]");
		System.out.println("ibgo_vat = [" + getIbgo_vat() + "]");
		System.out.println("cut_err_tms = [" + getCut_err_tms() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("prt_dt = [" + getPrt_dt() + "]");
		System.out.println("prt_wgt = [" + getPrt_wgt() + "]");
		System.out.println("per_ip_addr = [" + getPer_ip_addr() + "]");
		System.out.println("per_id = [" + getPer_id() + "]");
		System.out.println("issu_pcnt = [" + getIssu_pcnt() + "]");
		System.out.println("clr_pcnt = [" + getClr_pcnt() + "]");
		System.out.println("tot_jgwgt = [" + getTot_jgwgt() + "]");
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
String owh_dt = req.getParameter("owh_dt");
if( owh_dt == null){
	System.out.println(this.toString+" : owh_dt is null" );
}else{
	System.out.println(this.toString+" : owh_dt is "+owh_dt );
}
String owh_clsf = req.getParameter("owh_clsf");
if( owh_clsf == null){
	System.out.println(this.toString+" : owh_clsf is null" );
}else{
	System.out.println(this.toString+" : owh_clsf is "+owh_clsf );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String inout_fac_clsf = req.getParameter("inout_fac_clsf");
if( inout_fac_clsf == null){
	System.out.println(this.toString+" : inout_fac_clsf is null" );
}else{
	System.out.println(this.toString+" : inout_fac_clsf is "+inout_fac_clsf );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String dan = req.getParameter("dan");
if( dan == null){
	System.out.println(this.toString+" : dan is null" );
}else{
	System.out.println(this.toString+" : dan is "+dan );
}
String roll = req.getParameter("roll");
if( roll == null){
	System.out.println(this.toString+" : roll is null" );
}else{
	System.out.println(this.toString+" : roll is "+roll );
}
String wt = req.getParameter("wt");
if( wt == null){
	System.out.println(this.toString+" : wt is null" );
}else{
	System.out.println(this.toString+" : wt is "+wt );
}
String ibgo_amt = req.getParameter("ibgo_amt");
if( ibgo_amt == null){
	System.out.println(this.toString+" : ibgo_amt is null" );
}else{
	System.out.println(this.toString+" : ibgo_amt is "+ibgo_amt );
}
String ibgo_vat = req.getParameter("ibgo_vat");
if( ibgo_vat == null){
	System.out.println(this.toString+" : ibgo_vat is null" );
}else{
	System.out.println(this.toString+" : ibgo_vat is "+ibgo_vat );
}
String cut_err_tms = req.getParameter("cut_err_tms");
if( cut_err_tms == null){
	System.out.println(this.toString+" : cut_err_tms is null" );
}else{
	System.out.println(this.toString+" : cut_err_tms is "+cut_err_tms );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String prt_dt = req.getParameter("prt_dt");
if( prt_dt == null){
	System.out.println(this.toString+" : prt_dt is null" );
}else{
	System.out.println(this.toString+" : prt_dt is "+prt_dt );
}
String prt_wgt = req.getParameter("prt_wgt");
if( prt_wgt == null){
	System.out.println(this.toString+" : prt_wgt is null" );
}else{
	System.out.println(this.toString+" : prt_wgt is "+prt_wgt );
}
String per_ip_addr = req.getParameter("per_ip_addr");
if( per_ip_addr == null){
	System.out.println(this.toString+" : per_ip_addr is null" );
}else{
	System.out.println(this.toString+" : per_ip_addr is "+per_ip_addr );
}
String per_id = req.getParameter("per_id");
if( per_id == null){
	System.out.println(this.toString+" : per_id is null" );
}else{
	System.out.println(this.toString+" : per_id is "+per_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String owh_dt = Util.checkString(req.getParameter("owh_dt"));
String owh_clsf = Util.checkString(req.getParameter("owh_clsf"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String inout_fac_clsf = Util.checkString(req.getParameter("inout_fac_clsf"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String dan = Util.checkString(req.getParameter("dan"));
String roll = Util.checkString(req.getParameter("roll"));
String wt = Util.checkString(req.getParameter("wt"));
String ibgo_amt = Util.checkString(req.getParameter("ibgo_amt"));
String ibgo_vat = Util.checkString(req.getParameter("ibgo_vat"));
String cut_err_tms = Util.checkString(req.getParameter("cut_err_tms"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String prt_dt = Util.checkString(req.getParameter("prt_dt"));
String prt_wgt = Util.checkString(req.getParameter("prt_wgt"));
String per_ip_addr = Util.checkString(req.getParameter("per_ip_addr"));
String per_id = Util.checkString(req.getParameter("per_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String owh_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_dt")));
String owh_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_clsf")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String inout_fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("inout_fac_clsf")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String dan = Util.Uni2Ksc(Util.checkString(req.getParameter("dan")));
String roll = Util.Uni2Ksc(Util.checkString(req.getParameter("roll")));
String wt = Util.Uni2Ksc(Util.checkString(req.getParameter("wt")));
String ibgo_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ibgo_amt")));
String ibgo_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("ibgo_vat")));
String cut_err_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("cut_err_tms")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String prt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_dt")));
String prt_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_wgt")));
String per_ip_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("per_ip_addr")));
String per_id = Util.Uni2Ksc(Util.checkString(req.getParameter("per_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOwh_dt(owh_dt);
dm.setOwh_clsf(owh_clsf);
dm.setFac_clsf(fac_clsf);
dm.setInout_fac_clsf(inout_fac_clsf);
dm.setMatr_cd(matr_cd);
dm.setDan(dan);
dm.setRoll(roll);
dm.setWt(wt);
dm.setIbgo_amt(ibgo_amt);
dm.setIbgo_vat(ibgo_vat);
dm.setCut_err_tms(cut_err_tms);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setIssu_dt(issu_dt);
dm.setPrt_dt(prt_dt);
dm.setPrt_wgt(prt_wgt);
dm.setPer_ip_addr(per_ip_addr);
dm.setPer_id(per_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Sep 06 17:47:35 KST 2009 */