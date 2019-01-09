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


package chosun.ciis.hd.insr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.insr.ds.*;
import chosun.ciis.hd.insr.rec.*;

/**
 * 
 */


public class HD_INSR_1712_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String tms;
	public String insr_cmpy;
	public String insr_entr_dt;
	public String insr_mtry_dt;
	public String pymt_insr_fee;
	public String entr_nops;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String flag;

	public HD_INSR_1712_ADM(){}
	public HD_INSR_1712_ADM(String cmpy_cd, String occr_dt, String seq, String tms, String insr_cmpy, String insr_entr_dt, String insr_mtry_dt, String pymt_insr_fee, String entr_nops, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String flag){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.tms = tms;
		this.insr_cmpy = insr_cmpy;
		this.insr_entr_dt = insr_entr_dt;
		this.insr_mtry_dt = insr_mtry_dt;
		this.pymt_insr_fee = pymt_insr_fee;
		this.entr_nops = entr_nops;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setInsr_cmpy(String insr_cmpy){
		this.insr_cmpy = insr_cmpy;
	}

	public void setInsr_entr_dt(String insr_entr_dt){
		this.insr_entr_dt = insr_entr_dt;
	}

	public void setInsr_mtry_dt(String insr_mtry_dt){
		this.insr_mtry_dt = insr_mtry_dt;
	}

	public void setPymt_insr_fee(String pymt_insr_fee){
		this.pymt_insr_fee = pymt_insr_fee;
	}

	public void setEntr_nops(String entr_nops){
		this.entr_nops = entr_nops;
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

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getTms(){
		return this.tms;
	}

	public String getInsr_cmpy(){
		return this.insr_cmpy;
	}

	public String getInsr_entr_dt(){
		return this.insr_entr_dt;
	}

	public String getInsr_mtry_dt(){
		return this.insr_mtry_dt;
	}

	public String getPymt_insr_fee(){
		return this.pymt_insr_fee;
	}

	public String getEntr_nops(){
		return this.entr_nops;
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

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INSR_1712_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INSR_1712_ADM dm = (HD_INSR_1712_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.tms);
		cstmt.setString(8, dm.insr_cmpy);
		cstmt.setString(9, dm.insr_entr_dt);
		cstmt.setString(10, dm.insr_mtry_dt);
		cstmt.setString(11, dm.pymt_insr_fee);
		cstmt.setString(12, dm.entr_nops);
		cstmt.setString(13, dm.incmg_pers_ipadd);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.setString(15, dm.chg_pers);
		cstmt.setString(16, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_INSR_1712_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("tms = [" + getTms() + "]");
		System.out.println("insr_cmpy = [" + getInsr_cmpy() + "]");
		System.out.println("insr_entr_dt = [" + getInsr_entr_dt() + "]");
		System.out.println("insr_mtry_dt = [" + getInsr_mtry_dt() + "]");
		System.out.println("pymt_insr_fee = [" + getPymt_insr_fee() + "]");
		System.out.println("entr_nops = [" + getEntr_nops() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("flag = [" + getFlag() + "]");
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
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
String insr_cmpy = req.getParameter("insr_cmpy");
if( insr_cmpy == null){
	System.out.println(this.toString+" : insr_cmpy is null" );
}else{
	System.out.println(this.toString+" : insr_cmpy is "+insr_cmpy );
}
String insr_entr_dt = req.getParameter("insr_entr_dt");
if( insr_entr_dt == null){
	System.out.println(this.toString+" : insr_entr_dt is null" );
}else{
	System.out.println(this.toString+" : insr_entr_dt is "+insr_entr_dt );
}
String insr_mtry_dt = req.getParameter("insr_mtry_dt");
if( insr_mtry_dt == null){
	System.out.println(this.toString+" : insr_mtry_dt is null" );
}else{
	System.out.println(this.toString+" : insr_mtry_dt is "+insr_mtry_dt );
}
String pymt_insr_fee = req.getParameter("pymt_insr_fee");
if( pymt_insr_fee == null){
	System.out.println(this.toString+" : pymt_insr_fee is null" );
}else{
	System.out.println(this.toString+" : pymt_insr_fee is "+pymt_insr_fee );
}
String entr_nops = req.getParameter("entr_nops");
if( entr_nops == null){
	System.out.println(this.toString+" : entr_nops is null" );
}else{
	System.out.println(this.toString+" : entr_nops is "+entr_nops );
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
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String tms = Util.checkString(req.getParameter("tms"));
String insr_cmpy = Util.checkString(req.getParameter("insr_cmpy"));
String insr_entr_dt = Util.checkString(req.getParameter("insr_entr_dt"));
String insr_mtry_dt = Util.checkString(req.getParameter("insr_mtry_dt"));
String pymt_insr_fee = Util.checkString(req.getParameter("pymt_insr_fee"));
String entr_nops = Util.checkString(req.getParameter("entr_nops"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String insr_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_cmpy")));
String insr_entr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_entr_dt")));
String insr_mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_mtry_dt")));
String pymt_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt_insr_fee")));
String entr_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("entr_nops")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setTms(tms);
dm.setInsr_cmpy(insr_cmpy);
dm.setInsr_entr_dt(insr_entr_dt);
dm.setInsr_mtry_dt(insr_mtry_dt);
dm.setPymt_insr_fee(pymt_insr_fee);
dm.setEntr_nops(entr_nops);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 19 10:47:36 KST 2009 */