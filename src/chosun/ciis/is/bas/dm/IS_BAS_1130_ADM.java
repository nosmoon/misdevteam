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


package chosun.ciis.is.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.ds.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_1130_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String cmpy_cd;
	public String dept_cd;
	public String dept_nm;
	public String supr_dept_cd;
	public String hdpt_cd;
	public String erplace_cd;
	public String rslt_dept_cd;
	public String dept_rptv_addr;
	public String step;
	public String tel_no;
	public String fax_no;
	public String srt_seqo;
	public String use_yn;
	public String mode;
	public String chrg_pers_seq;
	public String chrg_pers;
	public String dty_cd;
	public String chrg_clsf;
	public String frdt;
	public String todt;
	public String sub_srt_seqo;
	public String incmg_pers;
	public String incmg_pers_ip;

	public IS_BAS_1130_ADM(){}
	public IS_BAS_1130_ADM(String accflag, String cmpy_cd, String dept_cd, String dept_nm, String supr_dept_cd, String hdpt_cd, String erplace_cd, String rslt_dept_cd, String dept_rptv_addr, String step, String tel_no, String fax_no, String srt_seqo, String use_yn, String mode, String chrg_pers_seq, String chrg_pers, String dty_cd, String chrg_clsf, String frdt, String todt, String sub_srt_seqo, String incmg_pers, String incmg_pers_ip){
		this.accflag = accflag;
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.supr_dept_cd = supr_dept_cd;
		this.hdpt_cd = hdpt_cd;
		this.erplace_cd = erplace_cd;
		this.rslt_dept_cd = rslt_dept_cd;
		this.dept_rptv_addr = dept_rptv_addr;
		this.step = step;
		this.tel_no = tel_no;
		this.fax_no = fax_no;
		this.srt_seqo = srt_seqo;
		this.use_yn = use_yn;
		this.mode = mode;
		this.chrg_pers_seq = chrg_pers_seq;
		this.chrg_pers = chrg_pers;
		this.dty_cd = dty_cd;
		this.chrg_clsf = chrg_clsf;
		this.frdt = frdt;
		this.todt = todt;
		this.sub_srt_seqo = sub_srt_seqo;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setHdpt_cd(String hdpt_cd){
		this.hdpt_cd = hdpt_cd;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setRslt_dept_cd(String rslt_dept_cd){
		this.rslt_dept_cd = rslt_dept_cd;
	}

	public void setDept_rptv_addr(String dept_rptv_addr){
		this.dept_rptv_addr = dept_rptv_addr;
	}

	public void setStep(String step){
		this.step = step;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setSrt_seqo(String srt_seqo){
		this.srt_seqo = srt_seqo;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setChrg_pers_seq(String chrg_pers_seq){
		this.chrg_pers_seq = chrg_pers_seq;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setChrg_clsf(String chrg_clsf){
		this.chrg_clsf = chrg_clsf;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setSub_srt_seqo(String sub_srt_seqo){
		this.sub_srt_seqo = sub_srt_seqo;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getHdpt_cd(){
		return this.hdpt_cd;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getRslt_dept_cd(){
		return this.rslt_dept_cd;
	}

	public String getDept_rptv_addr(){
		return this.dept_rptv_addr;
	}

	public String getStep(){
		return this.step;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getSrt_seqo(){
		return this.srt_seqo;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getMode(){
		return this.mode;
	}

	public String getChrg_pers_seq(){
		return this.chrg_pers_seq;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getChrg_clsf(){
		return this.chrg_clsf;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getSub_srt_seqo(){
		return this.sub_srt_seqo;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BAS_1130_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BAS_1130_ADM dm = (IS_BAS_1130_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.dept_nm);
		cstmt.setString(7, dm.supr_dept_cd);
		cstmt.setString(8, dm.hdpt_cd);
		cstmt.setString(9, dm.erplace_cd);
		cstmt.setString(10, dm.rslt_dept_cd);
		cstmt.setString(11, dm.dept_rptv_addr);
		cstmt.setString(12, dm.step);
		cstmt.setString(13, dm.tel_no);
		cstmt.setString(14, dm.fax_no);
		cstmt.setString(15, dm.srt_seqo);
		cstmt.setString(16, dm.use_yn);
		cstmt.setString(17, dm.mode);
		cstmt.setString(18, dm.chrg_pers_seq);
		cstmt.setString(19, dm.chrg_pers);
		cstmt.setString(20, dm.dty_cd);
		cstmt.setString(21, dm.chrg_clsf);
		cstmt.setString(22, dm.frdt);
		cstmt.setString(23, dm.todt);
		cstmt.setString(24, dm.sub_srt_seqo);
		cstmt.setString(25, dm.incmg_pers);
		cstmt.setString(26, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bas.ds.IS_BAS_1130_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("accflag = [" + getAccflag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("supr_dept_cd = [" + getSupr_dept_cd() + "]");
		System.out.println("hdpt_cd = [" + getHdpt_cd() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("rslt_dept_cd = [" + getRslt_dept_cd() + "]");
		System.out.println("dept_rptv_addr = [" + getDept_rptv_addr() + "]");
		System.out.println("step = [" + getStep() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("fax_no = [" + getFax_no() + "]");
		System.out.println("srt_seqo = [" + getSrt_seqo() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("chrg_pers_seq = [" + getChrg_pers_seq() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("chrg_clsf = [" + getChrg_clsf() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("sub_srt_seqo = [" + getSub_srt_seqo() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String supr_dept_cd = req.getParameter("supr_dept_cd");
if( supr_dept_cd == null){
	System.out.println(this.toString+" : supr_dept_cd is null" );
}else{
	System.out.println(this.toString+" : supr_dept_cd is "+supr_dept_cd );
}
String hdpt_cd = req.getParameter("hdpt_cd");
if( hdpt_cd == null){
	System.out.println(this.toString+" : hdpt_cd is null" );
}else{
	System.out.println(this.toString+" : hdpt_cd is "+hdpt_cd );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String rslt_dept_cd = req.getParameter("rslt_dept_cd");
if( rslt_dept_cd == null){
	System.out.println(this.toString+" : rslt_dept_cd is null" );
}else{
	System.out.println(this.toString+" : rslt_dept_cd is "+rslt_dept_cd );
}
String dept_rptv_addr = req.getParameter("dept_rptv_addr");
if( dept_rptv_addr == null){
	System.out.println(this.toString+" : dept_rptv_addr is null" );
}else{
	System.out.println(this.toString+" : dept_rptv_addr is "+dept_rptv_addr );
}
String step = req.getParameter("step");
if( step == null){
	System.out.println(this.toString+" : step is null" );
}else{
	System.out.println(this.toString+" : step is "+step );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String fax_no = req.getParameter("fax_no");
if( fax_no == null){
	System.out.println(this.toString+" : fax_no is null" );
}else{
	System.out.println(this.toString+" : fax_no is "+fax_no );
}
String srt_seqo = req.getParameter("srt_seqo");
if( srt_seqo == null){
	System.out.println(this.toString+" : srt_seqo is null" );
}else{
	System.out.println(this.toString+" : srt_seqo is "+srt_seqo );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String chrg_pers_seq = req.getParameter("chrg_pers_seq");
if( chrg_pers_seq == null){
	System.out.println(this.toString+" : chrg_pers_seq is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_seq is "+chrg_pers_seq );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String chrg_clsf = req.getParameter("chrg_clsf");
if( chrg_clsf == null){
	System.out.println(this.toString+" : chrg_clsf is null" );
}else{
	System.out.println(this.toString+" : chrg_clsf is "+chrg_clsf );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String sub_srt_seqo = req.getParameter("sub_srt_seqo");
if( sub_srt_seqo == null){
	System.out.println(this.toString+" : sub_srt_seqo is null" );
}else{
	System.out.println(this.toString+" : sub_srt_seqo is "+sub_srt_seqo );
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

String accflag = Util.checkString(req.getParameter("accflag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
String hdpt_cd = Util.checkString(req.getParameter("hdpt_cd"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String rslt_dept_cd = Util.checkString(req.getParameter("rslt_dept_cd"));
String dept_rptv_addr = Util.checkString(req.getParameter("dept_rptv_addr"));
String step = Util.checkString(req.getParameter("step"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String fax_no = Util.checkString(req.getParameter("fax_no"));
String srt_seqo = Util.checkString(req.getParameter("srt_seqo"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String mode = Util.checkString(req.getParameter("mode"));
String chrg_pers_seq = Util.checkString(req.getParameter("chrg_pers_seq"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String chrg_clsf = Util.checkString(req.getParameter("chrg_clsf"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String sub_srt_seqo = Util.checkString(req.getParameter("sub_srt_seqo"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String supr_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("supr_dept_cd")));
String hdpt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hdpt_cd")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String rslt_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("rslt_dept_cd")));
String dept_rptv_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_rptv_addr")));
String step = Util.Uni2Ksc(Util.checkString(req.getParameter("step")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String fax_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fax_no")));
String srt_seqo = Util.Uni2Ksc(Util.checkString(req.getParameter("srt_seqo")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String chrg_pers_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_seq")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String chrg_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_clsf")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String sub_srt_seqo = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_srt_seqo")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setDept_nm(dept_nm);
dm.setSupr_dept_cd(supr_dept_cd);
dm.setHdpt_cd(hdpt_cd);
dm.setErplace_cd(erplace_cd);
dm.setRslt_dept_cd(rslt_dept_cd);
dm.setDept_rptv_addr(dept_rptv_addr);
dm.setStep(step);
dm.setTel_no(tel_no);
dm.setFax_no(fax_no);
dm.setSrt_seqo(srt_seqo);
dm.setUse_yn(use_yn);
dm.setMode(mode);
dm.setChrg_pers_seq(chrg_pers_seq);
dm.setChrg_pers(chrg_pers);
dm.setDty_cd(dty_cd);
dm.setChrg_clsf(chrg_clsf);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setSub_srt_seqo(sub_srt_seqo);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 14 19:05:36 KST 2012 */