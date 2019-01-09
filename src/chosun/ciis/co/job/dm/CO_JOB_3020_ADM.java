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


public class CO_JOB_3020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String flag;
	public String sys_clsf;
	public String seq;
	public String titl;
	public String cont;
	public String eis_fix;
	public String incmg_pers_ip;
	public String incmg_pers;

	public CO_JOB_3020_ADM(){}
	public CO_JOB_3020_ADM(String cmpy_cd, String flag, String sys_clsf, String seq, String titl, String cont, String eis_fix, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.flag = flag;
		this.sys_clsf = sys_clsf;
		this.seq = seq;
		this.titl = titl;
		this.cont = cont;
		this.eis_fix = eis_fix;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setSys_clsf(String sys_clsf){
		this.sys_clsf = sys_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setEis_fix(String eis_fix){
		this.eis_fix = eis_fix;
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

	public String getFlag(){
		return this.flag;
	}

	public String getSys_clsf(){
		return this.sys_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont(){
		return this.cont;
	}

	public String getEis_fix(){
		return this.eis_fix;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_JOB_3020_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_JOB_3020_ADM dm = (CO_JOB_3020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.flag);
		cstmt.setString(5, dm.sys_clsf);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.titl);
		cstmt.setString(8, dm.cont);
		cstmt.setString(9, dm.eis_fix);
		cstmt.setString(10, dm.incmg_pers_ip);
		cstmt.setString(11, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.job.ds.CO_JOB_3020_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("sys_clsf = [" + getSys_clsf() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("titl = [" + getTitl() + "]");
		System.out.println("cont = [" + getCont() + "]");
		System.out.println("eis_fix = [" + getEis_fix() + "]");
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
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String sys_clsf = req.getParameter("sys_clsf");
if( sys_clsf == null){
	System.out.println(this.toString+" : sys_clsf is null" );
}else{
	System.out.println(this.toString+" : sys_clsf is "+sys_clsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
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
String eis_fix = req.getParameter("eis_fix");
if( eis_fix == null){
	System.out.println(this.toString+" : eis_fix is null" );
}else{
	System.out.println(this.toString+" : eis_fix is "+eis_fix );
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
String flag = Util.checkString(req.getParameter("flag"));
String sys_clsf = Util.checkString(req.getParameter("sys_clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String titl = Util.checkString(req.getParameter("titl"));
String cont = Util.checkString(req.getParameter("cont"));
String eis_fix = Util.checkString(req.getParameter("eis_fix"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String sys_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sys_clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
String eis_fix = Util.Uni2Ksc(Util.checkString(req.getParameter("eis_fix")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFlag(flag);
dm.setSys_clsf(sys_clsf);
dm.setSeq(seq);
dm.setTitl(titl);
dm.setCont(cont);
dm.setEis_fix(eis_fix);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 11 09:07:13 KST 2009 */