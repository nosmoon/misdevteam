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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_2002_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String seci_clsf_cd;
	public String seci_no;
	public String seci_stat_cd;
	public String fisc_aprv_stat;
	public String seci_nm;
	public String comp_dt;
	public String mtry_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String face_val_amt;
	public String purc_amt;
	public String defr_yys;
	public String repay_yys;
	public String div_repay_tms;
	public String int_rate;
	public String issu_dt;
	public String rmks;
	public String pay_bank_cd;
	public String chg_pers;
	public String incmg_pers_ipadd;

	public FC_FUNC_2002_IDM(){}
	public FC_FUNC_2002_IDM(String cmpy_cd, String seci_clsf_cd, String seci_no, String seci_stat_cd, String fisc_aprv_stat, String seci_nm, String comp_dt, String mtry_dt, String dlco_clsf_cd, String dlco_cd, String face_val_amt, String purc_amt, String defr_yys, String repay_yys, String div_repay_tms, String int_rate, String issu_dt, String rmks, String pay_bank_cd, String chg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.seci_clsf_cd = seci_clsf_cd;
		this.seci_no = seci_no;
		this.seci_stat_cd = seci_stat_cd;
		this.fisc_aprv_stat = fisc_aprv_stat;
		this.seci_nm = seci_nm;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.face_val_amt = face_val_amt;
		this.purc_amt = purc_amt;
		this.defr_yys = defr_yys;
		this.repay_yys = repay_yys;
		this.div_repay_tms = div_repay_tms;
		this.int_rate = int_rate;
		this.issu_dt = issu_dt;
		this.rmks = rmks;
		this.pay_bank_cd = pay_bank_cd;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeci_clsf_cd(String seci_clsf_cd){
		this.seci_clsf_cd = seci_clsf_cd;
	}

	public void setSeci_no(String seci_no){
		this.seci_no = seci_no;
	}

	public void setSeci_stat_cd(String seci_stat_cd){
		this.seci_stat_cd = seci_stat_cd;
	}

	public void setFisc_aprv_stat(String fisc_aprv_stat){
		this.fisc_aprv_stat = fisc_aprv_stat;
	}

	public void setSeci_nm(String seci_nm){
		this.seci_nm = seci_nm;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setFace_val_amt(String face_val_amt){
		this.face_val_amt = face_val_amt;
	}

	public void setPurc_amt(String purc_amt){
		this.purc_amt = purc_amt;
	}

	public void setDefr_yys(String defr_yys){
		this.defr_yys = defr_yys;
	}

	public void setRepay_yys(String repay_yys){
		this.repay_yys = repay_yys;
	}

	public void setDiv_repay_tms(String div_repay_tms){
		this.div_repay_tms = div_repay_tms;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setPay_bank_cd(String pay_bank_cd){
		this.pay_bank_cd = pay_bank_cd;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSeci_clsf_cd(){
		return this.seci_clsf_cd;
	}

	public String getSeci_no(){
		return this.seci_no;
	}

	public String getSeci_stat_cd(){
		return this.seci_stat_cd;
	}

	public String getFisc_aprv_stat(){
		return this.fisc_aprv_stat;
	}

	public String getSeci_nm(){
		return this.seci_nm;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getFace_val_amt(){
		return this.face_val_amt;
	}

	public String getPurc_amt(){
		return this.purc_amt;
	}

	public String getDefr_yys(){
		return this.defr_yys;
	}

	public String getRepay_yys(){
		return this.repay_yys;
	}

	public String getDiv_repay_tms(){
		return this.div_repay_tms;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getPay_bank_cd(){
		return this.pay_bank_cd;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_2002_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_2002_IDM dm = (FC_FUNC_2002_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.seci_clsf_cd);
		cstmt.setString(5, dm.seci_no);
		cstmt.setString(6, dm.seci_stat_cd);
		cstmt.setString(7, dm.fisc_aprv_stat);
		cstmt.setString(8, dm.seci_nm);
		cstmt.setString(9, dm.comp_dt);
		cstmt.setString(10, dm.mtry_dt);
		cstmt.setString(11, dm.dlco_clsf_cd);
		cstmt.setString(12, dm.dlco_cd);
		cstmt.setString(13, dm.face_val_amt);
		cstmt.setString(14, dm.purc_amt);
		cstmt.setString(15, dm.defr_yys);
		cstmt.setString(16, dm.repay_yys);
		cstmt.setString(17, dm.div_repay_tms);
		cstmt.setString(18, dm.int_rate);
		cstmt.setString(19, dm.issu_dt);
		cstmt.setString(20, dm.rmks);
		cstmt.setString(21, dm.pay_bank_cd);
		cstmt.setString(22, dm.chg_pers);
		cstmt.setString(23, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_2002_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("seci_clsf_cd = " + getSeci_clsf_cd());
        System.out.println("seci_no = " + getSeci_no());
        System.out.println("seci_stat_cd = " + getSeci_stat_cd());
        System.out.println("fisc_aprv_stat = " + getFisc_aprv_stat());
        System.out.println("seci_nm = " + getSeci_nm());
        System.out.println("comp_dt = " + getComp_dt());
        System.out.println("mtry_dt = " + getMtry_dt());
        System.out.println("dlco_clsf_cd = " + getDlco_clsf_cd());
        System.out.println("dlco_cd = " + getDlco_cd());
        System.out.println("face_val_amt = " + getFace_val_amt());
        System.out.println("purc_amt = " + getPurc_amt());
        System.out.println("defr_yys = " + getDefr_yys());
        System.out.println("repay_yys = " + getRepay_yys());
        System.out.println("div_repay_tms = " + getDiv_repay_tms());
        System.out.println("int_rate = " + getInt_rate());
        System.out.println("issu_dt = " + getIssu_dt());
        System.out.println("rmks = " + getRmks());
        System.out.println("pay_bank_cd = " + getPay_bank_cd());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
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
String seci_clsf_cd = req.getParameter("seci_clsf_cd");
if( seci_clsf_cd == null){
	System.out.println(this.toString+" : seci_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : seci_clsf_cd is "+seci_clsf_cd );
}
String seci_no = req.getParameter("seci_no");
if( seci_no == null){
	System.out.println(this.toString+" : seci_no is null" );
}else{
	System.out.println(this.toString+" : seci_no is "+seci_no );
}
String seci_stat_cd = req.getParameter("seci_stat_cd");
if( seci_stat_cd == null){
	System.out.println(this.toString+" : seci_stat_cd is null" );
}else{
	System.out.println(this.toString+" : seci_stat_cd is "+seci_stat_cd );
}
String fisc_aprv_stat = req.getParameter("fisc_aprv_stat");
if( fisc_aprv_stat == null){
	System.out.println(this.toString+" : fisc_aprv_stat is null" );
}else{
	System.out.println(this.toString+" : fisc_aprv_stat is "+fisc_aprv_stat );
}
String seci_nm = req.getParameter("seci_nm");
if( seci_nm == null){
	System.out.println(this.toString+" : seci_nm is null" );
}else{
	System.out.println(this.toString+" : seci_nm is "+seci_nm );
}
String comp_dt = req.getParameter("comp_dt");
if( comp_dt == null){
	System.out.println(this.toString+" : comp_dt is null" );
}else{
	System.out.println(this.toString+" : comp_dt is "+comp_dt );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String face_val_amt = req.getParameter("face_val_amt");
if( face_val_amt == null){
	System.out.println(this.toString+" : face_val_amt is null" );
}else{
	System.out.println(this.toString+" : face_val_amt is "+face_val_amt );
}
String purc_amt = req.getParameter("purc_amt");
if( purc_amt == null){
	System.out.println(this.toString+" : purc_amt is null" );
}else{
	System.out.println(this.toString+" : purc_amt is "+purc_amt );
}
String defr_yys = req.getParameter("defr_yys");
if( defr_yys == null){
	System.out.println(this.toString+" : defr_yys is null" );
}else{
	System.out.println(this.toString+" : defr_yys is "+defr_yys );
}
String repay_yys = req.getParameter("repay_yys");
if( repay_yys == null){
	System.out.println(this.toString+" : repay_yys is null" );
}else{
	System.out.println(this.toString+" : repay_yys is "+repay_yys );
}
String div_repay_tms = req.getParameter("div_repay_tms");
if( div_repay_tms == null){
	System.out.println(this.toString+" : div_repay_tms is null" );
}else{
	System.out.println(this.toString+" : div_repay_tms is "+div_repay_tms );
}
String int_rate = req.getParameter("int_rate");
if( int_rate == null){
	System.out.println(this.toString+" : int_rate is null" );
}else{
	System.out.println(this.toString+" : int_rate is "+int_rate );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
}
String pay_bank_cd = req.getParameter("pay_bank_cd");
if( pay_bank_cd == null){
	System.out.println(this.toString+" : pay_bank_cd is null" );
}else{
	System.out.println(this.toString+" : pay_bank_cd is "+pay_bank_cd );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String seci_clsf_cd = Util.checkString(req.getParameter("seci_clsf_cd"));
String seci_no = Util.checkString(req.getParameter("seci_no"));
String seci_stat_cd = Util.checkString(req.getParameter("seci_stat_cd"));
String fisc_aprv_stat = Util.checkString(req.getParameter("fisc_aprv_stat"));
String seci_nm = Util.checkString(req.getParameter("seci_nm"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String face_val_amt = Util.checkString(req.getParameter("face_val_amt"));
String purc_amt = Util.checkString(req.getParameter("purc_amt"));
String defr_yys = Util.checkString(req.getParameter("defr_yys"));
String repay_yys = Util.checkString(req.getParameter("repay_yys"));
String div_repay_tms = Util.checkString(req.getParameter("div_repay_tms"));
String int_rate = Util.checkString(req.getParameter("int_rate"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String rmks = Util.checkString(req.getParameter("rmks"));
String pay_bank_cd = Util.checkString(req.getParameter("pay_bank_cd"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String seci_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("seci_clsf_cd")));
String seci_no = Util.Uni2Ksc(Util.checkString(req.getParameter("seci_no")));
String seci_stat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("seci_stat_cd")));
String fisc_aprv_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_aprv_stat")));
String seci_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("seci_nm")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String face_val_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("face_val_amt")));
String purc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_amt")));
String defr_yys = Util.Uni2Ksc(Util.checkString(req.getParameter("defr_yys")));
String repay_yys = Util.Uni2Ksc(Util.checkString(req.getParameter("repay_yys")));
String div_repay_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("div_repay_tms")));
String int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("int_rate")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String pay_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_bank_cd")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSeci_clsf_cd(seci_clsf_cd);
dm.setSeci_no(seci_no);
dm.setSeci_stat_cd(seci_stat_cd);
dm.setFisc_aprv_stat(fisc_aprv_stat);
dm.setSeci_nm(seci_nm);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setFace_val_amt(face_val_amt);
dm.setPurc_amt(purc_amt);
dm.setDefr_yys(defr_yys);
dm.setRepay_yys(repay_yys);
dm.setDiv_repay_tms(div_repay_tms);
dm.setInt_rate(int_rate);
dm.setIssu_dt(issu_dt);
dm.setRmks(rmks);
dm.setPay_bank_cd(pay_bank_cd);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 10 14:08:43 KST 2009 */