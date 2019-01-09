/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.trg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.trg.ds.*;
import chosun.ciis.se.trg.rec.*;

/**
 * 
 */


public class SE_TRG_1730_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String selldeptcd;
	public String accflag;
	public String yy;
	public String evlu_seq;
	public String evlu_nm;
	public String remk;
	public String mode_ar;
	public String evlu_clsf_ar;
	public String bgn_yymm_ar;
	public String end_yymm_ar;
	public String psdo_midl_val_ar;
	public String remk_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_TRG_1730_ADM(){}
	public SE_TRG_1730_ADM(String cmpy_cd, String selldeptcd, String accflag, String yy, String evlu_seq, String evlu_nm, String remk, String mode_ar, String evlu_clsf_ar, String bgn_yymm_ar, String end_yymm_ar, String psdo_midl_val_ar, String remk_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.selldeptcd = selldeptcd;
		this.accflag = accflag;
		this.yy = yy;
		this.evlu_seq = evlu_seq;
		this.evlu_nm = evlu_nm;
		this.remk = remk;
		this.mode_ar = mode_ar;
		this.evlu_clsf_ar = evlu_clsf_ar;
		this.bgn_yymm_ar = bgn_yymm_ar;
		this.end_yymm_ar = end_yymm_ar;
		this.psdo_midl_val_ar = psdo_midl_val_ar;
		this.remk_ar = remk_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSelldeptcd(String selldeptcd){
		this.selldeptcd = selldeptcd;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setEvlu_seq(String evlu_seq){
		this.evlu_seq = evlu_seq;
	}

	public void setEvlu_nm(String evlu_nm){
		this.evlu_nm = evlu_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setEvlu_clsf_ar(String evlu_clsf_ar){
		this.evlu_clsf_ar = evlu_clsf_ar;
	}

	public void setBgn_yymm_ar(String bgn_yymm_ar){
		this.bgn_yymm_ar = bgn_yymm_ar;
	}

	public void setEnd_yymm_ar(String end_yymm_ar){
		this.end_yymm_ar = end_yymm_ar;
	}

	public void setPsdo_midl_val_ar(String psdo_midl_val_ar){
		this.psdo_midl_val_ar = psdo_midl_val_ar;
	}

	public void setRemk_ar(String remk_ar){
		this.remk_ar = remk_ar;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSelldeptcd(){
		return this.selldeptcd;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getYy(){
		return this.yy;
	}

	public String getEvlu_seq(){
		return this.evlu_seq;
	}

	public String getEvlu_nm(){
		return this.evlu_nm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getEvlu_clsf_ar(){
		return this.evlu_clsf_ar;
	}

	public String getBgn_yymm_ar(){
		return this.bgn_yymm_ar;
	}

	public String getEnd_yymm_ar(){
		return this.end_yymm_ar;
	}

	public String getPsdo_midl_val_ar(){
		return this.psdo_midl_val_ar;
	}

	public String getRemk_ar(){
		return this.remk_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_TRG_1730_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_TRG_1730_ADM dm = (SE_TRG_1730_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.selldeptcd);
		cstmt.setString(5, dm.accflag);
		cstmt.setString(6, dm.yy);
		cstmt.setString(7, dm.evlu_seq);
		cstmt.setString(8, dm.evlu_nm);
		cstmt.setString(9, dm.remk);
		cstmt.setString(10, dm.mode_ar);
		cstmt.setString(11, dm.evlu_clsf_ar);
		cstmt.setString(12, dm.bgn_yymm_ar);
		cstmt.setString(13, dm.end_yymm_ar);
		cstmt.setString(14, dm.psdo_midl_val_ar);
		cstmt.setString(15, dm.remk_ar);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.trg.ds.SE_TRG_1730_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("selldeptcd = " + getSelldeptcd());
        System.out.println("accflag = " + getAccflag());
        System.out.println("yy = " + getYy());
        System.out.println("evlu_seq = " + getEvlu_seq());
        System.out.println("evlu_nm = " + getEvlu_nm());
        System.out.println("remk = " + getRemk());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("evlu_clsf_ar = " + getEvlu_clsf_ar());
        System.out.println("bgn_yymm_ar = " + getBgn_yymm_ar());
        System.out.println("end_yymm_ar = " + getEnd_yymm_ar());
        System.out.println("psdo_midl_val_ar = " + getPsdo_midl_val_ar());
        System.out.println("remk_ar = " + getRemk_ar());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
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
String selldeptcd = req.getParameter("selldeptcd");
if( selldeptcd == null){
	System.out.println(this.toString+" : selldeptcd is null" );
}else{
	System.out.println(this.toString+" : selldeptcd is "+selldeptcd );
}
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String yy = req.getParameter("yy");
if( yy == null){
	System.out.println(this.toString+" : yy is null" );
}else{
	System.out.println(this.toString+" : yy is "+yy );
}
String evlu_seq = req.getParameter("evlu_seq");
if( evlu_seq == null){
	System.out.println(this.toString+" : evlu_seq is null" );
}else{
	System.out.println(this.toString+" : evlu_seq is "+evlu_seq );
}
String evlu_nm = req.getParameter("evlu_nm");
if( evlu_nm == null){
	System.out.println(this.toString+" : evlu_nm is null" );
}else{
	System.out.println(this.toString+" : evlu_nm is "+evlu_nm );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String evlu_clsf_ar = req.getParameter("evlu_clsf_ar");
if( evlu_clsf_ar == null){
	System.out.println(this.toString+" : evlu_clsf_ar is null" );
}else{
	System.out.println(this.toString+" : evlu_clsf_ar is "+evlu_clsf_ar );
}
String bgn_yymm_ar = req.getParameter("bgn_yymm_ar");
if( bgn_yymm_ar == null){
	System.out.println(this.toString+" : bgn_yymm_ar is null" );
}else{
	System.out.println(this.toString+" : bgn_yymm_ar is "+bgn_yymm_ar );
}
String end_yymm_ar = req.getParameter("end_yymm_ar");
if( end_yymm_ar == null){
	System.out.println(this.toString+" : end_yymm_ar is null" );
}else{
	System.out.println(this.toString+" : end_yymm_ar is "+end_yymm_ar );
}
String psdo_midl_val_ar = req.getParameter("psdo_midl_val_ar");
if( psdo_midl_val_ar == null){
	System.out.println(this.toString+" : psdo_midl_val_ar is null" );
}else{
	System.out.println(this.toString+" : psdo_midl_val_ar is "+psdo_midl_val_ar );
}
String remk_ar = req.getParameter("remk_ar");
if( remk_ar == null){
	System.out.println(this.toString+" : remk_ar is null" );
}else{
	System.out.println(this.toString+" : remk_ar is "+remk_ar );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String selldeptcd = Util.checkString(req.getParameter("selldeptcd"));
String accflag = Util.checkString(req.getParameter("accflag"));
String yy = Util.checkString(req.getParameter("yy"));
String evlu_seq = Util.checkString(req.getParameter("evlu_seq"));
String evlu_nm = Util.checkString(req.getParameter("evlu_nm"));
String remk = Util.checkString(req.getParameter("remk"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String evlu_clsf_ar = Util.checkString(req.getParameter("evlu_clsf_ar"));
String bgn_yymm_ar = Util.checkString(req.getParameter("bgn_yymm_ar"));
String end_yymm_ar = Util.checkString(req.getParameter("end_yymm_ar"));
String psdo_midl_val_ar = Util.checkString(req.getParameter("psdo_midl_val_ar"));
String remk_ar = Util.checkString(req.getParameter("remk_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String selldeptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("selldeptcd")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String yy = Util.Uni2Ksc(Util.checkString(req.getParameter("yy")));
String evlu_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_seq")));
String evlu_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_nm")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String evlu_clsf_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_clsf_ar")));
String bgn_yymm_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_yymm_ar")));
String end_yymm_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("end_yymm_ar")));
String psdo_midl_val_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("psdo_midl_val_ar")));
String remk_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSelldeptcd(selldeptcd);
dm.setAccflag(accflag);
dm.setYy(yy);
dm.setEvlu_seq(evlu_seq);
dm.setEvlu_nm(evlu_nm);
dm.setRemk(remk);
dm.setMode_ar(mode_ar);
dm.setEvlu_clsf_ar(evlu_clsf_ar);
dm.setBgn_yymm_ar(bgn_yymm_ar);
dm.setEnd_yymm_ar(end_yymm_ar);
dm.setPsdo_midl_val_ar(psdo_midl_val_ar);
dm.setRemk_ar(remk_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 07 21:20:03 KST 2009 */