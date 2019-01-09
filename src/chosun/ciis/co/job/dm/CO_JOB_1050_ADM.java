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


package chosun.ciis.co.job.dm;

import java.sql.*;

import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.job.ds.*;
import chosun.ciis.co.job.rec.*;

/**
 * 
 */


public class CO_JOB_1050_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String job_clsf;
	public String cntc_seq;
	public String team_cd;
	public String team_nm;
	public String part_cd;
	public String part_nm;
	public String rmsg_pers;
	public String ptph_no;
	public String make_dt;
	public String answer_yn;
	public String sms_yn;
	public String titl;
	public String cont;
	public String add_file_nm;
	public byte[] add_file;
	public String file_delyn;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String uid;
	public String frdt;
	public String todt;

	public CO_JOB_1050_ADM(){}
	public CO_JOB_1050_ADM(String flag, String cmpy_cd, String job_clsf, String cntc_seq, String team_cd, String team_nm, String part_cd, String part_nm, String rmsg_pers, String ptph_no, String make_dt, String answer_yn, String sms_yn, String titl, String cont, String add_file_nm, byte[] add_file, String file_delyn, String incmg_pers_ip, String incmg_pers, String uid, String frdt, String todt){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.job_clsf = job_clsf;
		this.cntc_seq = cntc_seq;
		this.team_cd = team_cd;
		this.team_nm = team_nm;
		this.part_cd = part_cd;
		this.part_nm = part_nm;
		this.rmsg_pers = rmsg_pers;
		this.ptph_no = ptph_no;
		this.make_dt = make_dt;
		this.answer_yn = answer_yn;
		this.sms_yn = sms_yn;
		this.titl = titl;
		this.cont = cont;
		this.add_file_nm = add_file_nm;
		this.add_file = add_file;
		this.file_delyn = file_delyn;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.uid = uid;
		this.frdt = frdt;
		this.todt = todt;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setCntc_seq(String cntc_seq){
		this.cntc_seq = cntc_seq;
	}

	public void setTeam_cd(String team_cd){
		this.team_cd = team_cd;
	}

	public void setTeam_nm(String team_nm){
		this.team_nm = team_nm;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setRmsg_pers(String rmsg_pers){
		this.rmsg_pers = rmsg_pers;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setAnswer_yn(String answer_yn){
		this.answer_yn = answer_yn;
	}

	public void setSms_yn(String sms_yn){
		this.sms_yn = sms_yn;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setAdd_file_nm(String add_file_nm){
		this.add_file_nm = add_file_nm;
	}

	public void setAdd_file(byte[] add_file){
		this.add_file = add_file;
	}

	public void setFile_delyn(String file_delyn){
		this.file_delyn = file_delyn;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getCntc_seq(){
		return this.cntc_seq;
	}

	public String getTeam_cd(){
		return this.team_cd;
	}

	public String getTeam_nm(){
		return this.team_nm;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getRmsg_pers(){
		return this.rmsg_pers;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getAnswer_yn(){
		return this.answer_yn;
	}

	public String getSms_yn(){
		return this.sms_yn;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont(){
		return this.cont;
	}

	public String getAdd_file_nm(){
		return this.add_file_nm;
	}

	public byte[] getAdd_file(){
		return this.add_file;
	}

	public String getFile_delyn(){
		return this.file_delyn;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getUid(){
		return this.uid;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_JOB_1050_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_JOB_1050_ADM dm = (CO_JOB_1050_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.job_clsf);
		cstmt.setString(6, dm.cntc_seq);
		cstmt.setString(7, dm.team_cd);
		cstmt.setString(8, dm.team_nm);
		cstmt.setString(9, dm.part_cd);
		cstmt.setString(10, dm.part_nm);
		cstmt.setString(11, dm.rmsg_pers);
		cstmt.setString(12, dm.ptph_no);
		cstmt.setString(13, dm.make_dt);
		cstmt.setString(14, dm.answer_yn);
		cstmt.setString(15, dm.sms_yn);
		cstmt.setString(16, dm.titl);
		cstmt.setString(17, dm.cont);
		cstmt.setString(18, dm.add_file_nm);
		cstmt.setBytes(19, "1010".getBytes());
		cstmt.setString(20, dm.file_delyn);
		cstmt.setString(21, dm.incmg_pers_ip);
		cstmt.setString(22, dm.incmg_pers);
		cstmt.setString(23, dm.uid);
		cstmt.setString(24, dm.frdt);
		cstmt.setString(25, dm.todt);
		cstmt.registerOutParameter(26, Types.VARCHAR);
		cstmt.registerOutParameter(27, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.job.ds.CO_JOB_1050_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("job_clsf = [" + getJob_clsf() + "]");
		System.out.println("cntc_seq = [" + getCntc_seq() + "]");
		System.out.println("team_cd = [" + getTeam_cd() + "]");
		System.out.println("team_nm = [" + getTeam_nm() + "]");
		System.out.println("part_cd = [" + getPart_cd() + "]");
		System.out.println("part_nm = [" + getPart_nm() + "]");
		System.out.println("rmsg_pers = [" + getRmsg_pers() + "]");
		System.out.println("ptph_no = [" + getPtph_no() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("answer_yn = [" + getAnswer_yn() + "]");
		System.out.println("sms_yn = [" + getSms_yn() + "]");
		System.out.println("titl = [" + getTitl() + "]");
		System.out.println("cont = [" + getCont() + "]");
		System.out.println("add_file_nm = [" + getAdd_file_nm() + "]");
		System.out.println("add_file = [" + getAdd_file() + "]");
		System.out.println("file_delyn = [" + getFile_delyn() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("uid = [" + getUid() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
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
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
String cntc_seq = req.getParameter("cntc_seq");
if( cntc_seq == null){
	System.out.println(this.toString+" : cntc_seq is null" );
}else{
	System.out.println(this.toString+" : cntc_seq is "+cntc_seq );
}
String team_cd = req.getParameter("team_cd");
if( team_cd == null){
	System.out.println(this.toString+" : team_cd is null" );
}else{
	System.out.println(this.toString+" : team_cd is "+team_cd );
}
String team_nm = req.getParameter("team_nm");
if( team_nm == null){
	System.out.println(this.toString+" : team_nm is null" );
}else{
	System.out.println(this.toString+" : team_nm is "+team_nm );
}
String part_cd = req.getParameter("part_cd");
if( part_cd == null){
	System.out.println(this.toString+" : part_cd is null" );
}else{
	System.out.println(this.toString+" : part_cd is "+part_cd );
}
String part_nm = req.getParameter("part_nm");
if( part_nm == null){
	System.out.println(this.toString+" : part_nm is null" );
}else{
	System.out.println(this.toString+" : part_nm is "+part_nm );
}
String rmsg_pers = req.getParameter("rmsg_pers");
if( rmsg_pers == null){
	System.out.println(this.toString+" : rmsg_pers is null" );
}else{
	System.out.println(this.toString+" : rmsg_pers is "+rmsg_pers );
}
String ptph_no = req.getParameter("ptph_no");
if( ptph_no == null){
	System.out.println(this.toString+" : ptph_no is null" );
}else{
	System.out.println(this.toString+" : ptph_no is "+ptph_no );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String answer_yn = req.getParameter("answer_yn");
if( answer_yn == null){
	System.out.println(this.toString+" : answer_yn is null" );
}else{
	System.out.println(this.toString+" : answer_yn is "+answer_yn );
}
String sms_yn = req.getParameter("sms_yn");
if( sms_yn == null){
	System.out.println(this.toString+" : sms_yn is null" );
}else{
	System.out.println(this.toString+" : sms_yn is "+sms_yn );
}
String titl = req.getParameter("titl");
if( titl == null){
	System.out.println(this.toString+" : titl is null" );
}else{
	System.out.println(this.toString+" : titl is "+titl );
}
String cont = req.getParameter("cont");
if( cont == null){
	System.out.println(this.toString+" : cont is null" );
}else{
	System.out.println(this.toString+" : cont is "+cont );
}
String add_file_nm = req.getParameter("add_file_nm");
if( add_file_nm == null){
	System.out.println(this.toString+" : add_file_nm is null" );
}else{
	System.out.println(this.toString+" : add_file_nm is "+add_file_nm );
}
String add_file = req.getParameter("add_file");
if( add_file == null){
	System.out.println(this.toString+" : add_file is null" );
}else{
	System.out.println(this.toString+" : add_file is "+add_file );
}
String file_delyn = req.getParameter("file_delyn");
if( file_delyn == null){
	System.out.println(this.toString+" : file_delyn is null" );
}else{
	System.out.println(this.toString+" : file_delyn is "+file_delyn );
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
String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String cntc_seq = Util.checkString(req.getParameter("cntc_seq"));
String team_cd = Util.checkString(req.getParameter("team_cd"));
String team_nm = Util.checkString(req.getParameter("team_nm"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String part_nm = Util.checkString(req.getParameter("part_nm"));
String rmsg_pers = Util.checkString(req.getParameter("rmsg_pers"));
String ptph_no = Util.checkString(req.getParameter("ptph_no"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String answer_yn = Util.checkString(req.getParameter("answer_yn"));
String sms_yn = Util.checkString(req.getParameter("sms_yn"));
String titl = Util.checkString(req.getParameter("titl"));
String cont = Util.checkString(req.getParameter("cont"));
String add_file_nm = Util.checkString(req.getParameter("add_file_nm"));
String add_file = Util.checkString(req.getParameter("add_file"));
String file_delyn = Util.checkString(req.getParameter("file_delyn"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String uid = Util.checkString(req.getParameter("uid"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String cntc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("cntc_seq")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String team_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("team_nm")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String part_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("part_nm")));
String rmsg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsg_pers")));
String ptph_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String answer_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("answer_yn")));
String sms_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("sms_yn")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
String add_file_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_nm")));
String add_file = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file")));
String file_delyn = Util.Uni2Ksc(Util.checkString(req.getParameter("file_delyn")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setJob_clsf(job_clsf);
dm.setCntc_seq(cntc_seq);
dm.setTeam_cd(team_cd);
dm.setTeam_nm(team_nm);
dm.setPart_cd(part_cd);
dm.setPart_nm(part_nm);
dm.setRmsg_pers(rmsg_pers);
dm.setPtph_no(ptph_no);
dm.setMake_dt(make_dt);
dm.setAnswer_yn(answer_yn);
dm.setSms_yn(sms_yn);
dm.setTitl(titl);
dm.setCont(cont);
dm.setAdd_file_nm(add_file_nm);
dm.setAdd_file(add_file);
dm.setFile_delyn(file_delyn);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setUid(uid);
dm.setFrdt(frdt);
dm.setTodt(todt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 11 11:52:15 KST 2009 */