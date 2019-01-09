/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.mach.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.mach.ds.*;
import chosun.ciis.as.mach.rec.*;

/**
 * 
 */


public class AS_MACH_1040_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mach_seq;
	public String as_seq;
	public String mach_as_dt;
	public String as_comp;
	public String as_fee;
	public String as_cont;
	public String remk;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String job_clsf;

	public AS_MACH_1040_ADM(){}
	public AS_MACH_1040_ADM(String cmpy_cd, String mach_seq, String as_seq, String mach_as_dt, String as_comp, String as_fee, String as_cont, String remk, String incmg_pers_ipadd, String incmg_pers, String job_clsf){
		this.cmpy_cd = cmpy_cd;
		this.mach_seq = mach_seq;
		this.as_seq = as_seq;
		this.mach_as_dt = mach_as_dt;
		this.as_comp = as_comp;
		this.as_fee = as_fee;
		this.as_cont = as_cont;
		this.remk = remk;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.job_clsf = job_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMach_seq(String mach_seq){
		this.mach_seq = mach_seq;
	}

	public void setAs_seq(String as_seq){
		this.as_seq = as_seq;
	}

	public void setMach_as_dt(String mach_as_dt){
		this.mach_as_dt = mach_as_dt;
	}

	public void setAs_comp(String as_comp){
		this.as_comp = as_comp;
	}

	public void setAs_fee(String as_fee){
		this.as_fee = as_fee;
	}

	public void setAs_cont(String as_cont){
		this.as_cont = as_cont;
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

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMach_seq(){
		return this.mach_seq;
	}

	public String getAs_seq(){
		return this.as_seq;
	}

	public String getMach_as_dt(){
		return this.mach_as_dt;
	}

	public String getAs_comp(){
		return this.as_comp;
	}

	public String getAs_fee(){
		return this.as_fee;
	}

	public String getAs_cont(){
		return this.as_cont;
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

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_MACH_1040_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_MACH_1040_ADM dm = (AS_MACH_1040_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mach_seq);
		cstmt.setString(5, dm.as_seq);
		cstmt.setString(6, dm.mach_as_dt);
		cstmt.setString(7, dm.as_comp);
		cstmt.setString(8, dm.as_fee);
		cstmt.setString(9, dm.as_cont);
		cstmt.setString(10, dm.remk);
		cstmt.setString(11, dm.incmg_pers_ipadd);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.job_clsf);
		cstmt.registerOutParameter(14, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.mach.ds.AS_MACH_1040_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mach_seq = [" + getMach_seq() + "]");
		System.out.println("as_seq = [" + getAs_seq() + "]");
		System.out.println("mach_as_dt = [" + getMach_as_dt() + "]");
		System.out.println("as_comp = [" + getAs_comp() + "]");
		System.out.println("as_fee = [" + getAs_fee() + "]");
		System.out.println("as_cont = [" + getAs_cont() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("job_clsf = [" + getJob_clsf() + "]");
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
String mach_seq = req.getParameter("mach_seq");
if( mach_seq == null){
	System.out.println(this.toString+" : mach_seq is null" );
}else{
	System.out.println(this.toString+" : mach_seq is "+mach_seq );
}
String as_seq = req.getParameter("as_seq");
if( as_seq == null){
	System.out.println(this.toString+" : as_seq is null" );
}else{
	System.out.println(this.toString+" : as_seq is "+as_seq );
}
String mach_as_dt = req.getParameter("mach_as_dt");
if( mach_as_dt == null){
	System.out.println(this.toString+" : mach_as_dt is null" );
}else{
	System.out.println(this.toString+" : mach_as_dt is "+mach_as_dt );
}
String as_comp = req.getParameter("as_comp");
if( as_comp == null){
	System.out.println(this.toString+" : as_comp is null" );
}else{
	System.out.println(this.toString+" : as_comp is "+as_comp );
}
String as_fee = req.getParameter("as_fee");
if( as_fee == null){
	System.out.println(this.toString+" : as_fee is null" );
}else{
	System.out.println(this.toString+" : as_fee is "+as_fee );
}
String as_cont = req.getParameter("as_cont");
if( as_cont == null){
	System.out.println(this.toString+" : as_cont is null" );
}else{
	System.out.println(this.toString+" : as_cont is "+as_cont );
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
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mach_seq = Util.checkString(req.getParameter("mach_seq"));
String as_seq = Util.checkString(req.getParameter("as_seq"));
String mach_as_dt = Util.checkString(req.getParameter("mach_as_dt"));
String as_comp = Util.checkString(req.getParameter("as_comp"));
String as_fee = Util.checkString(req.getParameter("as_fee"));
String as_cont = Util.checkString(req.getParameter("as_cont"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mach_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("mach_seq")));
String as_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("as_seq")));
String mach_as_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mach_as_dt")));
String as_comp = Util.Uni2Ksc(Util.checkString(req.getParameter("as_comp")));
String as_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("as_fee")));
String as_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("as_cont")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMach_seq(mach_seq);
dm.setAs_seq(as_seq);
dm.setMach_as_dt(mach_as_dt);
dm.setAs_comp(as_comp);
dm.setAs_fee(as_fee);
dm.setAs_cont(as_cont);
dm.setRemk(remk);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setJob_clsf(job_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 12 15:20:29 KST 2015 */