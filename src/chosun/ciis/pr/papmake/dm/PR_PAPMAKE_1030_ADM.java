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


package chosun.ciis.pr.papmake.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.sendmg.ds.*;
import chosun.ciis.pr.sendmg.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_1030_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String duty_dt;
	public String fac_clsf;
	public String ref_clsf;
	public String seq;
	public String ref_matt;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public PR_PAPMAKE_1030_ADM(){}
	public PR_PAPMAKE_1030_ADM(String gubun, String cmpy_cd, String duty_dt, String fac_clsf, String ref_clsf, String seq, String ref_matt, String incmg_pers_ipaddr, String incmg_pers){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.duty_dt = duty_dt;
		this.fac_clsf = fac_clsf;
		this.ref_clsf = ref_clsf;
		this.seq = seq;
		this.ref_matt = ref_matt;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setRef_clsf(String ref_clsf){
		this.ref_clsf = ref_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRef_matt(String ref_matt){
		this.ref_matt = ref_matt;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getRef_clsf(){
		return this.ref_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRef_matt(){
		return this.ref_matt;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_PR_PAPMAKE_1030_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_1030_ADM dm = (PR_PAPMAKE_1030_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.duty_dt);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.ref_clsf);
		cstmt.setString(8, dm.seq);
		cstmt.setString(9, dm.ref_matt);
		cstmt.setString(10, dm.incmg_pers_ipaddr);
		cstmt.setString(11, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_1030_ADataSet();
	}



    public void print(){
        System.out.println("gubun = " + getGubun());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("duty_dt = " + getDuty_dt());
        System.out.println("fac_clsf = " + getFac_clsf());
        System.out.println("ref_clsf = " + getRef_clsf());
        System.out.println("seq = " + getSeq());
        System.out.println("ref_matt = " + getRef_matt());
        System.out.println("incmg_pers_ipaddr = " + getIncmg_pers_ipaddr());
        System.out.println("incmg_pers = " + getIncmg_pers());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String duty_dt = req.getParameter("duty_dt");
if( duty_dt == null){
	System.out.println(this.toString+" : duty_dt is null" );
}else{
	System.out.println(this.toString+" : duty_dt is "+duty_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String ref_clsf = req.getParameter("ref_clsf");
if( ref_clsf == null){
	System.out.println(this.toString+" : ref_clsf is null" );
}else{
	System.out.println(this.toString+" : ref_clsf is "+ref_clsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String ref_matt = req.getParameter("ref_matt");
if( ref_matt == null){
	System.out.println(this.toString+" : ref_matt is null" );
}else{
	System.out.println(this.toString+" : ref_matt is "+ref_matt );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String gubun = Util.checkString(req.getParameter("gubun"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String duty_dt = Util.checkString(req.getParameter("duty_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String ref_clsf = Util.checkString(req.getParameter("ref_clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String ref_matt = Util.checkString(req.getParameter("ref_matt"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String ref_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("ref_clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String ref_matt = Util.Uni2Ksc(Util.checkString(req.getParameter("ref_matt")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setCmpy_cd(cmpy_cd);
dm.setDuty_dt(duty_dt);
dm.setFac_clsf(fac_clsf);
dm.setRef_clsf(ref_clsf);
dm.setSeq(seq);
dm.setRef_matt(ref_matt);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 23:26:01 KST 2009 */