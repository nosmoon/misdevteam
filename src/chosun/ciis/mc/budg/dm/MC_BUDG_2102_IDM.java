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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_2102_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String tag;
	public String mode;
	public String jobtag;
	public String budg_yy;
	public String budg_yymm;
	public String budg_cd;
	public String dept_cd;
	public String evnt_cd;
	public String work_no;
	public String seq;
	public String medi_cd;
	public String use_dept_cd;
	public String req_qunt;
	public String req_uprc;
	public String req_amt;
	public String rmks;
	public String crte_clsf;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public MC_BUDG_2102_IDM(){}
	public MC_BUDG_2102_IDM(String cmpy_cd, String tag, String mode, String jobtag, String budg_yy, String budg_yymm, String budg_cd, String dept_cd, String evnt_cd, String work_no, String seq, String medi_cd, String use_dept_cd, String req_qunt, String req_uprc, String req_amt, String rmks, String crte_clsf, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.tag = tag;
		this.mode = mode;
		this.jobtag = jobtag;
		this.budg_yy = budg_yy;
		this.budg_yymm = budg_yymm;
		this.budg_cd = budg_cd;
		this.dept_cd = dept_cd;
		this.evnt_cd = evnt_cd;
		this.work_no = work_no;
		this.seq = seq;
		this.medi_cd = medi_cd;
		this.use_dept_cd = use_dept_cd;
		this.req_qunt = req_qunt;
		this.req_uprc = req_uprc;
		this.req_amt = req_amt;
		this.rmks = rmks;
		this.crte_clsf = crte_clsf;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTag(String tag){
		this.tag = tag;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setJobtag(String jobtag){
		this.jobtag = jobtag;
	}

	public void setBudg_yy(String budg_yy){
		this.budg_yy = budg_yy;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setWork_no(String work_no){
		this.work_no = work_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setReq_qunt(String req_qunt){
		this.req_qunt = req_qunt;
	}

	public void setReq_uprc(String req_uprc){
		this.req_uprc = req_uprc;
	}

	public void setReq_amt(String req_amt){
		this.req_amt = req_amt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setCrte_clsf(String crte_clsf){
		this.crte_clsf = crte_clsf;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTag(){
		return this.tag;
	}

	public String getMode(){
		return this.mode;
	}

	public String getJobtag(){
		return this.jobtag;
	}

	public String getBudg_yy(){
		return this.budg_yy;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getWork_no(){
		return this.work_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getReq_qunt(){
		return this.req_qunt;
	}

	public String getReq_uprc(){
		return this.req_uprc;
	}

	public String getReq_amt(){
		return this.req_amt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getCrte_clsf(){
		return this.crte_clsf;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_2102_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_2102_IDM dm = (MC_BUDG_2102_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.tag);
		cstmt.setString(5, dm.mode);
		cstmt.setString(6, dm.jobtag);
		cstmt.setString(7, dm.budg_yy);
		cstmt.setString(8, dm.budg_yymm);
		cstmt.setString(9, dm.budg_cd);
		cstmt.setString(10, dm.dept_cd);
		cstmt.setString(11, dm.evnt_cd);
		cstmt.setString(12, dm.work_no);
		cstmt.setString(13, dm.seq);
		cstmt.setString(14, dm.medi_cd);
		cstmt.setString(15, dm.use_dept_cd);
		cstmt.setString(16, dm.req_qunt);
		cstmt.setString(17, dm.req_uprc);
		cstmt.setString(18, dm.req_amt);
		cstmt.setString(19, dm.rmks);
		cstmt.setString(20, dm.crte_clsf);
		cstmt.setString(21, dm.incmg_pers);
		cstmt.setString(22, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_2102_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("tag = [" + getTag() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("jobtag = [" + getJobtag() + "]");
		System.out.println("budg_yy = [" + getBudg_yy() + "]");
		System.out.println("budg_yymm = [" + getBudg_yymm() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("work_no = [" + getWork_no() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("req_qunt = [" + getReq_qunt() + "]");
		System.out.println("req_uprc = [" + getReq_uprc() + "]");
		System.out.println("req_amt = [" + getReq_amt() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
		System.out.println("crte_clsf = [" + getCrte_clsf() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String tag = req.getParameter("tag");
if( tag == null){
	System.out.println(this.toString+" : tag is null" );
}else{
	System.out.println(this.toString+" : tag is "+tag );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String jobtag = req.getParameter("jobtag");
if( jobtag == null){
	System.out.println(this.toString+" : jobtag is null" );
}else{
	System.out.println(this.toString+" : jobtag is "+jobtag );
}
String budg_yy = req.getParameter("budg_yy");
if( budg_yy == null){
	System.out.println(this.toString+" : budg_yy is null" );
}else{
	System.out.println(this.toString+" : budg_yy is "+budg_yy );
}
String budg_yymm = req.getParameter("budg_yymm");
if( budg_yymm == null){
	System.out.println(this.toString+" : budg_yymm is null" );
}else{
	System.out.println(this.toString+" : budg_yymm is "+budg_yymm );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String work_no = req.getParameter("work_no");
if( work_no == null){
	System.out.println(this.toString+" : work_no is null" );
}else{
	System.out.println(this.toString+" : work_no is "+work_no );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String req_qunt = req.getParameter("req_qunt");
if( req_qunt == null){
	System.out.println(this.toString+" : req_qunt is null" );
}else{
	System.out.println(this.toString+" : req_qunt is "+req_qunt );
}
String req_uprc = req.getParameter("req_uprc");
if( req_uprc == null){
	System.out.println(this.toString+" : req_uprc is null" );
}else{
	System.out.println(this.toString+" : req_uprc is "+req_uprc );
}
String req_amt = req.getParameter("req_amt");
if( req_amt == null){
	System.out.println(this.toString+" : req_amt is null" );
}else{
	System.out.println(this.toString+" : req_amt is "+req_amt );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
}
String crte_clsf = req.getParameter("crte_clsf");
if( crte_clsf == null){
	System.out.println(this.toString+" : crte_clsf is null" );
}else{
	System.out.println(this.toString+" : crte_clsf is "+crte_clsf );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
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
String tag = Util.checkString(req.getParameter("tag"));
String mode = Util.checkString(req.getParameter("mode"));
String jobtag = Util.checkString(req.getParameter("jobtag"));
String budg_yy = Util.checkString(req.getParameter("budg_yy"));
String budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String work_no = Util.checkString(req.getParameter("work_no"));
String seq = Util.checkString(req.getParameter("seq"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String req_qunt = Util.checkString(req.getParameter("req_qunt"));
String req_uprc = Util.checkString(req.getParameter("req_uprc"));
String req_amt = Util.checkString(req.getParameter("req_amt"));
String rmks = Util.checkString(req.getParameter("rmks"));
String crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String tag = Util.Uni2Ksc(Util.checkString(req.getParameter("tag")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String jobtag = Util.Uni2Ksc(Util.checkString(req.getParameter("jobtag")));
String budg_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yy")));
String budg_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String work_no = Util.Uni2Ksc(Util.checkString(req.getParameter("work_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String req_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("req_qunt")));
String req_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("req_uprc")));
String req_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("req_amt")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String crte_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("crte_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTag(tag);
dm.setMode(mode);
dm.setJobtag(jobtag);
dm.setBudg_yy(budg_yy);
dm.setBudg_yymm(budg_yymm);
dm.setBudg_cd(budg_cd);
dm.setDept_cd(dept_cd);
dm.setEvnt_cd(evnt_cd);
dm.setWork_no(work_no);
dm.setSeq(seq);
dm.setMedi_cd(medi_cd);
dm.setUse_dept_cd(use_dept_cd);
dm.setReq_qunt(req_qunt);
dm.setReq_uprc(req_uprc);
dm.setReq_amt(req_amt);
dm.setRmks(rmks);
dm.setCrte_clsf(crte_clsf);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 19 10:24:40 KST 2009 */