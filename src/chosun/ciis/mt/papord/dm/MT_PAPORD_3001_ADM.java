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


package chosun.ciis.mt.papord.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.ds.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_3001_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String cmpy_cd;
	public String aply_dt;
	public String papcmpy_cd;
	public String fac_clsf;
	public String matr_cd;
	public String roll_wgt;
	public String roll_cnt;
	public String amss_wgt;
	public String occr_dt;
	public String seq;

	public MT_PAPORD_3001_ADM(){}
	public MT_PAPORD_3001_ADM(String mode, String incmg_pers_ipaddr, String incmg_pers, String cmpy_cd, String aply_dt, String papcmpy_cd, String fac_clsf, String matr_cd, String roll_wgt, String roll_cnt, String amss_wgt, String occr_dt, String seq){
		this.mode = mode;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.cmpy_cd = cmpy_cd;
		this.aply_dt = aply_dt;
		this.papcmpy_cd = papcmpy_cd;
		this.fac_clsf = fac_clsf;
		this.matr_cd = matr_cd;
		this.roll_wgt = roll_wgt;
		this.roll_cnt = roll_cnt;
		this.amss_wgt = amss_wgt;
		this.occr_dt = occr_dt;
		this.seq = seq;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setRoll_wgt(String roll_wgt){
		this.roll_wgt = roll_wgt;
	}

	public void setRoll_cnt(String roll_cnt){
		this.roll_cnt = roll_cnt;
	}

	public void setAmss_wgt(String amss_wgt){
		this.amss_wgt = amss_wgt;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getMode(){
		return this.mode;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getRoll_wgt(){
		return this.roll_wgt;
	}

	public String getRoll_cnt(){
		return this.roll_cnt;
	}

	public String getAmss_wgt(){
		return this.amss_wgt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPORD_3001_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPORD_3001_ADM dm = (MT_PAPORD_3001_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.incmg_pers_ipaddr);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.cmpy_cd);
		cstmt.setString(7, dm.aply_dt);
		cstmt.setString(8, dm.papcmpy_cd);
		cstmt.setString(9, dm.fac_clsf);
		cstmt.setString(10, dm.matr_cd);
		cstmt.setString(11, dm.roll_wgt);
		cstmt.setString(12, dm.roll_cnt);
		cstmt.setString(13, dm.amss_wgt);
		cstmt.setString(14, dm.occr_dt);
		cstmt.setString(15, dm.seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papord.ds.MT_PAPORD_3001_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aply_dt = [" + getAply_dt() + "]");
		System.out.println("papcmpy_cd = [" + getPapcmpy_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("roll_wgt = [" + getRoll_wgt() + "]");
		System.out.println("roll_cnt = [" + getRoll_cnt() + "]");
		System.out.println("amss_wgt = [" + getAmss_wgt() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
}
String papcmpy_cd = req.getParameter("papcmpy_cd");
if( papcmpy_cd == null){
	System.out.println(this.toString+" : papcmpy_cd is null" );
}else{
	System.out.println(this.toString+" : papcmpy_cd is "+papcmpy_cd );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String roll_wgt = req.getParameter("roll_wgt");
if( roll_wgt == null){
	System.out.println(this.toString+" : roll_wgt is null" );
}else{
	System.out.println(this.toString+" : roll_wgt is "+roll_wgt );
}
String roll_cnt = req.getParameter("roll_cnt");
if( roll_cnt == null){
	System.out.println(this.toString+" : roll_cnt is null" );
}else{
	System.out.println(this.toString+" : roll_cnt is "+roll_cnt );
}
String amss_wgt = req.getParameter("amss_wgt");
if( amss_wgt == null){
	System.out.println(this.toString+" : amss_wgt is null" );
}else{
	System.out.println(this.toString+" : amss_wgt is "+amss_wgt );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String roll_wgt = Util.checkString(req.getParameter("roll_wgt"));
String roll_cnt = Util.checkString(req.getParameter("roll_cnt"));
String amss_wgt = Util.checkString(req.getParameter("amss_wgt"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String papcmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("papcmpy_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String roll_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("roll_wgt")));
String roll_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("roll_cnt")));
String amss_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("amss_wgt")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setCmpy_cd(cmpy_cd);
dm.setAply_dt(aply_dt);
dm.setPapcmpy_cd(papcmpy_cd);
dm.setFac_clsf(fac_clsf);
dm.setMatr_cd(matr_cd);
dm.setRoll_wgt(roll_wgt);
dm.setRoll_cnt(roll_cnt);
dm.setAmss_wgt(amss_wgt);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 08 11:07:38 KST 2009 */