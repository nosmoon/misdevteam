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


package chosun.ciis.se.qty.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.ds.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_1920_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_dt;
	public String send_clos_grp_clsf;
	public String mode;
	public String bo_cd;
	public String send_plac_seq;
	public String add_snd_bo_cdseq;
	public String medi_cd;
	public String regchk_yn;
	public String icdc_qty;
	public String issu_qty;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SE_QTY_1920_ADM(){}
	public SE_QTY_1920_ADM(String cmpy_cd, String issu_dt, String send_clos_grp_clsf, String mode, String bo_cd, String send_plac_seq, String add_snd_bo_cdseq, String medi_cd, String regchk_yn, String icdc_qty, String issu_qty, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.issu_dt = issu_dt;
		this.send_clos_grp_clsf = send_clos_grp_clsf;
		this.mode = mode;
		this.bo_cd = bo_cd;
		this.send_plac_seq = send_plac_seq;
		this.add_snd_bo_cdseq = add_snd_bo_cdseq;
		this.medi_cd = medi_cd;
		this.regchk_yn = regchk_yn;
		this.icdc_qty = icdc_qty;
		this.issu_qty = issu_qty;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setSend_clos_grp_clsf(String send_clos_grp_clsf){
		this.send_clos_grp_clsf = send_clos_grp_clsf;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setAdd_snd_bo_cdseq(String add_snd_bo_cdseq){
		this.add_snd_bo_cdseq = add_snd_bo_cdseq;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setRegchk_yn(String regchk_yn){
		this.regchk_yn = regchk_yn;
	}

	public void setIcdc_qty(String icdc_qty){
		this.icdc_qty = icdc_qty;
	}

	public void setIssu_qty(String issu_qty){
		this.issu_qty = issu_qty;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getSend_clos_grp_clsf(){
		return this.send_clos_grp_clsf;
	}

	public String getMode(){
		return this.mode;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getAdd_snd_bo_cdseq(){
		return this.add_snd_bo_cdseq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getRegchk_yn(){
		return this.regchk_yn;
	}

	public String getIcdc_qty(){
		return this.icdc_qty;
	}

	public String getIssu_qty(){
		return this.issu_qty;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_QTY_1920_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_QTY_1920_ADM dm = (SE_QTY_1920_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_dt);
		cstmt.setString(5, dm.send_clos_grp_clsf);
		cstmt.setString(6, dm.mode);
		cstmt.setString(7, dm.bo_cd);
		cstmt.setString(8, dm.send_plac_seq);
		cstmt.setString(9, dm.add_snd_bo_cdseq);
		cstmt.setString(10, dm.medi_cd);
		cstmt.setString(11, dm.regchk_yn);
		cstmt.setString(12, dm.icdc_qty);
		cstmt.setString(13, dm.issu_qty);
		cstmt.setString(14, dm.incmg_pers_ip);
		cstmt.setString(15, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.qty.ds.SE_QTY_1920_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("issu_dt = " + getIssu_dt());
        System.out.println("send_clos_grp_clsf = " + getSend_clos_grp_clsf());
        System.out.println("mode = " + getMode());
        System.out.println("bo_cd = " + getBo_cd());
        System.out.println("send_plac_seq = " + getSend_plac_seq());
        System.out.println("add_snd_bo_cdseq = " + getAdd_snd_bo_cdseq());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("regchk_yn = " + getRegchk_yn());
        System.out.println("icdc_qty = " + getIcdc_qty());
        System.out.println("issu_qty = " + getIssu_qty());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String send_clos_grp_clsf = req.getParameter("send_clos_grp_clsf");
if( send_clos_grp_clsf == null){
	System.out.println(this.toString+" : send_clos_grp_clsf is null" );
}else{
	System.out.println(this.toString+" : send_clos_grp_clsf is "+send_clos_grp_clsf );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String send_plac_seq = req.getParameter("send_plac_seq");
if( send_plac_seq == null){
	System.out.println(this.toString+" : send_plac_seq is null" );
}else{
	System.out.println(this.toString+" : send_plac_seq is "+send_plac_seq );
}
String add_snd_bo_cdseq = req.getParameter("add_snd_bo_cdseq");
if( add_snd_bo_cdseq == null){
	System.out.println(this.toString+" : add_snd_bo_cdseq is null" );
}else{
	System.out.println(this.toString+" : add_snd_bo_cdseq is "+add_snd_bo_cdseq );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String regchk_yn = req.getParameter("regchk_yn");
if( regchk_yn == null){
	System.out.println(this.toString+" : regchk_yn is null" );
}else{
	System.out.println(this.toString+" : regchk_yn is "+regchk_yn );
}
String icdc_qty = req.getParameter("icdc_qty");
if( icdc_qty == null){
	System.out.println(this.toString+" : icdc_qty is null" );
}else{
	System.out.println(this.toString+" : icdc_qty is "+icdc_qty );
}
String issu_qty = req.getParameter("issu_qty");
if( issu_qty == null){
	System.out.println(this.toString+" : issu_qty is null" );
}else{
	System.out.println(this.toString+" : issu_qty is "+issu_qty );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));
String mode = Util.checkString(req.getParameter("mode"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String send_plac_seq = Util.checkString(req.getParameter("send_plac_seq"));
String add_snd_bo_cdseq = Util.checkString(req.getParameter("add_snd_bo_cdseq"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String regchk_yn = Util.checkString(req.getParameter("regchk_yn"));
String icdc_qty = Util.checkString(req.getParameter("icdc_qty"));
String issu_qty = Util.checkString(req.getParameter("issu_qty"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String send_clos_grp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("send_clos_grp_clsf")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String send_plac_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_seq")));
String add_snd_bo_cdseq = Util.Uni2Ksc(Util.checkString(req.getParameter("add_snd_bo_cdseq")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String regchk_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("regchk_yn")));
String icdc_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("icdc_qty")));
String issu_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_qty")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIssu_dt(issu_dt);
dm.setSend_clos_grp_clsf(send_clos_grp_clsf);
dm.setMode(mode);
dm.setBo_cd(bo_cd);
dm.setSend_plac_seq(send_plac_seq);
dm.setAdd_snd_bo_cdseq(add_snd_bo_cdseq);
dm.setMedi_cd(medi_cd);
dm.setRegchk_yn(regchk_yn);
dm.setIcdc_qty(icdc_qty);
dm.setIssu_qty(issu_qty);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 30 11:00:01 KST 2009 */