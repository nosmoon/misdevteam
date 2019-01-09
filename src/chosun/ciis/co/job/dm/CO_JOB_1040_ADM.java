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

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class CO_JOB_1040_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String job_clsf;
	public String cntc_seq;
	public String answer_cont;
	public String add_file_nm;
	public byte[] add_file;
	public String file_delyn;
	public String incmg_pers_ip;
	public String incmg_pers;

	public CO_JOB_1040_ADM(){}
	public CO_JOB_1040_ADM(String cmpy_cd, String job_clsf, String cntc_seq, String answer_cont, String add_file_nm, byte[] add_file, String file_delyn, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.job_clsf = job_clsf;
		this.cntc_seq = cntc_seq;
		this.answer_cont = answer_cont;
		this.add_file_nm = add_file_nm;
		this.add_file = add_file;
		this.file_delyn = file_delyn;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
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

	public void setAnswer_cont(String answer_cont){
		this.answer_cont = answer_cont;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getCntc_seq(){
		return this.cntc_seq;
	}

	public String getAnswer_cont(){
		return this.answer_cont;
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

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_JOB_1040_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_JOB_1040_ADM dm = (CO_JOB_1040_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.job_clsf);
		cstmt.setString(5, dm.cntc_seq);
		cstmt.setString(6, dm.answer_cont);
		cstmt.setString(7, dm.add_file_nm);
		cstmt.setBytes(8, "0101".getBytes());
		cstmt.setString(9, dm.file_delyn);
		cstmt.setString(10, dm.incmg_pers_ip);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.registerOutParameter(12, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.job.ds.CO_JOB_1040_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("job_clsf = [" + getJob_clsf() + "]");
		System.out.println("cntc_seq = [" + getCntc_seq() + "]");
		System.out.println("answer_cont = [" + getAnswer_cont() + "]");
		System.out.println("add_file_nm = [" + getAdd_file_nm() + "]");
		System.out.println("add_file = [" + getAdd_file() + "]");
		System.out.println("file_delyn = [" + getFile_delyn() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String answer_cont = req.getParameter("answer_cont");
if( answer_cont == null){
	System.out.println(this.toString+" : answer_cont is null" );
}else{
	System.out.println(this.toString+" : answer_cont is "+answer_cont );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String cntc_seq = Util.checkString(req.getParameter("cntc_seq"));
String answer_cont = Util.checkString(req.getParameter("answer_cont"));
String add_file_nm = Util.checkString(req.getParameter("add_file_nm"));
String add_file = Util.checkString(req.getParameter("add_file"));
String file_delyn = Util.checkString(req.getParameter("file_delyn"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String cntc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("cntc_seq")));
String answer_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("answer_cont")));
String add_file_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_nm")));
String add_file = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file")));
String file_delyn = Util.Uni2Ksc(Util.checkString(req.getParameter("file_delyn")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setJob_clsf(job_clsf);
dm.setCntc_seq(cntc_seq);
dm.setAnswer_cont(answer_cont);
dm.setAdd_file_nm(add_file_nm);
dm.setAdd_file(add_file);
dm.setFile_delyn(file_delyn);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 06 17:41:41 KST 2009 */