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


package chosun.ciis.as.aset.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.ds.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1303_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mst_mode;
	public String cmpy_cd;
	public String occr_dt;
	public String occr_seq;
	public String chg_dt;
	public String remk;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String mode;
	public String sub_seq;
	public String aset_no;
	public String now_dept_cd;
	public String now_loca;
	public String dtls_remk;

	public AS_ASET_1303_ADM(){}
	public AS_ASET_1303_ADM(String mst_mode, String cmpy_cd, String occr_dt, String occr_seq, String chg_dt, String remk, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String mode, String sub_seq, String aset_no, String now_dept_cd, String now_loca, String dtls_remk){
		this.mst_mode = mst_mode;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.occr_seq = occr_seq;
		this.chg_dt = chg_dt;
		this.remk = remk;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.mode = mode;
		this.sub_seq = sub_seq;
		this.aset_no = aset_no;
		this.now_dept_cd = now_dept_cd;
		this.now_loca = now_loca;
		this.dtls_remk = dtls_remk;
	}

	public void setMst_mode(String mst_mode){
		this.mst_mode = mst_mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setNow_dept_cd(String now_dept_cd){
		this.now_dept_cd = now_dept_cd;
	}

	public void setNow_loca(String now_loca){
		this.now_loca = now_loca;
	}

	public void setDtls_remk(String dtls_remk){
		this.dtls_remk = dtls_remk;
	}

	public String getMst_mode(){
		return this.mst_mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getNow_dept_cd(){
		return this.now_dept_cd;
	}

	public String getNow_loca(){
		return this.now_loca;
	}

	public String getDtls_remk(){
		return this.dtls_remk;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASET_1303_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASET_1303_ADM dm = (AS_ASET_1303_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mst_mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.occr_seq);
		cstmt.setString(7, dm.chg_dt);
		cstmt.setString(8, dm.remk);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.chg_pers);
		cstmt.setString(12, dm.mode);
		cstmt.setString(13, dm.sub_seq);
		cstmt.setString(14, dm.aset_no);
		cstmt.setString(15, dm.now_dept_cd);
		cstmt.setString(16, dm.now_loca);
		cstmt.setString(17, dm.dtls_remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.aset.ds.AS_ASET_1303_ADataSet();
	}



    public void print(){
        System.out.println("mst_mode = " + getMst_mode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("occr_seq = " + getOccr_seq());
        System.out.println("chg_dt = " + getChg_dt());
        System.out.println("remk = " + getRemk());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("mode = " + getMode());
        System.out.println("sub_seq = " + getSub_seq());
        System.out.println("aset_no = " + getAset_no());
        System.out.println("now_dept_cd = " + getNow_dept_cd());
        System.out.println("now_loca = " + getNow_loca());
        System.out.println("dtls_remk = " + getDtls_remk());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mst_mode = req.getParameter("mst_mode");
if( mst_mode == null){
	System.out.println(this.toString+" : mst_mode is null" );
}else{
	System.out.println(this.toString+" : mst_mode is "+mst_mode );
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
String occr_seq = req.getParameter("occr_seq");
if( occr_seq == null){
	System.out.println(this.toString+" : occr_seq is null" );
}else{
	System.out.println(this.toString+" : occr_seq is "+occr_seq );
}
String chg_dt = req.getParameter("chg_dt");
if( chg_dt == null){
	System.out.println(this.toString+" : chg_dt is null" );
}else{
	System.out.println(this.toString+" : chg_dt is "+chg_dt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String aset_no = req.getParameter("aset_no");
if( aset_no == null){
	System.out.println(this.toString+" : aset_no is null" );
}else{
	System.out.println(this.toString+" : aset_no is "+aset_no );
}
String now_dept_cd = req.getParameter("now_dept_cd");
if( now_dept_cd == null){
	System.out.println(this.toString+" : now_dept_cd is null" );
}else{
	System.out.println(this.toString+" : now_dept_cd is "+now_dept_cd );
}
String now_loca = req.getParameter("now_loca");
if( now_loca == null){
	System.out.println(this.toString+" : now_loca is null" );
}else{
	System.out.println(this.toString+" : now_loca is "+now_loca );
}
String dtls_remk = req.getParameter("dtls_remk");
if( dtls_remk == null){
	System.out.println(this.toString+" : dtls_remk is null" );
}else{
	System.out.println(this.toString+" : dtls_remk is "+dtls_remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mst_mode = Util.checkString(req.getParameter("mst_mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String occr_seq = Util.checkString(req.getParameter("occr_seq"));
String chg_dt = Util.checkString(req.getParameter("chg_dt"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String aset_no = Util.checkString(req.getParameter("aset_no"));
String now_dept_cd = Util.checkString(req.getParameter("now_dept_cd"));
String now_loca = Util.checkString(req.getParameter("now_loca"));
String dtls_remk = Util.checkString(req.getParameter("dtls_remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mst_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mst_mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_seq")));
String chg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no")));
String now_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("now_dept_cd")));
String now_loca = Util.Uni2Ksc(Util.checkString(req.getParameter("now_loca")));
String dtls_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMst_mode(mst_mode);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setOccr_seq(occr_seq);
dm.setChg_dt(chg_dt);
dm.setRemk(remk);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setMode(mode);
dm.setSub_seq(sub_seq);
dm.setAset_no(aset_no);
dm.setNow_dept_cd(now_dept_cd);
dm.setNow_loca(now_loca);
dm.setDtls_remk(dtls_remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 17 19:21:28 KST 2009 */