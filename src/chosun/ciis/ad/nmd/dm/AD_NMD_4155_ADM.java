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


public class AD_NMD_4155_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String rcpm_plac_clsf;
	public String setoff_yn;
	public String setoff_advt_fee;
	public String setoff_advt_vat;
	public String pubc_slip_no;
	public String pubc_dt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_NMD_4155_ADM(){}
	public AD_NMD_4155_ADM(String flag, String cmpy_cd, String occr_dt, String slip_clsf, String seq, String rcpm_plac_clsf, String setoff_yn, String setoff_advt_fee, String setoff_advt_vat, String pubc_slip_no, String pubc_dt, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.slip_clsf = slip_clsf;
		this.seq = seq;
		this.rcpm_plac_clsf = rcpm_plac_clsf;
		this.setoff_yn = setoff_yn;
		this.setoff_advt_fee = setoff_advt_fee;
		this.setoff_advt_vat = setoff_advt_vat;
		this.pubc_slip_no = pubc_slip_no;
		this.pubc_dt = pubc_dt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRcpm_plac_clsf(String rcpm_plac_clsf){
		this.rcpm_plac_clsf = rcpm_plac_clsf;
	}

	public void setSetoff_yn(String setoff_yn){
		this.setoff_yn = setoff_yn;
	}

	public void setSetoff_advt_fee(String setoff_advt_fee){
		this.setoff_advt_fee = setoff_advt_fee;
	}

	public void setSetoff_advt_vat(String setoff_advt_vat){
		this.setoff_advt_vat = setoff_advt_vat;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
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

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRcpm_plac_clsf(){
		return this.rcpm_plac_clsf;
	}

	public String getSetoff_yn(){
		return this.setoff_yn;
	}

	public String getSetoff_advt_fee(){
		return this.setoff_advt_fee;
	}

	public String getSetoff_advt_vat(){
		return this.setoff_advt_vat;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_NMD_4155_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_NMD_4155_ADM dm = (AD_NMD_4155_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.slip_clsf);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.rcpm_plac_clsf);
		cstmt.setString(9, dm.setoff_yn);
		cstmt.setString(10, dm.setoff_advt_fee);
		cstmt.setString(11, dm.setoff_advt_vat);
		cstmt.setString(12, dm.pubc_slip_no);
		cstmt.setString(13, dm.pubc_dt);
		cstmt.setString(14, dm.incmg_pers_ip);
		cstmt.setString(15, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.nmd.ds.AD_NMD_4155_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("slip_clsf = [" + getSlip_clsf() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("rcpm_plac_clsf = [" + getRcpm_plac_clsf() + "]");
		System.out.println("setoff_yn = [" + getSetoff_yn() + "]");
		System.out.println("setoff_advt_fee = [" + getSetoff_advt_fee() + "]");
		System.out.println("setoff_advt_vat = [" + getSetoff_advt_vat() + "]");
		System.out.println("pubc_slip_no = [" + getPubc_slip_no() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String slip_clsf = req.getParameter("slip_clsf");
if( slip_clsf == null){
	System.out.println(this.toString+" : slip_clsf is null" );
}else{
	System.out.println(this.toString+" : slip_clsf is "+slip_clsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String rcpm_plac_clsf = req.getParameter("rcpm_plac_clsf");
if( rcpm_plac_clsf == null){
	System.out.println(this.toString+" : rcpm_plac_clsf is null" );
}else{
	System.out.println(this.toString+" : rcpm_plac_clsf is "+rcpm_plac_clsf );
}
String setoff_yn = req.getParameter("setoff_yn");
if( setoff_yn == null){
	System.out.println(this.toString+" : setoff_yn is null" );
}else{
	System.out.println(this.toString+" : setoff_yn is "+setoff_yn );
}
String setoff_advt_fee = req.getParameter("setoff_advt_fee");
if( setoff_advt_fee == null){
	System.out.println(this.toString+" : setoff_advt_fee is null" );
}else{
	System.out.println(this.toString+" : setoff_advt_fee is "+setoff_advt_fee );
}
String setoff_advt_vat = req.getParameter("setoff_advt_vat");
if( setoff_advt_vat == null){
	System.out.println(this.toString+" : setoff_advt_vat is null" );
}else{
	System.out.println(this.toString+" : setoff_advt_vat is "+setoff_advt_vat );
}
String pubc_slip_no = req.getParameter("pubc_slip_no");
if( pubc_slip_no == null){
	System.out.println(this.toString+" : pubc_slip_no is null" );
}else{
	System.out.println(this.toString+" : pubc_slip_no is "+pubc_slip_no );
}
String pubc_dt = req.getParameter("pubc_dt");
if( pubc_dt == null){
	System.out.println(this.toString+" : pubc_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_dt is "+pubc_dt );
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
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String rcpm_plac_clsf = Util.checkString(req.getParameter("rcpm_plac_clsf"));
String setoff_yn = Util.checkString(req.getParameter("setoff_yn"));
String setoff_advt_fee = Util.checkString(req.getParameter("setoff_advt_fee"));
String setoff_advt_vat = Util.checkString(req.getParameter("setoff_advt_vat"));
String pubc_slip_no = Util.checkString(req.getParameter("pubc_slip_no"));
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String rcpm_plac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_plac_clsf")));
String setoff_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_yn")));
String setoff_advt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_advt_fee")));
String setoff_advt_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_advt_vat")));
String pubc_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_slip_no")));
String pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSlip_clsf(slip_clsf);
dm.setSeq(seq);
dm.setRcpm_plac_clsf(rcpm_plac_clsf);
dm.setSetoff_yn(setoff_yn);
dm.setSetoff_advt_fee(setoff_advt_fee);
dm.setSetoff_advt_vat(setoff_advt_vat);
dm.setPubc_slip_no(pubc_slip_no);
dm.setPubc_dt(pubc_dt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 07 16:53:42 KST 2014 */